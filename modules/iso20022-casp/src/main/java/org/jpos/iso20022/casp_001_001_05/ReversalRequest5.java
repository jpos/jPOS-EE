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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReversalRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReversalRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RvslTx" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentTransaction127" minOccurs="0"/>
 *         <element name="LltyData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}LoyaltyRequestData3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RvslRsn" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ReversalReason1Code"/>
 *         <element name="RvsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CstmrOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CustomerOrder1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalRequest5", propOrder = {
    "rvslTx",
    "lltyData",
    "rvslRsn",
    "rvsdAmt",
    "cstmrOrdr"
})
public class ReversalRequest5 {

    @XmlElement(name = "RvslTx")
    protected CardPaymentTransaction127 rvslTx;
    @XmlElement(name = "LltyData")
    protected List<LoyaltyRequestData3> lltyData;
    @XmlElement(name = "RvslRsn", required = true)
    @XmlSchemaType(name = "string")
    protected ReversalReason1Code rvslRsn;
    @XmlElement(name = "RvsdAmt")
    protected BigDecimal rvsdAmt;
    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;

    /**
     * Gets the value of the rvslTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public CardPaymentTransaction127 getRvslTx() {
        return rvslTx;
    }

    /**
     * Sets the value of the rvslTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public void setRvslTx(CardPaymentTransaction127 value) {
        this.rvslTx = value;
    }

    /**
     * Gets the value of the lltyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyRequestData3 }
     * 
     * 
     * @return
     *     The value of the lltyData property.
     */
    public List<LoyaltyRequestData3> getLltyData() {
        if (lltyData == null) {
            lltyData = new ArrayList<>();
        }
        return this.lltyData;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalReason1Code }
     *     
     */
    public ReversalReason1Code getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalReason1Code }
     *     
     */
    public void setRvslRsn(ReversalReason1Code value) {
        this.rvslRsn = value;
    }

    /**
     * Gets the value of the rvsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRvsdAmt() {
        return rvsdAmt;
    }

    /**
     * Sets the value of the rvsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRvsdAmt(BigDecimal value) {
        this.rvsdAmt = value;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder1 }
     *     
     */
    public CustomerOrder1 getCstmrOrdr() {
        return cstmrOrdr;
    }

    /**
     * Sets the value of the cstmrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder1 }
     *     
     */
    public void setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
    }

}
