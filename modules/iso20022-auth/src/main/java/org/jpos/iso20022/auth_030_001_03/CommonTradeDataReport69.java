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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonTradeDataReport69 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommonTradeDataReport69">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctData" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ContractType14" minOccurs="0"/>
 *         <element name="TxData" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeTransaction49"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonTradeDataReport69", propOrder = {
    "ctrctData",
    "txData"
})
public class CommonTradeDataReport69 {

    @XmlElement(name = "CtrctData")
    protected ContractType14 ctrctData;
    @XmlElement(name = "TxData", required = true)
    protected TradeTransaction49 txData;

    /**
     * Gets the value of the ctrctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType14 }
     *     
     */
    public ContractType14 getCtrctData() {
        return ctrctData;
    }

    /**
     * Sets the value of the ctrctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType14 }
     *     
     */
    public void setCtrctData(ContractType14 value) {
        this.ctrctData = value;
    }

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransaction49 }
     *     
     */
    public TradeTransaction49 getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransaction49 }
     *     
     */
    public void setTxData(TradeTransaction49 value) {
        this.txData = value;
    }

}
