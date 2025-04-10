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

package org.jpos.transaction;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;
import org.jpos.ee.DB;

import java.io.Serializable;

@SuppressWarnings("unchecked unused")
public class DebugDB implements AbortParticipant {
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        DB db = ctx.get(TxnConstants.DB);

        Session session = db.session();
        Statistics statistics = session.getSessionFactory().getStatistics();

        // Print general statistics
        ctx.log("=== Hibernate Statistics ===");
        ctx.log(String.format("Entity Load Count: %d", statistics.getEntityLoadCount()));
        ctx.log(String.format("Entity Fetch Count: %d", statistics.getEntityFetchCount()));
        ctx.log(String.format("Query Execution Count: %d", statistics.getQueryExecutionCount()));
        ctx.log(String.format("Second Level Cache Hit Count: %d", statistics.getSecondLevelCacheHitCount()));
        ctx.log(String.format("Second Level Cache Miss Count: %d", statistics.getSecondLevelCacheMissCount()));
        ctx.log(String.format("Second Level Cache Put Count: %d", statistics.getSecondLevelCachePutCount()));

        // Print entity statistics
        ctx.log("=== Entity Statistics ===");
        String[] entityNames = statistics.getEntityNames();
        for (String entityName : entityNames) {
            ctx.log(String.format("Entity: %s", entityName));
            ctx.log(String.format("  Load Count: %d", statistics.getEntityLoadCount()));
            ctx.log(String.format("  Fetch Count: %d", statistics.getEntityFetchCount()));
        }

        // Print collection statistics
        ctx.log("=== Collection Statistics ===");
        String[] collectionRoleNames = statistics.getCollectionRoleNames();
        for (String roleName : collectionRoleNames) {
            ctx.log(String.format("Collection Role: %s", roleName));
            ctx.log(String.format("  Load Count: %d", statistics.getCollectionLoadCount()));
            ctx.log(String.format("  Fetch Count: %d", statistics.getCollectionFetchCount()));
        }

        // Print query statistics
        ctx.log("=== Query Statistics ===");
        String[] queries = statistics.getQueries();
        for (String query : queries) {
            ctx.log(String.format("Query: %s", query));
            ctx.log(String.format("  Execution Count: %d", statistics.getQueryExecutionCount()));
            ctx.log(String.format("  Cache Hit Count: %d", statistics.getQueryCacheHitCount()));
            ctx.log(String.format("  Cache Miss Count: %d", statistics.getQueryCacheMissCount()));
        }

        // Print cache statistics
        ctx.log("=== Cache Statistics ===");
        String[] secondLevelCacheRegionNames = statistics.getSecondLevelCacheRegionNames();
        for (String regionName : secondLevelCacheRegionNames) {
            ctx.log(String.format("Cache Region: %s", regionName));
            ctx.log(String.format("  Hit Count: %d", statistics.getSecondLevelCacheHitCount()));
            ctx.log(String.format("  Miss Count: %d", statistics.getSecondLevelCacheMissCount()));
            ctx.log(String.format("  Put Count: %d", statistics.getSecondLevelCachePutCount()));
        }

        ctx.log("========================");
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
