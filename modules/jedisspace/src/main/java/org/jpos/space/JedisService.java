/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2010 Alejandro P. Revilla
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

package org.jpos.jedis;

import org.jpos.iso.ISOUtil;
import org.jpos.q2.QBeanSupport;
import org.jpos.util.NameRegistrar;
import org.jpos.util.Profiler;
import redis.clients.jedis.Jedis;

@SuppressWarnings("unused")
public class JedisService extends QBeanSupport implements Runnable {
    @Override
    protected void initService() throws Exception {
        NameRegistrar.register(getName(), this);
    }
    @Override
    protected void startService() throws Exception {
        if (cfg.getLong("ping-every", 0L) > 0L)
            new Thread(this, getName()).start();
    }
    @Override
    protected void stopService() throws Exception {
        NameRegistrar.unregister(getName());
    }
    public Jedis getConnection()
    {
        getLog().info("getting a new jedis connection");
        Jedis jedis = new Jedis(
                cfg.get("host", "localhost"),
                cfg.getInt("port", 6379),
                cfg.getInt("timeout", 120000)) ;

        return jedis;
    }
    public void run() {
        while (running()) {
            try {
                Profiler prof = new Profiler();
                Jedis jedis = getConnection();
                jedis.ping();
                prof.checkPoint("PING");
                jedis.quit();
                getLog().info("PING", prof);
            } catch (Exception e) {
                getLog().warn(e.getMessage());
            }
            ISOUtil.sleep(cfg.getLong("ping", 60000L));
        }
    }
}
