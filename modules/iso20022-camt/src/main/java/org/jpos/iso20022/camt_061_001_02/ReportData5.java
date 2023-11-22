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

package org.jpos.iso20022.camt_061_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportData5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportData5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.061.001.02}Max35Text"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.061.001.02}ISODate"/>
 *         <element name="DtAndTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:camt.061.001.02}ISODateTime"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.061.001.02}CallIn1Code"/>
 *         <element name="PayInCallAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.061.001.02}PayInCallItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmSsnIdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.061.001.02}Exact4AlphaNumericText" minOccurs="0"/>
 *         <element name="AcctVal" type="{urn:iso:std:iso:20022:tech:xsd:camt.061.001.02}Value" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData5", propOrder = {
    "msgId",
    "valDt",
    "dtAndTmStmp",
    "tp",
    "payInCallAmt",
    "sttlmSsnIdr",
    "acctVal"
})
public class ReportData5 {

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
    protected CallIn1Code tp;
    @XmlElement(name = "PayInCallAmt")
    protected List<PayInCallItem> payInCallAmt;
    @XmlElement(name = "SttlmSsnIdr")
    protected String sttlmSsnIdr;
    @XmlElement(name = "AcctVal")
    protected Value acctVal;

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
     *     {@link CallIn1Code }
     *     
     */
    public CallIn1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallIn1Code }
     *     
     */
    public void setTp(CallIn1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the payInCallAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payInCallAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInCallAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayInCallItem }
     * 
     * 
     * @return
     *     The value of the payInCallAmt property.
     */
    public List<PayInCallItem> getPayInCallAmt() {
        if (payInCallAmt == null) {
            payInCallAmt = new ArrayList<>();
        }
        return this.payInCallAmt;
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
     * Gets the value of the acctVal property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getAcctVal() {
        return acctVal;
    }

    /**
     * Sets the value of the acctVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setAcctVal(Value value) {
        this.acctVal = value;
    }

}
