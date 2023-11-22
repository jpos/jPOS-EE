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
 * <p>Java class for TradeData12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeData12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text"/>
 *         <element name="StsOrgtr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CurSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}StatusAndSubStatus2"/>
 *         <element name="CurStsSubTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}StatusSubType2Code" minOccurs="0"/>
 *         <element name="CurStsDtTm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}ISODateTime"/>
 *         <element name="PrvsSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Status28Choice" minOccurs="0"/>
 *         <element name="PrvsStsSubTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}StatusSubType2Code" minOccurs="0"/>
 *         <element name="PdctTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SttlmSsnIdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Exact4AlphaNumericText" minOccurs="0"/>
 *         <element name="LkdRptId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData12", propOrder = {
    "msgId",
    "stsOrgtr",
    "curSts",
    "curStsSubTp",
    "curStsDtTm",
    "prvsSts",
    "prvsStsSubTp",
    "pdctTp",
    "sttlmSsnIdr",
    "lkdRptId"
})
public class TradeData12 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "StsOrgtr")
    protected String stsOrgtr;
    @XmlElement(name = "CurSts", required = true)
    protected StatusAndSubStatus2 curSts;
    @XmlElement(name = "CurStsSubTp")
    @XmlSchemaType(name = "string")
    protected StatusSubType2Code curStsSubTp;
    @XmlElement(name = "CurStsDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar curStsDtTm;
    @XmlElement(name = "PrvsSts")
    protected Status28Choice prvsSts;
    @XmlElement(name = "PrvsStsSubTp")
    @XmlSchemaType(name = "string")
    protected StatusSubType2Code prvsStsSubTp;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "LkdRptId")
    protected String lkdRptId;

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
     * Gets the value of the stsOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsOrgtr() {
        return stsOrgtr;
    }

    /**
     * Sets the value of the stsOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsOrgtr(String value) {
        this.stsOrgtr = value;
    }

    /**
     * Gets the value of the curSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndSubStatus2 }
     *     
     */
    public StatusAndSubStatus2 getCurSts() {
        return curSts;
    }

    /**
     * Sets the value of the curSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndSubStatus2 }
     *     
     */
    public void setCurSts(StatusAndSubStatus2 value) {
        this.curSts = value;
    }

    /**
     * Gets the value of the curStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSubType2Code }
     *     
     */
    public StatusSubType2Code getCurStsSubTp() {
        return curStsSubTp;
    }

    /**
     * Sets the value of the curStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSubType2Code }
     *     
     */
    public void setCurStsSubTp(StatusSubType2Code value) {
        this.curStsSubTp = value;
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
     * Gets the value of the prvsSts property.
     * 
     * @return
     *     possible object is
     *     {@link Status28Choice }
     *     
     */
    public Status28Choice getPrvsSts() {
        return prvsSts;
    }

    /**
     * Sets the value of the prvsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status28Choice }
     *     
     */
    public void setPrvsSts(Status28Choice value) {
        this.prvsSts = value;
    }

    /**
     * Gets the value of the prvsStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatusSubType2Code }
     *     
     */
    public StatusSubType2Code getPrvsStsSubTp() {
        return prvsStsSubTp;
    }

    /**
     * Sets the value of the prvsStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSubType2Code }
     *     
     */
    public void setPrvsStsSubTp(StatusSubType2Code value) {
        this.prvsStsSubTp = value;
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
     * Gets the value of the lkdRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdRptId() {
        return lkdRptId;
    }

    /**
     * Sets the value of the lkdRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkdRptId(String value) {
        this.lkdRptId = value;
    }

}
