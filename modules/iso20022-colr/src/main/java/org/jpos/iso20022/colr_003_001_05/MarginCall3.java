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

package org.jpos.iso20022.colr_003_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCall3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCall3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollAcctId" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}CollateralAccount3" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}BlockChainAddressWallet5" minOccurs="0"/>
 *         <element name="MrgnCallRslt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCallResult3"/>
 *         <element name="MrgnDtlDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCall1" minOccurs="0"/>
 *         <element name="MrgnDtlDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginCall1" minOccurs="0"/>
 *         <element name="RqrmntDtlsDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginRequirement1Choice" minOccurs="0"/>
 *         <element name="RqrmntDtlsDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginRequirement1Choice" minOccurs="0"/>
 *         <element name="XpctdCollDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ExpectedCollateral2Choice" minOccurs="0"/>
 *         <element name="XpctdCollDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ExpectedCollateral2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCall3", propOrder = {
    "collAcctId",
    "blckChainAdrOrWllt",
    "mrgnCallRslt",
    "mrgnDtlDueToA",
    "mrgnDtlDueToB",
    "rqrmntDtlsDueToA",
    "rqrmntDtlsDueToB",
    "xpctdCollDueToA",
    "xpctdCollDueToB"
})
public class MarginCall3 {

    @XmlElement(name = "CollAcctId")
    protected CollateralAccount3 collAcctId;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet5 blckChainAdrOrWllt;
    @XmlElement(name = "MrgnCallRslt", required = true)
    protected MarginCallResult3 mrgnCallRslt;
    @XmlElement(name = "MrgnDtlDueToA")
    protected MarginCall1 mrgnDtlDueToA;
    @XmlElement(name = "MrgnDtlDueToB")
    protected MarginCall1 mrgnDtlDueToB;
    @XmlElement(name = "RqrmntDtlsDueToA")
    protected MarginRequirement1Choice rqrmntDtlsDueToA;
    @XmlElement(name = "RqrmntDtlsDueToB")
    protected MarginRequirement1Choice rqrmntDtlsDueToB;
    @XmlElement(name = "XpctdCollDueToA")
    protected ExpectedCollateral2Choice xpctdCollDueToA;
    @XmlElement(name = "XpctdCollDueToB")
    protected ExpectedCollateral2Choice xpctdCollDueToB;

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount3 }
     *     
     */
    public CollateralAccount3 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount3 }
     *     
     */
    public void setCollAcctId(CollateralAccount3 value) {
        this.collAcctId = value;
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
     * Gets the value of the mrgnCallRslt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResult3 }
     *     
     */
    public MarginCallResult3 getMrgnCallRslt() {
        return mrgnCallRslt;
    }

    /**
     * Sets the value of the mrgnCallRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResult3 }
     *     
     */
    public void setMrgnCallRslt(MarginCallResult3 value) {
        this.mrgnCallRslt = value;
    }

    /**
     * Gets the value of the mrgnDtlDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlDueToA() {
        return mrgnDtlDueToA;
    }

    /**
     * Sets the value of the mrgnDtlDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public void setMrgnDtlDueToA(MarginCall1 value) {
        this.mrgnDtlDueToA = value;
    }

    /**
     * Gets the value of the mrgnDtlDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCall1 }
     *     
     */
    public MarginCall1 getMrgnDtlDueToB() {
        return mrgnDtlDueToB;
    }

    /**
     * Sets the value of the mrgnDtlDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCall1 }
     *     
     */
    public void setMrgnDtlDueToB(MarginCall1 value) {
        this.mrgnDtlDueToB = value;
    }

    /**
     * Gets the value of the rqrmntDtlsDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToA() {
        return rqrmntDtlsDueToA;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public void setRqrmntDtlsDueToA(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToA = value;
    }

    /**
     * Gets the value of the rqrmntDtlsDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public MarginRequirement1Choice getRqrmntDtlsDueToB() {
        return rqrmntDtlsDueToB;
    }

    /**
     * Sets the value of the rqrmntDtlsDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1Choice }
     *     
     */
    public void setRqrmntDtlsDueToB(MarginRequirement1Choice value) {
        this.rqrmntDtlsDueToB = value;
    }

    /**
     * Gets the value of the xpctdCollDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public ExpectedCollateral2Choice getXpctdCollDueToA() {
        return xpctdCollDueToA;
    }

    /**
     * Sets the value of the xpctdCollDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public void setXpctdCollDueToA(ExpectedCollateral2Choice value) {
        this.xpctdCollDueToA = value;
    }

    /**
     * Gets the value of the xpctdCollDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public ExpectedCollateral2Choice getXpctdCollDueToB() {
        return xpctdCollDueToB;
    }

    /**
     * Sets the value of the xpctdCollDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral2Choice }
     *     
     */
    public void setXpctdCollDueToB(ExpectedCollateral2Choice value) {
        this.xpctdCollDueToB = value;
    }

}
