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

package org.jpos.iso20022.auth_084_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason53 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RejectionReason53">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}TransactionIdentification3Choice"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}ReportingMessageStatus1Code"/>
 *         <element name="DtldVldtnRule" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}GenericValidationRuleIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason53", propOrder = {
    "txId",
    "sts",
    "dtldVldtnRule"
})
public class RejectionReason53 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification3Choice txId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingMessageStatus1Code sts;
    @XmlElement(name = "DtldVldtnRule")
    protected List<GenericValidationRuleIdentification1> dtldVldtnRule;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification3Choice }
     *     
     */
    public TransactionIdentification3Choice getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification3Choice }
     *     
     */
    public void setTxId(TransactionIdentification3Choice value) {
        this.txId = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingMessageStatus1Code }
     *     
     */
    public ReportingMessageStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingMessageStatus1Code }
     *     
     */
    public void setSts(ReportingMessageStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the dtldVldtnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldVldtnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldVldtnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericValidationRuleIdentification1 }
     * 
     * 
     * @return
     *     The value of the dtldVldtnRule property.
     */
    public List<GenericValidationRuleIdentification1> getDtldVldtnRule() {
        if (dtldVldtnRule == null) {
            dtldVldtnRule = new ArrayList<>();
        }
        return this.dtldVldtnRule;
    }

}
