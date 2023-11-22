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

package org.jpos.iso20022.casp_001_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentTransaction126 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentTransaction126">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}Max35Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}TransactionIdentifier1"/>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}GenericIdentification32"/>
 *         <element name="CcyConvs" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CurrencyConversion28" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction126", propOrder = {
    "saleRefId",
    "txId",
    "poiId",
    "ccyConvs"
})
public class CardPaymentTransaction126 {

    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification32 poiId;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion28 ccyConvs;

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefId(String value) {
        this.saleRefId = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setTxId(TransactionIdentifier1 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public void setPOIId(GenericIdentification32 value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion28 }
     *     
     */
    public CurrencyConversion28 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion28 }
     *     
     */
    public void setCcyConvs(CurrencyConversion28 value) {
        this.ccyConvs = value;
    }

}
