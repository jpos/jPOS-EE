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

package org.jpos.iso20022.sese_012_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrument63Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrument63Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}FinancialInstrumentIdentification2"/>
 *         <element name="CshAsst" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}CashAsset3"/>
 *         <element name="OthrAsst" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}OtherAsset2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument63Choice", propOrder = {
    "scty",
    "cshAsst",
    "othrAsst"
})
public class FinancialInstrument63Choice {

    @XmlElement(name = "Scty")
    protected FinancialInstrumentIdentification2 scty;
    @XmlElement(name = "CshAsst")
    protected CashAsset3 cshAsst;
    @XmlElement(name = "OthrAsst")
    protected OtherAsset2 othrAsst;

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification2 }
     *     
     */
    public FinancialInstrumentIdentification2 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification2 }
     *     
     */
    public void setScty(FinancialInstrumentIdentification2 value) {
        this.scty = value;
    }

    /**
     * Gets the value of the cshAsst property.
     * 
     * @return
     *     possible object is
     *     {@link CashAsset3 }
     *     
     */
    public CashAsset3 getCshAsst() {
        return cshAsst;
    }

    /**
     * Sets the value of the cshAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAsset3 }
     *     
     */
    public void setCshAsst(CashAsset3 value) {
        this.cshAsst = value;
    }

    /**
     * Gets the value of the othrAsst property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAsset2 }
     *     
     */
    public OtherAsset2 getOthrAsst() {
        return othrAsst;
    }

    /**
     * Sets the value of the othrAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAsset2 }
     *     
     */
    public void setOthrAsst(OtherAsset2 value) {
        this.othrAsst = value;
    }

}
