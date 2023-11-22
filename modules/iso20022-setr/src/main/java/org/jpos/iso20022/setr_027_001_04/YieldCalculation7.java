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
 * <p>Java class for YieldCalculation7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="YieldCalculation7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate"/>
 *         <element name="ClctnTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}CalculationType1Code"/>
 *         <element name="RedPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="ValPrd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}DateTimePeriod1Choice" minOccurs="0"/>
 *         <element name="ClctnDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldCalculation7", propOrder = {
    "val",
    "clctnTp",
    "redPric",
    "valDt",
    "valPrd",
    "clctnDt"
})
public class YieldCalculation7 {

    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;
    @XmlElement(name = "ClctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CalculationType1Code clctnTp;
    @XmlElement(name = "RedPric")
    protected Price14 redPric;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "ValPrd")
    protected DateTimePeriod1Choice valPrd;
    @XmlElement(name = "ClctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clctnDt;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVal(BigDecimal value) {
        this.val = value;
    }

    /**
     * Gets the value of the clctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationType1Code }
     *     
     */
    public CalculationType1Code getClctnTp() {
        return clctnTp;
    }

    /**
     * Sets the value of the clctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationType1Code }
     *     
     */
    public void setClctnTp(CalculationType1Code value) {
        this.clctnTp = value;
    }

    /**
     * Gets the value of the redPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getRedPric() {
        return redPric;
    }

    /**
     * Sets the value of the redPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setRedPric(Price14 value) {
        this.redPric = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the valPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getValPrd() {
        return valPrd;
    }

    /**
     * Sets the value of the valPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setValPrd(DateTimePeriod1Choice value) {
        this.valPrd = value;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
    }

}
