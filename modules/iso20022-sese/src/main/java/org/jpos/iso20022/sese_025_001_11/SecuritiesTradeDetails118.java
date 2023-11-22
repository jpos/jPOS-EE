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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeDetails118 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeDetails118">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Max52Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}PlaceOfTradeIdentification1" minOccurs="0"/>
 *         <element name="PlcOfClr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}PlaceOfClearingIdentification2" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}TradeDate8Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SettlementDate17Choice" minOccurs="0"/>
 *         <element name="FctvSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}SettlementDate18Choice"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Price10" minOccurs="0"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Max3Number" minOccurs="0"/>
 *         <element name="OpngClsg" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}OpeningClosing3Choice" minOccurs="0"/>
 *         <element name="Rptg" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Reporting6Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TradTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}TradeTransactionCondition5Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InvstrCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}InvestorCapacity4Choice" minOccurs="0"/>
 *         <element name="TradOrgtrRole" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}TradeOriginator3Choice" minOccurs="0"/>
 *         <element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}TypeOfPrice29Choice" minOccurs="0"/>
 *         <element name="FxAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Max350Text" minOccurs="0"/>
 *         <element name="SttlmInstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.11}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails118", propOrder = {
    "tradId",
    "collTxId",
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
    "sttlmDt",
    "fctvSttlmDt",
    "dealPric",
    "nbOfDaysAcrd",
    "opngClsg",
    "rptg",
    "tradTxCond",
    "invstrCpcty",
    "tradOrgtrRole",
    "tpOfPric",
    "fxAddtlDtls",
    "sttlmInstrPrcgAddtlDtls"
})
public class SecuritiesTradeDetails118 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "CollTxId")
    protected List<String> collTxId;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "SttlmDt")
    protected SettlementDate17Choice sttlmDt;
    @XmlElement(name = "FctvSttlmDt", required = true)
    protected SettlementDate18Choice fctvSttlmDt;
    @XmlElement(name = "DealPric")
    protected Price10 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "OpngClsg")
    protected OpeningClosing3Choice opngClsg;
    @XmlElement(name = "Rptg")
    protected List<Reporting6Choice> rptg;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition5Choice> tradTxCond;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity4Choice invstrCpcty;
    @XmlElement(name = "TradOrgtrRole")
    protected TradeOriginator3Choice tradOrgtrRole;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice29Choice tpOfPric;
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
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public PlaceOfTradeIdentification1 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification1 value) {
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
     *     {@link TradeDate8Choice }
     *     
     */
    public TradeDate8Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice }
     *     
     */
    public void setTradDt(TradeDate8Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate17Choice }
     *     
     */
    public SettlementDate17Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate17Choice }
     *     
     */
    public void setSttlmDt(SettlementDate17Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate18Choice }
     *     
     */
    public SettlementDate18Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate18Choice }
     *     
     */
    public void setFctvSttlmDt(SettlementDate18Choice value) {
        this.fctvSttlmDt = value;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price10 }
     *     
     */
    public Price10 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price10 }
     *     
     */
    public void setDealPric(Price10 value) {
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
     *     {@link OpeningClosing3Choice }
     *     
     */
    public OpeningClosing3Choice getOpngClsg() {
        return opngClsg;
    }

    /**
     * Sets the value of the opngClsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningClosing3Choice }
     *     
     */
    public void setOpngClsg(OpeningClosing3Choice value) {
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
     * {@link Reporting6Choice }
     * 
     * 
     * @return
     *     The value of the rptg property.
     */
    public List<Reporting6Choice> getRptg() {
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
     * {@link TradeTransactionCondition5Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition5Choice> getTradTxCond() {
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
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public InvestorCapacity4Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Sets the value of the invstrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public void setInvstrCpcty(InvestorCapacity4Choice value) {
        this.invstrCpcty = value;
    }

    /**
     * Gets the value of the tradOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradeOriginator3Choice }
     *     
     */
    public TradeOriginator3Choice getTradOrgtrRole() {
        return tradOrgtrRole;
    }

    /**
     * Sets the value of the tradOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOriginator3Choice }
     *     
     */
    public void setTradOrgtrRole(TradeOriginator3Choice value) {
        this.tradOrgtrRole = value;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public TypeOfPrice29Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public void setTpOfPric(TypeOfPrice29Choice value) {
        this.tpOfPric = value;
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
