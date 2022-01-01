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


    /* Synchronous methods */

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
     * get SeqNo value
     * @param id sequencer id
     * @return current value
     */
    public long get (String id) {
        return getOrCreate(id).getValue();
    }

    /**
     * get SeqNo value
     * @param id sequencer id
     * @param initialValue for newly created sequencers
     * @return current value
     */
    public long get (String id, long initialValue) {
        return getOrCreate(id, initialValue).getValue();
    }
    
    /* Asynchronous methods */
    /**
     * Asynchronous 'lock'
     *
     * @param id sequencer ID
     * @param lockedBy unique client identifier (any long, has to be system-wide unique)
     * @param lockTimeout once lock is obtained, keep it fo 'lockTimeout' millis (if not 'released' earlier)
     * @param timeout time (in millis) to wait for this lock
     * @return action's lambda value
     * @throws LockTimeoutException if lock can't be obtained after 'timeout' has elapsed
     */
    public long lock (String id, long lockedBy, long lockTimeout, long timeout, SeqNoAction action) {
        long until = System.currentTimeMillis() + timeout;
        if (db.session != null && db.session.isOpen())
            throw new IllegalStateException("DB should not be open");
        while (System.currentTimeMillis() < until) {
            try (DB db1 = db) {
                db1.open();
                db1.beginTransaction();
                SeqNo seq = getOrCreate(id);
                long now = System.currentTimeMillis();
                if (seq.getLockedBy() == 0 || seq.getLockedBy() == lockedBy || seq.getLockUntil() < now) {
                    seq.setLockedBy(lockedBy);
                    seq.setLockUntil(now + lockTimeout);
                    long l = action.apply(seq);
                    db1.commit();
                    return l;
                }
                db1.commit();
                ISOUtil.sleep(500L);
            }
        }
        throw new LockTimeoutException("Unable to lock " + id + " in less than " + timeout + " millis");
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
        return lock (id, lockedBy, lockTimeout, timeout, seq -> seq.next(wrapAt));
    }

    /**
     * Reset an async lock
     * @param id lock ID
     * @param lockedBy  unique client identifier
     * @param value new sequencer value
     * @param release if true, lock is released after reset
     * @throws LockTimeoutException if lock can't be obtained after 'timeout' has elapsed
     */
    public void reset (String id, long lockedBy, long value, boolean release) {
        lock(id, lockedBy, 0L, 1000L, seq -> {
            seq.setValue(0L);
            if (release)
                seq.setLockedBy(0L);
            return 0L;
        });
    }

    /**
     * Release an async lock
     * @param id lock ID
     * @param lockedBy  unique client identifier
     */
    public boolean release (String id, long lockedBy) {
        if (db.session != null && db.session.isOpen())
            throw new IllegalStateException("DB should not be open");
        try (DB db1 = db) {
            db1.open();
            db1.beginTransaction();
            SeqNo seq = getOrCreate(id);
            if (seq.getLockedBy() == lockedBy && seq.getLockUntil() > System.currentTimeMillis()) {
                seq.setLockedBy(0L);
                db1.commit();
                return true;
            }
        }
        return false;
    }

    private SeqNo getOrCreate(String id) {
        return getOrCreate(id, 0L);
    }

    private SeqNo getOrCreate(String id, long initialValue) {
        SeqNo seq = db.session().get(SeqNo.class, id, LockMode.PESSIMISTIC_WRITE);
        if (seq == null) {
            create (id, initialValue);
            seq = db.session().get(SeqNo.class, id, LockMode.PESSIMISTIC_WRITE);
        }
        return seq;
    }

    private void create (String id, long initialValue) {
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            SeqNo seq = new SeqNo(id, initialValue);
            db.session().save(seq);
            db.commit();
        } catch (Exception ignored) { }
    }
}
