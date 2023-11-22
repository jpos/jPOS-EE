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

package org.jpos.iso20022.auth_031_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusAdviceReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusAdviceReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}ReportingMessageStatus1Code"/>
 *         <element name="VldtnRule" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}GenericValidationRuleIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MsgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}ISODate" minOccurs="0"/>
 *         <element name="Sttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}OriginalReportStatistics3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAdviceReport3", propOrder = {
    "sts",
    "vldtnRule",
    "msgDt",
    "sttstcs"
})
public class StatusAdviceReport3 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingMessageStatus1Code sts;
    @XmlElement(name = "VldtnRule")
    protected List<GenericValidationRuleIdentification1> vldtnRule;
    @XmlElement(name = "MsgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar msgDt;
    @XmlElement(name = "Sttstcs")
    protected OriginalReportStatistics3 sttstcs;

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
     * Gets the value of the vldtnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vldtnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVldtnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericValidationRuleIdentification1 }
     * 
     * 
     * @return
     *     The value of the vldtnRule property.
     */
    public List<GenericValidationRuleIdentification1> getVldtnRule() {
        if (vldtnRule == null) {
            vldtnRule = new ArrayList<>();
        }
        return this.vldtnRule;
    }

    /**
     * Gets the value of the msgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsgDt() {
        return msgDt;
    }

    /**
     * Sets the value of the msgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgDt(XMLGregorianCalendar value) {
        this.msgDt = value;
    }

    /**
     * Gets the value of the sttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalReportStatistics3 }
     *     
     */
    public OriginalReportStatistics3 getSttstcs() {
        return sttstcs;
    }

    /**
     * Sets the value of the sttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalReportStatistics3 }
     *     
     */
    public void setSttstcs(OriginalReportStatistics3 value) {
        this.sttstcs = value;
    }

}
