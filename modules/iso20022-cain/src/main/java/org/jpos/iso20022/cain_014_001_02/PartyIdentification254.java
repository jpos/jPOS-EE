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

package org.jpos.iso20022.cain_014_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification254 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification254">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}ISO3NumericCountryCode" minOccurs="0"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="LglCorpNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max99Text" minOccurs="0"/>
 *         <element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="NmAndLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max99Text" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Address2" minOccurs="0"/>
 *         <element name="AddtlAdrInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max256Text" minOccurs="0"/>
 *         <element name="GeogcLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}GeographicPointInDecimalDegrees" minOccurs="0"/>
 *         <element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max256Text" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max256Text" minOccurs="0"/>
 *         <element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CstmrSvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AddtlCtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max256Text" minOccurs="0"/>
 *         <element name="TaxRegnId" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}LocalData4" minOccurs="0"/>
 *         <element name="SpnsrdMrchnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}SponsoredMerchant2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification254", propOrder = {
    "id",
    "assgnr",
    "ctry",
    "shrtNm",
    "lglCorpNm",
    "addtlId",
    "nmAndLctn",
    "adr",
    "addtlAdrInf",
    "geogcLctn",
    "email",
    "urlAdr",
    "phneNb",
    "cstmrSvc",
    "addtlCtctInf",
    "taxRegnId",
    "addtlData",
    "lclData",
    "spnsrdMrchnt"
})
public class PartyIdentification254 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Assgnr")
    protected String assgnr;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "AddtlId")
    protected String addtlId;
    @XmlElement(name = "NmAndLctn")
    protected String nmAndLctn;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "AddtlAdrInf")
    protected String addtlAdrInf;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "CstmrSvc")
    protected String cstmrSvc;
    @XmlElement(name = "AddtlCtctInf")
    protected String addtlCtctInf;
    @XmlElement(name = "TaxRegnId")
    protected String taxRegnId;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LclData")
    protected LocalData4 lclData;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<SponsoredMerchant2> spnsrdMrchnt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssgnr(String value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
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
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlId(String value) {
        this.addtlId = value;
    }

    /**
     * Gets the value of the nmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmAndLctn() {
        return nmAndLctn;
    }

    /**
     * Sets the value of the nmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmAndLctn(String value) {
        this.nmAndLctn = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

    /**
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
    }

    /**
     * Gets the value of the cstmrSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrSvc() {
        return cstmrSvc;
    }

    /**
     * Sets the value of the cstmrSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrSvc(String value) {
        this.cstmrSvc = value;
    }

    /**
     * Gets the value of the addtlCtctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCtctInf() {
        return addtlCtctInf;
    }

    /**
     * Sets the value of the addtlCtctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlCtctInf(String value) {
        this.addtlCtctInf = value;
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
     *     {@link LocalData4 }
     *     
     */
    public LocalData4 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData4 }
     *     
     */
    public void setLclData(LocalData4 value) {
        this.lclData = value;
    }

    /**
     * Gets the value of the spnsrdMrchnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spnsrdMrchnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpnsrdMrchnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SponsoredMerchant2 }
     * 
     * 
     * @return
     *     The value of the spnsrdMrchnt property.
     */
    public List<SponsoredMerchant2> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<>();
        }
        return this.spnsrdMrchnt;
    }

}
