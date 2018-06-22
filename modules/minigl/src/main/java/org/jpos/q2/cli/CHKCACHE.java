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
                    cli.println(String.format("%20s: %16s ref=%d OK", cache.getAccount().getCode(), bd.toBigInteger(), cache.getRef()));
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
