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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalAmount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PrincipalAmount3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValDtAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MtrtyDtAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAmount3", propOrder = {
    "valDtAmt",
    "mtrtyDtAmt"
})
public class PrincipalAmount3 {

    @XmlElement(name = "ValDtAmt")
    protected ActiveOrHistoricCurrencyAndAmount valDtAmt;
    @XmlElement(name = "MtrtyDtAmt")
    protected ActiveOrHistoricCurrencyAndAmount mtrtyDtAmt;

    /**
     * Gets the value of the valDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getValDtAmt() {
        return valDtAmt;
    }

    /**
     * Sets the value of the valDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setValDtAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.valDtAmt = value;
    }

    /**
     * Gets the value of the mtrtyDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMtrtyDtAmt() {
        return mtrtyDtAmt;
    }

    /**
     * Sets the value of the mtrtyDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMtrtyDtAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.mtrtyDtAmt = value;
    }

}
