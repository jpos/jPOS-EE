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

package org.jpos.iso20022.caaa_025_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyResult3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyResult3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}LoyaltyAccount3"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}LoyaltyAmount1" minOccurs="0"/>
 *         <element name="SvrData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}LoyaltyServerData1" minOccurs="0"/>
 *         <element name="Rbts" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}LoyaltyRebates1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyResult3", propOrder = {
    "acct",
    "amt",
    "svrData",
    "rbts"
})
public class LoyaltyResult3 {

    @XmlElement(name = "Acct", required = true)
    protected LoyaltyAccount3 acct;
    @XmlElement(name = "Amt")
    protected LoyaltyAmount1 amt;
    @XmlElement(name = "SvrData")
    protected LoyaltyServerData1 svrData;
    @XmlElement(name = "Rbts")
    protected LoyaltyRebates1 rbts;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public LoyaltyAccount3 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccount3 }
     *     
     */
    public void setAcct(LoyaltyAccount3 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAmount1 }
     *     
     */
    public LoyaltyAmount1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAmount1 }
     *     
     */
    public void setAmt(LoyaltyAmount1 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the svrData property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyServerData1 }
     *     
     */
    public LoyaltyServerData1 getSvrData() {
        return svrData;
    }

    /**
     * Sets the value of the svrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyServerData1 }
     *     
     */
    public void setSvrData(LoyaltyServerData1 value) {
        this.svrData = value;
    }

    /**
     * Gets the value of the rbts property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRebates1 }
     *     
     */
    public LoyaltyRebates1 getRbts() {
        return rbts;
    }

    /**
     * Sets the value of the rbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRebates1 }
     *     
     */
    public void setRbts(LoyaltyRebates1 value) {
        this.rbts = value;
    }

}
