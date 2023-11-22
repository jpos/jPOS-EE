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

package org.jpos.iso20022.caad_005_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTotals13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionTotals13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rcncltn" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}Reconciliation3" minOccurs="0"/>
 *         <element name="FinRcncltn" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}FinancialReconciliation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MsgRcncltn" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}MessageReconciliation3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlFeeRcncltn" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}AdditionalFeeReconciliation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}Min2Max3NumericText"/>
 *         <element name="NetAmtRcncltn" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}Amount16" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals13", propOrder = {
    "rcncltn",
    "finRcncltn",
    "msgRcncltn",
    "addtlFeeRcncltn",
    "ccy",
    "netAmtRcncltn"
})
public class TransactionTotals13 {

    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
    @XmlElement(name = "FinRcncltn")
    protected List<FinancialReconciliation2> finRcncltn;
    @XmlElement(name = "MsgRcncltn")
    protected List<MessageReconciliation3> msgRcncltn;
    @XmlElement(name = "AddtlFeeRcncltn")
    protected List<AdditionalFeeReconciliation2> addtlFeeRcncltn;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "NetAmtRcncltn")
    protected Amount16 netAmtRcncltn;

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation3 }
     *     
     */
    public Reconciliation3 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation3 }
     *     
     */
    public void setRcncltn(Reconciliation3 value) {
        this.rcncltn = value;
    }

    /**
     * Gets the value of the finRcncltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finRcncltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinRcncltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialReconciliation2 }
     * 
     * 
     * @return
     *     The value of the finRcncltn property.
     */
    public List<FinancialReconciliation2> getFinRcncltn() {
        if (finRcncltn == null) {
            finRcncltn = new ArrayList<>();
        }
        return this.finRcncltn;
    }

    /**
     * Gets the value of the msgRcncltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgRcncltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRcncltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageReconciliation3 }
     * 
     * 
     * @return
     *     The value of the msgRcncltn property.
     */
    public List<MessageReconciliation3> getMsgRcncltn() {
        if (msgRcncltn == null) {
            msgRcncltn = new ArrayList<>();
        }
        return this.msgRcncltn;
    }

    /**
     * Gets the value of the addtlFeeRcncltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFeeRcncltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFeeRcncltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFeeReconciliation2 }
     * 
     * 
     * @return
     *     The value of the addtlFeeRcncltn property.
     */
    public List<AdditionalFeeReconciliation2> getAddtlFeeRcncltn() {
        if (addtlFeeRcncltn == null) {
            addtlFeeRcncltn = new ArrayList<>();
        }
        return this.addtlFeeRcncltn;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the netAmtRcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Amount16 }
     *     
     */
    public Amount16 getNetAmtRcncltn() {
        return netAmtRcncltn;
    }

    /**
     * Sets the value of the netAmtRcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount16 }
     *     
     */
    public void setNetAmtRcncltn(Amount16 value) {
        this.netAmtRcncltn = value;
    }

}
