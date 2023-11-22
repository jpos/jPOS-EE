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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAmounts16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherAmounts16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="CtryNtlFdrlTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="ExctgBrkrAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="IsseDscntAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="PmtLevyTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="LclTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="LclBrkrComssn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="Mrgn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="RgltryAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="SpclCncssn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="StmpDty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="StockXchgTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="TrfTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="TxTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="ValAddedTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="WhldgTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="NetGnLoss" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="CsmptnTax" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="MtchgConfFee" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="ConvtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="OrgnlCcyAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="BookVal" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="AcrdCptlstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="LclTaxCtrySpcfc1" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="LclTaxCtrySpcfc2" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="LclTaxCtrySpcfc3" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="LclTaxCtrySpcfc4" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="ShrdBrkrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="MktMmbFeeAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="RmnrtnAmtReq" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="RmnrtnAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="BrrwgIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="BrrwgFee" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="NetMktVal" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="RmngFaceVal" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="RmngBookVal" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="ClrBrkrComssn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="DiffInPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="OddLotFee" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts16", propOrder = {
    "chrgsFees",
    "ctryNtlFdrlTax",
    "exctgBrkrAmt",
    "isseDscntAllwnc",
    "pmtLevyTax",
    "lclTax",
    "lclBrkrComssn",
    "mrgn",
    "othr",
    "rgltryAmt",
    "spclCncssn",
    "stmpDty",
    "stockXchgTax",
    "trfTax",
    "txTax",
    "valAddedTax",
    "whldgTax",
    "netGnLoss",
    "csmptnTax",
    "mtchgConfFee",
    "convtdAmt",
    "orgnlCcyAmt",
    "bookVal",
    "acrdCptlstnAmt",
    "lclTaxCtrySpcfc1",
    "lclTaxCtrySpcfc2",
    "lclTaxCtrySpcfc3",
    "lclTaxCtrySpcfc4",
    "shrdBrkrgAmt",
    "mktMmbFeeAmt",
    "rmnrtnAmtReq",
    "rmnrtnAmt",
    "brrwgIntrstAmt",
    "brrwgFee",
    "netMktVal",
    "rmngFaceVal",
    "rmngBookVal",
    "clrBrkrComssn",
    "diffInPric",
    "oddLotFee"
})
public class OtherAmounts16 {

    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection29 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection29 ctryNtlFdrlTax;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection29 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection29 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection29 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection29 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection29 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection29 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection29 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection29 rgltryAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection29 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection29 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection29 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection29 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection29 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection29 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection29 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection29 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection29 csmptnTax;
    @XmlElement(name = "MtchgConfFee")
    protected AmountAndDirection29 mtchgConfFee;
    @XmlElement(name = "ConvtdAmt")
    protected AmountAndDirection29 convtdAmt;
    @XmlElement(name = "OrgnlCcyAmt")
    protected AmountAndDirection29 orgnlCcyAmt;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection29 bookVal;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection29 acrdCptlstnAmt;
    @XmlElement(name = "LclTaxCtrySpcfc1")
    protected AmountAndDirection29 lclTaxCtrySpcfc1;
    @XmlElement(name = "LclTaxCtrySpcfc2")
    protected AmountAndDirection29 lclTaxCtrySpcfc2;
    @XmlElement(name = "LclTaxCtrySpcfc3")
    protected AmountAndDirection29 lclTaxCtrySpcfc3;
    @XmlElement(name = "LclTaxCtrySpcfc4")
    protected AmountAndDirection29 lclTaxCtrySpcfc4;
    @XmlElement(name = "ShrdBrkrgAmt")
    protected AmountAndDirection29 shrdBrkrgAmt;
    @XmlElement(name = "MktMmbFeeAmt")
    protected AmountAndDirection29 mktMmbFeeAmt;
    @XmlElement(name = "RmnrtnAmtReq")
    protected Boolean rmnrtnAmtReq;
    @XmlElement(name = "RmnrtnAmt")
    protected AmountAndDirection29 rmnrtnAmt;
    @XmlElement(name = "BrrwgIntrstAmt")
    protected AmountAndDirection29 brrwgIntrstAmt;
    @XmlElement(name = "BrrwgFee")
    protected AmountAndDirection29 brrwgFee;
    @XmlElement(name = "NetMktVal")
    protected AmountAndDirection29 netMktVal;
    @XmlElement(name = "RmngFaceVal")
    protected AmountAndDirection29 rmngFaceVal;
    @XmlElement(name = "RmngBookVal")
    protected AmountAndDirection29 rmngBookVal;
    @XmlElement(name = "ClrBrkrComssn")
    protected AmountAndDirection29 clrBrkrComssn;
    @XmlElement(name = "DiffInPric")
    protected AmountAndDirection29 diffInPric;
    @XmlElement(name = "OddLotFee")
    protected Boolean oddLotFee;

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setChrgsFees(AmountAndDirection29 value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setCtryNtlFdrlTax(AmountAndDirection29 value) {
        this.ctryNtlFdrlTax = value;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setExctgBrkrAmt(AmountAndDirection29 value) {
        this.exctgBrkrAmt = value;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setIsseDscntAllwnc(AmountAndDirection29 value) {
        this.isseDscntAllwnc = value;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setPmtLevyTax(AmountAndDirection29 value) {
        this.pmtLevyTax = value;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setLclTax(AmountAndDirection29 value) {
        this.lclTax = value;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setLclBrkrComssn(AmountAndDirection29 value) {
        this.lclBrkrComssn = value;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setMrgn(AmountAndDirection29 value) {
        this.mrgn = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setOthr(AmountAndDirection29 value) {
        this.othr = value;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setRgltryAmt(AmountAndDirection29 value) {
        this.rgltryAmt = value;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setSpclCncssn(AmountAndDirection29 value) {
        this.spclCncssn = value;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setStmpDty(AmountAndDirection29 value) {
        this.stmpDty = value;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setStockXchgTax(AmountAndDirection29 value) {
        this.stockXchgTax = value;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setTrfTax(AmountAndDirection29 value) {
        this.trfTax = value;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setTxTax(AmountAndDirection29 value) {
        this.txTax = value;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setValAddedTax(AmountAndDirection29 value) {
        this.valAddedTax = value;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setWhldgTax(AmountAndDirection29 value) {
        this.whldgTax = value;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setNetGnLoss(AmountAndDirection29 value) {
        this.netGnLoss = value;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setCsmptnTax(AmountAndDirection29 value) {
        this.csmptnTax = value;
    }

    /**
     * Gets the value of the mtchgConfFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getMtchgConfFee() {
        return mtchgConfFee;
    }

    /**
     * Sets the value of the mtchgConfFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setMtchgConfFee(AmountAndDirection29 value) {
        this.mtchgConfFee = value;
    }

    /**
     * Gets the value of the convtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getConvtdAmt() {
        return convtdAmt;
    }

    /**
     * Sets the value of the convtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setConvtdAmt(AmountAndDirection29 value) {
        this.convtdAmt = value;
    }

    /**
     * Gets the value of the orgnlCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getOrgnlCcyAmt() {
        return orgnlCcyAmt;
    }

    /**
     * Sets the value of the orgnlCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setOrgnlCcyAmt(AmountAndDirection29 value) {
        this.orgnlCcyAmt = value;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setBookVal(AmountAndDirection29 value) {
        this.bookVal = value;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setAcrdCptlstnAmt(AmountAndDirection29 value) {
        this.acrdCptlstnAmt = value;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc1 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc1() {
        return lclTaxCtrySpcfc1;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setLclTaxCtrySpcfc1(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc1 = value;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc2 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc2() {
        return lclTaxCtrySpcfc2;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setLclTaxCtrySpcfc2(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc2 = value;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc3 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc3() {
        return lclTaxCtrySpcfc3;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setLclTaxCtrySpcfc3(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc3 = value;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc4 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc4() {
        return lclTaxCtrySpcfc4;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setLclTaxCtrySpcfc4(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc4 = value;
    }

    /**
     * Gets the value of the shrdBrkrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getShrdBrkrgAmt() {
        return shrdBrkrgAmt;
    }

    /**
     * Sets the value of the shrdBrkrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setShrdBrkrgAmt(AmountAndDirection29 value) {
        this.shrdBrkrgAmt = value;
    }

    /**
     * Gets the value of the mktMmbFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getMktMmbFeeAmt() {
        return mktMmbFeeAmt;
    }

    /**
     * Sets the value of the mktMmbFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setMktMmbFeeAmt(AmountAndDirection29 value) {
        this.mktMmbFeeAmt = value;
    }

    /**
     * Gets the value of the rmnrtnAmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRmnrtnAmtReq() {
        return rmnrtnAmtReq;
    }

    /**
     * Sets the value of the rmnrtnAmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRmnrtnAmtReq(Boolean value) {
        this.rmnrtnAmtReq = value;
    }

    /**
     * Gets the value of the rmnrtnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRmnrtnAmt() {
        return rmnrtnAmt;
    }

    /**
     * Sets the value of the rmnrtnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setRmnrtnAmt(AmountAndDirection29 value) {
        this.rmnrtnAmt = value;
    }

    /**
     * Gets the value of the brrwgIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getBrrwgIntrstAmt() {
        return brrwgIntrstAmt;
    }

    /**
     * Sets the value of the brrwgIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setBrrwgIntrstAmt(AmountAndDirection29 value) {
        this.brrwgIntrstAmt = value;
    }

    /**
     * Gets the value of the brrwgFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getBrrwgFee() {
        return brrwgFee;
    }

    /**
     * Sets the value of the brrwgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setBrrwgFee(AmountAndDirection29 value) {
        this.brrwgFee = value;
    }

    /**
     * Gets the value of the netMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getNetMktVal() {
        return netMktVal;
    }

    /**
     * Sets the value of the netMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setNetMktVal(AmountAndDirection29 value) {
        this.netMktVal = value;
    }

    /**
     * Gets the value of the rmngFaceVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRmngFaceVal() {
        return rmngFaceVal;
    }

    /**
     * Sets the value of the rmngFaceVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setRmngFaceVal(AmountAndDirection29 value) {
        this.rmngFaceVal = value;
    }

    /**
     * Gets the value of the rmngBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRmngBookVal() {
        return rmngBookVal;
    }

    /**
     * Sets the value of the rmngBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setRmngBookVal(AmountAndDirection29 value) {
        this.rmngBookVal = value;
    }

    /**
     * Gets the value of the clrBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getClrBrkrComssn() {
        return clrBrkrComssn;
    }

    /**
     * Sets the value of the clrBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setClrBrkrComssn(AmountAndDirection29 value) {
        this.clrBrkrComssn = value;
    }

    /**
     * Gets the value of the diffInPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getDiffInPric() {
        return diffInPric;
    }

    /**
     * Sets the value of the diffInPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setDiffInPric(AmountAndDirection29 value) {
        this.diffInPric = value;
    }

    /**
     * Gets the value of the oddLotFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOddLotFee() {
        return oddLotFee;
    }

    /**
     * Sets the value of the oddLotFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOddLotFee(Boolean value) {
        this.oddLotFee = value;
    }

}
