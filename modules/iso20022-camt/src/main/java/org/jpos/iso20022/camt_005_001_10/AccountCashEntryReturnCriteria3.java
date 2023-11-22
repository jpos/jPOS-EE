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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCashEntryReturnCriteria3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountCashEntryReturnCriteria3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtryRefInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctTpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="NtryAmtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctCcyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="NtryStsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="NtryDtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctSvcrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctOwnrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCashEntryReturnCriteria3", propOrder = {
    "ntryRefInd",
    "acctTpInd",
    "ntryAmtInd",
    "acctCcyInd",
    "ntryStsInd",
    "ntryDtInd",
    "acctSvcrInd",
    "acctOwnrInd"
})
public class AccountCashEntryReturnCriteria3 {

    @XmlElement(name = "NtryRefInd")
    protected Boolean ntryRefInd;
    @XmlElement(name = "AcctTpInd")
    protected Boolean acctTpInd;
    @XmlElement(name = "NtryAmtInd")
    protected Boolean ntryAmtInd;
    @XmlElement(name = "AcctCcyInd")
    protected Boolean acctCcyInd;
    @XmlElement(name = "NtryStsInd")
    protected Boolean ntryStsInd;
    @XmlElement(name = "NtryDtInd")
    protected Boolean ntryDtInd;
    @XmlElement(name = "AcctSvcrInd")
    protected Boolean acctSvcrInd;
    @XmlElement(name = "AcctOwnrInd")
    protected Boolean acctOwnrInd;

    /**
     * Gets the value of the ntryRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryRefInd() {
        return ntryRefInd;
    }

    /**
     * Sets the value of the ntryRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtryRefInd(Boolean value) {
        this.ntryRefInd = value;
    }

    /**
     * Gets the value of the acctTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctTpInd() {
        return acctTpInd;
    }

    /**
     * Sets the value of the acctTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctTpInd(Boolean value) {
        this.acctTpInd = value;
    }

    /**
     * Gets the value of the ntryAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryAmtInd() {
        return ntryAmtInd;
    }

    /**
     * Sets the value of the ntryAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtryAmtInd(Boolean value) {
        this.ntryAmtInd = value;
    }

    /**
     * Gets the value of the acctCcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctCcyInd() {
        return acctCcyInd;
    }

    /**
     * Sets the value of the acctCcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctCcyInd(Boolean value) {
        this.acctCcyInd = value;
    }

    /**
     * Gets the value of the ntryStsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryStsInd() {
        return ntryStsInd;
    }

    /**
     * Sets the value of the ntryStsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtryStsInd(Boolean value) {
        this.ntryStsInd = value;
    }

    /**
     * Gets the value of the ntryDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryDtInd() {
        return ntryDtInd;
    }

    /**
     * Sets the value of the ntryDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtryDtInd(Boolean value) {
        this.ntryDtInd = value;
    }

    /**
     * Gets the value of the acctSvcrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctSvcrInd() {
        return acctSvcrInd;
    }

    /**
     * Sets the value of the acctSvcrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctSvcrInd(Boolean value) {
        this.acctSvcrInd = value;
    }

    /**
     * Gets the value of the acctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctOwnrInd() {
        return acctOwnrInd;
    }

    /**
     * Sets the value of the acctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctOwnrInd(Boolean value) {
        this.acctOwnrInd = value;
    }

}
