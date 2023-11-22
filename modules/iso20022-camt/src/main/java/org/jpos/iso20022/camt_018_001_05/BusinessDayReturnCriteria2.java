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

package org.jpos.iso20022.camt_018_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BusinessDayReturnCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysDtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}RequestedIndicator" minOccurs="0"/>
 *         <element name="SysStsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}RequestedIndicator" minOccurs="0"/>
 *         <element name="SysCcyInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}RequestedIndicator" minOccurs="0"/>
 *         <element name="ClsrPrdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}RequestedIndicator" minOccurs="0"/>
 *         <element name="EvtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}RequestedIndicator" minOccurs="0"/>
 *         <element name="SsnPrdInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}RequestedIndicator" minOccurs="0"/>
 *         <element name="EvtTpInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.018.001.05}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayReturnCriteria2", propOrder = {
    "sysDtInd",
    "sysStsInd",
    "sysCcyInd",
    "clsrPrdInd",
    "evtInd",
    "ssnPrdInd",
    "evtTpInd"
})
public class BusinessDayReturnCriteria2 {

    @XmlElement(name = "SysDtInd")
    protected Boolean sysDtInd;
    @XmlElement(name = "SysStsInd")
    protected Boolean sysStsInd;
    @XmlElement(name = "SysCcyInd")
    protected Boolean sysCcyInd;
    @XmlElement(name = "ClsrPrdInd")
    protected Boolean clsrPrdInd;
    @XmlElement(name = "EvtInd")
    protected Boolean evtInd;
    @XmlElement(name = "SsnPrdInd")
    protected Boolean ssnPrdInd;
    @XmlElement(name = "EvtTpInd")
    protected Boolean evtTpInd;

    /**
     * Gets the value of the sysDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysDtInd() {
        return sysDtInd;
    }

    /**
     * Sets the value of the sysDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysDtInd(Boolean value) {
        this.sysDtInd = value;
    }

    /**
     * Gets the value of the sysStsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysStsInd() {
        return sysStsInd;
    }

    /**
     * Sets the value of the sysStsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysStsInd(Boolean value) {
        this.sysStsInd = value;
    }

    /**
     * Gets the value of the sysCcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysCcyInd() {
        return sysCcyInd;
    }

    /**
     * Sets the value of the sysCcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysCcyInd(Boolean value) {
        this.sysCcyInd = value;
    }

    /**
     * Gets the value of the clsrPrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsrPrdInd() {
        return clsrPrdInd;
    }

    /**
     * Sets the value of the clsrPrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClsrPrdInd(Boolean value) {
        this.clsrPrdInd = value;
    }

    /**
     * Gets the value of the evtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvtInd() {
        return evtInd;
    }

    /**
     * Sets the value of the evtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvtInd(Boolean value) {
        this.evtInd = value;
    }

    /**
     * Gets the value of the ssnPrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSsnPrdInd() {
        return ssnPrdInd;
    }

    /**
     * Sets the value of the ssnPrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSsnPrdInd(Boolean value) {
        this.ssnPrdInd = value;
    }

    /**
     * Gets the value of the evtTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvtTpInd() {
        return evtTpInd;
    }

    /**
     * Sets the value of the evtTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvtTpInd(Boolean value) {
        this.evtTpInd = value;
    }

}
