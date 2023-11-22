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

package org.jpos.iso20022.colr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAmount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="RptdCcyAndAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="MktValAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FeesAndComssns" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount1", propOrder = {
    "collAmt",
    "rptdCcyAndAmt",
    "mktValAmt",
    "acrdIntrstAmt",
    "feesAndComssns"
})
public class CollateralAmount1 {

    @XmlElement(name = "CollAmt", required = true)
    protected ActiveCurrencyAndAmount collAmt;
    @XmlElement(name = "RptdCcyAndAmt", required = true)
    protected ActiveCurrencyAndAmount rptdCcyAndAmt;
    @XmlElement(name = "MktValAmt", required = true)
    protected ActiveCurrencyAndAmount mktValAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected ActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "FeesAndComssns")
    protected ActiveCurrencyAndAmount feesAndComssns;

    /**
     * Gets the value of the collAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollAmt() {
        return collAmt;
    }

    /**
     * Sets the value of the collAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCollAmt(ActiveCurrencyAndAmount value) {
        this.collAmt = value;
    }

    /**
     * Gets the value of the rptdCcyAndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRptdCcyAndAmt() {
        return rptdCcyAndAmt;
    }

    /**
     * Sets the value of the rptdCcyAndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRptdCcyAndAmt(ActiveCurrencyAndAmount value) {
        this.rptdCcyAndAmt = value;
    }

    /**
     * Gets the value of the mktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktValAmt() {
        return mktValAmt;
    }

    /**
     * Sets the value of the mktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMktValAmt(ActiveCurrencyAndAmount value) {
        this.mktValAmt = value;
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
     * Gets the value of the feesAndComssns property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFeesAndComssns() {
        return feesAndComssns;
    }

    /**
     * Sets the value of the feesAndComssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setFeesAndComssns(ActiveCurrencyAndAmount value) {
        this.feesAndComssns = value;
    }

}
