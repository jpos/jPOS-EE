/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

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
    public BinLogWriter(File dir) throws IOException {
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
     * Adds an entry to the BinLog
     * @param record entry's binary image
     * @return reference to this entry
     * @throws IOException on error
     */
    public BinLog.Ref add(byte[] record) throws IOException {
        synchronized(mutex) {
            checkCutover(true);
            FileChannel channel = raf.getChannel();
            try (FileLock lock = channel.lock()) {
                long pos = readTailOffset(raf);
                raf.seek(pos);
                raf.writeInt(record.length);
                raf.write(record);
                channel.force(true);
                writeTailOffset(pos + Integer.BYTES + record.length);
                channel.force(false);
                return new BinLog.Ref(fileNumber, pos);
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
            FileChannel channel = raf.getChannel();
            try (FileLock lock = channel.lock()) {
                if (readStatus() != Status.OPEN)
                    throw new IOException ("BinLog not open");
                RandomAccessFile newRaf = openOrCreateFile(dir, ++fileNumber);
                raf.seek(NEXT_LOG_INDEX_OFFSET);
                raf.writeInt(fileNumber);
                channel.force(false);
                raf.seek(STATUS_OFFSET);
                raf.writeShort(Status.CLOSED.intValue());
                channel.force(false);
                raf = newRaf;
            }
        }
    }
}
