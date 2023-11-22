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

package org.jpos.iso20022.secl_010_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementObligation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementObligation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RltdSttlmOblgtnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/>
 *         <element name="OblgtnTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ObligationType1Choice" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ISODate" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}FinancialInstrumentQuantity1Choice"/>
 *         <element name="NetPosPric" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Price4" minOccurs="0"/>
 *         <element name="TradgCcy" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}CurrencyCode" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}AmountAndDirection27"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ISODate"/>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ReceiveDelivery1Code"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DeliveryReceiptType2Code"/>
 *         <element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Reference19" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligation5", propOrder = {
    "rltdSttlmOblgtnId",
    "oblgtnTp",
    "desc",
    "tradDt",
    "qty",
    "netPosPric",
    "tradgCcy",
    "sttlmAmt",
    "sttlmDt",
    "sctiesMvmntTp",
    "pmt",
    "refs"
})
public class SettlementObligation5 {

    @XmlElement(name = "RltdSttlmOblgtnId")
    protected String rltdSttlmOblgtnId;
    @XmlElement(name = "OblgtnTp")
    protected ObligationType1Choice oblgtnTp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "TradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "NetPosPric")
    protected Price4 netPosPric;
    @XmlElement(name = "TradgCcy")
    protected String tradgCcy;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "SttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "Refs")
    protected Reference19 refs;

    /**
     * Gets the value of the rltdSttlmOblgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdSttlmOblgtnId() {
        return rltdSttlmOblgtnId;
    }

    /**
     * Sets the value of the rltdSttlmOblgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdSttlmOblgtnId(String value) {
        this.rltdSttlmOblgtnId = value;
    }

    /**
     * Gets the value of the oblgtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ObligationType1Choice }
     *     
     */
    public ObligationType1Choice getOblgtnTp() {
        return oblgtnTp;
    }

    /**
     * Sets the value of the oblgtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligationType1Choice }
     *     
     */
    public void setOblgtnTp(ObligationType1Choice value) {
        this.oblgtnTp = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the netPosPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getNetPosPric() {
        return netPosPric;
    }

    /**
     * Sets the value of the netPosPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public void setNetPosPric(Price4 value) {
        this.netPosPric = value;
    }

    /**
     * Gets the value of the tradgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCcy() {
        return tradgCcy;
    }

    /**
     * Sets the value of the tradgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgCcy(String value) {
        this.tradgCcy = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public AmountAndDirection27 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection27 value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public void setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference19 }
     *     
     */
    public Reference19 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference19 }
     *     
     */
    public void setRefs(Reference19 value) {
        this.refs = value;
    }

}
