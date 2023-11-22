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

package org.jpos.iso20022.auth_069_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenInterest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OpenInterest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrssNtnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}ActiveCurrencyAnd24Amount"/>
 *         <element name="NbOfLots" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}PositiveNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenInterest1", propOrder = {
    "grssNtnlAmt",
    "nbOfLots"
})
public class OpenInterest1 {

    @XmlElement(name = "GrssNtnlAmt", required = true)
    protected ActiveCurrencyAnd24Amount grssNtnlAmt;
    @XmlElement(name = "NbOfLots")
    protected BigDecimal nbOfLots;

    /**
     * Gets the value of the grssNtnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getGrssNtnlAmt() {
        return grssNtnlAmt;
    }

    /**
     * Sets the value of the grssNtnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public void setGrssNtnlAmt(ActiveCurrencyAnd24Amount value) {
        this.grssNtnlAmt = value;
    }

    /**
     * Gets the value of the nbOfLots property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfLots() {
        return nbOfLots;
    }

    /**
     * Sets the value of the nbOfLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfLots(BigDecimal value) {
        this.nbOfLots = value;
    }

}
