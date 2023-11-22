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

package org.jpos.iso20022.reda_007_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Equity3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Equity3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrefToIncm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}PreferenceToIncome5Choice"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="NonPdAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ParVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="VtngRghtsPerShr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equity3", propOrder = {
    "prefToIncm",
    "mtrtyDt",
    "nonPdAmt",
    "parVal",
    "vtngRghtsPerShr"
})
public class Equity3 {

    @XmlElement(name = "PrefToIncm", required = true)
    protected PreferenceToIncome5Choice prefToIncm;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "NonPdAmt")
    protected ActiveCurrencyAndAmount nonPdAmt;
    @XmlElement(name = "ParVal")
    protected ActiveCurrencyAndAmount parVal;
    @XmlElement(name = "VtngRghtsPerShr")
    protected BigDecimal vtngRghtsPerShr;

    /**
     * Gets the value of the prefToIncm property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceToIncome5Choice }
     *     
     */
    public PreferenceToIncome5Choice getPrefToIncm() {
        return prefToIncm;
    }

    /**
     * Sets the value of the prefToIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceToIncome5Choice }
     *     
     */
    public void setPrefToIncm(PreferenceToIncome5Choice value) {
        this.prefToIncm = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the nonPdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNonPdAmt() {
        return nonPdAmt;
    }

    /**
     * Sets the value of the nonPdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNonPdAmt(ActiveCurrencyAndAmount value) {
        this.nonPdAmt = value;
    }

    /**
     * Gets the value of the parVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getParVal() {
        return parVal;
    }

    /**
     * Sets the value of the parVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setParVal(ActiveCurrencyAndAmount value) {
        this.parVal = value;
    }

    /**
     * Gets the value of the vtngRghtsPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVtngRghtsPerShr() {
        return vtngRghtsPerShr;
    }

    /**
     * Sets the value of the vtngRghtsPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVtngRghtsPerShr(BigDecimal value) {
        this.vtngRghtsPerShr = value;
    }

}
