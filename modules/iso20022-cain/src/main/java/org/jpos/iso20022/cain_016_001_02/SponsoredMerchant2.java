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

package org.jpos.iso20022.cain_016_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SponsoredMerchant2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SponsoredMerchant2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}PartyIdentification262"/>
 *         <element name="CmonNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max140Text" minOccurs="0"/>
 *         <element name="LglCorpNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max99Text" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Address2" minOccurs="0"/>
 *         <element name="AddtlAdrInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max256Text" minOccurs="0"/>
 *         <element name="GeogcLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}GeographicPointInDecimalDegrees" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}LocalData5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SponsoredMerchant2", propOrder = {
    "id",
    "cmonNm",
    "lglCorpNm",
    "adr",
    "addtlAdrInf",
    "geogcLctn",
    "addtlData",
    "lclData"
})
public class SponsoredMerchant2 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification262 id;
    @XmlElement(name = "CmonNm")
    protected String cmonNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "AddtlAdrInf")
    protected String addtlAdrInf;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LclData")
    protected LocalData5 lclData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification262 }
     *     
     */
    public PartyIdentification262 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification262 }
     *     
     */
    public void setId(PartyIdentification262 value) {
        this.id = value;
    }

    /**
     * Gets the value of the cmonNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonNm() {
        return cmonNm;
    }

    /**
     * Sets the value of the cmonNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonNm(String value) {
        this.cmonNm = value;
    }

    /**
     * Gets the value of the lglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglCorpNm() {
        return lglCorpNm;
    }

    /**
     * Sets the value of the lglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglCorpNm(String value) {
        this.lglCorpNm = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the addtlAdrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlAdrInf() {
        return addtlAdrInf;
    }

    /**
     * Sets the value of the addtlAdrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlAdrInf(String value) {
        this.addtlAdrInf = value;
    }

    /**
     * Gets the value of the geogcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Sets the value of the geogcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogcLctn(String value) {
        this.geogcLctn = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData5 }
     *     
     */
    public LocalData5 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData5 }
     *     
     */
    public void setLclData(LocalData5 value) {
        this.lclData = value;
    }

}
