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

package org.jpos.iso20022.seev_036_002_14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rate37 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Rate37">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="FsclStmp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PercentageRate" minOccurs="0"/>
 *         <element name="GrssDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GrossDividendRateFormat40Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EarlySlctnFeeRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SolicitationFeeRateFormat9Choice" minOccurs="0"/>
 *         <element name="ThrdPtyIncntivRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="IntrstRateUsdForPmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}InterestRateUsedForPaymentFormat9Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NetDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}NetDividendRateFormat42Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AplblRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PercentageRate" minOccurs="0"/>
 *         <element name="SlctnFeeRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SolicitationFeeRateFormat9Choice" minOccurs="0"/>
 *         <element name="TaxCdtRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateFormat23Choice" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat45Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndLvlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat45Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxOnIncm" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="TaxOnPrfts" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PercentageRate" minOccurs="0"/>
 *         <element name="TaxRclmRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PercentageRate" minOccurs="0"/>
 *         <element name="EqulstnRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="DmdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat54Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate37", propOrder = {
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
public class Rate37 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat43Choice addtlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat43Choice chrgsFees;
    @XmlElement(name = "FsclStmp")
    protected BigDecimal fsclStmp;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat40Choice> grssDvddRate;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat9Choice earlySlctnFeeRate;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateAndAmountFormat43Choice thrdPtyIncntivRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat9Choice> intrstRateUsdForPmt;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat42Choice> netDvddRate;
    @XmlElement(name = "AplblRate")
    protected BigDecimal aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat9Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat23Choice taxCdtRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat45Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat45Choice> scndLvlTax;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat43Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected BigDecimal taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected BigDecimal taxRclmRate;
    @XmlElement(name = "EqulstnRate")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount equlstnRate;
    @XmlElement(name = "DmdRate")
    protected List<RateAndAmountFormat54Choice> dmdRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setAddtlTax(RateAndAmountFormat43Choice value) {
        this.addtlTax = value;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setChrgsFees(RateAndAmountFormat43Choice value) {
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
     * {@link GrossDividendRateFormat40Choice }
     * 
     * 
     * @return
     *     The value of the grssDvddRate property.
     */
    public List<GrossDividendRateFormat40Choice> getGrssDvddRate() {
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
     *     {@link SolicitationFeeRateFormat9Choice }
     *     
     */
    public SolicitationFeeRateFormat9Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat9Choice }
     *     
     */
    public void setEarlySlctnFeeRate(SolicitationFeeRateFormat9Choice value) {
        this.earlySlctnFeeRate = value;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setThrdPtyIncntivRate(RateAndAmountFormat43Choice value) {
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
     * {@link InterestRateUsedForPaymentFormat9Choice }
     * 
     * 
     * @return
     *     The value of the intrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat9Choice> getIntrstRateUsdForPmt() {
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
     * {@link NetDividendRateFormat42Choice }
     * 
     * 
     * @return
     *     The value of the netDvddRate property.
     */
    public List<NetDividendRateFormat42Choice> getNetDvddRate() {
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
     *     {@link SolicitationFeeRateFormat9Choice }
     *     
     */
    public SolicitationFeeRateFormat9Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat9Choice }
     *     
     */
    public void setSlctnFeeRate(SolicitationFeeRateFormat9Choice value) {
        this.slctnFeeRate = value;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat23Choice }
     *     
     */
    public RateFormat23Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat23Choice }
     *     
     */
    public void setTaxCdtRate(RateFormat23Choice value) {
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
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat45Choice> getWhldgTaxRate() {
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
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat45Choice> getScndLvlTax() {
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
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setTaxOnIncm(RateAndAmountFormat43Choice value) {
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
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setEqulstnRate(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
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
     * {@link RateAndAmountFormat54Choice }
     * 
     * 
     * @return
     *     The value of the dmdRate property.
     */
    public List<RateAndAmountFormat54Choice> getDmdRate() {
        if (dmdRate == null) {
            dmdRate = new ArrayList<>();
        }
        return this.dmdRate;
    }

}
