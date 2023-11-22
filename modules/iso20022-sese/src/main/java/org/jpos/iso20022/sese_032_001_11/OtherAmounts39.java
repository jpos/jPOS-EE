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

package org.jpos.iso20022.sese_032_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAmounts39 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherAmounts39">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="CtryNtlFdrlTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="TradAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="ExctgBrkrAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="IsseDscntAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="PmtLevyTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="LclTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="LclTaxCtrySpcfc" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="LclBrkrComssn" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="Mrgn" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="RgltryAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="ShppgAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="SpclCncssn" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="StmpDty" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="StockXchgTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="TrfTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="TxTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="ValAddedTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="WhldgTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="NetGnLoss" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="CsmptnTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="AcrdCptlstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *         <element name="RsrchFee" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}AmountAndDirection44" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts39", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "ctryNtlFdrlTax",
    "tradAmt",
    "exctgBrkrAmt",
    "isseDscntAllwnc",
    "pmtLevyTax",
    "lclTax",
    "lclTaxCtrySpcfc",
    "lclBrkrComssn",
    "mrgn",
    "othr",
    "rgltryAmt",
    "shppgAmt",
    "spclCncssn",
    "stmpDty",
    "stockXchgTax",
    "trfTax",
    "txTax",
    "valAddedTax",
    "whldgTax",
    "netGnLoss",
    "csmptnTax",
    "acrdCptlstnAmt",
    "rsrchFee"
})
public class OtherAmounts39 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection44 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection44 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection44 ctryNtlFdrlTax;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection44 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection44 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection44 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection44 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection44 lclTax;
    @XmlElement(name = "LclTaxCtrySpcfc")
    protected AmountAndDirection44 lclTaxCtrySpcfc;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection44 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection44 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection44 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection44 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection44 shppgAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection44 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection44 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection44 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection44 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection44 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection44 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection44 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection44 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection44 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection44 acrdCptlstnAmt;
    @XmlElement(name = "RsrchFee")
    protected AmountAndDirection44 rsrchFee;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection44 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setChrgsFees(AmountAndDirection44 value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCtryNtlFdrlTax(AmountAndDirection44 value) {
        this.ctryNtlFdrlTax = value;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTradAmt(AmountAndDirection44 value) {
        this.tradAmt = value;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setExctgBrkrAmt(AmountAndDirection44 value) {
        this.exctgBrkrAmt = value;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setIsseDscntAllwnc(AmountAndDirection44 value) {
        this.isseDscntAllwnc = value;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setPmtLevyTax(AmountAndDirection44 value) {
        this.pmtLevyTax = value;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setLclTax(AmountAndDirection44 value) {
        this.lclTax = value;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclTaxCtrySpcfc() {
        return lclTaxCtrySpcfc;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setLclTaxCtrySpcfc(AmountAndDirection44 value) {
        this.lclTaxCtrySpcfc = value;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setLclBrkrComssn(AmountAndDirection44 value) {
        this.lclBrkrComssn = value;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setMrgn(AmountAndDirection44 value) {
        this.mrgn = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setOthr(AmountAndDirection44 value) {
        this.othr = value;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setRgltryAmt(AmountAndDirection44 value) {
        this.rgltryAmt = value;
    }

    /**
     * Gets the value of the shppgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Sets the value of the shppgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setShppgAmt(AmountAndDirection44 value) {
        this.shppgAmt = value;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setSpclCncssn(AmountAndDirection44 value) {
        this.spclCncssn = value;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setStmpDty(AmountAndDirection44 value) {
        this.stmpDty = value;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setStockXchgTax(AmountAndDirection44 value) {
        this.stockXchgTax = value;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTrfTax(AmountAndDirection44 value) {
        this.trfTax = value;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTxTax(AmountAndDirection44 value) {
        this.txTax = value;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setValAddedTax(AmountAndDirection44 value) {
        this.valAddedTax = value;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setWhldgTax(AmountAndDirection44 value) {
        this.whldgTax = value;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setNetGnLoss(AmountAndDirection44 value) {
        this.netGnLoss = value;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCsmptnTax(AmountAndDirection44 value) {
        this.csmptnTax = value;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setAcrdCptlstnAmt(AmountAndDirection44 value) {
        this.acrdCptlstnAmt = value;
    }

    /**
     * Gets the value of the rsrchFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRsrchFee() {
        return rsrchFee;
    }

    /**
     * Sets the value of the rsrchFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setRsrchFee(AmountAndDirection44 value) {
        this.rsrchFee = value;
    }

}
