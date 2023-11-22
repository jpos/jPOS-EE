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

package org.jpos.iso20022.sese_038_002_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDetails208 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDetails208">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}SecuritiesTransactionType60Choice" minOccurs="0"/>
 *         <element name="SttlmTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}SettlementTransactionCondition28Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BnfclOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}BeneficialOwnership5Choice" minOccurs="0"/>
 *         <element name="CCPElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}CentralCounterPartyEligibility5Choice" minOccurs="0"/>
 *         <element name="DlvryRtrRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}DeliveryReturn4Choice" minOccurs="0"/>
 *         <element name="CshClrSys" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}CashSettlementSystem5Choice" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}ExposureType24Choice" minOccurs="0"/>
 *         <element name="FxStgInstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}FXStandingInstruction5Choice" minOccurs="0"/>
 *         <element name="MktClntSd" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}MarketClientSide7Choice" minOccurs="0"/>
 *         <element name="NetgElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}NettingEligibility5Choice" minOccurs="0"/>
 *         <element name="Regn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}Registration11Choice" minOccurs="0"/>
 *         <element name="LglRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}Restriction6Choice" minOccurs="0"/>
 *         <element name="SttlgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}SettlingCapacity8Choice" minOccurs="0"/>
 *         <element name="TaxCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}TaxCapacityParty5Choice" minOccurs="0"/>
 *         <element name="StmpDtyTaxBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}GenericIdentification47" minOccurs="0"/>
 *         <element name="Trckg" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}Tracking5Choice" minOccurs="0"/>
 *         <element name="LttrOfGrnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}LetterOfGuarantee5Choice" minOccurs="0"/>
 *         <element name="RtrLeg" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="ModCxlAllwd" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}ModificationCancellationAllowed5Choice" minOccurs="0"/>
 *         <element name="ElgblForColl" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="SctiesSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}GenericIdentification47" minOccurs="0"/>
 *         <element name="CshSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}GenericIdentification47" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails208", propOrder = {
    "sctiesTxTp",
    "sttlmTxCond",
    "bnfclOwnrsh",
    "ccpElgblty",
    "dlvryRtrRsn",
    "cshClrSys",
    "xpsrTp",
    "fxStgInstr",
    "mktClntSd",
    "netgElgblty",
    "regn",
    "lglRstrctns",
    "sttlgCpcty",
    "taxCpcty",
    "stmpDtyTaxBsis",
    "trckg",
    "lttrOfGrnt",
    "rtrLeg",
    "modCxlAllwd",
    "elgblForColl",
    "sctiesSubBalTp",
    "cshSubBalTp"
})
public class SettlementDetails208 {

    @XmlElement(name = "SctiesTxTp")
    protected SecuritiesTransactionType60Choice sctiesTxTp;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition28Choice> sttlmTxCond;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership5Choice bnfclOwnrsh;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility5Choice ccpElgblty;
    @XmlElement(name = "DlvryRtrRsn")
    protected DeliveryReturn4Choice dlvryRtrRsn;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem5Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType24Choice xpsrTp;
    @XmlElement(name = "FxStgInstr")
    protected FXStandingInstruction5Choice fxStgInstr;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide7Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility5Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration11Choice regn;
    @XmlElement(name = "LglRstrctns")
    protected Restriction6Choice lglRstrctns;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity8Choice sttlgCpcty;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty5Choice taxCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification47 stmpDtyTaxBsis;
    @XmlElement(name = "Trckg")
    protected Tracking5Choice trckg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee5Choice lttrOfGrnt;
    @XmlElement(name = "RtrLeg")
    protected Boolean rtrLeg;
    @XmlElement(name = "ModCxlAllwd")
    protected ModificationCancellationAllowed5Choice modCxlAllwd;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;
    @XmlElement(name = "SctiesSubBalTp")
    protected GenericIdentification47 sctiesSubBalTp;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification47 cshSubBalTp;

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType60Choice }
     *     
     */
    public SecuritiesTransactionType60Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType60Choice }
     *     
     */
    public void setSctiesTxTp(SecuritiesTransactionType60Choice value) {
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
     * Gets the value of the dlvryRtrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReturn4Choice }
     *     
     */
    public DeliveryReturn4Choice getDlvryRtrRsn() {
        return dlvryRtrRsn;
    }

    /**
     * Sets the value of the dlvryRtrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReturn4Choice }
     *     
     */
    public void setDlvryRtrRsn(DeliveryReturn4Choice value) {
        this.dlvryRtrRsn = value;
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
     * Gets the value of the fxStgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link FXStandingInstruction5Choice }
     *     
     */
    public FXStandingInstruction5Choice getFxStgInstr() {
        return fxStgInstr;
    }

    /**
     * Sets the value of the fxStgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXStandingInstruction5Choice }
     *     
     */
    public void setFxStgInstr(FXStandingInstruction5Choice value) {
        this.fxStgInstr = value;
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
     * Gets the value of the trckg property.
     * 
     * @return
     *     possible object is
     *     {@link Tracking5Choice }
     *     
     */
    public Tracking5Choice getTrckg() {
        return trckg;
    }

    /**
     * Sets the value of the trckg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking5Choice }
     *     
     */
    public void setTrckg(Tracking5Choice value) {
        this.trckg = value;
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
     * Gets the value of the rtrLeg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtrLeg() {
        return rtrLeg;
    }

    /**
     * Sets the value of the rtrLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtrLeg(Boolean value) {
        this.rtrLeg = value;
    }

    /**
     * Gets the value of the modCxlAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationCancellationAllowed5Choice }
     *     
     */
    public ModificationCancellationAllowed5Choice getModCxlAllwd() {
        return modCxlAllwd;
    }

    /**
     * Sets the value of the modCxlAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationCancellationAllowed5Choice }
     *     
     */
    public void setModCxlAllwd(ModificationCancellationAllowed5Choice value) {
        this.modCxlAllwd = value;
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
