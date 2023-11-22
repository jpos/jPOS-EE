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

package org.jpos.iso20022.auth_041_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionsBin2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionsBin2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}Number"/>
 *         <element name="TtlNtnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}DecimalNumber"/>
 *         <element name="Rg" type="{urn:iso:std:iso:20022:tech:xsd:auth.041.001.01}FromToQuantityRange2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionsBin2", propOrder = {
    "nbOfTxs",
    "ttlNtnlAmt",
    "rg"
})
public class TransactionsBin2 {

    @XmlElement(name = "NbOfTxs", required = true)
    protected BigDecimal nbOfTxs;
    @XmlElement(name = "TtlNtnlAmt", required = true)
    protected BigDecimal ttlNtnlAmt;
    @XmlElement(name = "Rg", required = true)
    protected FromToQuantityRange2 rg;

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfTxs(BigDecimal value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the ttlNtnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNtnlAmt() {
        return ttlNtnlAmt;
    }

    /**
     * Sets the value of the ttlNtnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNtnlAmt(BigDecimal value) {
        this.ttlNtnlAmt = value;
    }

    /**
     * Gets the value of the rg property.
     * 
     * @return
     *     possible object is
     *     {@link FromToQuantityRange2 }
     *     
     */
    public FromToQuantityRange2 getRg() {
        return rg;
    }

    /**
     * Sets the value of the rg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToQuantityRange2 }
     *     
     */
    public void setRg(FromToQuantityRange2 value) {
        this.rg = value;
    }

}
