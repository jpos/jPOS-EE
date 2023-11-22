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

package org.jpos.iso20022.seev_038_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountIdentification59 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountIdentification59">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.038.001.07}Max35Text" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:seev.038.001.07}Max140Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:seev.038.001.07}PartyIdentification127Choice" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:seev.038.001.07}SafekeepingPlaceFormat28Choice" minOccurs="0"/>
 *         <element name="ConfdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.038.001.07}BalanceFormat11Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification59", propOrder = {
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "acctOwnr",
    "sfkpgPlc",
    "confdBal"
})
public class AccountIdentification59 {

    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected String blckChainAdrOrWllt;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification127Choice acctOwnr;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat28Choice sfkpgPlc;
    @XmlElement(name = "ConfdBal", required = true)
    protected BalanceFormat11Choice confdBal;

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
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlckChainAdrOrWllt(String value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public PartyIdentification127Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification127Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public SafekeepingPlaceFormat28Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat28Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the confdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getConfdBal() {
        return confdBal;
    }

    /**
     * Sets the value of the confdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public void setConfdBal(BalanceFormat11Choice value) {
        this.confdBal = value;
    }

}
