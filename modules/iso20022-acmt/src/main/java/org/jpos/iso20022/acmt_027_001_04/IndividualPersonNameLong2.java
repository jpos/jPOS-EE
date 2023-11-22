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

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPersonNameLong2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualPersonNameLong2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmPrfx" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}NamePrefix2Code" minOccurs="0"/>
 *         <element name="Srnm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max35Text"/>
 *         <element name="GvnNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="MddlNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="Initls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max6Text" minOccurs="0"/>
 *         <element name="NmSfx" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max350Text" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max350Text" minOccurs="0"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPersonNameLong2", propOrder = {
    "nmPrfx",
    "srnm",
    "gvnNm",
    "mddlNm",
    "initls",
    "nmSfx",
    "nm",
    "startDt",
    "endDt"
})
public class IndividualPersonNameLong2 {

    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix2Code nmPrfx;
    @XmlElement(name = "Srnm", required = true)
    protected String srnm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "Initls")
    protected String initls;
    @XmlElement(name = "NmSfx")
    protected String nmSfx;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix2Code }
     *     
     */
    public NamePrefix2Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix2Code }
     *     
     */
    public void setNmPrfx(NamePrefix2Code value) {
        this.nmPrfx = value;
    }

    /**
     * Gets the value of the srnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrnm() {
        return srnm;
    }

    /**
     * Sets the value of the srnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrnm(String value) {
        this.srnm = value;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGvnNm(String value) {
        this.gvnNm = value;
    }

    /**
     * Gets the value of the mddlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Sets the value of the mddlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMddlNm(String value) {
        this.mddlNm = value;
    }

    /**
     * Gets the value of the initls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitls() {
        return initls;
    }

    /**
     * Sets the value of the initls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitls(String value) {
        this.initls = value;
    }

    /**
     * Gets the value of the nmSfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmSfx() {
        return nmSfx;
    }

    /**
     * Sets the value of the nmSfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmSfx(String value) {
        this.nmSfx = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

}
