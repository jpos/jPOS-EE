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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureMetrics4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExposureMetrics4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrncplAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PrincipalAmount3" minOccurs="0"/>
 *         <element name="LnVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}AmountAndDirection53" minOccurs="0"/>
 *         <element name="OutsdngMrgnLnAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ShrtMktValAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MrgnLn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshCollAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}AmountAndDirection53" minOccurs="0"/>
 *         <element name="CollMktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}AmountAndDirection53" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureMetrics4", propOrder = {
    "prncplAmt",
    "lnVal",
    "mktVal",
    "outsdngMrgnLnAmt",
    "shrtMktValAmt",
    "mrgnLn",
    "cshCollAmt",
    "collMktVal"
})
public class ExposureMetrics4 {

    @XmlElement(name = "PrncplAmt")
    protected PrincipalAmount3 prncplAmt;
    @XmlElement(name = "LnVal")
    protected ActiveOrHistoricCurrencyAndAmount lnVal;
    @XmlElement(name = "MktVal")
    protected AmountAndDirection53 mktVal;
    @XmlElement(name = "OutsdngMrgnLnAmt")
    protected ActiveOrHistoricCurrencyAndAmount outsdngMrgnLnAmt;
    @XmlElement(name = "ShrtMktValAmt")
    protected ActiveOrHistoricCurrencyAndAmount shrtMktValAmt;
    @XmlElement(name = "MrgnLn")
    protected ActiveOrHistoricCurrencyAndAmount mrgnLn;
    @XmlElement(name = "CshCollAmt")
    protected AmountAndDirection53 cshCollAmt;
    @XmlElement(name = "CollMktVal")
    protected AmountAndDirection53 collMktVal;

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalAmount3 }
     *     
     */
    public PrincipalAmount3 getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalAmount3 }
     *     
     */
    public void setPrncplAmt(PrincipalAmount3 value) {
        this.prncplAmt = value;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setLnVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.lnVal = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setMktVal(AmountAndDirection53 value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the outsdngMrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOutsdngMrgnLnAmt() {
        return outsdngMrgnLnAmt;
    }

    /**
     * Sets the value of the outsdngMrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOutsdngMrgnLnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.outsdngMrgnLnAmt = value;
    }

    /**
     * Gets the value of the shrtMktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getShrtMktValAmt() {
        return shrtMktValAmt;
    }

    /**
     * Sets the value of the shrtMktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setShrtMktValAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.shrtMktValAmt = value;
    }

    /**
     * Gets the value of the mrgnLn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMrgnLn() {
        return mrgnLn;
    }

    /**
     * Sets the value of the mrgnLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMrgnLn(ActiveOrHistoricCurrencyAndAmount value) {
        this.mrgnLn = value;
    }

    /**
     * Gets the value of the cshCollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getCshCollAmt() {
        return cshCollAmt;
    }

    /**
     * Sets the value of the cshCollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setCshCollAmt(AmountAndDirection53 value) {
        this.cshCollAmt = value;
    }

    /**
     * Gets the value of the collMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getCollMktVal() {
        return collMktVal;
    }

    /**
     * Sets the value of the collMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setCollMktVal(AmountAndDirection53 value) {
        this.collMktVal = value;
    }

}
