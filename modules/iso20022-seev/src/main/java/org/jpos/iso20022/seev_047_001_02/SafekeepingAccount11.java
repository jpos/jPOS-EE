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

package org.jpos.iso20022.seev_047_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingAccount11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingAccount11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Max35Text"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification195Choice"/>
 *         <element name="ShrhldgBalOnOwnAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}FinancialInstrumentQuantity18Choice"/>
 *         <element name="ShrhldgBalOnClntAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}FinancialInstrumentQuantity18Choice"/>
 *         <element name="TtlShrhldgBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}FinancialInstrumentQuantity18Choice"/>
 *         <element name="AcctSubLvl" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}AccountSubLevel22" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingAccount11", propOrder = {
    "sfkpgAcct",
    "acctSvcr",
    "shrhldgBalOnOwnAcct",
    "shrhldgBalOnClntAcct",
    "ttlShrhldgBal",
    "acctSubLvl"
})
public class SafekeepingAccount11 {

    @XmlElement(name = "SfkpgAcct", required = true)
    protected String sfkpgAcct;
    @XmlElement(name = "AcctSvcr", required = true)
    protected PartyIdentification195Choice acctSvcr;
    @XmlElement(name = "ShrhldgBalOnOwnAcct", required = true)
    protected FinancialInstrumentQuantity18Choice shrhldgBalOnOwnAcct;
    @XmlElement(name = "ShrhldgBalOnClntAcct", required = true)
    protected FinancialInstrumentQuantity18Choice shrhldgBalOnClntAcct;
    @XmlElement(name = "TtlShrhldgBal", required = true)
    protected FinancialInstrumentQuantity18Choice ttlShrhldgBal;
    @XmlElement(name = "AcctSubLvl")
    protected AccountSubLevel22 acctSubLvl;

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification195Choice }
     *     
     */
    public PartyIdentification195Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification195Choice }
     *     
     */
    public void setAcctSvcr(PartyIdentification195Choice value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the shrhldgBalOnOwnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getShrhldgBalOnOwnAcct() {
        return shrhldgBalOnOwnAcct;
    }

    /**
     * Sets the value of the shrhldgBalOnOwnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setShrhldgBalOnOwnAcct(FinancialInstrumentQuantity18Choice value) {
        this.shrhldgBalOnOwnAcct = value;
    }

    /**
     * Gets the value of the shrhldgBalOnClntAcct property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getShrhldgBalOnClntAcct() {
        return shrhldgBalOnClntAcct;
    }

    /**
     * Sets the value of the shrhldgBalOnClntAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setShrhldgBalOnClntAcct(FinancialInstrumentQuantity18Choice value) {
        this.shrhldgBalOnClntAcct = value;
    }

    /**
     * Gets the value of the ttlShrhldgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getTtlShrhldgBal() {
        return ttlShrhldgBal;
    }

    /**
     * Sets the value of the ttlShrhldgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setTtlShrhldgBal(FinancialInstrumentQuantity18Choice value) {
        this.ttlShrhldgBal = value;
    }

    /**
     * Gets the value of the acctSubLvl property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSubLevel22 }
     *     
     */
    public AccountSubLevel22 getAcctSubLvl() {
        return acctSubLvl;
    }

    /**
     * Sets the value of the acctSubLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSubLevel22 }
     *     
     */
    public void setAcctSubLvl(AccountSubLevel22 value) {
        this.acctSubLvl = value;
    }

}
