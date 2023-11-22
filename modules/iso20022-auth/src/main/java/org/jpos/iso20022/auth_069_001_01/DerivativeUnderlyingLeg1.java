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

package org.jpos.iso20022.auth_069_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeUnderlyingLeg1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivativeUnderlyingLeg1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}FinancialInstrumentAttributes88"/>
 *         <element name="DfndAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}DefinedAttributes1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeUnderlyingLeg1", propOrder = {
    "ctrctAttrbts",
    "dfndAttrbts"
})
public class DerivativeUnderlyingLeg1 {

    @XmlElement(name = "CtrctAttrbts", required = true)
    protected FinancialInstrumentAttributes88 ctrctAttrbts;
    @XmlElement(name = "DfndAttrbts")
    protected DefinedAttributes1Choice dfndAttrbts;

    /**
     * Gets the value of the ctrctAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes88 }
     *     
     */
    public FinancialInstrumentAttributes88 getCtrctAttrbts() {
        return ctrctAttrbts;
    }

    /**
     * Sets the value of the ctrctAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes88 }
     *     
     */
    public void setCtrctAttrbts(FinancialInstrumentAttributes88 value) {
        this.ctrctAttrbts = value;
    }

    /**
     * Gets the value of the dfndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DefinedAttributes1Choice }
     *     
     */
    public DefinedAttributes1Choice getDfndAttrbts() {
        return dfndAttrbts;
    }

    /**
     * Sets the value of the dfndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinedAttributes1Choice }
     *     
     */
    public void setDfndAttrbts(DefinedAttributes1Choice value) {
        this.dfndAttrbts = value;
    }

}
