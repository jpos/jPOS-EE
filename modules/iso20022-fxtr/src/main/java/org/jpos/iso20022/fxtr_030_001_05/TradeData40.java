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

package org.jpos.iso20022.fxtr_030_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeData40 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeData40">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgtrRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text" minOccurs="0"/>
 *         <element name="MtchgSysUnqRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text"/>
 *         <element name="MtchgSysMtchgRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text" minOccurs="0"/>
 *         <element name="MtchgSysMtchdSdRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CurSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}ISODate" minOccurs="0"/>
 *         <element name="NewSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}ISODate" minOccurs="0"/>
 *         <element name="CurStsDtTm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}ISODateTime" minOccurs="0"/>
 *         <element name="PdctTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SttlmSsnIdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Exact4AlphaNumericText" minOccurs="0"/>
 *         <element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}RegulatoryReporting7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData40", propOrder = {
    "orgtrRef",
    "mtchgSysUnqRef",
    "mtchgSysMtchgRef",
    "mtchgSysMtchdSdRef",
    "curSttlmDt",
    "newSttlmDt",
    "curStsDtTm",
    "pdctTp",
    "sttlmSsnIdr",
    "rgltryRptg"
})
public class TradeData40 {

    @XmlElement(name = "OrgtrRef")
    protected String orgtrRef;
    @XmlElement(name = "MtchgSysUnqRef", required = true)
    protected String mtchgSysUnqRef;
    @XmlElement(name = "MtchgSysMtchgRef")
    protected String mtchgSysMtchgRef;
    @XmlElement(name = "MtchgSysMtchdSdRef")
    protected String mtchgSysMtchdSdRef;
    @XmlElement(name = "CurSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar curSttlmDt;
    @XmlElement(name = "NewSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newSttlmDt;
    @XmlElement(name = "CurStsDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar curStsDtTm;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "RgltryRptg")
    protected RegulatoryReporting7 rgltryRptg;

    /**
     * Gets the value of the orgtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrRef() {
        return orgtrRef;
    }

    /**
     * Sets the value of the orgtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtrRef(String value) {
        this.orgtrRef = value;
    }

    /**
     * Gets the value of the mtchgSysUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysUnqRef() {
        return mtchgSysUnqRef;
    }

    /**
     * Sets the value of the mtchgSysUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchgSysUnqRef(String value) {
        this.mtchgSysUnqRef = value;
    }

    /**
     * Gets the value of the mtchgSysMtchgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysMtchgRef() {
        return mtchgSysMtchgRef;
    }

    /**
     * Sets the value of the mtchgSysMtchgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchgSysMtchgRef(String value) {
        this.mtchgSysMtchgRef = value;
    }

    /**
     * Gets the value of the mtchgSysMtchdSdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchgSysMtchdSdRef() {
        return mtchgSysMtchdSdRef;
    }

    /**
     * Sets the value of the mtchgSysMtchdSdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchgSysMtchdSdRef(String value) {
        this.mtchgSysMtchdSdRef = value;
    }

    /**
     * Gets the value of the curSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurSttlmDt() {
        return curSttlmDt;
    }

    /**
     * Sets the value of the curSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurSttlmDt(XMLGregorianCalendar value) {
        this.curSttlmDt = value;
    }

    /**
     * Gets the value of the newSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewSttlmDt() {
        return newSttlmDt;
    }

    /**
     * Sets the value of the newSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewSttlmDt(XMLGregorianCalendar value) {
        this.newSttlmDt = value;
    }

    /**
     * Gets the value of the curStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurStsDtTm() {
        return curStsDtTm;
    }

    /**
     * Sets the value of the curStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurStsDtTm(XMLGregorianCalendar value) {
        this.curStsDtTm = value;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctTp(String value) {
        this.pdctTp = value;
    }

    /**
     * Gets the value of the sttlmSsnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmSsnIdr() {
        return sttlmSsnIdr;
    }

    /**
     * Sets the value of the sttlmSsnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmSsnIdr(String value) {
        this.sttlmSsnIdr = value;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReporting7 }
     *     
     */
    public RegulatoryReporting7 getRgltryRptg() {
        return rgltryRptg;
    }

    /**
     * Sets the value of the rgltryRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReporting7 }
     *     
     */
    public void setRgltryRptg(RegulatoryReporting7 value) {
        this.rgltryRptg = value;
    }

}
