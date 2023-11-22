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

package org.jpos.iso20022.auth_033_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRateDerivative5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestRateDerivative5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UndrlygTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}InterestRateDerivative2Choice"/>
 *         <element name="UndrlygBd" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}BondDerivative2" minOccurs="0"/>
 *         <element name="SwptnNtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="UndrlygSwpMtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISODate" minOccurs="0"/>
 *         <element name="InfltnIndx" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}InflationIndex1Choice" minOccurs="0"/>
 *         <element name="IntrstRateRef" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}FloatingInterestRate8"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateDerivative5", propOrder = {
    "undrlygTp",
    "undrlygBd",
    "swptnNtnlCcy",
    "undrlygSwpMtrtyDt",
    "infltnIndx",
    "intrstRateRef"
})
public class InterestRateDerivative5 {

    @XmlElement(name = "UndrlygTp", required = true)
    protected InterestRateDerivative2Choice undrlygTp;
    @XmlElement(name = "UndrlygBd")
    protected BondDerivative2 undrlygBd;
    @XmlElement(name = "SwptnNtnlCcy")
    protected String swptnNtnlCcy;
    @XmlElement(name = "UndrlygSwpMtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar undrlygSwpMtrtyDt;
    @XmlElement(name = "InfltnIndx")
    protected InflationIndex1Choice infltnIndx;
    @XmlElement(name = "IntrstRateRef", required = true)
    protected FloatingInterestRate8 intrstRateRef;

    /**
     * Gets the value of the undrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateDerivative2Choice }
     *     
     */
    public InterestRateDerivative2Choice getUndrlygTp() {
        return undrlygTp;
    }

    /**
     * Sets the value of the undrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateDerivative2Choice }
     *     
     */
    public void setUndrlygTp(InterestRateDerivative2Choice value) {
        this.undrlygTp = value;
    }

    /**
     * Gets the value of the undrlygBd property.
     * 
     * @return
     *     possible object is
     *     {@link BondDerivative2 }
     *     
     */
    public BondDerivative2 getUndrlygBd() {
        return undrlygBd;
    }

    /**
     * Sets the value of the undrlygBd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BondDerivative2 }
     *     
     */
    public void setUndrlygBd(BondDerivative2 value) {
        this.undrlygBd = value;
    }

    /**
     * Gets the value of the swptnNtnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwptnNtnlCcy() {
        return swptnNtnlCcy;
    }

    /**
     * Sets the value of the swptnNtnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwptnNtnlCcy(String value) {
        this.swptnNtnlCcy = value;
    }

    /**
     * Gets the value of the undrlygSwpMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUndrlygSwpMtrtyDt() {
        return undrlygSwpMtrtyDt;
    }

    /**
     * Sets the value of the undrlygSwpMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUndrlygSwpMtrtyDt(XMLGregorianCalendar value) {
        this.undrlygSwpMtrtyDt = value;
    }

    /**
     * Gets the value of the infltnIndx property.
     * 
     * @return
     *     possible object is
     *     {@link InflationIndex1Choice }
     *     
     */
    public InflationIndex1Choice getInfltnIndx() {
        return infltnIndx;
    }

    /**
     * Sets the value of the infltnIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link InflationIndex1Choice }
     *     
     */
    public void setInfltnIndx(InflationIndex1Choice value) {
        this.infltnIndx = value;
    }

    /**
     * Gets the value of the intrstRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public FloatingInterestRate8 getIntrstRateRef() {
        return intrstRateRef;
    }

    /**
     * Sets the value of the intrstRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public void setIntrstRateRef(FloatingInterestRate8 value) {
        this.intrstRateRef = value;
    }

}
