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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceTaxDesignation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceTaxDesignation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ServiceTaxDesignation1Code"/>
 *         <element name="Rgn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max35Text" minOccurs="0"/>
 *         <element name="TaxRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}TaxReason1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTaxDesignation1", propOrder = {
    "cd",
    "rgn",
    "taxRsn"
})
public class ServiceTaxDesignation1 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceTaxDesignation1Code cd;
    @XmlElement(name = "Rgn")
    protected String rgn;
    @XmlElement(name = "TaxRsn")
    protected List<TaxReason1> taxRsn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTaxDesignation1Code }
     *     
     */
    public ServiceTaxDesignation1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTaxDesignation1Code }
     *     
     */
    public void setCd(ServiceTaxDesignation1Code value) {
        this.cd = value;
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
     * Gets the value of the taxRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReason1 }
     * 
     * 
     * @return
     *     The value of the taxRsn property.
     */
    public List<TaxReason1> getTaxRsn() {
        if (taxRsn == null) {
            taxRsn = new ArrayList<>();
        }
        return this.taxRsn;
    }

}
