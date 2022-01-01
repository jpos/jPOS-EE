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

import java.math.BigDecimal;
import java.text.ParseException;
import org.jdom2.Element;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jpos.util.Tags;


/**
 * GLEntry.
 * 
 * Represents a MiniGL Transaction Entry.
 *
 * @see GLTransaction
 * @see Account
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class GLEntry {
    private long id;
    private String detail;

    private Tags tags;
    private boolean credit;
    private short layer;
    private BigDecimal amount;
    private FinalAccount account;
    private GLTransaction transaction;
    private BigDecimal balance; // non persistent, view helper

    public GLEntry () {
        super();
    }

    /**
     * Constructs a GLEntry out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @param elem 
     */
    public GLEntry (Element elem) throws ParseException {
        super();
        fromXML (elem);
    }
    /**
     * GLEntry id.
     *
     * @return internal id
     */
    public long getId() {
        return id;
    }
    /**
     * GLEntry id.
     * 
     * @param id internal id.
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * Account.
     * @param account a final account
     */
    public void setAccount (FinalAccount account) {
        this.account = account;
    }
    /**
     * Account.
     * @return final account associated with GLEntry
     */
    public FinalAccount getAccount () {
        return account;
    }
    /**
     * Transaction.
     * @param transaction transaction associated with this GLEntry.
     */
    public void setTransaction (GLTransaction transaction) {
        this.transaction = transaction;
    }
    /**
     * Transaction.
     * @return transaction associated with this GLEntry.
     */
    public GLTransaction getTransaction () {
        return transaction;
    }
    /**
     * Optional GLEntry Detail.
     *
     * Although GLTransaction has a detail, MiniGL support additional
     * detail information at GLEntry level.
     *
     * @param detail optional entry level detail
     */
    public void setDetail (String detail) {
        this.detail = detail;
    }
    /**
     * Optional GLEntry Detail.
     *
     * Although GLTransaction has a detail, MiniGL support additional
     * detail information at GLEntry level.
     *
     * @return entry level detail (may be null)
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
     * Credit.
     * calling setCredit(true) automatically sets <code>debit</code> to false.
     * @param credit true if this GLEntry is a credit.
     */
    public void setCredit (boolean credit) {
        this.credit = credit;
    }
    /**
     * Debit.
     * calling setDebit(true) automatically sets <code>credit</code> to false.
     * @param debit true if this GLEntry is a credit.
     */
    public void setDebit (boolean debit) {
        this.credit = !debit;
    }
    /**
     * @return true if this entry is a credit.
     */
    public boolean isCredit () {
        return credit;
    }
    /**
     * @return true if this entry is a debit.
     */
    public boolean isDebit () {
        return !credit;
    }
    /**
     * Increase value.
     *
     * @return true if this entry increases the balance of its account.
     */
    public boolean isIncrease() {
        return 
            (isDebit() && account.isDebit()) ||
            (isCredit() && account.isCredit());
    }
    /**
     * Decrease value.
     *
     * @return true if this entry decreases the balance of its account.
     */
    public boolean isDecrease () {
        return !isIncrease();
    }
    /**
     * Amount.
     * @param amount the amount.
     */
    public void setAmount (BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Amount.
     * @return entry's amount.
     */
    public BigDecimal getAmount () {
        return amount;
    }
    /** 
     * Impact on balance.
     *
     * @return either +amount or -amount based on isIncrease/isDecrease.
     */
    public BigDecimal getImpact () {
        return isIncrease() ? amount : amount.negate();
    }
    public void setLayer (short layer) {
        this.layer = layer;
    }
    public short getLayer() {
        return layer;
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * Parses a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public void fromXML (Element elem) throws ParseException {
        setDetail (elem.getChildTextTrim ("detail"));
        setTags   (new Tags(elem.getChildTextTrim ("tags")));
        setCredit ("credit".equals (elem.getAttributeValue("type")));
        setLayer(toShort(elem.getAttributeValue("layer")));
        setAmount(new BigDecimal (elem.getChild ("amount").getText()));
    }
    /**
     * Creates a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public Element toXML (boolean deep) {
        Element elem = new Element ("entry");
        if (getDetail() != null) {
            Element detail = new Element ("detail").setText (getDetail());
            elem.addContent (detail);
        }
        if (getTags () != null) {
            Element tags = new Element ("tags").setText (getTags().toString());
            elem.addContent (tags);
        }
        elem.setAttribute ("account", getAccount().getCode());
        elem.setAttribute ("type", isCredit() ? "credit" : "debit");
        if (layer != 0)
            elem.setAttribute ("layer", Integer.toString(layer));
        Element amount = new Element ("amount");
        amount.setText (getAmount().toString());
        elem.addContent (amount);
        return elem;
    }

    /**
     * @param tag to add
     * @return this
     */
    public GLEntry addTag (String tag) {
        if (tags == null)
            tags = new Tags();
        tags.add(tag);
        return this;
    }
    public boolean hasTag (String tag) {
        return tags != null && tags.contains(tag);
    }
    public boolean equals(Object other) {
        if ( !(other instanceof GLEntry) ) return false;
        GLEntry castOther = (GLEntry) other;
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
        for (short l : layers) {
            if (l == getLayer())
                return true;
        }
        return false;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("detail", getDetail())
            .append("account", getAccount())
            .append("tags", getTags())
            .toString();
    }
    private short toShort (String s) {
        return s != null ? Short.parseShort (s) : 0;
    }
}

