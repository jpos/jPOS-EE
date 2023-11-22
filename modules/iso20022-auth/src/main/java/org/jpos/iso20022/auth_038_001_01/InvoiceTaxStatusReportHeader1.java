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

package org.jpos.iso20022.auth_038_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceTaxStatusReportHeader1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceTaxStatusReportHeader1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}TaxOrganisationIdentification1" minOccurs="0"/>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}MessageIdentification1"/>
 *         <element name="OrgnlMsgId" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}MessageIdentification1"/>
 *         <element name="RptSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}TaxReportingStatus1Code"/>
 *         <element name="VldtnRule" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}GenericValidationRuleIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTaxStatusReportHeader1", propOrder = {
    "taxAuthrty",
    "msgId",
    "orgnlMsgId",
    "rptSts",
    "vldtnRule"
})
public class InvoiceTaxStatusReportHeader1 {

    @XmlElement(name = "TaxAuthrty")
    protected TaxOrganisationIdentification1 taxAuthrty;
    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OrgnlMsgId", required = true)
    protected MessageIdentification1 orgnlMsgId;
    @XmlElement(name = "RptSts", required = true)
    @XmlSchemaType(name = "string")
    protected TaxReportingStatus1Code rptSts;
    @XmlElement(name = "VldtnRule")
    protected List<GenericValidationRuleIdentification1> vldtnRule;

    /**
     * Gets the value of the taxAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxOrganisationIdentification1 }
     *     
     */
    public TaxOrganisationIdentification1 getTaxAuthrty() {
        return taxAuthrty;
    }

    /**
     * Sets the value of the taxAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxOrganisationIdentification1 }
     *     
     */
    public void setTaxAuthrty(TaxOrganisationIdentification1 value) {
        this.taxAuthrty = value;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setOrgnlMsgId(MessageIdentification1 value) {
        this.orgnlMsgId = value;
    }

    /**
     * Gets the value of the rptSts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReportingStatus1Code }
     *     
     */
    public TaxReportingStatus1Code getRptSts() {
        return rptSts;
    }

    /**
     * Sets the value of the rptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReportingStatus1Code }
     *     
     */
    public void setRptSts(TaxReportingStatus1Code value) {
        this.rptSts = value;
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

}
