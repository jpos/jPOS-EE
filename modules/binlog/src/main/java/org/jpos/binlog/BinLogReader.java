/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Used to iterate over a binlog
 */
public class BinLogReader extends BinLog implements Iterator<BinLog.Entry> {
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
    public BinLogReader (File dir) throws IOException {
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
    public BinLogReader (File dir, BinLog.Ref ref) throws IOException {
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
        this (new File(dir));
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
        this (new File(dir), ref);
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
     *
     * @param timeout in millis
     * @return true if this binlog has a next entry
     */
    public boolean hasNext(long timeout) {
        long end = System.currentTimeMillis() + timeout;
        while (System.currentTimeMillis() < end) {
            if (hasNext()) {
                return true;
            }
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                break;
            }
        }
        return false;
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
                size = raf.getChannel().size();
            } catch (IOException ignored) {
            }
            throw new NoSuchElementException(
              String.format("Invalid jPOS BinLog content @%d:%d (%d/%d)", fileNumber, pos, actualTailOffset, size)
            );
        }
        return new BinLog.Entry(new BinLog.Ref(fileNumber, pos), ev);
    }

    private byte[] read (long pos) throws IOException {
        int len = 0;
        try {
            raf.seek(pos);
            len = raf.readInt();
            byte[] buf = new byte[len];
            raf.read(buf);
            return buf;
        } catch (IOException e) {
            throw new IOException ("Error reading position " + pos + " length " + len, e);
        }
    }
}
