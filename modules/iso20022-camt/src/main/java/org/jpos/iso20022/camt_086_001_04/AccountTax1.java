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

package org.jpos.iso20022.camt_086_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTax1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountTax1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingTaxCalculationMethod1Code"/>
 *         <element name="Rgn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max40Text" minOccurs="0"/>
 *         <element name="NonResCtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ResidenceLocation1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTax1", propOrder = {
    "clctnMtd",
    "rgn",
    "nonResCtry"
})
public class AccountTax1 {

    @XmlElement(name = "ClctnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected BillingTaxCalculationMethod1Code clctnMtd;
    @XmlElement(name = "Rgn")
    protected String rgn;
    @XmlElement(name = "NonResCtry")
    protected ResidenceLocation1Choice nonResCtry;

    /**
     * Gets the value of the clctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTaxCalculationMethod1Code }
     *     
     */
    public BillingTaxCalculationMethod1Code getClctnMtd() {
        return clctnMtd;
    }

    /**
     * Sets the value of the clctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTaxCalculationMethod1Code }
     *     
     */
    public void setClctnMtd(BillingTaxCalculationMethod1Code value) {
        this.clctnMtd = value;
    }

    /**
     * Gets the value of the rgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgn() {
        return rgn;
    }

    /**
     * Sets the value of the rgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgn(String value) {
        this.rgn = value;
    }

    /**
     * Gets the value of the nonResCtry property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceLocation1Choice }
     *     
     */
    public ResidenceLocation1Choice getNonResCtry() {
        return nonResCtry;
    }

    /**
     * Sets the value of the nonResCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceLocation1Choice }
     *     
     */
    public void setNonResCtry(ResidenceLocation1Choice value) {
        this.nonResCtry = value;
    }

}
