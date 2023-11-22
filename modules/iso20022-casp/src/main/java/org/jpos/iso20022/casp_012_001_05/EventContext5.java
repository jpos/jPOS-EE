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

package org.jpos.iso20022.casp_012_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventContext5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EventContext5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.012.001.05}RetailerService1Code"/>
 *         <element name="CmpntId" type="{urn:iso:std:iso:20022:tech:xsd:casp.012.001.05}PointOfInteractionComponent14" minOccurs="0"/>
 *         <element name="SaleId" type="{urn:iso:std:iso:20022:tech:xsd:casp.012.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventContext5", propOrder = {
    "svcTp",
    "cmpntId",
    "saleId"
})
public class EventContext5 {

    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService1Code svcTp;
    @XmlElement(name = "CmpntId")
    protected PointOfInteractionComponent14 cmpntId;
    @XmlElement(name = "SaleId")
    protected String saleId;

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService1Code }
     *     
     */
    public RetailerService1Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService1Code }
     *     
     */
    public void setSvcTp(RetailerService1Code value) {
        this.svcTp = value;
    }

    /**
     * Gets the value of the cmpntId property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponent14 }
     *     
     */
    public PointOfInteractionComponent14 getCmpntId() {
        return cmpntId;
    }

    /**
     * Sets the value of the cmpntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponent14 }
     *     
     */
    public void setCmpntId(PointOfInteractionComponent14 value) {
        this.cmpntId = value;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

}
