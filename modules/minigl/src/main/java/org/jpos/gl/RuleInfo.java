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

import java.text.ParseException;
import java.util.StringTokenizer;
import org.jdom2.Element;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Store information about a {@link JournalRule} implementation.
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 * @see JournalRule
 */
public class RuleInfo implements java.io.Serializable {
    private long id;
    private String description;
    private String clazz;
    private String param;
    private Journal journal;
    private Account account;
    private String layers;

    public RuleInfo() {
        super();
    }
    /**
     * Constructs a RuleInfo object out of a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     * @param elem 
     */
    public RuleInfo (Element elem) throws ParseException {
        fromXML (elem);
    }
    /**
     * @return internal ID
     */
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * @param description rule description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return implementation class name
     */
    public String getClazz() {
        return this.clazz;
    }
    /**
     * @param clazz implemenation class name
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * Handback parameter.
     * @return handback parameter
     */
    public String getParam () {
        return param;
    }
    /**
     * Handback parameter.
     * @param param handback parameter
     */
    public void setParam (String param) {
        this.param = param;
    }
    public void setLayers (String layers) {
        this.layers = layers;
    }
    public String getLayers () {
        return layers;
    }
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .append("layers", getLayers())
            .append("param", getParam())
            .toString();
    }
    /**
     * @return Journal associated with this rule
     */
    public Journal getJournal() {
        return journal;
    }
    /**
     * @param journal associate this rule with a Journal
     */
    public void setJournal (Journal journal) {
        this.journal = journal;
    }
    /**
     * @return Account associated with this rule
     */
    public Account getAccount() {
        return account;
    }
    /**
     * @param account associate this rule with an Account
     */
    public void setAccount (Account account) {
        this.account = account;
    }
    public boolean equals(Object other) {
        if ( !(other instanceof RuleInfo) ) return false;
        RuleInfo castOther = (RuleInfo) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }
    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
    public short[] getLayerArray() {
        if (layers == null)
            return new short[] { 0 };
        StringTokenizer st = new StringTokenizer (layers, ", ");
        short[] sa = new short[st.countTokens()];
        for (int i=0; st.hasMoreTokens(); i++) {
            sa[i] = Short.parseShort (st.nextToken());
        }
        return sa;
    }

    /**
     * Parses a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public void fromXML (Element elem) throws ParseException {
        setClazz (elem.getAttributeValue ("clazz"));
        setDescription (elem.getText().trim());
        setLayers (elem.getChildTextTrim ("layers"));
        setParam (elem.getChildTextTrim ("param"));
    }
    /**
     * Creates a JDOM Element as defined in
     * <a href="http://jpos.org/minigl.dtd">minigl.dtd</a>
     */
    public Element toXML () {
        Element e = new Element ("rule");
        e.setAttribute ("clazz", getClazz());
        e.setText (getDescription());
        if (layers != null) {
            Element p = new Element ("layers");
            p.setText (layers);
            e.addContent (p);
        }
        if (param != null) {
            Element p = new Element ("param");
            p.setText (param);
            e.addContent (p);
        }
        if (account != null) {
            e.setAttribute ("account", account.getCode());
        }
        return e;
    }
}

