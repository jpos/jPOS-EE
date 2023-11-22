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

package org.jpos.iso20022.auth_018_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingContract3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnderlyingContract3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Ln" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}LoanContract3"/>
 *         <element name="Trad" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}TradeContract3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingContract3Choice", propOrder = {
    "ln",
    "trad"
})
public class UnderlyingContract3Choice {

    @XmlElement(name = "Ln")
    protected LoanContract3 ln;
    @XmlElement(name = "Trad")
    protected TradeContract3 trad;

    /**
     * Gets the value of the ln property.
     * 
     * @return
     *     possible object is
     *     {@link LoanContract3 }
     *     
     */
    public LoanContract3 getLn() {
        return ln;
    }

    /**
     * Sets the value of the ln property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanContract3 }
     *     
     */
    public void setLn(LoanContract3 value) {
        this.ln = value;
    }

    /**
     * Gets the value of the trad property.
     * 
     * @return
     *     possible object is
     *     {@link TradeContract3 }
     *     
     */
    public TradeContract3 getTrad() {
        return trad;
    }

    /**
     * Sets the value of the trad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeContract3 }
     *     
     */
    public void setTrad(TradeContract3 value) {
        this.trad = value;
    }

}
