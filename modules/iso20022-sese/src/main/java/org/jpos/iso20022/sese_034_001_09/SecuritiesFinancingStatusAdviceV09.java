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

package org.jpos.iso20022.sese_034_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingStatusAdviceV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesFinancingStatusAdviceV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}TransactionIdentifications32"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}ProcessingStatus83Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}MatchingStatus26Choice" minOccurs="0"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}MatchingStatus26Choice" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}SettlementStatus18Choice" minOccurs="0"/>
 *         <element name="RepoCallReqSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}RepoCallRequestStatus7Choice" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}SecuritiesFinancingTransactionDetails52" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingStatusAdviceV09", propOrder = {
    "txId",
    "prcgSts",
    "mtchgSts",
    "ifrrdMtchgSts",
    "sttlmSts",
    "repoCallReqSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesFinancingStatusAdviceV09 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifications32 txId;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus83Choice prcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus26Choice mtchgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus26Choice ifrrdMtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus18Choice sttlmSts;
    @XmlElement(name = "RepoCallReqSts")
    protected RepoCallRequestStatus7Choice repoCallReqSts;
    @XmlElement(name = "TxDtls")
    protected SecuritiesFinancingTransactionDetails52 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications32 }
     *     
     */
    public TransactionIdentifications32 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications32 }
     *     
     */
    public void setTxId(TransactionIdentifications32 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus83Choice }
     *     
     */
    public ProcessingStatus83Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus83Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus83Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public MatchingStatus26Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus26Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public MatchingStatus26Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus26Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus26Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus18Choice }
     *     
     */
    public SettlementStatus18Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus18Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus18Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the repoCallReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RepoCallRequestStatus7Choice }
     *     
     */
    public RepoCallRequestStatus7Choice getRepoCallReqSts() {
        return repoCallReqSts;
    }

    /**
     * Sets the value of the repoCallReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoCallRequestStatus7Choice }
     *     
     */
    public void setRepoCallReqSts(RepoCallRequestStatus7Choice value) {
        this.repoCallReqSts = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionDetails52 }
     *     
     */
    public SecuritiesFinancingTransactionDetails52 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionDetails52 }
     *     
     */
    public void setTxDtls(SecuritiesFinancingTransactionDetails52 value) {
        this.txDtls = value;
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
