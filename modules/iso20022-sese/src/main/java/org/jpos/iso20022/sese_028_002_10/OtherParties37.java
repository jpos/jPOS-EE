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

package org.jpos.iso20022.sese_028_002_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherParties37 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherParties37">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PartyIdentification170" minOccurs="0"/>
 *         <element name="QlfdFrgnIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PartyIdentification157" minOccurs="0"/>
 *         <element name="StockXchg" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PartyIdentification157" minOccurs="0"/>
 *         <element name="TradRgltr" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PartyIdentification157" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PartyIdentification157" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties37", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt"
})
public class OtherParties37 {

    @XmlElement(name = "Invstr")
    protected PartyIdentification170 invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentification157 qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentification157 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentification157 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification157 trptyAgt;

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification170 }
     *     
     */
    public PartyIdentification170 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification170 }
     *     
     */
    public void setInvstr(PartyIdentification170 value) {
        this.invstr = value;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification157 }
     *     
     */
    public PartyIdentification157 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification157 }
     *     
     */
    public void setQlfdFrgnIntrmy(PartyIdentification157 value) {
        this.qlfdFrgnIntrmy = value;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification157 }
     *     
     */
    public PartyIdentification157 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification157 }
     *     
     */
    public void setStockXchg(PartyIdentification157 value) {
        this.stockXchg = value;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification157 }
     *     
     */
    public PartyIdentification157 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification157 }
     *     
     */
    public void setTradRgltr(PartyIdentification157 value) {
        this.tradRgltr = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification157 }
     *     
     */
    public PartyIdentification157 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification157 }
     *     
     */
    public void setTrptyAgt(PartyIdentification157 value) {
        this.trptyAgt = value;
    }

}
