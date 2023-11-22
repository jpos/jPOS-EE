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

package org.jpos.iso20022.semt_017_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosingBalance7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClosingBalance7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Fnl" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}BalanceQuantity17Choice"/>
 *         <element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}BalanceQuantity17Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosingBalance7Choice", propOrder = {
    "fnl",
    "intrmy"
})
public class ClosingBalance7Choice {

    @XmlElement(name = "Fnl")
    protected BalanceQuantity17Choice fnl;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity17Choice intrmy;

    /**
     * Gets the value of the fnl property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public BalanceQuantity17Choice getFnl() {
        return fnl;
    }

    /**
     * Sets the value of the fnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public void setFnl(BalanceQuantity17Choice value) {
        this.fnl = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public BalanceQuantity17Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public void setIntrmy(BalanceQuantity17Choice value) {
        this.intrmy = value;
    }

}
