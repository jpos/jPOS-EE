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

package org.jpos.iso20022.auth_013_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsecuredMarketTransaction4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnsecuredMarketTransaction4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptdTxSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}TransactionOperationType1Code"/>
 *         <element name="NvtnSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}NovationStatus1Code" minOccurs="0"/>
 *         <element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}LEIIdentifier" minOccurs="0"/>
 *         <element name="UnqTxIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}Max105Text" minOccurs="0"/>
 *         <element name="PrtryTxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}Max105Text"/>
 *         <element name="RltdPrtryTxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}Max105Text" minOccurs="0"/>
 *         <element name="CtrPtyPrtryTxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}Max105Text" minOccurs="0"/>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}CounterpartyIdentification3Choice"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}DateAndDateTimeChoice"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}ISODate"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}ISODate"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}MoneyMarketTransactionType1Code"/>
 *         <element name="InstrmTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}FinancialInstrumentProductType1Code"/>
 *         <element name="TxNmnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}ActiveCurrencyAndAmount"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}PercentageRate"/>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}InterestRateType1Code"/>
 *         <element name="DealRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}PercentageRate" minOccurs="0"/>
 *         <element name="FltgRateNote" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}FloatingRateNote2" minOccurs="0"/>
 *         <element name="BrkrdDeal" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}BrokeredDeal1Code" minOccurs="0"/>
 *         <element name="CallPutOptn" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}Option12" maxOccurs="2" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsecuredMarketTransaction4", propOrder = {
    "rptdTxSts",
    "nvtnSts",
    "brnchId",
    "unqTxIdr",
    "prtryTxId",
    "rltdPrtryTxId",
    "ctrPtyPrtryTxId",
    "ctrPtyId",
    "tradDt",
    "sttlmDt",
    "mtrtyDt",
    "txTp",
    "instrmTp",
    "txNmnlAmt",
    "dealPric",
    "rateTp",
    "dealRate",
    "fltgRateNote",
    "brkrdDeal",
    "callPutOptn",
    "splmtryData"
})
public class UnsecuredMarketTransaction4 {

    @XmlElement(name = "RptdTxSts", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionOperationType1Code rptdTxSts;
    @XmlElement(name = "NvtnSts")
    @XmlSchemaType(name = "string")
    protected NovationStatus1Code nvtnSts;
    @XmlElement(name = "BrnchId")
    protected String brnchId;
    @XmlElement(name = "UnqTxIdr")
    protected String unqTxIdr;
    @XmlElement(name = "PrtryTxId", required = true)
    protected String prtryTxId;
    @XmlElement(name = "RltdPrtryTxId")
    protected String rltdPrtryTxId;
    @XmlElement(name = "CtrPtyPrtryTxId")
    protected String ctrPtyPrtryTxId;
    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyIdentification3Choice ctrPtyId;
    @XmlElement(name = "TradDt", required = true)
    protected DateAndDateTimeChoice tradDt;
    @XmlElement(name = "SttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "MtrtyDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected MoneyMarketTransactionType1Code txTp;
    @XmlElement(name = "InstrmTp", required = true)
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentProductType1Code instrmTp;
    @XmlElement(name = "TxNmnlAmt", required = true)
    protected ActiveCurrencyAndAmount txNmnlAmt;
    @XmlElement(name = "DealPric", required = true)
    protected BigDecimal dealPric;
    @XmlElement(name = "RateTp", required = true)
    @XmlSchemaType(name = "string")
    protected InterestRateType1Code rateTp;
    @XmlElement(name = "DealRate")
    protected BigDecimal dealRate;
    @XmlElement(name = "FltgRateNote")
    protected FloatingRateNote2 fltgRateNote;
    @XmlElement(name = "BrkrdDeal")
    @XmlSchemaType(name = "string")
    protected BrokeredDeal1Code brkrdDeal;
    @XmlElement(name = "CallPutOptn")
    protected List<Option12> callPutOptn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptdTxSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType1Code }
     *     
     */
    public TransactionOperationType1Code getRptdTxSts() {
        return rptdTxSts;
    }

    /**
     * Sets the value of the rptdTxSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType1Code }
     *     
     */
    public void setRptdTxSts(TransactionOperationType1Code value) {
        this.rptdTxSts = value;
    }

    /**
     * Gets the value of the nvtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link NovationStatus1Code }
     *     
     */
    public NovationStatus1Code getNvtnSts() {
        return nvtnSts;
    }

    /**
     * Sets the value of the nvtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NovationStatus1Code }
     *     
     */
    public void setNvtnSts(NovationStatus1Code value) {
        this.nvtnSts = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnchId(String value) {
        this.brnchId = value;
    }

    /**
     * Gets the value of the unqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTxIdr() {
        return unqTxIdr;
    }

    /**
     * Sets the value of the unqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqTxIdr(String value) {
        this.unqTxIdr = value;
    }

    /**
     * Gets the value of the prtryTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryTxId() {
        return prtryTxId;
    }

    /**
     * Sets the value of the prtryTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryTxId(String value) {
        this.prtryTxId = value;
    }

    /**
     * Gets the value of the rltdPrtryTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdPrtryTxId() {
        return rltdPrtryTxId;
    }

    /**
     * Sets the value of the rltdPrtryTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdPrtryTxId(String value) {
        this.rltdPrtryTxId = value;
    }

    /**
     * Gets the value of the ctrPtyPrtryTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyPrtryTxId() {
        return ctrPtyPrtryTxId;
    }

    /**
     * Sets the value of the ctrPtyPrtryTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyPrtryTxId(String value) {
        this.ctrPtyPrtryTxId = value;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification3Choice }
     *     
     */
    public CounterpartyIdentification3Choice getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification3Choice }
     *     
     */
    public void setCtrPtyId(CounterpartyIdentification3Choice value) {
        this.ctrPtyId = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setTradDt(DateAndDateTimeChoice value) {
        this.tradDt = value;
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
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketTransactionType1Code }
     *     
     */
    public MoneyMarketTransactionType1Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketTransactionType1Code }
     *     
     */
    public void setTxTp(MoneyMarketTransactionType1Code value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the instrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentProductType1Code }
     *     
     */
    public FinancialInstrumentProductType1Code getInstrmTp() {
        return instrmTp;
    }

    /**
     * Sets the value of the instrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentProductType1Code }
     *     
     */
    public void setInstrmTp(FinancialInstrumentProductType1Code value) {
        this.instrmTp = value;
    }

    /**
     * Gets the value of the txNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxNmnlAmt() {
        return txNmnlAmt;
    }

    /**
     * Sets the value of the txNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTxNmnlAmt(ActiveCurrencyAndAmount value) {
        this.txNmnlAmt = value;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDealPric(BigDecimal value) {
        this.dealPric = value;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateType1Code }
     *     
     */
    public InterestRateType1Code getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateType1Code }
     *     
     */
    public void setRateTp(InterestRateType1Code value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the dealRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDealRate() {
        return dealRate;
    }

    /**
     * Sets the value of the dealRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDealRate(BigDecimal value) {
        this.dealRate = value;
    }

    /**
     * Gets the value of the fltgRateNote property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateNote2 }
     *     
     */
    public FloatingRateNote2 getFltgRateNote() {
        return fltgRateNote;
    }

    /**
     * Sets the value of the fltgRateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateNote2 }
     *     
     */
    public void setFltgRateNote(FloatingRateNote2 value) {
        this.fltgRateNote = value;
    }

    /**
     * Gets the value of the brkrdDeal property.
     * 
     * @return
     *     possible object is
     *     {@link BrokeredDeal1Code }
     *     
     */
    public BrokeredDeal1Code getBrkrdDeal() {
        return brkrdDeal;
    }

    /**
     * Sets the value of the brkrdDeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokeredDeal1Code }
     *     
     */
    public void setBrkrdDeal(BrokeredDeal1Code value) {
        this.brkrdDeal = value;
    }

    /**
     * Gets the value of the callPutOptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the callPutOptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallPutOptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option12 }
     * 
     * 
     * @return
     *     The value of the callPutOptn property.
     */
    public List<Option12> getCallPutOptn() {
        if (callPutOptn == null) {
            callPutOptn = new ArrayList<>();
        }
        return this.callPutOptn;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
