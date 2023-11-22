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
 * <p>Java class for BillingMethod4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingMethod4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcDtl" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServiceParameters2" maxOccurs="unbounded"/>
 *         <element name="TaxClctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}TaxCalculation1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMethod4", propOrder = {
    "svcDtl",
    "taxClctn"
})
public class BillingMethod4 {

    @XmlElement(name = "SvcDtl", required = true)
    protected List<BillingServiceParameters2> svcDtl;
    @XmlElement(name = "TaxClctn", required = true)
    protected TaxCalculation1 taxClctn;

    /**
     * Gets the value of the svcDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServiceParameters2 }
     * 
     * 
     * @return
     *     The value of the svcDtl property.
     */
    public List<BillingServiceParameters2> getSvcDtl() {
        if (svcDtl == null) {
            svcDtl = new ArrayList<>();
        }
        return this.svcDtl;
    }

    /**
     * Gets the value of the taxClctn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculation1 }
     *     
     */
    public TaxCalculation1 getTaxClctn() {
        return taxClctn;
    }

    /**
     * Sets the value of the taxClctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculation1 }
     *     
     */
    public void setTaxClctn(TaxCalculation1 value) {
        this.taxClctn = value;
    }

}
