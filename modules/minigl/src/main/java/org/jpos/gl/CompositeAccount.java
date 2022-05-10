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
import java.util.TreeSet;
import java.util.Iterator;
import java.text.ParseException;
import org.jdom2.Element;

/**
 * Composite Account 
 * 
 * @see GLEntry
 * @see Account
 * @see FinalAccount
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class CompositeAccount extends Account {
    Set children;
    public CompositeAccount () {
        super ();
    }
    public CompositeAccount (Element elem)
        throws ParseException 
    {
        super ();
        setParent (parent);
        fromXML (elem);
    }
    public CompositeAccount (Element elem, CompositeAccount parent) 
        throws ParseException 
    {
        super ();
        setParent (parent);
        fromXML (elem);
    }
    public void setChildren (Set children) {
        this.children = children;
    }
    public Set getChildren () {
        if (children == null)
            children = new TreeSet();
        return children;
    }
    public Element toXML () {
        String tagName = getParent() == null ? 
            "chart-of-accounts" : "composite-account";
        Element elem = super.toXML (new Element (tagName));
        Iterator iter = getChildren().iterator();
        while (iter.hasNext()) {
            Account acct = (Account) iter.next();
            elem.addContent (acct.toXML ());
        }
        return elem;
    }
}
