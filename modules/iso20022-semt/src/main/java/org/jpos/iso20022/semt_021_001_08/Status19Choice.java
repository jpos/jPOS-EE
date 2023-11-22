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

package org.jpos.iso20022.semt_021_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status19Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status19Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AffirmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}AffirmationStatus8Choice"/>
 *         <element name="AllcnSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}AllocationSatus3Choice"/>
 *         <element name="RepoCallReqSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}RepoCallRequestStatus8Choice"/>
 *         <element name="CorpActnEvtPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}CorporateActionEventProcessingStatus3Choice"/>
 *         <element name="CorpActnEvtStag" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}CorporateActionEventStage3Choice"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}MatchingStatus27Choice"/>
 *         <element name="InstrPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}InstructionProcessingStatus23Choice"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}MatchingStatus27Choice"/>
 *         <element name="RegnPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}RegistrationProcessingStatus3Choice"/>
 *         <element name="RspnSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}ResponseStatus5Choice"/>
 *         <element name="RplcmntPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}ReplacementProcessingStatus8Choice"/>
 *         <element name="CxlPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}CancellationProcessingStatus7Choice"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}SettlementStatus19Choice"/>
 *         <element name="SttlmCondModSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.001.08}SettlementConditionModificationStatus3Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status19Choice", propOrder = {
    "affirmSts",
    "allcnSts",
    "repoCallReqSts",
    "corpActnEvtPrcgSts",
    "corpActnEvtStag",
    "ifrrdMtchgSts",
    "instrPrcgSts",
    "mtchgSts",
    "regnPrcgSts",
    "rspnSts",
    "rplcmntPrcgSts",
    "cxlPrcgSts",
    "sttlmSts",
    "sttlmCondModSts"
})
public class Status19Choice {

    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus8Choice affirmSts;
    @XmlElement(name = "AllcnSts")
    protected AllocationSatus3Choice allcnSts;
    @XmlElement(name = "RepoCallReqSts")
    protected RepoCallRequestStatus8Choice repoCallReqSts;
    @XmlElement(name = "CorpActnEvtPrcgSts")
    protected CorporateActionEventProcessingStatus3Choice corpActnEvtPrcgSts;
    @XmlElement(name = "CorpActnEvtStag")
    protected CorporateActionEventStage3Choice corpActnEvtStag;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus27Choice ifrrdMtchgSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus23Choice instrPrcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus27Choice mtchgSts;
    @XmlElement(name = "RegnPrcgSts")
    protected RegistrationProcessingStatus3Choice regnPrcgSts;
    @XmlElement(name = "RspnSts")
    protected ResponseStatus5Choice rspnSts;
    @XmlElement(name = "RplcmntPrcgSts")
    protected ReplacementProcessingStatus8Choice rplcmntPrcgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationProcessingStatus7Choice cxlPrcgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus19Choice sttlmSts;
    @XmlElement(name = "SttlmCondModSts")
    protected SettlementConditionModificationStatus3Choice sttlmCondModSts;

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus8Choice }
     *     
     */
    public AffirmationStatus8Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus8Choice }
     *     
     */
    public void setAffirmSts(AffirmationStatus8Choice value) {
        this.affirmSts = value;
    }

    /**
     * Gets the value of the allcnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationSatus3Choice }
     *     
     */
    public AllocationSatus3Choice getAllcnSts() {
        return allcnSts;
    }

    /**
     * Sets the value of the allcnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationSatus3Choice }
     *     
     */
    public void setAllcnSts(AllocationSatus3Choice value) {
        this.allcnSts = value;
    }

    /**
     * Gets the value of the repoCallReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RepoCallRequestStatus8Choice }
     *     
     */
    public RepoCallRequestStatus8Choice getRepoCallReqSts() {
        return repoCallReqSts;
    }

    /**
     * Sets the value of the repoCallReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoCallRequestStatus8Choice }
     *     
     */
    public void setRepoCallReqSts(RepoCallRequestStatus8Choice value) {
        this.repoCallReqSts = value;
    }

    /**
     * Gets the value of the corpActnEvtPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatus3Choice }
     *     
     */
    public CorporateActionEventProcessingStatus3Choice getCorpActnEvtPrcgSts() {
        return corpActnEvtPrcgSts;
    }

    /**
     * Sets the value of the corpActnEvtPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatus3Choice }
     *     
     */
    public void setCorpActnEvtPrcgSts(CorporateActionEventProcessingStatus3Choice value) {
        this.corpActnEvtPrcgSts = value;
    }

    /**
     * Gets the value of the corpActnEvtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStage3Choice }
     *     
     */
    public CorporateActionEventStage3Choice getCorpActnEvtStag() {
        return corpActnEvtStag;
    }

    /**
     * Sets the value of the corpActnEvtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStage3Choice }
     *     
     */
    public void setCorpActnEvtStag(CorporateActionEventStage3Choice value) {
        this.corpActnEvtStag = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus27Choice }
     *     
     */
    public MatchingStatus27Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus27Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus27Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus23Choice }
     *     
     */
    public InstructionProcessingStatus23Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus23Choice }
     *     
     */
    public void setInstrPrcgSts(InstructionProcessingStatus23Choice value) {
        this.instrPrcgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus27Choice }
     *     
     */
    public MatchingStatus27Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus27Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus27Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the regnPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationProcessingStatus3Choice }
     *     
     */
    public RegistrationProcessingStatus3Choice getRegnPrcgSts() {
        return regnPrcgSts;
    }

    /**
     * Sets the value of the regnPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationProcessingStatus3Choice }
     *     
     */
    public void setRegnPrcgSts(RegistrationProcessingStatus3Choice value) {
        this.regnPrcgSts = value;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus5Choice }
     *     
     */
    public ResponseStatus5Choice getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus5Choice }
     *     
     */
    public void setRspnSts(ResponseStatus5Choice value) {
        this.rspnSts = value;
    }

    /**
     * Gets the value of the rplcmntPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReplacementProcessingStatus8Choice }
     *     
     */
    public ReplacementProcessingStatus8Choice getRplcmntPrcgSts() {
        return rplcmntPrcgSts;
    }

    /**
     * Sets the value of the rplcmntPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacementProcessingStatus8Choice }
     *     
     */
    public void setRplcmntPrcgSts(ReplacementProcessingStatus8Choice value) {
        this.rplcmntPrcgSts = value;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus7Choice }
     *     
     */
    public CancellationProcessingStatus7Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus7Choice }
     *     
     */
    public void setCxlPrcgSts(CancellationProcessingStatus7Choice value) {
        this.cxlPrcgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus19Choice }
     *     
     */
    public SettlementStatus19Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus19Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus19Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the sttlmCondModSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementConditionModificationStatus3Choice }
     *     
     */
    public SettlementConditionModificationStatus3Choice getSttlmCondModSts() {
        return sttlmCondModSts;
    }

    /**
     * Sets the value of the sttlmCondModSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementConditionModificationStatus3Choice }
     *     
     */
    public void setSttlmCondModSts(SettlementConditionModificationStatus3Choice value) {
        this.sttlmCondModSts = value;
    }

}
