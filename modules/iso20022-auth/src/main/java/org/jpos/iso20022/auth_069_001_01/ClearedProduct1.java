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

package org.jpos.iso20022.auth_069_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearedProduct1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearedProduct1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}MICIdentifier" maxOccurs="unbounded"/>
 *         <element name="CCPPdctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}GenericIdentification168"/>
 *         <element name="UvrslPdctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}GenericIdentification168" minOccurs="0"/>
 *         <element name="Pdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Product1Choice"/>
 *         <element name="OpnIntrst" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}OpenInterest1"/>
 *         <element name="TrdsClrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}NonNegativeNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearedProduct1", propOrder = {
    "tradgVn",
    "ccpPdctId",
    "uvrslPdctId",
    "pdct",
    "opnIntrst",
    "trdsClrd"
})
public class ClearedProduct1 {

    @XmlElement(name = "TradgVn", required = true)
    protected List<String> tradgVn;
    @XmlElement(name = "CCPPdctId", required = true)
    protected GenericIdentification168 ccpPdctId;
    @XmlElement(name = "UvrslPdctId")
    protected GenericIdentification168 uvrslPdctId;
    @XmlElement(name = "Pdct", required = true)
    protected Product1Choice pdct;
    @XmlElement(name = "OpnIntrst", required = true)
    protected OpenInterest1 opnIntrst;
    @XmlElement(name = "TrdsClrd")
    protected BigDecimal trdsClrd;

    /**
     * Gets the value of the tradgVn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgVn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgVn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the tradgVn property.
     */
    public List<String> getTradgVn() {
        if (tradgVn == null) {
            tradgVn = new ArrayList<>();
        }
        return this.tradgVn;
    }

    /**
     * Gets the value of the ccpPdctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getCCPPdctId() {
        return ccpPdctId;
    }

    /**
     * Sets the value of the ccpPdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public void setCCPPdctId(GenericIdentification168 value) {
        this.ccpPdctId = value;
    }

    /**
     * Gets the value of the uvrslPdctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getUvrslPdctId() {
        return uvrslPdctId;
    }

    /**
     * Sets the value of the uvrslPdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public void setUvrslPdctId(GenericIdentification168 value) {
        this.uvrslPdctId = value;
    }

    /**
     * Gets the value of the pdct property.
     * 
     * @return
     *     possible object is
     *     {@link Product1Choice }
     *     
     */
    public Product1Choice getPdct() {
        return pdct;
    }

    /**
     * Sets the value of the pdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product1Choice }
     *     
     */
    public void setPdct(Product1Choice value) {
        this.pdct = value;
    }

    /**
     * Gets the value of the opnIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link OpenInterest1 }
     *     
     */
    public OpenInterest1 getOpnIntrst() {
        return opnIntrst;
    }

    /**
     * Sets the value of the opnIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenInterest1 }
     *     
     */
    public void setOpnIntrst(OpenInterest1 value) {
        this.opnIntrst = value;
    }

    /**
     * Gets the value of the trdsClrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrdsClrd() {
        return trdsClrd;
    }

    /**
     * Sets the value of the trdsClrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrdsClrd(BigDecimal value) {
        this.trdsClrd = value;
    }

}
