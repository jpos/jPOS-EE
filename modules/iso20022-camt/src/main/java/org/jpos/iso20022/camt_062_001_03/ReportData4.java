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

package org.jpos.iso20022.camt_062_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportData4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportData4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}Max35Text"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}ISODate"/>
 *         <element name="DtAndTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}ISODateTime"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}Entry2Code"/>
 *         <element name="SchdlTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}Exact4AlphaNumericText"/>
 *         <element name="SttlmSsnIdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}Exact4AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData4", propOrder = {
    "msgId",
    "valDt",
    "dtAndTmStmp",
    "tp",
    "schdlTp",
    "sttlmSsnIdr"
})
public class ReportData4 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "ValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "DtAndTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTmStmp;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected Entry2Code tp;
    @XmlElement(name = "SchdlTp", required = true)
    protected String schdlTp;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;

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
     * Gets the value of the dtAndTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAndTmStmp() {
        return dtAndTmStmp;
    }

    /**
     * Sets the value of the dtAndTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAndTmStmp(XMLGregorianCalendar value) {
        this.dtAndTmStmp = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Entry2Code }
     *     
     */
    public Entry2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entry2Code }
     *     
     */
    public void setTp(Entry2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the schdlTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchdlTp() {
        return schdlTp;
    }

    /**
     * Sets the value of the schdlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchdlTp(String value) {
        this.schdlTp = value;
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

}
