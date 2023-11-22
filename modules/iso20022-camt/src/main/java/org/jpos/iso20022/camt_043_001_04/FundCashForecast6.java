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

package org.jpos.iso20022.camt_043_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashForecast6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundCashForecast6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:camt.043.001.04}Max35Text"/>
 *         <element name="TradDtTm" type="{urn:swift:xsd:camt.043.001.04}DateAndDateTimeChoice"/>
 *         <element name="PrvsTradDtTm" type="{urn:swift:xsd:camt.043.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:swift:xsd:camt.043.001.04}FinancialInstrument9"/>
 *         <element name="TtlNAV" type="{urn:swift:xsd:camt.043.001.04}ActiveOrHistoricCurrencyAndAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrvsTtlNAV" type="{urn:swift:xsd:camt.043.001.04}ActiveOrHistoricCurrencyAndAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlUnitsNb" type="{urn:swift:xsd:camt.043.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="PrvsTtlUnitsNb" type="{urn:swift:xsd:camt.043.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="TtlNAVChngRate" type="{urn:swift:xsd:camt.043.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="InvstmtCcy" type="{urn:swift:xsd:camt.043.001.04}ActiveOrHistoricCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CcySts" type="{urn:swift:xsd:camt.043.001.04}CurrencyDesignation1" minOccurs="0"/>
 *         <element name="XcptnlNetCshFlowInd" type="{urn:swift:xsd:camt.043.001.04}YesNoIndicator"/>
 *         <element name="Pric" type="{urn:swift:xsd:camt.043.001.04}UnitPrice19" minOccurs="0"/>
 *         <element name="FXRate" type="{urn:swift:xsd:camt.043.001.04}ForeignExchangeTerms19" minOccurs="0"/>
 *         <element name="PctgOfShrClssTtlNAV" type="{urn:swift:xsd:camt.043.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="BrkdwnByPty" type="{urn:swift:xsd:camt.043.001.04}BreakdownByParty3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BrkdwnByCtry" type="{urn:swift:xsd:camt.043.001.04}BreakdownByCountry2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BrkdwnByCcy" type="{urn:swift:xsd:camt.043.001.04}BreakdownByCurrency2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BrkdwnByUsrDfndParam" type="{urn:swift:xsd:camt.043.001.04}BreakdownByUserDefinedParameter3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NetCshFcstDtls" type="{urn:swift:xsd:camt.043.001.04}NetCashForecast4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundCashForecast6", propOrder = {
    "id",
    "tradDtTm",
    "prvsTradDtTm",
    "finInstrmDtls",
    "ttlNAV",
    "prvsTtlNAV",
    "ttlUnitsNb",
    "prvsTtlUnitsNb",
    "ttlNAVChngRate",
    "invstmtCcy",
    "ccySts",
    "xcptnlNetCshFlowInd",
    "pric",
    "fxRate",
    "pctgOfShrClssTtlNAV",
    "brkdwnByPty",
    "brkdwnByCtry",
    "brkdwnByCcy",
    "brkdwnByUsrDfndParam",
    "netCshFcstDtls"
})
public class FundCashForecast6 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "PrvsTradDtTm")
    protected DateAndDateTimeChoice prvsTradDtTm;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument9 finInstrmDtls;
    @XmlElement(name = "TtlNAV")
    protected List<ActiveOrHistoricCurrencyAndAmount> ttlNAV;
    @XmlElement(name = "PrvsTtlNAV")
    protected List<ActiveOrHistoricCurrencyAndAmount> prvsTtlNAV;
    @XmlElement(name = "TtlUnitsNb")
    protected FinancialInstrumentQuantity1 ttlUnitsNb;
    @XmlElement(name = "PrvsTtlUnitsNb")
    protected FinancialInstrumentQuantity1 prvsTtlUnitsNb;
    @XmlElement(name = "TtlNAVChngRate")
    protected BigDecimal ttlNAVChngRate;
    @XmlElement(name = "InvstmtCcy")
    protected List<String> invstmtCcy;
    @XmlElement(name = "CcySts")
    protected CurrencyDesignation1 ccySts;
    @XmlElement(name = "XcptnlNetCshFlowInd")
    protected boolean xcptnlNetCshFlowInd;
    @XmlElement(name = "Pric")
    protected UnitPrice19 pric;
    @XmlElement(name = "FXRate")
    protected ForeignExchangeTerms19 fxRate;
    @XmlElement(name = "PctgOfShrClssTtlNAV")
    protected BigDecimal pctgOfShrClssTtlNAV;
    @XmlElement(name = "BrkdwnByPty")
    protected List<BreakdownByParty3> brkdwnByPty;
    @XmlElement(name = "BrkdwnByCtry")
    protected List<BreakdownByCountry2> brkdwnByCtry;
    @XmlElement(name = "BrkdwnByCcy")
    protected List<BreakdownByCurrency2> brkdwnByCcy;
    @XmlElement(name = "BrkdwnByUsrDfndParam")
    protected List<BreakdownByUserDefinedParameter3> brkdwnByUsrDfndParam;
    @XmlElement(name = "NetCshFcstDtls")
    protected List<NetCashForecast4> netCshFcstDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the prvsTradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrvsTradDtTm() {
        return prvsTradDtTm;
    }

    /**
     * Sets the value of the prvsTradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setPrvsTradDtTm(DateAndDateTimeChoice value) {
        this.prvsTradDtTm = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument9 }
     *     
     */
    public FinancialInstrument9 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument9 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument9 value) {
        this.finInstrmDtls = value;
    }

    /**
     * Gets the value of the ttlNAV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlNAV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlNAV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the ttlNAV property.
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getTtlNAV() {
        if (ttlNAV == null) {
            ttlNAV = new ArrayList<>();
        }
        return this.ttlNAV;
    }

    /**
     * Gets the value of the prvsTtlNAV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsTtlNAV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsTtlNAV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the prvsTtlNAV property.
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getPrvsTtlNAV() {
        if (prvsTtlNAV == null) {
            prvsTtlNAV = new ArrayList<>();
        }
        return this.prvsTtlNAV;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsNb = value;
    }

    /**
     * Gets the value of the prvsTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getPrvsTtlUnitsNb() {
        return prvsTtlUnitsNb;
    }

    /**
     * Sets the value of the prvsTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setPrvsTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.prvsTtlUnitsNb = value;
    }

    /**
     * Gets the value of the ttlNAVChngRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNAVChngRate() {
        return ttlNAVChngRate;
    }

    /**
     * Sets the value of the ttlNAVChngRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNAVChngRate(BigDecimal value) {
        this.ttlNAVChngRate = value;
    }

    /**
     * Gets the value of the invstmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the invstmtCcy property.
     */
    public List<String> getInvstmtCcy() {
        if (invstmtCcy == null) {
            invstmtCcy = new ArrayList<>();
        }
        return this.invstmtCcy;
    }

    /**
     * Gets the value of the ccySts property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDesignation1 }
     *     
     */
    public CurrencyDesignation1 getCcySts() {
        return ccySts;
    }

    /**
     * Sets the value of the ccySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDesignation1 }
     *     
     */
    public void setCcySts(CurrencyDesignation1 value) {
        this.ccySts = value;
    }

    /**
     * Gets the value of the xcptnlNetCshFlowInd property.
     * 
     */
    public boolean isXcptnlNetCshFlowInd() {
        return xcptnlNetCshFlowInd;
    }

    /**
     * Sets the value of the xcptnlNetCshFlowInd property.
     * 
     */
    public void setXcptnlNetCshFlowInd(boolean value) {
        this.xcptnlNetCshFlowInd = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice19 }
     *     
     */
    public UnitPrice19 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice19 }
     *     
     */
    public void setPric(UnitPrice19 value) {
        this.pric = value;
    }

    /**
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public ForeignExchangeTerms19 getFXRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public void setFXRate(ForeignExchangeTerms19 value) {
        this.fxRate = value;
    }

    /**
     * Gets the value of the pctgOfShrClssTtlNAV property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfShrClssTtlNAV() {
        return pctgOfShrClssTtlNAV;
    }

    /**
     * Sets the value of the pctgOfShrClssTtlNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfShrClssTtlNAV(BigDecimal value) {
        this.pctgOfShrClssTtlNAV = value;
    }

    /**
     * Gets the value of the brkdwnByPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brkdwnByPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByParty3 }
     * 
     * 
     * @return
     *     The value of the brkdwnByPty property.
     */
    public List<BreakdownByParty3> getBrkdwnByPty() {
        if (brkdwnByPty == null) {
            brkdwnByPty = new ArrayList<>();
        }
        return this.brkdwnByPty;
    }

    /**
     * Gets the value of the brkdwnByCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brkdwnByCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByCountry2 }
     * 
     * 
     * @return
     *     The value of the brkdwnByCtry property.
     */
    public List<BreakdownByCountry2> getBrkdwnByCtry() {
        if (brkdwnByCtry == null) {
            brkdwnByCtry = new ArrayList<>();
        }
        return this.brkdwnByCtry;
    }

    /**
     * Gets the value of the brkdwnByCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brkdwnByCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByCurrency2 }
     * 
     * 
     * @return
     *     The value of the brkdwnByCcy property.
     */
    public List<BreakdownByCurrency2> getBrkdwnByCcy() {
        if (brkdwnByCcy == null) {
            brkdwnByCcy = new ArrayList<>();
        }
        return this.brkdwnByCcy;
    }

    /**
     * Gets the value of the brkdwnByUsrDfndParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brkdwnByUsrDfndParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByUsrDfndParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByUserDefinedParameter3 }
     * 
     * 
     * @return
     *     The value of the brkdwnByUsrDfndParam property.
     */
    public List<BreakdownByUserDefinedParameter3> getBrkdwnByUsrDfndParam() {
        if (brkdwnByUsrDfndParam == null) {
            brkdwnByUsrDfndParam = new ArrayList<>();
        }
        return this.brkdwnByUsrDfndParam;
    }

    /**
     * Gets the value of the netCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetCashForecast4 }
     * 
     * 
     * @return
     *     The value of the netCshFcstDtls property.
     */
    public List<NetCashForecast4> getNetCshFcstDtls() {
        if (netCshFcstDtls == null) {
            netCshFcstDtls = new ArrayList<>();
        }
        return this.netCshFcstDtls;
    }

}
