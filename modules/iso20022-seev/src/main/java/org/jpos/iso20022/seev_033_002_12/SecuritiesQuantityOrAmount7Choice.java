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

package org.jpos.iso20022.seev_033_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesQuantityOrAmount7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesQuantityOrAmount7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}SecuritiesOption88"/>
 *         <element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}RestrictedFINActiveCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesQuantityOrAmount7Choice", propOrder = {
    "sctiesQty",
    "instdAmt"
})
public class SecuritiesQuantityOrAmount7Choice {

    @XmlElement(name = "SctiesQty")
    protected SecuritiesOption88 sctiesQty;
    @XmlElement(name = "InstdAmt")
    protected RestrictedFINActiveCurrencyAndAmount instdAmt;

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOption88 }
     *     
     */
    public SecuritiesOption88 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOption88 }
     *     
     */
    public void setSctiesQty(SecuritiesOption88 value) {
        this.sctiesQty = value;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setInstdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.instdAmt = value;
    }

}
