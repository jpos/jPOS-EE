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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalEligibleBalanceFormat10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalEligibleBalanceFormat10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}Quantity49Choice" minOccurs="0"/>
 *         <element name="FullPrdUnits" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}SignedQuantityFormat10" minOccurs="0"/>
 *         <element name="PartWayPrdUnits" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}SignedQuantityFormat10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalEligibleBalanceFormat10", propOrder = {
    "bal",
    "fullPrdUnits",
    "partWayPrdUnits"
})
public class TotalEligibleBalanceFormat10 {

    @XmlElement(name = "Bal")
    protected Quantity49Choice bal;
    @XmlElement(name = "FullPrdUnits")
    protected SignedQuantityFormat10 fullPrdUnits;
    @XmlElement(name = "PartWayPrdUnits")
    protected SignedQuantityFormat10 partWayPrdUnits;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity49Choice }
     *     
     */
    public Quantity49Choice getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity49Choice }
     *     
     */
    public void setBal(Quantity49Choice value) {
        this.bal = value;
    }

    /**
     * Gets the value of the fullPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getFullPrdUnits() {
        return fullPrdUnits;
    }

    /**
     * Sets the value of the fullPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setFullPrdUnits(SignedQuantityFormat10 value) {
        this.fullPrdUnits = value;
    }

    /**
     * Gets the value of the partWayPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getPartWayPrdUnits() {
        return partWayPrdUnits;
    }

    /**
     * Sets the value of the partWayPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setPartWayPrdUnits(SignedQuantityFormat10 value) {
        this.partWayPrdUnits = value;
    }

}
