/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.persister.entity.EntityPersister;
import org.hibernate.type.Type;
import org.jpos.q2.Q2;
import org.jpos.transaction.TxnId;

import java.io.Serializable;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@SuppressWarnings("unused")
public class TxnIdGenerator implements IdentifierGenerator {
    private static final int nodeId;
    private static final ConcurrentMap<Class<?>, Class<?>> idFieldTypeCache = new ConcurrentHashMap<>();
    private static AtomicLong counter = new AtomicLong();

    static {
        nodeId = Q2.node();
    }
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        EntityPersister persister = session.getEntityPersister(null, object);
        Type identifierType = persister.getIdentifierType();
        Class<?> idType = identifierType.getReturnedClass();

        TxnId txnId = TxnId.create(Instant.now(), nodeId, counter.incrementAndGet());
        if (idType.equals(String.class)) {
            return txnId.toString();
        } else if (idType.equals(Long.class) || idType.equals(long.class)) {
            return txnId.id();
        } else {
            throw new UnsupportedOperationException("Unsupported ID type: " + idType);
        }
    }
}
