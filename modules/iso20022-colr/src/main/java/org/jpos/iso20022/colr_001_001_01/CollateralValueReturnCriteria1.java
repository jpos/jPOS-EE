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

package org.jpos.iso20022.colr_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValueReturnCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValueReturnCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshAcctOwnrInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="CshAcctSvcrInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="SctiesAcctOwnrInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="SctiesAcctSvcrInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="TtlCollValtnInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="SctiesAcctInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}RequestedIndicator" minOccurs="0"/>
 *         <element name="Scties" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueReturnCriteria1", propOrder = {
    "cshAcctOwnrInd",
    "cshAcctSvcrInd",
    "sctiesAcctOwnrInd",
    "sctiesAcctSvcrInd",
    "ttlCollValtnInd",
    "sctiesAcctInd",
    "scties"
})
public class CollateralValueReturnCriteria1 {

    @XmlElement(name = "CshAcctOwnrInd")
    protected Boolean cshAcctOwnrInd;
    @XmlElement(name = "CshAcctSvcrInd")
    protected Boolean cshAcctSvcrInd;
    @XmlElement(name = "SctiesAcctOwnrInd")
    protected Boolean sctiesAcctOwnrInd;
    @XmlElement(name = "SctiesAcctSvcrInd")
    protected Boolean sctiesAcctSvcrInd;
    @XmlElement(name = "TtlCollValtnInd")
    protected Boolean ttlCollValtnInd;
    @XmlElement(name = "SctiesAcctInd")
    protected Boolean sctiesAcctInd;
    @XmlElement(name = "Scties")
    protected Boolean scties;

    /**
     * Gets the value of the cshAcctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshAcctOwnrInd() {
        return cshAcctOwnrInd;
    }

    /**
     * Sets the value of the cshAcctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCshAcctOwnrInd(Boolean value) {
        this.cshAcctOwnrInd = value;
    }

    /**
     * Gets the value of the cshAcctSvcrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshAcctSvcrInd() {
        return cshAcctSvcrInd;
    }

    /**
     * Sets the value of the cshAcctSvcrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCshAcctSvcrInd(Boolean value) {
        this.cshAcctSvcrInd = value;
    }

    /**
     * Gets the value of the sctiesAcctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesAcctOwnrInd() {
        return sctiesAcctOwnrInd;
    }

    /**
     * Sets the value of the sctiesAcctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSctiesAcctOwnrInd(Boolean value) {
        this.sctiesAcctOwnrInd = value;
    }

    /**
     * Gets the value of the sctiesAcctSvcrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesAcctSvcrInd() {
        return sctiesAcctSvcrInd;
    }

    /**
     * Sets the value of the sctiesAcctSvcrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSctiesAcctSvcrInd(Boolean value) {
        this.sctiesAcctSvcrInd = value;
    }

    /**
     * Gets the value of the ttlCollValtnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTtlCollValtnInd() {
        return ttlCollValtnInd;
    }

    /**
     * Sets the value of the ttlCollValtnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTtlCollValtnInd(Boolean value) {
        this.ttlCollValtnInd = value;
    }

    /**
     * Gets the value of the sctiesAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesAcctInd() {
        return sctiesAcctInd;
    }

    /**
     * Sets the value of the sctiesAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSctiesAcctInd(Boolean value) {
        this.sctiesAcctInd = value;
    }

    /**
     * Gets the value of the scties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScties() {
        return scties;
    }

    /**
     * Sets the value of the scties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScties(Boolean value) {
        this.scties = value;
    }

}
