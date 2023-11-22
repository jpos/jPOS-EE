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

package org.jpos.iso20022.catp_017_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringTransaction3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecurringTransaction3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ISODate"/>
 *         <element name="NbOfOcrncs" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Number" minOccurs="0"/>
 *         <element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ISODate"/>
 *         <element name="PrdUnit" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Frequency3Code" minOccurs="0"/>
 *         <element name="IntrvlDay" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTransaction3", propOrder = {
    "startDt",
    "nbOfOcrncs",
    "endDt",
    "prdUnit",
    "intrvlDay"
})
public class RecurringTransaction3 {

    @XmlElement(name = "StartDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "NbOfOcrncs")
    protected BigDecimal nbOfOcrncs;
    @XmlElement(name = "EndDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency3Code prdUnit;
    @XmlElement(name = "IntrvlDay")
    protected BigDecimal intrvlDay;

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
     * Gets the value of the nbOfOcrncs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOcrncs() {
        return nbOfOcrncs;
    }

    /**
     * Sets the value of the nbOfOcrncs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfOcrncs(BigDecimal value) {
        this.nbOfOcrncs = value;
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

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Code }
     *     
     */
    public Frequency3Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Code }
     *     
     */
    public void setPrdUnit(Frequency3Code value) {
        this.prdUnit = value;
    }

    /**
     * Gets the value of the intrvlDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrvlDay() {
        return intrvlDay;
    }

    /**
     * Sets the value of the intrvlDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrvlDay(BigDecimal value) {
        this.intrvlDay = value;
    }

}
