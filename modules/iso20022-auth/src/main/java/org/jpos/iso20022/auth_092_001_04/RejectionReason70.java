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

package org.jpos.iso20022.auth_092_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason70 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RejectionReason70">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgRptId" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max140Text"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}ReportingMessageStatus2Code"/>
 *         <element name="DtldVldtnRule" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}GenericValidationRuleIdentification1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason70", propOrder = {
    "msgRptId",
    "sts",
    "dtldVldtnRule"
})
public class RejectionReason70 {

    @XmlElement(name = "MsgRptId", required = true)
    protected String msgRptId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingMessageStatus2Code sts;
    @XmlElement(name = "DtldVldtnRule")
    protected GenericValidationRuleIdentification1 dtldVldtnRule;

    /**
     * Gets the value of the msgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRptId() {
        return msgRptId;
    }

    /**
     * Sets the value of the msgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRptId(String value) {
        this.msgRptId = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingMessageStatus2Code }
     *     
     */
    public ReportingMessageStatus2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingMessageStatus2Code }
     *     
     */
    public void setSts(ReportingMessageStatus2Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the dtldVldtnRule property.
     * 
     * @return
     *     possible object is
     *     {@link GenericValidationRuleIdentification1 }
     *     
     */
    public GenericValidationRuleIdentification1 getDtldVldtnRule() {
        return dtldVldtnRule;
    }

    /**
     * Sets the value of the dtldVldtnRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericValidationRuleIdentification1 }
     *     
     */
    public void setDtldVldtnRule(GenericValidationRuleIdentification1 value) {
        this.dtldVldtnRule = value;
    }

}
