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
import java.util.Date;
import java.util.Iterator;
import org.jdom2.Element;
import org.jdom2.Comment;
import java.text.ParseException;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Journal is the place to post GLTransactions.
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 * @see GLTransaction
 */
public class Journal {
    private long id;
    private Date start, end, lockDate;
    private String name;
    private boolean closed;
    private Account chart;
    private Set permissions;
    private Set layers;

    /**
     * Constructs a journal.
     */
    public Journal () {
        super();
    }
    /**
     * Constructs a Journal out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>.
     * @param elem 
     */
    public Journal (Element elem) throws ParseException {
        super();
        fromXML (elem);
    }
    /**
     * @return internal ID
     */
    public long getId() {
        return id;
    }
    /**
     * @param id intenal ID
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * @return journal name.
     */
    public String getName () {
        return name;
    }
    /**
     * @param name the name.
     */
    public void setName (String name) {
        this.name = name;
    }
    /**
     * A closed journal should not accept transactions
     * @param closed true if this journal is closed.
     * @see org.jpos.gl.rule.CanPost
     */
    public void setClosed (boolean closed) {
        this.closed = closed;
    }
    /**
     * @return true if this journal has a <code>closed</code> indicator
     * @see org.jpos.gl.rule.CanPost
     */
    public boolean isClosed () {
        return closed;
    }
    /**
     * Set the initial date for this journal.
     *
     * Transactions with a postDate less than this start date are
     * rejected by {@link org.jpos.gl.rule.CanPost}.
     * 
     * @param start journal's start date
     */
    public void setStart (Date start) {
        this.start = start;
    }
    /**
     * @return the start date.
     */
    public Date getStart () {
        return start;
    }
    /**
     * Set the end date for this journal.
     *
     * Transactions with a postDate greater than this end date are
     * rejected by {@link org.jpos.gl.rule.CanPost}.
     * 
     * @param end journal's end date
     */
    public void setEnd (Date end) {
        this.end = end;
    }
    /**
     * @return the end date.
     */
    public Date getEnd () {
        return end;
    }
    /**
     * Transactions should not be posted to this journal using
     * a postDate &lt;= the lockDate.
     *
     * @param lockDate the lock date.
     */
    public void setLockDate (Date lockDate) {
        this.lockDate = lockDate;
    }
    /**
     * @return journal lock date (or null if there's no lock date)
     */
    public Date getLockDate() {
        return lockDate;
    }
    /**
     * Journals have a default Chart of Accounts.
     *
     * @param chart a toplevel {@link CompositeAccount}
     */
    public void setChart (Account chart) {
        this.chart = chart;
    }
    /**
     * return the default chart.
     */
    public Account getChart () {
        return chart;
    }
    /**
     * @param layers  associated with this Journal.
     */
    public void setLayers (Set layers) {
        this.layers = layers;
    }
    /**
     * @return permissions associated with this Journal.
     */
    public Set getLayers () {
        return layers;
    }
    /**
     * @param permissions associated with this Journal.
     */
    public void setPermissions (Set permissions) {
        this.permissions = permissions;
    }
    /**
     * @return permissions associated with this Journal.
     */
    public Set getPermissions () {
        return permissions;
    }
    /**
     * populates this Journal out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>.
     * @param elem 
     */
    public void fromXML (Element elem) throws ParseException {
        setStart (
            Util.parseDate (elem.getChildTextTrim ("start"))
        );
        setEnd (
            Util.parseDate (elem.getChildTextTrim ("end"))
        );
        setName (elem.getChildTextTrim ("name"));
        setClosed (
            "closed".equalsIgnoreCase (elem.getChildTextTrim ("status"))
        );
    }
    /**
     * Creates a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public Element toXML () {
        Element elem = new Element ("journal");
        elem.addContent (new Comment("id " + getId()) );
        elem.addContent (new Element("name").setText (getName ()));
        elem.addContent (
            new Element("start").setText (Util.dateToString (getStart()))
        );

        Date d = getEnd ();
        if (d != null)
            elem.addContent (new Element("end").setText (Util.dateToString (d)));

        if (isClosed())
            elem.addContent (new Element ("status").setText ("closed"));

        elem.addContent (new Element ("chart").setText (getChart().getCode()));

        Iterator iter = getLayers().iterator();
        while (iter.hasNext()) {
            Layer l = (Layer) iter.next();
            elem.addContent (l.toXML());
        }

        iter = getPermissions().iterator();
        while (iter.hasNext()) {
            GLPermission p = (GLPermission) iter.next();
            Element e = new Element ("grant").setText (p.getName());
            e.setAttribute ("user", p.getUser().getNick());
            elem.addContent (e);
        }
        return elem;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }
    public boolean equals(Object other) {
        if ( !(other instanceof Journal) ) return false;
        Journal castOther = (Journal) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
}

