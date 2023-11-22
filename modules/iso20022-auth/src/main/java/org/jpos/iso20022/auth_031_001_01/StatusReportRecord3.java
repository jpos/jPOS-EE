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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReportRecord3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusReportRecord3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}Max140Text"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}ReportingRecordStatus1Code"/>
 *         <element name="VldtnRule" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}GenericValidationRuleIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportRecord3", propOrder = {
    "orgnlRcrdId",
    "sts",
    "vldtnRule",
    "splmtryData"
})
public class StatusReportRecord3 {

    @XmlElement(name = "OrgnlRcrdId", required = true)
    protected String orgnlRcrdId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingRecordStatus1Code sts;
    @XmlElement(name = "VldtnRule")
    protected List<GenericValidationRuleIdentification1> vldtnRule;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the orgnlRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRcrdId() {
        return orgnlRcrdId;
    }

    /**
     * Sets the value of the orgnlRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlRcrdId(String value) {
        this.orgnlRcrdId = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRecordStatus1Code }
     *     
     */
    public ReportingRecordStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRecordStatus1Code }
     *     
     */
    public void setSts(ReportingRecordStatus1Code value) {
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
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
