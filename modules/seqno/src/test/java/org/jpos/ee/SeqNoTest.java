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

package org.jpos.ee;

import org.dom4j.DocumentException;
import org.jpos.iso.ISOUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeqNoTest {
    @BeforeAll
    public static void setUp() throws DocumentException {
        System.setProperty("db.create.enabled", "YES");
        try (DB db = new DB()) {
            db.createSchema(null, true);
        }
        System.setProperty("db.create.enabled", "NO");
    }

    @Test
    public void testNewSeqNoWithDefault() {
        try (DB db = new DB()) {
            db.open();
            SeqNoManager mgr = new SeqNoManager(db);
            db.beginTransaction();
            assertEquals(5, mgr.get("test.new.default.5", 5L));
            db.commit();
        }
        try (DB db = new DB()) {
            db.open();
            SeqNoManager mgr = new SeqNoManager(db);
            db.beginTransaction();
            assertEquals(6, mgr.next("test.new.default.5", 10L));
            assertEquals(7, mgr.next("test.new.default.5", 10L));
            assertEquals(8, mgr.next("test.new.default.5", 10L));
            assertEquals(9, mgr.next("test.new.default.5", 10L));
            assertEquals(10, mgr.next("test.new.default.5", 10L));
            assertEquals(1, mgr.next("test.new.default.5", 10L));
            db.commit();
        }
    }

    @Test
    public void testSyncLock() throws InterruptedException {
        int runs = 20;
        List<Thread> tl = new ArrayList<>();
        Random r = new Random();
        for (int i=0; i<runs; i++) {
            Thread t = new Thread(() -> {
                next(10 + Math.abs(r.nextLong()) % 100);
            });
            tl.add(t);
            t.start();
        }
        for (Thread t : tl) {
            t.join();
        }
        assertEquals(++runs, next(1L), "seq value incorrect");
        reset();
        assertEquals(1L, next(1L), "reset failed");
        reset();
    }

    @Test
    public void testAsyncLock() throws InterruptedException {
        int runs = 20;
        List<Thread> tl = new ArrayList<>();
        Random r = new Random();
        for (int i=0; i<runs; i++) {
            final int lockId = i;
            Thread t = new Thread(() -> {
                nextAsync(lockId, 10 + Math.abs(r.nextLong()) % 100);
            });
            tl.add(t);
            t.start();
        }
        for (Thread t : tl) {
            t.join();
        }
        assertEquals(++runs, next(1L), "seq value incorrect");
    }

    private long next(long delay) {
        try (DB db = new DB()) {
            SeqNoManager mgr = new SeqNoManager(db);
            db.open();
            db.beginTransaction();
            long l = mgr.next("sync", 999999L);
            ISOUtil.sleep(delay);
            db.commit();
            return l;
        }
    }

    private long nextAsync(long id, long delay) {
        SeqNoManager mgr = new SeqNoManager(new DB());
        long l = mgr.next("sync", id, 60000L, 60000L, 999999L);
        ISOUtil.sleep(delay);
        mgr.release("sync", id);
        return l;
    }
    private void reset() {
        try (DB db = new DB()) {
            SeqNoManager mgr = new SeqNoManager(db);
            db.open();
            db.beginTransaction();
            mgr.reset("sync", 0L);
            db.commit();
        }
    }
}
