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

package org.jpos.iso20022.sese_026_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementTransactionReversalAdviceV10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementTransactionReversalAdviceV10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxIdDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SettlementTypeAndIdentification27"/>
 *         <element name="ConfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}Max35Text"/>
 *         <element name="AddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}AdditionalParameters30" minOccurs="0"/>
 *         <element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SecuritiesTradeDetails118"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SecurityIdentification19"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}FinancialInstrumentAttributes111" minOccurs="0"/>
 *         <element name="QtyAndAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}QuantityAndAccount96"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SettlementDetails199"/>
 *         <element name="StgSttlmInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}StandingSettlementInstruction18" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SettlementParties100" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SettlementParties100" minOccurs="0"/>
 *         <element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}CashParties35" minOccurs="0"/>
 *         <element name="SttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}AmountAndDirection94" minOccurs="0"/>
 *         <element name="OthrAmts" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}OtherAmounts40" minOccurs="0"/>
 *         <element name="OthrBizPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}OtherParties43" minOccurs="0"/>
 *         <element name="AddtlPhysOrRegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}RegistrationParameters6" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.001.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionReversalAdviceV10", propOrder = {
    "txIdDtls",
    "confRef",
    "addtlParams",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sttlmParams",
    "stgSttlmInstrDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttldAmt",
    "othrAmts",
    "othrBizPties",
    "addtlPhysOrRegnDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionReversalAdviceV10 {

    @XmlElement(name = "TxIdDtls", required = true)
    protected SettlementTypeAndIdentification27 txIdDtls;
    @XmlElement(name = "ConfRef", required = true)
    protected String confRef;
    @XmlElement(name = "AddtlParams")
    protected AdditionalParameters30 addtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails118 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes111 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount96 qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails199 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction18 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties100 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties100 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties35 cshPties;
    @XmlElement(name = "SttldAmt")
    protected AmountAndDirection94 sttldAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts40 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties43 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters6 addtlPhysOrRegnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txIdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification27 }
     *     
     */
    public SettlementTypeAndIdentification27 getTxIdDtls() {
        return txIdDtls;
    }

    /**
     * Sets the value of the txIdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification27 }
     *     
     */
    public void setTxIdDtls(SettlementTypeAndIdentification27 value) {
        this.txIdDtls = value;
    }

    /**
     * Gets the value of the confRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfRef() {
        return confRef;
    }

    /**
     * Sets the value of the confRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfRef(String value) {
        this.confRef = value;
    }

    /**
     * Gets the value of the addtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParameters30 }
     *     
     */
    public AdditionalParameters30 getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters30 }
     *     
     */
    public void setAddtlParams(AdditionalParameters30 value) {
        this.addtlParams = value;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails118 }
     *     
     */
    public SecuritiesTradeDetails118 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails118 }
     *     
     */
    public void setTradDtls(SecuritiesTradeDetails118 value) {
        this.tradDtls = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes111 }
     *     
     */
    public FinancialInstrumentAttributes111 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes111 }
     *     
     */
    public void setFinInstrmAttrbts(FinancialInstrumentAttributes111 value) {
        this.finInstrmAttrbts = value;
    }

    /**
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount96 }
     *     
     */
    public QuantityAndAccount96 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount96 }
     *     
     */
    public void setQtyAndAcctDtls(QuantityAndAccount96 value) {
        this.qtyAndAcctDtls = value;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails199 }
     *     
     */
    public SettlementDetails199 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails199 }
     *     
     */
    public void setSttlmParams(SettlementDetails199 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the stgSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction18 }
     *     
     */
    public StandingSettlementInstruction18 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Sets the value of the stgSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction18 }
     *     
     */
    public void setStgSttlmInstrDtls(StandingSettlementInstruction18 value) {
        this.stgSttlmInstrDtls = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties100 }
     *     
     */
    public SettlementParties100 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties100 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties100 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties100 }
     *     
     */
    public SettlementParties100 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties100 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties100 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties35 }
     *     
     */
    public CashParties35 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties35 }
     *     
     */
    public void setCshPties(CashParties35 value) {
        this.cshPties = value;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public AmountAndDirection94 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public void setSttldAmt(AmountAndDirection94 value) {
        this.sttldAmt = value;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts40 }
     *     
     */
    public OtherAmounts40 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts40 }
     *     
     */
    public void setOthrAmts(OtherAmounts40 value) {
        this.othrAmts = value;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties43 }
     *     
     */
    public OtherParties43 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties43 }
     *     
     */
    public void setOthrBizPties(OtherParties43 value) {
        this.othrBizPties = value;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters6 }
     *     
     */
    public RegistrationParameters6 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters6 }
     *     
     */
    public void setAddtlPhysOrRegnDtls(RegistrationParameters6 value) {
        this.addtlPhysOrRegnDtls = value;
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
