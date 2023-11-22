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

package org.jpos.iso20022.sese_012_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalFeesAndTaxes41 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalFeesAndTaxes41">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlOvrhdApld" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlFees" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlTaxs" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ComrclAgrmtRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Max35Text" minOccurs="0"/>
 *         <element name="IndvFee" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Fee5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IndvTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Tax35" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalFeesAndTaxes41", propOrder = {
    "ttlOvrhdApld",
    "ttlFees",
    "ttlTaxs",
    "comrclAgrmtRef",
    "indvFee",
    "indvTax"
})
public class TotalFeesAndTaxes41 {

    @XmlElement(name = "TtlOvrhdApld")
    protected ActiveCurrencyAndAmount ttlOvrhdApld;
    @XmlElement(name = "TtlFees")
    protected ActiveCurrencyAndAmount ttlFees;
    @XmlElement(name = "TtlTaxs")
    protected ActiveCurrencyAndAmount ttlTaxs;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "IndvFee")
    protected List<Fee5> indvFee;
    @XmlElement(name = "IndvTax")
    protected List<Tax35> indvTax;

    /**
     * Gets the value of the ttlOvrhdApld property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlOvrhdApld() {
        return ttlOvrhdApld;
    }

    /**
     * Sets the value of the ttlOvrhdApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlOvrhdApld(ActiveCurrencyAndAmount value) {
        this.ttlOvrhdApld = value;
    }

    /**
     * Gets the value of the ttlFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlFees() {
        return ttlFees;
    }

    /**
     * Sets the value of the ttlFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlFees(ActiveCurrencyAndAmount value) {
        this.ttlFees = value;
    }

    /**
     * Gets the value of the ttlTaxs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxs() {
        return ttlTaxs;
    }

    /**
     * Sets the value of the ttlTaxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlTaxs(ActiveCurrencyAndAmount value) {
        this.ttlTaxs = value;
    }

    /**
     * Gets the value of the comrclAgrmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComrclAgrmtRef() {
        return comrclAgrmtRef;
    }

    /**
     * Sets the value of the comrclAgrmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
    }

    /**
     * Gets the value of the indvFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee5 }
     * 
     * 
     * @return
     *     The value of the indvFee property.
     */
    public List<Fee5> getIndvFee() {
        if (indvFee == null) {
            indvFee = new ArrayList<>();
        }
        return this.indvFee;
    }

    /**
     * Gets the value of the indvTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax35 }
     * 
     * 
     * @return
     *     The value of the indvTax property.
     */
    public List<Tax35> getIndvTax() {
        if (indvTax == null) {
            indvTax = new ArrayList<>();
        }
        return this.indvTax;
    }

}
