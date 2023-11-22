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

package org.jpos.iso20022.semt_005_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateBalanceInformation3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AggregateBalanceInformation3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AggtQty" type="{urn:swift:xsd:semt.005.001.02}BalanceQuantity1Choice"/>
 *         <element name="DaysAcrd" type="{urn:swift:xsd:semt.005.001.02}Number" minOccurs="0"/>
 *         <element name="HldgVal" type="{urn:swift:xsd:semt.005.001.02}ActiveOrHistoricCurrencyAndAmount" maxOccurs="unbounded"/>
 *         <element name="PrvsHldgVal" type="{urn:swift:xsd:semt.005.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:swift:xsd:semt.005.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AcrdIntrstAmtSgn" type="{urn:swift:xsd:semt.005.001.02}PlusOrMinusIndicator" minOccurs="0"/>
 *         <element name="BookVal" type="{urn:swift:xsd:semt.005.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:swift:xsd:semt.005.001.02}SafekeepingPlaceFormatChoice" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:swift:xsd:semt.005.001.02}FinancialInstrument13"/>
 *         <element name="PricDtls" type="{urn:swift:xsd:semt.005.001.02}PriceInformation2" maxOccurs="unbounded"/>
 *         <element name="FXDtls" type="{urn:swift:xsd:semt.005.001.02}ForeignExchangeTerms6" minOccurs="0"/>
 *         <element name="BalBrkdwnDtls" type="{urn:swift:xsd:semt.005.001.02}SubBalanceInformation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlBalBrkdwnDtls" type="{urn:swift:xsd:semt.005.001.02}AdditionalBalanceInformation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BalAtSfkpgPlc" type="{urn:swift:xsd:semt.005.001.02}AggregateBalancePerSafekeepingPlace4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalanceInformation3", propOrder = {
    "aggtQty",
    "daysAcrd",
    "hldgVal",
    "prvsHldgVal",
    "acrdIntrstAmt",
    "acrdIntrstAmtSgn",
    "bookVal",
    "sfkpgPlc",
    "finInstrmDtls",
    "pricDtls",
    "fxDtls",
    "balBrkdwnDtls",
    "addtlBalBrkdwnDtls",
    "balAtSfkpgPlc"
})
public class AggregateBalanceInformation3 {

    @XmlElement(name = "AggtQty", required = true)
    protected BalanceQuantity1Choice aggtQty;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "HldgVal", required = true)
    protected List<ActiveOrHistoricCurrencyAndAmount> hldgVal;
    @XmlElement(name = "PrvsHldgVal")
    protected ActiveOrHistoricCurrencyAndAmount prvsHldgVal;
    @XmlElement(name = "AcrdIntrstAmt")
    protected ActiveOrHistoricCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "AcrdIntrstAmtSgn")
    protected Boolean acrdIntrstAmtSgn;
    @XmlElement(name = "BookVal")
    protected ActiveOrHistoricCurrencyAndAmount bookVal;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormatChoice sfkpgPlc;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument13 finInstrmDtls;
    @XmlElement(name = "PricDtls", required = true)
    protected List<PriceInformation2> pricDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms6 fxDtls;
    @XmlElement(name = "BalBrkdwnDtls")
    protected List<SubBalanceInformation2> balBrkdwnDtls;
    @XmlElement(name = "AddtlBalBrkdwnDtls")
    protected List<AdditionalBalanceInformation2> addtlBalBrkdwnDtls;
    @XmlElement(name = "BalAtSfkpgPlc")
    protected List<AggregateBalancePerSafekeepingPlace4> balAtSfkpgPlc;

    /**
     * Gets the value of the aggtQty property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public BalanceQuantity1Choice getAggtQty() {
        return aggtQty;
    }

    /**
     * Sets the value of the aggtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity1Choice }
     *     
     */
    public void setAggtQty(BalanceQuantity1Choice value) {
        this.aggtQty = value;
    }

    /**
     * Gets the value of the daysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAcrd() {
        return daysAcrd;
    }

    /**
     * Sets the value of the daysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
    }

    /**
     * Gets the value of the hldgVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hldgVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHldgVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the hldgVal property.
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getHldgVal() {
        if (hldgVal == null) {
            hldgVal = new ArrayList<>();
        }
        return this.hldgVal;
    }

    /**
     * Gets the value of the prvsHldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getPrvsHldgVal() {
        return prvsHldgVal;
    }

    /**
     * Sets the value of the prvsHldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setPrvsHldgVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.prvsHldgVal = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAcrdIntrstAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstAmtSgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstAmtSgn() {
        return acrdIntrstAmtSgn;
    }

    /**
     * Sets the value of the acrdIntrstAmtSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcrdIntrstAmtSgn(Boolean value) {
        this.acrdIntrstAmtSgn = value;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setBookVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.bookVal = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormatChoice }
     *     
     */
    public SafekeepingPlaceFormatChoice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormatChoice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormatChoice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public FinancialInstrument13 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument13 value) {
        this.finInstrmDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceInformation2 }
     * 
     * 
     * @return
     *     The value of the pricDtls property.
     */
    public List<PriceInformation2> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public ForeignExchangeTerms6 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public void setFXDtls(ForeignExchangeTerms6 value) {
        this.fxDtls = value;
    }

    /**
     * Gets the value of the balBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation2 }
     * 
     * 
     * @return
     *     The value of the balBrkdwnDtls property.
     */
    public List<SubBalanceInformation2> getBalBrkdwnDtls() {
        if (balBrkdwnDtls == null) {
            balBrkdwnDtls = new ArrayList<>();
        }
        return this.balBrkdwnDtls;
    }

    /**
     * Gets the value of the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation2 }
     * 
     * 
     * @return
     *     The value of the addtlBalBrkdwnDtls property.
     */
    public List<AdditionalBalanceInformation2> getAddtlBalBrkdwnDtls() {
        if (addtlBalBrkdwnDtls == null) {
            addtlBalBrkdwnDtls = new ArrayList<>();
        }
        return this.addtlBalBrkdwnDtls;
    }

    /**
     * Gets the value of the balAtSfkpgPlc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balAtSfkpgPlc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalAtSfkpgPlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalancePerSafekeepingPlace4 }
     * 
     * 
     * @return
     *     The value of the balAtSfkpgPlc property.
     */
    public List<AggregateBalancePerSafekeepingPlace4> getBalAtSfkpgPlc() {
        if (balAtSfkpgPlc == null) {
            balAtSfkpgPlc = new ArrayList<>();
        }
        return this.balAtSfkpgPlc;
    }

}
