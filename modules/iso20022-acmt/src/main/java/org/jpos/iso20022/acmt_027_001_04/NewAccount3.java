/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
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

package org.jpos.iso20022.acmt_027_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewAccount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NewAccount3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CashAccount41"/>
 *         <element name="AcctPty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}IndividualPerson36" maxOccurs="unbounded"/>
 *         <element name="Org" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Organisation35" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewAccount3", propOrder = {
    "acct",
    "acctPty",
    "org"
})
public class NewAccount3 {

    @XmlElement(name = "Acct", required = true)
    protected CashAccount41 acct;
    @XmlElement(name = "AcctPty", required = true)
    protected List<IndividualPerson36> acctPty;
    @XmlElement(name = "Org")
    protected Organisation35 org;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public void setAcct(CashAccount41 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the acctPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson36 }
     * 
     * 
     * @return
     *     The value of the acctPty property.
     */
    public List<IndividualPerson36> getAcctPty() {
        if (acctPty == null) {
            acctPty = new ArrayList<>();
        }
        return this.acctPty;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation35 }
     *     
     */
    public Organisation35 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation35 }
     *     
     */
    public void setOrg(Organisation35 value) {
        this.org = value;
    }

}
