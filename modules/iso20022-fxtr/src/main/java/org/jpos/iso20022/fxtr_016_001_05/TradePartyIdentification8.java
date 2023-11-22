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

package org.jpos.iso20022.fxtr_016_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradePartyIdentification8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradePartyIdentification8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubmitgPty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PartyIdentification242Choice"/>
 *         <element name="TradPty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="FndId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}FundIdentification5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentification8", propOrder = {
    "submitgPty",
    "tradPty",
    "fndId"
})
public class TradePartyIdentification8 {

    @XmlElement(name = "SubmitgPty", required = true)
    protected PartyIdentification242Choice submitgPty;
    @XmlElement(name = "TradPty")
    protected PartyIdentification242Choice tradPty;
    @XmlElement(name = "FndId")
    protected List<FundIdentification5> fndId;

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setSubmitgPty(PartyIdentification242Choice value) {
        this.submitgPty = value;
    }

    /**
     * Gets the value of the tradPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getTradPty() {
        return tradPty;
    }

    /**
     * Sets the value of the tradPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setTradPty(PartyIdentification242Choice value) {
        this.tradPty = value;
    }

    /**
     * Gets the value of the fndId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundIdentification5 }
     * 
     * 
     * @return
     *     The value of the fndId property.
     */
    public List<FundIdentification5> getFndId() {
        if (fndId == null) {
            fndId = new ArrayList<>();
        }
        return this.fndId;
    }

}
