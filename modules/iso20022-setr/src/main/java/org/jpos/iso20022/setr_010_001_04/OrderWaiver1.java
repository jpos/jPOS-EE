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

package org.jpos.iso20022.setr_010_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderWaiver1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderWaiver1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrdrWvrRsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}OrderWaiverReason3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InfVal" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderWaiver1", propOrder = {
    "ordrWvrRsn",
    "infVal"
})
public class OrderWaiver1 {

    @XmlElement(name = "OrdrWvrRsn")
    protected List<OrderWaiverReason3Choice> ordrWvrRsn;
    @XmlElement(name = "InfVal")
    protected String infVal;

    /**
     * Gets the value of the ordrWvrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrWvrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrWvrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderWaiverReason3Choice }
     * 
     * 
     * @return
     *     The value of the ordrWvrRsn property.
     */
    public List<OrderWaiverReason3Choice> getOrdrWvrRsn() {
        if (ordrWvrRsn == null) {
            ordrWvrRsn = new ArrayList<>();
        }
        return this.ordrWvrRsn;
    }

    /**
     * Gets the value of the infVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfVal() {
        return infVal;
    }

    /**
     * Sets the value of the infVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfVal(String value) {
        this.infVal = value;
    }

}
