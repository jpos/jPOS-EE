/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.binlog;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Used to iterate over a binlog
 */
public class BinLogReader extends BinLog implements Iterator<BinLog.Entry> {
    private static final int PEEK_BUFFER_SIZE = 4096;
    private long iteratorPos;
    private boolean follow = true;
    private long cachedTailOffset = 0L;

    /**
     * Instantiates a BinLogReader.
     *
     * It is the responsibility of the caller to close this reader when done with it.
     *
     * @param dir this Binlog's directory
     * @throws IOException on error
     */
    public BinLogReader (Path dir) throws IOException {
        super (dir, false);
        int first = getFileNumber(getFirst(dir));
        this.iteratorPos = FIRST_EVENT_OFFSET;
        raf = open (dir, fileNumber = (first == 0 ? INITIAL_INDEX : first));
    }

    /**
     * Instantiaates a BinLogReader at a specific reference position.
     *
     * It is the responsibility of the caller to close this reader when done with it.
     *
     * @param dir this Binlog's directory
     * @param ref reference to a given entry
     * @throws IOException on error
     */
    public BinLogReader (Path dir, BinLog.Ref ref) throws IOException {
        super (dir, false);
        this.iteratorPos = ref.getOffset();
        raf = open (dir, fileNumber = ref.getFileNumber());
    }

    /**
     * Instantiates a BinLogReader.
     *
     * It is the responsibility of the caller to close this reader when done with it.
     *
     * @param dir this Binlog's directory
     * @throws IOException on error
     */
    public BinLogReader(String dir) throws IOException {
        this (Paths.get(dir));
    }

    /**
     * Instantiaates a BinLogReader at a specific reference position.
     *
     * It is the responsibility of the caller to close this reader when done with it.
     *
     * @param dir this Binlog's directory
     * @param ref reference to a given entry
     * @throws IOException on error
     */
    public BinLogReader (String dir, BinLog.Ref ref) throws IOException {
        this (Paths.get(dir), ref);
    }

    /**
     * BinLog reader automatically follow BinLog's cutovers, unless we
     * <code>setFollow(false)</code>
     * @param follow value
     */
    public void setFollow(boolean follow) {
        this.follow = follow;
    }

    /**
     * @return true if this reader automatically follows cutovers (default)
     */
    public boolean isFollow() {
        return follow;
    }

    /**
     * @return reference to this reader's next binlog entry
     */
    public synchronized BinLog.Ref getNextRef() {
        return new BinLog.Ref (fileNumber, iteratorPos);
    }

    @Override
    public boolean hasNext() {
        try {
            if (iteratorPos >= cachedTailOffset) {
                cachedTailOffset = readTailOffset(raf);
            }
            if (iteratorPos >= cachedTailOffset && follow && checkCutover(false)) {
                iteratorPos = FIRST_EVENT_OFFSET;
                cachedTailOffset = readTailOffset(raf);
            }
            return iteratorPos < cachedTailOffset;
        } catch (IOException e) {
            throw new IllegalStateException("Invalid jPOS BinLog header", e);
        }
    }

    /**
     * Waits up to {@code timeout} milliseconds for the next entry to become available.
     * Uses a {@link java.util.concurrent.locks.Condition} signalled by the writer after
     * each flush or cutover, giving sub-millisecond latency instead of a 50 ms busy-wait.
     *
     * @param timeout maximum wait in millis
     * @return true if this binlog has a next entry before the timeout expires
     */
    public boolean hasNext(long timeout) {
        long deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(timeout);
        mutex.lock();
        try {
            while (!hasNext()) {
                long remaining = deadline - System.nanoTime();
                if (remaining <= 0) {
                    return false;
                }
                try {
                    dataAvailable.await(remaining, TimeUnit.NANOSECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            return true;
        } finally {
            mutex.unlock();
        }
    }

    @Override
    public BinLog.Entry next() {
        byte[] ev;
        long pos = iteratorPos;
        try {
            ev = read(iteratorPos);
            iteratorPos += Integer.BYTES + ev.length;
        } catch (IOException e) {
            long actualTailOffset = 0L;
            long size = 0L;
            try {
                actualTailOffset = readTailOffset(raf);
                size = raf.size();
            } catch (IOException ignored) {
            }
            throw new NoSuchElementException(
              String.format("Invalid jPOS BinLog content @%d:%d (%d/%d)", fileNumber, pos, actualTailOffset, size)
            );
        }
        return new BinLog.Entry(new BinLog.Ref(fileNumber, pos), ev);
    }

    /**
     * Reads one record from the given position using a single async read when possible.
     * <p>
     * A peek buffer of {@value PEEK_BUFFER_SIZE} bytes is read first. In the common case the
     * entire record (4-byte length header + payload) fits inside it, so only one
     * {@link java.nio.channels.AsynchronousFileChannel#read} call is needed.  When the
     * payload is larger than the peek buffer a second read fetches the remainder.
     *
     * @param pos byte offset of the record in the current file
     * @return the record payload (without the 4-byte length header)
     * @throws IOException on any I/O or format error
     */
    private byte[] read (long pos) throws IOException {
        int len = 0;
        try {
            // Single read covering length header + most payloads
            ByteBuffer peek = ByteBuffer.allocate(PEEK_BUFFER_SIZE);
            int peekRead;
            try {
                peekRead = raf.read(peek, pos).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e.getMessage());
            }
            if (peekRead < 4) {
                throw new IOException("Failed to read 4 byte data length, return: " + peekRead);
            }
            peek.flip();
            len = peek.getInt();            // consume the 4-byte header
            byte[] buf = new byte[len];

            int available = peekRead - 4;   // payload bytes already in the peek buffer
            if (available >= len) {
                // Happy path: entire record was in the peek buffer
                peek.get(buf, 0, len);
            } else {
                // Slow path: payload spans beyond the peek buffer — copy what we have,
                // then do one more read for the remainder
                peek.get(buf, 0, available);
                int remaining = len - available;
                ByteBuffer rest = ByteBuffer.allocate(remaining);
                int restRead;
                try {
                    restRead = raf.read(rest, pos + 4 + available).get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IOException(e.getMessage());
                }
                if (restRead != remaining) {
                    throw new IOException("Failed to read " + remaining + " remaining bytes of record, return: " + restRead);
                }
                rest.flip();
                rest.get(buf, available, remaining);
            }
            return buf;
        } catch (IOException e) {
            throw new IOException("Error reading position " + pos + " length " + len, e);
        }
    }
}
