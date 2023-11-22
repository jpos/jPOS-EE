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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingMethod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingMethod2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcChrgHstAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="SvcTax" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServicesAmount1"/>
 *         <element name="TaxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServicesTax1" maxOccurs="3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMethod2", propOrder = {
    "svcChrgHstAmt",
    "svcTax",
    "taxId"
})
public class BillingMethod2 {

    @XmlElement(name = "SvcChrgHstAmt", required = true)
    protected AmountAndDirection34 svcChrgHstAmt;
    @XmlElement(name = "SvcTax", required = true)
    protected BillingServicesAmount1 svcTax;
    @XmlElement(name = "TaxId", required = true)
    protected List<BillingServicesTax1> taxId;

    /**
     * Gets the value of the svcChrgHstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSvcChrgHstAmt() {
        return svcChrgHstAmt;
    }

    /**
     * Sets the value of the svcChrgHstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setSvcChrgHstAmt(AmountAndDirection34 value) {
        this.svcChrgHstAmt = value;
    }

    /**
     * Gets the value of the svcTax property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServicesAmount1 }
     *     
     */
    public BillingServicesAmount1 getSvcTax() {
        return svcTax;
    }

    /**
     * Sets the value of the svcTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServicesAmount1 }
     *     
     */
    public void setSvcTax(BillingServicesAmount1 value) {
        this.svcTax = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServicesTax1 }
     * 
     * 
     * @return
     *     The value of the taxId property.
     */
    public List<BillingServicesTax1> getTaxId() {
        if (taxId == null) {
            taxId = new ArrayList<>();
        }
        return this.taxId;
    }

}
