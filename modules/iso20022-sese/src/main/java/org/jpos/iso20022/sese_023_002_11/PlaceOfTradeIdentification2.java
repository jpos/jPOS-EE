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

package org.jpos.iso20022.sese_023_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceOfTradeIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PlaceOfTradeIdentification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MktTpAndId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}MarketIdentification90" minOccurs="0"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}LEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfTradeIdentification2", propOrder = {
    "mktTpAndId",
    "lei"
})
public class PlaceOfTradeIdentification2 {

    @XmlElement(name = "MktTpAndId")
    protected MarketIdentification90 mktTpAndId;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the mktTpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification90 }
     *     
     */
    public MarketIdentification90 getMktTpAndId() {
        return mktTpAndId;
    }

    /**
     * Sets the value of the mktTpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification90 }
     *     
     */
    public void setMktTpAndId(MarketIdentification90 value) {
        this.mktTpAndId = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

}
