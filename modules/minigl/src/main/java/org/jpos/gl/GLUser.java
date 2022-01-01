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

package org.jpos.gl;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import org.jdom2.Element;
import org.jdom2.Comment;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MiniGL user 
 *
 * A User object is required in order to create a GLSesssion.
 *
 * MiniGL does not take care of user authentication, that's something
 * that has to be handled by the caller (i.e. by using JAAS). 
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 * @see GLSession
 */
public class GLUser {
    private String nick;
    private String name;
    private Set    perms;
    private long id;      // the Hibernate identifier
	
    public GLUser() {
        super();
        perms = new LinkedHashSet ();
    }
    /**
     * Constructs an User object out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @param elem 
     */
    public GLUser (Element elem) {
        this();
        fromXML (elem);
    }
    /**
     * @return user's full name (informational only)
     */
    public String getName() {
        return name;
    }
    /**
     * @param name users's full name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return user's nick name
     */
    public String getNick() {
        return nick;
    }
    /**
     * @param nick users's nick name
     */
    public void setNick(String nick) {
        this.nick = nick;
    }
    /**
     * @return internal id
     */
    public long getId() {
        return id;
    }
    /**
     * @param id internal id
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * @return Set of permissions
     */
    public Set getPermissions () {
        return perms;
    }
    /**
     * @return true if user has a given permission
     */
    public boolean hasPermission (GLPermission perm) {
        return perms.contains (perm);
    }
    /**
     * Verifies user's permission in a given journal.
     * @param action name
     * @param j journal
     * @return true if user has permission to perform given action.
     * @see GLPermission
     * @see Journal
     */
    public boolean hasPermission (String action, Journal j) {
        Iterator iter = getPermissions().iterator();
        while (iter.hasNext()) {
            GLPermission p = (GLPermission) iter.next();
            Journal pj = p.getJournal();
            if (action.equals (p.getName()) &&
                    (pj == null || (pj.getId() == j.getId())))
            {
                return true;
            }
        }
        return false;
    }
    /**
     * @param perms Set of permissions
     */
    public void setPermissions (Set perms) {
        this.perms = perms;
    }
    /**
     * Grant user a given permission
     * @param perm the permission
     */
    public void grant (GLPermission perm) {
        if (!perms.contains (perm))
            perms.add (perm);
    }
    /**
     * Grant user a given permission
     * @param permName the permission
     */
    public void grant (String permName) {
        grant (new GLPermission (permName));
    }
    /**
     * Revoke permission from user 
     * @param permName the permission
     */
    public void revoke (String permName) {
        Iterator iter = perms.iterator();
        GLPermission toRemove = null;
        while (iter.hasNext()) {
            GLPermission p = (GLPermission) iter.next();
            if (permName.equals (p.getName())) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null)
            perms.remove(toRemove);
    }
    /**
     * Revoke all permissions
     */
    public void revokeAll () {
        perms.clear ();
    }
    /**
     * Parses a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public void fromXML (Element elem) {
        setNick (elem.getChildTextTrim ("nick"));
        setName (elem.getChildTextTrim ("name"));
    }
    /**
     * Creates a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public Element toXML () {
        Element e = new Element ("user");
        e.addContent (new Comment ("id " +Long.toString (getId())));
        e.addContent (new Element ("nick").setText (getNick()));
        e.addContent (new Element ("name").setText (getName()));
        Iterator iter = getPermissions().iterator();
        while (iter.hasNext()) {
            GLPermission p = (GLPermission) iter.next();
            if (p.getJournal() == null)
                e.addContent (new Element ("grant").setText (p.getName()));
        }
        return e;
    }
    public boolean equals(Object other) {
        if ( !(other instanceof GLUser) ) return false;
        GLUser castOther = (GLUser) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("name", getName())
            .toString();
    }
}

