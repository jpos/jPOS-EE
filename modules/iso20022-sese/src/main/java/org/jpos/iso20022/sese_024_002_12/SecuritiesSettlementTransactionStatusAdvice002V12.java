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

package org.jpos.iso20022.sese_024_002_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementTransactionStatusAdvice002V12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementTransactionStatusAdvice002V12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}TransactionIdentifications49"/>
 *         <element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}Linkages50" minOccurs="0"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}ProcessingStatus94Choice" minOccurs="0"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}MatchingStatus32Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}MatchingStatus32Choice" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}SettlementStatus31Choice" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}TransactionDetails161" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.002.12}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionStatusAdvice002V12", propOrder = {
    "txId",
    "lnkgs",
    "prcgSts",
    "ifrrdMtchgSts",
    "mtchgSts",
    "sttlmSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionStatusAdvice002V12 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifications49 txId;
    @XmlElement(name = "Lnkgs")
    protected Linkages50 lnkgs;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus94Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus32Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus32Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus31Choice sttlmSts;
    @XmlElement(name = "TxDtls")
    protected TransactionDetails161 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications49 }
     *     
     */
    public TransactionIdentifications49 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications49 }
     *     
     */
    public void setTxId(TransactionIdentifications49 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * @return
     *     possible object is
     *     {@link Linkages50 }
     *     
     */
    public Linkages50 getLnkgs() {
        return lnkgs;
    }

    /**
     * Sets the value of the lnkgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkages50 }
     *     
     */
    public void setLnkgs(Linkages50 value) {
        this.lnkgs = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus94Choice }
     *     
     */
    public ProcessingStatus94Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus94Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus94Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public MatchingStatus32Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus32Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public MatchingStatus32Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus32Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus31Choice }
     *     
     */
    public SettlementStatus31Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus31Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus31Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails161 }
     *     
     */
    public TransactionDetails161 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails161 }
     *     
     */
    public void setTxDtls(TransactionDetails161 value) {
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
