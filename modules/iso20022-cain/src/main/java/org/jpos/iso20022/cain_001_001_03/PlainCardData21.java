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

package org.jpos.iso20022.cain_001_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlainCardData21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PlainCardData21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DrvrOrVhclId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max20Text" minOccurs="0"/>
 *         <element name="AddtlCardData" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData21", propOrder = {
    "drvrOrVhclId",
    "addtlCardData"
})
public class PlainCardData21 {

    @XmlElement(name = "DrvrOrVhclId")
    protected String drvrOrVhclId;
    @XmlElement(name = "AddtlCardData")
    protected List<AdditionalData1> addtlCardData;

    /**
     * Gets the value of the drvrOrVhclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrOrVhclId() {
        return drvrOrVhclId;
    }

    /**
     * Sets the value of the drvrOrVhclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrOrVhclId(String value) {
        this.drvrOrVhclId = value;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlCardData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlCardData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlCardData property.
     */
    public List<AdditionalData1> getAddtlCardData() {
        if (addtlCardData == null) {
            addtlCardData = new ArrayList<>();
        }
        return this.addtlCardData;
    }

}
