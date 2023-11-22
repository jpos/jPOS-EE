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

package org.jpos.iso20022.fxtr_017_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeAgreement12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeAgreement12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ISODate"/>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text"/>
 *         <element name="OrgtrRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text"/>
 *         <element name="CmonRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="AmdOrCclRsn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="PdctTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="OprTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max4Text" minOccurs="0"/>
 *         <element name="OprScp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max4Text" minOccurs="0"/>
 *         <element name="SttlmSsnIdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Exact4AlphaNumericText" minOccurs="0"/>
 *         <element name="SpltTradInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}YesNoIndicator"/>
 *         <element name="PmtVrssPmtInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAgreement12", propOrder = {
    "tradDt",
    "msgId",
    "orgtrRef",
    "cmonRef",
    "amdOrCclRsn",
    "rltdRef",
    "pdctTp",
    "oprTp",
    "oprScp",
    "sttlmSsnIdr",
    "spltTradInd",
    "pmtVrssPmtInd"
})
public class TradeAgreement12 {

    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "OrgtrRef", required = true)
    protected String orgtrRef;
    @XmlElement(name = "CmonRef")
    protected String cmonRef;
    @XmlElement(name = "AmdOrCclRsn")
    protected String amdOrCclRsn;
    @XmlElement(name = "RltdRef")
    protected String rltdRef;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "OprTp")
    protected String oprTp;
    @XmlElement(name = "OprScp")
    protected String oprScp;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "SpltTradInd")
    protected boolean spltTradInd;
    @XmlElement(name = "PmtVrssPmtInd")
    protected Boolean pmtVrssPmtInd;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

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
     * Gets the value of the cmonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonRef() {
        return cmonRef;
    }

    /**
     * Sets the value of the cmonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonRef(String value) {
        this.cmonRef = value;
    }

    /**
     * Gets the value of the amdOrCclRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmdOrCclRsn() {
        return amdOrCclRsn;
    }

    /**
     * Sets the value of the amdOrCclRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmdOrCclRsn(String value) {
        this.amdOrCclRsn = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdRef(String value) {
        this.rltdRef = value;
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
     * Gets the value of the oprTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprTp() {
        return oprTp;
    }

    /**
     * Sets the value of the oprTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOprTp(String value) {
        this.oprTp = value;
    }

    /**
     * Gets the value of the oprScp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprScp() {
        return oprScp;
    }

    /**
     * Sets the value of the oprScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOprScp(String value) {
        this.oprScp = value;
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
     * Gets the value of the spltTradInd property.
     * 
     */
    public boolean isSpltTradInd() {
        return spltTradInd;
    }

    /**
     * Sets the value of the spltTradInd property.
     * 
     */
    public void setSpltTradInd(boolean value) {
        this.spltTradInd = value;
    }

    /**
     * Gets the value of the pmtVrssPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtVrssPmtInd() {
        return pmtVrssPmtInd;
    }

    /**
     * Sets the value of the pmtVrssPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtVrssPmtInd(Boolean value) {
        this.pmtVrssPmtInd = value;
    }

}
