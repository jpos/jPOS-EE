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

package org.jpos.iso20022.caad_008_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelAgency3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TravelAgency3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cpny" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PartyIdentification261" minOccurs="0"/>
 *         <element name="TrvlPackg" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TravelAgencyPackage1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgency3", propOrder = {
    "cpny",
    "trvlPackg",
    "addtlData"
})
public class TravelAgency3 {

    @XmlElement(name = "Cpny")
    protected PartyIdentification261 cpny;
    @XmlElement(name = "TrvlPackg")
    protected List<TravelAgencyPackage1> trvlPackg;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the cpny property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification261 }
     *     
     */
    public PartyIdentification261 getCpny() {
        return cpny;
    }

    /**
     * Sets the value of the cpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification261 }
     *     
     */
    public void setCpny(PartyIdentification261 value) {
        this.cpny = value;
    }

    /**
     * Gets the value of the trvlPackg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trvlPackg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrvlPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelAgencyPackage1 }
     * 
     * 
     * @return
     *     The value of the trvlPackg property.
     */
    public List<TravelAgencyPackage1> getTrvlPackg() {
        if (trvlPackg == null) {
            trvlPackg = new ArrayList<>();
        }
        return this.trvlPackg;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
