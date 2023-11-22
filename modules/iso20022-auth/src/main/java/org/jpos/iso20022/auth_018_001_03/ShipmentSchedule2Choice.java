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

package org.jpos.iso20022.auth_018_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentSchedule2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShipmentSchedule2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ShipmntDtRg" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ShipmentDateRange1"/>
 *         <element name="ShipmntSubSchdl" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ShipmentDateRange2" maxOccurs="unbounded" minOccurs="2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentSchedule2Choice", propOrder = {
    "shipmntDtRg",
    "shipmntSubSchdl"
})
public class ShipmentSchedule2Choice {

    @XmlElement(name = "ShipmntDtRg")
    protected ShipmentDateRange1 shipmntDtRg;
    @XmlElement(name = "ShipmntSubSchdl")
    protected List<ShipmentDateRange2> shipmntSubSchdl;

    /**
     * Gets the value of the shipmntDtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public ShipmentDateRange1 getShipmntDtRg() {
        return shipmntDtRg;
    }

    /**
     * Sets the value of the shipmntDtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public void setShipmntDtRg(ShipmentDateRange1 value) {
        this.shipmntDtRg = value;
    }

    /**
     * Gets the value of the shipmntSubSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shipmntSubSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmntSubSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDateRange2 }
     * 
     * 
     * @return
     *     The value of the shipmntSubSchdl property.
     */
    public List<ShipmentDateRange2> getShipmntSubSchdl() {
        if (shipmntSubSchdl == null) {
            shipmntSubSchdl = new ArrayList<>();
        }
        return this.shipmntSubSchdl;
    }

}
