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

package org.jpos.iso20022.seev_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionAmounts1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionAmounts1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrssCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IsseDscntAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SlctnFees" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshInLieuOfShr" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OrgnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CptlGn" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IndmntyAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RedPrmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ManfctrdDvddAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrncplOrCrps" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RinvstmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktClmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FullyFrnkdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UfrnkdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SndryOrOthrAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SpclCncssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EntitldAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshIncntiv" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AddtlSbcptCost" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxFreeAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxDfrrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrmnLclTax1Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrmnLclTax2Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrmnLclTax3Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrmnLclTax4Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StockXchgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TrfTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TxTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValAddedTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EURtntnTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="LclTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PmtLevyTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CtryNtlFdrlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StmpDtyAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxRclmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxCdtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="WhldgOfFrgnTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="WhldgOfLclTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AddtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="WhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FsclStmpAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ExctgBrkrAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PngAgtComssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="LclBrkrComssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PstgFeeAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RgltryFeesAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ShppgFeesAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ChrgsAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAmounts1", propOrder = {
    "grssCshAmt",
    "netCshAmt",
    "isseDscntAmt",
    "slctnFees",
    "cshInLieuOfShr",
    "orgnlAmt",
    "cptlGn",
    "intrstAmt",
    "indmntyAmt",
    "redPrmAmt",
    "manfctrdDvddAmt",
    "prncplOrCrps",
    "rinvstmtAmt",
    "mktClmAmt",
    "fullyFrnkdAmt",
    "ufrnkdAmt",
    "sndryOrOthrAmt",
    "spclCncssnAmt",
    "entitldAmt",
    "cshIncntiv",
    "addtlSbcptCost",
    "taxFreeAmt",
    "taxDfrrdAmt",
    "grmnLclTax1Amt",
    "grmnLclTax2Amt",
    "grmnLclTax3Amt",
    "grmnLclTax4Amt",
    "stockXchgTaxAmt",
    "trfTaxAmt",
    "txTaxAmt",
    "valAddedTaxAmt",
    "euRtntnTaxAmt",
    "lclTaxAmt",
    "pmtLevyTaxAmt",
    "ctryNtlFdrlTaxAmt",
    "stmpDtyAmt",
    "taxRclmAmt",
    "taxCdtAmt",
    "whldgOfFrgnTaxAmt",
    "whldgOfLclTaxAmt",
    "addtlTaxAmt",
    "whldgTaxAmt",
    "fsclStmpAmt",
    "exctgBrkrAmt",
    "pngAgtComssnAmt",
    "lclBrkrComssnAmt",
    "pstgFeeAmt",
    "rgltryFeesAmt",
    "shppgFeesAmt",
    "chrgsAmt"
})
public class CorporateActionAmounts1 {

    @XmlElement(name = "GrssCshAmt")
    protected ActiveCurrencyAndAmount grssCshAmt;
    @XmlElement(name = "NetCshAmt")
    protected ActiveCurrencyAndAmount netCshAmt;
    @XmlElement(name = "IsseDscntAmt")
    protected ActiveCurrencyAndAmount isseDscntAmt;
    @XmlElement(name = "SlctnFees")
    protected ActiveCurrencyAndAmount slctnFees;
    @XmlElement(name = "CshInLieuOfShr")
    protected ActiveCurrencyAndAmount cshInLieuOfShr;
    @XmlElement(name = "OrgnlAmt")
    protected ActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "CptlGn")
    protected ActiveCurrencyAndAmount cptlGn;
    @XmlElement(name = "IntrstAmt")
    protected ActiveCurrencyAndAmount intrstAmt;
    @XmlElement(name = "IndmntyAmt")
    protected ActiveCurrencyAndAmount indmntyAmt;
    @XmlElement(name = "RedPrmAmt")
    protected ActiveCurrencyAndAmount redPrmAmt;
    @XmlElement(name = "ManfctrdDvddAmt")
    protected ActiveCurrencyAndAmount manfctrdDvddAmt;
    @XmlElement(name = "PrncplOrCrps")
    protected ActiveCurrencyAndAmount prncplOrCrps;
    @XmlElement(name = "RinvstmtAmt")
    protected ActiveCurrencyAndAmount rinvstmtAmt;
    @XmlElement(name = "MktClmAmt")
    protected ActiveCurrencyAndAmount mktClmAmt;
    @XmlElement(name = "FullyFrnkdAmt")
    protected ActiveCurrencyAndAmount fullyFrnkdAmt;
    @XmlElement(name = "UfrnkdAmt")
    protected ActiveCurrencyAndAmount ufrnkdAmt;
    @XmlElement(name = "SndryOrOthrAmt")
    protected ActiveCurrencyAndAmount sndryOrOthrAmt;
    @XmlElement(name = "SpclCncssnAmt")
    protected ActiveCurrencyAndAmount spclCncssnAmt;
    @XmlElement(name = "EntitldAmt")
    protected ActiveCurrencyAndAmount entitldAmt;
    @XmlElement(name = "CshIncntiv")
    protected ActiveCurrencyAndAmount cshIncntiv;
    @XmlElement(name = "AddtlSbcptCost")
    protected ActiveCurrencyAndAmount addtlSbcptCost;
    @XmlElement(name = "TaxFreeAmt")
    protected ActiveCurrencyAndAmount taxFreeAmt;
    @XmlElement(name = "TaxDfrrdAmt")
    protected ActiveCurrencyAndAmount taxDfrrdAmt;
    @XmlElement(name = "GrmnLclTax1Amt")
    protected ActiveCurrencyAndAmount grmnLclTax1Amt;
    @XmlElement(name = "GrmnLclTax2Amt")
    protected ActiveCurrencyAndAmount grmnLclTax2Amt;
    @XmlElement(name = "GrmnLclTax3Amt")
    protected ActiveCurrencyAndAmount grmnLclTax3Amt;
    @XmlElement(name = "GrmnLclTax4Amt")
    protected ActiveCurrencyAndAmount grmnLclTax4Amt;
    @XmlElement(name = "StockXchgTaxAmt")
    protected ActiveCurrencyAndAmount stockXchgTaxAmt;
    @XmlElement(name = "TrfTaxAmt")
    protected ActiveCurrencyAndAmount trfTaxAmt;
    @XmlElement(name = "TxTaxAmt")
    protected ActiveCurrencyAndAmount txTaxAmt;
    @XmlElement(name = "ValAddedTaxAmt")
    protected ActiveCurrencyAndAmount valAddedTaxAmt;
    @XmlElement(name = "EURtntnTaxAmt")
    protected ActiveCurrencyAndAmount euRtntnTaxAmt;
    @XmlElement(name = "LclTaxAmt")
    protected ActiveCurrencyAndAmount lclTaxAmt;
    @XmlElement(name = "PmtLevyTaxAmt")
    protected ActiveCurrencyAndAmount pmtLevyTaxAmt;
    @XmlElement(name = "CtryNtlFdrlTaxAmt")
    protected ActiveCurrencyAndAmount ctryNtlFdrlTaxAmt;
    @XmlElement(name = "StmpDtyAmt")
    protected ActiveCurrencyAndAmount stmpDtyAmt;
    @XmlElement(name = "TaxRclmAmt")
    protected ActiveCurrencyAndAmount taxRclmAmt;
    @XmlElement(name = "TaxCdtAmt")
    protected ActiveCurrencyAndAmount taxCdtAmt;
    @XmlElement(name = "WhldgOfFrgnTaxAmt")
    protected ActiveCurrencyAndAmount whldgOfFrgnTaxAmt;
    @XmlElement(name = "WhldgOfLclTaxAmt")
    protected ActiveCurrencyAndAmount whldgOfLclTaxAmt;
    @XmlElement(name = "AddtlTaxAmt")
    protected ActiveCurrencyAndAmount addtlTaxAmt;
    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "FsclStmpAmt")
    protected ActiveCurrencyAndAmount fsclStmpAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected ActiveCurrencyAndAmount exctgBrkrAmt;
    @XmlElement(name = "PngAgtComssnAmt")
    protected ActiveCurrencyAndAmount pngAgtComssnAmt;
    @XmlElement(name = "LclBrkrComssnAmt")
    protected ActiveCurrencyAndAmount lclBrkrComssnAmt;
    @XmlElement(name = "PstgFeeAmt")
    protected ActiveCurrencyAndAmount pstgFeeAmt;
    @XmlElement(name = "RgltryFeesAmt")
    protected ActiveCurrencyAndAmount rgltryFeesAmt;
    @XmlElement(name = "ShppgFeesAmt")
    protected ActiveCurrencyAndAmount shppgFeesAmt;
    @XmlElement(name = "ChrgsAmt")
    protected ActiveCurrencyAndAmount chrgsAmt;

    /**
     * Gets the value of the grssCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssCshAmt() {
        return grssCshAmt;
    }

    /**
     * Sets the value of the grssCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssCshAmt(ActiveCurrencyAndAmount value) {
        this.grssCshAmt = value;
    }

    /**
     * Gets the value of the netCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetCshAmt() {
        return netCshAmt;
    }

    /**
     * Sets the value of the netCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetCshAmt(ActiveCurrencyAndAmount value) {
        this.netCshAmt = value;
    }

    /**
     * Gets the value of the isseDscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIsseDscntAmt() {
        return isseDscntAmt;
    }

    /**
     * Sets the value of the isseDscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIsseDscntAmt(ActiveCurrencyAndAmount value) {
        this.isseDscntAmt = value;
    }

    /**
     * Gets the value of the slctnFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSlctnFees() {
        return slctnFees;
    }

    /**
     * Sets the value of the slctnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSlctnFees(ActiveCurrencyAndAmount value) {
        this.slctnFees = value;
    }

    /**
     * Gets the value of the cshInLieuOfShr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshInLieuOfShr() {
        return cshInLieuOfShr;
    }

    /**
     * Sets the value of the cshInLieuOfShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshInLieuOfShr(ActiveCurrencyAndAmount value) {
        this.cshInLieuOfShr = value;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOrgnlAmt(ActiveCurrencyAndAmount value) {
        this.orgnlAmt = value;
    }

    /**
     * Gets the value of the cptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCptlGn() {
        return cptlGn;
    }

    /**
     * Sets the value of the cptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCptlGn(ActiveCurrencyAndAmount value) {
        this.cptlGn = value;
    }

    /**
     * Gets the value of the intrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrstAmt() {
        return intrstAmt;
    }

    /**
     * Sets the value of the intrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntrstAmt(ActiveCurrencyAndAmount value) {
        this.intrstAmt = value;
    }

    /**
     * Gets the value of the indmntyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIndmntyAmt() {
        return indmntyAmt;
    }

    /**
     * Sets the value of the indmntyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIndmntyAmt(ActiveCurrencyAndAmount value) {
        this.indmntyAmt = value;
    }

    /**
     * Gets the value of the redPrmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRedPrmAmt() {
        return redPrmAmt;
    }

    /**
     * Sets the value of the redPrmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRedPrmAmt(ActiveCurrencyAndAmount value) {
        this.redPrmAmt = value;
    }

    /**
     * Gets the value of the manfctrdDvddAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getManfctrdDvddAmt() {
        return manfctrdDvddAmt;
    }

    /**
     * Sets the value of the manfctrdDvddAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setManfctrdDvddAmt(ActiveCurrencyAndAmount value) {
        this.manfctrdDvddAmt = value;
    }

    /**
     * Gets the value of the prncplOrCrps property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrncplOrCrps() {
        return prncplOrCrps;
    }

    /**
     * Sets the value of the prncplOrCrps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrncplOrCrps(ActiveCurrencyAndAmount value) {
        this.prncplOrCrps = value;
    }

    /**
     * Gets the value of the rinvstmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRinvstmtAmt() {
        return rinvstmtAmt;
    }

    /**
     * Sets the value of the rinvstmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRinvstmtAmt(ActiveCurrencyAndAmount value) {
        this.rinvstmtAmt = value;
    }

    /**
     * Gets the value of the mktClmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktClmAmt() {
        return mktClmAmt;
    }

    /**
     * Sets the value of the mktClmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMktClmAmt(ActiveCurrencyAndAmount value) {
        this.mktClmAmt = value;
    }

    /**
     * Gets the value of the fullyFrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFullyFrnkdAmt() {
        return fullyFrnkdAmt;
    }

    /**
     * Sets the value of the fullyFrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setFullyFrnkdAmt(ActiveCurrencyAndAmount value) {
        this.fullyFrnkdAmt = value;
    }

    /**
     * Gets the value of the ufrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUfrnkdAmt() {
        return ufrnkdAmt;
    }

    /**
     * Sets the value of the ufrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setUfrnkdAmt(ActiveCurrencyAndAmount value) {
        this.ufrnkdAmt = value;
    }

    /**
     * Gets the value of the sndryOrOthrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSndryOrOthrAmt() {
        return sndryOrOthrAmt;
    }

    /**
     * Sets the value of the sndryOrOthrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSndryOrOthrAmt(ActiveCurrencyAndAmount value) {
        this.sndryOrOthrAmt = value;
    }

    /**
     * Gets the value of the spclCncssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSpclCncssnAmt() {
        return spclCncssnAmt;
    }

    /**
     * Sets the value of the spclCncssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSpclCncssnAmt(ActiveCurrencyAndAmount value) {
        this.spclCncssnAmt = value;
    }

    /**
     * Gets the value of the entitldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEntitldAmt() {
        return entitldAmt;
    }

    /**
     * Sets the value of the entitldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setEntitldAmt(ActiveCurrencyAndAmount value) {
        this.entitldAmt = value;
    }

    /**
     * Gets the value of the cshIncntiv property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshIncntiv() {
        return cshIncntiv;
    }

    /**
     * Sets the value of the cshIncntiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshIncntiv(ActiveCurrencyAndAmount value) {
        this.cshIncntiv = value;
    }

    /**
     * Gets the value of the addtlSbcptCost property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAddtlSbcptCost() {
        return addtlSbcptCost;
    }

    /**
     * Sets the value of the addtlSbcptCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAddtlSbcptCost(ActiveCurrencyAndAmount value) {
        this.addtlSbcptCost = value;
    }

    /**
     * Gets the value of the taxFreeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxFreeAmt() {
        return taxFreeAmt;
    }

    /**
     * Sets the value of the taxFreeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxFreeAmt(ActiveCurrencyAndAmount value) {
        this.taxFreeAmt = value;
    }

    /**
     * Gets the value of the taxDfrrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxDfrrdAmt() {
        return taxDfrrdAmt;
    }

    /**
     * Sets the value of the taxDfrrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxDfrrdAmt(ActiveCurrencyAndAmount value) {
        this.taxDfrrdAmt = value;
    }

    /**
     * Gets the value of the grmnLclTax1Amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrmnLclTax1Amt() {
        return grmnLclTax1Amt;
    }

    /**
     * Sets the value of the grmnLclTax1Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrmnLclTax1Amt(ActiveCurrencyAndAmount value) {
        this.grmnLclTax1Amt = value;
    }

    /**
     * Gets the value of the grmnLclTax2Amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrmnLclTax2Amt() {
        return grmnLclTax2Amt;
    }

    /**
     * Sets the value of the grmnLclTax2Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrmnLclTax2Amt(ActiveCurrencyAndAmount value) {
        this.grmnLclTax2Amt = value;
    }

    /**
     * Gets the value of the grmnLclTax3Amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrmnLclTax3Amt() {
        return grmnLclTax3Amt;
    }

    /**
     * Sets the value of the grmnLclTax3Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrmnLclTax3Amt(ActiveCurrencyAndAmount value) {
        this.grmnLclTax3Amt = value;
    }

    /**
     * Gets the value of the grmnLclTax4Amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrmnLclTax4Amt() {
        return grmnLclTax4Amt;
    }

    /**
     * Sets the value of the grmnLclTax4Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrmnLclTax4Amt(ActiveCurrencyAndAmount value) {
        this.grmnLclTax4Amt = value;
    }

    /**
     * Gets the value of the stockXchgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStockXchgTaxAmt() {
        return stockXchgTaxAmt;
    }

    /**
     * Sets the value of the stockXchgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStockXchgTaxAmt(ActiveCurrencyAndAmount value) {
        this.stockXchgTaxAmt = value;
    }

    /**
     * Gets the value of the trfTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTrfTaxAmt() {
        return trfTaxAmt;
    }

    /**
     * Sets the value of the trfTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTrfTaxAmt(ActiveCurrencyAndAmount value) {
        this.trfTaxAmt = value;
    }

    /**
     * Gets the value of the txTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxTaxAmt() {
        return txTaxAmt;
    }

    /**
     * Sets the value of the txTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTxTaxAmt(ActiveCurrencyAndAmount value) {
        this.txTaxAmt = value;
    }

    /**
     * Gets the value of the valAddedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getValAddedTaxAmt() {
        return valAddedTaxAmt;
    }

    /**
     * Sets the value of the valAddedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setValAddedTaxAmt(ActiveCurrencyAndAmount value) {
        this.valAddedTaxAmt = value;
    }

    /**
     * Gets the value of the euRtntnTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEURtntnTaxAmt() {
        return euRtntnTaxAmt;
    }

    /**
     * Sets the value of the euRtntnTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setEURtntnTaxAmt(ActiveCurrencyAndAmount value) {
        this.euRtntnTaxAmt = value;
    }

    /**
     * Gets the value of the lclTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLclTaxAmt() {
        return lclTaxAmt;
    }

    /**
     * Sets the value of the lclTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setLclTaxAmt(ActiveCurrencyAndAmount value) {
        this.lclTaxAmt = value;
    }

    /**
     * Gets the value of the pmtLevyTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPmtLevyTaxAmt() {
        return pmtLevyTaxAmt;
    }

    /**
     * Sets the value of the pmtLevyTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPmtLevyTaxAmt(ActiveCurrencyAndAmount value) {
        this.pmtLevyTaxAmt = value;
    }

    /**
     * Gets the value of the ctryNtlFdrlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCtryNtlFdrlTaxAmt() {
        return ctryNtlFdrlTaxAmt;
    }

    /**
     * Sets the value of the ctryNtlFdrlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCtryNtlFdrlTaxAmt(ActiveCurrencyAndAmount value) {
        this.ctryNtlFdrlTaxAmt = value;
    }

    /**
     * Gets the value of the stmpDtyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStmpDtyAmt() {
        return stmpDtyAmt;
    }

    /**
     * Sets the value of the stmpDtyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStmpDtyAmt(ActiveCurrencyAndAmount value) {
        this.stmpDtyAmt = value;
    }

    /**
     * Gets the value of the taxRclmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxRclmAmt() {
        return taxRclmAmt;
    }

    /**
     * Sets the value of the taxRclmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxRclmAmt(ActiveCurrencyAndAmount value) {
        this.taxRclmAmt = value;
    }

    /**
     * Gets the value of the taxCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxCdtAmt() {
        return taxCdtAmt;
    }

    /**
     * Sets the value of the taxCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxCdtAmt(ActiveCurrencyAndAmount value) {
        this.taxCdtAmt = value;
    }

    /**
     * Gets the value of the whldgOfFrgnTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgOfFrgnTaxAmt() {
        return whldgOfFrgnTaxAmt;
    }

    /**
     * Sets the value of the whldgOfFrgnTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgOfFrgnTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgOfFrgnTaxAmt = value;
    }

    /**
     * Gets the value of the whldgOfLclTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgOfLclTaxAmt() {
        return whldgOfLclTaxAmt;
    }

    /**
     * Sets the value of the whldgOfLclTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgOfLclTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgOfLclTaxAmt = value;
    }

    /**
     * Gets the value of the addtlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAddtlTaxAmt() {
        return addtlTaxAmt;
    }

    /**
     * Sets the value of the addtlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAddtlTaxAmt(ActiveCurrencyAndAmount value) {
        this.addtlTaxAmt = value;
    }

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
    }

    /**
     * Gets the value of the fsclStmpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFsclStmpAmt() {
        return fsclStmpAmt;
    }

    /**
     * Sets the value of the fsclStmpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setFsclStmpAmt(ActiveCurrencyAndAmount value) {
        this.fsclStmpAmt = value;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setExctgBrkrAmt(ActiveCurrencyAndAmount value) {
        this.exctgBrkrAmt = value;
    }

    /**
     * Gets the value of the pngAgtComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPngAgtComssnAmt() {
        return pngAgtComssnAmt;
    }

    /**
     * Sets the value of the pngAgtComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPngAgtComssnAmt(ActiveCurrencyAndAmount value) {
        this.pngAgtComssnAmt = value;
    }

    /**
     * Gets the value of the lclBrkrComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLclBrkrComssnAmt() {
        return lclBrkrComssnAmt;
    }

    /**
     * Sets the value of the lclBrkrComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setLclBrkrComssnAmt(ActiveCurrencyAndAmount value) {
        this.lclBrkrComssnAmt = value;
    }

    /**
     * Gets the value of the pstgFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPstgFeeAmt() {
        return pstgFeeAmt;
    }

    /**
     * Sets the value of the pstgFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPstgFeeAmt(ActiveCurrencyAndAmount value) {
        this.pstgFeeAmt = value;
    }

    /**
     * Gets the value of the rgltryFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRgltryFeesAmt() {
        return rgltryFeesAmt;
    }

    /**
     * Sets the value of the rgltryFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRgltryFeesAmt(ActiveCurrencyAndAmount value) {
        this.rgltryFeesAmt = value;
    }

    /**
     * Gets the value of the shppgFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getShppgFeesAmt() {
        return shppgFeesAmt;
    }

    /**
     * Sets the value of the shppgFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setShppgFeesAmt(ActiveCurrencyAndAmount value) {
        this.shppgFeesAmt = value;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setChrgsAmt(ActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
    }

}
