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

package org.jpos.iso20022.sese_023_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherParties43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherParties43">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.11}PartyIdentificationAndAccount197" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QlfdFrgnIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.11}PartyIdentificationAndAccount198" minOccurs="0"/>
 *         <element name="StockXchg" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.11}PartyIdentificationAndAccount165" minOccurs="0"/>
 *         <element name="TradRgltr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.11}PartyIdentificationAndAccount165" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.11}PartyIdentificationAndAccount198" minOccurs="0"/>
 *         <element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.11}PartyIdentificationAndAccount198" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties43", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "brkr"
})
public class OtherParties43 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount197> invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount198 qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount165 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount165 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount198 trptyAgt;
    @XmlElement(name = "Brkr")
    protected PartyIdentificationAndAccount198 brkr;

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount197 }
     * 
     * 
     * @return
     *     The value of the invstr property.
     */
    public List<PartyIdentificationAndAccount197> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<>();
        }
        return this.invstr;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount198 }
     *     
     */
    public PartyIdentificationAndAccount198 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount198 }
     *     
     */
    public void setQlfdFrgnIntrmy(PartyIdentificationAndAccount198 value) {
        this.qlfdFrgnIntrmy = value;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public PartyIdentificationAndAccount165 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public void setStockXchg(PartyIdentificationAndAccount165 value) {
        this.stockXchg = value;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public PartyIdentificationAndAccount165 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public void setTradRgltr(PartyIdentificationAndAccount165 value) {
        this.tradRgltr = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount198 }
     *     
     */
    public PartyIdentificationAndAccount198 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount198 }
     *     
     */
    public void setTrptyAgt(PartyIdentificationAndAccount198 value) {
        this.trptyAgt = value;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount198 }
     *     
     */
    public PartyIdentificationAndAccount198 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount198 }
     *     
     */
    public void setBrkr(PartyIdentificationAndAccount198 value) {
        this.brkr = value;
    }

}
