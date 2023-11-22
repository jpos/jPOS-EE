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

package org.jpos.iso20022.sese_025_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDetails203 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDetails203">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}PriorityNumeric4Choice" minOccurs="0"/>
 *         <element name="SctiesTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SecuritiesTransactionType43Choice"/>
 *         <element name="SttlmTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SettlementTransactionCondition34Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtlSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SettlementTransactionCondition5Code" minOccurs="0"/>
 *         <element name="BnfclOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}BeneficialOwnership4Choice" minOccurs="0"/>
 *         <element name="BlckTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}BlockTrade4Choice" minOccurs="0"/>
 *         <element name="CCPElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}CentralCounterPartyEligibility4Choice" minOccurs="0"/>
 *         <element name="CshClrSys" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}CashSettlementSystem4Choice" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}ExposureType22Choice" minOccurs="0"/>
 *         <element name="MktClntSd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}MarketClientSide6Choice" minOccurs="0"/>
 *         <element name="NetgElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}NettingEligibility4Choice" minOccurs="0"/>
 *         <element name="Regn" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Registration9Choice" minOccurs="0"/>
 *         <element name="RpTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}RepurchaseType22Choice" minOccurs="0"/>
 *         <element name="LglRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Restriction5Choice" minOccurs="0"/>
 *         <element name="SctiesRTGS" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SecuritiesRTGS4Choice" minOccurs="0"/>
 *         <element name="SttlgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SettlingCapacity7Choice" minOccurs="0"/>
 *         <element name="SttlmSysMtd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SettlementSystemMethod4Choice" minOccurs="0"/>
 *         <element name="TaxCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}TaxCapacityParty4Choice" minOccurs="0"/>
 *         <element name="StmpDtyTaxBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}GenericIdentification30" minOccurs="0"/>
 *         <element name="AutomtcBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}AutomaticBorrowing6Choice" minOccurs="0"/>
 *         <element name="LttrOfGrnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}LetterOfGuarantee4Choice" minOccurs="0"/>
 *         <element name="ElgblForColl" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="SctiesSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}GenericIdentification30" minOccurs="0"/>
 *         <element name="CshSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}GenericIdentification30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails203", propOrder = {
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
public class SettlementDetails203 {

    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "SctiesTxTp", required = true)
    protected SecuritiesTransactionType43Choice sctiesTxTp;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition34Choice> sttlmTxCond;
    @XmlElement(name = "PrtlSttlmInd")
    @XmlSchemaType(name = "string")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership4Choice bnfclOwnrsh;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade4Choice blckTrad;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility4Choice ccpElgblty;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem4Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType22Choice xpsrTp;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide6Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility4Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration9Choice regn;
    @XmlElement(name = "RpTp")
    protected RepurchaseType22Choice rpTp;
    @XmlElement(name = "LglRstrctns")
    protected Restriction5Choice lglRstrctns;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS4Choice sctiesRTGS;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity7Choice sttlgCpcty;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod4Choice sttlmSysMtd;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty4Choice taxCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification30 stmpDtyTaxBsis;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing6Choice automtcBrrwg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee4Choice lttrOfGrnt;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;
    @XmlElement(name = "SctiesSubBalTp")
    protected GenericIdentification30 sctiesSubBalTp;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification30 cshSubBalTp;

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public void setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType43Choice }
     *     
     */
    public SecuritiesTransactionType43Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType43Choice }
     *     
     */
    public void setSctiesTxTp(SecuritiesTransactionType43Choice value) {
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
     * {@link SettlementTransactionCondition34Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition34Choice> getSttlmTxCond() {
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
     *     {@link BeneficialOwnership4Choice }
     *     
     */
    public BeneficialOwnership4Choice getBnfclOwnrsh() {
        return bnfclOwnrsh;
    }

    /**
     * Sets the value of the bnfclOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialOwnership4Choice }
     *     
     */
    public void setBnfclOwnrsh(BeneficialOwnership4Choice value) {
        this.bnfclOwnrsh = value;
    }

    /**
     * Gets the value of the blckTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BlockTrade4Choice }
     *     
     */
    public BlockTrade4Choice getBlckTrad() {
        return blckTrad;
    }

    /**
     * Sets the value of the blckTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTrade4Choice }
     *     
     */
    public void setBlckTrad(BlockTrade4Choice value) {
        this.blckTrad = value;
    }

    /**
     * Gets the value of the ccpElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link CentralCounterPartyEligibility4Choice }
     *     
     */
    public CentralCounterPartyEligibility4Choice getCCPElgblty() {
        return ccpElgblty;
    }

    /**
     * Sets the value of the ccpElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralCounterPartyEligibility4Choice }
     *     
     */
    public void setCCPElgblty(CentralCounterPartyEligibility4Choice value) {
        this.ccpElgblty = value;
    }

    /**
     * Gets the value of the cshClrSys property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystem4Choice }
     *     
     */
    public CashSettlementSystem4Choice getCshClrSys() {
        return cshClrSys;
    }

    /**
     * Sets the value of the cshClrSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystem4Choice }
     *     
     */
    public void setCshClrSys(CashSettlementSystem4Choice value) {
        this.cshClrSys = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType22Choice }
     *     
     */
    public ExposureType22Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType22Choice }
     *     
     */
    public void setXpsrTp(ExposureType22Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the mktClntSd property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClientSide6Choice }
     *     
     */
    public MarketClientSide6Choice getMktClntSd() {
        return mktClntSd;
    }

    /**
     * Sets the value of the mktClntSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClientSide6Choice }
     *     
     */
    public void setMktClntSd(MarketClientSide6Choice value) {
        this.mktClntSd = value;
    }

    /**
     * Gets the value of the netgElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligibility4Choice }
     *     
     */
    public NettingEligibility4Choice getNetgElgblty() {
        return netgElgblty;
    }

    /**
     * Sets the value of the netgElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligibility4Choice }
     *     
     */
    public void setNetgElgblty(NettingEligibility4Choice value) {
        this.netgElgblty = value;
    }

    /**
     * Gets the value of the regn property.
     * 
     * @return
     *     possible object is
     *     {@link Registration9Choice }
     *     
     */
    public Registration9Choice getRegn() {
        return regn;
    }

    /**
     * Sets the value of the regn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registration9Choice }
     *     
     */
    public void setRegn(Registration9Choice value) {
        this.regn = value;
    }

    /**
     * Gets the value of the rpTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseType22Choice }
     *     
     */
    public RepurchaseType22Choice getRpTp() {
        return rpTp;
    }

    /**
     * Sets the value of the rpTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseType22Choice }
     *     
     */
    public void setRpTp(RepurchaseType22Choice value) {
        this.rpTp = value;
    }

    /**
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction5Choice }
     *     
     */
    public Restriction5Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction5Choice }
     *     
     */
    public void setLglRstrctns(Restriction5Choice value) {
        this.lglRstrctns = value;
    }

    /**
     * Gets the value of the sctiesRTGS property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public SecuritiesRTGS4Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Sets the value of the sctiesRTGS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public void setSctiesRTGS(SecuritiesRTGS4Choice value) {
        this.sctiesRTGS = value;
    }

    /**
     * Gets the value of the sttlgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlingCapacity7Choice }
     *     
     */
    public SettlingCapacity7Choice getSttlgCpcty() {
        return sttlgCpcty;
    }

    /**
     * Sets the value of the sttlgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlingCapacity7Choice }
     *     
     */
    public void setSttlgCpcty(SettlingCapacity7Choice value) {
        this.sttlgCpcty = value;
    }

    /**
     * Gets the value of the sttlmSysMtd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementSystemMethod4Choice }
     *     
     */
    public SettlementSystemMethod4Choice getSttlmSysMtd() {
        return sttlmSysMtd;
    }

    /**
     * Sets the value of the sttlmSysMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementSystemMethod4Choice }
     *     
     */
    public void setSttlmSysMtd(SettlementSystemMethod4Choice value) {
        this.sttlmSysMtd = value;
    }

    /**
     * Gets the value of the taxCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCapacityParty4Choice }
     *     
     */
    public TaxCapacityParty4Choice getTaxCpcty() {
        return taxCpcty;
    }

    /**
     * Sets the value of the taxCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCapacityParty4Choice }
     *     
     */
    public void setTaxCpcty(TaxCapacityParty4Choice value) {
        this.taxCpcty = value;
    }

    /**
     * Gets the value of the stmpDtyTaxBsis property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getStmpDtyTaxBsis() {
        return stmpDtyTaxBsis;
    }

    /**
     * Sets the value of the stmpDtyTaxBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setStmpDtyTaxBsis(GenericIdentification30 value) {
        this.stmpDtyTaxBsis = value;
    }

    /**
     * Gets the value of the automtcBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing6Choice }
     *     
     */
    public AutomaticBorrowing6Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Sets the value of the automtcBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing6Choice }
     *     
     */
    public void setAutomtcBrrwg(AutomaticBorrowing6Choice value) {
        this.automtcBrrwg = value;
    }

    /**
     * Gets the value of the lttrOfGrnt property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfGuarantee4Choice }
     *     
     */
    public LetterOfGuarantee4Choice getLttrOfGrnt() {
        return lttrOfGrnt;
    }

    /**
     * Sets the value of the lttrOfGrnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfGuarantee4Choice }
     *     
     */
    public void setLttrOfGrnt(LetterOfGuarantee4Choice value) {
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
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSctiesSubBalTp() {
        return sctiesSubBalTp;
    }

    /**
     * Sets the value of the sctiesSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setSctiesSubBalTp(GenericIdentification30 value) {
        this.sctiesSubBalTp = value;
    }

    /**
     * Gets the value of the cshSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getCshSubBalTp() {
        return cshSubBalTp;
    }

    /**
     * Sets the value of the cshSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setCshSubBalTp(GenericIdentification30 value) {
        this.cshSubBalTp = value;
    }

}
