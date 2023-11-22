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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDate2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="CoverXprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="EqulstnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="MrgnFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="LtryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="PrtctDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="UcondlDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="WhlyUcondlDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="RsltsPblctnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="CrtApprvlDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="EarlyClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="ExDvddDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="IndxFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="TradgSspdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="CertfctnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="RedDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="RegnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="PrratnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="DdlnForTaxBrkdwnInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="LpsdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="GrntedPrtcptnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="ElctnToCtrPtyDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *         <element name="SpclExDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DateFormat4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate2", propOrder = {
    "rcrdDt",
    "fctvDt",
    "coverXprtnDt",
    "equlstnDt",
    "mrgnFxgDt",
    "ltryDt",
    "prtctDt",
    "ucondlDt",
    "whlyUcondlDt",
    "rsltsPblctnDt",
    "crtApprvlDt",
    "earlyClsgDt",
    "exDvddDt",
    "indxFxgDt",
    "mtrtyDt",
    "tradgSspdDt",
    "certfctnDdln",
    "redDt",
    "regnDdln",
    "prratnDt",
    "ddlnForTaxBrkdwnInstr",
    "lpsdDt",
    "grntedPrtcptnDt",
    "elctnToCtrPtyDdln",
    "spclExDt"
})
public class CorporateActionDate2 {

    @XmlElement(name = "RcrdDt")
    protected DateFormat4Choice rcrdDt;
    @XmlElement(name = "FctvDt")
    protected DateFormat4Choice fctvDt;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat4Choice coverXprtnDt;
    @XmlElement(name = "EqulstnDt")
    protected DateFormat4Choice equlstnDt;
    @XmlElement(name = "MrgnFxgDt")
    protected DateFormat4Choice mrgnFxgDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat4Choice ltryDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat4Choice prtctDt;
    @XmlElement(name = "UcondlDt")
    protected DateFormat4Choice ucondlDt;
    @XmlElement(name = "WhlyUcondlDt")
    protected DateFormat4Choice whlyUcondlDt;
    @XmlElement(name = "RsltsPblctnDt")
    protected DateFormat4Choice rsltsPblctnDt;
    @XmlElement(name = "CrtApprvlDt")
    protected DateFormat4Choice crtApprvlDt;
    @XmlElement(name = "EarlyClsgDt")
    protected DateFormat4Choice earlyClsgDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat4Choice exDvddDt;
    @XmlElement(name = "IndxFxgDt")
    protected DateFormat4Choice indxFxgDt;
    @XmlElement(name = "MtrtyDt")
    protected DateFormat4Choice mtrtyDt;
    @XmlElement(name = "TradgSspdDt")
    protected DateFormat4Choice tradgSspdDt;
    @XmlElement(name = "CertfctnDdln")
    protected DateFormat4Choice certfctnDdln;
    @XmlElement(name = "RedDt")
    protected DateFormat4Choice redDt;
    @XmlElement(name = "RegnDdln")
    protected DateFormat4Choice regnDdln;
    @XmlElement(name = "PrratnDt")
    protected DateFormat4Choice prratnDt;
    @XmlElement(name = "DdlnForTaxBrkdwnInstr")
    protected DateFormat4Choice ddlnForTaxBrkdwnInstr;
    @XmlElement(name = "LpsdDt")
    protected DateFormat4Choice lpsdDt;
    @XmlElement(name = "GrntedPrtcptnDt")
    protected DateFormat4Choice grntedPrtcptnDt;
    @XmlElement(name = "ElctnToCtrPtyDdln")
    protected DateFormat4Choice elctnToCtrPtyDdln;
    @XmlElement(name = "SpclExDt")
    protected DateFormat4Choice spclExDt;

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setRcrdDt(DateFormat4Choice value) {
        this.rcrdDt = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setFctvDt(DateFormat4Choice value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setCoverXprtnDt(DateFormat4Choice value) {
        this.coverXprtnDt = value;
    }

    /**
     * Gets the value of the equlstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getEqulstnDt() {
        return equlstnDt;
    }

    /**
     * Sets the value of the equlstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setEqulstnDt(DateFormat4Choice value) {
        this.equlstnDt = value;
    }

    /**
     * Gets the value of the mrgnFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getMrgnFxgDt() {
        return mrgnFxgDt;
    }

    /**
     * Sets the value of the mrgnFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setMrgnFxgDt(DateFormat4Choice value) {
        this.mrgnFxgDt = value;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setLtryDt(DateFormat4Choice value) {
        this.ltryDt = value;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setPrtctDt(DateFormat4Choice value) {
        this.prtctDt = value;
    }

    /**
     * Gets the value of the ucondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getUcondlDt() {
        return ucondlDt;
    }

    /**
     * Sets the value of the ucondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setUcondlDt(DateFormat4Choice value) {
        this.ucondlDt = value;
    }

    /**
     * Gets the value of the whlyUcondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getWhlyUcondlDt() {
        return whlyUcondlDt;
    }

    /**
     * Sets the value of the whlyUcondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setWhlyUcondlDt(DateFormat4Choice value) {
        this.whlyUcondlDt = value;
    }

    /**
     * Gets the value of the rsltsPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRsltsPblctnDt() {
        return rsltsPblctnDt;
    }

    /**
     * Sets the value of the rsltsPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setRsltsPblctnDt(DateFormat4Choice value) {
        this.rsltsPblctnDt = value;
    }

    /**
     * Gets the value of the crtApprvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCrtApprvlDt() {
        return crtApprvlDt;
    }

    /**
     * Sets the value of the crtApprvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setCrtApprvlDt(DateFormat4Choice value) {
        this.crtApprvlDt = value;
    }

    /**
     * Gets the value of the earlyClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getEarlyClsgDt() {
        return earlyClsgDt;
    }

    /**
     * Sets the value of the earlyClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setEarlyClsgDt(DateFormat4Choice value) {
        this.earlyClsgDt = value;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setExDvddDt(DateFormat4Choice value) {
        this.exDvddDt = value;
    }

    /**
     * Gets the value of the indxFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getIndxFxgDt() {
        return indxFxgDt;
    }

    /**
     * Sets the value of the indxFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setIndxFxgDt(DateFormat4Choice value) {
        this.indxFxgDt = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setMtrtyDt(DateFormat4Choice value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the tradgSspdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getTradgSspdDt() {
        return tradgSspdDt;
    }

    /**
     * Sets the value of the tradgSspdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setTradgSspdDt(DateFormat4Choice value) {
        this.tradgSspdDt = value;
    }

    /**
     * Gets the value of the certfctnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCertfctnDdln() {
        return certfctnDdln;
    }

    /**
     * Sets the value of the certfctnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setCertfctnDdln(DateFormat4Choice value) {
        this.certfctnDdln = value;
    }

    /**
     * Gets the value of the redDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRedDt() {
        return redDt;
    }

    /**
     * Sets the value of the redDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setRedDt(DateFormat4Choice value) {
        this.redDt = value;
    }

    /**
     * Gets the value of the regnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRegnDdln() {
        return regnDdln;
    }

    /**
     * Sets the value of the regnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setRegnDdln(DateFormat4Choice value) {
        this.regnDdln = value;
    }

    /**
     * Gets the value of the prratnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPrratnDt() {
        return prratnDt;
    }

    /**
     * Sets the value of the prratnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setPrratnDt(DateFormat4Choice value) {
        this.prratnDt = value;
    }

    /**
     * Gets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getDdlnForTaxBrkdwnInstr() {
        return ddlnForTaxBrkdwnInstr;
    }

    /**
     * Sets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setDdlnForTaxBrkdwnInstr(DateFormat4Choice value) {
        this.ddlnForTaxBrkdwnInstr = value;
    }

    /**
     * Gets the value of the lpsdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getLpsdDt() {
        return lpsdDt;
    }

    /**
     * Sets the value of the lpsdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setLpsdDt(DateFormat4Choice value) {
        this.lpsdDt = value;
    }

    /**
     * Gets the value of the grntedPrtcptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getGrntedPrtcptnDt() {
        return grntedPrtcptnDt;
    }

    /**
     * Sets the value of the grntedPrtcptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setGrntedPrtcptnDt(DateFormat4Choice value) {
        this.grntedPrtcptnDt = value;
    }

    /**
     * Gets the value of the elctnToCtrPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getElctnToCtrPtyDdln() {
        return elctnToCtrPtyDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setElctnToCtrPtyDdln(DateFormat4Choice value) {
        this.elctnToCtrPtyDdln = value;
    }

    /**
     * Gets the value of the spclExDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getSpclExDt() {
        return spclExDt;
    }

    /**
     * Sets the value of the spclExDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public void setSpclExDt(DateFormat4Choice value) {
        this.spclExDt = value;
    }

}
