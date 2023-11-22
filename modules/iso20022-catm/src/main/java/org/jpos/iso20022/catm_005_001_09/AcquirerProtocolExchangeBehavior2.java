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

package org.jpos.iso20022.catm_005_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcquirerProtocolExchangeBehavior2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcquirerProtocolExchangeBehavior2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinCaptr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}FinancialCapture1Code"/>
 *         <element name="BtchTrf" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ExchangeConfiguration9" minOccurs="0"/>
 *         <element name="CmpltnXchg" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ExchangeConfiguration10" minOccurs="0"/>
 *         <element name="CxlXchg" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}CancellationProcess2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerProtocolExchangeBehavior2", propOrder = {
    "finCaptr",
    "btchTrf",
    "cmpltnXchg",
    "cxlXchg"
})
public class AcquirerProtocolExchangeBehavior2 {

    @XmlElement(name = "FinCaptr", required = true)
    @XmlSchemaType(name = "string")
    protected FinancialCapture1Code finCaptr;
    @XmlElement(name = "BtchTrf")
    protected ExchangeConfiguration9 btchTrf;
    @XmlElement(name = "CmpltnXchg")
    protected ExchangeConfiguration10 cmpltnXchg;
    @XmlElement(name = "CxlXchg")
    @XmlSchemaType(name = "string")
    protected CancellationProcess2Code cxlXchg;

    /**
     * Gets the value of the finCaptr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialCapture1Code }
     *     
     */
    public FinancialCapture1Code getFinCaptr() {
        return finCaptr;
    }

    /**
     * Sets the value of the finCaptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialCapture1Code }
     *     
     */
    public void setFinCaptr(FinancialCapture1Code value) {
        this.finCaptr = value;
    }

    /**
     * Gets the value of the btchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration9 }
     *     
     */
    public ExchangeConfiguration9 getBtchTrf() {
        return btchTrf;
    }

    /**
     * Sets the value of the btchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration9 }
     *     
     */
    public void setBtchTrf(ExchangeConfiguration9 value) {
        this.btchTrf = value;
    }

    /**
     * Gets the value of the cmpltnXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration10 }
     *     
     */
    public ExchangeConfiguration10 getCmpltnXchg() {
        return cmpltnXchg;
    }

    /**
     * Sets the value of the cmpltnXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration10 }
     *     
     */
    public void setCmpltnXchg(ExchangeConfiguration10 value) {
        this.cmpltnXchg = value;
    }

    /**
     * Gets the value of the cxlXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcess2Code }
     *     
     */
    public CancellationProcess2Code getCxlXchg() {
        return cxlXchg;
    }

    /**
     * Sets the value of the cxlXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcess2Code }
     *     
     */
    public void setCxlXchg(CancellationProcess2Code value) {
        this.cxlXchg = value;
    }

}
