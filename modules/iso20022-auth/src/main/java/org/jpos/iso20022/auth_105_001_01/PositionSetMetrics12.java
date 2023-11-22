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

package org.jpos.iso20022.auth_105_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetMetrics12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetMetrics12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VolMtrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}VolumeMetrics6" minOccurs="0"/>
 *         <element name="HrcutOrMrgn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="QtyOrNmnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}QuantityNominalValue2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetMetrics12", propOrder = {
    "volMtrcs",
    "hrcutOrMrgn",
    "qtyOrNmnlAmt"
})
public class PositionSetMetrics12 {

    @XmlElement(name = "VolMtrcs")
    protected VolumeMetrics6 volMtrcs;
    @XmlElement(name = "HrcutOrMrgn")
    protected BigDecimal hrcutOrMrgn;
    @XmlElement(name = "QtyOrNmnlAmt")
    protected QuantityNominalValue2Choice qtyOrNmnlAmt;

    /**
     * Gets the value of the volMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMetrics6 }
     *     
     */
    public VolumeMetrics6 getVolMtrcs() {
        return volMtrcs;
    }

    /**
     * Sets the value of the volMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMetrics6 }
     *     
     */
    public void setVolMtrcs(VolumeMetrics6 value) {
        this.volMtrcs = value;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcutOrMrgn(BigDecimal value) {
        this.hrcutOrMrgn = value;
    }

    /**
     * Gets the value of the qtyOrNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public QuantityNominalValue2Choice getQtyOrNmnlAmt() {
        return qtyOrNmnlAmt;
    }

    /**
     * Sets the value of the qtyOrNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public void setQtyOrNmnlAmt(QuantityNominalValue2Choice value) {
        this.qtyOrNmnlAmt = value;
    }

}
