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

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * SeqNo can be used to manage application level sequencers and both synchronous as well as asynchronous locking.
 *
 * In synchronous mode, a lock is placed on <code>SeqNo.id</code>.
 * In asynchronous mode, a unique <code>lockedBy</code> identifier is used, and the entry is considered locked
 * until a given timeout, or gets released by calling <code>SeqNoManager.release</code>.
 *
 * While this entity support both modes (sync/async), applications shouldn't mix them.
 *
 * @see org.jpos.ee.SeqNoManager
 * @since 2.2.6
 */

@Entity
@Table(name = "seqno")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("unused")
public class SeqNo extends Cloneable implements Serializable {
    private static final long serialVersionUID = -1475470843801587648L;
    @Id
    @Column(length=128)
    private String id;

    private long value;
    private long lockedBy;
    private long lockUntil;

    public SeqNo(String id) {
        this.id = id;
    }

    public SeqNo(String id, long value) {
        this.id = id;
        this.value = value;
    }

    public SeqNo() {
        super();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getValue() {
        return this.value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Returns next sequence number.
     *
     * @param wrapAt greater than wraps back to 1
     * @return next sequence number
     */
    public long next (long wrapAt) {
        synchronized (this) {
            if (++value > wrapAt)
                value = 1;
        }
        return value;
    }

    public long getLockedBy() {
        return lockedBy;
    }

    public void setLockedBy(long lockedBy) {
        this.lockedBy = lockedBy;
    }

    public long getLockUntil() {
        return lockUntil;
    }

    public void setLockUntil(long lockUntil) {
        this.lockUntil = lockUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeqNo seqNo = (SeqNo) o;
        return value == seqNo.value && Objects.equals(id, seqNo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    @Override
    public String toString() {
        return "SeqNo{" +
          "id='" + id + '\'' +
          ", value=" + value +
          '}';
    }
}
