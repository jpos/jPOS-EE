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

package org.jpos.iso20022.camt_102_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AmtWthtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.102.001.02}ImpliedCurrencyAndAmount"/>
 *         <element name="AmtWthCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.102.001.02}ActiveCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount2Choice", propOrder = {
    "amtWthtCcy",
    "amtWthCcy"
})
public class Amount2Choice {

    @XmlElement(name = "AmtWthtCcy")
    protected BigDecimal amtWthtCcy;
    @XmlElement(name = "AmtWthCcy")
    protected ActiveCurrencyAndAmount amtWthCcy;

    /**
     * Gets the value of the amtWthtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtWthtCcy() {
        return amtWthtCcy;
    }

    /**
     * Sets the value of the amtWthtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtWthtCcy(BigDecimal value) {
        this.amtWthtCcy = value;
    }

    /**
     * Gets the value of the amtWthCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmtWthCcy() {
        return amtWthCcy;
    }

    /**
     * Sets the value of the amtWthCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmtWthCcy(ActiveCurrencyAndAmount value) {
        this.amtWthCcy = value;
    }

}
