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

package org.jpos.iso20022.acmt_027_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation35 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Organisation35">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FullLglNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max350Text"/>
 *         <element name="TradgNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max350Text" minOccurs="0"/>
 *         <element name="OrgLglSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}OrganisationLegalStatus1Code" minOccurs="0"/>
 *         <element name="EstblishdDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="RegnNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max70Text" minOccurs="0"/>
 *         <element name="RegnCtry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CountryCode" minOccurs="0"/>
 *         <element name="RegnDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="TaxtnIdNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="TaxtnCtry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CountryCode" minOccurs="0"/>
 *         <element name="CtryOfOpr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}CountryCode" minOccurs="0"/>
 *         <element name="BrdRsltnInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BizAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PostalAddress24" minOccurs="0"/>
 *         <element name="OprlAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PostalAddress24" minOccurs="0"/>
 *         <element name="LglAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PostalAddress24" minOccurs="0"/>
 *         <element name="RprtvOffcr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PartyIdentification135" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrsrMgr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PartyIdentification135" minOccurs="0"/>
 *         <element name="MainMndtHldr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PartyIdentification135" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}PartyIdentification135" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation35", propOrder = {
    "fullLglNm",
    "tradgNm",
    "orgLglSts",
    "estblishdDt",
    "regnNb",
    "regnCtry",
    "regnDt",
    "taxtnIdNb",
    "taxtnCtry",
    "ctryOfOpr",
    "brdRsltnInd",
    "bizAdr",
    "oprlAdr",
    "lglAdr",
    "rprtvOffcr",
    "trsrMgr",
    "mainMndtHldr",
    "sndr"
})
public class Organisation35 {

    @XmlElement(name = "FullLglNm", required = true)
    protected String fullLglNm;
    @XmlElement(name = "TradgNm")
    protected String tradgNm;
    @XmlElement(name = "OrgLglSts")
    @XmlSchemaType(name = "string")
    protected OrganisationLegalStatus1Code orgLglSts;
    @XmlElement(name = "EstblishdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estblishdDt;
    @XmlElement(name = "RegnNb")
    protected String regnNb;
    @XmlElement(name = "RegnCtry")
    protected String regnCtry;
    @XmlElement(name = "RegnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "TaxtnIdNb")
    protected String taxtnIdNb;
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "CtryOfOpr")
    protected String ctryOfOpr;
    @XmlElement(name = "BrdRsltnInd")
    protected Boolean brdRsltnInd;
    @XmlElement(name = "BizAdr")
    protected PostalAddress24 bizAdr;
    @XmlElement(name = "OprlAdr")
    protected PostalAddress24 oprlAdr;
    @XmlElement(name = "LglAdr")
    protected PostalAddress24 lglAdr;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyIdentification135> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyIdentification135 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyIdentification135> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyIdentification135> sndr;

    /**
     * Gets the value of the fullLglNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullLglNm() {
        return fullLglNm;
    }

    /**
     * Sets the value of the fullLglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullLglNm(String value) {
        this.fullLglNm = value;
    }

    /**
     * Gets the value of the tradgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgNm() {
        return tradgNm;
    }

    /**
     * Sets the value of the tradgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgNm(String value) {
        this.tradgNm = value;
    }

    /**
     * Gets the value of the orgLglSts property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationLegalStatus1Code }
     *     
     */
    public OrganisationLegalStatus1Code getOrgLglSts() {
        return orgLglSts;
    }

    /**
     * Sets the value of the orgLglSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationLegalStatus1Code }
     *     
     */
    public void setOrgLglSts(OrganisationLegalStatus1Code value) {
        this.orgLglSts = value;
    }

    /**
     * Gets the value of the estblishdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstblishdDt() {
        return estblishdDt;
    }

    /**
     * Sets the value of the estblishdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstblishdDt(XMLGregorianCalendar value) {
        this.estblishdDt = value;
    }

    /**
     * Gets the value of the regnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnNb() {
        return regnNb;
    }

    /**
     * Sets the value of the regnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnNb(String value) {
        this.regnNb = value;
    }

    /**
     * Gets the value of the regnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnCtry() {
        return regnCtry;
    }

    /**
     * Sets the value of the regnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnCtry(String value) {
        this.regnCtry = value;
    }

    /**
     * Gets the value of the regnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegnDt() {
        return regnDt;
    }

    /**
     * Sets the value of the regnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegnDt(XMLGregorianCalendar value) {
        this.regnDt = value;
    }

    /**
     * Gets the value of the taxtnIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnIdNb() {
        return taxtnIdNb;
    }

    /**
     * Sets the value of the taxtnIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxtnIdNb(String value) {
        this.taxtnIdNb = value;
    }

    /**
     * Gets the value of the taxtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnCtry() {
        return taxtnCtry;
    }

    /**
     * Sets the value of the taxtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxtnCtry(String value) {
        this.taxtnCtry = value;
    }

    /**
     * Gets the value of the ctryOfOpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfOpr() {
        return ctryOfOpr;
    }

    /**
     * Sets the value of the ctryOfOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfOpr(String value) {
        this.ctryOfOpr = value;
    }

    /**
     * Gets the value of the brdRsltnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrdRsltnInd() {
        return brdRsltnInd;
    }

    /**
     * Sets the value of the brdRsltnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrdRsltnInd(Boolean value) {
        this.brdRsltnInd = value;
    }

    /**
     * Gets the value of the bizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getBizAdr() {
        return bizAdr;
    }

    /**
     * Sets the value of the bizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public void setBizAdr(PostalAddress24 value) {
        this.bizAdr = value;
    }

    /**
     * Gets the value of the oprlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getOprlAdr() {
        return oprlAdr;
    }

    /**
     * Sets the value of the oprlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public void setOprlAdr(PostalAddress24 value) {
        this.oprlAdr = value;
    }

    /**
     * Gets the value of the lglAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getLglAdr() {
        return lglAdr;
    }

    /**
     * Sets the value of the lglAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public void setLglAdr(PostalAddress24 value) {
        this.lglAdr = value;
    }

    /**
     * Gets the value of the rprtvOffcr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rprtvOffcr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprtvOffcr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification135 }
     * 
     * 
     * @return
     *     The value of the rprtvOffcr property.
     */
    public List<PartyIdentification135> getRprtvOffcr() {
        if (rprtvOffcr == null) {
            rprtvOffcr = new ArrayList<>();
        }
        return this.rprtvOffcr;
    }

    /**
     * Gets the value of the trsrMgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setTrsrMgr(PartyIdentification135 value) {
        this.trsrMgr = value;
    }

    /**
     * Gets the value of the mainMndtHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mainMndtHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainMndtHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification135 }
     * 
     * 
     * @return
     *     The value of the mainMndtHldr property.
     */
    public List<PartyIdentification135> getMainMndtHldr() {
        if (mainMndtHldr == null) {
            mainMndtHldr = new ArrayList<>();
        }
        return this.mainMndtHldr;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification135 }
     * 
     * 
     * @return
     *     The value of the sndr property.
     */
    public List<PartyIdentification135> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<>();
        }
        return this.sndr;
    }

}
