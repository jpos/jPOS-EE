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
import org.jpos.util.TPS;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


@TestMethodOrder(OrderAnnotation.class)
public class BinLogTest implements Runnable {
    public static Path dir;
    private AtomicLong cnt = new AtomicLong();
    private static ExecutorService executor;
    private static TPS tps = new TPS();

    @BeforeAll
    public static void setup () throws IOException {
        dir = Files.createTempFile("binlog-", "");
        executor = Executors.newVirtualThreadPerTaskExecutor();
        Files.delete(dir);
        System.out.println ("TEMP=" + dir);
    }
    @Test
    @Order(1)
    public void test000_Write() throws IOException {
        try (BinLogWriter w = new BinLogWriter(dir)) { 
            assertNotNull(w.getFirst(dir), "Did not find first file");
            assertNull(w.getLastClosed(dir), "Found last closed file");
            assertEquals(1, w.getFileNumber(w.getFirst(dir)), "Invalid first file");
        }
        for (int i=0; i<100; i++) {
            executor.submit(this);
        }
        try (BinLogReader bl = new BinLogReader(dir)) {
            int i = 0;
            while (bl.hasNext(10000L)) {
                i++;
                byte[] b = bl.next().get();
                if ((i % 100) == 0)
                    System.out.println(i + " " + new String(b));
            }
            assertEquals(10000, i, "Invalid number of entries");
            assertEquals(1, bl.getFileNumber(bl.getFirst(dir)), "Invalid first file");
            assertEquals(100, bl.getFileNumber(bl.getLastClosed(dir)), "Invalid last closed file");
        }
    }

    public void run() {
        List<Future<BinLog.Ref>> futures = new ArrayList<>();
        try (BinLogWriter bl = new BinLogWriter(dir)) {
            for (int i = 1; i <= 100; i++) {
                long l = cnt.incrementAndGet();
                futures.add (
                  bl.queue(ISOUtil.zeropad(l, 12).getBytes())
                );
                tps.tick();
            }
            bl.flush();
            for (Future<BinLog.Ref> f : futures) {
                if (!f.isDone())
                    throw new IllegalStateException("Future " + f + " !done");
            }
            tps.dump(System.out, "");
            bl.cutover();
        } catch (Throwable e) {
            e.printStackTrace(System.err);
        }
    }

    @AfterAll
    public static void cleanup() throws IOException {
        if (Files.isDirectory(dir)) {
            for (Path f : Files.newDirectoryStream(dir)) {
                if (f.toString().endsWith(".dat")) {
                    System.out.println ("Deleting " + f.toString());
                    Files.delete(f);
                }
            }
        }
        System.out.println ("Deleting " + dir);
        Files.deleteIfExists(dir);
    }
}
