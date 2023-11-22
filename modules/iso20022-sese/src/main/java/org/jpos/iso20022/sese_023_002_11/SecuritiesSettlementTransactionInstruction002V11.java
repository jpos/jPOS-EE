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

package org.jpos.iso20022.sese_023_002_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementTransactionInstruction002V11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementTransactionInstruction002V11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}RestrictedFINXMax16Text"/>
 *         <element name="SttlmTpAndAddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}SettlementTypeAndAdditionalParameters22"/>
 *         <element name="NbCounts" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}NumberCount2Choice" minOccurs="0"/>
 *         <element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}Linkages65" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}SecuritiesTradeDetails131"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}SecurityIdentification20"/>
 *         <element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}FinancialInstrumentAttributes122" minOccurs="0"/>
 *         <element name="QtyAndAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}QuantityAndAccount104"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}SettlementDetails207"/>
 *         <element name="StgSttlmInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}StandingSettlementInstruction19" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}SettlementParties105" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}SettlementParties105" minOccurs="0"/>
 *         <element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}CashParties38" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}AmountAndDirection96" minOccurs="0"/>
 *         <element name="OthrAmts" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}OtherAmounts43" minOccurs="0"/>
 *         <element name="OthrBizPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}OtherParties44" minOccurs="0"/>
 *         <element name="AddtlPhysOrRegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}RegistrationParameters7" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionInstruction002V11", propOrder = {
    "txId",
    "sttlmTpAndAddtlParams",
    "nbCounts",
    "lnkgs",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sttlmParams",
    "stgSttlmInstrDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttlmAmt",
    "othrAmts",
    "othrBizPties",
    "addtlPhysOrRegnDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionInstruction002V11 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "SttlmTpAndAddtlParams", required = true)
    protected SettlementTypeAndAdditionalParameters22 sttlmTpAndAddtlParams;
    @XmlElement(name = "NbCounts")
    protected NumberCount2Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages65> lnkgs;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails131 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes122 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount104 qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails207 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction19 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties105 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties105 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties38 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection96 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts43 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties44 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters7 addtlPhysOrRegnDtls;
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
     *     {@link SettlementTypeAndAdditionalParameters22 }
     *     
     */
    public SettlementTypeAndAdditionalParameters22 getSttlmTpAndAddtlParams() {
        return sttlmTpAndAddtlParams;
    }

    /**
     * Sets the value of the sttlmTpAndAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndAdditionalParameters22 }
     *     
     */
    public void setSttlmTpAndAddtlParams(SettlementTypeAndAdditionalParameters22 value) {
        this.sttlmTpAndAddtlParams = value;
    }

    /**
     * Gets the value of the nbCounts property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount2Choice }
     *     
     */
    public NumberCount2Choice getNbCounts() {
        return nbCounts;
    }

    /**
     * Sets the value of the nbCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount2Choice }
     *     
     */
    public void setNbCounts(NumberCount2Choice value) {
        this.nbCounts = value;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages65 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages65> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails131 }
     *     
     */
    public SecuritiesTradeDetails131 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails131 }
     *     
     */
    public void setTradDtls(SecuritiesTradeDetails131 value) {
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
     *     {@link QuantityAndAccount104 }
     *     
     */
    public QuantityAndAccount104 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount104 }
     *     
     */
    public void setQtyAndAcctDtls(QuantityAndAccount104 value) {
        this.qtyAndAcctDtls = value;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails207 }
     *     
     */
    public SettlementDetails207 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails207 }
     *     
     */
    public void setSttlmParams(SettlementDetails207 value) {
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
     *     {@link CashParties38 }
     *     
     */
    public CashParties38 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties38 }
     *     
     */
    public void setCshPties(CashParties38 value) {
        this.cshPties = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection96 }
     *     
     */
    public AmountAndDirection96 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection96 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection96 value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts43 }
     *     
     */
    public OtherAmounts43 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Sets the value of the othrAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts43 }
     *     
     */
    public void setOthrAmts(OtherAmounts43 value) {
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
