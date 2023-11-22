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

package org.jpos.iso20022.camt_078_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountRangeBoundary1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountRangeBoundary1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BdryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}ImpliedCurrencyAndAmount"/>
 *         <element name="Incl" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountRangeBoundary1", propOrder = {
    "bdryAmt",
    "incl"
})
public class AmountRangeBoundary1 {

    @XmlElement(name = "BdryAmt", required = true)
    protected BigDecimal bdryAmt;
    @XmlElement(name = "Incl")
    protected boolean incl;

    /**
     * Gets the value of the bdryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBdryAmt() {
        return bdryAmt;
    }

    /**
     * Sets the value of the bdryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBdryAmt(BigDecimal value) {
        this.bdryAmt = value;
    }

    /**
     * Gets the value of the incl property.
     * 
     */
    public boolean isIncl() {
        return incl;
    }

    /**
     * Sets the value of the incl property.
     * 
     */
    public void setIncl(boolean value) {
        this.incl = value;
    }

}
