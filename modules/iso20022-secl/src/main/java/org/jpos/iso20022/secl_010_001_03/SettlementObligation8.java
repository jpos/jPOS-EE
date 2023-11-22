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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementObligation8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementObligation8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmOblgtnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SecurityIdentification14"/>
 *         <element name="IntnddSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DateFormat11Choice"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}FinancialInstrumentQuantity1Choice"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}AmountAndDirection27"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}MarketIdentification84"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}TradeDate3Choice" minOccurs="0"/>
 *         <element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}TradingCapacity5Code" minOccurs="0"/>
 *         <element name="ClrAcctTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ClearingAccountType1Code" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SafekeepingPlaceFormat7Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ReceiveDelivery1Code" minOccurs="0"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DeliveryReceiptType2Code"/>
 *         <element name="SttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SettlementParties4Choice" minOccurs="0"/>
 *         <element name="AddtlSttlmOblgtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SettlementObligation5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligation8", propOrder = {
    "sttlmOblgtnId",
    "finInstrmId",
    "intnddSttlmDt",
    "qty",
    "sttlmAmt",
    "plcOfTrad",
    "tradDt",
    "tradgCpcty",
    "clrAcctTp",
    "sfkpgPlc",
    "sfkpgAcct",
    "sctiesMvmntTp",
    "pmt",
    "sttlmPties",
    "addtlSttlmOblgtnDtls"
})
public class SettlementObligation8 {

    @XmlElement(name = "SttlmOblgtnId", required = true)
    protected String sttlmOblgtnId;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "IntnddSttlmDt", required = true)
    protected DateFormat11Choice intnddSttlmDt;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "PlcOfTrad", required = true)
    protected MarketIdentification84 plcOfTrad;
    @XmlElement(name = "TradDt")
    protected TradeDate3Choice tradDt;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "ClrAcctTp")
    @XmlSchemaType(name = "string")
    protected ClearingAccountType1Code clrAcctTp;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat7Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "SctiesMvmntTp")
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties4Choice sttlmPties;
    @XmlElement(name = "AddtlSttlmOblgtnDtls")
    protected List<SettlementObligation5> addtlSttlmOblgtnDtls;

    /**
     * Gets the value of the sttlmOblgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmOblgtnId() {
        return sttlmOblgtnId;
    }

    /**
     * Sets the value of the sttlmOblgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmOblgtnId(String value) {
        this.sttlmOblgtnId = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat11Choice }
     *     
     */
    public DateFormat11Choice getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat11Choice }
     *     
     */
    public void setIntnddSttlmDt(DateFormat11Choice value) {
        this.intnddSttlmDt = value;
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
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification84 }
     *     
     */
    public MarketIdentification84 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification84 }
     *     
     */
    public void setPlcOfTrad(MarketIdentification84 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate3Choice }
     *     
     */
    public TradeDate3Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate3Choice }
     *     
     */
    public void setTradDt(TradeDate3Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradingCapacity5Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public void setTradgCpcty(TradingCapacity5Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Gets the value of the clrAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingAccountType1Code }
     *     
     */
    public ClearingAccountType1Code getClrAcctTp() {
        return clrAcctTp;
    }

    /**
     * Sets the value of the clrAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingAccountType1Code }
     *     
     */
    public void setClrAcctTp(ClearingAccountType1Code value) {
        this.clrAcctTp = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public SafekeepingPlaceFormat7Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat7Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
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
     * Gets the value of the sttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties4Choice }
     *     
     */
    public SettlementParties4Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Sets the value of the sttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties4Choice }
     *     
     */
    public void setSttlmPties(SettlementParties4Choice value) {
        this.sttlmPties = value;
    }

    /**
     * Gets the value of the addtlSttlmOblgtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSttlmOblgtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSttlmOblgtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementObligation5 }
     * 
     * 
     * @return
     *     The value of the addtlSttlmOblgtnDtls property.
     */
    public List<SettlementObligation5> getAddtlSttlmOblgtnDtls() {
        if (addtlSttlmOblgtnDtls == null) {
            addtlSttlmOblgtnDtls = new ArrayList<>();
        }
        return this.addtlSttlmOblgtnDtls;
    }

}
