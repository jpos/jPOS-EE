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

package org.jpos.iso20022.semt_006_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaginationBalance2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaginationBalance2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OpngBal" type="{urn:swift:xsd:semt.006.001.03}OpeningBalance3Choice" minOccurs="0"/>
 *         <element name="ClsgBal" type="{urn:swift:xsd:semt.006.001.03}ClosingBalance3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginationBalance2", propOrder = {
    "opngBal",
    "clsgBal"
})
public class PaginationBalance2 {

    @XmlElement(name = "OpngBal")
    protected OpeningBalance3Choice opngBal;
    @XmlElement(name = "ClsgBal")
    protected ClosingBalance3Choice clsgBal;

    /**
     * Gets the value of the opngBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningBalance3Choice }
     *     
     */
    public OpeningBalance3Choice getOpngBal() {
        return opngBal;
    }

    /**
     * Sets the value of the opngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningBalance3Choice }
     *     
     */
    public void setOpngBal(OpeningBalance3Choice value) {
        this.opngBal = value;
    }

    /**
     * Gets the value of the clsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingBalance3Choice }
     *     
     */
    public ClosingBalance3Choice getClsgBal() {
        return clsgBal;
    }

    /**
     * Sets the value of the clsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingBalance3Choice }
     *     
     */
    public void setClsgBal(ClosingBalance3Choice value) {
        this.clsgBal = value;
    }

}
