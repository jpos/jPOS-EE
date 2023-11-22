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
 * <p>Java class for SecurityInstrumentDescription22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityInstrumentDescription22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmGnlAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecurityInstrumentDescription23"/>
 *         <element name="DebtInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}DebtInstrument4" minOccurs="0"/>
 *         <element name="DerivInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}DerivativeInstrument6"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInstrumentDescription22", propOrder = {
    "finInstrmGnlAttrbts",
    "debtInstrmAttrbts",
    "derivInstrmAttrbts"
})
public class SecurityInstrumentDescription22 {

    @XmlElement(name = "FinInstrmGnlAttrbts", required = true)
    protected SecurityInstrumentDescription23 finInstrmGnlAttrbts;
    @XmlElement(name = "DebtInstrmAttrbts")
    protected DebtInstrument4 debtInstrmAttrbts;
    @XmlElement(name = "DerivInstrmAttrbts", required = true)
    protected DerivativeInstrument6 derivInstrmAttrbts;

    /**
     * Gets the value of the finInstrmGnlAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription23 }
     *     
     */
    public SecurityInstrumentDescription23 getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    /**
     * Sets the value of the finInstrmGnlAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription23 }
     *     
     */
    public void setFinInstrmGnlAttrbts(SecurityInstrumentDescription23 value) {
        this.finInstrmGnlAttrbts = value;
    }

    /**
     * Gets the value of the debtInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument4 }
     *     
     */
    public DebtInstrument4 getDebtInstrmAttrbts() {
        return debtInstrmAttrbts;
    }

    /**
     * Sets the value of the debtInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument4 }
     *     
     */
    public void setDebtInstrmAttrbts(DebtInstrument4 value) {
        this.debtInstrmAttrbts = value;
    }

    /**
     * Gets the value of the derivInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrument6 }
     *     
     */
    public DerivativeInstrument6 getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    /**
     * Sets the value of the derivInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrument6 }
     *     
     */
    public void setDerivInstrmAttrbts(DerivativeInstrument6 value) {
        this.derivInstrmAttrbts = value;
    }

}
