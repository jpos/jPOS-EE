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
 * <p>Java class for Commission21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Commission21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ComssnTp" type="{urn:swift:xsd:camt.042.001.04}CommissionType5Choice"/>
 *         <element name="ComssnApld" type="{urn:swift:xsd:camt.042.001.04}AmountOrRate3Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission21", propOrder = {
    "comssnTp",
    "comssnApld"
})
public class Commission21 {

    @XmlElement(name = "ComssnTp", required = true)
    protected CommissionType5Choice comssnTp;
    @XmlElement(name = "ComssnApld", required = true)
    protected AmountOrRate3Choice comssnApld;

    /**
     * Gets the value of the comssnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType5Choice }
     *     
     */
    public CommissionType5Choice getComssnTp() {
        return comssnTp;
    }

    /**
     * Sets the value of the comssnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType5Choice }
     *     
     */
    public void setComssnTp(CommissionType5Choice value) {
        this.comssnTp = value;
    }

    /**
     * Gets the value of the comssnApld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public AmountOrRate3Choice getComssnApld() {
        return comssnApld;
    }

    /**
     * Sets the value of the comssnApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate3Choice }
     *     
     */
    public void setComssnApld(AmountOrRate3Choice value) {
        this.comssnApld = value;
    }

}
