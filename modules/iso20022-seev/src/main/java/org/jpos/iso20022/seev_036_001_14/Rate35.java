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

package org.jpos.iso20022.seev_036_001_14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rate35 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Rate35">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateAndAmountFormat39Choice" minOccurs="0"/>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateAndAmountFormat39Choice" minOccurs="0"/>
 *         <element name="FsclStmp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PercentageRate" minOccurs="0"/>
 *         <element name="GrssDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}GrossDividendRateFormat37Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EarlySlctnFeeRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}SolicitationFeeRateFormat8Choice" minOccurs="0"/>
 *         <element name="ThrdPtyIncntivRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateAndAmountFormat39Choice" minOccurs="0"/>
 *         <element name="IntrstRateUsdForPmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}InterestRateUsedForPaymentFormat7Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NetDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}NetDividendRateFormat40Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AplblRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PercentageRate" minOccurs="0"/>
 *         <element name="SlctnFeeRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}SolicitationFeeRateFormat8Choice" minOccurs="0"/>
 *         <element name="TaxCdtRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateFormat22Choice" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateAndAmountFormat40Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndLvlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateAndAmountFormat40Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxOnIncm" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateAndAmountFormat39Choice" minOccurs="0"/>
 *         <element name="TaxOnPrfts" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PercentageRate" minOccurs="0"/>
 *         <element name="TaxRclmRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PercentageRate" minOccurs="0"/>
 *         <element name="EqulstnRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="DmdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}RateAndAmountFormat52Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate35", propOrder = {
    "addtlTax",
    "chrgsFees",
    "fsclStmp",
    "grssDvddRate",
    "earlySlctnFeeRate",
    "thrdPtyIncntivRate",
    "intrstRateUsdForPmt",
    "netDvddRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "whldgTaxRate",
    "scndLvlTax",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "equlstnRate",
    "dmdRate"
})
public class Rate35 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat39Choice addtlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat39Choice chrgsFees;
    @XmlElement(name = "FsclStmp")
    protected BigDecimal fsclStmp;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat37Choice> grssDvddRate;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat8Choice earlySlctnFeeRate;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateAndAmountFormat39Choice thrdPtyIncntivRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat7Choice> intrstRateUsdForPmt;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat40Choice> netDvddRate;
    @XmlElement(name = "AplblRate")
    protected BigDecimal aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat8Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat22Choice taxCdtRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat40Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat40Choice> scndLvlTax;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat39Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected BigDecimal taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected BigDecimal taxRclmRate;
    @XmlElement(name = "EqulstnRate")
    protected ActiveCurrencyAnd13DecimalAmount equlstnRate;
    @XmlElement(name = "DmdRate")
    protected List<RateAndAmountFormat52Choice> dmdRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public RateAndAmountFormat39Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public void setAddtlTax(RateAndAmountFormat39Choice value) {
        this.addtlTax = value;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public RateAndAmountFormat39Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public void setChrgsFees(RateAndAmountFormat39Choice value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFsclStmp(BigDecimal value) {
        this.fsclStmp = value;
    }

    /**
     * Gets the value of the grssDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grssDvddRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrssDvddRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossDividendRateFormat37Choice }
     * 
     * 
     * @return
     *     The value of the grssDvddRate property.
     */
    public List<GrossDividendRateFormat37Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<>();
        }
        return this.grssDvddRate;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat8Choice }
     *     
     */
    public SolicitationFeeRateFormat8Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat8Choice }
     *     
     */
    public void setEarlySlctnFeeRate(SolicitationFeeRateFormat8Choice value) {
        this.earlySlctnFeeRate = value;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public RateAndAmountFormat39Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public void setThrdPtyIncntivRate(RateAndAmountFormat39Choice value) {
        this.thrdPtyIncntivRate = value;
    }

    /**
     * Gets the value of the intrstRateUsdForPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstRateUsdForPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstRateUsdForPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateUsedForPaymentFormat7Choice }
     * 
     * 
     * @return
     *     The value of the intrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat7Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<>();
        }
        return this.intrstRateUsdForPmt;
    }

    /**
     * Gets the value of the netDvddRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netDvddRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetDvddRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetDividendRateFormat40Choice }
     * 
     * 
     * @return
     *     The value of the netDvddRate property.
     */
    public List<NetDividendRateFormat40Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<>();
        }
        return this.netDvddRate;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAplblRate(BigDecimal value) {
        this.aplblRate = value;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat8Choice }
     *     
     */
    public SolicitationFeeRateFormat8Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat8Choice }
     *     
     */
    public void setSlctnFeeRate(SolicitationFeeRateFormat8Choice value) {
        this.slctnFeeRate = value;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat22Choice }
     *     
     */
    public RateFormat22Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat22Choice }
     *     
     */
    public void setTaxCdtRate(RateFormat22Choice value) {
        this.taxCdtRate = value;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the whldgTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat40Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat40Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Gets the value of the scndLvlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndLvlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndLvlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat40Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat40Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public RateAndAmountFormat39Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public void setTaxOnIncm(RateAndAmountFormat39Choice value) {
        this.taxOnIncm = value;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxOnPrfts(BigDecimal value) {
        this.taxOnPrfts = value;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRclmRate(BigDecimal value) {
        this.taxRclmRate = value;
    }

    /**
     * Gets the value of the equlstnRate property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setEqulstnRate(ActiveCurrencyAnd13DecimalAmount value) {
        this.equlstnRate = value;
    }

    /**
     * Gets the value of the dmdRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dmdRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmdRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat52Choice }
     * 
     * 
     * @return
     *     The value of the dmdRate property.
     */
    public List<RateAndAmountFormat52Choice> getDmdRate() {
        if (dmdRate == null) {
            dmdRate = new ArrayList<>();
        }
        return this.dmdRate;
    }

}
