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

package org.jpos.iso20022.setr_013_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchRedemptionLegOrder6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SwitchRedemptionLegOrder6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LegId" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}Max35Text" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}FinancialInstrument57"/>
 *         <element name="FinInstrmQtyChc" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}FinancialInstrumentQuantity29Choice" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}InvestmentAccount58" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}IncomePreference1Code" minOccurs="0"/>
 *         <element name="Grp1Or2Units" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}UKTaxGroupUnit1Code" minOccurs="0"/>
 *         <element name="ReqdSttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="ReqdNAVCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="TxOvrhd" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}FeeAndTax1" minOccurs="0"/>
 *         <element name="SttlmAndCtdyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}FundSettlementParameters12" minOccurs="0"/>
 *         <element name="PhysDlvryInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}YesNoIndicator"/>
 *         <element name="PhysDlvryDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}DeliveryParameters3" minOccurs="0"/>
 *         <element name="NonStdSttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}Max350Text" minOccurs="0"/>
 *         <element name="Equlstn" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}Equalisation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchRedemptionLegOrder6", propOrder = {
    "legId",
    "finInstrmDtls",
    "finInstrmQtyChc",
    "invstmtAcctDtls",
    "incmPref",
    "grp1Or2Units",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "txOvrhd",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "nonStdSttlmInf",
    "equlstn"
})
public class SwitchRedemptionLegOrder6 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument57 finInstrmDtls;
    @XmlElement(name = "FinInstrmQtyChc")
    protected FinancialInstrumentQuantity29Choice finInstrmQtyChc;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "Grp1Or2Units")
    @XmlSchemaType(name = "string")
    protected UKTaxGroupUnit1Code grp1Or2Units;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "TxOvrhd")
    protected FeeAndTax1 txOvrhd;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters12 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "Equlstn")
    protected Equalisation1 equlstn;

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegId(String value) {
        this.legId = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
    }

    /**
     * Gets the value of the finInstrmQtyChc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity29Choice }
     *     
     */
    public FinancialInstrumentQuantity29Choice getFinInstrmQtyChc() {
        return finInstrmQtyChc;
    }

    /**
     * Sets the value of the finInstrmQtyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity29Choice }
     *     
     */
    public void setFinInstrmQtyChc(FinancialInstrumentQuantity29Choice value) {
        this.finInstrmQtyChc = value;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public void setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference1Code }
     *     
     */
    public IncomePreference1Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference1Code }
     *     
     */
    public void setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
    }

    /**
     * Gets the value of the grp1Or2Units property.
     * 
     * @return
     *     possible object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public UKTaxGroupUnit1Code getGrp1Or2Units() {
        return grp1Or2Units;
    }

    /**
     * Sets the value of the grp1Or2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public void setGrp1Or2Units(UKTaxGroupUnit1Code value) {
        this.grp1Or2Units = value;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
    }

    /**
     * Gets the value of the txOvrhd property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAndTax1 }
     *     
     */
    public FeeAndTax1 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAndTax1 }
     *     
     */
    public void setTxOvrhd(FeeAndTax1 value) {
        this.txOvrhd = value;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public FundSettlementParameters12 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public void setSttlmAndCtdyDtls(FundSettlementParameters12 value) {
        this.sttlmAndCtdyDtls = value;
    }

    /**
     * Gets the value of the physDlvryInd property.
     * 
     */
    public boolean isPhysDlvryInd() {
        return physDlvryInd;
    }

    /**
     * Sets the value of the physDlvryInd property.
     * 
     */
    public void setPhysDlvryInd(boolean value) {
        this.physDlvryInd = value;
    }

    /**
     * Gets the value of the physDlvryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public DeliveryParameters3 getPhysDlvryDtls() {
        return physDlvryDtls;
    }

    /**
     * Sets the value of the physDlvryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public void setPhysDlvryDtls(DeliveryParameters3 value) {
        this.physDlvryDtls = value;
    }

    /**
     * Gets the value of the nonStdSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSttlmInf() {
        return nonStdSttlmInf;
    }

    /**
     * Sets the value of the nonStdSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
    }

    /**
     * Gets the value of the equlstn property.
     * 
     * @return
     *     possible object is
     *     {@link Equalisation1 }
     *     
     */
    public Equalisation1 getEqulstn() {
        return equlstn;
    }

    /**
     * Sets the value of the equlstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equalisation1 }
     *     
     */
    public void setEqulstn(Equalisation1 value) {
        this.equlstn = value;
    }

}
