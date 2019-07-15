package org.jpos.util;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOUtil;
import org.jpos.jedis.JedisService;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import redis.clients.jedis.Jedis;

@SuppressWarnings("unused")
public class JedisLogListener implements Configurable, LogListener, Runnable {
    String jedisService;
    String jedisQueue;
    Space sp = SpaceFactory.getSpace();
    public static final long BUFFER_TIMEOUT = 300000L;
    public static final long RELAX = 1000L;

    public LogEvent log(LogEvent logEvent) {
        sp.out(jedisQueue, new FrozenLogEvent(logEvent), BUFFER_TIMEOUT);
        return logEvent;
    }
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        jedisService = cfg.get("jedis-service", "jedis-service");
        jedisQueue = cfg.get("jedis-queue", null);
        if (jedisQueue == null)
            throw new ConfigurationException("jedis-queue property not configured");
        if (jedisService == null)
            throw new ConfigurationException("jedis-service property not configured");
        new Thread(this, "JedisLogger:" + jedisService + ":" + jedisQueue).start();
    }
    public void run() {
        for (int i=0;;) {
            try {
                JedisService js = (JedisService) NameRegistrar.getIfExists(jedisService);
                if (js == null) {
                    ISOUtil.sleep(RELAX);
                    if (i++ > 60)
                        throw new NameRegistrar.NotFoundException(jedisService + " not found");
                    continue;
                }
                FrozenLogEvent evt = (FrozenLogEvent) sp.rd(jedisQueue, 5000L);
                if (evt != null) {
                    Jedis jedis = js.getConnection();
                    jedis.rpush(jedisQueue, evt.toString());
                    sp.inp(jedisQueue);
                    jedis.quit();
                }
            } catch (Exception e) {
                Log.getLog("Q2", "jedis-log-listener").error(e);
                ISOUtil.sleep(RELAX); // take it easy on errors
            }
        }
    }
}
