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

package org.jpos.iso20022.reda_041_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLogSystemPartyType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdateLogSystemPartyType1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Od" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}SystemPartyType1Choice"/>
 *         <element name="New" type="{urn:iso:std:iso:20022:tech:xsd:reda.041.001.01}SystemPartyType1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogSystemPartyType1", propOrder = {
    "od",
    "_new"
})
public class UpdateLogSystemPartyType1 {

    @XmlElement(name = "Od", required = true)
    protected SystemPartyType1Choice od;
    @XmlElement(name = "New", required = true)
    protected SystemPartyType1Choice _new;

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public void setOd(SystemPartyType1Choice value) {
        this.od = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public void setNew(SystemPartyType1Choice value) {
        this._new = value;
    }

}
