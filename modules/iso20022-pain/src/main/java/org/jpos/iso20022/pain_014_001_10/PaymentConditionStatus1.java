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

package org.jpos.iso20022.pain_014_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentConditionStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentConditionStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccptdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrntedPmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}TrueFalseIndicator"/>
 *         <element name="EarlyPmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.10}TrueFalseIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentConditionStatus1", propOrder = {
    "accptdAmt",
    "grntedPmt",
    "earlyPmt"
})
public class PaymentConditionStatus1 {

    @XmlElement(name = "AccptdAmt")
    protected ActiveCurrencyAndAmount accptdAmt;
    @XmlElement(name = "GrntedPmt")
    protected boolean grntedPmt;
    @XmlElement(name = "EarlyPmt")
    protected boolean earlyPmt;

    /**
     * Gets the value of the accptdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAccptdAmt() {
        return accptdAmt;
    }

    /**
     * Sets the value of the accptdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAccptdAmt(ActiveCurrencyAndAmount value) {
        this.accptdAmt = value;
    }

    /**
     * Gets the value of the grntedPmt property.
     * 
     */
    public boolean isGrntedPmt() {
        return grntedPmt;
    }

    /**
     * Sets the value of the grntedPmt property.
     * 
     */
    public void setGrntedPmt(boolean value) {
        this.grntedPmt = value;
    }

    /**
     * Gets the value of the earlyPmt property.
     * 
     */
    public boolean isEarlyPmt() {
        return earlyPmt;
    }

    /**
     * Sets the value of the earlyPmt property.
     * 
     */
    public void setEarlyPmt(boolean value) {
        this.earlyPmt = value;
    }

}
