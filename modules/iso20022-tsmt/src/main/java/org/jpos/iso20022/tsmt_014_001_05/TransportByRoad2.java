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
 * <p>Java class for TransportByRoad2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportByRoad2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlcOfRct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max35Text"/>
 *         <element name="PlcOfDlvry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max35Text"/>
 *         <element name="RoadCrrierNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByRoad2", propOrder = {
    "plcOfRct",
    "plcOfDlvry",
    "roadCrrierNm"
})
public class TransportByRoad2 {

    @XmlElement(name = "PlcOfRct", required = true)
    protected String plcOfRct;
    @XmlElement(name = "PlcOfDlvry", required = true)
    protected String plcOfDlvry;
    @XmlElement(name = "RoadCrrierNm")
    protected String roadCrrierNm;

    /**
     * Gets the value of the plcOfRct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfRct() {
        return plcOfRct;
    }

    /**
     * Sets the value of the plcOfRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcOfRct(String value) {
        this.plcOfRct = value;
    }

    /**
     * Gets the value of the plcOfDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfDlvry() {
        return plcOfDlvry;
    }

    /**
     * Sets the value of the plcOfDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcOfDlvry(String value) {
        this.plcOfDlvry = value;
    }

    /**
     * Gets the value of the roadCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadCrrierNm() {
        return roadCrrierNm;
    }

    /**
     * Sets the value of the roadCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadCrrierNm(String value) {
        this.roadCrrierNm = value;
    }

}
