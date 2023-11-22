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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateBasis1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExchangeRateBasis1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CcyPair" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ExchangeRateBasis1"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max52Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateBasis1Choice", propOrder = {
    "ccyPair",
    "prtry"
})
public class ExchangeRateBasis1Choice {

    @XmlElement(name = "CcyPair")
    protected ExchangeRateBasis1 ccyPair;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the ccyPair property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateBasis1 }
     *     
     */
    public ExchangeRateBasis1 getCcyPair() {
        return ccyPair;
    }

    /**
     * Sets the value of the ccyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateBasis1 }
     *     
     */
    public void setCcyPair(ExchangeRateBasis1 value) {
        this.ccyPair = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}
