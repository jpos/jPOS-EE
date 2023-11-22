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

package org.jpos.iso20022.semt_021_002_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status22Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status22Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AffirmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}AffirmationStatus9Choice"/>
 *         <element name="AllcnSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}AllocationSatus4Choice"/>
 *         <element name="RepoCallReqSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}RepoCallRequestStatus10Choice"/>
 *         <element name="CorpActnEvtPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}CorporateActionEventProcessingStatus4Choice"/>
 *         <element name="CorpActnEvtStag" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}CorporateActionEventStage4Choice"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}MatchingStatus28Choice"/>
 *         <element name="InstrPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}InstructionProcessingStatus26Choice"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}MatchingStatus28Choice"/>
 *         <element name="RegnPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}RegistrationProcessingStatus4Choice"/>
 *         <element name="RspnSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}ResponseStatus7Choice"/>
 *         <element name="RplcmntPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}ReplacementProcessingStatus9Choice"/>
 *         <element name="CxlPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}CancellationProcessingStatus8Choice"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}SettlementStatus25Choice"/>
 *         <element name="SttlmCondModSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}SettlementConditionModificationStatus4Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status22Choice", propOrder = {
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
public class Status22Choice {

    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus9Choice affirmSts;
    @XmlElement(name = "AllcnSts")
    protected AllocationSatus4Choice allcnSts;
    @XmlElement(name = "RepoCallReqSts")
    protected RepoCallRequestStatus10Choice repoCallReqSts;
    @XmlElement(name = "CorpActnEvtPrcgSts")
    protected CorporateActionEventProcessingStatus4Choice corpActnEvtPrcgSts;
    @XmlElement(name = "CorpActnEvtStag")
    protected CorporateActionEventStage4Choice corpActnEvtStag;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus28Choice ifrrdMtchgSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus26Choice instrPrcgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus28Choice mtchgSts;
    @XmlElement(name = "RegnPrcgSts")
    protected RegistrationProcessingStatus4Choice regnPrcgSts;
    @XmlElement(name = "RspnSts")
    protected ResponseStatus7Choice rspnSts;
    @XmlElement(name = "RplcmntPrcgSts")
    protected ReplacementProcessingStatus9Choice rplcmntPrcgSts;
    @XmlElement(name = "CxlPrcgSts")
    protected CancellationProcessingStatus8Choice cxlPrcgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus25Choice sttlmSts;
    @XmlElement(name = "SttlmCondModSts")
    protected SettlementConditionModificationStatus4Choice sttlmCondModSts;

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus9Choice }
     *     
     */
    public AffirmationStatus9Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus9Choice }
     *     
     */
    public void setAffirmSts(AffirmationStatus9Choice value) {
        this.affirmSts = value;
    }

    /**
     * Gets the value of the allcnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationSatus4Choice }
     *     
     */
    public AllocationSatus4Choice getAllcnSts() {
        return allcnSts;
    }

    /**
     * Sets the value of the allcnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationSatus4Choice }
     *     
     */
    public void setAllcnSts(AllocationSatus4Choice value) {
        this.allcnSts = value;
    }

    /**
     * Gets the value of the repoCallReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RepoCallRequestStatus10Choice }
     *     
     */
    public RepoCallRequestStatus10Choice getRepoCallReqSts() {
        return repoCallReqSts;
    }

    /**
     * Sets the value of the repoCallReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoCallRequestStatus10Choice }
     *     
     */
    public void setRepoCallReqSts(RepoCallRequestStatus10Choice value) {
        this.repoCallReqSts = value;
    }

    /**
     * Gets the value of the corpActnEvtPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventProcessingStatus4Choice }
     *     
     */
    public CorporateActionEventProcessingStatus4Choice getCorpActnEvtPrcgSts() {
        return corpActnEvtPrcgSts;
    }

    /**
     * Sets the value of the corpActnEvtPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventProcessingStatus4Choice }
     *     
     */
    public void setCorpActnEvtPrcgSts(CorporateActionEventProcessingStatus4Choice value) {
        this.corpActnEvtPrcgSts = value;
    }

    /**
     * Gets the value of the corpActnEvtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStage4Choice }
     *     
     */
    public CorporateActionEventStage4Choice getCorpActnEvtStag() {
        return corpActnEvtStag;
    }

    /**
     * Sets the value of the corpActnEvtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStage4Choice }
     *     
     */
    public void setCorpActnEvtStag(CorporateActionEventStage4Choice value) {
        this.corpActnEvtStag = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus28Choice }
     *     
     */
    public MatchingStatus28Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus28Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus28Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus26Choice }
     *     
     */
    public InstructionProcessingStatus26Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus26Choice }
     *     
     */
    public void setInstrPrcgSts(InstructionProcessingStatus26Choice value) {
        this.instrPrcgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus28Choice }
     *     
     */
    public MatchingStatus28Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus28Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus28Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the regnPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationProcessingStatus4Choice }
     *     
     */
    public RegistrationProcessingStatus4Choice getRegnPrcgSts() {
        return regnPrcgSts;
    }

    /**
     * Sets the value of the regnPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationProcessingStatus4Choice }
     *     
     */
    public void setRegnPrcgSts(RegistrationProcessingStatus4Choice value) {
        this.regnPrcgSts = value;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus7Choice }
     *     
     */
    public ResponseStatus7Choice getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus7Choice }
     *     
     */
    public void setRspnSts(ResponseStatus7Choice value) {
        this.rspnSts = value;
    }

    /**
     * Gets the value of the rplcmntPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReplacementProcessingStatus9Choice }
     *     
     */
    public ReplacementProcessingStatus9Choice getRplcmntPrcgSts() {
        return rplcmntPrcgSts;
    }

    /**
     * Sets the value of the rplcmntPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplacementProcessingStatus9Choice }
     *     
     */
    public void setRplcmntPrcgSts(ReplacementProcessingStatus9Choice value) {
        this.rplcmntPrcgSts = value;
    }

    /**
     * Gets the value of the cxlPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus8Choice }
     *     
     */
    public CancellationProcessingStatus8Choice getCxlPrcgSts() {
        return cxlPrcgSts;
    }

    /**
     * Sets the value of the cxlPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus8Choice }
     *     
     */
    public void setCxlPrcgSts(CancellationProcessingStatus8Choice value) {
        this.cxlPrcgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus25Choice }
     *     
     */
    public SettlementStatus25Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus25Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus25Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the sttlmCondModSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementConditionModificationStatus4Choice }
     *     
     */
    public SettlementConditionModificationStatus4Choice getSttlmCondModSts() {
        return sttlmCondModSts;
    }

    /**
     * Sets the value of the sttlmCondModSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementConditionModificationStatus4Choice }
     *     
     */
    public void setSttlmCondModSts(SettlementConditionModificationStatus4Choice value) {
        this.sttlmCondModSts = value;
    }

}
