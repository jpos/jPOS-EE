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

package org.jpos.gl;


import org.jpos.ee.DB;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.QBeanSupport;
import org.jpos.space.Space;
import org.jpos.space.TSpace;

import java.util.Map;
import java.util.HashMap;

public class BalanceCacheService extends QBeanSupport {
    private Space sp = new TSpace();
    private static final String QUEUE = "queue";
    private static long TIMEOUT = 300000L;
    private static long BATCH_TIME = 15000L;

    public void run() {
        while (running()) {
            ISOUtil.sleep(BATCH_TIME);
            if (!running())
                break;

            Map<String, BalanceCacheEntry> cache = getUniqueEntries();
            cache.forEach((k, cacheEntry) -> {
                try {
                    DB.execWithTransaction((db) -> {
                        GLSession gls = new GLSession(db);
                        Journal journal = gls.session().get(Journal.class, cacheEntry.journalId);
                        Account acct = gls.session().get(Account.class, cacheEntry.acctId);
                        if (journal != null && acct != null) {
                            gls.createBalanceCache(journal, acct, gls.toLayers(cacheEntry.layers));
                        }
                        return null;
                    });
                } catch (Exception e) {
                    getLog().warn(e);
                }
            });
        }
    }

    public void queue (Journal journal, Account acct, String layers) {
        if (running())
            sp.out (QUEUE, new BalanceCacheEntry(journal.getId(), acct.getId(), layers), TIMEOUT);
    }
    @SuppressWarnings("unchecked")
    private Map<String, BalanceCacheEntry> getUniqueEntries() {
        Map<String, BalanceCacheEntry> cache = new HashMap<>();
        BalanceCacheEntry entry;
        while ((entry = (BalanceCacheEntry) sp.inp(QUEUE)) != null) {
            cache.put(entry.toString(), entry);
        }
        return cache;
    }

    public record BalanceCacheEntry (long journalId, long acctId, String layers) {
        @Override
        public String toString() {
            return
              journalId +
                "." + acctId +
                "." + layers;
        }
    }
}
