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

package org.jpos.iso20022.fxtr_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitTradeDetails4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SplitTradeDetails4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsDtls" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}TradeData16" minOccurs="0"/>
 *         <element name="TradAmts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}AmountsAndValueDate6"/>
 *         <element name="AgrdRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}AgreedRate3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitTradeDetails4", propOrder = {
    "stsDtls",
    "tradAmts",
    "agrdRate"
})
public class SplitTradeDetails4 {

    @XmlElement(name = "StsDtls")
    protected TradeData16 stsDtls;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate6 tradAmts;
    @XmlElement(name = "AgrdRate")
    protected AgreedRate3 agrdRate;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData16 }
     *     
     */
    public TradeData16 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData16 }
     *     
     */
    public void setStsDtls(TradeData16 value) {
        this.stsDtls = value;
    }

    /**
     * Gets the value of the tradAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate6 }
     *     
     */
    public AmountsAndValueDate6 getTradAmts() {
        return tradAmts;
    }

    /**
     * Sets the value of the tradAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate6 }
     *     
     */
    public void setTradAmts(AmountsAndValueDate6 value) {
        this.tradAmts = value;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public void setAgrdRate(AgreedRate3 value) {
        this.agrdRate = value;
    }

}
