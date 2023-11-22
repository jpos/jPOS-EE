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

package org.jpos.iso20022.setr_029_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherParties45 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherParties45">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}PartyIdentificationAndAccount220" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StockXchg" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}PartyIdentificationAndAccount152" minOccurs="0"/>
 *         <element name="TradRgltr" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}PartyIdentificationAndAccount152" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}PartyIdentificationAndAccount154" minOccurs="0"/>
 *         <element name="QlfdFrgnIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:setr.029.001.02}PartyIdentificationAndAccount221" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties45", propOrder = {
    "invstr",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "qlfdFrgnIntrmy"
})
public class OtherParties45 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount220> invstr;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount152 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount152 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount154 trptyAgt;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount221 qlfdFrgnIntrmy;

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
     * {@link PartyIdentificationAndAccount220 }
     * 
     * 
     * @return
     *     The value of the invstr property.
     */
    public List<PartyIdentificationAndAccount220> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<>();
        }
        return this.invstr;
    }

    /**
     * Gets the value of the stockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public PartyIdentificationAndAccount152 getStockXchg() {
        return stockXchg;
    }

    /**
     * Sets the value of the stockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public void setStockXchg(PartyIdentificationAndAccount152 value) {
        this.stockXchg = value;
    }

    /**
     * Gets the value of the tradRgltr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public PartyIdentificationAndAccount152 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Sets the value of the tradRgltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount152 }
     *     
     */
    public void setTradRgltr(PartyIdentificationAndAccount152 value) {
        this.tradRgltr = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount154 }
     *     
     */
    public PartyIdentificationAndAccount154 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount154 }
     *     
     */
    public void setTrptyAgt(PartyIdentificationAndAccount154 value) {
        this.trptyAgt = value;
    }

    /**
     * Gets the value of the qlfdFrgnIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount221 }
     *     
     */
    public PartyIdentificationAndAccount221 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Sets the value of the qlfdFrgnIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount221 }
     *     
     */
    public void setQlfdFrgnIntrmy(PartyIdentificationAndAccount221 value) {
        this.qlfdFrgnIntrmy = value;
    }

}
