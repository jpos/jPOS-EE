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

package org.jpos.iso20022.fxtr_037_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Confirmation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Confirmation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConfSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}TradeConfirmationStatus1Code"/>
 *         <element name="ConfTm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="TradPtyConfTm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="InitgPtyConfTm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="ConfTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}ConfirmationRequest1Code"/>
 *         <element name="ReqId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}MessageIdentification1"/>
 *         <element name="QryStartNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Max35NumericText"/>
 *         <element name="TtlNbOfRpts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Number"/>
 *         <element name="PgNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Max35NumericText"/>
 *         <element name="QryPgNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Max35NumericText"/>
 *         <element name="MsgNbOfCurPg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Number"/>
 *         <element name="ListOrdrNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Number"/>
 *         <element name="LastPgInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}YesNoIndicator"/>
 *         <element name="LastRptReqd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Confirmation1", propOrder = {
    "confSts",
    "confTm",
    "tradPtyConfTm",
    "initgPtyConfTm",
    "confTp",
    "reqId",
    "qryStartNb",
    "ttlNbOfRpts",
    "pgNb",
    "qryPgNb",
    "msgNbOfCurPg",
    "listOrdrNb",
    "lastPgInd",
    "lastRptReqd"
})
public class Confirmation1 {

    @XmlElement(name = "ConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected TradeConfirmationStatus1Code confSts;
    @XmlElement(name = "ConfTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confTm;
    @XmlElement(name = "TradPtyConfTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradPtyConfTm;
    @XmlElement(name = "InitgPtyConfTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initgPtyConfTm;
    @XmlElement(name = "ConfTp", required = true)
    @XmlSchemaType(name = "string")
    protected ConfirmationRequest1Code confTp;
    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "QryStartNb", required = true)
    protected String qryStartNb;
    @XmlElement(name = "TtlNbOfRpts", required = true)
    protected BigDecimal ttlNbOfRpts;
    @XmlElement(name = "PgNb", required = true)
    protected String pgNb;
    @XmlElement(name = "QryPgNb", required = true)
    protected String qryPgNb;
    @XmlElement(name = "MsgNbOfCurPg", required = true)
    protected BigDecimal msgNbOfCurPg;
    @XmlElement(name = "ListOrdrNb", required = true)
    protected BigDecimal listOrdrNb;
    @XmlElement(name = "LastPgInd")
    protected boolean lastPgInd;
    @XmlElement(name = "LastRptReqd")
    protected boolean lastRptReqd;

    /**
     * Gets the value of the confSts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public TradeConfirmationStatus1Code getConfSts() {
        return confSts;
    }

    /**
     * Sets the value of the confSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public void setConfSts(TradeConfirmationStatus1Code value) {
        this.confSts = value;
    }

    /**
     * Gets the value of the confTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfTm() {
        return confTm;
    }

    /**
     * Sets the value of the confTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfTm(XMLGregorianCalendar value) {
        this.confTm = value;
    }

    /**
     * Gets the value of the tradPtyConfTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradPtyConfTm() {
        return tradPtyConfTm;
    }

    /**
     * Sets the value of the tradPtyConfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradPtyConfTm(XMLGregorianCalendar value) {
        this.tradPtyConfTm = value;
    }

    /**
     * Gets the value of the initgPtyConfTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitgPtyConfTm() {
        return initgPtyConfTm;
    }

    /**
     * Sets the value of the initgPtyConfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitgPtyConfTm(XMLGregorianCalendar value) {
        this.initgPtyConfTm = value;
    }

    /**
     * Gets the value of the confTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationRequest1Code }
     *     
     */
    public ConfirmationRequest1Code getConfTp() {
        return confTp;
    }

    /**
     * Sets the value of the confTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationRequest1Code }
     *     
     */
    public void setConfTp(ConfirmationRequest1Code value) {
        this.confTp = value;
    }

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setReqId(MessageIdentification1 value) {
        this.reqId = value;
    }

    /**
     * Gets the value of the qryStartNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryStartNb() {
        return qryStartNb;
    }

    /**
     * Sets the value of the qryStartNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryStartNb(String value) {
        this.qryStartNb = value;
    }

    /**
     * Gets the value of the ttlNbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRpts() {
        return ttlNbOfRpts;
    }

    /**
     * Sets the value of the ttlNbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfRpts(BigDecimal value) {
        this.ttlNbOfRpts = value;
    }

    /**
     * Gets the value of the pgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgNb() {
        return pgNb;
    }

    /**
     * Sets the value of the pgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgNb(String value) {
        this.pgNb = value;
    }

    /**
     * Gets the value of the qryPgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryPgNb() {
        return qryPgNb;
    }

    /**
     * Sets the value of the qryPgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryPgNb(String value) {
        this.qryPgNb = value;
    }

    /**
     * Gets the value of the msgNbOfCurPg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsgNbOfCurPg() {
        return msgNbOfCurPg;
    }

    /**
     * Sets the value of the msgNbOfCurPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsgNbOfCurPg(BigDecimal value) {
        this.msgNbOfCurPg = value;
    }

    /**
     * Gets the value of the listOrdrNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getListOrdrNb() {
        return listOrdrNb;
    }

    /**
     * Sets the value of the listOrdrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setListOrdrNb(BigDecimal value) {
        this.listOrdrNb = value;
    }

    /**
     * Gets the value of the lastPgInd property.
     * 
     */
    public boolean isLastPgInd() {
        return lastPgInd;
    }

    /**
     * Sets the value of the lastPgInd property.
     * 
     */
    public void setLastPgInd(boolean value) {
        this.lastPgInd = value;
    }

    /**
     * Gets the value of the lastRptReqd property.
     * 
     */
    public boolean isLastRptReqd() {
        return lastRptReqd;
    }

    /**
     * Sets the value of the lastRptReqd property.
     * 
     */
    public void setLastRptReqd(boolean value) {
        this.lastRptReqd = value;
    }

}
