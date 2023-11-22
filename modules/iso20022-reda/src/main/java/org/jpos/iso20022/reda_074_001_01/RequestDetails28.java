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

package org.jpos.iso20022.reda_074_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestDetails28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestDetails28">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rmvl" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}RemovalTypeAndReason1"/>
 *         <element name="FinInstrmAndAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}RemovalProcessing2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtrPty" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}CollateralParties4" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Reference21" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails28", propOrder = {
    "rmvl",
    "finInstrmAndAttrbts",
    "ctrPty",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "ref"
})
public class RequestDetails28 {

    @XmlElement(name = "Rmvl", required = true)
    protected RemovalTypeAndReason1 rmvl;
    @XmlElement(name = "FinInstrmAndAttrbts")
    protected List<RemovalProcessing2Choice> finInstrmAndAttrbts;
    @XmlElement(name = "CtrPty")
    protected CollateralParties4 ctrPty;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "Ref")
    protected Reference21 ref;

    /**
     * Gets the value of the rmvl property.
     * 
     * @return
     *     possible object is
     *     {@link RemovalTypeAndReason1 }
     *     
     */
    public RemovalTypeAndReason1 getRmvl() {
        return rmvl;
    }

    /**
     * Sets the value of the rmvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemovalTypeAndReason1 }
     *     
     */
    public void setRmvl(RemovalTypeAndReason1 value) {
        this.rmvl = value;
    }

    /**
     * Gets the value of the finInstrmAndAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAndAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAndAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemovalProcessing2Choice }
     * 
     * 
     * @return
     *     The value of the finInstrmAndAttrbts property.
     */
    public List<RemovalProcessing2Choice> getFinInstrmAndAttrbts() {
        if (finInstrmAndAttrbts == null) {
            finInstrmAndAttrbts = new ArrayList<>();
        }
        return this.finInstrmAndAttrbts;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties4 }
     *     
     */
    public CollateralParties4 getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties4 }
     *     
     */
    public void setCtrPty(CollateralParties4 value) {
        this.ctrPty = value;
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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Reference21 }
     *     
     */
    public Reference21 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference21 }
     *     
     */
    public void setRef(Reference21 value) {
        this.ref = value;
    }

}
