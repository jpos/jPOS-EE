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

package org.jpos.iso20022.semt_017_002_12;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDetails165 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionDetails165">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxActvty" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}TransactionActivity4Choice"/>
 *         <element name="SttlmTxOrCorpActnEvtTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}SettlementOrCorporateActionEvent33Choice" minOccurs="0"/>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}ReceiveDelivery1Code"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}DeliveryReceiptType2Code"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}SettlementDetails198" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}PlaceOfTradeIdentification2" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}SafeKeepingPlace4" minOccurs="0"/>
 *         <element name="PlcOfClr" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}PlaceOfClearingIdentification2" minOccurs="0"/>
 *         <element name="PstngQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}Quantity54Choice"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}Max3Number" minOccurs="0"/>
 *         <element name="PstngAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}AmountAndDirection18" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}AmountAndDirection59" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}TradeDate9Choice" minOccurs="0"/>
 *         <element name="FctvSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}DateAndDateTime2Choice"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}SettlementDate20Choice" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="AckdStsTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}ISODateTime" minOccurs="0"/>
 *         <element name="MtchdStsTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}ISODateTime" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}SettlementParties109" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}SettlementParties109" minOccurs="0"/>
 *         <element name="RvslInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}YesNoIndicator" minOccurs="0"/>
 *         <element name="TxAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.002.12}RestrictedFINXMax350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails165", propOrder = {
    "txActvty",
    "sttlmTxOrCorpActnEvtTp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "plcOfTrad",
    "sfkpgPlc",
    "plcOfClr",
    "pstngQty",
    "nbOfDaysAcrd",
    "pstngAmt",
    "acrdIntrstAmt",
    "tradDt",
    "fctvSttlmDt",
    "sttlmDt",
    "valDt",
    "ackdStsTmStmp",
    "mtchdStsTmStmp",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "rvslInd",
    "txAddtlDtls"
})
public class TransactionDetails165 {

    @XmlElement(name = "TxActvty", required = true)
    protected TransactionActivity4Choice txActvty;
    @XmlElement(name = "SttlmTxOrCorpActnEvtTp")
    protected SettlementOrCorporateActionEvent33Choice sttlmTxOrCorpActnEvtTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails198 sttlmParams;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification2 plcOfTrad;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace4 sfkpgPlc;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "PstngQty", required = true)
    protected Quantity54Choice pstngQty;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "PstngAmt")
    protected AmountAndDirection18 pstngAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection59 acrdIntrstAmt;
    @XmlElement(name = "TradDt")
    protected TradeDate9Choice tradDt;
    @XmlElement(name = "FctvSttlmDt", required = true)
    protected DateAndDateTime2Choice fctvSttlmDt;
    @XmlElement(name = "SttlmDt")
    protected SettlementDate20Choice sttlmDt;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "AckdStsTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtchdStsTmStmp;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties109 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties109 rcvgSttlmPties;
    @XmlElement(name = "RvslInd")
    protected Boolean rvslInd;
    @XmlElement(name = "TxAddtlDtls")
    protected String txAddtlDtls;

    /**
     * Gets the value of the txActvty property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionActivity4Choice }
     *     
     */
    public TransactionActivity4Choice getTxActvty() {
        return txActvty;
    }

    /**
     * Sets the value of the txActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionActivity4Choice }
     *     
     */
    public void setTxActvty(TransactionActivity4Choice value) {
        this.txActvty = value;
    }

    /**
     * Gets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementOrCorporateActionEvent33Choice }
     *     
     */
    public SettlementOrCorporateActionEvent33Choice getSttlmTxOrCorpActnEvtTp() {
        return sttlmTxOrCorpActnEvtTp;
    }

    /**
     * Sets the value of the sttlmTxOrCorpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementOrCorporateActionEvent33Choice }
     *     
     */
    public void setSttlmTxOrCorpActnEvtTp(SettlementOrCorporateActionEvent33Choice value) {
        this.sttlmTxOrCorpActnEvtTp = value;
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
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails198 }
     *     
     */
    public SettlementDetails198 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails198 }
     *     
     */
    public void setSttlmParams(SettlementDetails198 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public PlaceOfTradeIdentification2 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification2 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public SafeKeepingPlace4 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace4 value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public PlaceOfClearingIdentification2 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public void setPlcOfClr(PlaceOfClearingIdentification2 value) {
        this.plcOfClr = value;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public void setPstngQty(Quantity54Choice value) {
        this.pstngQty = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection18 }
     *     
     */
    public AmountAndDirection18 getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection18 }
     *     
     */
    public void setPstngAmt(AmountAndDirection18 value) {
        this.pstngAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public AmountAndDirection59 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection59 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection59 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate9Choice }
     *     
     */
    public TradeDate9Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate9Choice }
     *     
     */
    public void setTradDt(TradeDate9Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setFctvSttlmDt(DateAndDateTime2Choice value) {
        this.fctvSttlmDt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate20Choice }
     *     
     */
    public SettlementDate20Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate20Choice }
     *     
     */
    public void setSttlmDt(SettlementDate20Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the ackdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAckdStsTmStmp() {
        return ackdStsTmStmp;
    }

    /**
     * Sets the value of the ackdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAckdStsTmStmp(XMLGregorianCalendar value) {
        this.ackdStsTmStmp = value;
    }

    /**
     * Gets the value of the mtchdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtchdStsTmStmp() {
        return mtchdStsTmStmp;
    }

    /**
     * Sets the value of the mtchdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtchdStsTmStmp(XMLGregorianCalendar value) {
        this.mtchdStsTmStmp = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties109 }
     *     
     */
    public SettlementParties109 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties109 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties109 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties109 }
     *     
     */
    public SettlementParties109 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties109 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties109 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the rvslInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRvslInd() {
        return rvslInd;
    }

    /**
     * Sets the value of the rvslInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRvslInd(Boolean value) {
        this.rvslInd = value;
    }

    /**
     * Gets the value of the txAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxAddtlDtls() {
        return txAddtlDtls;
    }

    /**
     * Sets the value of the txAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxAddtlDtls(String value) {
        this.txAddtlDtls = value;
    }

}
