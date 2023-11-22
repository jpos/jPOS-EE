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

package org.jpos.iso20022.auth_029_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeDateTimeQueryCriteria6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeDateTimeQueryCriteria6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DateTimePeriod1" minOccurs="0"/>
 *         <element name="ExctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DateTimePeriod1" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DateOrBlankQuery2Choice" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DatePeriod1" minOccurs="0"/>
 *         <element name="ValtnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DateTimePeriod1" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DateOrBlankQuery2Choice" minOccurs="0"/>
 *         <element name="EarlyTermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DatePeriod1" minOccurs="0"/>
 *         <element name="CollTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DateTimeOrBlankQuery1Choice" minOccurs="0"/>
 *         <element name="HstrclAsOfDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDateTimeQueryCriteria6", propOrder = {
    "rptgDtTm",
    "exctnDtTm",
    "mtrtyDt",
    "fctvDt",
    "valtnDtTm",
    "xprtnDt",
    "earlyTermntnDt",
    "collTmStmp",
    "hstrclAsOfDt"
})
public class TradeDateTimeQueryCriteria6 {

    @XmlElement(name = "RptgDtTm")
    protected DateTimePeriod1 rptgDtTm;
    @XmlElement(name = "ExctnDtTm")
    protected DateTimePeriod1 exctnDtTm;
    @XmlElement(name = "MtrtyDt")
    protected DateOrBlankQuery2Choice mtrtyDt;
    @XmlElement(name = "FctvDt")
    protected DatePeriod1 fctvDt;
    @XmlElement(name = "ValtnDtTm")
    protected DateTimePeriod1 valtnDtTm;
    @XmlElement(name = "XprtnDt")
    protected DateOrBlankQuery2Choice xprtnDt;
    @XmlElement(name = "EarlyTermntnDt")
    protected DatePeriod1 earlyTermntnDt;
    @XmlElement(name = "CollTmStmp")
    protected DateTimeOrBlankQuery1Choice collTmStmp;
    @XmlElement(name = "HstrclAsOfDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hstrclAsOfDt;

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setRptgDtTm(DateTimePeriod1 value) {
        this.rptgDtTm = value;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setExctnDtTm(DateTimePeriod1 value) {
        this.exctnDtTm = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public DateOrBlankQuery2Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public void setMtrtyDt(DateOrBlankQuery2Choice value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public void setFctvDt(DatePeriod1 value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the valtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getValtnDtTm() {
        return valtnDtTm;
    }

    /**
     * Sets the value of the valtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setValtnDtTm(DateTimePeriod1 value) {
        this.valtnDtTm = value;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public DateOrBlankQuery2Choice getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrBlankQuery2Choice }
     *     
     */
    public void setXprtnDt(DateOrBlankQuery2Choice value) {
        this.xprtnDt = value;
    }

    /**
     * Gets the value of the earlyTermntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getEarlyTermntnDt() {
        return earlyTermntnDt;
    }

    /**
     * Sets the value of the earlyTermntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public void setEarlyTermntnDt(DatePeriod1 value) {
        this.earlyTermntnDt = value;
    }

    /**
     * Gets the value of the collTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeOrBlankQuery1Choice }
     *     
     */
    public DateTimeOrBlankQuery1Choice getCollTmStmp() {
        return collTmStmp;
    }

    /**
     * Sets the value of the collTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeOrBlankQuery1Choice }
     *     
     */
    public void setCollTmStmp(DateTimeOrBlankQuery1Choice value) {
        this.collTmStmp = value;
    }

    /**
     * Gets the value of the hstrclAsOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHstrclAsOfDt() {
        return hstrclAsOfDt;
    }

    /**
     * Sets the value of the hstrclAsOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHstrclAsOfDt(XMLGregorianCalendar value) {
        this.hstrclAsOfDt = value;
    }

}
