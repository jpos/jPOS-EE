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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveOrHistoricAmountRange2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ActiveOrHistoricAmountRange2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ImpldCcyAndAmtRg" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ImpliedCurrencyAndAmountRange1"/>
 *         <element name="CcyAndAmtRg" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ActiveOrHistoricCurrencyAndAmountRange2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveOrHistoricAmountRange2Choice", propOrder = {
    "impldCcyAndAmtRg",
    "ccyAndAmtRg"
})
public class ActiveOrHistoricAmountRange2Choice {

    @XmlElement(name = "ImpldCcyAndAmtRg")
    protected ImpliedCurrencyAndAmountRange1 impldCcyAndAmtRg;
    @XmlElement(name = "CcyAndAmtRg")
    protected ActiveOrHistoricCurrencyAndAmountRange2 ccyAndAmtRg;

    /**
     * Gets the value of the impldCcyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAndAmountRange1 }
     *     
     */
    public ImpliedCurrencyAndAmountRange1 getImpldCcyAndAmtRg() {
        return impldCcyAndAmtRg;
    }

    /**
     * Sets the value of the impldCcyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAndAmountRange1 }
     *     
     */
    public void setImpldCcyAndAmtRg(ImpliedCurrencyAndAmountRange1 value) {
        this.impldCcyAndAmtRg = value;
    }

    /**
     * Gets the value of the ccyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange2 }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmountRange2 getCcyAndAmtRg() {
        return ccyAndAmtRg;
    }

    /**
     * Sets the value of the ccyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange2 }
     *     
     */
    public void setCcyAndAmtRg(ActiveOrHistoricCurrencyAndAmountRange2 value) {
        this.ccyAndAmtRg = value;
    }

}
