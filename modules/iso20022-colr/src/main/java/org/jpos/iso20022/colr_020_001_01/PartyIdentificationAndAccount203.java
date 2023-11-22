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

package org.jpos.iso20022.colr_020_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount203 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount203">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}PartyIdentification120Choice"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}LEIIdentifier" minOccurs="0"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}AlternatePartyIdentification7" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="PtyCpcty" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}TradingPartyCapacity5Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount203", propOrder = {
    "id",
    "lei",
    "altrnId",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "ptyCpcty"
})
public class PartyIdentificationAndAccount203 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification120Choice id;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification7 altrnId;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "PtyCpcty")
    protected TradingPartyCapacity5Choice ptyCpcty;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public PartyIdentification120Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public void setId(PartyIdentification120Choice value) {
        this.id = value;
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

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public AlternatePartyIdentification7 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification7 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the ptyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingPartyCapacity5Choice }
     *     
     */
    public TradingPartyCapacity5Choice getPtyCpcty() {
        return ptyCpcty;
    }

    /**
     * Sets the value of the ptyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingPartyCapacity5Choice }
     *     
     */
    public void setPtyCpcty(TradingPartyCapacity5Choice value) {
        this.ptyCpcty = value;
    }

}
