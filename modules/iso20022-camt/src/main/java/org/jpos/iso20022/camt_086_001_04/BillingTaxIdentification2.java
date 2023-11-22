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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingTaxIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingTaxIdentification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VATRegnNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max35Text" minOccurs="0"/>
 *         <element name="TaxRegnNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max35Text" minOccurs="0"/>
 *         <element name="TaxCtct" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Contact4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingTaxIdentification2", propOrder = {
    "vatRegnNb",
    "taxRegnNb",
    "taxCtct"
})
public class BillingTaxIdentification2 {

    @XmlElement(name = "VATRegnNb")
    protected String vatRegnNb;
    @XmlElement(name = "TaxRegnNb")
    protected String taxRegnNb;
    @XmlElement(name = "TaxCtct")
    protected Contact4 taxCtct;

    /**
     * Gets the value of the vatRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATRegnNb() {
        return vatRegnNb;
    }

    /**
     * Sets the value of the vatRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATRegnNb(String value) {
        this.vatRegnNb = value;
    }

    /**
     * Gets the value of the taxRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegnNb() {
        return taxRegnNb;
    }

    /**
     * Sets the value of the taxRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegnNb(String value) {
        this.taxRegnNb = value;
    }

    /**
     * Gets the value of the taxCtct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact4 }
     *     
     */
    public Contact4 getTaxCtct() {
        return taxCtct;
    }

    /**
     * Sets the value of the taxCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact4 }
     *     
     */
    public void setTaxCtct(Contact4 value) {
        this.taxCtct = value;
    }

}
