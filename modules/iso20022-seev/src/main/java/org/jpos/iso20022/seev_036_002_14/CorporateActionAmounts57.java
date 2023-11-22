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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionAmounts57 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionAmounts57">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PstngAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount"/>
 *         <element name="GrssCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SlctnFees" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshInLieuOfShr" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CptlGn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktClmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IndmntyAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ManfctrdDvddPmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RinvstmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FullyFrnkdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UfrnkdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SndryOrOthrAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxFreeAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxDfrrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValAddedTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StmpDtyAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxRclmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxCdtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AddtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="WhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ScndLvlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FsclStmpAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ExctgBrkrAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PngAgtComssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="LclBrkrComssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RgltryFeesAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ShppgFeesAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ChrgsAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshAmtBrghtFwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshAmtCrrdFwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NtnlDvddPyblAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NtnlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxArrearsAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OrgnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrncplOrCrps" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RedPrmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IncmPrtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StockXchgTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EUTaxRtntnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EqulstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FATCATaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NRATaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="BckUpWhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxOnIncmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TxTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FrgnIncmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdDvddAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdFndAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdRyltsAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AdjstdSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RfnddSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAmounts57", propOrder = {
    "pstngAmt",
    "grssCshAmt",
    "netCshAmt",
    "slctnFees",
    "cshInLieuOfShr",
    "cptlGn",
    "intrstAmt",
    "mktClmAmt",
    "indmntyAmt",
    "manfctrdDvddPmtAmt",
    "rinvstmtAmt",
    "fullyFrnkdAmt",
    "ufrnkdAmt",
    "sndryOrOthrAmt",
    "taxFreeAmt",
    "taxDfrrdAmt",
    "valAddedTaxAmt",
    "stmpDtyAmt",
    "taxRclmAmt",
    "taxCdtAmt",
    "addtlTaxAmt",
    "whldgTaxAmt",
    "scndLvlTaxAmt",
    "fsclStmpAmt",
    "exctgBrkrAmt",
    "pngAgtComssnAmt",
    "lclBrkrComssnAmt",
    "rgltryFeesAmt",
    "shppgFeesAmt",
    "chrgsAmt",
    "cshAmtBrghtFwd",
    "cshAmtCrrdFwd",
    "ntnlDvddPyblAmt",
    "ntnlTaxAmt",
    "taxArrearsAmt",
    "orgnlAmt",
    "prncplOrCrps",
    "redPrmAmt",
    "incmPrtn",
    "stockXchgTax",
    "euTaxRtntnAmt",
    "acrdIntrstAmt",
    "equlstnAmt",
    "fatcaTaxAmt",
    "nraTaxAmt",
    "bckUpWhldgTaxAmt",
    "taxOnIncmAmt",
    "txTax",
    "dmdAmt",
    "frgnIncmAmt",
    "dmdDvddAmt",
    "dmdFndAmt",
    "dmdIntrstAmt",
    "dmdRyltsAmt",
    "adjstdSbcptAmt",
    "rfnddSbcptAmt"
})
public class CorporateActionAmounts57 {

    @XmlElement(name = "PstngAmt", required = true)
    protected RestrictedFINActiveCurrencyAndAmount pstngAmt;
    @XmlElement(name = "GrssCshAmt")
    protected RestrictedFINActiveCurrencyAndAmount grssCshAmt;
    @XmlElement(name = "NetCshAmt")
    protected RestrictedFINActiveCurrencyAndAmount netCshAmt;
    @XmlElement(name = "SlctnFees")
    protected RestrictedFINActiveCurrencyAndAmount slctnFees;
    @XmlElement(name = "CshInLieuOfShr")
    protected RestrictedFINActiveCurrencyAndAmount cshInLieuOfShr;
    @XmlElement(name = "CptlGn")
    protected RestrictedFINActiveCurrencyAndAmount cptlGn;
    @XmlElement(name = "IntrstAmt")
    protected RestrictedFINActiveCurrencyAndAmount intrstAmt;
    @XmlElement(name = "MktClmAmt")
    protected RestrictedFINActiveCurrencyAndAmount mktClmAmt;
    @XmlElement(name = "IndmntyAmt")
    protected RestrictedFINActiveCurrencyAndAmount indmntyAmt;
    @XmlElement(name = "ManfctrdDvddPmtAmt")
    protected RestrictedFINActiveCurrencyAndAmount manfctrdDvddPmtAmt;
    @XmlElement(name = "RinvstmtAmt")
    protected RestrictedFINActiveCurrencyAndAmount rinvstmtAmt;
    @XmlElement(name = "FullyFrnkdAmt")
    protected RestrictedFINActiveCurrencyAndAmount fullyFrnkdAmt;
    @XmlElement(name = "UfrnkdAmt")
    protected RestrictedFINActiveCurrencyAndAmount ufrnkdAmt;
    @XmlElement(name = "SndryOrOthrAmt")
    protected RestrictedFINActiveCurrencyAndAmount sndryOrOthrAmt;
    @XmlElement(name = "TaxFreeAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxFreeAmt;
    @XmlElement(name = "TaxDfrrdAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxDfrrdAmt;
    @XmlElement(name = "ValAddedTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount valAddedTaxAmt;
    @XmlElement(name = "StmpDtyAmt")
    protected RestrictedFINActiveCurrencyAndAmount stmpDtyAmt;
    @XmlElement(name = "TaxRclmAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxRclmAmt;
    @XmlElement(name = "TaxCdtAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxCdtAmt;
    @XmlElement(name = "AddtlTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount addtlTaxAmt;
    @XmlElement(name = "WhldgTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "ScndLvlTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount scndLvlTaxAmt;
    @XmlElement(name = "FsclStmpAmt")
    protected RestrictedFINActiveCurrencyAndAmount fsclStmpAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected RestrictedFINActiveCurrencyAndAmount exctgBrkrAmt;
    @XmlElement(name = "PngAgtComssnAmt")
    protected RestrictedFINActiveCurrencyAndAmount pngAgtComssnAmt;
    @XmlElement(name = "LclBrkrComssnAmt")
    protected RestrictedFINActiveCurrencyAndAmount lclBrkrComssnAmt;
    @XmlElement(name = "RgltryFeesAmt")
    protected RestrictedFINActiveCurrencyAndAmount rgltryFeesAmt;
    @XmlElement(name = "ShppgFeesAmt")
    protected RestrictedFINActiveCurrencyAndAmount shppgFeesAmt;
    @XmlElement(name = "ChrgsAmt")
    protected RestrictedFINActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "CshAmtBrghtFwd")
    protected RestrictedFINActiveCurrencyAndAmount cshAmtBrghtFwd;
    @XmlElement(name = "CshAmtCrrdFwd")
    protected RestrictedFINActiveCurrencyAndAmount cshAmtCrrdFwd;
    @XmlElement(name = "NtnlDvddPyblAmt")
    protected RestrictedFINActiveCurrencyAndAmount ntnlDvddPyblAmt;
    @XmlElement(name = "NtnlTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount ntnlTaxAmt;
    @XmlElement(name = "TaxArrearsAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxArrearsAmt;
    @XmlElement(name = "OrgnlAmt")
    protected RestrictedFINActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "PrncplOrCrps")
    protected RestrictedFINActiveCurrencyAndAmount prncplOrCrps;
    @XmlElement(name = "RedPrmAmt")
    protected RestrictedFINActiveCurrencyAndAmount redPrmAmt;
    @XmlElement(name = "IncmPrtn")
    protected RestrictedFINActiveCurrencyAndAmount incmPrtn;
    @XmlElement(name = "StockXchgTax")
    protected RestrictedFINActiveCurrencyAndAmount stockXchgTax;
    @XmlElement(name = "EUTaxRtntnAmt")
    protected RestrictedFINActiveCurrencyAndAmount euTaxRtntnAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected RestrictedFINActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "EqulstnAmt")
    protected RestrictedFINActiveCurrencyAndAmount equlstnAmt;
    @XmlElement(name = "FATCATaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount fatcaTaxAmt;
    @XmlElement(name = "NRATaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount nraTaxAmt;
    @XmlElement(name = "BckUpWhldgTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount bckUpWhldgTaxAmt;
    @XmlElement(name = "TaxOnIncmAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxOnIncmAmt;
    @XmlElement(name = "TxTax")
    protected RestrictedFINActiveCurrencyAndAmount txTax;
    @XmlElement(name = "DmdAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdAmt;
    @XmlElement(name = "FrgnIncmAmt")
    protected RestrictedFINActiveCurrencyAndAmount frgnIncmAmt;
    @XmlElement(name = "DmdDvddAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdDvddAmt;
    @XmlElement(name = "DmdFndAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdFndAmt;
    @XmlElement(name = "DmdIntrstAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdIntrstAmt;
    @XmlElement(name = "DmdRyltsAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdRyltsAmt;
    @XmlElement(name = "AdjstdSbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount adjstdSbcptAmt;
    @XmlElement(name = "RfnddSbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount rfnddSbcptAmt;

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setPstngAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.pstngAmt = value;
    }

    /**
     * Gets the value of the grssCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getGrssCshAmt() {
        return grssCshAmt;
    }

    /**
     * Sets the value of the grssCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setGrssCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.grssCshAmt = value;
    }

    /**
     * Gets the value of the netCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNetCshAmt() {
        return netCshAmt;
    }

    /**
     * Sets the value of the netCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setNetCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.netCshAmt = value;
    }

    /**
     * Gets the value of the slctnFees property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getSlctnFees() {
        return slctnFees;
    }

    /**
     * Sets the value of the slctnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setSlctnFees(RestrictedFINActiveCurrencyAndAmount value) {
        this.slctnFees = value;
    }

    /**
     * Gets the value of the cshInLieuOfShr property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCshInLieuOfShr() {
        return cshInLieuOfShr;
    }

    /**
     * Sets the value of the cshInLieuOfShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setCshInLieuOfShr(RestrictedFINActiveCurrencyAndAmount value) {
        this.cshInLieuOfShr = value;
    }

    /**
     * Gets the value of the cptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCptlGn() {
        return cptlGn;
    }

    /**
     * Sets the value of the cptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setCptlGn(RestrictedFINActiveCurrencyAndAmount value) {
        this.cptlGn = value;
    }

    /**
     * Gets the value of the intrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getIntrstAmt() {
        return intrstAmt;
    }

    /**
     * Sets the value of the intrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.intrstAmt = value;
    }

    /**
     * Gets the value of the mktClmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getMktClmAmt() {
        return mktClmAmt;
    }

    /**
     * Sets the value of the mktClmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setMktClmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.mktClmAmt = value;
    }

    /**
     * Gets the value of the indmntyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getIndmntyAmt() {
        return indmntyAmt;
    }

    /**
     * Sets the value of the indmntyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setIndmntyAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.indmntyAmt = value;
    }

    /**
     * Gets the value of the manfctrdDvddPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getManfctrdDvddPmtAmt() {
        return manfctrdDvddPmtAmt;
    }

    /**
     * Sets the value of the manfctrdDvddPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setManfctrdDvddPmtAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.manfctrdDvddPmtAmt = value;
    }

    /**
     * Gets the value of the rinvstmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRinvstmtAmt() {
        return rinvstmtAmt;
    }

    /**
     * Sets the value of the rinvstmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setRinvstmtAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rinvstmtAmt = value;
    }

    /**
     * Gets the value of the fullyFrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFullyFrnkdAmt() {
        return fullyFrnkdAmt;
    }

    /**
     * Sets the value of the fullyFrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setFullyFrnkdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.fullyFrnkdAmt = value;
    }

    /**
     * Gets the value of the ufrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getUfrnkdAmt() {
        return ufrnkdAmt;
    }

    /**
     * Sets the value of the ufrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setUfrnkdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ufrnkdAmt = value;
    }

    /**
     * Gets the value of the sndryOrOthrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getSndryOrOthrAmt() {
        return sndryOrOthrAmt;
    }

    /**
     * Sets the value of the sndryOrOthrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setSndryOrOthrAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.sndryOrOthrAmt = value;
    }

    /**
     * Gets the value of the taxFreeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxFreeAmt() {
        return taxFreeAmt;
    }

    /**
     * Sets the value of the taxFreeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setTaxFreeAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxFreeAmt = value;
    }

    /**
     * Gets the value of the taxDfrrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxDfrrdAmt() {
        return taxDfrrdAmt;
    }

    /**
     * Sets the value of the taxDfrrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setTaxDfrrdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxDfrrdAmt = value;
    }

    /**
     * Gets the value of the valAddedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getValAddedTaxAmt() {
        return valAddedTaxAmt;
    }

    /**
     * Sets the value of the valAddedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setValAddedTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.valAddedTaxAmt = value;
    }

    /**
     * Gets the value of the stmpDtyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getStmpDtyAmt() {
        return stmpDtyAmt;
    }

    /**
     * Sets the value of the stmpDtyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setStmpDtyAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.stmpDtyAmt = value;
    }

    /**
     * Gets the value of the taxRclmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxRclmAmt() {
        return taxRclmAmt;
    }

    /**
     * Sets the value of the taxRclmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setTaxRclmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxRclmAmt = value;
    }

    /**
     * Gets the value of the taxCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxCdtAmt() {
        return taxCdtAmt;
    }

    /**
     * Sets the value of the taxCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setTaxCdtAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxCdtAmt = value;
    }

    /**
     * Gets the value of the addtlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAddtlTaxAmt() {
        return addtlTaxAmt;
    }

    /**
     * Sets the value of the addtlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setAddtlTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.addtlTaxAmt = value;
    }

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
    }

    /**
     * Gets the value of the scndLvlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getScndLvlTaxAmt() {
        return scndLvlTaxAmt;
    }

    /**
     * Sets the value of the scndLvlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setScndLvlTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.scndLvlTaxAmt = value;
    }

    /**
     * Gets the value of the fsclStmpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFsclStmpAmt() {
        return fsclStmpAmt;
    }

    /**
     * Sets the value of the fsclStmpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setFsclStmpAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.fsclStmpAmt = value;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setExctgBrkrAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.exctgBrkrAmt = value;
    }

    /**
     * Gets the value of the pngAgtComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getPngAgtComssnAmt() {
        return pngAgtComssnAmt;
    }

    /**
     * Sets the value of the pngAgtComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setPngAgtComssnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.pngAgtComssnAmt = value;
    }

    /**
     * Gets the value of the lclBrkrComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getLclBrkrComssnAmt() {
        return lclBrkrComssnAmt;
    }

    /**
     * Sets the value of the lclBrkrComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setLclBrkrComssnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.lclBrkrComssnAmt = value;
    }

    /**
     * Gets the value of the rgltryFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRgltryFeesAmt() {
        return rgltryFeesAmt;
    }

    /**
     * Sets the value of the rgltryFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setRgltryFeesAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rgltryFeesAmt = value;
    }

    /**
     * Gets the value of the shppgFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getShppgFeesAmt() {
        return shppgFeesAmt;
    }

    /**
     * Sets the value of the shppgFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setShppgFeesAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.shppgFeesAmt = value;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setChrgsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
    }

    /**
     * Gets the value of the cshAmtBrghtFwd property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCshAmtBrghtFwd() {
        return cshAmtBrghtFwd;
    }

    /**
     * Sets the value of the cshAmtBrghtFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmtBrghtFwd(RestrictedFINActiveCurrencyAndAmount value) {
        this.cshAmtBrghtFwd = value;
    }

    /**
     * Gets the value of the cshAmtCrrdFwd property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCshAmtCrrdFwd() {
        return cshAmtCrrdFwd;
    }

    /**
     * Sets the value of the cshAmtCrrdFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmtCrrdFwd(RestrictedFINActiveCurrencyAndAmount value) {
        this.cshAmtCrrdFwd = value;
    }

    /**
     * Gets the value of the ntnlDvddPyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNtnlDvddPyblAmt() {
        return ntnlDvddPyblAmt;
    }

    /**
     * Sets the value of the ntnlDvddPyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setNtnlDvddPyblAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ntnlDvddPyblAmt = value;
    }

    /**
     * Gets the value of the ntnlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNtnlTaxAmt() {
        return ntnlTaxAmt;
    }

    /**
     * Sets the value of the ntnlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setNtnlTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ntnlTaxAmt = value;
    }

    /**
     * Gets the value of the taxArrearsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxArrearsAmt() {
        return taxArrearsAmt;
    }

    /**
     * Sets the value of the taxArrearsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setTaxArrearsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxArrearsAmt = value;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setOrgnlAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.orgnlAmt = value;
    }

    /**
     * Gets the value of the prncplOrCrps property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getPrncplOrCrps() {
        return prncplOrCrps;
    }

    /**
     * Sets the value of the prncplOrCrps property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setPrncplOrCrps(RestrictedFINActiveCurrencyAndAmount value) {
        this.prncplOrCrps = value;
    }

    /**
     * Gets the value of the redPrmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRedPrmAmt() {
        return redPrmAmt;
    }

    /**
     * Sets the value of the redPrmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setRedPrmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.redPrmAmt = value;
    }

    /**
     * Gets the value of the incmPrtn property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getIncmPrtn() {
        return incmPrtn;
    }

    /**
     * Sets the value of the incmPrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setIncmPrtn(RestrictedFINActiveCurrencyAndAmount value) {
        this.incmPrtn = value;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setStockXchgTax(RestrictedFINActiveCurrencyAndAmount value) {
        this.stockXchgTax = value;
    }

    /**
     * Gets the value of the euTaxRtntnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getEUTaxRtntnAmt() {
        return euTaxRtntnAmt;
    }

    /**
     * Sets the value of the euTaxRtntnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setEUTaxRtntnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.euTaxRtntnAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setAcrdIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the equlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getEqulstnAmt() {
        return equlstnAmt;
    }

    /**
     * Sets the value of the equlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setEqulstnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.equlstnAmt = value;
    }

    /**
     * Gets the value of the fatcaTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFATCATaxAmt() {
        return fatcaTaxAmt;
    }

    /**
     * Sets the value of the fatcaTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setFATCATaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.fatcaTaxAmt = value;
    }

    /**
     * Gets the value of the nraTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNRATaxAmt() {
        return nraTaxAmt;
    }

    /**
     * Sets the value of the nraTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setNRATaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.nraTaxAmt = value;
    }

    /**
     * Gets the value of the bckUpWhldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getBckUpWhldgTaxAmt() {
        return bckUpWhldgTaxAmt;
    }

    /**
     * Sets the value of the bckUpWhldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setBckUpWhldgTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.bckUpWhldgTaxAmt = value;
    }

    /**
     * Gets the value of the taxOnIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxOnIncmAmt() {
        return taxOnIncmAmt;
    }

    /**
     * Sets the value of the taxOnIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setTaxOnIncmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxOnIncmAmt = value;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setTxTax(RestrictedFINActiveCurrencyAndAmount value) {
        this.txTax = value;
    }

    /**
     * Gets the value of the dmdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdAmt() {
        return dmdAmt;
    }

    /**
     * Sets the value of the dmdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setDmdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdAmt = value;
    }

    /**
     * Gets the value of the frgnIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFrgnIncmAmt() {
        return frgnIncmAmt;
    }

    /**
     * Sets the value of the frgnIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setFrgnIncmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.frgnIncmAmt = value;
    }

    /**
     * Gets the value of the dmdDvddAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdDvddAmt() {
        return dmdDvddAmt;
    }

    /**
     * Sets the value of the dmdDvddAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setDmdDvddAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdDvddAmt = value;
    }

    /**
     * Gets the value of the dmdFndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdFndAmt() {
        return dmdFndAmt;
    }

    /**
     * Sets the value of the dmdFndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setDmdFndAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdFndAmt = value;
    }

    /**
     * Gets the value of the dmdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdIntrstAmt() {
        return dmdIntrstAmt;
    }

    /**
     * Sets the value of the dmdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setDmdIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdIntrstAmt = value;
    }

    /**
     * Gets the value of the dmdRyltsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdRyltsAmt() {
        return dmdRyltsAmt;
    }

    /**
     * Sets the value of the dmdRyltsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setDmdRyltsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdRyltsAmt = value;
    }

    /**
     * Gets the value of the adjstdSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAdjstdSbcptAmt() {
        return adjstdSbcptAmt;
    }

    /**
     * Sets the value of the adjstdSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setAdjstdSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.adjstdSbcptAmt = value;
    }

    /**
     * Gets the value of the rfnddSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRfnddSbcptAmt() {
        return rfnddSbcptAmt;
    }

    /**
     * Sets the value of the rfnddSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setRfnddSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rfnddSbcptAmt = value;
    }

}
