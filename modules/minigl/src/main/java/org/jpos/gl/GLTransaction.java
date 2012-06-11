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

package org.jpos.gl;

import java.util.Date;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.text.ParseException;
import org.jdom.Element;
import org.jdom.Comment;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * GLTransaction.
 * 
 * Represents a MiniGL Transaction.
 *
 * @see GLEntry
 * @see Journal
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class GLTransaction {
    private long id;
    private Date timestamp;
    private Date postDate;
    private String detail;
    private String tags;
    private List children;
    private Journal journal;
    List entries;

    public GLTransaction () {
        super();
    }
    public GLTransaction (String detail) {
        super ();
        setDetail (detail);
    }
    /**
     * Constructs a GLTransaction out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @param elem 
     */
    public GLTransaction (Element elem) throws ParseException {
        super();
        fromXML (elem);
    }
    /**
     * GLTransaction id.
     *
     * @return internal id
     */
    public long getId() {
        return id;
    }
    /**
     * GLTransaction id.
     * 
     * @param id internal id.
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * Timestamp.
     * @param d transaction timestamp
     */
    public void setTimestamp (Date d) {
        this.timestamp = d;
    }
    /**
     * Timestamp.
     * @return transaction timestamp
     */
    public Date getTimestamp () {
        return timestamp;
    }
    /**
     * Posting date
     * @param d transaction postdate
     */
    public void setPostDate (Date d) {
        this.postDate = d;
    }
    /**
     * @return transaction postdate
     */
    public Date getPostDate () {
        return postDate;
    }
    /**
     * Detail.
     * @param detail transaction detail
     */
    public void setDetail (String detail) {
        this.detail = detail;
    }
    /**
     * Detail.
     * @return transaction detail
     */
    public String getDetail () {
        return detail;
    }
    /**
     * Tags.
     * @param tags transaction tags
     */
    public void setTags (String tags) {
        this.tags = tags;
    }
    /**
     * Tags.
     * @return transaction tags
     */
    public String getTags () {
        return tags;
    }
    /**
     * Entries.
     * @param entries transaction entries
     */
    public void setEntries (List entries) {
        this.entries = entries;
    }
    /**
     * Entries.
     * @return transaction entries
     */
    public List getEntries () {
        if (entries == null)
            entries = new ArrayList ();
        return entries;
    }
    /**
     * Journal.
     *
     * @return journal where this transaction has been posted.
     */
    public Journal getJournal () {
        return journal;
    }
    /**
     * Journal.
     *
     * @param journal journal where this transaction has been posted.
     */
    public void setJournal (Journal journal) {
        this.journal = journal;
    }

    /**
     * Create GLEntry associated with this GLTransaction.
     *
     * Factory helper method.
     *
     * @param acct the account
     * @param amount amount
     * @param detail detail
     * @param isCredit true if credit, false if debit
     * @param layer the layer
     */
    public GLEntry createGLEntry (FinalAccount acct, BigDecimal amount, String detail, boolean isCredit, short layer) 
    {
        GLEntry entry = isCredit ? (GLEntry) new GLCredit() : (GLEntry) new GLDebit();
        entry.setAccount (acct);
        entry.setAmount (amount);
        entry.setDetail (detail);
        entry.setCredit (isCredit);
        entry.setTransaction (this);
        entry.setLayer (layer);
        getEntries().add (entry);
        return entry;
    }
    /**
     * Create a debit GLEntry associated with this GLTransaction.
     *
     * Factory helper method.
     *
     * @param acct the account
     * @param amount amount
     */
    public GLEntry createDebit (FinalAccount acct, BigDecimal amount) 
    {
        return createGLEntry (acct, amount, null, false, (short) 0);
    }
    /**
     * Create a debit GLEntry associated with this GLTransaction.
     *
     * Factory helper method.
     *
     * @param acct the account
     * @param amount amount
     * @param detail detail
     */
    public GLEntry createDebit 
        (FinalAccount acct, BigDecimal amount, String detail)
    {
        return createGLEntry (acct, amount, detail, false, (short) 0);
    }
    /**
     * Create a debit GLEntry associated with this GLTransaction.
     *
     * Factory helper method.
     *
     * @param acct the account
     * @param amount amount
     * @param detail detail
     * @param layer  layer
     */
    public GLEntry createDebit 
        (FinalAccount acct, BigDecimal amount, String detail, short layer) 
    {
        return createGLEntry (acct, amount, detail, false, layer);
    }

    /**
     * Create a credit GLEntry associated with this GLTransaction.
     *
     * Factory helper method.
     *
     * @param acct the account
     * @param amount amount
     */
    public GLEntry createCredit (FinalAccount acct, BigDecimal amount) {
        return createGLEntry (acct, amount, null, true, (short) 0);
    }
    /**
     * Create a credit GLEntry associated with this GLTransaction.
     *
     * Factory helper method.
     *
     * @param acct the account
     * @param amount amount
     * @param detail detail
     */
    public GLEntry createCredit 
        (FinalAccount acct, BigDecimal amount, String detail) 
    {
        return createGLEntry (acct, amount, detail, true, (short) 0);
    }
    /**
     * Create a credit GLEntry associated with this GLTransaction.
     *
     * Factory helper method.
     *
     * @param acct the account
     * @param amount amount
     * @param layer the layer
     * @param detail detail
     */
    public GLEntry createCredit 
        (FinalAccount acct, BigDecimal amount, String detail, short layer) 
    {
        return createGLEntry (acct, amount, detail, true, layer);
    }
    /**
     *
     * Create a reverse transaction based on this one
     *
     * @return a reversal transaction
     */
    public GLTransaction createReverse() {
        GLTransaction glt = new GLTransaction ("(" + getDetail() + ")");
        glt.setJournal (getJournal());
        Iterator iter = getEntries().iterator();
        while (iter.hasNext()) {
            GLEntry e = (GLEntry) iter.next();
            glt.createGLEntry (
                e.getAccount(),
                negate (e.getAmount()),
                e.getDetail(),
                e.isCredit(),
                e.getLayer()
            );
        }
        return glt;
    }
    /**
     * Parses a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public void fromXML (Element elem) throws ParseException {
        setDetail (elem.getChildTextTrim ("detail"));
        setTags   (elem.getChildTextTrim ("tags"));
        setPostDate (
            Util.parseDate (elem.getAttributeValue ("post-date"))
        );
        setTimestamp (
            Util.parseDateTime (elem.getAttributeValue ("date"))
        );
    }
    /**
     * Creates a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public Element toXML (boolean deep) {
        Element elem = new Element ("transaction");
        elem.setAttribute ("id", Long.toString(getId()));
        Util.setDateTimeAttribute (elem, "date", getTimestamp());
        Util.setDateAttribute (elem, "post-date", getPostDate());

        if (getDetail() != null) {
            Element detail = new Element ("detail").setText (getDetail());
            elem.addContent (detail);
        }
        if (getTags () != null) {
            Element tags = new Element ("tags").setText (getDetail());
            elem.addContent (tags);
        }
        elem.setAttribute ("journal", getJournal().getName());

        Iterator iter = getEntries().iterator();
        while (iter.hasNext()) {
            GLEntry entry = (GLEntry) iter.next();
            elem.addContent (entry.toXML (deep));
        }
        return elem;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("detail", getDetail())
            .toString();
    }
    public boolean equals(Object other) {
        if ( !(other instanceof GLTransaction) ) return false;
        GLTransaction castOther = (GLTransaction) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
    public boolean hasLayers (short[] layers) {
        for (GLEntry e : (List<GLEntry>) getEntries()) {
            if (e.hasLayers (layers))
                return true;
        }
        return false;
    }
    public BigDecimal getDebits (short[] layers) {
        BigDecimal debits = GLSession.ZERO;
        for (GLEntry e : (List<GLEntry>) getEntries()) {
            if (e.isDebit() && e.hasLayers (layers)) {
                debits = debits.add (e.getAmount());
            }
        }
        return debits;
    }
    public BigDecimal getCredits (short[] layers) {
        BigDecimal credits = GLSession.ZERO;
        for (GLEntry e : (List<GLEntry>) getEntries()) {
            if (e.isCredit() && e.hasLayers (layers)) {
                credits = credits.add (e.getAmount());
            }
        }
        return credits;
    }
    private BigDecimal negate (BigDecimal bd) {
        return bd != null ? bd.negate() : null;
    }
}

