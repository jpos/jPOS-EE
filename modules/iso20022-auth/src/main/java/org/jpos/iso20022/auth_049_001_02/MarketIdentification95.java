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

package org.jpos.iso20022.auth_049_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketIdentification95 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarketIdentification95">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Oprg" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}MICIdentifier"/>
 *         <element name="Sgmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}MICIdentifier"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}MarketIdentification1Code"/>
 *         <element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}MICEntityType1Code" minOccurs="0"/>
 *         <element name="InstnNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Max450Text"/>
 *         <element name="Acrnm" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Max35Text" minOccurs="0"/>
 *         <element name="City" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}CountryCodeAndName3"/>
 *         <element name="AuthrtyNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Max450Text" minOccurs="0"/>
 *         <element name="WebSite" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Max210Text" minOccurs="0"/>
 *         <element name="Note" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Max450Text" minOccurs="0"/>
 *         <element name="Mod" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Modification1Code" minOccurs="0"/>
 *         <element name="CreDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}ISODate" minOccurs="0"/>
 *         <element name="VldtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}Period4Choice"/>
 *         <element name="StsDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}ISODate" minOccurs="0"/>
 *         <element name="LastUpdtdDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.049.001.02}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentification95", propOrder = {
    "oprg",
    "sgmt",
    "tp",
    "ctgy",
    "instnNm",
    "acrnm",
    "city",
    "ctry",
    "authrtyNm",
    "webSite",
    "note",
    "mod",
    "creDt",
    "vldtyPrd",
    "stsDt",
    "lastUpdtdDt"
})
public class MarketIdentification95 {

    @XmlElement(name = "Oprg", required = true)
    protected String oprg;
    @XmlElement(name = "Sgmt", required = true)
    protected String sgmt;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected MarketIdentification1Code tp;
    @XmlElement(name = "Ctgy")
    @XmlSchemaType(name = "string")
    protected MICEntityType1Code ctgy;
    @XmlElement(name = "InstnNm", required = true)
    protected String instnNm;
    @XmlElement(name = "Acrnm")
    protected String acrnm;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Ctry", required = true)
    protected CountryCodeAndName3 ctry;
    @XmlElement(name = "AuthrtyNm")
    protected String authrtyNm;
    @XmlElement(name = "WebSite")
    protected String webSite;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Mod")
    @XmlSchemaType(name = "string")
    protected Modification1Code mod;
    @XmlElement(name = "CreDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "VldtyPrd", required = true)
    protected Period4Choice vldtyPrd;
    @XmlElement(name = "StsDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stsDt;
    @XmlElement(name = "LastUpdtdDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdtdDt;

    /**
     * Gets the value of the oprg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprg() {
        return oprg;
    }

    /**
     * Sets the value of the oprg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOprg(String value) {
        this.oprg = value;
    }

    /**
     * Gets the value of the sgmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgmt() {
        return sgmt;
    }

    /**
     * Sets the value of the sgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgmt(String value) {
        this.sgmt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1Code }
     *     
     */
    public MarketIdentification1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1Code }
     *     
     */
    public void setTp(MarketIdentification1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ctgy property.
     * 
     * @return
     *     possible object is
     *     {@link MICEntityType1Code }
     *     
     */
    public MICEntityType1Code getCtgy() {
        return ctgy;
    }

    /**
     * Sets the value of the ctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MICEntityType1Code }
     *     
     */
    public void setCtgy(MICEntityType1Code value) {
        this.ctgy = value;
    }

    /**
     * Gets the value of the instnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstnNm() {
        return instnNm;
    }

    /**
     * Sets the value of the instnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstnNm(String value) {
        this.instnNm = value;
    }

    /**
     * Gets the value of the acrnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrnm() {
        return acrnm;
    }

    /**
     * Sets the value of the acrnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrnm(String value) {
        this.acrnm = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public CountryCodeAndName3 getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public void setCtry(CountryCodeAndName3 value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the authrtyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyNm() {
        return authrtyNm;
    }

    /**
     * Sets the value of the authrtyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrtyNm(String value) {
        this.authrtyNm = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public void setMod(Modification1Code value) {
        this.mod = value;
    }

    /**
     * Gets the value of the creDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDt() {
        return creDt;
    }

    /**
     * Sets the value of the creDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setVldtyPrd(Period4Choice value) {
        this.vldtyPrd = value;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStsDt(XMLGregorianCalendar value) {
        this.stsDt = value;
    }

    /**
     * Gets the value of the lastUpdtdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdtdDt() {
        return lastUpdtdDt;
    }

    /**
     * Sets the value of the lastUpdtdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdtdDt(XMLGregorianCalendar value) {
        this.lastUpdtdDt = value;
    }

}
