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

package org.jpos.iso20022.auth_028_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyMarketStatusReportHeader1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MoneyMarketStatusReportHeader1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.028.001.01}LEIIdentifier"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.028.001.01}DateTimePeriod1"/>
 *         <element name="RptSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.028.001.01}StatisticalReportingStatus1Code"/>
 *         <element name="VldtnRule" type="{urn:iso:std:iso:20022:tech:xsd:auth.028.001.01}GenericValidationRuleIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketStatusReportHeader1", propOrder = {
    "rptgAgt",
    "rptgPrd",
    "rptSts",
    "vldtnRule"
})
public class MoneyMarketStatusReportHeader1 {

    @XmlElement(name = "RptgAgt", required = true)
    protected String rptgAgt;
    @XmlElement(name = "RptgPrd", required = true)
    protected DateTimePeriod1 rptgPrd;
    @XmlElement(name = "RptSts", required = true)
    @XmlSchemaType(name = "string")
    protected StatisticalReportingStatus1Code rptSts;
    @XmlElement(name = "VldtnRule")
    protected List<GenericValidationRuleIdentification1> vldtnRule;

    /**
     * Gets the value of the rptgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgAgt() {
        return rptgAgt;
    }

    /**
     * Sets the value of the rptgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptgAgt(String value) {
        this.rptgAgt = value;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setRptgPrd(DateTimePeriod1 value) {
        this.rptgPrd = value;
    }

    /**
     * Gets the value of the rptSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public StatisticalReportingStatus1Code getRptSts() {
        return rptSts;
    }

    /**
     * Sets the value of the rptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public void setRptSts(StatisticalReportingStatus1Code value) {
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
