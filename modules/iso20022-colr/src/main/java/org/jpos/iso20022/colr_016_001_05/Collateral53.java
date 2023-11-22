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

package org.jpos.iso20022.colr_016_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Collateral53 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Collateral53">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CollateralAccount3" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}BlockChainAddressWallet5" minOccurs="0"/>
 *         <element name="RptSummry" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Summary3"/>
 *         <element name="CollValtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CollateralValuation13" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral53", propOrder = {
    "acctId",
    "blckChainAdrOrWllt",
    "rptSummry",
    "collValtn"
})
public class Collateral53 {

    @XmlElement(name = "AcctId")
    protected CollateralAccount3 acctId;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet5 blckChainAdrOrWllt;
    @XmlElement(name = "RptSummry", required = true)
    protected Summary3 rptSummry;
    @XmlElement(name = "CollValtn")
    protected List<CollateralValuation13> collValtn;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount3 }
     *     
     */
    public CollateralAccount3 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount3 }
     *     
     */
    public void setAcctId(CollateralAccount3 value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public BlockChainAddressWallet5 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet5 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the rptSummry property.
     * 
     * @return
     *     possible object is
     *     {@link Summary3 }
     *     
     */
    public Summary3 getRptSummry() {
        return rptSummry;
    }

    /**
     * Sets the value of the rptSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary3 }
     *     
     */
    public void setRptSummry(Summary3 value) {
        this.rptSummry = value;
    }

    /**
     * Gets the value of the collValtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collValtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollValtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation13 }
     * 
     * 
     * @return
     *     The value of the collValtn property.
     */
    public List<CollateralValuation13> getCollValtn() {
        if (collValtn == null) {
            collValtn = new ArrayList<>();
        }
        return this.collValtn;
    }

}
