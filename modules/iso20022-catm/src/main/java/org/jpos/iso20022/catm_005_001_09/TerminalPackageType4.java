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

package org.jpos.iso20022.catm_005_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalPackageType4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TerminalPackageType4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POICmpntId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PointOfInteractionComponentIdentification2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Packg" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PackageType4" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalPackageType4", propOrder = {
    "poiCmpntId",
    "packg"
})
public class TerminalPackageType4 {

    @XmlElement(name = "POICmpntId")
    protected List<PointOfInteractionComponentIdentification2> poiCmpntId;
    @XmlElement(name = "Packg", required = true)
    protected List<PackageType4> packg;

    /**
     * Gets the value of the poiCmpntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiCmpntId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpntId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponentIdentification2 }
     * 
     * 
     * @return
     *     The value of the poiCmpntId property.
     */
    public List<PointOfInteractionComponentIdentification2> getPOICmpntId() {
        if (poiCmpntId == null) {
            poiCmpntId = new ArrayList<>();
        }
        return this.poiCmpntId;
    }

    /**
     * Gets the value of the packg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType4 }
     * 
     * 
     * @return
     *     The value of the packg property.
     */
    public List<PackageType4> getPackg() {
        if (packg == null) {
            packg = new ArrayList<>();
        }
        return this.packg;
    }

}
