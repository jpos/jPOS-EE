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

package org.jpos.iso20022.cafr_003_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportedFraud2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportedFraud2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrdTp" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}FraudType1Code"/>
 *         <element name="OthrFrdTp" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FrdRptgActn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}FraudReportingAction1Code"/>
 *         <element name="OthrFrdRptgActn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}PartyType25Code"/>
 *         <element name="OthrRptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="SubmitrCaseRef" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CaseRef" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedFraud2", propOrder = {
    "frdTp",
    "othrFrdTp",
    "frdRptgActn",
    "othrFrdRptgActn",
    "rptgNtty",
    "othrRptgNtty",
    "submitrCaseRef",
    "caseRef"
})
public class ReportedFraud2 {

    @XmlElement(name = "FrdTp", required = true)
    @XmlSchemaType(name = "string")
    protected FraudType1Code frdTp;
    @XmlElement(name = "OthrFrdTp")
    protected String othrFrdTp;
    @XmlElement(name = "FrdRptgActn", required = true)
    @XmlSchemaType(name = "string")
    protected FraudReportingAction1Code frdRptgActn;
    @XmlElement(name = "OthrFrdRptgActn")
    protected String othrFrdRptgActn;
    @XmlElement(name = "RptgNtty", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType25Code rptgNtty;
    @XmlElement(name = "OthrRptgNtty")
    protected String othrRptgNtty;
    @XmlElement(name = "SubmitrCaseRef")
    protected String submitrCaseRef;
    @XmlElement(name = "CaseRef")
    protected String caseRef;

    /**
     * Gets the value of the frdTp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudType1Code }
     *     
     */
    public FraudType1Code getFrdTp() {
        return frdTp;
    }

    /**
     * Sets the value of the frdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudType1Code }
     *     
     */
    public void setFrdTp(FraudType1Code value) {
        this.frdTp = value;
    }

    /**
     * Gets the value of the othrFrdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrdTp() {
        return othrFrdTp;
    }

    /**
     * Sets the value of the othrFrdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFrdTp(String value) {
        this.othrFrdTp = value;
    }

    /**
     * Gets the value of the frdRptgActn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public FraudReportingAction1Code getFrdRptgActn() {
        return frdRptgActn;
    }

    /**
     * Sets the value of the frdRptgActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public void setFrdRptgActn(FraudReportingAction1Code value) {
        this.frdRptgActn = value;
    }

    /**
     * Gets the value of the othrFrdRptgActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrdRptgActn() {
        return othrFrdRptgActn;
    }

    /**
     * Sets the value of the othrFrdRptgActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFrdRptgActn(String value) {
        this.othrFrdRptgActn = value;
    }

    /**
     * Gets the value of the rptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType25Code }
     *     
     */
    public PartyType25Code getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType25Code }
     *     
     */
    public void setRptgNtty(PartyType25Code value) {
        this.rptgNtty = value;
    }

    /**
     * Gets the value of the othrRptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRptgNtty() {
        return othrRptgNtty;
    }

    /**
     * Sets the value of the othrRptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRptgNtty(String value) {
        this.othrRptgNtty = value;
    }

    /**
     * Gets the value of the submitrCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitrCaseRef() {
        return submitrCaseRef;
    }

    /**
     * Sets the value of the submitrCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitrCaseRef(String value) {
        this.submitrCaseRef = value;
    }

    /**
     * Gets the value of the caseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseRef() {
        return caseRef;
    }

    /**
     * Sets the value of the caseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseRef(String value) {
        this.caseRef = value;
    }

}
