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

package org.jpos.iso20022.sese_038_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDetails200 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDetails200">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}SecuritiesTransactionType59Choice" minOccurs="0"/>
 *         <element name="SttlmTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}SettlementTransactionCondition16Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BnfclOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}BeneficialOwnership4Choice" minOccurs="0"/>
 *         <element name="CCPElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}CentralCounterPartyEligibility4Choice" minOccurs="0"/>
 *         <element name="DlvryRtrRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}DeliveryReturn3Choice" minOccurs="0"/>
 *         <element name="CshClrSys" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}CashSettlementSystem4Choice" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}ExposureType22Choice" minOccurs="0"/>
 *         <element name="FxStgInstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}FXStandingInstruction4Choice" minOccurs="0"/>
 *         <element name="MktClntSd" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}MarketClientSide6Choice" minOccurs="0"/>
 *         <element name="NetgElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}NettingEligibility4Choice" minOccurs="0"/>
 *         <element name="Regn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}Registration9Choice" minOccurs="0"/>
 *         <element name="LglRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}Restriction5Choice" minOccurs="0"/>
 *         <element name="SttlgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}SettlingCapacity7Choice" minOccurs="0"/>
 *         <element name="TaxCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}TaxCapacityParty4Choice" minOccurs="0"/>
 *         <element name="StmpDtyTaxBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}GenericIdentification30" minOccurs="0"/>
 *         <element name="Trckg" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}Tracking4Choice" minOccurs="0"/>
 *         <element name="LttrOfGrnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}LetterOfGuarantee4Choice" minOccurs="0"/>
 *         <element name="RtrLeg" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="ModCxlAllwd" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}ModificationCancellationAllowed4Choice" minOccurs="0"/>
 *         <element name="ElgblForColl" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="SctiesSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}GenericIdentification30" minOccurs="0"/>
 *         <element name="CshSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}GenericIdentification30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails200", propOrder = {
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
public class SettlementDetails200 {

    @XmlElement(name = "SctiesTxTp")
    protected SecuritiesTransactionType59Choice sctiesTxTp;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition16Choice> sttlmTxCond;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership4Choice bnfclOwnrsh;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility4Choice ccpElgblty;
    @XmlElement(name = "DlvryRtrRsn")
    protected DeliveryReturn3Choice dlvryRtrRsn;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem4Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType22Choice xpsrTp;
    @XmlElement(name = "FxStgInstr")
    protected FXStandingInstruction4Choice fxStgInstr;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide6Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility4Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration9Choice regn;
    @XmlElement(name = "LglRstrctns")
    protected Restriction5Choice lglRstrctns;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity7Choice sttlgCpcty;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty4Choice taxCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification30 stmpDtyTaxBsis;
    @XmlElement(name = "Trckg")
    protected Tracking4Choice trckg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee4Choice lttrOfGrnt;
    @XmlElement(name = "RtrLeg")
    protected Boolean rtrLeg;
    @XmlElement(name = "ModCxlAllwd")
    protected ModificationCancellationAllowed4Choice modCxlAllwd;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;
    @XmlElement(name = "SctiesSubBalTp")
    protected GenericIdentification30 sctiesSubBalTp;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification30 cshSubBalTp;

    /**
     * Gets the value of the sctiesTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType59Choice }
     *     
     */
    public SecuritiesTransactionType59Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Sets the value of the sctiesTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType59Choice }
     *     
     */
    public void setSctiesTxTp(SecuritiesTransactionType59Choice value) {
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
     * {@link SettlementTransactionCondition16Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition16Choice> getSttlmTxCond() {
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
     * Gets the value of the dlvryRtrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReturn3Choice }
     *     
     */
    public DeliveryReturn3Choice getDlvryRtrRsn() {
        return dlvryRtrRsn;
    }

    /**
     * Sets the value of the dlvryRtrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReturn3Choice }
     *     
     */
    public void setDlvryRtrRsn(DeliveryReturn3Choice value) {
        this.dlvryRtrRsn = value;
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
     * Gets the value of the fxStgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link FXStandingInstruction4Choice }
     *     
     */
    public FXStandingInstruction4Choice getFxStgInstr() {
        return fxStgInstr;
    }

    /**
     * Sets the value of the fxStgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXStandingInstruction4Choice }
     *     
     */
    public void setFxStgInstr(FXStandingInstruction4Choice value) {
        this.fxStgInstr = value;
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
     * Gets the value of the trckg property.
     * 
     * @return
     *     possible object is
     *     {@link Tracking4Choice }
     *     
     */
    public Tracking4Choice getTrckg() {
        return trckg;
    }

    /**
     * Sets the value of the trckg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking4Choice }
     *     
     */
    public void setTrckg(Tracking4Choice value) {
        this.trckg = value;
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
     *     {@link ModificationCancellationAllowed4Choice }
     *     
     */
    public ModificationCancellationAllowed4Choice getModCxlAllwd() {
        return modCxlAllwd;
    }

    /**
     * Sets the value of the modCxlAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationCancellationAllowed4Choice }
     *     
     */
    public void setModCxlAllwd(ModificationCancellationAllowed4Choice value) {
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
