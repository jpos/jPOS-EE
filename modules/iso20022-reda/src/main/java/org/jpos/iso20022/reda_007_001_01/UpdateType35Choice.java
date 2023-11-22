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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateType35Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdateType35Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Add" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityAttributes12"/>
 *         <element name="Del" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityAttributes12"/>
 *         <element name="Modfy" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityAttributes12"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType35Choice", propOrder = {
    "add",
    "del",
    "modfy"
})
public class UpdateType35Choice {

    @XmlElement(name = "Add")
    protected SecurityAttributes12 add;
    @XmlElement(name = "Del")
    protected SecurityAttributes12 del;
    @XmlElement(name = "Modfy")
    protected SecurityAttributes12 modfy;

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public SecurityAttributes12 getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public void setAdd(SecurityAttributes12 value) {
        this.add = value;
    }

    /**
     * Gets the value of the del property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public SecurityAttributes12 getDel() {
        return del;
    }

    /**
     * Sets the value of the del property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public void setDel(SecurityAttributes12 value) {
        this.del = value;
    }

    /**
     * Gets the value of the modfy property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public SecurityAttributes12 getModfy() {
        return modfy;
    }

    /**
     * Sets the value of the modfy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public void setModfy(SecurityAttributes12 value) {
        this.modfy = value;
    }

}
