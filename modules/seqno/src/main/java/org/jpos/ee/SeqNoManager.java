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

package org.jpos.ee;

import org.hibernate.LockMode;
import org.jpos.iso.ISOUtil;
import javax.persistence.LockTimeoutException;

/**
 * SeqNoManager can be used to manage application level sequencers and both synchronous as well as asynchronous locking.
 *
 * This Manager can operate in synchronous or asynchronous way.
 * In sync mode, the caller needs to provide the transaction life-cycle
 * (<code>open, beginTransaction, commit, close</code>).
 *
 * In async mode the application has to provide a pristine (not opened) DB object
 * and the manager takes care of the transaction lifecycle.
 *
 * @see org.jpos.ee.SeqNoManager
 * @since 2.2.6
 */
public class SeqNoManager {
    private DB db;

    public SeqNoManager(DB db) {
        this.db = db;
    }


    /**
     * Synchronous 'next'
     * @param id sequencer id
     * @param wrapAt wrap at value
     * @return next sequencer value
     */
    public long next (String id, long wrapAt) {
        return getOrCreate(id).next(wrapAt);
    }

    /**
     * Synchronous 'reset'
     * @param id sequencer id
     * @param value reset value
     */
    public void reset (String id, long value) {
        getOrCreate(id).setValue(value);
    }

    /**
     * Asynchronous 'next'
     *
     * @param id sequencer ID
     * @param lockedBy unique client identifier (any long, has to be system-wide unique)
     * @param lockTimeout once lock is obtained, keep it fo 'lockTimeout' millis (if not 'released' earlier)
     * @param timeout time (in millis) to wait for this lock
     * @param wrapAt wrap at value
     * @return next sequencer value
     * @throws LockTimeoutException if lock can't be obtained after 'timeout' has elapsed
     */
    public long next (String id, long lockedBy, long lockTimeout, long timeout, long wrapAt) {
        long until = System.currentTimeMillis() + timeout;
        if (db.session != null && db.session.isOpen())
            throw new IllegalStateException("DB should not be open");
        while (System.currentTimeMillis() < until) {
            try (DB db1 = db) {
                db1.open();
                db1.beginTransaction();
                SeqNo seq = getOrCreate(id);
                long now = System.currentTimeMillis();
                if (seq.getLockedBy() == 0 || seq.getLockUntil() < now) {
                    seq.setLockedBy(lockedBy);
                    seq.setLockUntil(now + lockTimeout);
                    long stan = seq.next(wrapAt);
                    db1.commit();
                    return stan;
                }
                db1.commit();
                ISOUtil.sleep(500L);
            }
        }
        throw new LockTimeoutException("Unable to lock " + id + " in less than " + timeout + " millis");
    }

    /**
     * Release an async lock
     * @param id lock ID
     * @param lockedBy  unique client identifier
     */
    public void release (String id, long lockedBy) {
        if (db.session != null && db.session.isOpen())
            throw new IllegalStateException("DB should not be open");
        try (DB db1 = db) {
            db1.open();
            db1.beginTransaction();
            SeqNo seq = getOrCreate(id);
            if (seq.getLockedBy() == lockedBy) {
                seq.setLockedBy(0L);
                db1.commit();
            }
        }
    }

    private SeqNo getOrCreate(String id) {
        SeqNo seq = db.session().get(SeqNo.class, id, LockMode.PESSIMISTIC_WRITE);
        if (seq == null) {
            create (id);
            seq = db.session().get(SeqNo.class, id, LockMode.PESSIMISTIC_WRITE);
        }
        return seq;
    }

    private void create (String id) {
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            SeqNo seq = new SeqNo(id);
            db.session().save(seq);
            db.commit();
        } catch (Exception ignored) { }
    }
}
