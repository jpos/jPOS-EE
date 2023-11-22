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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralParties11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralParties11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PartyIdentification232"/>
 *         <element name="ClntPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PartyIdentification232" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="CollAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BlockChainAddressWallet3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties11", propOrder = {
    "ptyB",
    "clntPtyB",
    "trptyAgt",
    "collAcct",
    "blckChainAdrOrWllt"
})
public class CollateralParties11 {

    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification232 ptyB;
    @XmlElement(name = "ClntPtyB")
    protected PartyIdentification232 clntPtyB;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification136 trptyAgt;
    @XmlElement(name = "CollAcct")
    protected SecuritiesAccount19 collAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setPtyB(PartyIdentification232 value) {
        this.ptyB = value;
    }

    /**
     * Gets the value of the clntPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getClntPtyB() {
        return clntPtyB;
    }

    /**
     * Sets the value of the clntPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setClntPtyB(PartyIdentification232 value) {
        this.clntPtyB = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setTrptyAgt(PartyIdentification136 value) {
        this.trptyAgt = value;
    }

    /**
     * Gets the value of the collAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getCollAcct() {
        return collAcct;
    }

    /**
     * Sets the value of the collAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setCollAcct(SecuritiesAccount19 value) {
        this.collAcct = value;
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

}
