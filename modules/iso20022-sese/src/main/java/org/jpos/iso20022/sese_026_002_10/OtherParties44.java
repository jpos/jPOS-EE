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

package org.jpos.iso20022.sese_026_002_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherParties44 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherParties44">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount208" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="QlfdFrgnIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount209" minOccurs="0"/>
 *         <element name="StockXchg" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount181" minOccurs="0"/>
 *         <element name="TradRgltr" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount181" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount209" minOccurs="0"/>
 *         <element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount209" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties44", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "brkr"
})
public class OtherParties44 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount208> invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount209 qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount181 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount181 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount209 trptyAgt;
    @XmlElement(name = "Brkr")
    protected PartyIdentificationAndAccount209 brkr;

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
     * {@link PartyIdentificationAndAccount208 }
     * 
     * 
     * @return
     *     The value of the invstr property.
     */
    public List<PartyIdentificationAndAccount208> getInvstr() {
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
     *     {@link PartyIdentificationAndAccount209 }
     *     
     */
    public PartyIdentificationAndAccount209 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount209 }
     *     
     */
    public void setQlfdFrgnIntrmy(PartyIdentificationAndAccount209 value) {
        this.qlfdFrgnIntrmy = value;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public PartyIdentificationAndAccount181 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public void setStockXchg(PartyIdentificationAndAccount181 value) {
        this.stockXchg = value;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public PartyIdentificationAndAccount181 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount181 }
     *     
     */
    public void setTradRgltr(PartyIdentificationAndAccount181 value) {
        this.tradRgltr = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount209 }
     *     
     */
    public PartyIdentificationAndAccount209 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount209 }
     *     
     */
    public void setTrptyAgt(PartyIdentificationAndAccount209 value) {
        this.trptyAgt = value;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount209 }
     *     
     */
    public PartyIdentificationAndAccount209 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount209 }
     *     
     */
    public void setBrkr(PartyIdentificationAndAccount209 value) {
        this.brkr = value;
    }

}
