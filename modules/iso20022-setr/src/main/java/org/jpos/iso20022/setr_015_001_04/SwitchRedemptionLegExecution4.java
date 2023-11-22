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

package org.jpos.iso20022.setr_015_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchRedemptionLegExecution4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SwitchRedemptionLegExecution4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LegId" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Max35Text" minOccurs="0"/>
 *         <element name="LegExctnId" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Max35Text" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}FinancialInstrument57"/>
 *         <element name="UnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}DecimalNumber"/>
 *         <element name="HldgsRedRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrssAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}InvestmentAccount58" minOccurs="0"/>
 *         <element name="TradDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}DateAndDateTimeChoice"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}UnitPrice22"/>
 *         <element name="InftvPricDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}UnitPrice22" maxOccurs="2" minOccurs="0"/>
 *         <element name="CumDvddInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}YesNoIndicator"/>
 *         <element name="IntrmPrftAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ProfitAndLoss2Choice" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}IncomePreference1Code" minOccurs="0"/>
 *         <element name="Grp1Or2Units" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}UKTaxGroupUnit1Code" minOccurs="0"/>
 *         <element name="ReqdSttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="ReqdNAVCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="TxOvrhd" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}TotalFeesAndTaxes40" minOccurs="0"/>
 *         <element name="InftvTaxDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}InformativeTax1" minOccurs="0"/>
 *         <element name="SttlmAndCtdyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}FundSettlementParameters11" minOccurs="0"/>
 *         <element name="PhysDlvryInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}YesNoIndicator"/>
 *         <element name="PhysDlvryDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}DeliveryParameters3" minOccurs="0"/>
 *         <element name="NonStdSttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Max350Text" minOccurs="0"/>
 *         <element name="Equlstn" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}Equalisation1" minOccurs="0"/>
 *         <element name="GtgOrHldBckDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}HoldBackInformation2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchRedemptionLegExecution4", propOrder = {
    "legId",
    "legExctnId",
    "finInstrmDtls",
    "unitsNb",
    "hldgsRedRate",
    "netAmt",
    "grssAmt",
    "invstmtAcctDtls",
    "tradDtTm",
    "pricDtls",
    "inftvPricDtls",
    "cumDvddInd",
    "intrmPrftAmt",
    "incmPref",
    "grp1Or2Units",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "txOvrhd",
    "inftvTaxDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "nonStdSttlmInf",
    "equlstn",
    "gtgOrHldBckDtls"
})
public class SwitchRedemptionLegExecution4 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "LegExctnId")
    protected String legExctnId;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument57 finInstrmDtls;
    @XmlElement(name = "UnitsNb", required = true)
    protected BigDecimal unitsNb;
    @XmlElement(name = "HldgsRedRate")
    protected BigDecimal hldgsRedRate;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "PricDtls", required = true)
    protected UnitPrice22 pricDtls;
    @XmlElement(name = "InftvPricDtls")
    protected List<UnitPrice22> inftvPricDtls;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "IntrmPrftAmt")
    protected ProfitAndLoss2Choice intrmPrftAmt;
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
    protected TotalFeesAndTaxes40 txOvrhd;
    @XmlElement(name = "InftvTaxDtls")
    protected InformativeTax1 inftvTaxDtls;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters11 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "Equlstn")
    protected Equalisation1 equlstn;
    @XmlElement(name = "GtgOrHldBckDtls")
    protected HoldBackInformation2 gtgOrHldBckDtls;

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
     * Gets the value of the legExctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExctnId() {
        return legExctnId;
    }

    /**
     * Sets the value of the legExctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegExctnId(String value) {
        this.legExctnId = value;
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
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitsNb(BigDecimal value) {
        this.unitsNb = value;
    }

    /**
     * Gets the value of the hldgsRedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHldgsRedRate() {
        return hldgsRedRate;
    }

    /**
     * Sets the value of the hldgsRedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHldgsRedRate(BigDecimal value) {
        this.hldgsRedRate = value;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssAmt(ActiveCurrencyAndAmount value) {
        this.grssAmt = value;
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
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice22 }
     *     
     */
    public UnitPrice22 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice22 }
     *     
     */
    public void setPricDtls(UnitPrice22 value) {
        this.pricDtls = value;
    }

    /**
     * Gets the value of the inftvPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inftvPricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInftvPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPrice22 }
     * 
     * 
     * @return
     *     The value of the inftvPricDtls property.
     */
    public List<UnitPrice22> getInftvPricDtls() {
        if (inftvPricDtls == null) {
            inftvPricDtls = new ArrayList<>();
        }
        return this.inftvPricDtls;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public void setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
    }

    /**
     * Gets the value of the intrmPrftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public ProfitAndLoss2Choice getIntrmPrftAmt() {
        return intrmPrftAmt;
    }

    /**
     * Sets the value of the intrmPrftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public void setIntrmPrftAmt(ProfitAndLoss2Choice value) {
        this.intrmPrftAmt = value;
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
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public TotalFeesAndTaxes40 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public void setTxOvrhd(TotalFeesAndTaxes40 value) {
        this.txOvrhd = value;
    }

    /**
     * Gets the value of the inftvTaxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InformativeTax1 }
     *     
     */
    public InformativeTax1 getInftvTaxDtls() {
        return inftvTaxDtls;
    }

    /**
     * Sets the value of the inftvTaxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformativeTax1 }
     *     
     */
    public void setInftvTaxDtls(InformativeTax1 value) {
        this.inftvTaxDtls = value;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters11 }
     *     
     */
    public FundSettlementParameters11 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters11 }
     *     
     */
    public void setSttlmAndCtdyDtls(FundSettlementParameters11 value) {
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

    /**
     * Gets the value of the gtgOrHldBckDtls property.
     * 
     * @return
     *     possible object is
     *     {@link HoldBackInformation2 }
     *     
     */
    public HoldBackInformation2 getGtgOrHldBckDtls() {
        return gtgOrHldBckDtls;
    }

    /**
     * Sets the value of the gtgOrHldBckDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldBackInformation2 }
     *     
     */
    public void setGtgOrHldBckDtls(HoldBackInformation2 value) {
        this.gtgOrHldBckDtls = value;
    }

}
