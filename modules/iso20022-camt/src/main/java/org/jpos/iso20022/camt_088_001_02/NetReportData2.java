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

package org.jpos.iso20022.camt_088_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetReportData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetReportData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}Max35Text"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}ISODateTime"/>
 *         <element name="NetgCutOffTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}ISOTime"/>
 *         <element name="RptDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}ISODate"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}ISODate"/>
 *         <element name="RptTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}Max35Text" minOccurs="0"/>
 *         <element name="NetRptSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="NetSvcTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}Max35Text" minOccurs="0"/>
 *         <element name="MsgPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}Pagination1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetReportData2", propOrder = {
    "msgId",
    "creDtTm",
    "netgCutOffTm",
    "rptDt",
    "valDt",
    "rptTp",
    "netRptSvcr",
    "netSvcTp",
    "msgPgntn"
})
public class NetReportData2 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "NetgCutOffTm", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar netgCutOffTm;
    @XmlElement(name = "RptDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptDt;
    @XmlElement(name = "ValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "RptTp")
    protected String rptTp;
    @XmlElement(name = "NetRptSvcr")
    protected PartyIdentification242Choice netRptSvcr;
    @XmlElement(name = "NetSvcTp")
    protected String netSvcTp;
    @XmlElement(name = "MsgPgntn")
    protected Pagination1 msgPgntn;

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
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the netgCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNetgCutOffTm() {
        return netgCutOffTm;
    }

    /**
     * Sets the value of the netgCutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNetgCutOffTm(XMLGregorianCalendar value) {
        this.netgCutOffTm = value;
    }

    /**
     * Gets the value of the rptDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptDt() {
        return rptDt;
    }

    /**
     * Sets the value of the rptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptDt(XMLGregorianCalendar value) {
        this.rptDt = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the rptTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptTp() {
        return rptTp;
    }

    /**
     * Sets the value of the rptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptTp(String value) {
        this.rptTp = value;
    }

    /**
     * Gets the value of the netRptSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getNetRptSvcr() {
        return netRptSvcr;
    }

    /**
     * Sets the value of the netRptSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setNetRptSvcr(PartyIdentification242Choice value) {
        this.netRptSvcr = value;
    }

    /**
     * Gets the value of the netSvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetSvcTp() {
        return netSvcTp;
    }

    /**
     * Sets the value of the netSvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetSvcTp(String value) {
        this.netSvcTp = value;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setMsgPgntn(Pagination1 value) {
        this.msgPgntn = value;
    }

}
