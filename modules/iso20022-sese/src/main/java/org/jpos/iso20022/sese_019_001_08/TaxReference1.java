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

package org.jpos.iso20022.sese_019_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReference1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxReference1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}TaxReferenceType1Choice" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}Max35Text"/>
 *         <element name="HldrTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}TaxReferenceParty1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReference1", propOrder = {
    "taxTp",
    "ref",
    "hldrTp"
})
public class TaxReference1 {

    @XmlElement(name = "TaxTp")
    protected TaxReferenceType1Choice taxTp;
    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "HldrTp")
    protected TaxReferenceParty1Choice hldrTp;

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReferenceType1Choice }
     *     
     */
    public TaxReferenceType1Choice getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReferenceType1Choice }
     *     
     */
    public void setTaxTp(TaxReferenceType1Choice value) {
        this.taxTp = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the hldrTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReferenceParty1Choice }
     *     
     */
    public TaxReferenceParty1Choice getHldrTp() {
        return hldrTp;
    }

    /**
     * Sets the value of the hldrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReferenceParty1Choice }
     *     
     */
    public void setHldrTp(TaxReferenceParty1Choice value) {
        this.hldrTp = value;
    }

}
