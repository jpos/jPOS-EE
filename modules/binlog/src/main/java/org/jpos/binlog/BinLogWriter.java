/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Used to append add records to a BinLog
 */
public class BinLogWriter extends BinLog {
    private ConcurrentLinkedQueue <QueueEntry> queue = new ConcurrentLinkedQueue<>();
    /**
     * Instantiates a BinLogWriter. Creates directory if necessary.
     *
     * It is the responsibility of the caller to close this writer when done with it.
     *
     * @param dir pointer to this Binlog's directory
     * @throws IOException on error
     */
    public BinLogWriter(Path dir) throws IOException {
        super (dir, true);
        int last  = getFileNumber(getLastClosed(dir));
        if (last == 0) {
            last = getFileNumber(getFirst(dir));
            if (last == 0)
                last = INITIAL_INDEX;
        }
        raf = openOrCreateFile(dir, fileNumber = last);
    }

    /**
     * Instantiates a BinLogWriter. Creates directory if necessary.
     *
     * It is the responsibility of the caller to close this writer when done with it.
     *
     * @param dir pointer to this Binlog's directory
     * @throws IOException on error
     */
    public BinLogWriter(String dir) throws IOException {
        this (Paths.get(dir));
    }

    /**
     * Adds an entry to the BinLog
     * @param record entry's binary image
     * @return reference to this entry
     * @throws IOException on error
     */
    public BinLog.Ref add(byte[] record) throws IOException, ExecutionException, InterruptedException {
        var entry = queue (record);
        try {
            flush();
            return entry.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new IOException (e);
        }
    }

    public Future<BinLog.Ref> queue (byte[] record) {
        QueueEntry entry = new QueueEntry(record);
        queue.add(entry);
        return entry.future();
    }

    public BinLog.Ref addSync (byte[] record) throws ExecutionException, InterruptedException {
        return queue (record).get();
    }

    /**
     * The cutover method closes the current binlog file and creates the next one (in sequencial order)
     * @throws IOException on error
     */
    public void cutover () throws IOException {
        try {
            mutex.lock();
            checkCutover(true);
            AsynchronousFileChannel channel = raf;
            Future<FileLock> lockfut = channel.lock();
            FileLock lock;
            try {
                lock = lockfut.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException (e.getMessage());
            }
            if (lock.isValid()) {
                if (readStatus() != Status.OPEN)
                    throw new IOException ("BinLog not open");
                AsynchronousFileChannel newRaf = openOrCreateFile(dir, ++fileNumber);
                try {
                    ByteBuffer index = ByteBuffer.allocate(4);
                    index.putInt(fileNumber);
                    index.flip();
                    try {
                        int write = raf.write(index, NEXT_LOG_INDEX_OFFSET).get();
                        if (write != 4) {
                            throw new IOException ("Failed to write 4 byte NEXT_LOG_INDEX_OFFSET, return: " + write);
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new IOException (e.getMessage());
                    }
                    ByteBuffer status = ByteBuffer.allocate(2);
                    status.putShort(Status.CLOSED.shortValue());
                    status.flip();
                    try {
                        int write = raf.write(status, STATUS_OFFSET).get();
                        if (write != 2) {
                            throw new IOException ("Failed to write 2 byte STATUS_OFFSET, return: " + write);
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new IOException (e.getMessage());
                    }
                    channel.force(false);
                    raf = newRaf;
                } finally {
                    lock.release();
                    if (newRaf == raf) {
                        channel.close();
                    } else {
                        newRaf.close();
                    }
                }
            } else {
                throw new IOException ("Failed to acquire file lock");
            }
        } finally {
            mutex.unlock();
        }
    }

    public void flush () throws IOException {
        try {
            mutex.lock();
            checkCutover(true);
            FileLock lock = raf.lock().get();
            if (lock.isValid()) {
                var flushed = flushQueue();
                raf.force(false);
                lock.release();
                flushed.forEach(QueueEntry::complete);
            } else {
                throw new IOException("Failed to acquire file lock");
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e.getMessage());
        } finally {
            mutex.unlock();
        }
    }
    private long addRecord (byte[] record) throws IOException {
        long pos = readTailOffset(raf);
        int length = 4 + record.length;
        ByteBuffer tail = ByteBuffer.allocate(length);
        tail.putInt(record.length);
        tail.put(record);
        tail.flip();
        try {
            int write = raf.write(tail, pos).get();
            if (write != length) {
                throw new IOException ("Failed to write " + length + " byte record, return: " + write);
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException (e.getMessage());
        }
        writeTailOffset(pos + Integer.BYTES + record.length);
        return pos;
    }
    private List<QueueEntry> flushQueue () throws IOException {
        List<QueueEntry> list = new ArrayList<>();
        QueueEntry entry;
        while ((entry = queue.poll()) != null) {
            entry.ref(new Ref(fileNumber, addRecord(entry.record())));
            list.add(entry);
        }
        return list;
    }
}
