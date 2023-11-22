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

package org.jpos.iso20022.reda_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesReturnCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesReturnCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="ISOSctyLngNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="ISOSctyShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="ClssfctnFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="IsseCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="CtryOfIsse" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="SctySts" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="InvstrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="IssrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="TechIssrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="CSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="SctiesQtyTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="MinDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="MinMltplQty" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *         <element name="DevtgSttlmUnit" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}RequestedIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReturnCriteria1", propOrder = {
    "finInstrmId",
    "isoSctyLngNm",
    "isoSctyShrtNm",
    "clssfctnFinInstrm",
    "mtrtyDt",
    "isseDt",
    "isseCcy",
    "ctryOfIsse",
    "sctySts",
    "invstrCSD",
    "issrCSD",
    "techIssrCSD",
    "csd",
    "sctiesQtyTp",
    "minDnmtn",
    "minMltplQty",
    "devtgSttlmUnit"
})
public class SecuritiesReturnCriteria1 {

    @XmlElement(name = "FinInstrmId")
    protected boolean finInstrmId;
    @XmlElement(name = "ISOSctyLngNm")
    protected boolean isoSctyLngNm;
    @XmlElement(name = "ISOSctyShrtNm")
    protected boolean isoSctyShrtNm;
    @XmlElement(name = "ClssfctnFinInstrm")
    protected boolean clssfctnFinInstrm;
    @XmlElement(name = "MtrtyDt")
    protected boolean mtrtyDt;
    @XmlElement(name = "IsseDt")
    protected boolean isseDt;
    @XmlElement(name = "IsseCcy")
    protected boolean isseCcy;
    @XmlElement(name = "CtryOfIsse")
    protected boolean ctryOfIsse;
    @XmlElement(name = "SctySts")
    protected boolean sctySts;
    @XmlElement(name = "InvstrCSD")
    protected boolean invstrCSD;
    @XmlElement(name = "IssrCSD")
    protected boolean issrCSD;
    @XmlElement(name = "TechIssrCSD")
    protected boolean techIssrCSD;
    @XmlElement(name = "CSD")
    protected boolean csd;
    @XmlElement(name = "SctiesQtyTp")
    protected boolean sctiesQtyTp;
    @XmlElement(name = "MinDnmtn")
    protected boolean minDnmtn;
    @XmlElement(name = "MinMltplQty")
    protected boolean minMltplQty;
    @XmlElement(name = "DevtgSttlmUnit")
    protected boolean devtgSttlmUnit;

    /**
     * Gets the value of the finInstrmId property.
     * 
     */
    public boolean isFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     */
    public void setFinInstrmId(boolean value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the isoSctyLngNm property.
     * 
     */
    public boolean isISOSctyLngNm() {
        return isoSctyLngNm;
    }

    /**
     * Sets the value of the isoSctyLngNm property.
     * 
     */
    public void setISOSctyLngNm(boolean value) {
        this.isoSctyLngNm = value;
    }

    /**
     * Gets the value of the isoSctyShrtNm property.
     * 
     */
    public boolean isISOSctyShrtNm() {
        return isoSctyShrtNm;
    }

    /**
     * Sets the value of the isoSctyShrtNm property.
     * 
     */
    public void setISOSctyShrtNm(boolean value) {
        this.isoSctyShrtNm = value;
    }

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     */
    public boolean isClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     */
    public void setClssfctnFinInstrm(boolean value) {
        this.clssfctnFinInstrm = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     */
    public boolean isMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     */
    public void setMtrtyDt(boolean value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     */
    public boolean isIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     */
    public void setIsseDt(boolean value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the isseCcy property.
     * 
     */
    public boolean isIsseCcy() {
        return isseCcy;
    }

    /**
     * Sets the value of the isseCcy property.
     * 
     */
    public void setIsseCcy(boolean value) {
        this.isseCcy = value;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     */
    public boolean isCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     */
    public void setCtryOfIsse(boolean value) {
        this.ctryOfIsse = value;
    }

    /**
     * Gets the value of the sctySts property.
     * 
     */
    public boolean isSctySts() {
        return sctySts;
    }

    /**
     * Sets the value of the sctySts property.
     * 
     */
    public void setSctySts(boolean value) {
        this.sctySts = value;
    }

    /**
     * Gets the value of the invstrCSD property.
     * 
     */
    public boolean isInvstrCSD() {
        return invstrCSD;
    }

    /**
     * Sets the value of the invstrCSD property.
     * 
     */
    public void setInvstrCSD(boolean value) {
        this.invstrCSD = value;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     */
    public boolean isIssrCSD() {
        return issrCSD;
    }

    /**
     * Sets the value of the issrCSD property.
     * 
     */
    public void setIssrCSD(boolean value) {
        this.issrCSD = value;
    }

    /**
     * Gets the value of the techIssrCSD property.
     * 
     */
    public boolean isTechIssrCSD() {
        return techIssrCSD;
    }

    /**
     * Sets the value of the techIssrCSD property.
     * 
     */
    public void setTechIssrCSD(boolean value) {
        this.techIssrCSD = value;
    }

    /**
     * Gets the value of the csd property.
     * 
     */
    public boolean isCSD() {
        return csd;
    }

    /**
     * Sets the value of the csd property.
     * 
     */
    public void setCSD(boolean value) {
        this.csd = value;
    }

    /**
     * Gets the value of the sctiesQtyTp property.
     * 
     */
    public boolean isSctiesQtyTp() {
        return sctiesQtyTp;
    }

    /**
     * Sets the value of the sctiesQtyTp property.
     * 
     */
    public void setSctiesQtyTp(boolean value) {
        this.sctiesQtyTp = value;
    }

    /**
     * Gets the value of the minDnmtn property.
     * 
     */
    public boolean isMinDnmtn() {
        return minDnmtn;
    }

    /**
     * Sets the value of the minDnmtn property.
     * 
     */
    public void setMinDnmtn(boolean value) {
        this.minDnmtn = value;
    }

    /**
     * Gets the value of the minMltplQty property.
     * 
     */
    public boolean isMinMltplQty() {
        return minMltplQty;
    }

    /**
     * Sets the value of the minMltplQty property.
     * 
     */
    public void setMinMltplQty(boolean value) {
        this.minMltplQty = value;
    }

    /**
     * Gets the value of the devtgSttlmUnit property.
     * 
     */
    public boolean isDevtgSttlmUnit() {
        return devtgSttlmUnit;
    }

    /**
     * Sets the value of the devtgSttlmUnit property.
     * 
     */
    public void setDevtgSttlmUnit(boolean value) {
        this.devtgSttlmUnit = value;
    }

}
