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

package org.jpos.iso20022.admi_005_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportQuerySearchCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportQuerySearchCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}AccountIdentificationSearchCriteria2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}CashBalance12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RptNm" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}Max4AlphaNumericText" minOccurs="0"/>
 *         <element name="MsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}PartyIdentification136"/>
 *         <element name="RspnsblPtyId" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="DtSch" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="SchdldTm" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}DateTimePeriod1Choice" minOccurs="0"/>
 *         <element name="Evt" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}EventType1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportQuerySearchCriteria2", propOrder = {
    "acctId",
    "bal",
    "rptNm",
    "msgNmId",
    "ptyId",
    "rspnsblPtyId",
    "dtSch",
    "schdldTm",
    "evt"
})
public class ReportQuerySearchCriteria2 {

    @XmlElement(name = "AcctId")
    protected List<AccountIdentificationSearchCriteria2Choice> acctId;
    @XmlElement(name = "Bal")
    protected List<CashBalance12> bal;
    @XmlElement(name = "RptNm")
    protected String rptNm;
    @XmlElement(name = "MsgNmId")
    protected String msgNmId;
    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification136 ptyId;
    @XmlElement(name = "RspnsblPtyId")
    protected PartyIdentification136 rspnsblPtyId;
    @XmlElement(name = "DtSch")
    protected DatePeriodSearch1Choice dtSch;
    @XmlElement(name = "SchdldTm")
    protected DateTimePeriod1Choice schdldTm;
    @XmlElement(name = "Evt")
    protected EventType1Choice evt;

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     * @return
     *     The value of the acctId property.
     */
    public List<AccountIdentificationSearchCriteria2Choice> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance12 }
     * 
     * 
     * @return
     *     The value of the bal property.
     */
    public List<CashBalance12> getBal() {
        if (bal == null) {
            bal = new ArrayList<>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the rptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNm() {
        return rptNm;
    }

    /**
     * Sets the value of the rptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptNm(String value) {
        this.rptNm = value;
    }

    /**
     * Gets the value of the msgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNmId() {
        return msgNmId;
    }

    /**
     * Sets the value of the msgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNmId(String value) {
        this.msgNmId = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setPtyId(PartyIdentification136 value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setRspnsblPtyId(PartyIdentification136 value) {
        this.rspnsblPtyId = value;
    }

    /**
     * Gets the value of the dtSch property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDtSch() {
        return dtSch;
    }

    /**
     * Sets the value of the dtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setDtSch(DatePeriodSearch1Choice value) {
        this.dtSch = value;
    }

    /**
     * Gets the value of the schdldTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getSchdldTm() {
        return schdldTm;
    }

    /**
     * Sets the value of the schdldTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setSchdldTm(DateTimePeriod1Choice value) {
        this.schdldTm = value;
    }

    /**
     * Gets the value of the evt property.
     * 
     * @return
     *     possible object is
     *     {@link EventType1Choice }
     *     
     */
    public EventType1Choice getEvt() {
        return evt;
    }

    /**
     * Sets the value of the evt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType1Choice }
     *     
     */
    public void setEvt(EventType1Choice value) {
        this.evt = value;
    }

}
