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

package org.jpos.iso20022.camt_071_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderOrAll3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingOrderOrAll3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StgOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.071.001.04}StandingOrderIdentification6" maxOccurs="unbounded"/>
 *         <element name="AllStgOrdrs" type="{urn:iso:std:iso:20022:tech:xsd:camt.071.001.04}StandingOrderIdentification7" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderOrAll3Choice", propOrder = {
    "stgOrdr",
    "allStgOrdrs"
})
public class StandingOrderOrAll3Choice {

    @XmlElement(name = "StgOrdr")
    protected List<StandingOrderIdentification6> stgOrdr;
    @XmlElement(name = "AllStgOrdrs")
    protected List<StandingOrderIdentification7> allStgOrdrs;

    /**
     * Gets the value of the stgOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stgOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStgOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandingOrderIdentification6 }
     * 
     * 
     * @return
     *     The value of the stgOrdr property.
     */
    public List<StandingOrderIdentification6> getStgOrdr() {
        if (stgOrdr == null) {
            stgOrdr = new ArrayList<>();
        }
        return this.stgOrdr;
    }

    /**
     * Gets the value of the allStgOrdrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allStgOrdrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllStgOrdrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandingOrderIdentification7 }
     * 
     * 
     * @return
     *     The value of the allStgOrdrs property.
     */
    public List<StandingOrderIdentification7> getAllStgOrdrs() {
        if (allStgOrdrs == null) {
            allStgOrdrs = new ArrayList<>();
        }
        return this.allStgOrdrs;
    }

}
