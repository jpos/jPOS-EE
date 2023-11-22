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

package org.jpos.iso20022.cain_002_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddendumData4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AddendumData4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Fleet" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}FleetData5" minOccurs="0"/>
 *         <element name="Instlmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}Instalment4" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddendumData4", propOrder = {
    "fleet",
    "instlmt",
    "addtlData"
})
public class AddendumData4 {

    @XmlElement(name = "Fleet")
    protected FleetData5 fleet;
    @XmlElement(name = "Instlmt")
    protected Instalment4 instlmt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the fleet property.
     * 
     * @return
     *     possible object is
     *     {@link FleetData5 }
     *     
     */
    public FleetData5 getFleet() {
        return fleet;
    }

    /**
     * Sets the value of the fleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetData5 }
     *     
     */
    public void setFleet(FleetData5 value) {
        this.fleet = value;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link Instalment4 }
     *     
     */
    public Instalment4 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instalment4 }
     *     
     */
    public void setInstlmt(Instalment4 value) {
        this.instlmt = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
