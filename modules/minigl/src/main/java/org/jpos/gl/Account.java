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

import java.util.Date;
import java.util.Set;
import java.io.Serializable;
import java.text.ParseException;
import org.jdom2.Element;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jpos.util.Tags;

/**
 * Base class for Composite and Final accounts.
 * 
 * @see GLEntry
 * @see CompositeAccount
 * @see FinalAccount
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */

public abstract class Account implements Serializable, Comparable, Cloneable {
    private long id;
    /**
     * 0 - type is undefined (used in top level [chart-of=]accounts)
     */
    public static final int UNDEFINED = 0;
    /**
     * 1 - this is a debit type account
     */
    public static final int DEBIT  = 1;
    /**
     * 2 - this is a credit type account
     */
    public static final int CREDIT = 2;

    String code;
    String description;

    Date created;
    Date expiration;
    String currencyCode;
    int type;
    Tags tags;

    CompositeAccount parent, root;

    /**
     * Default constructor.
     */
    public Account () {
        super ();
    }
    /**
     * Internal id.
     * @return internal id
     */
    public long getId() {
        return id;
    }
    /**
     * Internal id.
     * @param id internal Id
     */
    @SuppressWarnings("unused")
    public void setId (long id) {
        this.id = id;
    }
    /**
     * Account creation date.
     * @param created creation date
     */
    public void setCreated (Date created) {
        this.created = created;
    }
    /**
     * Account creation date.
     * @return creation date
     */
    public Date getCreated () {
        return created;
    }
    /**
     * Expiration date.
     * @param expiration expiration date.
     */
    public void setExpiration (Date expiration) {
        this.expiration = expiration;
    }
    /**
     * Expiration date.
     * @return expiration date.
     */
    public Date getExpiration () {
        return expiration;
    }
    /**
     * Account code.
     *
     * We use an account id with no business meaning, so we need
     * an account <code>code</code> 
     *
     * @param code the code.
     */
    public void setCode (String code) {
        this.code = code;
    }

    /**
     * Account code.
     * @return account code.
     */
    public String getCode() {
        return code;
    }
    /**
     * Description.
     * @param description account description.
     */
    public void setDescription (String description) {
        this.description = description;
    }
    /**
     * Description.
     * @return account description.
     */
    public String getDescription () {
        return description;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    /**
     * Parent Account.
     * 
     * @return parent account (null if this account is the toplevel root)
     */
    public CompositeAccount getParent () {
        return parent;
    }
    /**
     * Parent Account.
     * @param parent parent account (null if this account is the toplevel root)
     */
    public void setParent (CompositeAccount parent) {
        this.parent = parent;
    }
    /**
     * Root account.
     * The root account is a top level {@link CompositeAccount}
     * representing a Chart of Accounts.
     * @return root account.
     */
    public CompositeAccount getRoot () {
        return root;
    }
    /**
     * Root account.
     *
     * @param root root account.
     */
    public void setRoot (CompositeAccount root) {
        this.root = root;
    }

    /**
     * Account's children.
     * {@link CompositeAccount} uses this property to store its children.
     * Calling this method on a {@link FinalAccount} raises 
     * an IllegalArgumentException.
     * @param children a list of childrens
     */
    @SuppressWarnings("unused")
    public abstract void setChildren (Set<Account> children);

    /**
     * Account's children.
     * {@link CompositeAccount} uses this property to store its children.
     * Calling this method on a {@link FinalAccount} would return null
     * an IllegalArgumentException.
     * @return children or null.
     */
    public abstract Set<Account> getChildren ();

    /**
     * Creates a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @return Account converted to XML
     */
    public abstract Element toXML ();

    /**
     * Currency Code.
     * @return currency code.
     */
    public String getCurrencyCode () {
        return currencyCode;
    }
    /**
     * Currency Code.
     * @param currencyCode a currency code.
     * @see Currency
     * @throws IllegalArgumentException if currency code doesn't match the parent's one
     */
    public void setCurrencyCode (String currencyCode) 
        throws IllegalArgumentException 
    {
        if (currencyCode != null) {
            // go up until first level, don't process the chart itself
            for (Account p = getParent(); 
                p != null && p.getParent() != null; 
                p = p.getParent()) 
            {
                String pcc = p.getCurrencyCode();
                if (pcc != null && !pcc.equals (currencyCode))
                    throw new IllegalArgumentException (
                        "Illegal currency "+currencyCode);
            }
        }
        this.currencyCode = currencyCode;
    }
    /** 
     * Type.
     * @param type (either DEBIT, CREDIT or CHART)
     */
    public void setType (int type) {
        this.type = type;
    }
    /** 
     * Type.
     * @return type (either DEBIT, CREDIT or CHART)
     */
    public int getType () {
        return type;
    }
    /**
     * @return true if account's type is a debit.
     */
    public boolean isDebit () {
        return (type & DEBIT) == DEBIT;
    }
    /**
     * @return true if account's type is a credit.
     */
    public boolean isCredit () {
        return (type & CREDIT) == CREDIT;
    }
    /**
     * @return true if account's type is chart (neither DEBIT nor CREDIT)
     */
    public boolean isChart () {
        return (type & (DEBIT|CREDIT)) == UNDEFINED;
    }
    public boolean isFinalAccount () {
        return false;
    }
    public boolean isCompositeAccount () {
        return !isFinalAccount();
    }
    /**
     * Account's type
     * @return "debit", "credit" or null.
     */
    public String getTypeAsString() {
        if (isDebit())
            return "debit";
        else if (isCredit())
            return "credit";
        else
            return null;
    }
    public boolean isAncestor(CompositeAccount ancestor) {
        for (Account p = getParent(); p != null; p = p.getParent()) {
            if (p.equals(ancestor))
                return true;
        }
        return false;
    }

    public int getLevel () {
        return getParent() == null ? 0 : getLevel(0);
    }

    public int getLevel (int level) {
        level++;
        if (getParent() == null)
            return level;
        if (getParent().equals(getRoot()))
            return level;
        else
            return getParent().getLevel(level);
    }

    /**
     * Helper method used to create a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     *
     * @param elem the Element to be populated
     * @return populated element
     */
    protected Element toXML (Element elem) {
        elem.setAttribute ("code", getCode ());
        elem.addContent (new Element("description").setText (getDescription()));

        if (getCurrencyCode() != null)
            elem.setAttribute ("currency", getCurrencyCode());

        if (getTags () != null && getTags().size() > 0) {
            Element tags = new Element ("tags").setText (getTags().toString());
            elem.addContent (tags);
        }

        if (isDebit ())
            elem.setAttribute ("type", "debit");
        else if (isCredit())
            elem.setAttribute ("type", "credit");

        Util.setDateAttribute (elem, "created", getCreated());
        return elem;
    }
    /**
     * Parses a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @param elem the element
     * @throws ParseException on XML error
     */
    public void fromXML (Element elem) throws ParseException {
        setCode (elem.getAttributeValue ("code"));
        setDescription (elem.getChildTextTrim ("description"));
        setCreated (Util.parseDate (elem.getAttributeValue ("created")));
        if (getCreated() == null)
            setCreated (new Date());

        setExpiration (
            Util.parseDate (elem.getAttributeValue ("expiration"))
        );
        String cc = elem.getAttributeValue ("currency");
        if (cc != null)
            setCurrencyCode (cc);

        String at = elem.getAttributeValue ("type");
        if (at != null) {
            if ("debit".equals (at))
                setType (DEBIT);
            else if ("credit".equals (at))
                setType (CREDIT);
            else
                throw new IllegalArgumentException ("Invalid type "+at);
        } else {
            setType (UNDEFINED);
        }
        setTags (new Tags(elem.getChildTextTrim ("tags")));
        Account p = getParent();
        if (p != null) {
            int parentType = p.getType();
            if (parentType > 0 && parentType != getType()) {
                throw new IllegalArgumentException (
                    "type '" + getTypeAsString() 
                  + "' doesn't match parent's type '" 
                  + p.getTypeAsString() + "'"
                  + " in account " + getCode()
                );
            }
        }
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("code",getCode())
            .toString();
    }
    public boolean equals(Object other) {
        if ( !(other instanceof Account) ) return false;
        Account castOther = (Account) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    /**
     * @param other account
     * @return true if other has same type as this account
     */
    public boolean equalsType (Account other) {
        return (
            getType() & (CREDIT | DEBIT)) 
        == (other.getType() & (CREDIT | DEBIT));
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
    public int compareTo (Object o) {
        if (o instanceof Account) {
            Account other = (Account) o;
            if (getCode() == null || other.getCode() == null) {
                return getCode() == other.getCode()  ? 0 : 1;
            } else if (getCode() == null) {
                return 1;
            }
            return getCode().compareTo (((Account)o).getCode());
        }
        return 1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

