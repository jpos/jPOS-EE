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

package org.jpos.iso20022.tsmt_018_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Charge24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Charge24">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}FreightCharges1Code"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}ChargesDetails3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge24", propOrder = {
    "tp",
    "chrgs"
})
public class Charge24 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected FreightCharges1Code tp;
    @XmlElement(name = "Chrgs")
    protected List<ChargesDetails3> chrgs;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCharges1Code }
     *     
     */
    public FreightCharges1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCharges1Code }
     *     
     */
    public void setTp(FreightCharges1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesDetails3 }
     * 
     * 
     * @return
     *     The value of the chrgs property.
     */
    public List<ChargesDetails3> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<>();
        }
        return this.chrgs;
    }

}
