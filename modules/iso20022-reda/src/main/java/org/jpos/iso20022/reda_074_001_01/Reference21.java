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

package org.jpos.iso20022.reda_074_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reference21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SndrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RcvrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SndrCollCtrctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RcvrCollCtrctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CmonTxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max52Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference21", propOrder = {
    "sndrCollTxId",
    "rcvrCollTxId",
    "sndrCollCtrctId",
    "rcvrCollCtrctId",
    "cmonTxId"
})
public class Reference21 {

    @XmlElement(name = "SndrCollTxId")
    protected String sndrCollTxId;
    @XmlElement(name = "RcvrCollTxId")
    protected String rcvrCollTxId;
    @XmlElement(name = "SndrCollCtrctId")
    protected String sndrCollCtrctId;
    @XmlElement(name = "RcvrCollCtrctId")
    protected String rcvrCollCtrctId;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;

    /**
     * Gets the value of the sndrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrCollTxId() {
        return sndrCollTxId;
    }

    /**
     * Sets the value of the sndrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrCollTxId(String value) {
        this.sndrCollTxId = value;
    }

    /**
     * Gets the value of the rcvrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrCollTxId() {
        return rcvrCollTxId;
    }

    /**
     * Sets the value of the rcvrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrCollTxId(String value) {
        this.rcvrCollTxId = value;
    }

    /**
     * Gets the value of the sndrCollCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrCollCtrctId() {
        return sndrCollCtrctId;
    }

    /**
     * Sets the value of the sndrCollCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrCollCtrctId(String value) {
        this.sndrCollCtrctId = value;
    }

    /**
     * Gets the value of the rcvrCollCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrCollCtrctId() {
        return rcvrCollCtrctId;
    }

    /**
     * Sets the value of the rcvrCollCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrCollCtrctId(String value) {
        this.rcvrCollCtrctId = value;
    }

    /**
     * Gets the value of the cmonTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Sets the value of the cmonTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonTxId(String value) {
        this.cmonTxId = value;
    }

}
