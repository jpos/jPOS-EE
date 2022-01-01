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

package org.jpos.transaction;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.engine.spi.CollectionKey;
import org.hibernate.engine.spi.EntityKey;
import org.hibernate.stat.SessionStatistics;
import org.jpos.ee.DB;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("unchecked unused")
public class DebugDB implements AbortParticipant {
    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        DB db = (DB) ctx.get(TxnConstants.DB);

        Session session = db.session();
        SessionStatistics statistics = session.getStatistics();
        Set<EntityKey> entityKeys = statistics.getEntityKeys();
        ctx.log (String.format ("ENTITIES:  (%d)", statistics.getEntityCount()));
        for (EntityKey ek : entityKeys) {
            Object obj = session.get(ek.getEntityName(), ek.getIdentifier());
            LockMode lockMode = session.getCurrentLockMode(obj);
            ctx.log(String.format("[%s] %s %s", ek.getIdentifier(), ek.getEntityName(), lockMode));
        }
        ctx.log ("==== COLLECTIONS ====");
        Set<CollectionKey> collectionKeys = statistics.getCollectionKeys();
        for (CollectionKey ck : collectionKeys) {
            ctx.log(String.format("[%s] %s", ck.getKey(), ck.getRole()));
        }

        ctx.log("=====================");
        return PREPARED | READONLY | NO_JOIN;
    }

    @Override
    public int prepareForAbort(long id, Serializable context) {
        return prepare(id, context);
    }

    @Override
    public void commit(long id, Serializable context) { }

    @Override
    public void abort(long id, Serializable context) { }
}
