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

package org.jpos.iso20022.sese_028_002_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementTransactionAllegementNotification002V10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementTransactionAllegementNotification002V10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}RestrictedFINXMax16Text"/>
 *         <element name="SttlmTpAndAddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SettlementTypeAndAdditionalParameters15"/>
 *         <element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="CtrPtyMktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Max35Text" minOccurs="0"/>
 *         <element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SecuritiesTradeDetails126"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SecurityIdentification20"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}FinancialInstrumentAttributes122" minOccurs="0"/>
 *         <element name="QtyAndAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}QuantityAndAccount106"/>
 *         <element name="SctiesFincgDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SecuritiesFinancingTransactionDetails50" minOccurs="0"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SettlementDetails191"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SettlementParties105" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SettlementParties105" minOccurs="0"/>
 *         <element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}CashParties40" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}AmountAndDirection92" minOccurs="0"/>
 *         <element name="OthrAmts" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}OtherAmounts36" minOccurs="0"/>
 *         <element name="OthrBizPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}OtherParties37" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionAllegementNotification002V10", propOrder = {
    "txId",
    "sttlmTpAndAddtlParams",
    "mktInfrstrctrTxId",
    "ctrPtyMktInfrstrctrTxId",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sctiesFincgDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttlmAmt",
    "othrAmts",
    "othrBizPties",
    "splmtryData"
})
public class SecuritiesSettlementTransactionAllegementNotification002V10 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "SttlmTpAndAddtlParams", required = true)
    protected SettlementTypeAndAdditionalParameters15 sttlmTpAndAddtlParams;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "CtrPtyMktInfrstrctrTxId")
    protected String ctrPtyMktInfrstrctrTxId;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails126 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes122 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount106 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgDtls")
    protected SecuritiesFinancingTransactionDetails50 sctiesFincgDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails191 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties105 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties105 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties40 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection92 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts36 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties37 othrBizPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the sttlmTpAndAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndAdditionalParameters15 }
     *     
     */
    public SettlementTypeAndAdditionalParameters15 getSttlmTpAndAddtlParams() {
        return sttlmTpAndAddtlParams;
    }

    /**
     * Sets the value of the sttlmTpAndAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndAdditionalParameters15 }
     *     
     */
    public void setSttlmTpAndAddtlParams(SettlementTypeAndAdditionalParameters15 value) {
        this.sttlmTpAndAddtlParams = value;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
    }

    /**
     * Gets the value of the ctrPtyMktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyMktInfrstrctrTxId() {
        return ctrPtyMktInfrstrctrTxId;
    }

    /**
     * Sets the value of the ctrPtyMktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyMktInfrstrctrTxId(String value) {
        this.ctrPtyMktInfrstrctrTxId = value;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails126 }
     *     
     */
    public SecuritiesTradeDetails126 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails126 }
     *     
     */
    public void setTradDtls(SecuritiesTradeDetails126 value) {
        this.tradDtls = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes122 }
     *     
     */
    public FinancialInstrumentAttributes122 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes122 }
     *     
     */
    public void setFinInstrmAttrbts(FinancialInstrumentAttributes122 value) {
        this.finInstrmAttrbts = value;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount106 }
     *     
     */
    public QuantityAndAccount106 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount106 }
     *     
     */
    public void setQtyAndAcctDtls(QuantityAndAccount106 value) {
        this.qtyAndAcctDtls = value;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails50 }
     *     
     */
    public SecuritiesFinancingTransactionDetails50 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails50 }
     *     
     */
    public void setSctiesFincgDtls(SecuritiesFinancingTransactionDetails50 value) {
        this.sctiesFincgDtls = value;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails191 }
     *     
     */
    public SettlementDetails191 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails191 }
     *     
     */
    public void setSttlmParams(SettlementDetails191 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties105 }
     *     
     */
    public SettlementParties105 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties105 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties105 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties105 }
     *     
     */
    public SettlementParties105 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties105 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties105 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties40 }
     *     
     */
    public CashParties40 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties40 }
     *     
     */
    public void setCshPties(CashParties40 value) {
        this.cshPties = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection92 }
     *     
     */
    public AmountAndDirection92 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection92 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection92 value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts36 }
     *     
     */
    public OtherAmounts36 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts36 }
     *     
     */
    public void setOthrAmts(OtherAmounts36 value) {
        this.othrAmts = value;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties37 }
     *     
     */
    public OtherParties37 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties37 }
     *     
     */
    public void setOthrBizPties(OtherParties37 value) {
        this.othrBizPties = value;
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
