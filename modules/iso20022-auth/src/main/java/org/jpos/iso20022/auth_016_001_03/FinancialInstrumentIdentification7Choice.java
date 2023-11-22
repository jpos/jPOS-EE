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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentIdentification7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentIdentification7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Sngl" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}FinancialInstrumentIdentification6Choice"/>
 *         <element name="Bskt" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}BasketDescription3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification7Choice", propOrder = {
    "sngl",
    "bskt"
})
public class FinancialInstrumentIdentification7Choice {

    @XmlElement(name = "Sngl")
    protected FinancialInstrumentIdentification6Choice sngl;
    @XmlElement(name = "Bskt")
    protected BasketDescription3 bskt;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification6Choice }
     *     
     */
    public FinancialInstrumentIdentification6Choice getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification6Choice }
     *     
     */
    public void setSngl(FinancialInstrumentIdentification6Choice value) {
        this.sngl = value;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link BasketDescription3 }
     *     
     */
    public BasketDescription3 getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketDescription3 }
     *     
     */
    public void setBskt(BasketDescription3 value) {
        this.bskt = value;
    }

}
