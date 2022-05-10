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

package org.jpos.q2.cli;

import org.jpos.ee.DB;
import org.jpos.gl.*;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.math.BigDecimal;
import java.util.List;


@SuppressWarnings("unused")
public class CHKCACHE implements CLICommand {
    @SuppressWarnings("unchecked")
    public void exec(CLIContext cli, String[] args) {
        long start = System.currentTimeMillis();
        try (DB db = new DB()) {
            db.open();
            GLSession gls = new GLSession(db);
            List<BalanceCache> caches = db.session().createQuery("from org.jpos.gl.BalanceCache").list();
            int good=0;
            int total=0;
            for (BalanceCache cache: caches) {
                total++;
                BigDecimal bd = gls.getBalances(cache.getJournal(),
                  cache.getAccount(), null, true,
                  gls.toLayers(cache.getLayers().replace(".", ",")),
                  cache.getRef())[0];

                gls.setIgnoreBalanceCache(true);
                BigDecimal bd1 = gls.getBalances(cache.getJournal(),
                  cache.getAccount(), null, true,
                  gls.toLayers(cache.getLayers().replace(".", ",")),
                  cache.getRef())[0];
                gls.setIgnoreBalanceCache(false);

                if (cache.getBalance().equals(bd) && bd.equals(bd1)) {
                    cli.println(String.format("%20s: %16s ref=%d (%s) OK", cache.getAccount().getCode(), bd.toBigInteger(), cache.getRef(), cache.getLayers()));
                    good++;
                } else {
                    cli.println ("Balance cache mismatch: " + cache + "/" + bd + "/" + bd1);
                }
            }
            cli.println ("Correct balance caches: " + good + " of " + total);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
