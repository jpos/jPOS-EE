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

package org.jpos.iso20022.setr_030_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Clearing6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Clearing6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}PartyIdentificationAndAccount219" maxOccurs="unbounded"/>
 *         <element name="ClrSgmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}PartyIdentification243Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clearing6", propOrder = {
    "clrMmb",
    "clrSgmt"
})
public class Clearing6 {

    @XmlElement(name = "ClrMmb", required = true)
    protected List<PartyIdentificationAndAccount219> clrMmb;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification243Choice clrSgmt;

    /**
     * Gets the value of the clrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clrMmb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrMmb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount219 }
     * 
     * 
     * @return
     *     The value of the clrMmb property.
     */
    public List<PartyIdentificationAndAccount219> getClrMmb() {
        if (clrMmb == null) {
            clrMmb = new ArrayList<>();
        }
        return this.clrMmb;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification243Choice }
     *     
     */
    public PartyIdentification243Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification243Choice }
     *     
     */
    public void setClrSgmt(PartyIdentification243Choice value) {
        this.clrSgmt = value;
    }

}
