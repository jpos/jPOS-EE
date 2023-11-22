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

package org.jpos.iso20022.secl_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonGuaranteedTrade3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonGuaranteedTrade3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradCtrPtyMmbId" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}PartyIdentification35Choice"/>
 *         <element name="TradCtrPtyClrMmbId" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}PartyIdentification35Choice"/>
 *         <element name="DlvrgPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}DeliveringPartiesAndAccount11" minOccurs="0"/>
 *         <element name="RcvgPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}ReceivingPartiesAndAccount11" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonGuaranteedTrade3", propOrder = {
    "tradCtrPtyMmbId",
    "tradCtrPtyClrMmbId",
    "dlvrgPties",
    "rcvgPties"
})
public class NonGuaranteedTrade3 {

    @XmlElement(name = "TradCtrPtyMmbId", required = true)
    protected PartyIdentification35Choice tradCtrPtyMmbId;
    @XmlElement(name = "TradCtrPtyClrMmbId", required = true)
    protected PartyIdentification35Choice tradCtrPtyClrMmbId;
    @XmlElement(name = "DlvrgPties")
    protected DeliveringPartiesAndAccount11 dlvrgPties;
    @XmlElement(name = "RcvgPties")
    protected ReceivingPartiesAndAccount11 rcvgPties;

    /**
     * Gets the value of the tradCtrPtyMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getTradCtrPtyMmbId() {
        return tradCtrPtyMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setTradCtrPtyMmbId(PartyIdentification35Choice value) {
        this.tradCtrPtyMmbId = value;
    }

    /**
     * Gets the value of the tradCtrPtyClrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getTradCtrPtyClrMmbId() {
        return tradCtrPtyClrMmbId;
    }

    /**
     * Sets the value of the tradCtrPtyClrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setTradCtrPtyClrMmbId(PartyIdentification35Choice value) {
        this.tradCtrPtyClrMmbId = value;
    }

    /**
     * Gets the value of the dlvrgPties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount11 }
     *     
     */
    public DeliveringPartiesAndAccount11 getDlvrgPties() {
        return dlvrgPties;
    }

    /**
     * Sets the value of the dlvrgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount11 }
     *     
     */
    public void setDlvrgPties(DeliveringPartiesAndAccount11 value) {
        this.dlvrgPties = value;
    }

    /**
     * Gets the value of the rcvgPties property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount11 }
     *     
     */
    public ReceivingPartiesAndAccount11 getRcvgPties() {
        return rcvgPties;
    }

    /**
     * Sets the value of the rcvgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount11 }
     *     
     */
    public void setRcvgPties(ReceivingPartiesAndAccount11 value) {
        this.rcvgPties = value;
    }

}
