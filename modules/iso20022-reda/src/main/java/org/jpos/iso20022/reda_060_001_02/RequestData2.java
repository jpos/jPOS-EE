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

package org.jpos.iso20022.reda_060_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}Max35Text"/>
 *         <element name="ReqTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}Max4Text"/>
 *         <element name="ReqdActvtnDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}ISODate"/>
 *         <element name="ReqSvcr" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="NetSvcPtcptId" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}PartyIdentification242Choice"/>
 *         <element name="NetSvcTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.060.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestData2", propOrder = {
    "msgId",
    "reqTp",
    "reqdActvtnDt",
    "reqSvcr",
    "netSvcPtcptId",
    "netSvcTp"
})
public class RequestData2 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "ReqTp", required = true)
    protected String reqTp;
    @XmlElement(name = "ReqdActvtnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdActvtnDt;
    @XmlElement(name = "ReqSvcr")
    protected PartyIdentification242Choice reqSvcr;
    @XmlElement(name = "NetSvcPtcptId", required = true)
    protected PartyIdentification242Choice netSvcPtcptId;
    @XmlElement(name = "NetSvcTp")
    protected String netSvcTp;

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
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqTp(String value) {
        this.reqTp = value;
    }

    /**
     * Gets the value of the reqdActvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdActvtnDt() {
        return reqdActvtnDt;
    }

    /**
     * Sets the value of the reqdActvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdActvtnDt(XMLGregorianCalendar value) {
        this.reqdActvtnDt = value;
    }

    /**
     * Gets the value of the reqSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getReqSvcr() {
        return reqSvcr;
    }

    /**
     * Sets the value of the reqSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setReqSvcr(PartyIdentification242Choice value) {
        this.reqSvcr = value;
    }

    /**
     * Gets the value of the netSvcPtcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getNetSvcPtcptId() {
        return netSvcPtcptId;
    }

    /**
     * Sets the value of the netSvcPtcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setNetSvcPtcptId(PartyIdentification242Choice value) {
        this.netSvcPtcptId = value;
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

}
