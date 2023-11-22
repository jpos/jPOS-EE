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

package org.jpos.iso20022.cain_003_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStartEnd2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceStartEnd2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Lctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="LctnCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Address2" minOccurs="0"/>
 *         <element name="Ctct" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Contact2" minOccurs="0"/>
 *         <element name="DtAndTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="TmSgmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TimeSegment1Code" minOccurs="0"/>
 *         <element name="JrnyInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}JourneyInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStartEnd2", propOrder = {
    "lctn",
    "lctnCd",
    "adr",
    "ctct",
    "dtAndTm",
    "tmSgmt",
    "jrnyInf"
})
public class ServiceStartEnd2 {

    @XmlElement(name = "Lctn")
    protected String lctn;
    @XmlElement(name = "LctnCd")
    protected String lctnCd;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Ctct")
    protected Contact2 ctct;
    @XmlElement(name = "DtAndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTm;
    @XmlElement(name = "TmSgmt")
    @XmlSchemaType(name = "string")
    protected TimeSegment1Code tmSgmt;
    @XmlElement(name = "JrnyInf")
    protected JourneyInformation1 jrnyInf;

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctn(String value) {
        this.lctn = value;
    }

    /**
     * Gets the value of the lctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCd() {
        return lctnCd;
    }

    /**
     * Sets the value of the lctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnCd(String value) {
        this.lctnCd = value;
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
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact2 }
     *     
     */
    public Contact2 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact2 }
     *     
     */
    public void setCtct(Contact2 value) {
        this.ctct = value;
    }

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAndTm(XMLGregorianCalendar value) {
        this.dtAndTm = value;
    }

    /**
     * Gets the value of the tmSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSegment1Code }
     *     
     */
    public TimeSegment1Code getTmSgmt() {
        return tmSgmt;
    }

    /**
     * Sets the value of the tmSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSegment1Code }
     *     
     */
    public void setTmSgmt(TimeSegment1Code value) {
        this.tmSgmt = value;
    }

    /**
     * Gets the value of the jrnyInf property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInformation1 }
     *     
     */
    public JourneyInformation1 getJrnyInf() {
        return jrnyInf;
    }

    /**
     * Sets the value of the jrnyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInformation1 }
     *     
     */
    public void setJrnyInf(JourneyInformation1 value) {
        this.jrnyInf = value;
    }

}
