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

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.hibernate.HibernateException;
import javax.servlet.http.Cookie;

@SuppressWarnings("unused")
public class VisitorManager {
    DB db;
    String digest;
    String path;
    int maxAge = 365*24*3600;
    String cookieName = "JPOSEE";

    public VisitorManager (DB db) {
        this.db = db;
    }
    public VisitorManager (DB db, Cookie[] cookies) {
        this(db);
        if (cookies != null)
            init (cookies);
    }
    public VisitorManager (DB db, Cookie[] cookies, String path) {
        this(db);
        this.path = path;
        if (cookies != null)
            init (cookies);
    }
    public VisitorManager (DB db, Cookie[] cookies, String path, String cookieName) {
        this(db);
        this.path = path;
        this.cookieName = cookieName;
        if (cookies != null)
            init (cookies);
    }
    public VisitorManager (DB db, Cookie[] cookies, String path, String cookieName, int maxAge) {
        this(db);
        this.path = path;
        this.cookieName = cookieName;
        this.maxAge = maxAge;
        if (cookies != null)
            init (cookies);
    }
    public Cookie getCookie () {
        Cookie cookie = new Cookie (cookieName, digest);
        if (path != null)
            cookie.setPath ("/");
        if (maxAge != 0)
            cookie.setMaxAge (maxAge);
        return cookie;
    }
    public Visitor getVisitor ()
        throws HibernateException
    {
        Visitor v = (Visitor) db.session().get(Visitor.class, digest);
        if (v != null)
            v.touch();
        return v;
    }
    public Visitor getVisitor (boolean create) 
        throws HibernateException
    {
        Visitor visitor = getVisitor ();
        if (visitor == null && create) {
            visitor = new Visitor();
            visitor.setId (digest);
            visitor.setProps (new HashMap<String,String> ());
            visitor.touch();
            db.session().save (visitor);
        }
        return visitor;
    }
    public void set (Visitor visitor, String prop, String value) 
        throws HibernateException
    {
        visitor.getProps().put (prop, value);
    }
    public void update (Visitor visitor) 
        throws HibernateException
    {
        visitor.setLastUpdate (new Date());
    }
    private void init (Cookie[] cookies) {
        for (Cookie cookie : cookies) {
            if (cookieName.equals(cookie.getName()))
                digest = cookie.getValue();
        }
        if (digest == null)
            digest = UUID.randomUUID().toString();
    }
}
