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

package org.jpos.iso20022.sese_032_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount164 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount164">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}PartyIdentification120Choice"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}LEIIdentifier" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AlternatePartyIdentification7" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="ComssnAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="TaxAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}PartyTextInformation2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount164", propOrder = {
    "id",
    "lei",
    "altrnId",
    "cshAcct",
    "chrgsAcct",
    "comssnAcct",
    "taxAcct",
    "addtlInf"
})
public class PartyIdentificationAndAccount164 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification120Choice id;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification7 altrnId;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccountIdentification5Choice chrgsAcct;
    @XmlElement(name = "ComssnAcct")
    protected CashAccountIdentification5Choice comssnAcct;
    @XmlElement(name = "TaxAcct")
    protected CashAccountIdentification5Choice taxAcct;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation2 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public PartyIdentification120Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public void setId(PartyIdentification120Choice value) {
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
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public AlternatePartyIdentification7 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification7 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setChrgsAcct(CashAccountIdentification5Choice value) {
        this.chrgsAcct = value;
    }

    /**
     * Gets the value of the comssnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getComssnAcct() {
        return comssnAcct;
    }

    /**
     * Sets the value of the comssnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setComssnAcct(CashAccountIdentification5Choice value) {
        this.comssnAcct = value;
    }

    /**
     * Gets the value of the taxAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getTaxAcct() {
        return taxAcct;
    }

    /**
     * Sets the value of the taxAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setTaxAcct(CashAccountIdentification5Choice value) {
        this.taxAcct = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation2 }
     *     
     */
    public PartyTextInformation2 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation2 }
     *     
     */
    public void setAddtlInf(PartyTextInformation2 value) {
        this.addtlInf = value;
    }

}
