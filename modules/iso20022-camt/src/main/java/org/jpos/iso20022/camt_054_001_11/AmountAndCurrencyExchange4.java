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

package org.jpos.iso20022.camt_054_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountAndCurrencyExchange4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountAndCurrencyExchange4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         <element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         <element name="CntrValAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         <element name="AnncdPstngAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}AmountAndCurrencyExchangeDetails5" minOccurs="0"/>
 *         <element name="PrtryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}AmountAndCurrencyExchangeDetails6" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchange4", propOrder = {
    "instdAmt",
    "txAmt",
    "cntrValAmt",
    "anncdPstngAmt",
    "prtryAmt"
})
public class AmountAndCurrencyExchange4 {

    @XmlElement(name = "InstdAmt")
    protected AmountAndCurrencyExchangeDetails5 instdAmt;
    @XmlElement(name = "TxAmt")
    protected AmountAndCurrencyExchangeDetails5 txAmt;
    @XmlElement(name = "CntrValAmt")
    protected AmountAndCurrencyExchangeDetails5 cntrValAmt;
    @XmlElement(name = "AnncdPstngAmt")
    protected AmountAndCurrencyExchangeDetails5 anncdPstngAmt;
    @XmlElement(name = "PrtryAmt")
    protected List<AmountAndCurrencyExchangeDetails6> prtryAmt;

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setInstdAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.instdAmt = value;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setTxAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.txAmt = value;
    }

    /**
     * Gets the value of the cntrValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getCntrValAmt() {
        return cntrValAmt;
    }

    /**
     * Sets the value of the cntrValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setCntrValAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.cntrValAmt = value;
    }

    /**
     * Gets the value of the anncdPstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getAnncdPstngAmt() {
        return anncdPstngAmt;
    }

    /**
     * Sets the value of the anncdPstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public void setAnncdPstngAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.anncdPstngAmt = value;
    }

    /**
     * Gets the value of the prtryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtryAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndCurrencyExchangeDetails6 }
     * 
     * 
     * @return
     *     The value of the prtryAmt property.
     */
    public List<AmountAndCurrencyExchangeDetails6> getPrtryAmt() {
        if (prtryAmt == null) {
            prtryAmt = new ArrayList<>();
        }
        return this.prtryAmt;
    }

}
