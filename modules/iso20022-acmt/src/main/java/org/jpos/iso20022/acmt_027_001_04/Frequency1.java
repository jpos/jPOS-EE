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
 * <p>Java class for Frequency1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Frequency1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Seq" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Max3NumericText" minOccurs="0"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}ISODate"/>
 *         <element name="EndPtChc" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}EndPoint1Choice"/>
 *         <element name="ReqdFrqcyPttrn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}Frequency37Choice" minOccurs="0"/>
 *         <element name="NonWorkgDayAdjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.027.001.04}BusinessDayConvention1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frequency1", propOrder = {
    "seq",
    "startDt",
    "endPtChc",
    "reqdFrqcyPttrn",
    "nonWorkgDayAdjstmnt"
})
public class Frequency1 {

    @XmlElement(name = "Seq")
    protected String seq;
    @XmlElement(name = "StartDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndPtChc", required = true)
    protected EndPoint1Choice endPtChc;
    @XmlElement(name = "ReqdFrqcyPttrn")
    protected Frequency37Choice reqdFrqcyPttrn;
    @XmlElement(name = "NonWorkgDayAdjstmnt")
    @XmlSchemaType(name = "string")
    protected BusinessDayConvention1Code nonWorkgDayAdjstmnt;

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeq(String value) {
        this.seq = value;
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
     * Gets the value of the endPtChc property.
     * 
     * @return
     *     possible object is
     *     {@link EndPoint1Choice }
     *     
     */
    public EndPoint1Choice getEndPtChc() {
        return endPtChc;
    }

    /**
     * Sets the value of the endPtChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndPoint1Choice }
     *     
     */
    public void setEndPtChc(EndPoint1Choice value) {
        this.endPtChc = value;
    }

    /**
     * Gets the value of the reqdFrqcyPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency37Choice }
     *     
     */
    public Frequency37Choice getReqdFrqcyPttrn() {
        return reqdFrqcyPttrn;
    }

    /**
     * Sets the value of the reqdFrqcyPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency37Choice }
     *     
     */
    public void setReqdFrqcyPttrn(Frequency37Choice value) {
        this.reqdFrqcyPttrn = value;
    }

    /**
     * Gets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public BusinessDayConvention1Code getNonWorkgDayAdjstmnt() {
        return nonWorkgDayAdjstmnt;
    }

    /**
     * Sets the value of the nonWorkgDayAdjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayConvention1Code }
     *     
     */
    public void setNonWorkgDayAdjstmnt(BusinessDayConvention1Code value) {
        this.nonWorkgDayAdjstmnt = value;
    }

}
