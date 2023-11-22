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

package org.jpos.iso20022.colr_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount201 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount201">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentification240Choice"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}AlternatePartyIdentification8" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Max35Text" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Max140Text" minOccurs="0"/>
 *         <element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyTextInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount201", propOrder = {
    "id",
    "altrnId",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "prcgId",
    "addtlInf"
})
public class PartyIdentificationAndAccount201 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification240Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification8 altrnId;
    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected String blckChainAdrOrWllt;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation1 addtlInf;

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
     *     {@link PartyTextInformation1 }
     *     
     */
    public PartyTextInformation1 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation1 }
     *     
     */
    public void setAddtlInf(PartyTextInformation1 value) {
        this.addtlInf = value;
    }

}
