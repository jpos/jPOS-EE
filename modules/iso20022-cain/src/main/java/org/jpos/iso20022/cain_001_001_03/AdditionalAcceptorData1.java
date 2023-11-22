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

package org.jpos.iso20022.cain_001_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalAcceptorData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalAcceptorData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTxRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="TaxRegnId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="CorpTaxId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="CorpTaxIdTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}CorporateTaxType1Code" minOccurs="0"/>
 *         <element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}AdditionalIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Chrtcs" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}AdditionalCharacteristics1" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAcceptorData1", propOrder = {
    "addtlTxRefNb",
    "taxRegnId",
    "corpTaxId",
    "corpTaxIdTp",
    "addtlId",
    "chrtcs",
    "addtlInf"
})
public class AdditionalAcceptorData1 {

    @XmlElement(name = "AddtlTxRefNb")
    protected String addtlTxRefNb;
    @XmlElement(name = "TaxRegnId")
    protected String taxRegnId;
    @XmlElement(name = "CorpTaxId")
    protected String corpTaxId;
    @XmlElement(name = "CorpTaxIdTp")
    @XmlSchemaType(name = "string")
    protected CorporateTaxType1Code corpTaxIdTp;
    @XmlElement(name = "AddtlId")
    protected List<AdditionalIdentification1> addtlId;
    @XmlElement(name = "Chrtcs")
    protected AdditionalCharacteristics1 chrtcs;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the addtlTxRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxRefNb() {
        return addtlTxRefNb;
    }

    /**
     * Sets the value of the addtlTxRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTxRefNb(String value) {
        this.addtlTxRefNb = value;
    }

    /**
     * Gets the value of the taxRegnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegnId() {
        return taxRegnId;
    }

    /**
     * Sets the value of the taxRegnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegnId(String value) {
        this.taxRegnId = value;
    }

    /**
     * Gets the value of the corpTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpTaxId() {
        return corpTaxId;
    }

    /**
     * Sets the value of the corpTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpTaxId(String value) {
        this.corpTaxId = value;
    }

    /**
     * Gets the value of the corpTaxIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateTaxType1Code }
     *     
     */
    public CorporateTaxType1Code getCorpTaxIdTp() {
        return corpTaxIdTp;
    }

    /**
     * Sets the value of the corpTaxIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateTaxType1Code }
     *     
     */
    public void setCorpTaxIdTp(CorporateTaxType1Code value) {
        this.corpTaxIdTp = value;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalIdentification1 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<AdditionalIdentification1> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
        }
        return this.addtlId;
    }

    /**
     * Gets the value of the chrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCharacteristics1 }
     *     
     */
    public AdditionalCharacteristics1 getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCharacteristics1 }
     *     
     */
    public void setChrtcs(AdditionalCharacteristics1 value) {
        this.chrtcs = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
