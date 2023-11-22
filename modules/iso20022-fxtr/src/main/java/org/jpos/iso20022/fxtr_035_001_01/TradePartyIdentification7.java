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

package org.jpos.iso20022.fxtr_035_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradePartyIdentification7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradePartyIdentification7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FndInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}FundIdentification3" minOccurs="0"/>
 *         <element name="BuyrOrSellrInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}OptionParty1Code"/>
 *         <element name="InitrInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}OptionParty3Code"/>
 *         <element name="TradPtyId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}PartyIdentification78"/>
 *         <element name="SubmitgPty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}PartyIdentificationAndAccount119"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyIdentification7", propOrder = {
    "fndInf",
    "buyrOrSellrInd",
    "initrInd",
    "tradPtyId",
    "submitgPty"
})
public class TradePartyIdentification7 {

    @XmlElement(name = "FndInf")
    protected FundIdentification3 fndInf;
    @XmlElement(name = "BuyrOrSellrInd", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty1Code buyrOrSellrInd;
    @XmlElement(name = "InitrInd", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty3Code initrInd;
    @XmlElement(name = "TradPtyId", required = true)
    protected PartyIdentification78 tradPtyId;
    @XmlElement(name = "SubmitgPty", required = true)
    protected PartyIdentificationAndAccount119 submitgPty;

    /**
     * Gets the value of the fndInf property.
     * 
     * @return
     *     possible object is
     *     {@link FundIdentification3 }
     *     
     */
    public FundIdentification3 getFndInf() {
        return fndInf;
    }

    /**
     * Sets the value of the fndInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundIdentification3 }
     *     
     */
    public void setFndInf(FundIdentification3 value) {
        this.fndInf = value;
    }

    /**
     * Gets the value of the buyrOrSellrInd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getBuyrOrSellrInd() {
        return buyrOrSellrInd;
    }

    /**
     * Sets the value of the buyrOrSellrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public void setBuyrOrSellrInd(OptionParty1Code value) {
        this.buyrOrSellrInd = value;
    }

    /**
     * Gets the value of the initrInd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Code }
     *     
     */
    public OptionParty3Code getInitrInd() {
        return initrInd;
    }

    /**
     * Sets the value of the initrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Code }
     *     
     */
    public void setInitrInd(OptionParty3Code value) {
        this.initrInd = value;
    }

    /**
     * Gets the value of the tradPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification78 }
     *     
     */
    public PartyIdentification78 getTradPtyId() {
        return tradPtyId;
    }

    /**
     * Sets the value of the tradPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification78 }
     *     
     */
    public void setTradPtyId(PartyIdentification78 value) {
        this.tradPtyId = value;
    }

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount119 }
     *     
     */
    public PartyIdentificationAndAccount119 getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount119 }
     *     
     */
    public void setSubmitgPty(PartyIdentificationAndAccount119 value) {
        this.submitgPty = value;
    }

}
