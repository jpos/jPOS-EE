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

package org.jpos.iso20022.tsrv_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingAmount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingAmount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VartnAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="BalAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmount4", propOrder = {
    "vartnAmt",
    "balAmt"
})
public class UndertakingAmount4 {

    @XmlElement(name = "VartnAmt", required = true)
    protected ActiveCurrencyAndAmount vartnAmt;
    @XmlElement(name = "BalAmt")
    protected ActiveCurrencyAndAmount balAmt;

    /**
     * Gets the value of the vartnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getVartnAmt() {
        return vartnAmt;
    }

    /**
     * Sets the value of the vartnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setVartnAmt(ActiveCurrencyAndAmount value) {
        this.vartnAmt = value;
    }

    /**
     * Gets the value of the balAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getBalAmt() {
        return balAmt;
    }

    /**
     * Sets the value of the balAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setBalAmt(ActiveCurrencyAndAmount value) {
        this.balAmt = value;
    }

}
