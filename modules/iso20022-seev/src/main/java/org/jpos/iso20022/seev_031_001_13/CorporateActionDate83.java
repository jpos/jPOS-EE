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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDate83 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate83">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AnncmntDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="CertfctnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="CrtApprvlDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="EarlyClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="EqulstnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="FrthrDtldAnncmntDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="FxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="LtryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="NewMtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="MtgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="MrgnFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="PrratnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="RcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="RegnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="RsltsPblctnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="DdlnToSplt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="DdlnForTaxBrkdwnInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="TradgSspdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="UcondlDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="WhlyUcondlDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="ExDvddDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="OffclAnncmntPblctnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="SpclExDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="GrntedPrtcptnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="ElctnToCtrPtyMktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="ElctnToCtrPtyRspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="LpsdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="ThrdPtyDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="EarlyThrdPtyDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="MktClmTrckgEndDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="LeadPlntffDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice" minOccurs="0"/>
 *         <element name="FilgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *         <element name="HrgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate83", propOrder = {
    "anncmntDt",
    "certfctnDdln",
    "crtApprvlDt",
    "earlyClsgDt",
    "fctvDt",
    "equlstnDt",
    "frthrDtldAnncmntDt",
    "fxgDt",
    "ltryDt",
    "newMtrtyDt",
    "mtgDt",
    "mrgnFxgDt",
    "prratnDt",
    "rcrdDt",
    "regnDdln",
    "rsltsPblctnDt",
    "ddlnToSplt",
    "ddlnForTaxBrkdwnInstr",
    "tradgSspdDt",
    "ucondlDt",
    "whlyUcondlDt",
    "exDvddDt",
    "offclAnncmntPblctnDt",
    "spclExDt",
    "grntedPrtcptnDt",
    "elctnToCtrPtyMktDdln",
    "elctnToCtrPtyRspnDdln",
    "lpsdDt",
    "pmtDt",
    "thrdPtyDdln",
    "earlyThrdPtyDdln",
    "mktClmTrckgEndDt",
    "leadPlntffDdln",
    "filgDt",
    "hrgDt"
})
public class CorporateActionDate83 {

    @XmlElement(name = "AnncmntDt")
    protected DateFormat43Choice anncmntDt;
    @XmlElement(name = "CertfctnDdln")
    protected DateFormat43Choice certfctnDdln;
    @XmlElement(name = "CrtApprvlDt")
    protected DateFormat30Choice crtApprvlDt;
    @XmlElement(name = "EarlyClsgDt")
    protected DateFormat43Choice earlyClsgDt;
    @XmlElement(name = "FctvDt")
    protected DateFormat30Choice fctvDt;
    @XmlElement(name = "EqulstnDt")
    protected DateFormat30Choice equlstnDt;
    @XmlElement(name = "FrthrDtldAnncmntDt")
    protected DateFormat43Choice frthrDtldAnncmntDt;
    @XmlElement(name = "FxgDt")
    protected DateFormat43Choice fxgDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat30Choice ltryDt;
    @XmlElement(name = "NewMtrtyDt")
    protected DateFormat30Choice newMtrtyDt;
    @XmlElement(name = "MtgDt")
    protected DateFormat43Choice mtgDt;
    @XmlElement(name = "MrgnFxgDt")
    protected DateFormat30Choice mrgnFxgDt;
    @XmlElement(name = "PrratnDt")
    protected DateFormat30Choice prratnDt;
    @XmlElement(name = "RcrdDt")
    protected DateFormat30Choice rcrdDt;
    @XmlElement(name = "RegnDdln")
    protected DateFormat43Choice regnDdln;
    @XmlElement(name = "RsltsPblctnDt")
    protected DateFormat43Choice rsltsPblctnDt;
    @XmlElement(name = "DdlnToSplt")
    protected DateFormat43Choice ddlnToSplt;
    @XmlElement(name = "DdlnForTaxBrkdwnInstr")
    protected DateFormat43Choice ddlnForTaxBrkdwnInstr;
    @XmlElement(name = "TradgSspdDt")
    protected DateFormat43Choice tradgSspdDt;
    @XmlElement(name = "UcondlDt")
    protected DateFormat30Choice ucondlDt;
    @XmlElement(name = "WhlyUcondlDt")
    protected DateFormat30Choice whlyUcondlDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat30Choice exDvddDt;
    @XmlElement(name = "OffclAnncmntPblctnDt")
    protected DateFormat43Choice offclAnncmntPblctnDt;
    @XmlElement(name = "SpclExDt")
    protected DateFormat30Choice spclExDt;
    @XmlElement(name = "GrntedPrtcptnDt")
    protected DateFormat30Choice grntedPrtcptnDt;
    @XmlElement(name = "ElctnToCtrPtyMktDdln")
    protected DateFormat43Choice elctnToCtrPtyMktDdln;
    @XmlElement(name = "ElctnToCtrPtyRspnDdln")
    protected DateFormat43Choice elctnToCtrPtyRspnDdln;
    @XmlElement(name = "LpsdDt")
    protected DateFormat30Choice lpsdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat30Choice pmtDt;
    @XmlElement(name = "ThrdPtyDdln")
    protected DateFormat43Choice thrdPtyDdln;
    @XmlElement(name = "EarlyThrdPtyDdln")
    protected DateFormat43Choice earlyThrdPtyDdln;
    @XmlElement(name = "MktClmTrckgEndDt")
    protected DateFormat30Choice mktClmTrckgEndDt;
    @XmlElement(name = "LeadPlntffDdln")
    protected DateFormat43Choice leadPlntffDdln;
    @XmlElement(name = "FilgDt")
    protected DateFormat30Choice filgDt;
    @XmlElement(name = "HrgDt")
    protected DateFormat30Choice hrgDt;

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setAnncmntDt(DateFormat43Choice value) {
        this.anncmntDt = value;
    }

    /**
     * Gets the value of the certfctnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getCertfctnDdln() {
        return certfctnDdln;
    }

    /**
     * Sets the value of the certfctnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setCertfctnDdln(DateFormat43Choice value) {
        this.certfctnDdln = value;
    }

    /**
     * Gets the value of the crtApprvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getCrtApprvlDt() {
        return crtApprvlDt;
    }

    /**
     * Sets the value of the crtApprvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setCrtApprvlDt(DateFormat30Choice value) {
        this.crtApprvlDt = value;
    }

    /**
     * Gets the value of the earlyClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEarlyClsgDt() {
        return earlyClsgDt;
    }

    /**
     * Sets the value of the earlyClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setEarlyClsgDt(DateFormat43Choice value) {
        this.earlyClsgDt = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setFctvDt(DateFormat30Choice value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the equlstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getEqulstnDt() {
        return equlstnDt;
    }

    /**
     * Sets the value of the equlstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setEqulstnDt(DateFormat30Choice value) {
        this.equlstnDt = value;
    }

    /**
     * Gets the value of the frthrDtldAnncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getFrthrDtldAnncmntDt() {
        return frthrDtldAnncmntDt;
    }

    /**
     * Sets the value of the frthrDtldAnncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setFrthrDtldAnncmntDt(DateFormat43Choice value) {
        this.frthrDtldAnncmntDt = value;
    }

    /**
     * Gets the value of the fxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getFxgDt() {
        return fxgDt;
    }

    /**
     * Sets the value of the fxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setFxgDt(DateFormat43Choice value) {
        this.fxgDt = value;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setLtryDt(DateFormat30Choice value) {
        this.ltryDt = value;
    }

    /**
     * Gets the value of the newMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getNewMtrtyDt() {
        return newMtrtyDt;
    }

    /**
     * Sets the value of the newMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setNewMtrtyDt(DateFormat30Choice value) {
        this.newMtrtyDt = value;
    }

    /**
     * Gets the value of the mtgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMtgDt() {
        return mtgDt;
    }

    /**
     * Sets the value of the mtgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setMtgDt(DateFormat43Choice value) {
        this.mtgDt = value;
    }

    /**
     * Gets the value of the mrgnFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getMrgnFxgDt() {
        return mrgnFxgDt;
    }

    /**
     * Sets the value of the mrgnFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setMrgnFxgDt(DateFormat30Choice value) {
        this.mrgnFxgDt = value;
    }

    /**
     * Gets the value of the prratnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPrratnDt() {
        return prratnDt;
    }

    /**
     * Sets the value of the prratnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setPrratnDt(DateFormat30Choice value) {
        this.prratnDt = value;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setRcrdDt(DateFormat30Choice value) {
        this.rcrdDt = value;
    }

    /**
     * Gets the value of the regnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getRegnDdln() {
        return regnDdln;
    }

    /**
     * Sets the value of the regnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setRegnDdln(DateFormat43Choice value) {
        this.regnDdln = value;
    }

    /**
     * Gets the value of the rsltsPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getRsltsPblctnDt() {
        return rsltsPblctnDt;
    }

    /**
     * Sets the value of the rsltsPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setRsltsPblctnDt(DateFormat43Choice value) {
        this.rsltsPblctnDt = value;
    }

    /**
     * Gets the value of the ddlnToSplt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getDdlnToSplt() {
        return ddlnToSplt;
    }

    /**
     * Sets the value of the ddlnToSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setDdlnToSplt(DateFormat43Choice value) {
        this.ddlnToSplt = value;
    }

    /**
     * Gets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getDdlnForTaxBrkdwnInstr() {
        return ddlnForTaxBrkdwnInstr;
    }

    /**
     * Sets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setDdlnForTaxBrkdwnInstr(DateFormat43Choice value) {
        this.ddlnForTaxBrkdwnInstr = value;
    }

    /**
     * Gets the value of the tradgSspdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getTradgSspdDt() {
        return tradgSspdDt;
    }

    /**
     * Sets the value of the tradgSspdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setTradgSspdDt(DateFormat43Choice value) {
        this.tradgSspdDt = value;
    }

    /**
     * Gets the value of the ucondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getUcondlDt() {
        return ucondlDt;
    }

    /**
     * Sets the value of the ucondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setUcondlDt(DateFormat30Choice value) {
        this.ucondlDt = value;
    }

    /**
     * Gets the value of the whlyUcondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getWhlyUcondlDt() {
        return whlyUcondlDt;
    }

    /**
     * Sets the value of the whlyUcondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setWhlyUcondlDt(DateFormat30Choice value) {
        this.whlyUcondlDt = value;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setExDvddDt(DateFormat30Choice value) {
        this.exDvddDt = value;
    }

    /**
     * Gets the value of the offclAnncmntPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getOffclAnncmntPblctnDt() {
        return offclAnncmntPblctnDt;
    }

    /**
     * Sets the value of the offclAnncmntPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setOffclAnncmntPblctnDt(DateFormat43Choice value) {
        this.offclAnncmntPblctnDt = value;
    }

    /**
     * Gets the value of the spclExDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getSpclExDt() {
        return spclExDt;
    }

    /**
     * Sets the value of the spclExDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setSpclExDt(DateFormat30Choice value) {
        this.spclExDt = value;
    }

    /**
     * Gets the value of the grntedPrtcptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getGrntedPrtcptnDt() {
        return grntedPrtcptnDt;
    }

    /**
     * Sets the value of the grntedPrtcptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setGrntedPrtcptnDt(DateFormat30Choice value) {
        this.grntedPrtcptnDt = value;
    }

    /**
     * Gets the value of the elctnToCtrPtyMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getElctnToCtrPtyMktDdln() {
        return elctnToCtrPtyMktDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setElctnToCtrPtyMktDdln(DateFormat43Choice value) {
        this.elctnToCtrPtyMktDdln = value;
    }

    /**
     * Gets the value of the elctnToCtrPtyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getElctnToCtrPtyRspnDdln() {
        return elctnToCtrPtyRspnDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setElctnToCtrPtyRspnDdln(DateFormat43Choice value) {
        this.elctnToCtrPtyRspnDdln = value;
    }

    /**
     * Gets the value of the lpsdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getLpsdDt() {
        return lpsdDt;
    }

    /**
     * Sets the value of the lpsdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setLpsdDt(DateFormat30Choice value) {
        this.lpsdDt = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setPmtDt(DateFormat30Choice value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the thrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getThrdPtyDdln() {
        return thrdPtyDdln;
    }

    /**
     * Sets the value of the thrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setThrdPtyDdln(DateFormat43Choice value) {
        this.thrdPtyDdln = value;
    }

    /**
     * Gets the value of the earlyThrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEarlyThrdPtyDdln() {
        return earlyThrdPtyDdln;
    }

    /**
     * Sets the value of the earlyThrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setEarlyThrdPtyDdln(DateFormat43Choice value) {
        this.earlyThrdPtyDdln = value;
    }

    /**
     * Gets the value of the mktClmTrckgEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getMktClmTrckgEndDt() {
        return mktClmTrckgEndDt;
    }

    /**
     * Sets the value of the mktClmTrckgEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setMktClmTrckgEndDt(DateFormat30Choice value) {
        this.mktClmTrckgEndDt = value;
    }

    /**
     * Gets the value of the leadPlntffDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getLeadPlntffDdln() {
        return leadPlntffDdln;
    }

    /**
     * Sets the value of the leadPlntffDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setLeadPlntffDdln(DateFormat43Choice value) {
        this.leadPlntffDdln = value;
    }

    /**
     * Gets the value of the filgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getFilgDt() {
        return filgDt;
    }

    /**
     * Sets the value of the filgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setFilgDt(DateFormat30Choice value) {
        this.filgDt = value;
    }

    /**
     * Gets the value of the hrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getHrgDt() {
        return hrgDt;
    }

    /**
     * Sets the value of the hrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setHrgDt(DateFormat30Choice value) {
        this.hrgDt = value;
    }

}
