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

package org.jpos.iso20022.seev_035_002_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionRate109 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionRate109">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateAndAmountFormat46Choice" minOccurs="0"/>
 *         <element name="GrssDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}GrossDividendRateFormat41Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NetDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}NetDividendRateFormat43Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrstRateUsdForPmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}InterestRateUsedForPaymentFormat10Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MaxAllwdOvrsbcptRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateFormat3Choice" minOccurs="0"/>
 *         <element name="PrratnRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateFormat3Choice" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateAndAmountFormat47Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndLvlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateAndAmountFormat47Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxblIncmPerDvddShr" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateTypeAndAmountAndStatus33" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxOnIncm" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}RateAndAmountFormat46Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate109", propOrder = {
    "addtlTax",
    "grssDvddRate",
    "netDvddRate",
    "intrstRateUsdForPmt",
    "maxAllwdOvrsbcptRate",
    "prratnRate",
    "whldgTaxRate",
    "scndLvlTax",
    "taxblIncmPerDvddShr",
    "taxOnIncm"
})
public class CorporateActionRate109 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat46Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat41Choice> grssDvddRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat43Choice> netDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat10Choice> intrstRateUsdForPmt;
    @XmlElement(name = "MaxAllwdOvrsbcptRate")
    protected RateFormat3Choice maxAllwdOvrsbcptRate;
    @XmlElement(name = "PrratnRate")
    protected RateFormat3Choice prratnRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat47Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat47Choice> scndLvlTax;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected List<RateTypeAndAmountAndStatus33> taxblIncmPerDvddShr;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat46Choice taxOnIncm;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public void setAddtlTax(RateAndAmountFormat46Choice value) {
        this.addtlTax = value;
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
     * {@link GrossDividendRateFormat41Choice }
     * 
     * 
     * @return
     *     The value of the grssDvddRate property.
     */
    public List<GrossDividendRateFormat41Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<>();
        }
        return this.grssDvddRate;
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
     * {@link NetDividendRateFormat43Choice }
     * 
     * 
     * @return
     *     The value of the netDvddRate property.
     */
    public List<NetDividendRateFormat43Choice> getNetDvddRate() {
        if (netDvddRate == null) {
            netDvddRate = new ArrayList<>();
        }
        return this.netDvddRate;
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
     * {@link InterestRateUsedForPaymentFormat10Choice }
     * 
     * 
     * @return
     *     The value of the intrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat10Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<>();
        }
        return this.intrstRateUsdForPmt;
    }

    /**
     * Gets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getMaxAllwdOvrsbcptRate() {
        return maxAllwdOvrsbcptRate;
    }

    /**
     * Sets the value of the maxAllwdOvrsbcptRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setMaxAllwdOvrsbcptRate(RateFormat3Choice value) {
        this.maxAllwdOvrsbcptRate = value;
    }

    /**
     * Gets the value of the prratnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getPrratnRate() {
        return prratnRate;
    }

    /**
     * Sets the value of the prratnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setPrratnRate(RateFormat3Choice value) {
        this.prratnRate = value;
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
     * {@link RateAndAmountFormat47Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat47Choice> getWhldgTaxRate() {
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
     * {@link RateAndAmountFormat47Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat47Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the taxblIncmPerDvddShr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxblIncmPerDvddShr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxblIncmPerDvddShr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateTypeAndAmountAndStatus33 }
     * 
     * 
     * @return
     *     The value of the taxblIncmPerDvddShr property.
     */
    public List<RateTypeAndAmountAndStatus33> getTaxblIncmPerDvddShr() {
        if (taxblIncmPerDvddShr == null) {
            taxblIncmPerDvddShr = new ArrayList<>();
        }
        return this.taxblIncmPerDvddShr;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public void setTaxOnIncm(RateAndAmountFormat46Choice value) {
        this.taxOnIncm = value;
    }

}
