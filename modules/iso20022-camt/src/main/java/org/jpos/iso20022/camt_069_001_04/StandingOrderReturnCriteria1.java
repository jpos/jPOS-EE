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

package org.jpos.iso20022.camt_069_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderReturnCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingOrderReturnCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StgOrdrIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="TpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="SysMmbInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="RspnsblPtyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="CcyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="DbtrAcctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="CdtrAcctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="AssoctdPoolAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="FrqcyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="ExctnTpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="VldtyFrInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="VldToInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="LkSetIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="LkSetOrdrIdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="LkSetOrdrSeqInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="TtlAmtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *         <element name="ZeroSweepInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderReturnCriteria1", propOrder = {
    "stgOrdrIdInd",
    "tpInd",
    "sysMmbInd",
    "rspnsblPtyInd",
    "ccyInd",
    "dbtrAcctInd",
    "cdtrAcctInd",
    "assoctdPoolAcct",
    "frqcyInd",
    "exctnTpInd",
    "vldtyFrInd",
    "vldToInd",
    "lkSetIdInd",
    "lkSetOrdrIdInd",
    "lkSetOrdrSeqInd",
    "ttlAmtInd",
    "zeroSweepInd"
})
public class StandingOrderReturnCriteria1 {

    @XmlElement(name = "StgOrdrIdInd")
    protected Boolean stgOrdrIdInd;
    @XmlElement(name = "TpInd")
    protected Boolean tpInd;
    @XmlElement(name = "SysMmbInd")
    protected Boolean sysMmbInd;
    @XmlElement(name = "RspnsblPtyInd")
    protected Boolean rspnsblPtyInd;
    @XmlElement(name = "CcyInd")
    protected Boolean ccyInd;
    @XmlElement(name = "DbtrAcctInd")
    protected Boolean dbtrAcctInd;
    @XmlElement(name = "CdtrAcctInd")
    protected Boolean cdtrAcctInd;
    @XmlElement(name = "AssoctdPoolAcct")
    protected Boolean assoctdPoolAcct;
    @XmlElement(name = "FrqcyInd")
    protected Boolean frqcyInd;
    @XmlElement(name = "ExctnTpInd")
    protected Boolean exctnTpInd;
    @XmlElement(name = "VldtyFrInd")
    protected Boolean vldtyFrInd;
    @XmlElement(name = "VldToInd")
    protected Boolean vldToInd;
    @XmlElement(name = "LkSetIdInd")
    protected Boolean lkSetIdInd;
    @XmlElement(name = "LkSetOrdrIdInd")
    protected Boolean lkSetOrdrIdInd;
    @XmlElement(name = "LkSetOrdrSeqInd")
    protected Boolean lkSetOrdrSeqInd;
    @XmlElement(name = "TtlAmtInd")
    protected Boolean ttlAmtInd;
    @XmlElement(name = "ZeroSweepInd")
    protected Boolean zeroSweepInd;

    /**
     * Gets the value of the stgOrdrIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgOrdrIdInd() {
        return stgOrdrIdInd;
    }

    /**
     * Sets the value of the stgOrdrIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStgOrdrIdInd(Boolean value) {
        this.stgOrdrIdInd = value;
    }

    /**
     * Gets the value of the tpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTpInd(Boolean value) {
        this.tpInd = value;
    }

    /**
     * Gets the value of the sysMmbInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysMmbInd() {
        return sysMmbInd;
    }

    /**
     * Sets the value of the sysMmbInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysMmbInd(Boolean value) {
        this.sysMmbInd = value;
    }

    /**
     * Gets the value of the rspnsblPtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnsblPtyInd() {
        return rspnsblPtyInd;
    }

    /**
     * Sets the value of the rspnsblPtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRspnsblPtyInd(Boolean value) {
        this.rspnsblPtyInd = value;
    }

    /**
     * Gets the value of the ccyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcyInd() {
        return ccyInd;
    }

    /**
     * Sets the value of the ccyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcyInd(Boolean value) {
        this.ccyInd = value;
    }

    /**
     * Gets the value of the dbtrAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtrAcctInd() {
        return dbtrAcctInd;
    }

    /**
     * Sets the value of the dbtrAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbtrAcctInd(Boolean value) {
        this.dbtrAcctInd = value;
    }

    /**
     * Gets the value of the cdtrAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtrAcctInd() {
        return cdtrAcctInd;
    }

    /**
     * Sets the value of the cdtrAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdtrAcctInd(Boolean value) {
        this.cdtrAcctInd = value;
    }

    /**
     * Gets the value of the assoctdPoolAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssoctdPoolAcct() {
        return assoctdPoolAcct;
    }

    /**
     * Sets the value of the assoctdPoolAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssoctdPoolAcct(Boolean value) {
        this.assoctdPoolAcct = value;
    }

    /**
     * Gets the value of the frqcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrqcyInd() {
        return frqcyInd;
    }

    /**
     * Sets the value of the frqcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrqcyInd(Boolean value) {
        this.frqcyInd = value;
    }

    /**
     * Gets the value of the exctnTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExctnTpInd() {
        return exctnTpInd;
    }

    /**
     * Sets the value of the exctnTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExctnTpInd(Boolean value) {
        this.exctnTpInd = value;
    }

    /**
     * Gets the value of the vldtyFrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVldtyFrInd() {
        return vldtyFrInd;
    }

    /**
     * Sets the value of the vldtyFrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVldtyFrInd(Boolean value) {
        this.vldtyFrInd = value;
    }

    /**
     * Gets the value of the vldToInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVldToInd() {
        return vldToInd;
    }

    /**
     * Sets the value of the vldToInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVldToInd(Boolean value) {
        this.vldToInd = value;
    }

    /**
     * Gets the value of the lkSetIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLkSetIdInd() {
        return lkSetIdInd;
    }

    /**
     * Sets the value of the lkSetIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLkSetIdInd(Boolean value) {
        this.lkSetIdInd = value;
    }

    /**
     * Gets the value of the lkSetOrdrIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLkSetOrdrIdInd() {
        return lkSetOrdrIdInd;
    }

    /**
     * Sets the value of the lkSetOrdrIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLkSetOrdrIdInd(Boolean value) {
        this.lkSetOrdrIdInd = value;
    }

    /**
     * Gets the value of the lkSetOrdrSeqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLkSetOrdrSeqInd() {
        return lkSetOrdrSeqInd;
    }

    /**
     * Sets the value of the lkSetOrdrSeqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLkSetOrdrSeqInd(Boolean value) {
        this.lkSetOrdrSeqInd = value;
    }

    /**
     * Gets the value of the ttlAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTtlAmtInd() {
        return ttlAmtInd;
    }

    /**
     * Sets the value of the ttlAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTtlAmtInd(Boolean value) {
        this.ttlAmtInd = value;
    }

    /**
     * Gets the value of the zeroSweepInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroSweepInd() {
        return zeroSweepInd;
    }

    /**
     * Sets the value of the zeroSweepInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroSweepInd(Boolean value) {
        this.zeroSweepInd = value;
    }

}
