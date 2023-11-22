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

package org.jpos.iso20022.acmt_014_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Organisation33">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FullLglNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}Max350Text"/>
 *         <element name="TradgNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}Max350Text" minOccurs="0"/>
 *         <element name="CtryOfOpr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}CountryCode"/>
 *         <element name="RegnDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}ISODate" minOccurs="0"/>
 *         <element name="OprlAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PostalAddress24" minOccurs="0"/>
 *         <element name="BizAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PostalAddress24" minOccurs="0"/>
 *         <element name="LglAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PostalAddress24"/>
 *         <element name="BllgAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PostalAddress24" minOccurs="0"/>
 *         <element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}OrganisationIdentification29"/>
 *         <element name="RprtvOffcr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PartyIdentification137" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrsrMgr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PartyIdentification137" minOccurs="0"/>
 *         <element name="MainMndtHldr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PartyIdentification137" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PartyIdentification137" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LglRprtv" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}PartyIdentification137" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation33", propOrder = {
    "fullLglNm",
    "tradgNm",
    "ctryOfOpr",
    "regnDt",
    "oprlAdr",
    "bizAdr",
    "lglAdr",
    "bllgAdr",
    "orgId",
    "rprtvOffcr",
    "trsrMgr",
    "mainMndtHldr",
    "sndr",
    "lglRprtv"
})
public class Organisation33 {

    @XmlElement(name = "FullLglNm", required = true)
    protected String fullLglNm;
    @XmlElement(name = "TradgNm")
    protected String tradgNm;
    @XmlElement(name = "CtryOfOpr", required = true)
    protected String ctryOfOpr;
    @XmlElement(name = "RegnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "OprlAdr")
    protected PostalAddress24 oprlAdr;
    @XmlElement(name = "BizAdr")
    protected PostalAddress24 bizAdr;
    @XmlElement(name = "LglAdr", required = true)
    protected PostalAddress24 lglAdr;
    @XmlElement(name = "BllgAdr")
    protected PostalAddress24 bllgAdr;
    @XmlElement(name = "OrgId", required = true)
    protected OrganisationIdentification29 orgId;
    @XmlElement(name = "RprtvOffcr")
    protected List<PartyIdentification137> rprtvOffcr;
    @XmlElement(name = "TrsrMgr")
    protected PartyIdentification137 trsrMgr;
    @XmlElement(name = "MainMndtHldr")
    protected List<PartyIdentification137> mainMndtHldr;
    @XmlElement(name = "Sndr")
    protected List<PartyIdentification137> sndr;
    @XmlElement(name = "LglRprtv")
    protected List<PartyIdentification137> lglRprtv;

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
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     */
    public void setBllgAdr(PostalAddress24 value) {
        this.bllgAdr = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationIdentification29 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public void setOrgId(OrganisationIdentification29 value) {
        this.orgId = value;
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
     * {@link PartyIdentification137 }
     * 
     * 
     * @return
     *     The value of the rprtvOffcr property.
     */
    public List<PartyIdentification137> getRprtvOffcr() {
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
     *     {@link PartyIdentification137 }
     *     
     */
    public PartyIdentification137 getTrsrMgr() {
        return trsrMgr;
    }

    /**
     * Sets the value of the trsrMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137 }
     *     
     */
    public void setTrsrMgr(PartyIdentification137 value) {
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
     * {@link PartyIdentification137 }
     * 
     * 
     * @return
     *     The value of the mainMndtHldr property.
     */
    public List<PartyIdentification137> getMainMndtHldr() {
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
     * {@link PartyIdentification137 }
     * 
     * 
     * @return
     *     The value of the sndr property.
     */
    public List<PartyIdentification137> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<>();
        }
        return this.sndr;
    }

    /**
     * Gets the value of the lglRprtv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglRprtv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglRprtv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137 }
     * 
     * 
     * @return
     *     The value of the lglRprtv property.
     */
    public List<PartyIdentification137> getLglRprtv() {
        if (lglRprtv == null) {
            lglRprtv = new ArrayList<>();
        }
        return this.lglRprtv;
    }

}
