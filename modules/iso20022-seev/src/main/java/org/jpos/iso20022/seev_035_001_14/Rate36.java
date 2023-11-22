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

package org.jpos.iso20022.seev_035_001_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rate36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Rate36">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateAndAmountFormat37Choice" minOccurs="0"/>
 *         <element name="GrssDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}GrossDividendRateFormat38Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrstRateUsdForPmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}InterestRateUsedForPaymentFormat8Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateAndAmountFormat41Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndLvlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateAndAmountFormat41Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateAndAmountFormat37Choice" minOccurs="0"/>
 *         <element name="EarlySlctnFeeRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}SolicitationFeeRateFormat7Choice" minOccurs="0"/>
 *         <element name="FsclStmp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateFormat3Choice" minOccurs="0"/>
 *         <element name="ThrdPtyIncntivRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateFormat20Choice" minOccurs="0"/>
 *         <element name="NetDvddRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}NetDividendRateFormat39Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AplblRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateFormat3Choice" minOccurs="0"/>
 *         <element name="SlctnFeeRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}SolicitationFeeRateFormat7Choice" minOccurs="0"/>
 *         <element name="TaxCdtRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateFormat20Choice" minOccurs="0"/>
 *         <element name="TaxOnIncm" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateAndAmountFormat37Choice" minOccurs="0"/>
 *         <element name="TaxOnPrfts" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateFormat3Choice" minOccurs="0"/>
 *         <element name="TaxRclmRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateFormat3Choice" minOccurs="0"/>
 *         <element name="EqulstnRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateAndAmountFormat42Choice" minOccurs="0"/>
 *         <element name="DmdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}RateAndAmountFormat51Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate36", propOrder = {
    "addtlTax",
    "grssDvddRate",
    "intrstRateUsdForPmt",
    "whldgTaxRate",
    "scndLvlTax",
    "chrgsFees",
    "earlySlctnFeeRate",
    "fsclStmp",
    "thrdPtyIncntivRate",
    "netDvddRate",
    "aplblRate",
    "slctnFeeRate",
    "taxCdtRate",
    "taxOnIncm",
    "taxOnPrfts",
    "taxRclmRate",
    "equlstnRate",
    "dmdRate"
})
public class Rate36 {

    @XmlElement(name = "AddtlTax")
    protected RateAndAmountFormat37Choice addtlTax;
    @XmlElement(name = "GrssDvddRate")
    protected List<GrossDividendRateFormat38Choice> grssDvddRate;
    @XmlElement(name = "IntrstRateUsdForPmt")
    protected List<InterestRateUsedForPaymentFormat8Choice> intrstRateUsdForPmt;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat41Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat41Choice> scndLvlTax;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat37Choice chrgsFees;
    @XmlElement(name = "EarlySlctnFeeRate")
    protected SolicitationFeeRateFormat7Choice earlySlctnFeeRate;
    @XmlElement(name = "FsclStmp")
    protected RateFormat3Choice fsclStmp;
    @XmlElement(name = "ThrdPtyIncntivRate")
    protected RateFormat20Choice thrdPtyIncntivRate;
    @XmlElement(name = "NetDvddRate")
    protected List<NetDividendRateFormat39Choice> netDvddRate;
    @XmlElement(name = "AplblRate")
    protected RateFormat3Choice aplblRate;
    @XmlElement(name = "SlctnFeeRate")
    protected SolicitationFeeRateFormat7Choice slctnFeeRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat20Choice taxCdtRate;
    @XmlElement(name = "TaxOnIncm")
    protected RateAndAmountFormat37Choice taxOnIncm;
    @XmlElement(name = "TaxOnPrfts")
    protected RateFormat3Choice taxOnPrfts;
    @XmlElement(name = "TaxRclmRate")
    protected RateFormat3Choice taxRclmRate;
    @XmlElement(name = "EqulstnRate")
    protected RateAndAmountFormat42Choice equlstnRate;
    @XmlElement(name = "DmdRate")
    protected List<RateAndAmountFormat51Choice> dmdRate;

    /**
     * Gets the value of the addtlTax property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getAddtlTax() {
        return addtlTax;
    }

    /**
     * Sets the value of the addtlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public void setAddtlTax(RateAndAmountFormat37Choice value) {
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
     * {@link GrossDividendRateFormat38Choice }
     * 
     * 
     * @return
     *     The value of the grssDvddRate property.
     */
    public List<GrossDividendRateFormat38Choice> getGrssDvddRate() {
        if (grssDvddRate == null) {
            grssDvddRate = new ArrayList<>();
        }
        return this.grssDvddRate;
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
     * {@link InterestRateUsedForPaymentFormat8Choice }
     * 
     * 
     * @return
     *     The value of the intrstRateUsdForPmt property.
     */
    public List<InterestRateUsedForPaymentFormat8Choice> getIntrstRateUsdForPmt() {
        if (intrstRateUsdForPmt == null) {
            intrstRateUsdForPmt = new ArrayList<>();
        }
        return this.intrstRateUsdForPmt;
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
     * {@link RateAndAmountFormat41Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat41Choice> getWhldgTaxRate() {
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
     * {@link RateAndAmountFormat41Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat41Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<>();
        }
        return this.scndLvlTax;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public void setChrgsFees(RateAndAmountFormat37Choice value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the earlySlctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public SolicitationFeeRateFormat7Choice getEarlySlctnFeeRate() {
        return earlySlctnFeeRate;
    }

    /**
     * Sets the value of the earlySlctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public void setEarlySlctnFeeRate(SolicitationFeeRateFormat7Choice value) {
        this.earlySlctnFeeRate = value;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setFsclStmp(RateFormat3Choice value) {
        this.fsclStmp = value;
    }

    /**
     * Gets the value of the thrdPtyIncntivRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat20Choice }
     *     
     */
    public RateFormat20Choice getThrdPtyIncntivRate() {
        return thrdPtyIncntivRate;
    }

    /**
     * Sets the value of the thrdPtyIncntivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat20Choice }
     *     
     */
    public void setThrdPtyIncntivRate(RateFormat20Choice value) {
        this.thrdPtyIncntivRate = value;
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
     * {@link NetDividendRateFormat39Choice }
     * 
     * 
     * @return
     *     The value of the netDvddRate property.
     */
    public List<NetDividendRateFormat39Choice> getNetDvddRate() {
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
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setAplblRate(RateFormat3Choice value) {
        this.aplblRate = value;
    }

    /**
     * Gets the value of the slctnFeeRate property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public SolicitationFeeRateFormat7Choice getSlctnFeeRate() {
        return slctnFeeRate;
    }

    /**
     * Sets the value of the slctnFeeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFeeRateFormat7Choice }
     *     
     */
    public void setSlctnFeeRate(SolicitationFeeRateFormat7Choice value) {
        this.slctnFeeRate = value;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat20Choice }
     *     
     */
    public RateFormat20Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat20Choice }
     *     
     */
    public void setTaxCdtRate(RateFormat20Choice value) {
        this.taxCdtRate = value;
    }

    /**
     * Gets the value of the taxOnIncm property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getTaxOnIncm() {
        return taxOnIncm;
    }

    /**
     * Sets the value of the taxOnIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public void setTaxOnIncm(RateAndAmountFormat37Choice value) {
        this.taxOnIncm = value;
    }

    /**
     * Gets the value of the taxOnPrfts property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getTaxOnPrfts() {
        return taxOnPrfts;
    }

    /**
     * Sets the value of the taxOnPrfts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setTaxOnPrfts(RateFormat3Choice value) {
        this.taxOnPrfts = value;
    }

    /**
     * Gets the value of the taxRclmRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getTaxRclmRate() {
        return taxRclmRate;
    }

    /**
     * Sets the value of the taxRclmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setTaxRclmRate(RateFormat3Choice value) {
        this.taxRclmRate = value;
    }

    /**
     * Gets the value of the equlstnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat42Choice }
     *     
     */
    public RateAndAmountFormat42Choice getEqulstnRate() {
        return equlstnRate;
    }

    /**
     * Sets the value of the equlstnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat42Choice }
     *     
     */
    public void setEqulstnRate(RateAndAmountFormat42Choice value) {
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
     * {@link RateAndAmountFormat51Choice }
     * 
     * 
     * @return
     *     The value of the dmdRate property.
     */
    public List<RateAndAmountFormat51Choice> getDmdRate() {
        if (dmdRate == null) {
            dmdRate = new ArrayList<>();
        }
        return this.dmdRate;
    }

}
