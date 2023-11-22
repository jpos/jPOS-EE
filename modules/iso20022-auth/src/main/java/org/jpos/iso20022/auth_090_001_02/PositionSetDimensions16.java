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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetDimensions16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetDimensions16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TradeCounterpartyReport20" minOccurs="0"/>
 *         <element name="ValCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="Coll" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}MarginCollateralReport4" minOccurs="0"/>
 *         <element name="CtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}FinancialInstrumentContractType2Code" minOccurs="0"/>
 *         <element name="AsstClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ProductType4Code" minOccurs="0"/>
 *         <element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}SecurityIdentification41Choice" minOccurs="0"/>
 *         <element name="NtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="NtnlCcyScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="SttlmCcyScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="MstrAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}MasterAgreement8" minOccurs="0"/>
 *         <element name="Clrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="IntraGrp" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="XchgRateBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ExchangeRateBasis1Choice" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}OptionType2Code" minOccurs="0"/>
 *         <element name="TmToMtrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TimeToMaturity1Choice" minOccurs="0"/>
 *         <element name="IRSTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Max52Text" minOccurs="0"/>
 *         <element name="Cdt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}CreditDerivative7" minOccurs="0"/>
 *         <element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}AssetClassCommodity6Choice" minOccurs="0"/>
 *         <element name="OthrPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}OtherPayment6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetDimensions16", propOrder = {
    "ctrPtyId",
    "valCcy",
    "coll",
    "ctrctTp",
    "asstClss",
    "undrlygInstrm",
    "ntnlCcy",
    "ntnlCcyScndLeg",
    "sttlmCcy",
    "sttlmCcyScndLeg",
    "mstrAgrmt",
    "clrd",
    "intraGrp",
    "xchgRateBsis",
    "optnTp",
    "tmToMtrty",
    "irsTp",
    "cdt",
    "cmmdty",
    "othrPmt"
})
public class PositionSetDimensions16 {

    @XmlElement(name = "CtrPtyId")
    protected TradeCounterpartyReport20 ctrPtyId;
    @XmlElement(name = "ValCcy")
    protected String valCcy;
    @XmlElement(name = "Coll")
    protected MarginCollateralReport4 coll;
    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType2Code ctrctTp;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType4Code asstClss;
    @XmlElement(name = "UndrlygInstrm")
    protected SecurityIdentification41Choice undrlygInstrm;
    @XmlElement(name = "NtnlCcy")
    protected String ntnlCcy;
    @XmlElement(name = "NtnlCcyScndLeg")
    protected String ntnlCcyScndLeg;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "SttlmCcyScndLeg")
    protected String sttlmCcyScndLeg;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement8 mstrAgrmt;
    @XmlElement(name = "Clrd")
    protected Boolean clrd;
    @XmlElement(name = "IntraGrp")
    protected Boolean intraGrp;
    @XmlElement(name = "XchgRateBsis")
    protected ExchangeRateBasis1Choice xchgRateBsis;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "TmToMtrty")
    protected TimeToMaturity1Choice tmToMtrty;
    @XmlElement(name = "IRSTp")
    protected String irsTp;
    @XmlElement(name = "Cdt")
    protected CreditDerivative7 cdt;
    @XmlElement(name = "Cmmdty")
    protected AssetClassCommodity6Choice cmmdty;
    @XmlElement(name = "OthrPmt")
    protected OtherPayment6 othrPmt;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public TradeCounterpartyReport20 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public void setCtrPtyId(TradeCounterpartyReport20 value) {
        this.ctrPtyId = value;
    }

    /**
     * Gets the value of the valCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValCcy() {
        return valCcy;
    }

    /**
     * Sets the value of the valCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValCcy(String value) {
        this.valCcy = value;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public MarginCollateralReport4 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public void setColl(MarginCollateralReport4 value) {
        this.coll = value;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public FinancialInstrumentContractType2Code getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public void setCtrctTp(FinancialInstrumentContractType2Code value) {
        this.ctrctTp = value;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType4Code }
     *     
     */
    public ProductType4Code getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType4Code }
     *     
     */
    public void setAsstClss(ProductType4Code value) {
        this.asstClss = value;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public SecurityIdentification41Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public void setUndrlygInstrm(SecurityIdentification41Choice value) {
        this.undrlygInstrm = value;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy(String value) {
        this.ntnlCcy = value;
    }

    /**
     * Gets the value of the ntnlCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcyScndLeg() {
        return ntnlCcyScndLeg;
    }

    /**
     * Sets the value of the ntnlCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcyScndLeg(String value) {
        this.ntnlCcyScndLeg = value;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the sttlmCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcyScndLeg() {
        return sttlmCcyScndLeg;
    }

    /**
     * Sets the value of the sttlmCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcyScndLeg(String value) {
        this.sttlmCcyScndLeg = value;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement8 }
     *     
     */
    public MasterAgreement8 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement8 }
     *     
     */
    public void setMstrAgrmt(MasterAgreement8 value) {
        this.mstrAgrmt = value;
    }

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClrd(Boolean value) {
        this.clrd = value;
    }

    /**
     * Gets the value of the intraGrp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntraGrp() {
        return intraGrp;
    }

    /**
     * Sets the value of the intraGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntraGrp(Boolean value) {
        this.intraGrp = value;
    }

    /**
     * Gets the value of the xchgRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public ExchangeRateBasis1Choice getXchgRateBsis() {
        return xchgRateBsis;
    }

    /**
     * Sets the value of the xchgRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public void setXchgRateBsis(ExchangeRateBasis1Choice value) {
        this.xchgRateBsis = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public void setOptnTp(OptionType2Code value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the tmToMtrty property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToMaturity1Choice }
     *     
     */
    public TimeToMaturity1Choice getTmToMtrty() {
        return tmToMtrty;
    }

    /**
     * Sets the value of the tmToMtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToMaturity1Choice }
     *     
     */
    public void setTmToMtrty(TimeToMaturity1Choice value) {
        this.tmToMtrty = value;
    }

    /**
     * Gets the value of the irsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRSTp() {
        return irsTp;
    }

    /**
     * Sets the value of the irsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRSTp(String value) {
        this.irsTp = value;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDerivative7 }
     *     
     */
    public CreditDerivative7 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDerivative7 }
     *     
     */
    public void setCdt(CreditDerivative7 value) {
        this.cdt = value;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public AssetClassCommodity6Choice getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public void setCmmdty(AssetClassCommodity6Choice value) {
        this.cmmdty = value;
    }

    /**
     * Gets the value of the othrPmt property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPayment6 }
     *     
     */
    public OtherPayment6 getOthrPmt() {
        return othrPmt;
    }

    /**
     * Sets the value of the othrPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPayment6 }
     *     
     */
    public void setOthrPmt(OtherPayment6 value) {
        this.othrPmt = value;
    }

}
