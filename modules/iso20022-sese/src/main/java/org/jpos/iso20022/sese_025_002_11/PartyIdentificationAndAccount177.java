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

package org.jpos.iso20022.sese_025_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount177 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount177">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}PartyIdentification137Choice"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}LEIIdentifier" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}AlternatePartyIdentification9" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}CashAccountIdentification6Choice" minOccurs="0"/>
 *         <element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}CashAccountIdentification6Choice" minOccurs="0"/>
 *         <element name="ComssnAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}CashAccountIdentification6Choice" minOccurs="0"/>
 *         <element name="TaxAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}CashAccountIdentification6Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.002.11}PartyTextInformation4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount177", propOrder = {
    "id",
    "lei",
    "altrnId",
    "cshAcct",
    "chrgsAcct",
    "comssnAcct",
    "taxAcct",
    "addtlInf"
})
public class PartyIdentificationAndAccount177 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification137Choice id;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification9 altrnId;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccountIdentification6Choice chrgsAcct;
    @XmlElement(name = "ComssnAcct")
    protected CashAccountIdentification6Choice comssnAcct;
    @XmlElement(name = "TaxAcct")
    protected CashAccountIdentification6Choice taxAcct;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation4 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public void setId(PartyIdentification137Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification9 }
     *     
     */
    public AlternatePartyIdentification9 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification9 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification9 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setChrgsAcct(CashAccountIdentification6Choice value) {
        this.chrgsAcct = value;
    }

    /**
     * Gets the value of the comssnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getComssnAcct() {
        return comssnAcct;
    }

    /**
     * Sets the value of the comssnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setComssnAcct(CashAccountIdentification6Choice value) {
        this.comssnAcct = value;
    }

    /**
     * Gets the value of the taxAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getTaxAcct() {
        return taxAcct;
    }

    /**
     * Sets the value of the taxAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setTaxAcct(CashAccountIdentification6Choice value) {
        this.taxAcct = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation4 }
     *     
     */
    public PartyTextInformation4 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation4 }
     *     
     */
    public void setAddtlInf(PartyTextInformation4 value) {
        this.addtlInf = value;
    }

}
