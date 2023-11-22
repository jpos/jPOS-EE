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

package org.jpos.iso20022.tsmt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleTransport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SingleTransport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrnsprtByAir" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportByAir2" minOccurs="0"/>
 *         <element name="TrnsprtBySea" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportBySea4" minOccurs="0"/>
 *         <element name="TrnsprtByRoad" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportByRoad2" minOccurs="0"/>
 *         <element name="TrnsprtByRail" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}TransportByRail2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleTransport3", propOrder = {
    "trnsprtByAir",
    "trnsprtBySea",
    "trnsprtByRoad",
    "trnsprtByRail"
})
public class SingleTransport3 {

    @XmlElement(name = "TrnsprtByAir")
    protected TransportByAir2 trnsprtByAir;
    @XmlElement(name = "TrnsprtBySea")
    protected TransportBySea4 trnsprtBySea;
    @XmlElement(name = "TrnsprtByRoad")
    protected TransportByRoad2 trnsprtByRoad;
    @XmlElement(name = "TrnsprtByRail")
    protected TransportByRail2 trnsprtByRail;

    /**
     * Gets the value of the trnsprtByAir property.
     * 
     * @return
     *     possible object is
     *     {@link TransportByAir2 }
     *     
     */
    public TransportByAir2 getTrnsprtByAir() {
        return trnsprtByAir;
    }

    /**
     * Sets the value of the trnsprtByAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportByAir2 }
     *     
     */
    public void setTrnsprtByAir(TransportByAir2 value) {
        this.trnsprtByAir = value;
    }

    /**
     * Gets the value of the trnsprtBySea property.
     * 
     * @return
     *     possible object is
     *     {@link TransportBySea4 }
     *     
     */
    public TransportBySea4 getTrnsprtBySea() {
        return trnsprtBySea;
    }

    /**
     * Sets the value of the trnsprtBySea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportBySea4 }
     *     
     */
    public void setTrnsprtBySea(TransportBySea4 value) {
        this.trnsprtBySea = value;
    }

    /**
     * Gets the value of the trnsprtByRoad property.
     * 
     * @return
     *     possible object is
     *     {@link TransportByRoad2 }
     *     
     */
    public TransportByRoad2 getTrnsprtByRoad() {
        return trnsprtByRoad;
    }

    /**
     * Sets the value of the trnsprtByRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportByRoad2 }
     *     
     */
    public void setTrnsprtByRoad(TransportByRoad2 value) {
        this.trnsprtByRoad = value;
    }

    /**
     * Gets the value of the trnsprtByRail property.
     * 
     * @return
     *     possible object is
     *     {@link TransportByRail2 }
     *     
     */
    public TransportByRail2 getTrnsprtByRail() {
        return trnsprtByRail;
    }

    /**
     * Sets the value of the trnsprtByRail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportByRail2 }
     *     
     */
    public void setTrnsprtByRail(TransportByRail2 value) {
        this.trnsprtByRail = value;
    }

}
