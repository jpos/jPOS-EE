/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

package org.jpos.space;

import redis.clients.jedis.BinaryJedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.io.*;
import java.util.List;

public class JedisSpace<K,V> implements Space<K,V> {
    JedisPool pool;

    public JedisSpace(String spaceName) {
        pool = new JedisPool(new JedisPoolConfig(), "localhost");
    }

    public void out(K k, V v) {
        byte[] key = k.toString().getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream os = new ObjectOutputStream(baos);
            os.writeObject(v);
        } catch (IOException e) {
            throw new SpaceError (e);
        }
        try (BinaryJedis jedis = pool.getResource()) {
            jedis.rpush(key, baos.toByteArray());
        }
    }
    public V in(Object o) {
        try (BinaryJedis jedis = pool.getResource()) {
            byte[] obj = jedis.blpop(0, o.toString().getBytes()).get(1);
            ByteArrayInputStream bais = new ByteArrayInputStream(obj);
            try {
                ObjectInputStream is = new ObjectInputStream (bais);
                return (V) is.readObject();
            } catch (Exception e) {
                throw new SpaceError (e);
            }
        }
    }
    public V in(Object k, long timeout) {
        try (BinaryJedis jedis = pool.getResource()) {
            List<byte[]> l = jedis.blpop((int) (timeout / 1000), k.toString().getBytes());
            if (l != null) {
                byte[] obj = l.get(1);
                ByteArrayInputStream bais = new ByteArrayInputStream(obj);
                try {
                    ObjectInputStream is = new ObjectInputStream (bais);
                    return (V) is.readObject();
                } catch (Exception e) {
                    throw new SpaceError (e);
                }
            } else {
                return null;
            }
        }
    }
    public V inp(Object o) {
        try (BinaryJedis jedis = pool.getResource()) {
            Template tmpl = null;
            if (o instanceof Template) {
                tmpl = (Template) o;
                o  = tmpl.getKey();
            }
            byte[] obj = jedis.lpop(o.toString().getBytes());
            if (obj != null) {
                ByteArrayInputStream bais = new ByteArrayInputStream(obj);
                try {
                    ObjectInputStream is = new ObjectInputStream(bais);
                    return (V) is.readObject();
                } catch (Exception e) {
                    throw new SpaceError(e);
                }
            } else {
                return null;
            }
        }
    }
    public V rdp(Object o) {
        try (BinaryJedis jedis = pool.getResource()) {
            Template tmpl = null;
            if (o instanceof Template) {
                tmpl = (Template) o;
                o  = tmpl.getKey();
            }
            byte[] obj = jedis.lindex(o.toString().getBytes(), 0);
            if (obj != null) {
                ByteArrayInputStream bais = new ByteArrayInputStream(obj);
                try {
                    ObjectInputStream is = new ObjectInputStream(bais);
                    return (V) is.readObject();
                } catch (Exception e) {
                    throw new SpaceError(e);
                }
            } else {
                return null;
            }
        }
    }

    public void out(K k, V v, long l) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void nrd(K key) {

    }

    public V nrd(K key, long timeout) {
        return null;
    }

    public V rd(Object key) {
        Object obj;
        while ((obj = rdp (key)) == null) {
            try {
                synchronized(this) {
                    this.wait();
                }
            } catch (InterruptedException ignored) { }
        }
        return (V) obj;
    }

    public V rd(Object key, long timeout) {
        Object obj;
        long now = System.currentTimeMillis();
        long end = now + timeout;
        while ((obj = rdp (key)) == null &&
                (now = System.currentTimeMillis()) < end)
        {
            try {
                synchronized(this) {
                    this.wait(end - now);
                }
            } catch (InterruptedException ignored) { }
        }
        return (V) obj;
    }

    public void push(K k, V v) {
        byte[] key = k.toString().getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream os = new ObjectOutputStream(baos);
            os.writeObject(v);
        } catch (IOException e) {
            throw new SpaceError (e);
        }
        try (BinaryJedis jedis = pool.getResource()) {
            jedis.lpush(key, baos.toByteArray());
        }
    }

    public void push(K k, V v, long l) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean existAny(Object[] keys) {
        for (Object key : keys) {
            if (rdp(key) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean existAny(Object[] keys, long timeout) {
        long now = System.currentTimeMillis();
        long end = now + timeout;
        while ((now = System.currentTimeMillis()) < end) {
            if (existAny (keys))
                return true;
            synchronized (this) {
                try {
                    wait (end - now);
                } catch (InterruptedException ignored) { }
            }
        }
        return false;
    }

    public void put(K key, V value) {
        while (inp (key) != null)
            ; // NOPMD
        out (key, value);
    }

    public void put(K key, V value, long timeout) {
        while (inp (key) != null)
            ; // NOPMD
        out (key, value, timeout);
    }
}
