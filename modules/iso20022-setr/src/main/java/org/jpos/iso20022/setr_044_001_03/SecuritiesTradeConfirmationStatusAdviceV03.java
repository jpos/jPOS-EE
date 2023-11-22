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

package org.jpos.iso20022.setr_044_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeConfirmationStatusAdviceV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeConfirmationStatusAdviceV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}TransactiontIdentification4"/>
 *         <element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Linkages72" maxOccurs="unbounded"/>
 *         <element name="AffirmSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}AffirmationStatus11Choice" minOccurs="0"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProcessingStatus98Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}MatchingStatus35Choice" minOccurs="0"/>
 *         <element name="RplcmntPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ReplacementProcessingStatus10Choice" minOccurs="0"/>
 *         <element name="CxlPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}CancellationProcessingStatus10Choice" minOccurs="0"/>
 *         <element name="PtyTradgDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Order23" minOccurs="0"/>
 *         <element name="CtrPtyTradgDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Order23" minOccurs="0"/>
 *         <element name="ConfPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationParties9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}SettlementParties121" minOccurs="0"/>
 *         <element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}SettlementParties121" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeConfirmationStatusAdviceV03", propOrder = {
    "id",
    "refs",
    "affirmSts",
    "prcgSts",
    "mtchgSts",
    "rplcmntPrcgSts",
    "cxlPrcgSts",
    "ptyTradgDtls",
    "ctrPtyTradgDtls",
    "confPties",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "splmtryData"
})
public class SecuritiesTradeConfirmationStatusAdviceV03 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "Refs", required = true)
    protected List<Linkages72> refs;
    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus11Choice affirmSts;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus98Choice prcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus35Choice mtchgSts;
    @XmlElement(name = "RplcmntPrcgSts")
    protected ReplacementProcessingStatus10Choice rplcmntPrcgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationProcessingStatus10Choice cxlPrcgSts;
    @XmlElement(name = "PtyTradgDtls")
    protected Order23 ptyTradgDtls;
    @XmlElement(name = "CtrPtyTradgDtls")
    protected Order23 ctrPtyTradgDtls;
    @XmlElement(name = "ConfPties")
    protected List<ConfirmationParties9> confPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties121 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties121 rcvgSttlmPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public TransactiontIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public void setId(TransactiontIdentification4 value) {
        this.id = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages72 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<Linkages72> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus11Choice }
     *     
     */
    public AffirmationStatus11Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus11Choice }
     *     
     */
    public void setAffirmSts(AffirmationStatus11Choice value) {
        this.affirmSts = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus98Choice }
     *     
     */
    public ProcessingStatus98Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus98Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus98Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus35Choice }
     *     
     */
    public MatchingStatus35Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus35Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus35Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the rplcmntPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReplacementProcessingStatus10Choice }
     *     
     */
    public ReplacementProcessingStatus10Choice getRplcmntPrcgSts() {
        return rplcmntPrcgSts;
    }

    /**
     * Sets the value of the rplcmntPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacementProcessingStatus10Choice }
     *     
     */
    public void setRplcmntPrcgSts(ReplacementProcessingStatus10Choice value) {
        this.rplcmntPrcgSts = value;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus10Choice }
     *     
     */
    public CancellationProcessingStatus10Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus10Choice }
     *     
     */
    public void setCxlPrcgSts(CancellationProcessingStatus10Choice value) {
        this.cxlPrcgSts = value;
    }

    /**
     * Gets the value of the ptyTradgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order23 }
     *     
     */
    public Order23 getPtyTradgDtls() {
        return ptyTradgDtls;
    }

    /**
     * Sets the value of the ptyTradgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order23 }
     *     
     */
    public void setPtyTradgDtls(Order23 value) {
        this.ptyTradgDtls = value;
    }

    /**
     * Gets the value of the ctrPtyTradgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order23 }
     *     
     */
    public Order23 getCtrPtyTradgDtls() {
        return ctrPtyTradgDtls;
    }

    /**
     * Sets the value of the ctrPtyTradgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order23 }
     *     
     */
    public void setCtrPtyTradgDtls(Order23 value) {
        this.ctrPtyTradgDtls = value;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationParties9 }
     * 
     * 
     * @return
     *     The value of the confPties property.
     */
    public List<ConfirmationParties9> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties121 }
     *     
     */
    public SettlementParties121 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties121 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties121 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties121 }
     *     
     */
    public SettlementParties121 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties121 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties121 value) {
        this.rcvgSttlmPties = value;
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
