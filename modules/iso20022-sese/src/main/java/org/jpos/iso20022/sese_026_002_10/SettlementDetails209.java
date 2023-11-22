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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDetails209 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDetails209">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PriorityNumeric5Choice" minOccurs="0"/>
 *         <element name="SctiesTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SecuritiesTransactionType55Choice"/>
 *         <element name="SttlmTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlementTransactionCondition28Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtlSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlementTransactionCondition5Code" minOccurs="0"/>
 *         <element name="BnfclOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}BeneficialOwnership5Choice" minOccurs="0"/>
 *         <element name="BlckTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}BlockTrade5Choice" minOccurs="0"/>
 *         <element name="CCPElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}CentralCounterPartyEligibility5Choice" minOccurs="0"/>
 *         <element name="CshClrSys" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}CashSettlementSystem5Choice" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}ExposureType24Choice" minOccurs="0"/>
 *         <element name="MktClntSd" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}MarketClientSide7Choice" minOccurs="0"/>
 *         <element name="NetgElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}NettingEligibility5Choice" minOccurs="0"/>
 *         <element name="Regn" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}Registration11Choice" minOccurs="0"/>
 *         <element name="RpTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}RepurchaseType24Choice" minOccurs="0"/>
 *         <element name="LglRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}Restriction6Choice" minOccurs="0"/>
 *         <element name="SctiesRTGS" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SecuritiesRTGS5Choice" minOccurs="0"/>
 *         <element name="SttlgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlingCapacity8Choice" minOccurs="0"/>
 *         <element name="SttlmSysMtd" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}SettlementSystemMethod5Choice" minOccurs="0"/>
 *         <element name="TaxCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}TaxCapacityParty5Choice" minOccurs="0"/>
 *         <element name="StmpDtyTaxBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}GenericIdentification47" minOccurs="0"/>
 *         <element name="AutomtcBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}AutomaticBorrowing8Choice" minOccurs="0"/>
 *         <element name="LttrOfGrnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}LetterOfGuarantee5Choice" minOccurs="0"/>
 *         <element name="ElgblForColl" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="SctiesSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}GenericIdentification47" minOccurs="0"/>
 *         <element name="CshSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}GenericIdentification47" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails209", propOrder = {
    "prty",
    "sctiesTxTp",
    "sttlmTxCond",
    "prtlSttlmInd",
    "bnfclOwnrsh",
    "blckTrad",
    "ccpElgblty",
    "cshClrSys",
    "xpsrTp",
    "mktClntSd",
    "netgElgblty",
    "regn",
    "rpTp",
    "lglRstrctns",
    "sctiesRTGS",
    "sttlgCpcty",
    "sttlmSysMtd",
    "taxCpcty",
    "stmpDtyTaxBsis",
    "automtcBrrwg",
    "lttrOfGrnt",
    "elgblForColl",
    "sctiesSubBalTp",
    "cshSubBalTp"
})
public class SettlementDetails209 {

    @XmlElement(name = "Prty")
    protected PriorityNumeric5Choice prty;
    @XmlElement(name = "SctiesTxTp", required = true)
    protected SecuritiesTransactionType55Choice sctiesTxTp;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition28Choice> sttlmTxCond;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership5Choice bnfclOwnrsh;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade5Choice blckTrad;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility5Choice ccpElgblty;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem5Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType24Choice xpsrTp;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide7Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility5Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration11Choice regn;
    @XmlElement(name = "RpTp")
    protected RepurchaseType24Choice rpTp;
    @XmlElement(name = "LglRstrctns")
    protected Restriction6Choice lglRstrctns;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS5Choice sctiesRTGS;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity8Choice sttlgCpcty;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod5Choice sttlmSysMtd;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty5Choice taxCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification47 stmpDtyTaxBsis;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing8Choice automtcBrrwg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee5Choice lttrOfGrnt;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;
    @XmlElement(name = "SctiesSubBalTp")
    protected GenericIdentification47 sctiesSubBalTp;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification47 cshSubBalTp;

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric5Choice }
     *     
     */
    public PriorityNumeric5Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric5Choice }
     *     
     */
    public void setPrty(PriorityNumeric5Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType55Choice }
     *     
     */
    public SecuritiesTransactionType55Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType55Choice }
     *     
     */
    public void setSctiesTxTp(SecuritiesTransactionType55Choice value) {
        this.sctiesTxTp = value;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition28Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition28Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Gets the value of the prtlSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementTransactionCondition5Code getPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Sets the value of the prtlSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public void setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
    }

    /**
     * Gets the value of the bnfclOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialOwnership5Choice }
     *     
     */
    public BeneficialOwnership5Choice getBnfclOwnrsh() {
        return bnfclOwnrsh;
    }

    /**
     * Sets the value of the bnfclOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialOwnership5Choice }
     *     
     */
    public void setBnfclOwnrsh(BeneficialOwnership5Choice value) {
        this.bnfclOwnrsh = value;
    }

    /**
     * Gets the value of the blckTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTrade5Choice }
     *     
     */
    public BlockTrade5Choice getBlckTrad() {
        return blckTrad;
    }

    /**
     * Sets the value of the blckTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTrade5Choice }
     *     
     */
    public void setBlckTrad(BlockTrade5Choice value) {
        this.blckTrad = value;
    }

    /**
     * Gets the value of the ccpElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CentralCounterPartyEligibility5Choice }
     *     
     */
    public CentralCounterPartyEligibility5Choice getCCPElgblty() {
        return ccpElgblty;
    }

    /**
     * Sets the value of the ccpElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralCounterPartyEligibility5Choice }
     *     
     */
    public void setCCPElgblty(CentralCounterPartyEligibility5Choice value) {
        this.ccpElgblty = value;
    }

    /**
     * Gets the value of the cshClrSys property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystem5Choice }
     *     
     */
    public CashSettlementSystem5Choice getCshClrSys() {
        return cshClrSys;
    }

    /**
     * Sets the value of the cshClrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystem5Choice }
     *     
     */
    public void setCshClrSys(CashSettlementSystem5Choice value) {
        this.cshClrSys = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType24Choice }
     *     
     */
    public ExposureType24Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType24Choice }
     *     
     */
    public void setXpsrTp(ExposureType24Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the mktClntSd property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClientSide7Choice }
     *     
     */
    public MarketClientSide7Choice getMktClntSd() {
        return mktClntSd;
    }

    /**
     * Sets the value of the mktClntSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClientSide7Choice }
     *     
     */
    public void setMktClntSd(MarketClientSide7Choice value) {
        this.mktClntSd = value;
    }

    /**
     * Gets the value of the netgElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligibility5Choice }
     *     
     */
    public NettingEligibility5Choice getNetgElgblty() {
        return netgElgblty;
    }

    /**
     * Sets the value of the netgElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligibility5Choice }
     *     
     */
    public void setNetgElgblty(NettingEligibility5Choice value) {
        this.netgElgblty = value;
    }

    /**
     * Gets the value of the regn property.
     * 
     * @return
     *     possible object is
     *     {@link Registration11Choice }
     *     
     */
    public Registration11Choice getRegn() {
        return regn;
    }

    /**
     * Sets the value of the regn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registration11Choice }
     *     
     */
    public void setRegn(Registration11Choice value) {
        this.regn = value;
    }

    /**
     * Gets the value of the rpTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseType24Choice }
     *     
     */
    public RepurchaseType24Choice getRpTp() {
        return rpTp;
    }

    /**
     * Sets the value of the rpTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseType24Choice }
     *     
     */
    public void setRpTp(RepurchaseType24Choice value) {
        this.rpTp = value;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction6Choice }
     *     
     */
    public Restriction6Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction6Choice }
     *     
     */
    public void setLglRstrctns(Restriction6Choice value) {
        this.lglRstrctns = value;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS5Choice }
     *     
     */
    public SecuritiesRTGS5Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS5Choice }
     *     
     */
    public void setSctiesRTGS(SecuritiesRTGS5Choice value) {
        this.sctiesRTGS = value;
    }

    /**
     * Gets the value of the sttlgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlingCapacity8Choice }
     *     
     */
    public SettlingCapacity8Choice getSttlgCpcty() {
        return sttlgCpcty;
    }

    /**
     * Sets the value of the sttlgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlingCapacity8Choice }
     *     
     */
    public void setSttlgCpcty(SettlingCapacity8Choice value) {
        this.sttlgCpcty = value;
    }

    /**
     * Gets the value of the sttlmSysMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementSystemMethod5Choice }
     *     
     */
    public SettlementSystemMethod5Choice getSttlmSysMtd() {
        return sttlmSysMtd;
    }

    /**
     * Sets the value of the sttlmSysMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementSystemMethod5Choice }
     *     
     */
    public void setSttlmSysMtd(SettlementSystemMethod5Choice value) {
        this.sttlmSysMtd = value;
    }

    /**
     * Gets the value of the taxCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCapacityParty5Choice }
     *     
     */
    public TaxCapacityParty5Choice getTaxCpcty() {
        return taxCpcty;
    }

    /**
     * Sets the value of the taxCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCapacityParty5Choice }
     *     
     */
    public void setTaxCpcty(TaxCapacityParty5Choice value) {
        this.taxCpcty = value;
    }

    /**
     * Gets the value of the stmpDtyTaxBsis property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getStmpDtyTaxBsis() {
        return stmpDtyTaxBsis;
    }

    /**
     * Sets the value of the stmpDtyTaxBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public void setStmpDtyTaxBsis(GenericIdentification47 value) {
        this.stmpDtyTaxBsis = value;
    }

    /**
     * Gets the value of the automtcBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing8Choice }
     *     
     */
    public AutomaticBorrowing8Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing8Choice }
     *     
     */
    public void setAutomtcBrrwg(AutomaticBorrowing8Choice value) {
        this.automtcBrrwg = value;
    }

    /**
     * Gets the value of the lttrOfGrnt property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfGuarantee5Choice }
     *     
     */
    public LetterOfGuarantee5Choice getLttrOfGrnt() {
        return lttrOfGrnt;
    }

    /**
     * Sets the value of the lttrOfGrnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfGuarantee5Choice }
     *     
     */
    public void setLttrOfGrnt(LetterOfGuarantee5Choice value) {
        this.lttrOfGrnt = value;
    }

    /**
     * Gets the value of the elgblForColl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblForColl() {
        return elgblForColl;
    }

    /**
     * Sets the value of the elgblForColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElgblForColl(Boolean value) {
        this.elgblForColl = value;
    }

    /**
     * Gets the value of the sctiesSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getSctiesSubBalTp() {
        return sctiesSubBalTp;
    }

    /**
     * Sets the value of the sctiesSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public void setSctiesSubBalTp(GenericIdentification47 value) {
        this.sctiesSubBalTp = value;
    }

    /**
     * Gets the value of the cshSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getCshSubBalTp() {
        return cshSubBalTp;
    }

    /**
     * Sets the value of the cshSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public void setCshSubBalTp(GenericIdentification47 value) {
        this.cshSubBalTp = value;
    }

}
