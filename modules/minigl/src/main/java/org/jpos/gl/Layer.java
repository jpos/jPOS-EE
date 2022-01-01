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

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.text.ParseException;
import org.jdom2.Element;

/** 
 * Journal level layer information.
*/
public class Layer extends org.jpos.ee.Cloneable implements Serializable, Comparable {
    private short id;
    private String name;
    private org.jpos.gl.Journal journal;

    public Layer(short id, String name, org.jpos.gl.Journal journal) {
        this.id = id;
        this.name = name;
        this.journal = journal;
    }
    public Layer() {
        super();
    }
    /** minimal constructor */
    public Layer(short id, org.jpos.gl.Journal journal) {
        super();
        this.id = id;
        this.journal = journal;
    }
    public Layer (Element elem) throws ParseException {
        super();
        fromXML (elem);
    }
    public short getId() {
        return this.id;
    }
    public void setId(short id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public org.jpos.gl.Journal getJournal() {
        return this.journal;
    }
    public void setJournal(org.jpos.gl.Journal journal) {
        this.journal = journal;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("journal", getJournal())
            .toString();
    }
    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof Layer) ) return false;
        Layer castOther = (Layer) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .append(this.getJournal(), castOther.getJournal())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .append(getJournal())
            .toHashCode();
    }
    public void fromXML (Element elem) throws ParseException {
        setId (Short.parseShort(elem.getAttributeValue ("id")));
        setName (elem.getText().trim());
    }
    public Element toXML () {
        Element e = new Element ("layer").setText(getName());
        e.setAttribute ("id", Short.toString(getId()));
        return e;
    }

    @Override
    public int compareTo(Object o) {
        return Short.compare(getId(), ((Layer)o).getId());
    }
}

