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

package org.jpos.iso20022.setr_030_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationPartyDetails15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConfirmationPartyDetails15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}PartyIdentification240Choice"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}SecuritiesAccount35" minOccurs="0"/>
 *         <element name="CshDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}AccountIdentification55Choice" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}AlternatePartyIdentification8" minOccurs="0"/>
 *         <element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}PartyTextInformation5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationPartyDetails15", propOrder = {
    "id",
    "sfkpgAcct",
    "cshDtls",
    "altrnId",
    "prcgId",
    "addtlInf"
})
public class ConfirmationPartyDetails15 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification240Choice id;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount35 sfkpgAcct;
    @XmlElement(name = "CshDtls")
    protected AccountIdentification55Choice cshDtls;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification8 altrnId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation5 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification240Choice }
     *     
     */
    public PartyIdentification240Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification240Choice }
     *     
     */
    public void setId(PartyIdentification240Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount35 }
     *     
     */
    public SecuritiesAccount35 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount35 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount35 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the cshDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification55Choice }
     *     
     */
    public AccountIdentification55Choice getCshDtls() {
        return cshDtls;
    }

    /**
     * Sets the value of the cshDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification55Choice }
     *     
     */
    public void setCshDtls(AccountIdentification55Choice value) {
        this.cshDtls = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public AlternatePartyIdentification8 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification8 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the prcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgId() {
        return prcgId;
    }

    /**
     * Sets the value of the prcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcgId(String value) {
        this.prcgId = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public PartyTextInformation5 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public void setAddtlInf(PartyTextInformation5 value) {
        this.addtlInf = value;
    }

}
