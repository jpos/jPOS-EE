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

package org.jpos.iso20022.pain_007_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalPaymentInstruction41 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalPaymentInstruction41">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RvslPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}Max35Text"/>
 *         <element name="OrgnlNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}Max15NumericText" minOccurs="0"/>
 *         <element name="OrgnlCtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="BtchBookg" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}BatchBookingIndicator" minOccurs="0"/>
 *         <element name="PmtInfRvsl" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RvslRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}PaymentReversalReason9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}PaymentTransaction134" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalPaymentInstruction41", propOrder = {
    "rvslPmtInfId",
    "orgnlPmtInfId",
    "orgnlNbOfTxs",
    "orgnlCtrlSum",
    "btchBookg",
    "pmtInfRvsl",
    "rvslRsnInf",
    "txInf"
})
public class OriginalPaymentInstruction41 {

    @XmlElement(name = "RvslPmtInfId")
    protected String rvslPmtInfId;
    @XmlElement(name = "OrgnlPmtInfId", required = true)
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlNbOfTxs")
    protected String orgnlNbOfTxs;
    @XmlElement(name = "OrgnlCtrlSum")
    protected BigDecimal orgnlCtrlSum;
    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;
    @XmlElement(name = "PmtInfRvsl")
    protected Boolean pmtInfRvsl;
    @XmlElement(name = "RvslRsnInf")
    protected List<PaymentReversalReason9> rvslRsnInf;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransaction134> txInf;

    /**
     * Gets the value of the rvslPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvslPmtInfId() {
        return rvslPmtInfId;
    }

    /**
     * Sets the value of the rvslPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRvslPmtInfId(String value) {
        this.rvslPmtInfId = value;
    }

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * Gets the value of the orgnlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNbOfTxs() {
        return orgnlNbOfTxs;
    }

    /**
     * Sets the value of the orgnlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlNbOfTxs(String value) {
        this.orgnlNbOfTxs = value;
    }

    /**
     * Gets the value of the orgnlCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlCtrlSum() {
        return orgnlCtrlSum;
    }

    /**
     * Sets the value of the orgnlCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgnlCtrlSum(BigDecimal value) {
        this.orgnlCtrlSum = value;
    }

    /**
     * Gets the value of the btchBookg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchBookg() {
        return btchBookg;
    }

    /**
     * Sets the value of the btchBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBtchBookg(Boolean value) {
        this.btchBookg = value;
    }

    /**
     * Gets the value of the pmtInfRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInfRvsl() {
        return pmtInfRvsl;
    }

    /**
     * Sets the value of the pmtInfRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtInfRvsl(Boolean value) {
        this.pmtInfRvsl = value;
    }

    /**
     * Gets the value of the rvslRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rvslRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvslRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReversalReason9 }
     * 
     * 
     * @return
     *     The value of the rvslRsnInf property.
     */
    public List<PaymentReversalReason9> getRvslRsnInf() {
        if (rvslRsnInf == null) {
            rvslRsnInf = new ArrayList<>();
        }
        return this.rvslRsnInf;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction134 }
     * 
     * 
     * @return
     *     The value of the txInf property.
     */
    public List<PaymentTransaction134> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<>();
        }
        return this.txInf;
    }

}
