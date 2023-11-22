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

package org.jpos.iso20022.colr_013_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestResult1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestResult1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntrstDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IntrstDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}ISODate"/>
 *         <element name="IntrstMtd" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}InterestMethod1Code"/>
 *         <element name="OpngCollBal" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}CollateralBalance1" minOccurs="0"/>
 *         <element name="ClsgCollBal" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}CollateralBalance1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestResult1", propOrder = {
    "intrstDueToA",
    "intrstDueToB",
    "valDt",
    "intrstMtd",
    "opngCollBal",
    "clsgCollBal"
})
public class InterestResult1 {

    @XmlElement(name = "IntrstDueToA")
    protected ActiveCurrencyAndAmount intrstDueToA;
    @XmlElement(name = "IntrstDueToB")
    protected ActiveCurrencyAndAmount intrstDueToB;
    @XmlElement(name = "ValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "IntrstMtd", required = true)
    @XmlSchemaType(name = "string")
    protected InterestMethod1Code intrstMtd;
    @XmlElement(name = "OpngCollBal")
    protected CollateralBalance1 opngCollBal;
    @XmlElement(name = "ClsgCollBal", required = true)
    protected CollateralBalance1 clsgCollBal;

    /**
     * Gets the value of the intrstDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrstDueToA() {
        return intrstDueToA;
    }

    /**
     * Sets the value of the intrstDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntrstDueToA(ActiveCurrencyAndAmount value) {
        this.intrstDueToA = value;
    }

    /**
     * Gets the value of the intrstDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrstDueToB() {
        return intrstDueToB;
    }

    /**
     * Sets the value of the intrstDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntrstDueToB(ActiveCurrencyAndAmount value) {
        this.intrstDueToB = value;
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
     * Gets the value of the intrstMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestMethod1Code }
     *     
     */
    public InterestMethod1Code getIntrstMtd() {
        return intrstMtd;
    }

    /**
     * Sets the value of the intrstMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestMethod1Code }
     *     
     */
    public void setIntrstMtd(InterestMethod1Code value) {
        this.intrstMtd = value;
    }

    /**
     * Gets the value of the opngCollBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1 }
     *     
     */
    public CollateralBalance1 getOpngCollBal() {
        return opngCollBal;
    }

    /**
     * Sets the value of the opngCollBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1 }
     *     
     */
    public void setOpngCollBal(CollateralBalance1 value) {
        this.opngCollBal = value;
    }

    /**
     * Gets the value of the clsgCollBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1 }
     *     
     */
    public CollateralBalance1 getClsgCollBal() {
        return clsgCollBal;
    }

    /**
     * Sets the value of the clsgCollBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1 }
     *     
     */
    public void setClsgCollBal(CollateralBalance1 value) {
        this.clsgCollBal = value;
    }

}
