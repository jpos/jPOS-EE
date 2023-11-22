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

package org.jpos.iso20022.sese_036_002_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingModificationInstruction002V08 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesFinancingModificationInstruction002V08">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTpAndModAddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}TransactionTypeAndAdditionalParameters20"/>
 *         <element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}SecuritiesTradeDetails103"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}SecurityIdentification20"/>
 *         <element name="QtyAndAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}QuantityAndAccount105"/>
 *         <element name="SctiesFincgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}SecuritiesFinancingTransactionDetails48"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}SettlementDetails172" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}SettlementParties107" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}SettlementParties107" minOccurs="0"/>
 *         <element name="OpngSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}AmountAndDirection66" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.002.08}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingModificationInstruction002V08", propOrder = {
    "txTpAndModAddtlParams",
    "tradDtls",
    "finInstrmId",
    "qtyAndAcctDtls",
    "sctiesFincgAddtlDtls",
    "sttlmParams",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "opngSttlmAmt",
    "splmtryData"
})
public class SecuritiesFinancingModificationInstruction002V08 {

    @XmlElement(name = "TxTpAndModAddtlParams", required = true)
    protected TransactionTypeAndAdditionalParameters20 txTpAndModAddtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails103 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount105 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgAddtlDtls", required = true)
    protected SecuritiesFinancingTransactionDetails48 sctiesFincgAddtlDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails172 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties107 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties107 rcvgSttlmPties;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection66 opngSttlmAmt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txTpAndModAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters20 }
     *     
     */
    public TransactionTypeAndAdditionalParameters20 getTxTpAndModAddtlParams() {
        return txTpAndModAddtlParams;
    }

    /**
     * Sets the value of the txTpAndModAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters20 }
     *     
     */
    public void setTxTpAndModAddtlParams(TransactionTypeAndAdditionalParameters20 value) {
        this.txTpAndModAddtlParams = value;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails103 }
     *     
     */
    public SecuritiesTradeDetails103 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails103 }
     *     
     */
    public void setTradDtls(SecuritiesTradeDetails103 value) {
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
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount105 }
     *     
     */
    public QuantityAndAccount105 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount105 }
     *     
     */
    public void setQtyAndAcctDtls(QuantityAndAccount105 value) {
        this.qtyAndAcctDtls = value;
    }

    /**
     * Gets the value of the sctiesFincgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails48 }
     *     
     */
    public SecuritiesFinancingTransactionDetails48 getSctiesFincgAddtlDtls() {
        return sctiesFincgAddtlDtls;
    }

    /**
     * Sets the value of the sctiesFincgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails48 }
     *     
     */
    public void setSctiesFincgAddtlDtls(SecuritiesFinancingTransactionDetails48 value) {
        this.sctiesFincgAddtlDtls = value;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails172 }
     *     
     */
    public SettlementDetails172 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails172 }
     *     
     */
    public void setSttlmParams(SettlementDetails172 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties107 }
     *     
     */
    public SettlementParties107 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties107 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties107 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties107 }
     *     
     */
    public SettlementParties107 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties107 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties107 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection66 }
     *     
     */
    public AmountAndDirection66 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection66 }
     *     
     */
    public void setOpngSttlmAmt(AmountAndDirection66 value) {
        this.opngSttlmAmt = value;
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
