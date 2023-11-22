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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount149 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount149">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PartyIdentification117Choice"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AlternatePartyIdentification8" minOccurs="0"/>
 *         <element name="Sd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ClearingSide1Code" minOccurs="0"/>
 *         <element name="ClrAcct" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SecuritiesAccount20" minOccurs="0"/>
 *         <element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PartyTextInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount149", propOrder = {
    "id",
    "altrnId",
    "sd",
    "clrAcct",
    "prcgId",
    "addtlInf"
})
public class PartyIdentificationAndAccount149 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification117Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification8 altrnId;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected ClearingSide1Code sd;
    @XmlElement(name = "ClrAcct")
    protected SecuritiesAccount20 clrAcct;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation1 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification117Choice }
     *     
     */
    public PartyIdentification117Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification117Choice }
     *     
     */
    public void setId(PartyIdentification117Choice value) {
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
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSide1Code }
     *     
     */
    public ClearingSide1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSide1Code }
     *     
     */
    public void setSd(ClearingSide1Code value) {
        this.sd = value;
    }

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount20 }
     *     
     */
    public SecuritiesAccount20 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount20 }
     *     
     */
    public void setClrAcct(SecuritiesAccount20 value) {
        this.clrAcct = value;
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
