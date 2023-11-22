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

package org.jpos.iso20022.camt_042_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Charge26 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Charge26">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:swift:xsd:camt.042.001.04}ChargeType4Choice"/>
 *         <element name="ChrgApld" type="{urn:swift:xsd:camt.042.001.04}AmountOrRate3Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge26", propOrder = {
    "tp",
    "chrgApld"
})
public class Charge26 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType4Choice tp;
    @XmlElement(name = "ChrgApld", required = true)
    protected AmountOrRate3Choice chrgApld;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType4Choice }
     *     
     */
    public ChargeType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType4Choice }
     *     
     */
    public void setTp(ChargeType4Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the chrgApld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public AmountOrRate3Choice getChrgApld() {
        return chrgApld;
    }

    /**
     * Sets the value of the chrgApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public void setChrgApld(AmountOrRate3Choice value) {
        this.chrgApld = value;
    }

}
