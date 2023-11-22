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

package org.jpos.iso20022.sese_026_002_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementTransactionReversalAdvice002V10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementTransactionReversalAdvice002V10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxIdDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlementTypeAndIdentification28"/>
 *         <element name="ConfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}RestrictedFINXMax16Text"/>
 *         <element name="AddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}AdditionalParameters32" minOccurs="0"/>
 *         <element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SecuritiesTradeDetails128"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SecurityIdentification20"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}FinancialInstrumentAttributes122" minOccurs="0"/>
 *         <element name="QtyAndAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}QuantityAndAccount108"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlementDetails209"/>
 *         <element name="StgSttlmInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}StandingSettlementInstruction19" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlementParties105" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlementParties105" minOccurs="0"/>
 *         <element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}CashParties40" minOccurs="0"/>
 *         <element name="SttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}AmountAndDirection96" minOccurs="0"/>
 *         <element name="OthrAmts" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}OtherAmounts44" minOccurs="0"/>
 *         <element name="OthrBizPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}OtherParties44" minOccurs="0"/>
 *         <element name="AddtlPhysOrRegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}RegistrationParameters7" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionReversalAdvice002V10", propOrder = {
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
public class SecuritiesSettlementTransactionReversalAdvice002V10 {

    @XmlElement(name = "TxIdDtls", required = true)
    protected SettlementTypeAndIdentification28 txIdDtls;
    @XmlElement(name = "ConfRef", required = true)
    protected String confRef;
    @XmlElement(name = "AddtlParams")
    protected AdditionalParameters32 addtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails128 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes122 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount108 qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails209 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction19 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties105 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties105 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties40 cshPties;
    @XmlElement(name = "SttldAmt")
    protected AmountAndDirection96 sttldAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts44 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties44 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters7 addtlPhysOrRegnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txIdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification28 }
     *     
     */
    public SettlementTypeAndIdentification28 getTxIdDtls() {
        return txIdDtls;
    }

    /**
     * Sets the value of the txIdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification28 }
     *     
     */
    public void setTxIdDtls(SettlementTypeAndIdentification28 value) {
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
     *     {@link AdditionalParameters32 }
     *     
     */
    public AdditionalParameters32 getAddtlParams() {
        return addtlParams;
    }

    /**
     * Sets the value of the addtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParameters32 }
     *     
     */
    public void setAddtlParams(AdditionalParameters32 value) {
        this.addtlParams = value;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails128 }
     *     
     */
    public SecuritiesTradeDetails128 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails128 }
     *     
     */
    public void setTradDtls(SecuritiesTradeDetails128 value) {
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
     *     {@link QuantityAndAccount108 }
     *     
     */
    public QuantityAndAccount108 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount108 }
     *     
     */
    public void setQtyAndAcctDtls(QuantityAndAccount108 value) {
        this.qtyAndAcctDtls = value;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails209 }
     *     
     */
    public SettlementDetails209 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails209 }
     *     
     */
    public void setSttlmParams(SettlementDetails209 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the stgSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction19 }
     *     
     */
    public StandingSettlementInstruction19 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Sets the value of the stgSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction19 }
     *     
     */
    public void setStgSttlmInstrDtls(StandingSettlementInstruction19 value) {
        this.stgSttlmInstrDtls = value;
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
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection96 }
     *     
     */
    public AmountAndDirection96 getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection96 }
     *     
     */
    public void setSttldAmt(AmountAndDirection96 value) {
        this.sttldAmt = value;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts44 }
     *     
     */
    public OtherAmounts44 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts44 }
     *     
     */
    public void setOthrAmts(OtherAmounts44 value) {
        this.othrAmts = value;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties44 }
     *     
     */
    public OtherParties44 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties44 }
     *     
     */
    public void setOthrBizPties(OtherParties44 value) {
        this.othrBizPties = value;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters7 }
     *     
     */
    public RegistrationParameters7 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters7 }
     *     
     */
    public void setAddtlPhysOrRegnDtls(RegistrationParameters7 value) {
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
