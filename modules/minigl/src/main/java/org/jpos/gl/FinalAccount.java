/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2011 Alejandro P. Revilla
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
import java.math.BigDecimal;
import java.text.ParseException;
import org.jdom.Element;

/**
 * Final (leaf) Account.
 * 
 * @see GLEntry
 * @see Account
 * @see CompositeAccount
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class FinalAccount extends Account {
    public FinalAccount () {
        super ();
    }
    public FinalAccount (Element elem, CompositeAccount parent) throws ParseException {
        super ();
        setParent (parent);
        fromXML (elem);
    }
    public void setChildren (Set children) 
        throws IllegalArgumentException
    {
        throw new IllegalArgumentException (
            "Can't setChildren on FinalAccount"
        );
    }
    public Set getChildren () {
        return null;
    }
    public Element toXML () {
        Element elem = super.toXML (new Element ("account"));
        return elem;
    }
}

