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

package org.jpos.iso20022.semt_017_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpeningBalance6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OpeningBalance6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Frst" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}BalanceQuantity14Choice"/>
 *         <element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}BalanceQuantity14Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningBalance6Choice", propOrder = {
    "frst",
    "intrmy"
})
public class OpeningBalance6Choice {

    @XmlElement(name = "Frst")
    protected BalanceQuantity14Choice frst;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity14Choice intrmy;

    /**
     * Gets the value of the frst property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public BalanceQuantity14Choice getFrst() {
        return frst;
    }

    /**
     * Sets the value of the frst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public void setFrst(BalanceQuantity14Choice value) {
        this.frst = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public BalanceQuantity14Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public void setIntrmy(BalanceQuantity14Choice value) {
        this.intrmy = value;
    }

}
