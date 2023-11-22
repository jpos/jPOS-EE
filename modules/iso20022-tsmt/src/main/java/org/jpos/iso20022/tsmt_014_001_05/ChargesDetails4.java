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

package org.jpos.iso20022.tsmt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesDetails4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ChargesDetails4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChrgsTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}ChargesType1Choice"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}CurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesDetails4", propOrder = {
    "chrgsTp",
    "amt"
})
public class ChargesDetails4 {

    @XmlElement(name = "ChrgsTp", required = true)
    protected ChargesType1Choice chrgsTp;
    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;

    /**
     * Gets the value of the chrgsTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType1Choice }
     *     
     */
    public ChargesType1Choice getChrgsTp() {
        return chrgsTp;
    }

    /**
     * Sets the value of the chrgsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType1Choice }
     *     
     */
    public void setChrgsTp(ChargesType1Choice value) {
        this.chrgsTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAmt(CurrencyAndAmount value) {
        this.amt = value;
    }

}
