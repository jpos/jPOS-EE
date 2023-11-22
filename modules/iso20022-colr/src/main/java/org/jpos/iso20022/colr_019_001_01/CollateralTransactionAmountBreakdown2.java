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

package org.jpos.iso20022.colr_019_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralTransactionAmountBreakdown2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralTransactionAmountBreakdown2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LotNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}GenericIdentification178"/>
 *         <element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}Period4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralTransactionAmountBreakdown2", propOrder = {
    "lotNb",
    "txAmt",
    "prd"
})
public class CollateralTransactionAmountBreakdown2 {

    @XmlElement(name = "LotNb", required = true)
    protected GenericIdentification178 lotNb;
    @XmlElement(name = "TxAmt")
    protected ActiveOrHistoricCurrencyAndAmount txAmt;
    @XmlElement(name = "Prd")
    protected Period4Choice prd;

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification178 }
     *     
     */
    public GenericIdentification178 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification178 }
     *     
     */
    public void setLotNb(GenericIdentification178 value) {
        this.lotNb = value;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.txAmt = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setPrd(Period4Choice value) {
        this.prd = value;
    }

}
