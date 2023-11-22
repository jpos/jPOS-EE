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

package org.jpos.iso20022.seev_026_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccount6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccount6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}SecurityIdentification7"/>
 *         <element name="SctiesAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}Max35Text"/>
 *         <element name="AcctOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}PartyIdentification2Choice"/>
 *         <element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccount6", propOrder = {
    "sctyId",
    "sctiesAcctId",
    "acctOwnrId",
    "sfkpgPlc",
    "regnDtls"
})
public class SecuritiesAccount6 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "SctiesAcctId", required = true)
    protected String sctiesAcctId;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "SfkpgPlc", required = true)
    protected PartyIdentification2Choice sfkpgPlc;
    @XmlElement(name = "RegnDtls")
    protected String regnDtls;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public void setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesAcctId(String value) {
        this.sctiesAcctId = value;
    }

    /**
     * Gets the value of the acctOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnrId() {
        return acctOwnrId;
    }

    /**
     * Sets the value of the acctOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setSfkpgPlc(PartyIdentification2Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnDtls(String value) {
        this.regnDtls = value;
    }

}
