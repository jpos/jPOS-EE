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

package org.jpos.iso20022.setr_027_001_04;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Agreement5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Agreement5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max350Text" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="ClsgTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ClosingType1Code" minOccurs="0"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}DeliveryType2Code" minOccurs="0"/>
 *         <element name="MrgnRatio" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agreement5", propOrder = {
    "desc",
    "dt",
    "ccy",
    "clsgTp",
    "startDt",
    "dlvryTp",
    "mrgnRatio"
})
public class Agreement5 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "ClsgTp")
    @XmlSchemaType(name = "string")
    protected ClosingType1Code clsgTp;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected DeliveryType2Code dlvryTp;
    @XmlElement(name = "MrgnRatio")
    protected BigDecimal mrgnRatio;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the clsgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingType1Code }
     *     
     */
    public ClosingType1Code getClsgTp() {
        return clsgTp;
    }

    /**
     * Sets the value of the clsgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingType1Code }
     *     
     */
    public void setClsgTp(ClosingType1Code value) {
        this.clsgTp = value;
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
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType2Code }
     *     
     */
    public DeliveryType2Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType2Code }
     *     
     */
    public void setDlvryTp(DeliveryType2Code value) {
        this.dlvryTp = value;
    }

    /**
     * Gets the value of the mrgnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRatio() {
        return mrgnRatio;
    }

    /**
     * Sets the value of the mrgnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMrgnRatio(BigDecimal value) {
        this.mrgnRatio = value;
    }

}
