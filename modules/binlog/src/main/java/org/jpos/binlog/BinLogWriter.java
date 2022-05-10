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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Used to append add records to a BinLog
 */
public class BinLogWriter extends BinLog {
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
    public BinLog.Ref add(byte[] record) throws IOException {
        synchronized(mutex) {
            checkCutover(true);
            AsynchronousFileChannel channel = raf;
            Future<FileLock> lockfut = channel.lock();
            FileLock lock = null;
            try {
                lock = lockfut.get();
            } catch (InterruptedException e) {
                throw new IOException (e.getMessage());
            } catch (ExecutionException e) {
                throw new IOException (e.getMessage());
            }
            if (lock.isValid()) {
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
                } catch (InterruptedException e) {
                    throw new IOException (e.getMessage());
                } catch (ExecutionException e) {
                    throw new IOException (e.getMessage());
                }
                writeTailOffset(pos + Integer.BYTES + record.length);
                channel.force(true);
                lock.release();
                return new BinLog.Ref(fileNumber, pos);
            } else {
                throw new IOException ("Failed to acquire file lock");
            }
        }
    }

    /**
     * The cutover method closes the current binlog file and creates the next one (in sequencial order)
     * @throws IOException on error
     */
    public void cutover () throws IOException {
        synchronized(mutex) {
            checkCutover(true);
            AsynchronousFileChannel channel = raf;
            Future<FileLock> lockfut = channel.lock();
            FileLock lock = null;
            try {
                lock = lockfut.get();
            } catch (InterruptedException e) {
                throw new IOException (e.getMessage());
            } catch (ExecutionException e) {
                throw new IOException (e.getMessage());
            }
            if (lock.isValid()) {
                if (readStatus() != Status.OPEN)
                    throw new IOException ("BinLog not open");
                AsynchronousFileChannel newRaf = openOrCreateFile(dir, ++fileNumber);
                ByteBuffer index = ByteBuffer.allocate(4);
                index.putInt(fileNumber);
                index.flip();
                try {
                    int write = raf.write(index, NEXT_LOG_INDEX_OFFSET).get();
                    if (write != 4) {
                        throw new IOException ("Failed to write 4 byte NEXT_LOG_INDEX_OFFSET, return: " + write);
                    }
                } catch (InterruptedException e) {
                    throw new IOException (e.getMessage());
                } catch (ExecutionException e) {
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
                } catch (InterruptedException e) {
                    throw new IOException (e.getMessage());
                } catch (ExecutionException e) {
                    throw new IOException (e.getMessage());
                }
                channel.force(false);
                raf = newRaf;
                lock.release();
            } else {
                throw new IOException ("Failed to acquire file lock");
            }
        }
    }
}
