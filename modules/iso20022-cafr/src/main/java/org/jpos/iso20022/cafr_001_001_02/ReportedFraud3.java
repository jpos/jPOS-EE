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

package org.jpos.iso20022.cafr_001_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportedFraud3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportedFraud3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrdTp" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}FraudType1Code"/>
 *         <element name="OthrFrdTp" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FrdRptgActn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}FraudReportingAction1Code"/>
 *         <element name="OthrFrdRptgActn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}PartyType26Code"/>
 *         <element name="OthrRptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CmprmsdCrdntl" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}AuthenticationMethod12Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CrdhldrRptgDt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}ISODate" minOccurs="0"/>
 *         <element name="ConfRptgDt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}ISODate" minOccurs="0"/>
 *         <element name="SubmitrCaseRef" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FrdCaseDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}FraudCaseDetails1" minOccurs="0"/>
 *         <element name="FrdInvstgtnSts" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedFraud3", propOrder = {
    "frdTp",
    "othrFrdTp",
    "frdRptgActn",
    "othrFrdRptgActn",
    "rptgNtty",
    "othrRptgNtty",
    "cmprmsdCrdntl",
    "crdhldrRptgDt",
    "confRptgDt",
    "submitrCaseRef",
    "frdCaseDtls",
    "frdInvstgtnSts"
})
public class ReportedFraud3 {

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
    protected PartyType26Code rptgNtty;
    @XmlElement(name = "OthrRptgNtty")
    protected String othrRptgNtty;
    @XmlElement(name = "CmprmsdCrdntl")
    @XmlSchemaType(name = "string")
    protected List<AuthenticationMethod12Code> cmprmsdCrdntl;
    @XmlElement(name = "CrdhldrRptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crdhldrRptgDt;
    @XmlElement(name = "ConfRptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar confRptgDt;
    @XmlElement(name = "SubmitrCaseRef")
    protected String submitrCaseRef;
    @XmlElement(name = "FrdCaseDtls")
    protected FraudCaseDetails1 frdCaseDtls;
    @XmlElement(name = "FrdInvstgtnSts")
    protected String frdInvstgtnSts;

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
     *     {@link PartyType26Code }
     *     
     */
    public PartyType26Code getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType26Code }
     *     
     */
    public void setRptgNtty(PartyType26Code value) {
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
     * Gets the value of the cmprmsdCrdntl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmprmsdCrdntl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmprmsdCrdntl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationMethod12Code }
     * 
     * 
     * @return
     *     The value of the cmprmsdCrdntl property.
     */
    public List<AuthenticationMethod12Code> getCmprmsdCrdntl() {
        if (cmprmsdCrdntl == null) {
            cmprmsdCrdntl = new ArrayList<>();
        }
        return this.cmprmsdCrdntl;
    }

    /**
     * Gets the value of the crdhldrRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrdhldrRptgDt() {
        return crdhldrRptgDt;
    }

    /**
     * Sets the value of the crdhldrRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrdhldrRptgDt(XMLGregorianCalendar value) {
        this.crdhldrRptgDt = value;
    }

    /**
     * Gets the value of the confRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfRptgDt() {
        return confRptgDt;
    }

    /**
     * Sets the value of the confRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfRptgDt(XMLGregorianCalendar value) {
        this.confRptgDt = value;
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
     * Gets the value of the frdCaseDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FraudCaseDetails1 }
     *     
     */
    public FraudCaseDetails1 getFrdCaseDtls() {
        return frdCaseDtls;
    }

    /**
     * Sets the value of the frdCaseDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudCaseDetails1 }
     *     
     */
    public void setFrdCaseDtls(FraudCaseDetails1 value) {
        this.frdCaseDtls = value;
    }

    /**
     * Gets the value of the frdInvstgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrdInvstgtnSts() {
        return frdInvstgtnSts;
    }

    /**
     * Sets the value of the frdInvstgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrdInvstgtnSts(String value) {
        this.frdInvstgtnSts = value;
    }

}
