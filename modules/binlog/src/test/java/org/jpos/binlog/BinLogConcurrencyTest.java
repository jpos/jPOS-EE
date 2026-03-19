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

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Stress and edge-case tests targeting the improvements introduced in the
 * improve/binlog branch:
 *
 * <ul>
 *   <li>Phase 1 – FileLock acquisition bounded by 5 s timeout</li>
 *   <li>Phase 2 – cutover() channel-close logic (switched flag)</li>
 *   <li>Phase 3 – BinLogReader.read() single peek-buffer I/O</li>
 *   <li>Phase 4 – BinLogReader.hasNext(long) Condition-based wait</li>
 * </ul>
 */
class BinLogConcurrencyTest {

    // -------------------------------------------------------------------------
    // Phase 3 — single-read peek buffer
    // -------------------------------------------------------------------------

    /**
     * Records larger than PEEK_BUFFER_SIZE (4096 bytes) trigger the slow-path
     * second read. Verify both halves are assembled correctly.
     */
    @Test
    void largeRecordRoundTrip(@TempDir Path dir) throws Exception {
        byte[] big = new byte[16_384];
        Arrays.fill(big, (byte) 0xAB);

        try (BinLogWriter w = new BinLogWriter(dir)) {
            w.add(big);
        }
        try (BinLogReader r = new BinLogReader(dir)) {
            assertTrue(r.hasNext(2000), "Expected one record");
            assertArrayEquals(big, r.next().get(), "Large record payload mismatch");
        }
    }

    /**
     * Record of exactly (PEEK_BUFFER_SIZE - 4) bytes fills the peek buffer to
     * the brim with no leftover — boundary of the fast path.
     */
    @Test
    void peekBufferBoundaryExact(@TempDir Path dir) throws Exception {
        byte[] exact = new byte[4092]; // 4096 peek - 4 header bytes
        Arrays.fill(exact, (byte) 0xCC);

        try (BinLogWriter w = new BinLogWriter(dir)) {
            w.add(exact);
        }
        try (BinLogReader r = new BinLogReader(dir)) {
            assertTrue(r.hasNext(2000));
            assertArrayEquals(exact, r.next().get(), "Boundary record mismatch");
        }
    }

    /**
     * Records of size (PEEK_BUFFER_SIZE - 3) and (PEEK_BUFFER_SIZE - 4 + 1)
     * straddle the boundary between fast and slow path.
     */
    @Test
    void peekBufferBoundaryOneOver(@TempDir Path dir) throws Exception {
        byte[] oneover = new byte[4093]; // one byte into slow path
        Arrays.fill(oneover, (byte) 0xDD);

        try (BinLogWriter w = new BinLogWriter(dir)) {
            w.add(oneover);
        }
        try (BinLogReader r = new BinLogReader(dir)) {
            assertTrue(r.hasNext(2000));
            assertArrayEquals(oneover, r.next().get(), "One-over-boundary record mismatch");
        }
    }

    /**
     * Mix of tiny, boundary, and oversized records in a single file to confirm
     * iteratorPos advances correctly across all three fast/slow path variants.
     */
    @Test
    void mixedRecordSizes(@TempDir Path dir) throws Exception {
        int[] sizes = {1, 100, 4091, 4092, 4093, 8_000, 65_536};
        List<byte[]> originals = new ArrayList<>();

        try (BinLogWriter w = new BinLogWriter(dir)) {
            for (int sz : sizes) {
                byte[] data = new byte[sz];
                Arrays.fill(data, (byte) (sz & 0xFF));
                originals.add(data);
                w.add(data);
            }
        }
        try (BinLogReader r = new BinLogReader(dir)) {
            for (byte[] expected : originals) {
                assertTrue(r.hasNext(2000), "Expected more records");
                assertArrayEquals(expected, r.next().get(),
                    "Mismatch for record of size " + expected.length);
            }
        }
    }

    // -------------------------------------------------------------------------
    // Phase 4 — Condition-based hasNext(long timeout)
    // -------------------------------------------------------------------------

    /**
     * A reader blocked in hasNext() must wake up quickly after the writer
     * flushes — target &lt;50 ms signal latency (was capped at 50 ms with the
     * old busy-wait).
     */
    @Test
    void hasNextSignalLatency(@TempDir Path dir) throws Exception {
        CompletableFuture<Long> wakeNano = new CompletableFuture<>();

        try (BinLogWriter w = new BinLogWriter(dir);
             BinLogReader r = new BinLogReader(dir)) {

            // Start reader; it will block in hasNext() since no data yet.
            Thread readerThread = Thread.ofVirtual().start(() -> {
                r.hasNext(10_000);
                wakeNano.complete(System.nanoTime());
            });

            // Give the reader time to enter await().
            Thread.sleep(200);

            long writeNano = System.nanoTime();
            w.add("ping".getBytes());

            long woke = wakeNano.get(5, TimeUnit.SECONDS);
            long latencyMs = TimeUnit.NANOSECONDS.toMillis(woke - writeNano);

            System.out.printf("hasNext signal latency: %d ms%n", latencyMs);
            // Generous ceiling for CI: must be far below the old 50ms floor.
            assertTrue(latencyMs < 50,
                "Expected signal latency <50 ms, got " + latencyMs + " ms");

            readerThread.join(1000);
        }
    }

    /**
     * Data already present when hasNext(timeout) is called must return
     * immediately without entering await() and burning any of the timeout.
     */
    @Test
    void hasNextReturnsTrueImmediatelyWhenDataPresent(@TempDir Path dir) throws Exception {
        try (BinLogWriter w = new BinLogWriter(dir)) {
            w.add("pre-written".getBytes());
        }
        try (BinLogReader r = new BinLogReader(dir)) {
            long start = System.nanoTime();
            boolean result = r.hasNext(5000);
            long ms = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
            assertTrue(result, "Expected hasNext=true for pre-written data");
            assertTrue(ms < 100,
                "hasNext should not wait when data is present; took " + ms + " ms");
        }
    }

    /**
     * hasNext(timeout) must honour thread interruption and return false
     * instead of hanging for the full timeout.
     */
    @Test
    void hasNextHonoursInterrupt(@TempDir Path dir) throws Exception {
        AtomicBoolean result = new AtomicBoolean(true);
        // BinLogReader requires at least one .dat file to exist (opens read-only).
        // Create the initial file via a writer that writes nothing.
        try (BinLogWriter init = new BinLogWriter(dir)) { /* initialise 00000001.dat */ }
        try (BinLogReader r = new BinLogReader(dir)) {
            Thread t = Thread.ofVirtual().start(() ->
                result.set(r.hasNext(30_000))
            );
            Thread.sleep(150); // let it enter await()
            t.interrupt();
            t.join(1000);
            assertFalse(t.isAlive(), "Reader thread did not exit on interrupt");
            assertFalse(result.get(), "hasNext should return false after interrupt");
        }
    }

    /**
     * cutover() in the writer signals the Condition, so a reader waiting in
     * hasNext() must wake up and follow the cutover to the new file.
     */
    @Test
    void hasNextWakesOnCutover(@TempDir Path dir) throws Exception {
        CompletableFuture<String> firstRecord = new CompletableFuture<>();

        try (BinLogWriter w = new BinLogWriter(dir);
             BinLogReader r = new BinLogReader(dir)) {

            Thread readerThread = Thread.ofVirtual().start(() -> {
                if (r.hasNext(5000)) {
                    firstRecord.complete(new String(r.next().get()));
                } else {
                    firstRecord.complete(null);
                }
            });

            Thread.sleep(150); // reader enters await

            // Write to current file, then cut over — signal fires in cutover()
            w.add("before-cutover".getBytes());
            w.cutover();

            assertEquals("before-cutover", firstRecord.get(5, TimeUnit.SECONDS));
            readerThread.join(1000);
        }
    }

    // -------------------------------------------------------------------------
    // Phase 2 — concurrent cutover
    // -------------------------------------------------------------------------

    /**
     * Many threads each open their own BinLogWriter to the same directory and
     * call cutover() simultaneously. No ClosedChannelException, no channel
     * leaks, no data corruption.
     */
    @Test
    void concurrentCutoverStorm(@TempDir Path dir) throws Exception {
        int threads = 30;
        CountDownLatch ready = new CountDownLatch(threads);
        CountDownLatch go    = new CountDownLatch(1);
        AtomicInteger errors = new AtomicInteger();

        ExecutorService exec = Executors.newVirtualThreadPerTaskExecutor();
        List<Future<?>> futures = new ArrayList<>();

        for (int i = 0; i < threads; i++) {
            final int idx = i;
            futures.add(exec.submit(() -> {
                ready.countDown();
                try {
                    go.await();
                    try (BinLogWriter w = new BinLogWriter(dir)) {
                        w.add(("thread-" + idx).getBytes());
                        w.cutover();
                    }
                } catch (Exception e) {
                    errors.incrementAndGet();
                    e.printStackTrace(System.err);
                }
            }));
        }

        ready.await();
        go.countDown(); // release all threads simultaneously

        exec.shutdown();
        assertTrue(exec.awaitTermination(20, TimeUnit.SECONDS),
            "Threads did not finish in time");
        assertEquals(0, errors.get(),
            "Errors during concurrent cutover storm");
    }

    /**
     * Alternating write + cutover from one thread while another thread
     * repeatedly opens new BinLogWriters to the same directory — exercises
     * the race between openOrCreateFile() and cutover().
     */
    @Test
    void writeAndCutoverRace(@TempDir Path dir) throws Exception {
        int rounds       = 50;
        AtomicInteger errors = new AtomicInteger();
        CountDownLatch done  = new CountDownLatch(2);

        // Thread A: write and cutover
        Thread.ofVirtual().start(() -> {
            try (BinLogWriter w = new BinLogWriter(dir)) {
                for (int i = 0; i < rounds; i++) {
                    w.add(("A-" + i).getBytes());
                    w.cutover();
                }
            } catch (Exception e) {
                errors.incrementAndGet();
                e.printStackTrace(System.err);
            } finally {
                done.countDown();
            }
        });

        // Thread B: keep opening new writers and writing a single record
        Thread.ofVirtual().start(() -> {
            for (int i = 0; i < rounds; i++) {
                try (BinLogWriter w = new BinLogWriter(dir)) {
                    w.add(("B-" + i).getBytes());
                } catch (Exception e) {
                    errors.incrementAndGet();
                    e.printStackTrace(System.err);
                }
            }
            done.countDown();
        });

        assertTrue(done.await(20, TimeUnit.SECONDS), "Race threads timed out");
        assertEquals(0, errors.get(), "Errors during write/cutover race");
    }

    // -------------------------------------------------------------------------
    // End-to-end: reader follows writer across cutovers (all phases exercised)
    // -------------------------------------------------------------------------

    /**
     * Single writer produces records across many cutovers; concurrent reader
     * follows in real time using Condition-based hasNext and the single-read
     * peek path. Verifies count and strict ordering.
     */
    @Test
    void readerFollowsWriterAcrossCutovers(@TempDir Path dir) throws Exception {
        final int cutovers        = 20;
        final int recordsPerFile  = 50;
        final int total           = cutovers * recordsPerFile;

        AtomicInteger written   = new AtomicInteger();
        CountDownLatch firstFile = new CountDownLatch(1); // reader waits for first file

        ExecutorService exec = Executors.newVirtualThreadPerTaskExecutor();

        Future<?> writerFuture = exec.submit(() -> {
            try (BinLogWriter w = new BinLogWriter(dir)) {
                firstFile.countDown(); // first file created in constructor
                for (int c = 0; c < cutovers; c++) {
                    for (int i = 0; i < recordsPerFile; i++) {
                        w.add(("record-" + written.incrementAndGet()).getBytes());
                    }
                    if (c < cutovers - 1) {
                        w.cutover();
                    }
                    // last batch stays in OPEN file — reader still reads it
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        assertTrue(firstFile.await(5, TimeUnit.SECONDS),
            "Writer did not create first file in time");

        List<String> received = new ArrayList<>(total);
        try (BinLogReader r = new BinLogReader(dir)) {
            while (received.size() < total) {
                if (r.hasNext(3000)) {
                    received.add(new String(r.next().get()));
                } else {
                    break; // timeout — data never arrived
                }
            }
        }

        writerFuture.get(20, TimeUnit.SECONDS);
        exec.shutdown();

        assertEquals(total, received.size(),
            "Did not read all records across cutovers");
        // writer is single-threaded so ordering must be preserved
        for (int i = 0; i < total; i++) {
            assertEquals("record-" + (i + 1), received.get(i),
                "Record out of order at index " + i);
        }
    }

    /**
     * Multiple concurrent writers each contribute records; a single reader
     * collects all of them and verifies the total count (ordering is
     * non-deterministic with multiple writers).
     */
    @Test
    void multipleWritersSingleReader(@TempDir Path dir) throws Exception {
        final int writerCount    = 10;
        final int perWriter      = 100;
        final int total          = writerCount * perWriter;

        AtomicInteger written    = new AtomicInteger();
        CountDownLatch allReady  = new CountDownLatch(writerCount);
        CountDownLatch go        = new CountDownLatch(1);
        AtomicInteger errors     = new AtomicInteger();

        ExecutorService exec = Executors.newVirtualThreadPerTaskExecutor();
        List<Future<?>> futures  = new ArrayList<>();

        for (int w = 0; w < writerCount; w++) {
            final int wid = w;
            futures.add(exec.submit(() -> {
                allReady.countDown();
                try {
                    go.await();
                    try (BinLogWriter writer = new BinLogWriter(dir)) {
                        for (int i = 0; i < perWriter; i++) {
                            writer.add(("w" + wid + "-" + i).getBytes());
                        }
                        writer.flush();
                        writer.cutover();
                    }
                    written.addAndGet(perWriter);
                } catch (Exception e) {
                    errors.incrementAndGet();
                    e.printStackTrace(System.err);
                }
            }));
        }

        // Ensure 00000001.dat exists before the reader opens the directory.
        // One of the writers will do this, but the reader must not race it.
        try (BinLogWriter init = new BinLogWriter(dir)) { /* initialise */ }

        allReady.await();
        go.countDown();

        int received = 0;
        try (BinLogReader r = new BinLogReader(dir)) {
            while (received < total) {
                if (r.hasNext(5000)) {
                    r.next(); // consume
                    received++;
                } else {
                    break;
                }
            }
        }

        exec.shutdown();
        exec.awaitTermination(20, TimeUnit.SECONDS);

        assertEquals(0, errors.get(), "Writer errors occurred");
        assertEquals(total, received,
            "Expected " + total + " records, got " + received);
    }
}
