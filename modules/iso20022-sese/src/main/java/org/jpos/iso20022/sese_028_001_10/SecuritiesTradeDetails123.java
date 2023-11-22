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

package org.jpos.iso20022.sese_028_001_10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeDetails123 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeDetails123">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max52Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max35Text" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}PlaceOfTradeIdentification1" minOccurs="0"/>
 *         <element name="PlcOfClr" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}PlaceOfClearingIdentification2" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}TradeDate8Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}SettlementDate17Choice"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Price10" minOccurs="0"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}Max3Number" minOccurs="0"/>
 *         <element name="TradTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}TradeTransactionCondition5Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.001.10}TypeOfPrice29Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails123", propOrder = {
    "tradId",
    "collTxId",
    "acctOwnrTxId",
    "prcrTxId",
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
    "sttlmDt",
    "dealPric",
    "nbOfDaysAcrd",
    "tradTxCond",
    "tpOfPric"
})
public class SecuritiesTradeDetails123 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "CollTxId")
    protected List<String> collTxId;
    @XmlElement(name = "AcctOwnrTxId")
    protected List<String> acctOwnrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate17Choice sttlmDt;
    @XmlElement(name = "DealPric")
    protected Price10 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition5Choice> tradTxCond;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice29Choice tpOfPric;

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
     * Gets the value of the acctOwnrTxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctOwnrTxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOwnrTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the acctOwnrTxId property.
     */
    public List<String> getAcctOwnrTxId() {
        if (acctOwnrTxId == null) {
            acctOwnrTxId = new ArrayList<>();
        }
        return this.acctOwnrTxId;
    }

    /**
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcrTxId(String value) {
        this.prcrTxId = value;
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

}
