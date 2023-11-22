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

package org.jpos.iso20022.sese_012_001_11;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPerson8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualPerson8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Max35Text"/>
 *         <element name="GvnNm" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Max35Text"/>
 *         <element name="NmPrfx" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}NamePrefix1Code" minOccurs="0"/>
 *         <element name="NmSfx" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Gndr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}GenderCode" minOccurs="0"/>
 *         <element name="BirthDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ISODate" minOccurs="0"/>
 *         <element name="SclSctyNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Max35Text" minOccurs="0"/>
 *         <element name="IndvInvstrAdr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}PostalAddress1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson8", propOrder = {
    "nm",
    "gvnNm",
    "nmPrfx",
    "nmSfx",
    "gndr",
    "birthDt",
    "sclSctyNb",
    "indvInvstrAdr"
})
public class IndividualPerson8 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "GvnNm", required = true)
    protected String gvnNm;
    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix1Code nmPrfx;
    @XmlElement(name = "NmSfx")
    protected String nmSfx;
    @XmlElement(name = "Gndr")
    @XmlSchemaType(name = "string")
    protected GenderCode gndr;
    @XmlElement(name = "BirthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "SclSctyNb")
    protected String sclSctyNb;
    @XmlElement(name = "IndvInvstrAdr", required = true)
    protected PostalAddress1 indvInvstrAdr;

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
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix1Code }
     *     
     */
    public NamePrefix1Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix1Code }
     *     
     */
    public void setNmPrfx(NamePrefix1Code value) {
        this.nmPrfx = value;
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
     * Gets the value of the gndr property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCode }
     *     
     */
    public GenderCode getGndr() {
        return gndr;
    }

    /**
     * Sets the value of the gndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCode }
     *     
     */
    public void setGndr(GenderCode value) {
        this.gndr = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the sclSctyNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSclSctyNb() {
        return sclSctyNb;
    }

    /**
     * Sets the value of the sclSctyNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSclSctyNb(String value) {
        this.sclSctyNb = value;
    }

    /**
     * Gets the value of the indvInvstrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getIndvInvstrAdr() {
        return indvInvstrAdr;
    }

    /**
     * Sets the value of the indvInvstrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public void setIndvInvstrAdr(PostalAddress1 value) {
        this.indvInvstrAdr = value;
    }

}
