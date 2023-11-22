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

package org.jpos.iso20022.colr_020_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TripartyCollateralTransactionInstructionProcessingStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}TransactionIdentifications46"/>
 *         <element name="CxlReqRef" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}Pagination1"/>
 *         <element name="InstrPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ProcessingStatus82Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}MatchingStatus33Choice" minOccurs="0"/>
 *         <element name="CxlPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CancellationStatus30Choice" minOccurs="0"/>
 *         <element name="GnlParams" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CollateralParameters12"/>
 *         <element name="CollPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CollateralParties8"/>
 *         <element name="DealTxDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}DealTransactionDetails7"/>
 *         <element name="DealTxDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CollateralDate2"/>
 *         <element name="SctiesMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}SecuritiesMovement8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CashMovement7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralTransactionInstructionProcessingStatusAdviceV01", propOrder = {
    "txInstrId",
    "cxlReqRef",
    "pgntn",
    "instrPrcgSts",
    "mtchgSts",
    "cxlPrcgSts",
    "gnlParams",
    "collPties",
    "dealTxDtls",
    "dealTxDt",
    "sctiesMvmnt",
    "cshMvmnt",
    "splmtryData"
})
public class TripartyCollateralTransactionInstructionProcessingStatusAdviceV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications46 txInstrId;
    @XmlElement(name = "CxlReqRef")
    protected String cxlReqRef;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "InstrPrcgSts")
    protected ProcessingStatus82Choice instrPrcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus33Choice mtchgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationStatus30Choice cxlPrcgSts;
    @XmlElement(name = "GnlParams", required = true)
    protected CollateralParameters12 gnlParams;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties8 collPties;
    @XmlElement(name = "DealTxDtls", required = true)
    protected DealTransactionDetails7 dealTxDtls;
    @XmlElement(name = "DealTxDt", required = true)
    protected CollateralDate2 dealTxDt;
    @XmlElement(name = "SctiesMvmnt")
    protected List<SecuritiesMovement8> sctiesMvmnt;
    @XmlElement(name = "CshMvmnt")
    protected List<CashMovement7> cshMvmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications46 }
     *     
     */
    public TransactionIdentifications46 getTxInstrId() {
        return txInstrId;
    }

    /**
     * Sets the value of the txInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications46 }
     *     
     */
    public void setTxInstrId(TransactionIdentifications46 value) {
        this.txInstrId = value;
    }

    /**
     * Gets the value of the cxlReqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlReqRef() {
        return cxlReqRef;
    }

    /**
     * Sets the value of the cxlReqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlReqRef(String value) {
        this.cxlReqRef = value;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus82Choice }
     *     
     */
    public ProcessingStatus82Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus82Choice }
     *     
     */
    public void setInstrPrcgSts(ProcessingStatus82Choice value) {
        this.instrPrcgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus33Choice }
     *     
     */
    public MatchingStatus33Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus33Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus33Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus30Choice }
     *     
     */
    public CancellationStatus30Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus30Choice }
     *     
     */
    public void setCxlPrcgSts(CancellationStatus30Choice value) {
        this.cxlPrcgSts = value;
    }

    /**
     * Gets the value of the gnlParams property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParameters12 }
     *     
     */
    public CollateralParameters12 getGnlParams() {
        return gnlParams;
    }

    /**
     * Sets the value of the gnlParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParameters12 }
     *     
     */
    public void setGnlParams(CollateralParameters12 value) {
        this.gnlParams = value;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties8 }
     *     
     */
    public CollateralParties8 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties8 }
     *     
     */
    public void setCollPties(CollateralParties8 value) {
        this.collPties = value;
    }

    /**
     * Gets the value of the dealTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DealTransactionDetails7 }
     *     
     */
    public DealTransactionDetails7 getDealTxDtls() {
        return dealTxDtls;
    }

    /**
     * Sets the value of the dealTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealTransactionDetails7 }
     *     
     */
    public void setDealTxDtls(DealTransactionDetails7 value) {
        this.dealTxDtls = value;
    }

    /**
     * Gets the value of the dealTxDt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDate2 }
     *     
     */
    public CollateralDate2 getDealTxDt() {
        return dealTxDt;
    }

    /**
     * Sets the value of the dealTxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDate2 }
     *     
     */
    public void setDealTxDt(CollateralDate2 value) {
        this.dealTxDt = value;
    }

    /**
     * Gets the value of the sctiesMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesMovement8 }
     * 
     * 
     * @return
     *     The value of the sctiesMvmnt property.
     */
    public List<SecuritiesMovement8> getSctiesMvmnt() {
        if (sctiesMvmnt == null) {
            sctiesMvmnt = new ArrayList<>();
        }
        return this.sctiesMvmnt;
    }

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshMvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMovement7 }
     * 
     * 
     * @return
     *     The value of the cshMvmnt property.
     */
    public List<CashMovement7> getCshMvmnt() {
        if (cshMvmnt == null) {
            cshMvmnt = new ArrayList<>();
        }
        return this.cshMvmnt;
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
