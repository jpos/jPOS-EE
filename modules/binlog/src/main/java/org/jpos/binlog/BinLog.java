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

import org.jpos.iso.ISOUtil;

import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileLock;
import java.nio.file.*;
import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardOpenOption.*;

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
    private static final short VERSION = 0x0001;
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
    private static String filePattern = "^[\\d]{8}.dat$";
    private OpenOption[] mode;
    private static Map<String,Object> mutexs = Collections.synchronizedMap(new HashMap<>());
    protected Path dir;
    protected int fileNumber;
    protected AsynchronousFileChannel raf;
    protected final Object mutex;

    /**
     * Creates a new FileBinLog instance
     *
     * @param dir BinLog directory (created if not present)
     * @param create create directory if not exists
     * @throws IOException on error
     */
    protected BinLog(Path dir, boolean create) throws IOException {
        mutexs.putIfAbsent(dir.toAbsolutePath().toString(), new Object());
        mutex = mutexs.get(dir.toAbsolutePath().toString());
        if ((Files.exists(dir) && !Files.isDirectory(dir))|| (!Files.exists(dir) && !create))
            throw new IOException ("Invalid directory '" + dir.toString() + "'");
        else
            Files.createDirectories(dir);
        this.dir = dir;
        if (create) {
            mode = new OpenOption[]{READ, WRITE, CREATE};
        } else {
            mode = new OpenOption[]{READ};
        }
    }

    /**
     * Opens a binlog file, or creates it if necessary
     * @param dir binlog directory
     * @param fileNumber binlog file number
     * @return a RandomAccessFile
     * @throws IOException on error
     */
    protected AsynchronousFileChannel openOrCreateFile(Path dir, int fileNumber) throws IOException {
        Path file = dir.resolve(toFileName(fileNumber));
        for (int i=0; !Files.exists(file) && i<MAX_CREATE_ATTEMPTS; i++) {
            Path tempFile = Paths.get(file.toString() + "-" + Integer.toString(numberGenerator.nextInt(), 16) + ".tmp");
            try (AsynchronousFileChannel r = AsynchronousFileChannel.open(tempFile, READ, WRITE, CREATE, SYNC)) {
                writeHeader (r, fileNumber);
            }
            try {
                Files.move(tempFile, file, ATOMIC_MOVE);
            } catch (Exception e) {
                Files.delete(tempFile);
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
            ByteBuffer index = ByteBuffer.allocate(4);
            try {
                int read = raf.read(index, NEXT_LOG_INDEX_OFFSET).get();
                if (read != 4) {
                    throw new IOException ("Failed to read 4 byte NEXT_LOG_INDEX_OFFSET, return: " + read);
                }
            } catch (InterruptedException e) {
                throw new IOException (e.getMessage());
            } catch (ExecutionException e) {
                throw new IOException (e.getMessage());
            }
            index.flip();
            int next = index.getInt();
            if (next <= fileNumber)
                throw new IOException ("Circular reference in BinLog index " + fileNumber + "/" + next);
            raf.close();
            raf = open(dir, next, mode);
            fileNumber = next;
            changed = true;
            if (!findLast)
                break;
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
    protected AsynchronousFileChannel open (Path dir, int fileNumber) throws IOException {
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
    private AsynchronousFileChannel open (Path dir, int fileNumber, OpenOption[] mode) throws IOException {
        Path file = dir.resolve(toFileName(fileNumber));
        AsynchronousFileChannel raf = null;
        if (!Files.isReadable(file)) {
            if (Arrays.stream(mode).anyMatch(WRITE::equals)) {
                raf = AsynchronousFileChannel.open(file, mode);
                writeHeader(raf, fileNumber);
            } else {
                throw new EOFException(file + " not available");
            }
        }
        if (raf == null)
            raf = AsynchronousFileChannel.open(file, mode);
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
        ByteBuffer status = ByteBuffer.allocate(2);
        try {
            int read = raf.read(status, STATUS_OFFSET).get();
            if (read != 2) {
                throw new IOException ("Failed to read 2 byte STATUS_OFFSET, return: " + read);
            }
        } catch (InterruptedException e) {
            throw new IOException (e.getMessage());
        } catch (ExecutionException e) {
            throw new IOException (e.getMessage());
        }
        status.flip();
        return Status.valueOf(status.getShort()) == Status.CLOSED;
    }

    protected long readTailOffset(AsynchronousFileChannel raf) throws IOException {
        ByteBuffer tail = ByteBuffer.allocate(8);
        try {
            int read = raf.read(tail, TAIL_OFFSET).get();
            if (read != 8) {
                throw new IOException ("Failed to read 8 byte TAIL_OFFSET, return: " + read);
            }
        } catch (InterruptedException e) {
            throw new IOException (e.getMessage());
        } catch (ExecutionException e) {
            throw new IOException (e.getMessage());
        }
        tail.flip();
        return tail.getLong();
    }

    protected Status readStatus() throws IOException {
        ByteBuffer status = ByteBuffer.allocate(2);
        try {
            int read = raf.read(status, STATUS_OFFSET).get();
            if (read != 2) {
                throw new IOException ("Failed to read 2 byte STATUS_OFFSET, return: " + read);
            }
        } catch (InterruptedException e) {
            throw new IOException (e.getMessage());
        } catch (ExecutionException e) {
            throw new IOException (e.getMessage());
        }
        status.flip();
        return Status.valueOf(status.getShort());

    }
    protected void writeTailOffset(long pos) throws IOException {
        long currentTailOffset = readTailOffset(raf);
        if (currentTailOffset > pos)
            throw new IOException ("Invalid tailoffset " + fileNumber + "/" + pos + "/" + currentTailOffset);
        ByteBuffer tail = ByteBuffer.allocate(8);
        tail.putLong(pos);
        tail.flip();
        try {
            int write = raf.write(tail, TAIL_OFFSET).get();
            if (write != 8) {
                throw new IOException ("Failed to write 8 byte TAIL_OFFSET, return: " + write);
            }
        } catch (InterruptedException e) {
            throw new IOException (e.getMessage());
        } catch (ExecutionException e) {
            throw new IOException (e.getMessage());
        }
    }

    protected int getFileNumber(String s) {
        return s != null ? Integer.parseInt(s.substring(0,8)) : 0;
    }

    protected String getLastClosed (Path dir) throws IOException {
        for (String s : getFilesReversed(dir)) {
            if (isClosed(dir.resolve(s)))
                return s;
        }
        return null;
    }

    protected String getFirst (Path dir) throws IOException {
        return StreamSupport.stream(Files.newDirectoryStream(dir, filePattern).spliterator(), false)
                .map(Objects::toString)
                .sorted(String::compareTo)
                .findFirst()
                .orElse(null);
    }

    private void verifyHeader(Path file, AsynchronousFileChannel raf) throws IOException {
        if (raf.size() < TAIL_OFFSET + Long.BYTES)
            throw new IOException ("Invalid jPOS BinLog file " + fileNumber + " (" + file.toString() + ": " + raf.size() + "/" +  TAIL_OFFSET + Long.BYTES + ")");
        ByteBuffer magicbuf = ByteBuffer.allocate(4);
        try {
            int read = raf.read(magicbuf, 0).get();
            if (read != 4) {
                throw new IOException ("Failed to read 4 byte FILE_MAGIC, return: " + read);
            }
        } catch (InterruptedException e) {
            throw new IOException (e.getMessage());
        } catch (ExecutionException e) {
            throw new IOException (e.getMessage());
        }
        magicbuf.flip();
        int magic = magicbuf.getInt();
        if (!(FILE_MAGIC == magic))
            throw new IOException ("Invalid jPOS BinLog version " + fileNumber);
        long pos = readTailOffset(raf);
        if (pos < TAIL_OFFSET + Long.BYTES)
            throw new IOException ("Invalid jPOS BinLog header " + fileNumber + "/" + file.toString());
        long rafLength = raf.size();
        if (pos > rafLength)
            throw new IOException ("Truncated jPOS BinLog file " + fileNumber + " (" + pos + "/" + rafLength + ")");
    }

    private void lock (long timeout) throws IOException, InterruptedException {
        long end = System.currentTimeMillis() + timeout;
        FileLock lock = raf.tryLock();
        while (System.currentTimeMillis() < end) {
            Thread.sleep (10);
        }
        lock.release();
    }

    private List<String> getFiles(Path dir) throws IOException {
        return StreamSupport.stream(Files.newDirectoryStream(dir, filePattern).spliterator(), false)
                .map(Objects::toString)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
    private List<String> getFilesReversed(Path dir) throws IOException {
        return StreamSupport.stream(Files.newDirectoryStream(dir, filePattern).spliterator(), false)
                .map(Objects::toString)
                .sorted((s1, s2) -> -s1.compareTo(s2))
                .collect(Collectors.toList());
    }

    private boolean isClosed (Path f) throws IOException {
        if (Files.exists(f)) {
            try (AsynchronousFileChannel raf = AsynchronousFileChannel.open(f, READ)) {
                ByteBuffer status = ByteBuffer.allocate(2);
                try {
                    int read = raf.read(status, STATUS_OFFSET).get();
                    if (read != 2) {
                        throw new IOException ("Failed to read 2 byte STATUS_OFFSET, return: " + read);
                    }
                } catch (InterruptedException e) {
                    throw new IOException (e.getMessage());
                } catch (ExecutionException e) {
                    throw new IOException (e.getMessage());
                }
                status.flip();
                return Status.valueOf(status.getShort()) == Status.CLOSED;
            }
        }
        return false;
    }

    private void writeHeader (AsynchronousFileChannel r, int i) throws IOException {
        ByteBuffer header = ByteBuffer.allocate(256);
        header.putInt(FILE_MAGIC);
        header.putShort(VERSION);
        header.putShort(Status.OPEN.val);
        header.putLong(FIRST_EVENT_OFFSET);
        header.putInt(i); // this Log Number
        header.putInt(0);  // next Log Number
        header.put(new byte[RESERVED_LEN]);
        header.flip();
        try {
            int write = r.write(header, 0).get();
            if (write != 256) {
                throw new IOException ("Failed to write 256 byte HEADER, return: " + write);
            }
        } catch (InterruptedException e) {
            throw new IOException (e.getMessage());
        } catch (ExecutionException e) {
            throw new IOException (e.getMessage());
        }
    }

    public enum Status {
        OPEN((short)0),
        CLOSED((short)1);

        private short val;
        private static Map<Integer,Status> map = new HashMap<>();
        static {
            for (Status s : Status.values()) {
                map.put (s.intValue(), s);
            }
        }
        Status (short val) {
            this.val = val;
        }
        public int intValue() {
            return val;
        }
        public short shortValue() {
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
