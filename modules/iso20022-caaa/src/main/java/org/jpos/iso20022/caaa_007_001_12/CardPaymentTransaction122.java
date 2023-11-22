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

package org.jpos.iso20022.caaa_007_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentTransaction122 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentTransaction122">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}TransactionIdentifier1"/>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}GenericIdentification32" minOccurs="0"/>
 *         <element name="InitrTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Text" minOccurs="0"/>
 *         <element name="RcptTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max140Text" minOccurs="0"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}CardPaymentServiceType12Code"/>
 *         <element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}CardPaymentServiceType9Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvcAttr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}CardPaymentServiceType14Code" minOccurs="0"/>
 *         <element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}CardDataReading8Code" minOccurs="0"/>
 *         <element name="TxRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}CardPaymentTransactionResult4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction122", propOrder = {
    "saleRefId",
    "txId",
    "poiId",
    "initrTxId",
    "rcptTxId",
    "txTp",
    "addtlSvc",
    "svcAttr",
    "cardDataNtryMd",
    "txRslt"
})
public class CardPaymentTransaction122 {

    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "POIId")
    protected GenericIdentification32 poiId;
    @XmlElement(name = "InitrTxId")
    protected String initrTxId;
    @XmlElement(name = "RcptTxId")
    protected String rcptTxId;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType14Code svcAttr;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code cardDataNtryMd;
    @XmlElement(name = "TxRslt")
    protected CardPaymentTransactionResult4 txRslt;

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
     * Gets the value of the initrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitrTxId() {
        return initrTxId;
    }

    /**
     * Sets the value of the initrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitrTxId(String value) {
        this.initrTxId = value;
    }

    /**
     * Gets the value of the rcptTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptTxId() {
        return rcptTxId;
    }

    /**
     * Sets the value of the rcptTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptTxId(String value) {
        this.rcptTxId = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CardPaymentServiceType12Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public void setTxTp(CardPaymentServiceType12Code value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentServiceType9Code }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<CardPaymentServiceType9Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public CardPaymentServiceType14Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public void setSvcAttr(CardPaymentServiceType14Code value) {
        this.svcAttr = value;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public void setCardDataNtryMd(CardDataReading8Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Gets the value of the txRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionResult4 }
     *     
     */
    public CardPaymentTransactionResult4 getTxRslt() {
        return txRslt;
    }

    /**
     * Sets the value of the txRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionResult4 }
     *     
     */
    public void setTxRslt(CardPaymentTransactionResult4 value) {
        this.txRslt = value;
    }

}
