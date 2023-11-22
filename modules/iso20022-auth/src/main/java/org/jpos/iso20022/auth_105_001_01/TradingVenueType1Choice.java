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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingVenueType1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradingVenueType1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="OnVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TradeMarket2Code"/>
 *         <element name="OffVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}NoReasonCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueType1Choice", propOrder = {
    "onVn",
    "offVn"
})
public class TradingVenueType1Choice {

    @XmlElement(name = "OnVn")
    @XmlSchemaType(name = "string")
    protected TradeMarket2Code onVn;
    @XmlElement(name = "OffVn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode offVn;

    /**
     * Gets the value of the onVn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarket2Code }
     *     
     */
    public TradeMarket2Code getOnVn() {
        return onVn;
    }

    /**
     * Sets the value of the onVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarket2Code }
     *     
     */
    public void setOnVn(TradeMarket2Code value) {
        this.onVn = value;
    }

    /**
     * Gets the value of the offVn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getOffVn() {
        return offVn;
    }

    /**
     * Sets the value of the offVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setOffVn(NoReasonCode value) {
        this.offVn = value;
    }

}
