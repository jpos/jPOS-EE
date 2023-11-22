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

package org.jpos.iso20022.camt_006_001_10;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AmtWthCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="AmtWthtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}ImpliedCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount3Choice", propOrder = {
    "amtWthCcy",
    "amtWthtCcy"
})
public class Amount3Choice {

    @XmlElement(name = "AmtWthCcy")
    protected ActiveOrHistoricCurrencyAndAmount amtWthCcy;
    @XmlElement(name = "AmtWthtCcy")
    protected BigDecimal amtWthtCcy;

    /**
     * Gets the value of the amtWthCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmtWthCcy() {
        return amtWthCcy;
    }

    /**
     * Sets the value of the amtWthCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmtWthCcy(ActiveOrHistoricCurrencyAndAmount value) {
        this.amtWthCcy = value;
    }

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

}
