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

package org.jpos.iso20022.colr_003_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedCollateralMovement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExpectedCollateralMovement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dlvry" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}CollateralMovement9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rtr" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}CollateralMovement9" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedCollateralMovement2", propOrder = {
    "dlvry",
    "rtr"
})
public class ExpectedCollateralMovement2 {

    @XmlElement(name = "Dlvry")
    protected List<CollateralMovement9> dlvry;
    @XmlElement(name = "Rtr")
    protected List<CollateralMovement9> rtr;

    /**
     * Gets the value of the dlvry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralMovement9 }
     * 
     * 
     * @return
     *     The value of the dlvry property.
     */
    public List<CollateralMovement9> getDlvry() {
        if (dlvry == null) {
            dlvry = new ArrayList<>();
        }
        return this.dlvry;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralMovement9 }
     * 
     * 
     * @return
     *     The value of the rtr property.
     */
    public List<CollateralMovement9> getRtr() {
        if (rtr == null) {
            rtr = new ArrayList<>();
        }
        return this.rtr;
    }

}
