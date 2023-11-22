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

package org.jpos.iso20022.reda_015_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyDataReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyDataReturnCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="RspnsblPtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="RstrctnId" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="RstrctdOnDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="TechAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="ResTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="LckSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="MktSpcfcAttr" type="{urn:iso:std:iso:20022:tech:xsd:reda.015.001.01}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDataReturnCriteria2", propOrder = {
    "opngDt",
    "clsgDt",
    "tp",
    "ptyId",
    "rspnsblPtyId",
    "rstrctnId",
    "rstrctdOnDt",
    "nm",
    "shrtNm",
    "adr",
    "techAdr",
    "ctctDtls",
    "resTp",
    "lckSts",
    "mktSpcfcAttr"
})
public class PartyDataReturnCriteria2 {

    @XmlElement(name = "OpngDt")
    protected Boolean opngDt;
    @XmlElement(name = "ClsgDt")
    protected Boolean clsgDt;
    @XmlElement(name = "Tp")
    protected Boolean tp;
    @XmlElement(name = "PtyId")
    protected Boolean ptyId;
    @XmlElement(name = "RspnsblPtyId")
    protected Boolean rspnsblPtyId;
    @XmlElement(name = "RstrctnId")
    protected Boolean rstrctnId;
    @XmlElement(name = "RstrctdOnDt")
    protected Boolean rstrctdOnDt;
    @XmlElement(name = "Nm")
    protected Boolean nm;
    @XmlElement(name = "ShrtNm")
    protected Boolean shrtNm;
    @XmlElement(name = "Adr")
    protected Boolean adr;
    @XmlElement(name = "TechAdr")
    protected Boolean techAdr;
    @XmlElement(name = "CtctDtls")
    protected Boolean ctctDtls;
    @XmlElement(name = "ResTp")
    protected Boolean resTp;
    @XmlElement(name = "LckSts")
    protected Boolean lckSts;
    @XmlElement(name = "MktSpcfcAttr")
    protected Boolean mktSpcfcAttr;

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpngDt(Boolean value) {
        this.opngDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClsgDt(Boolean value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTp(Boolean value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPtyId(Boolean value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRspnsblPtyId(Boolean value) {
        this.rspnsblPtyId = value;
    }

    /**
     * Gets the value of the rstrctnId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctnId() {
        return rstrctnId;
    }

    /**
     * Sets the value of the rstrctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRstrctnId(Boolean value) {
        this.rstrctnId = value;
    }

    /**
     * Gets the value of the rstrctdOnDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdOnDt() {
        return rstrctdOnDt;
    }

    /**
     * Sets the value of the rstrctdOnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRstrctdOnDt(Boolean value) {
        this.rstrctdOnDt = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNm(Boolean value) {
        this.nm = value;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShrtNm(Boolean value) {
        this.shrtNm = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdr(Boolean value) {
        this.adr = value;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTechAdr() {
        return techAdr;
    }

    /**
     * Sets the value of the techAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTechAdr(Boolean value) {
        this.techAdr = value;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtctDtls(Boolean value) {
        this.ctctDtls = value;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResTp(Boolean value) {
        this.resTp = value;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLckSts(Boolean value) {
        this.lckSts = value;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMktSpcfcAttr(Boolean value) {
        this.mktSpcfcAttr = value;
    }

}
