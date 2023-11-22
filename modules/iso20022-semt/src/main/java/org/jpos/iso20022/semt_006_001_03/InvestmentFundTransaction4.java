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

package org.jpos.iso20022.semt_006_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundTransaction4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentFundTransaction4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtTp" type="{urn:swift:xsd:semt.006.001.03}TransactionType1Choice"/>
 *         <element name="BookgSts" type="{urn:swift:xsd:semt.006.001.03}TransactionStatus1Code" minOccurs="0"/>
 *         <element name="MstrRef" type="{urn:swift:xsd:semt.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="OrdrRef" type="{urn:swift:xsd:semt.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="ClntRef" type="{urn:swift:xsd:semt.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DealRef" type="{urn:swift:xsd:semt.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="LegId" type="{urn:swift:xsd:semt.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="LegExctnId" type="{urn:swift:xsd:semt.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="OrdrDtTm" type="{urn:swift:xsd:semt.006.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="SttldTxInd" type="{urn:swift:xsd:semt.006.001.03}YesNoIndicator"/>
 *         <element name="RegdTxInd" type="{urn:swift:xsd:semt.006.001.03}YesNoIndicator"/>
 *         <element name="UnitsQty" type="{urn:swift:xsd:semt.006.001.03}FinancialInstrumentQuantity1"/>
 *         <element name="CdtDbt" type="{urn:swift:xsd:semt.006.001.03}CreditDebitCode"/>
 *         <element name="Rvsl" type="{urn:swift:xsd:semt.006.001.03}ReversalCode" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:swift:xsd:semt.006.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:swift:xsd:semt.006.001.03}ISODate" minOccurs="0"/>
 *         <element name="TradDtTm" type="{urn:swift:xsd:semt.006.001.03}DateAndDateTimeChoice"/>
 *         <element name="CumDvddInd" type="{urn:swift:xsd:semt.006.001.03}YesNoIndicator"/>
 *         <element name="PrtlyExctdInd" type="{urn:swift:xsd:semt.006.001.03}YesNoIndicator"/>
 *         <element name="PricDtls" type="{urn:swift:xsd:semt.006.001.03}UnitPrice20" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundTransaction4", propOrder = {
    "evtTp",
    "bookgSts",
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "legId",
    "legExctnId",
    "ordrDtTm",
    "sttldTxInd",
    "regdTxInd",
    "unitsQty",
    "cdtDbt",
    "rvsl",
    "sttlmAmt",
    "sttlmDt",
    "tradDtTm",
    "cumDvddInd",
    "prtlyExctdInd",
    "pricDtls"
})
public class InvestmentFundTransaction4 {

    @XmlElement(name = "EvtTp", required = true)
    protected TransactionType1Choice evtTp;
    @XmlElement(name = "BookgSts")
    @XmlSchemaType(name = "string")
    protected TransactionStatus1Code bookgSts;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef")
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "LegExctnId")
    protected String legExctnId;
    @XmlElement(name = "OrdrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordrDtTm;
    @XmlElement(name = "SttldTxInd")
    protected boolean sttldTxInd;
    @XmlElement(name = "RegdTxInd")
    protected boolean regdTxInd;
    @XmlElement(name = "UnitsQty", required = true)
    protected FinancialInstrumentQuantity1 unitsQty;
    @XmlElement(name = "CdtDbt", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbt;
    @XmlElement(name = "Rvsl")
    @XmlSchemaType(name = "string")
    protected ReversalCode rvsl;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "SttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "PrtlyExctdInd")
    protected boolean prtlyExctdInd;
    @XmlElement(name = "PricDtls")
    protected UnitPrice20 pricDtls;

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType1Choice }
     *     
     */
    public TransactionType1Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType1Choice }
     *     
     */
    public void setEvtTp(TransactionType1Choice value) {
        this.evtTp = value;
    }

    /**
     * Gets the value of the bookgSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus1Code }
     *     
     */
    public TransactionStatus1Code getBookgSts() {
        return bookgSts;
    }

    /**
     * Sets the value of the bookgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus1Code }
     *     
     */
    public void setBookgSts(TransactionStatus1Code value) {
        this.bookgSts = value;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrRef(String value) {
        this.ordrRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntRef(String value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealRef(String value) {
        this.dealRef = value;
    }

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegId(String value) {
        this.legId = value;
    }

    /**
     * Gets the value of the legExctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExctnId() {
        return legExctnId;
    }

    /**
     * Sets the value of the legExctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegExctnId(String value) {
        this.legExctnId = value;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdrDtTm(XMLGregorianCalendar value) {
        this.ordrDtTm = value;
    }

    /**
     * Gets the value of the sttldTxInd property.
     * 
     */
    public boolean isSttldTxInd() {
        return sttldTxInd;
    }

    /**
     * Sets the value of the sttldTxInd property.
     * 
     */
    public void setSttldTxInd(boolean value) {
        this.sttldTxInd = value;
    }

    /**
     * Gets the value of the regdTxInd property.
     * 
     */
    public boolean isRegdTxInd() {
        return regdTxInd;
    }

    /**
     * Sets the value of the regdTxInd property.
     * 
     */
    public void setRegdTxInd(boolean value) {
        this.regdTxInd = value;
    }

    /**
     * Gets the value of the unitsQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getUnitsQty() {
        return unitsQty;
    }

    /**
     * Sets the value of the unitsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setUnitsQty(FinancialInstrumentQuantity1 value) {
        this.unitsQty = value;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbt(CreditDebitCode value) {
        this.cdtDbt = value;
    }

    /**
     * Gets the value of the rvsl property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalCode }
     *     
     */
    public ReversalCode getRvsl() {
        return rvsl;
    }

    /**
     * Sets the value of the rvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalCode }
     *     
     */
    public void setRvsl(ReversalCode value) {
        this.rvsl = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSttlmAmt(ActiveCurrencyAndAmount value) {
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
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public void setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
    }

    /**
     * Gets the value of the prtlyExctdInd property.
     * 
     */
    public boolean isPrtlyExctdInd() {
        return prtlyExctdInd;
    }

    /**
     * Sets the value of the prtlyExctdInd property.
     * 
     */
    public void setPrtlyExctdInd(boolean value) {
        this.prtlyExctdInd = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice20 }
     *     
     */
    public UnitPrice20 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice20 }
     *     
     */
    public void setPricDtls(UnitPrice20 value) {
        this.pricDtls = value;
    }

}
