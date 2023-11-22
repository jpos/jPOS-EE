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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionAmounts56 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionAmounts56">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PstngAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount"/>
 *         <element name="GrssCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SlctnFees" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshInLieuOfShr" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CptlGn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktClmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IndmntyAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ManfctrdDvddPmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RinvstmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FullyFrnkdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UfrnkdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SndryOrOthrAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxFreeAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxDfrrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValAddedTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StmpDtyAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxRclmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxCdtAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AddtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="WhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ScndLvlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FsclStmpAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ExctgBrkrAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PngAgtComssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="LclBrkrComssnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RgltryFeesAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ShppgFeesAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ChrgsAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshAmtBrghtFwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshAmtCrrdFwd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NtnlDvddPyblAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NtnlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxArrearsAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OrgnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrncplOrCrps" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RedPrmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IncmPrtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StockXchgTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EUTaxRtntnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EqulstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FATCATaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NRATaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="BckUpWhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxOnIncmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TxTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FrgnIncmAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdDvddAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdFndAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DmdRyltsAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AdjstdSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RfnddSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAmounts56", propOrder = {
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
public class CorporateActionAmounts56 {

    @XmlElement(name = "PstngAmt", required = true)
    protected ActiveCurrencyAndAmount pstngAmt;
    @XmlElement(name = "GrssCshAmt")
    protected ActiveCurrencyAndAmount grssCshAmt;
    @XmlElement(name = "NetCshAmt")
    protected ActiveCurrencyAndAmount netCshAmt;
    @XmlElement(name = "SlctnFees")
    protected ActiveCurrencyAndAmount slctnFees;
    @XmlElement(name = "CshInLieuOfShr")
    protected ActiveCurrencyAndAmount cshInLieuOfShr;
    @XmlElement(name = "CptlGn")
    protected ActiveCurrencyAndAmount cptlGn;
    @XmlElement(name = "IntrstAmt")
    protected ActiveCurrencyAndAmount intrstAmt;
    @XmlElement(name = "MktClmAmt")
    protected ActiveCurrencyAndAmount mktClmAmt;
    @XmlElement(name = "IndmntyAmt")
    protected ActiveCurrencyAndAmount indmntyAmt;
    @XmlElement(name = "ManfctrdDvddPmtAmt")
    protected ActiveCurrencyAndAmount manfctrdDvddPmtAmt;
    @XmlElement(name = "RinvstmtAmt")
    protected ActiveCurrencyAndAmount rinvstmtAmt;
    @XmlElement(name = "FullyFrnkdAmt")
    protected ActiveCurrencyAndAmount fullyFrnkdAmt;
    @XmlElement(name = "UfrnkdAmt")
    protected ActiveCurrencyAndAmount ufrnkdAmt;
    @XmlElement(name = "SndryOrOthrAmt")
    protected ActiveCurrencyAndAmount sndryOrOthrAmt;
    @XmlElement(name = "TaxFreeAmt")
    protected ActiveCurrencyAndAmount taxFreeAmt;
    @XmlElement(name = "TaxDfrrdAmt")
    protected ActiveCurrencyAndAmount taxDfrrdAmt;
    @XmlElement(name = "ValAddedTaxAmt")
    protected ActiveCurrencyAndAmount valAddedTaxAmt;
    @XmlElement(name = "StmpDtyAmt")
    protected ActiveCurrencyAndAmount stmpDtyAmt;
    @XmlElement(name = "TaxRclmAmt")
    protected ActiveCurrencyAndAmount taxRclmAmt;
    @XmlElement(name = "TaxCdtAmt")
    protected ActiveCurrencyAndAmount taxCdtAmt;
    @XmlElement(name = "AddtlTaxAmt")
    protected ActiveCurrencyAndAmount addtlTaxAmt;
    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "ScndLvlTaxAmt")
    protected ActiveCurrencyAndAmount scndLvlTaxAmt;
    @XmlElement(name = "FsclStmpAmt")
    protected ActiveCurrencyAndAmount fsclStmpAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected ActiveCurrencyAndAmount exctgBrkrAmt;
    @XmlElement(name = "PngAgtComssnAmt")
    protected ActiveCurrencyAndAmount pngAgtComssnAmt;
    @XmlElement(name = "LclBrkrComssnAmt")
    protected ActiveCurrencyAndAmount lclBrkrComssnAmt;
    @XmlElement(name = "RgltryFeesAmt")
    protected ActiveCurrencyAndAmount rgltryFeesAmt;
    @XmlElement(name = "ShppgFeesAmt")
    protected ActiveCurrencyAndAmount shppgFeesAmt;
    @XmlElement(name = "ChrgsAmt")
    protected ActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "CshAmtBrghtFwd")
    protected ActiveCurrencyAndAmount cshAmtBrghtFwd;
    @XmlElement(name = "CshAmtCrrdFwd")
    protected ActiveCurrencyAndAmount cshAmtCrrdFwd;
    @XmlElement(name = "NtnlDvddPyblAmt")
    protected ActiveCurrencyAndAmount ntnlDvddPyblAmt;
    @XmlElement(name = "NtnlTaxAmt")
    protected ActiveCurrencyAndAmount ntnlTaxAmt;
    @XmlElement(name = "TaxArrearsAmt")
    protected ActiveCurrencyAndAmount taxArrearsAmt;
    @XmlElement(name = "OrgnlAmt")
    protected ActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "PrncplOrCrps")
    protected ActiveCurrencyAndAmount prncplOrCrps;
    @XmlElement(name = "RedPrmAmt")
    protected ActiveCurrencyAndAmount redPrmAmt;
    @XmlElement(name = "IncmPrtn")
    protected ActiveCurrencyAndAmount incmPrtn;
    @XmlElement(name = "StockXchgTax")
    protected ActiveCurrencyAndAmount stockXchgTax;
    @XmlElement(name = "EUTaxRtntnAmt")
    protected ActiveCurrencyAndAmount euTaxRtntnAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected ActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "EqulstnAmt")
    protected ActiveCurrencyAndAmount equlstnAmt;
    @XmlElement(name = "FATCATaxAmt")
    protected ActiveCurrencyAndAmount fatcaTaxAmt;
    @XmlElement(name = "NRATaxAmt")
    protected ActiveCurrencyAndAmount nraTaxAmt;
    @XmlElement(name = "BckUpWhldgTaxAmt")
    protected ActiveCurrencyAndAmount bckUpWhldgTaxAmt;
    @XmlElement(name = "TaxOnIncmAmt")
    protected ActiveCurrencyAndAmount taxOnIncmAmt;
    @XmlElement(name = "TxTax")
    protected ActiveCurrencyAndAmount txTax;
    @XmlElement(name = "DmdAmt")
    protected ActiveCurrencyAndAmount dmdAmt;
    @XmlElement(name = "FrgnIncmAmt")
    protected ActiveCurrencyAndAmount frgnIncmAmt;
    @XmlElement(name = "DmdDvddAmt")
    protected ActiveCurrencyAndAmount dmdDvddAmt;
    @XmlElement(name = "DmdFndAmt")
    protected ActiveCurrencyAndAmount dmdFndAmt;
    @XmlElement(name = "DmdIntrstAmt")
    protected ActiveCurrencyAndAmount dmdIntrstAmt;
    @XmlElement(name = "DmdRyltsAmt")
    protected ActiveCurrencyAndAmount dmdRyltsAmt;
    @XmlElement(name = "AdjstdSbcptAmt")
    protected ActiveCurrencyAndAmount adjstdSbcptAmt;
    @XmlElement(name = "RfnddSbcptAmt")
    protected ActiveCurrencyAndAmount rfnddSbcptAmt;

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPstngAmt(ActiveCurrencyAndAmount value) {
        this.pstngAmt = value;
    }

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
     * Gets the value of the manfctrdDvddPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getManfctrdDvddPmtAmt() {
        return manfctrdDvddPmtAmt;
    }

    /**
     * Sets the value of the manfctrdDvddPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setManfctrdDvddPmtAmt(ActiveCurrencyAndAmount value) {
        this.manfctrdDvddPmtAmt = value;
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
     * Gets the value of the scndLvlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getScndLvlTaxAmt() {
        return scndLvlTaxAmt;
    }

    /**
     * Sets the value of the scndLvlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setScndLvlTaxAmt(ActiveCurrencyAndAmount value) {
        this.scndLvlTaxAmt = value;
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

    /**
     * Gets the value of the cshAmtBrghtFwd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmtBrghtFwd() {
        return cshAmtBrghtFwd;
    }

    /**
     * Sets the value of the cshAmtBrghtFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmtBrghtFwd(ActiveCurrencyAndAmount value) {
        this.cshAmtBrghtFwd = value;
    }

    /**
     * Gets the value of the cshAmtCrrdFwd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmtCrrdFwd() {
        return cshAmtCrrdFwd;
    }

    /**
     * Sets the value of the cshAmtCrrdFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmtCrrdFwd(ActiveCurrencyAndAmount value) {
        this.cshAmtCrrdFwd = value;
    }

    /**
     * Gets the value of the ntnlDvddPyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnlDvddPyblAmt() {
        return ntnlDvddPyblAmt;
    }

    /**
     * Sets the value of the ntnlDvddPyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNtnlDvddPyblAmt(ActiveCurrencyAndAmount value) {
        this.ntnlDvddPyblAmt = value;
    }

    /**
     * Gets the value of the ntnlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnlTaxAmt() {
        return ntnlTaxAmt;
    }

    /**
     * Sets the value of the ntnlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNtnlTaxAmt(ActiveCurrencyAndAmount value) {
        this.ntnlTaxAmt = value;
    }

    /**
     * Gets the value of the taxArrearsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxArrearsAmt() {
        return taxArrearsAmt;
    }

    /**
     * Sets the value of the taxArrearsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxArrearsAmt(ActiveCurrencyAndAmount value) {
        this.taxArrearsAmt = value;
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
     * Gets the value of the incmPrtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncmPrtn() {
        return incmPrtn;
    }

    /**
     * Sets the value of the incmPrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIncmPrtn(ActiveCurrencyAndAmount value) {
        this.incmPrtn = value;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStockXchgTax(ActiveCurrencyAndAmount value) {
        this.stockXchgTax = value;
    }

    /**
     * Gets the value of the euTaxRtntnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEUTaxRtntnAmt() {
        return euTaxRtntnAmt;
    }

    /**
     * Sets the value of the euTaxRtntnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setEUTaxRtntnAmt(ActiveCurrencyAndAmount value) {
        this.euTaxRtntnAmt = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the equlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEqulstnAmt() {
        return equlstnAmt;
    }

    /**
     * Sets the value of the equlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setEqulstnAmt(ActiveCurrencyAndAmount value) {
        this.equlstnAmt = value;
    }

    /**
     * Gets the value of the fatcaTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFATCATaxAmt() {
        return fatcaTaxAmt;
    }

    /**
     * Sets the value of the fatcaTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setFATCATaxAmt(ActiveCurrencyAndAmount value) {
        this.fatcaTaxAmt = value;
    }

    /**
     * Gets the value of the nraTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNRATaxAmt() {
        return nraTaxAmt;
    }

    /**
     * Sets the value of the nraTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNRATaxAmt(ActiveCurrencyAndAmount value) {
        this.nraTaxAmt = value;
    }

    /**
     * Gets the value of the bckUpWhldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getBckUpWhldgTaxAmt() {
        return bckUpWhldgTaxAmt;
    }

    /**
     * Sets the value of the bckUpWhldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setBckUpWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.bckUpWhldgTaxAmt = value;
    }

    /**
     * Gets the value of the taxOnIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxOnIncmAmt() {
        return taxOnIncmAmt;
    }

    /**
     * Sets the value of the taxOnIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxOnIncmAmt(ActiveCurrencyAndAmount value) {
        this.taxOnIncmAmt = value;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTxTax(ActiveCurrencyAndAmount value) {
        this.txTax = value;
    }

    /**
     * Gets the value of the dmdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDmdAmt() {
        return dmdAmt;
    }

    /**
     * Sets the value of the dmdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDmdAmt(ActiveCurrencyAndAmount value) {
        this.dmdAmt = value;
    }

    /**
     * Gets the value of the frgnIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFrgnIncmAmt() {
        return frgnIncmAmt;
    }

    /**
     * Sets the value of the frgnIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setFrgnIncmAmt(ActiveCurrencyAndAmount value) {
        this.frgnIncmAmt = value;
    }

    /**
     * Gets the value of the dmdDvddAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDmdDvddAmt() {
        return dmdDvddAmt;
    }

    /**
     * Sets the value of the dmdDvddAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDmdDvddAmt(ActiveCurrencyAndAmount value) {
        this.dmdDvddAmt = value;
    }

    /**
     * Gets the value of the dmdFndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDmdFndAmt() {
        return dmdFndAmt;
    }

    /**
     * Sets the value of the dmdFndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDmdFndAmt(ActiveCurrencyAndAmount value) {
        this.dmdFndAmt = value;
    }

    /**
     * Gets the value of the dmdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDmdIntrstAmt() {
        return dmdIntrstAmt;
    }

    /**
     * Sets the value of the dmdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDmdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.dmdIntrstAmt = value;
    }

    /**
     * Gets the value of the dmdRyltsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDmdRyltsAmt() {
        return dmdRyltsAmt;
    }

    /**
     * Sets the value of the dmdRyltsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDmdRyltsAmt(ActiveCurrencyAndAmount value) {
        this.dmdRyltsAmt = value;
    }

    /**
     * Gets the value of the adjstdSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAdjstdSbcptAmt() {
        return adjstdSbcptAmt;
    }

    /**
     * Sets the value of the adjstdSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAdjstdSbcptAmt(ActiveCurrencyAndAmount value) {
        this.adjstdSbcptAmt = value;
    }

    /**
     * Gets the value of the rfnddSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRfnddSbcptAmt() {
        return rfnddSbcptAmt;
    }

    /**
     * Sets the value of the rfnddSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRfnddSbcptAmt(ActiveCurrencyAndAmount value) {
        this.rfnddSbcptAmt = value;
    }

}
