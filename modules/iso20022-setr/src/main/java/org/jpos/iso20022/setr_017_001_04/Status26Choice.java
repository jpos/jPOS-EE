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

package org.jpos.iso20022.setr_017_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status26Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status26Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CxlStsRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}OrderStatusAndReason9"/>
 *         <element name="IndvCxlStsRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}IndividualOrderStatusAndReason8" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status26Choice", propOrder = {
    "cxlStsRpt",
    "indvCxlStsRpt"
})
public class Status26Choice {

    @XmlElement(name = "CxlStsRpt")
    protected OrderStatusAndReason9 cxlStsRpt;
    @XmlElement(name = "IndvCxlStsRpt")
    protected List<IndividualOrderStatusAndReason8> indvCxlStsRpt;

    /**
     * Gets the value of the cxlStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason9 }
     *     
     */
    public OrderStatusAndReason9 getCxlStsRpt() {
        return cxlStsRpt;
    }

    /**
     * Sets the value of the cxlStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason9 }
     *     
     */
    public void setCxlStsRpt(OrderStatusAndReason9 value) {
        this.cxlStsRpt = value;
    }

    /**
     * Gets the value of the indvCxlStsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvCxlStsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvCxlStsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderStatusAndReason8 }
     * 
     * 
     * @return
     *     The value of the indvCxlStsRpt property.
     */
    public List<IndividualOrderStatusAndReason8> getIndvCxlStsRpt() {
        if (indvCxlStsRpt == null) {
            indvCxlStsRpt = new ArrayList<>();
        }
        return this.indvCxlStsRpt;
    }

}
