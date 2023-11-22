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

package org.jpos.iso20022.cain_025_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrivingLicense2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DrivingLicense2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *         <element name="Form" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}PresentationMedium2Code" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text"/>
 *         <element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}LegalStructure1Code" minOccurs="0"/>
 *         <element name="IssncDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODate" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODate" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISOMax3ACountryCode" minOccurs="0"/>
 *         <element name="Stat" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max16Text" minOccurs="0"/>
 *         <element name="Prvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max16Text" minOccurs="0"/>
 *         <element name="OthrAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max16Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrivingLicense2", propOrder = {
    "tp",
    "form",
    "id",
    "assgnr",
    "issncDt",
    "xprtnDt",
    "ctry",
    "stat",
    "prvc",
    "othrAuthrty"
})
public class DrivingLicense2 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Form")
    @XmlSchemaType(name = "string")
    protected PresentationMedium2Code form;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected LegalStructure1Code assgnr;
    @XmlElement(name = "IssncDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issncDt;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "Prvc")
    protected String prvc;
    @XmlElement(name = "OthrAuthrty")
    protected String othrAuthrty;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationMedium2Code }
     *     
     */
    public PresentationMedium2Code getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationMedium2Code }
     *     
     */
    public void setForm(PresentationMedium2Code value) {
        this.form = value;
    }

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
     *     {@link LegalStructure1Code }
     *     
     */
    public LegalStructure1Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStructure1Code }
     *     
     */
    public void setAssgnr(LegalStructure1Code value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the issncDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssncDt() {
        return issncDt;
    }

    /**
     * Sets the value of the issncDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssncDt(XMLGregorianCalendar value) {
        this.issncDt = value;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
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
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the prvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvc() {
        return prvc;
    }

    /**
     * Sets the value of the prvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvc(String value) {
        this.prvc = value;
    }

    /**
     * Gets the value of the othrAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAuthrty() {
        return othrAuthrty;
    }

    /**
     * Sets the value of the othrAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAuthrty(String value) {
        this.othrAuthrty = value;
    }

}
