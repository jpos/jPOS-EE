/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2019 jPOS Software SRL
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

import org.jpos.iso.ISOUtil;

import java.io.*;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * General purpose binary log
 * <pre>
 *
 * Format:
 *   256 bytes Header
 *   ... Data
 *   ... Data
 *
 * Header format (256 bytes):
 *   4 bytes header length
 *   2 bytes version
 *   2 bytes Status (@see Status enum for possible values)
 *   8 bytes Last element position
 *   4 bytes this log number
 *   4 bytes next log number
 * 232 bytes reserved
 *
 * Element:
 *   4 bytes Data length
 *   ...     Data
 * </pre>
 */
@SuppressWarnings("unused")

/**
 * Abstract base clase used by BinLogReader and BinLogWriter
 */
public abstract class BinLog implements AutoCloseable {
    private static final int FILE_MAGIC = 0xFC;
    private static final int VERSION = 0x0001;
    private static final int RESERVED_LEN = 232;
    private static final int MAX_CREATE_ATTEMPTS = 100;
    protected static final int STATUS_OFFSET = Integer.BYTES + Short.BYTES;
    private static final int TAIL_OFFSET = STATUS_OFFSET + Short.BYTES;
    private static final int THIS_LOG_INDEX_OFFSET = TAIL_OFFSET + Long.BYTES;
    protected static final int NEXT_LOG_INDEX_OFFSET = THIS_LOG_INDEX_OFFSET + Integer.BYTES;
    protected static final int INITIAL_INDEX = 1;
    private static final long CREATE_DELAY = 100L;
    protected static final long FIRST_EVENT_OFFSET = TAIL_OFFSET + RESERVED_LEN + Long.BYTES;
    private static SecureRandom numberGenerator = new SecureRandom();
    private static Pattern filePattern = Pattern.compile("^[\\d]{8}.dat$");
    private String mode;
    private static Map<String,Object> mutexs = Collections.synchronizedMap(new HashMap<>());
    protected File dir;
    protected int fileNumber;
    protected RandomAccessFile raf;
    protected final Object mutex;

    /**
     * Creates a new FileBinLog instance
     *
     * @param dir BinLog directory (created if not present)
     * @param create create directory if not exists
     * @throws IOException on error
     */
    protected BinLog(File dir, boolean create) throws IOException {
        mutexs.putIfAbsent(dir.getAbsolutePath(), new Object());
        mutex = mutexs.get(dir.getAbsolutePath());
        if ((dir.exists() && !dir.isDirectory())|| (!dir.exists() && !create))
            throw new IOException ("Invalid directory '" + dir.toString() + "'");
        else
            dir.mkdirs();
        this.dir = dir;
        mode = create ? "rw" : "r";
    }

    /**
     * Opens a binlog file, or creates it if necessary
     * @param dir binlog directory
     * @param fileNumber binlog file number
     * @return a RandomAccessFile
     * @throws IOException on error
     */
    protected RandomAccessFile openOrCreateFile(File dir, int fileNumber) throws IOException {
        File file = new File (dir, toFileName(fileNumber));
        for (int i=0; !file.exists() && i<MAX_CREATE_ATTEMPTS; i++) {
            File tempFile = new File(file.getPath() + "-" + Integer.toString(numberGenerator.nextInt(), 16) + ".tmp");
            try (RandomAccessFile r = new RandomAccessFile(tempFile, "rwd")) {
                writeHeader (r, fileNumber);
            }
            if (tempFile.renameTo(file)) {
                break;
            } else {
                tempFile.delete();
            }
            ISOUtil.sleep (ThreadLocalRandom.current().nextLong(1L, CREATE_DELAY));
        }
        return open (dir, fileNumber, mode);
    }


    /**
     * Checks if this file has been closed and skip to next file.
     *
     * @param findLast if true, skip to the last file in the binlog
     * @return true if the current file was changed
     * @throws IOException on error
     */
    protected boolean checkCutover (boolean findLast) throws IOException {
        boolean changed = false;
        while (readStatus() == Status.CLOSED) {
            raf.seek(NEXT_LOG_INDEX_OFFSET);
            int next = raf.readInt();
            if (next <= fileNumber)
                throw new IOException ("Circular reference in BinLog index " + fileNumber + "/" + next);
            synchronized (mutex) {
                raf.close();
                raf = open(dir, next, mode);
                fileNumber = next;
                changed = true;
                if (!findLast)
                    break;
            }
        }
        return changed;
    }

    /**
     * open file in default's mode
     *
     * @param dir binlog directory
     * @param fileNumber binlog file number
     * @return RandomAccessFile opened in the default mode
     * @throws IOException on error
     */
    protected RandomAccessFile open (File dir, int fileNumber) throws IOException {
        return open (dir, fileNumber, mode);
    }

    /**
     * open file in default's mode
     *
     * @param dir binlog directory
     * @param fileNumber binlog file number
     * @param mode @see
     * @return RandomAccessFile opened in the specified mode
     * @throws IOException on error
     */
    private RandomAccessFile open (File dir, int fileNumber, String mode) throws IOException {
        File file = new File (dir, toFileName(fileNumber));
        RandomAccessFile raf = null;
        if (!file.canRead()) {
            switch (mode) {
                case "r":
                    throw new EOFException(file + " not available");
                case "rw":
                    raf = new RandomAccessFile(file, mode);
                    writeHeader(raf, fileNumber);
                    break;
            }
        }
        if (raf == null)
            raf = new RandomAccessFile(file, mode);
        verifyHeader(file, raf);
        return raf;
    }

    private String toFileName (int i) {
        return String.format ("%08d.dat", i);
    }

    @Override
    public void close() throws IOException {
        raf.close();
    }

    /**
     * @return current file number
     */
    public int getFileNumber() {
        return fileNumber;
    }

    /**
     * @return true if this binlog file has been logically closed
     * @throws IOException on error
     */
    public boolean isClosed() throws IOException {
        raf.seek(STATUS_OFFSET);
        return Status.valueOf(raf.readShort()) == Status.CLOSED;
    }

    protected long readTailOffset(RandomAccessFile raf) throws IOException {
        synchronized(mutex) {
            raf.seek(TAIL_OFFSET);
            return raf.readLong();
        }
    }

    protected Status readStatus() throws IOException {
        raf.seek(STATUS_OFFSET);
        return Status.valueOf(raf.readShort());

    }
    protected void writeTailOffset(long pos) throws IOException {
        synchronized(mutex) {
            long currentTailOffset = readTailOffset(raf);
            if (currentTailOffset > pos)
                throw new IOException ("Invalid tailoffset " + fileNumber + "/" + pos + "/" + currentTailOffset);
            raf.seek(TAIL_OFFSET);
            raf.writeLong(pos);
        }
    }

    protected int getFileNumber(String s) {
        return s != null ? Integer.parseInt(s.substring(0,8)) : 0;
    }

    protected String getLastClosed (File dir) throws IOException {
        for (String s : getFilesReversed(dir)) {
            if (isClosed(new File(dir, s)))
                return s;
        }
        return null;
    }

    protected String getFirst (File dir) {
        return Arrays.stream(dir.list())
                .filter(filePattern.asPredicate())
                .sorted(String::compareTo)
                .findFirst()
                .orElse(null);
    }

    private void verifyHeader(File file, RandomAccessFile raf) throws IOException {
        synchronized(mutex) {
            if (raf.length() < TAIL_OFFSET + Long.BYTES)
                throw new IOException ("Invalid jPOS BinLog file " + fileNumber + " (" + file.toString() + ": " + raf.length() + "/" +  TAIL_OFFSET + Long.BYTES + ")");
            raf.seek(0);
            int magic = raf.readInt();
            if (!(FILE_MAGIC == magic))
                throw new IOException ("Invalid jPOS BinLog version " + fileNumber);
            long pos = readTailOffset(raf);
            if (pos < TAIL_OFFSET + Long.BYTES)
                throw new IOException ("Invalid jPOS BinLog header " + fileNumber + "/" + file.toString());
            long rafLength = raf.length();
            if (pos > rafLength)
                throw new IOException ("Truncated jPOS BinLog file " + fileNumber + " (" + pos + "/" + rafLength + ")");
        }
    }

    private void lock (long timeout) throws IOException, InterruptedException {
        long end = System.currentTimeMillis() + timeout;
        FileLock lock = raf.getChannel().lock();
        while (System.currentTimeMillis() < end) {
            Thread.sleep (10);
        }
        lock.release();
    }

    private List<String> getFiles(File dir) {
        return Arrays.stream(dir.list())
                .filter(filePattern.asPredicate())
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
    private List<String> getFilesReversed(File dir) {
        return Arrays.stream(dir.list())
                .filter(filePattern.asPredicate())
                .sorted((s1, s2) -> -s1.compareTo(s2))
                .collect(Collectors.toList());
    }

    private boolean isClosed (File f) throws IOException {
        if (f.exists()) {
            try (RandomAccessFile raf = new RandomAccessFile(f, "r")) {
                raf.seek(STATUS_OFFSET);
                return Status.valueOf(raf.readShort()) == Status.CLOSED;
            }
        }
        return false;
    }

    private void writeHeader (RandomAccessFile r, int i) throws IOException {
        r.seek(0);
        r.writeInt (FILE_MAGIC);
        r.writeShort (VERSION);
        r.writeShort (Status.OPEN.intValue());
        r.writeLong(FIRST_EVENT_OFFSET);
        r.writeInt(i); // this Log Number
        r.writeInt(0);  // next Log Number
        r.write (new byte[RESERVED_LEN]);
    }

    public enum Status {
        OPEN(0),
        CLOSED(1);

        private int val;
        private static Map<Integer,Status> map = new HashMap<>();
        static {
            for (Status s : Status.values()) {
                map.put (s.intValue(), s);
            }
        }
        Status (int val) {
            this.val = val;
        }
        public int intValue() {
            return val;
        }
        public static Status valueOf (int i) {
            return map.get(i);
        }
    }

    /**
     * Reference to a BinLog entry
     */
    public static class Ref implements Serializable {
        private static final long serialVersionUID = 4201380716050124987L;
        private int fileNumber;
        private long offset;

        @SuppressWarnings("unused")
        private Ref() { }

        /**
         * Creates a BinLog reference to the first entry in a given binlog file
         * @param fileNumber binlog file number
         */
        public Ref(int fileNumber) {
            this.fileNumber = fileNumber;
            this.offset = BinLog.FIRST_EVENT_OFFSET;
        }

        /**
         * Creates a BinLog reference to a given entry in a given binlog file
         * @param fileNumber binlog file number
         * @param offset binlog entry offset
         */

        public Ref(int fileNumber, long offset) {
            this.fileNumber = fileNumber;
            this.offset = offset;
        }

        /**
         * @return this reference's binlog file number
         */
        public int getFileNumber() {
            return fileNumber;
        }

        /**
         * @return this reference's offset
         */
        public long getOffset() {
            return offset;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ref that = (Ref) o;

            if (fileNumber != that.fileNumber) return false;
            return offset == that.offset;
        }

        @Override
        public int hashCode() {
            int result = fileNumber;
            result = 31 * result + (int) (offset ^ (offset >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return "Ref{" +
                    "fileNumber=" + fileNumber +
                    ", offset=" + offset +
                    '}';
        }
    }
    /**
     * Provides access to a binlog entry
     */
    public static class Entry implements Serializable {
        private static final long serialVersionUID = 4841830838031550274L;
        private Ref ref;
        private byte[] data;

        @SuppressWarnings("unused")
        private Entry() { }

        /**
         * @param ref reference to this entry
         * @param data entry's data
         */
        public Entry(Ref ref, byte[] data) {
            this.ref = ref;
            this.data = data;
        }

        /**
         * @return this entry's binlog reference
         */
        public Ref ref() {
            return ref;
        }

        /**
         * @return this entry's data
         */
        public byte[] get() {
            return data;
        }
    }
}
