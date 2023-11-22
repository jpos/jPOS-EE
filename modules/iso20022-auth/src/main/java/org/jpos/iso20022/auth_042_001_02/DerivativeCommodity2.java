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

package org.jpos.iso20022.auth_042_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeCommodity2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivativeCommodity2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AssetClassCommodity3Choice"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AssetClassTransactionType1Code" minOccurs="0"/>
 *         <element name="FnlPricTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AssetPriceType1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeCommodity2", propOrder = {
    "pdct",
    "txTp",
    "fnlPricTp"
})
public class DerivativeCommodity2 {

    @XmlElement(name = "Pdct", required = true)
    protected AssetClassCommodity3Choice pdct;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected AssetClassTransactionType1Code txTp;
    @XmlElement(name = "FnlPricTp")
    @XmlSchemaType(name = "string")
    protected AssetPriceType1Code fnlPricTp;

    /**
     * Gets the value of the pdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity3Choice }
     *     
     */
    public AssetClassCommodity3Choice getPdct() {
        return pdct;
    }

    /**
     * Sets the value of the pdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity3Choice }
     *     
     */
    public void setPdct(AssetClassCommodity3Choice value) {
        this.pdct = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassTransactionType1Code }
     *     
     */
    public AssetClassTransactionType1Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassTransactionType1Code }
     *     
     */
    public void setTxTp(AssetClassTransactionType1Code value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the fnlPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetPriceType1Code }
     *     
     */
    public AssetPriceType1Code getFnlPricTp() {
        return fnlPricTp;
    }

    /**
     * Sets the value of the fnlPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetPriceType1Code }
     *     
     */
    public void setFnlPricTp(AssetPriceType1Code value) {
        this.fnlPricTp = value;
    }

}
