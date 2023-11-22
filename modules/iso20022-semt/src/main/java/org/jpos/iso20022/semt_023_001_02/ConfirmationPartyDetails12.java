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

package org.jpos.iso20022.semt_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationPartyDetails12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConfirmationPartyDetails12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}PartyIdentification240Choice"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}AlternatePartyIdentification8" minOccurs="0"/>
 *         <element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}PartyTextInformation5" minOccurs="0"/>
 *         <element name="InvstrCpcty" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}InvestorCapacity4Choice" minOccurs="0"/>
 *         <element name="TradgPtyCpcty" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}TradingPartyCapacity4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationPartyDetails12", propOrder = {
    "id",
    "altrnId",
    "prcgId",
    "addtlInf",
    "invstrCpcty",
    "tradgPtyCpcty"
})
public class ConfirmationPartyDetails12 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification240Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification8 altrnId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation5 addtlInf;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity4Choice invstrCpcty;
    @XmlElement(name = "TradgPtyCpcty")
    protected TradingPartyCapacity4Choice tradgPtyCpcty;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification240Choice }
     *     
     */
    public PartyIdentification240Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification240Choice }
     *     
     */
    public void setId(PartyIdentification240Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public AlternatePartyIdentification8 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification8 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the prcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgId() {
        return prcgId;
    }

    /**
     * Sets the value of the prcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcgId(String value) {
        this.prcgId = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public PartyTextInformation5 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public void setAddtlInf(PartyTextInformation5 value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the invstrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public InvestorCapacity4Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public void setInvstrCpcty(InvestorCapacity4Choice value) {
        this.invstrCpcty = value;
    }

    /**
     * Gets the value of the tradgPtyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingPartyCapacity4Choice }
     *     
     */
    public TradingPartyCapacity4Choice getTradgPtyCpcty() {
        return tradgPtyCpcty;
    }

    /**
     * Sets the value of the tradgPtyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingPartyCapacity4Choice }
     *     
     */
    public void setTradgPtyCpcty(TradingPartyCapacity4Choice value) {
        this.tradgPtyCpcty = value;
    }

}
