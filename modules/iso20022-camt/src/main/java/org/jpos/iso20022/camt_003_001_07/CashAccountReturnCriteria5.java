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

package org.jpos.iso20022.camt_003_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountReturnCriteria5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccountReturnCriteria5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="CcyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="TpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="MulLmtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="MulBalRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}CashBalanceReturnCriteria2" minOccurs="0"/>
 *         <element name="BilLmtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="BilBalRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}CashBalanceReturnCriteria2" minOccurs="0"/>
 *         <element name="StgOrdrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctOwnrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *         <element name="AcctSvcrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.003.001.07}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountReturnCriteria5", propOrder = {
    "nmInd",
    "ccyInd",
    "tpInd",
    "mulLmtInd",
    "mulBalRtrCrit",
    "bilLmtInd",
    "bilBalRtrCrit",
    "stgOrdrInd",
    "acctOwnrInd",
    "acctSvcrInd"
})
public class CashAccountReturnCriteria5 {

    @XmlElement(name = "NmInd")
    protected Boolean nmInd;
    @XmlElement(name = "CcyInd")
    protected Boolean ccyInd;
    @XmlElement(name = "TpInd")
    protected Boolean tpInd;
    @XmlElement(name = "MulLmtInd")
    protected Boolean mulLmtInd;
    @XmlElement(name = "MulBalRtrCrit")
    protected CashBalanceReturnCriteria2 mulBalRtrCrit;
    @XmlElement(name = "BilLmtInd")
    protected Boolean bilLmtInd;
    @XmlElement(name = "BilBalRtrCrit")
    protected CashBalanceReturnCriteria2 bilBalRtrCrit;
    @XmlElement(name = "StgOrdrInd")
    protected Boolean stgOrdrInd;
    @XmlElement(name = "AcctOwnrInd")
    protected Boolean acctOwnrInd;
    @XmlElement(name = "AcctSvcrInd")
    protected Boolean acctSvcrInd;

    /**
     * Gets the value of the nmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNmInd() {
        return nmInd;
    }

    /**
     * Sets the value of the nmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNmInd(Boolean value) {
        this.nmInd = value;
    }

    /**
     * Gets the value of the ccyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcyInd() {
        return ccyInd;
    }

    /**
     * Sets the value of the ccyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcyInd(Boolean value) {
        this.ccyInd = value;
    }

    /**
     * Gets the value of the tpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTpInd(Boolean value) {
        this.tpInd = value;
    }

    /**
     * Gets the value of the mulLmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMulLmtInd() {
        return mulLmtInd;
    }

    /**
     * Sets the value of the mulLmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMulLmtInd(Boolean value) {
        this.mulLmtInd = value;
    }

    /**
     * Gets the value of the mulBalRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CashBalanceReturnCriteria2 }
     *     
     */
    public CashBalanceReturnCriteria2 getMulBalRtrCrit() {
        return mulBalRtrCrit;
    }

    /**
     * Sets the value of the mulBalRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBalanceReturnCriteria2 }
     *     
     */
    public void setMulBalRtrCrit(CashBalanceReturnCriteria2 value) {
        this.mulBalRtrCrit = value;
    }

    /**
     * Gets the value of the bilLmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBilLmtInd() {
        return bilLmtInd;
    }

    /**
     * Sets the value of the bilLmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBilLmtInd(Boolean value) {
        this.bilLmtInd = value;
    }

    /**
     * Gets the value of the bilBalRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CashBalanceReturnCriteria2 }
     *     
     */
    public CashBalanceReturnCriteria2 getBilBalRtrCrit() {
        return bilBalRtrCrit;
    }

    /**
     * Sets the value of the bilBalRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBalanceReturnCriteria2 }
     *     
     */
    public void setBilBalRtrCrit(CashBalanceReturnCriteria2 value) {
        this.bilBalRtrCrit = value;
    }

    /**
     * Gets the value of the stgOrdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgOrdrInd() {
        return stgOrdrInd;
    }

    /**
     * Sets the value of the stgOrdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStgOrdrInd(Boolean value) {
        this.stgOrdrInd = value;
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

}
