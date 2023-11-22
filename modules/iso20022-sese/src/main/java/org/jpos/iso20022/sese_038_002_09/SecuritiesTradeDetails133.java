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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeDetails133 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeDetails133">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}RestrictedFINXMax52Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}RestrictedFINXMax16Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}PlaceOfTradeIdentification2" minOccurs="0"/>
 *         <element name="PlcOfClr" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}PlaceOfClearingIdentification2" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}TradeDate9Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}SettlementDate20Choice" minOccurs="0"/>
 *         <element name="LateDlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}Price11" minOccurs="0"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}Max3Number" minOccurs="0"/>
 *         <element name="OpngClsg" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}OpeningClosing4Choice" minOccurs="0"/>
 *         <element name="Rptg" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}Reporting9Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TradTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}TradeTransactionCondition6Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InvstrCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}InvestorCapacity5Choice" minOccurs="0"/>
 *         <element name="TradOrgtrRole" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}TradeOriginator4Choice" minOccurs="0"/>
 *         <element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}TypeOfPrice32Choice" minOccurs="0"/>
 *         <element name="CcyToBuyOrSell" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}CurrencyToBuyOrSell1Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}MatchingStatus28Choice" minOccurs="0"/>
 *         <element name="AffirmSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}AffirmationStatus9Choice" minOccurs="0"/>
 *         <element name="FxAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}RestrictedFINXMax350Text" minOccurs="0"/>
 *         <element name="SttlmInstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}RestrictedFINXMax350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails133", propOrder = {
    "tradId",
    "collTxId",
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
    "sttlmDt",
    "lateDlvryDt",
    "dealPric",
    "nbOfDaysAcrd",
    "opngClsg",
    "rptg",
    "tradTxCond",
    "invstrCpcty",
    "tradOrgtrRole",
    "tpOfPric",
    "ccyToBuyOrSell",
    "mtchgSts",
    "affirmSts",
    "fxAddtlDtls",
    "sttlmInstrPrcgAddtlDtls"
})
public class SecuritiesTradeDetails133 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "CollTxId")
    protected List<String> collTxId;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification2 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate9Choice tradDt;
    @XmlElement(name = "SttlmDt")
    protected SettlementDate20Choice sttlmDt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTime2Choice lateDlvryDt;
    @XmlElement(name = "DealPric")
    protected Price11 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "OpngClsg")
    protected OpeningClosing4Choice opngClsg;
    @XmlElement(name = "Rptg")
    protected List<Reporting9Choice> rptg;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition6Choice> tradTxCond;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity5Choice invstrCpcty;
    @XmlElement(name = "TradOrgtrRole")
    protected TradeOriginator4Choice tradOrgtrRole;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice32Choice tpOfPric;
    @XmlElement(name = "CcyToBuyOrSell")
    protected CurrencyToBuyOrSell1Choice ccyToBuyOrSell;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus28Choice mtchgSts;
    @XmlElement(name = "AffirmSts")
    protected AffirmationStatus9Choice affirmSts;
    @XmlElement(name = "FxAddtlDtls")
    protected String fxAddtlDtls;
    @XmlElement(name = "SttlmInstrPrcgAddtlDtls")
    protected String sttlmInstrPrcgAddtlDtls;

    /**
     * Gets the value of the tradId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the tradId property.
     */
    public List<String> getTradId() {
        if (tradId == null) {
            tradId = new ArrayList<>();
        }
        return this.tradId;
    }

    /**
     * Gets the value of the collTxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collTxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the collTxId property.
     */
    public List<String> getCollTxId() {
        if (collTxId == null) {
            collTxId = new ArrayList<>();
        }
        return this.collTxId;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public PlaceOfTradeIdentification2 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification2 }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification2 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the plcOfClr property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public PlaceOfClearingIdentification2 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Sets the value of the plcOfClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public void setPlcOfClr(PlaceOfClearingIdentification2 value) {
        this.plcOfClr = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate9Choice }
     *     
     */
    public TradeDate9Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate9Choice }
     *     
     */
    public void setTradDt(TradeDate9Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate20Choice }
     *     
     */
    public SettlementDate20Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate20Choice }
     *     
     */
    public void setSttlmDt(SettlementDate20Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the lateDlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLateDlvryDt() {
        return lateDlvryDt;
    }

    /**
     * Sets the value of the lateDlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setLateDlvryDt(DateAndDateTime2Choice value) {
        this.lateDlvryDt = value;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price11 }
     *     
     */
    public Price11 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price11 }
     *     
     */
    public void setDealPric(Price11 value) {
        this.dealPric = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the opngClsg property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningClosing4Choice }
     *     
     */
    public OpeningClosing4Choice getOpngClsg() {
        return opngClsg;
    }

    /**
     * Sets the value of the opngClsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningClosing4Choice }
     *     
     */
    public void setOpngClsg(OpeningClosing4Choice value) {
        this.opngClsg = value;
    }

    /**
     * Gets the value of the rptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reporting9Choice }
     * 
     * 
     * @return
     *     The value of the rptg property.
     */
    public List<Reporting9Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<>();
        }
        return this.rptg;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition6Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition6Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the invstrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity5Choice }
     *     
     */
    public InvestorCapacity5Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity5Choice }
     *     
     */
    public void setInvstrCpcty(InvestorCapacity5Choice value) {
        this.invstrCpcty = value;
    }

    /**
     * Gets the value of the tradOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradeOriginator4Choice }
     *     
     */
    public TradeOriginator4Choice getTradOrgtrRole() {
        return tradOrgtrRole;
    }

    /**
     * Sets the value of the tradOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOriginator4Choice }
     *     
     */
    public void setTradOrgtrRole(TradeOriginator4Choice value) {
        this.tradOrgtrRole = value;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public TypeOfPrice32Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public void setTpOfPric(TypeOfPrice32Choice value) {
        this.tpOfPric = value;
    }

    /**
     * Gets the value of the ccyToBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public CurrencyToBuyOrSell1Choice getCcyToBuyOrSell() {
        return ccyToBuyOrSell;
    }

    /**
     * Sets the value of the ccyToBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public void setCcyToBuyOrSell(CurrencyToBuyOrSell1Choice value) {
        this.ccyToBuyOrSell = value;
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
     * Gets the value of the fxAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxAddtlDtls() {
        return fxAddtlDtls;
    }

    /**
     * Sets the value of the fxAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxAddtlDtls(String value) {
        this.fxAddtlDtls = value;
    }

    /**
     * Gets the value of the sttlmInstrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmInstrPrcgAddtlDtls() {
        return sttlmInstrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the sttlmInstrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmInstrPrcgAddtlDtls(String value) {
        this.sttlmInstrPrcgAddtlDtls = value;
    }

}
