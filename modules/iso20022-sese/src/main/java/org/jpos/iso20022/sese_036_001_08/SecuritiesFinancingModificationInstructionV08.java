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

package org.jpos.iso20022.sese_036_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingModificationInstructionV08 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesFinancingModificationInstructionV08">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTpAndModAddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}TransactionTypeAndAdditionalParameters17"/>
 *         <element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}SecuritiesTradeDetails100"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}SecurityIdentification19"/>
 *         <element name="QtyAndAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}QuantityAndAccount102"/>
 *         <element name="SctiesFincgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}SecuritiesFinancingTransactionDetails42"/>
 *         <element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}SettlementDetails148" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}SettlementParties101" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}SettlementParties101" minOccurs="0"/>
 *         <element name="OpngSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}AmountAndDirection49" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.036.001.08}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingModificationInstructionV08", propOrder = {
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
public class SecuritiesFinancingModificationInstructionV08 {

    @XmlElement(name = "TxTpAndModAddtlParams", required = true)
    protected TransactionTypeAndAdditionalParameters17 txTpAndModAddtlParams;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails100 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount102 qtyAndAcctDtls;
    @XmlElement(name = "SctiesFincgAddtlDtls", required = true)
    protected SecuritiesFinancingTransactionDetails42 sctiesFincgAddtlDtls;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails148 sttlmParams;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties101 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties101 rcvgSttlmPties;
    @XmlElement(name = "OpngSttlmAmt")
    protected AmountAndDirection49 opngSttlmAmt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txTpAndModAddtlParams property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeAndAdditionalParameters17 }
     *     
     */
    public TransactionTypeAndAdditionalParameters17 getTxTpAndModAddtlParams() {
        return txTpAndModAddtlParams;
    }

    /**
     * Sets the value of the txTpAndModAddtlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeAndAdditionalParameters17 }
     *     
     */
    public void setTxTpAndModAddtlParams(TransactionTypeAndAdditionalParameters17 value) {
        this.txTpAndModAddtlParams = value;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails100 }
     *     
     */
    public SecuritiesTradeDetails100 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails100 }
     *     
     */
    public void setTradDtls(SecuritiesTradeDetails100 value) {
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
     * Gets the value of the qtyAndAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount102 }
     *     
     */
    public QuantityAndAccount102 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Sets the value of the qtyAndAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount102 }
     *     
     */
    public void setQtyAndAcctDtls(QuantityAndAccount102 value) {
        this.qtyAndAcctDtls = value;
    }

    /**
     * Gets the value of the sctiesFincgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails42 }
     *     
     */
    public SecuritiesFinancingTransactionDetails42 getSctiesFincgAddtlDtls() {
        return sctiesFincgAddtlDtls;
    }

    /**
     * Sets the value of the sctiesFincgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails42 }
     *     
     */
    public void setSctiesFincgAddtlDtls(SecuritiesFinancingTransactionDetails42 value) {
        this.sctiesFincgAddtlDtls = value;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails148 }
     *     
     */
    public SettlementDetails148 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails148 }
     *     
     */
    public void setSttlmParams(SettlementDetails148 value) {
        this.sttlmParams = value;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties101 }
     *     
     */
    public SettlementParties101 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties101 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties101 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties101 }
     *     
     */
    public SettlementParties101 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties101 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties101 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Gets the value of the opngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getOpngSttlmAmt() {
        return opngSttlmAmt;
    }

    /**
     * Sets the value of the opngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setOpngSttlmAmt(AmountAndDirection49 value) {
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
