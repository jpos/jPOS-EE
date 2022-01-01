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

import java.util.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jdom2.Element;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jpos.ee.Cloneable;
import org.jpos.util.Tags;

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
public class GLTransaction extends Cloneable {
    private long id;
    private Date timestamp;
    private Date postDate;
    private String detail;
    private Tags tags;
    private Journal journal;
    List<GLEntry> entries;

    public GLTransaction () {
        super();
    }
    public GLTransaction (String detail) {
        super ();
        setDetail(detail);
    }
    /**
     * Constructs a GLTransaction out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @param elem {@code '<entry>...</entry>}' element.
     */
    public GLTransaction (Element elem) throws ParseException {
        super();
        fromXML(elem);
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
    public void setTags (Tags tags) {
        this.tags = tags;
    }
    /**
     * Tags.
     * @return transaction tags
     */
    public Tags getTags () {
        return tags;
    }

    /**
     * @param tag to add
     * @return this
     */
    public GLTransaction addTag (String tag) {
        getTags().add(tag);
        return this;
    }

    /**
     * Entries.
     * @param entries transaction entries
     */
    public void setEntries (List<GLEntry> entries) {
        this.entries = entries;
    }
    /**
     * Entries.
     * @return transaction entries
     */
    public List<GLEntry> getEntries () {
        if (entries == null)
            entries = new ArrayList<>();
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
        GLEntry entry = isCredit ? new GLCredit() : new GLDebit();
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
        return createReverse(false);
    }

    /**
     *
     * Create a reverse transaction based on this one
     *
     * @param keepEntryTags if true entries tags are copied to the reversal entries
     * @return a reversal transaction
     */
    public GLTransaction createReverse(boolean keepEntryTags) {
        GLTransaction glt = new GLTransaction (negate(getDetail()));
        glt.setJournal (getJournal());
        for (GLEntry e : getEntries()) {
            GLEntry reversalEntry = glt.createGLEntry(
              e.getAccount(),
              negate(e.getAmount()),
              e.getDetail(),
              e.isCredit(),
              e.getLayer()
            );
            if (keepEntryTags) reversalEntry.setTags(e.getTags());
        }
        return glt;
    }

        /**
     *
     * Create a reverse transaction based on this one
     *
     * @param keepEntryTags if true entries tags are copied to the reversal entries
     * @param layers entries with layer <code>layer</code> are selected
     * @return a reversal transaction
     */
    public GLTransaction createReverse(boolean keepEntryTags, short... layers) {
        GLTransaction glt = new GLTransaction ("(" + getDetail() + ")");
        glt.setJournal (getJournal());
        for (GLEntry e : getEntries()) {
            if (ArrayUtils.contains(layers,e.getLayer())) {
                GLEntry reversalEntry = glt.createGLEntry(
                  e.getAccount(),
                  negate(e.getAmount()),
                  e.getDetail(),
                  e.isCredit(),
                  e.getLayer()
                );
                if (keepEntryTags) reversalEntry.setTags(e.getTags());
            }
        }
        return glt;
    }



    /**
     *
     * Create a reverse transaction based on this one
     *
     * @param withTags entries with any tag in <code>withTags</code> are selected (can be null)
     * @param withoutTags entries with any tag in <code>withoutTags</code> are discarded (can be null)
     *
     * @return a reversal transaction
     */
    public GLTransaction createReverse(Tags withTags, Tags withoutTags) {
        return createReverse(withTags, withoutTags, false);
    }

    /**
     *
     * Create a reverse transaction based on this one
     *
     * @param withTags entries with any tag in <code>withTags</code> are selected (can be null)
     * @param withoutTags entries with any tag in <code>withoutTags</code> are discarded (can be null)
     *
     * @param keepEntryTags if true, reverse entries have the same tags as the original ones
     * @return a reversal transaction
     */
    public GLTransaction createReverse(Tags withTags, Tags withoutTags, boolean keepEntryTags) {
        GLTransaction glt = new GLTransaction ("(" + getDetail() + ")");
        glt.setJournal (getJournal());
        for (GLEntry e : getEntries()) {
            Tags tags = e.getTags() != null ? e.getTags() : new Tags();
            if ((withTags == null || tags.containsAll(withTags)) &&
              (withoutTags == null || !tags.containsAny(withoutTags)))
            {
                GLEntry reversalEntry = glt.createGLEntry(
                  e.getAccount(),
                  negate(e.getAmount()),
                  e.getDetail(),
                  e.isCredit(),
                  e.getLayer()
                );
                if (keepEntryTags) reversalEntry.setTags(e.getTags());
            }
        }
        return glt;
    }

    /**
     * Create a simplified transaction based on this one
     */

    public GLTransaction simplify() {
        GLTransaction glt = new GLTransaction(getDetail());
        for (GLEntry e : getEntries()) {
            if (BigDecimal.ZERO.compareTo(e.getAmount()) != 0) {
                GLEntry redundantEntry = getEntries().stream().filter(entry ->
                entry.getAccount().equals(e.getAccount()) &&
                entry.getAmount().compareTo(e.getAmount()) == 0 &&
                entry.getLayer() == e.getLayer() &&
                (e.isCredit() ^ entry.isCredit())).findAny().orElse(null);
                if (redundantEntry == null) {
                    glt.createGLEntry(e.getAccount(), e.getAmount(), e.getDetail(), e.isCredit(), e.getLayer());
                    glt.setTags(e.getTags());
                }
            }
        }
        return glt;
    }

    /**
     * Parses a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public void fromXML (Element elem) throws ParseException {
        setDetail (elem.getChildTextTrim ("detail"));
        setTags   (new Tags(elem.getChildTextTrim ("tags")));
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
        if (getId() != 0L)
            elem.setAttribute ("id", Long.toString(getId()));
        Util.setDateTimeAttribute (elem, "date", getTimestamp());
        Util.setDateAttribute (elem, "post-date", getPostDate());

        if (getDetail() != null) {
            Element detail = new Element ("detail").setText (getDetail());
            elem.addContent (detail);
        }
        if (getTags () != null) {
            Element tags = new Element ("tags").setText (getTags().toString());
            elem.addContent (tags);
        }
        if (getJournal() != null)
            elem.setAttribute ("journal", getJournal().getName());

        for (GLEntry entry : getEntries()) {
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
        for (GLEntry e : getEntries()) {
            if (e.hasLayers (layers))
                return true;
        }
        return false;
    }
    public BigDecimal getDebits (short[] layers) {
        BigDecimal debits = GLSession.ZERO;
        for (GLEntry e : getEntries()) {
            if (e.isDebit() && e.hasLayers (layers)) {
                debits = debits.add (e.getAmount());
            }
        }
        return debits;
    }
    public BigDecimal getCredits (short[] layers) {
        BigDecimal credits = GLSession.ZERO;
        for (GLEntry e : getEntries()) {
            if (e.isCredit() && e.hasLayers (layers)) {
                credits = credits.add (e.getAmount());
            }
        }
        return credits;
    }

    public BigDecimal getImpact(Account acct, short[] layers) {
        BigDecimal impact = GLSession.ZERO;
        for (GLEntry e : getEntries()) {
            if (e.getAccount().equals(acct) && e.hasLayers (layers)) {
                impact = impact.add (e.getImpact());
            }
        }
        return impact;
    }
    private BigDecimal negate (BigDecimal bd) {
        return bd != null ? bd.negate() : null;
    }

    private String negate (String s) {
        if (s == null)
            return s;
        else
            return "(" + s + ")";
    }

    @Override
    public GLTransaction clone() throws CloneNotSupportedException {
        GLTransaction glt = (GLTransaction)super.clone();
        glt.setEntries(null);
        for (GLEntry e : getEntries()) {
            glt.createGLEntry(
                    e.getAccount(),
                    e.getAmount(),
                    e.getDetail(),
                    e.isCredit(),
                    e.getLayer()
            );
        }
        return glt;
    }

    /**
     * Handy method to obtain affected layers considering only entries for which all predicates are true
     * @param predicates Predicates that the inputs have to satisfy, if none, then consider all entries
     * @return layers affected by entries of this transaction.
     */
    @SafeVarargs
    public final Set<Short> getAffectedLayers(Predicate<GLEntry>... predicates) {
        Stream<GLEntry> entryStream = getEntries().stream();
        for (Predicate<GLEntry> p : predicates) entryStream = entryStream.filter(p);
        return entryStream.map(GLEntry::getLayer).collect(Collectors.toSet());
    }

    public Set<Short> getAffectedLayers(Collection<Account> accounts) {
        Objects.requireNonNull(accounts);
        return getAffectedLayers(e -> accounts.contains(e.getAccount()));
    }

    public Set<Short> getAffectedLayers(Account ... accounts) {
        return getAffectedLayers(Arrays.asList(accounts));
    }

}

