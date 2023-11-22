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

package org.jpos.iso20022.tsmt_009_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportByRoad5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportByRoad5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlcOfRct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PlcOfDlvry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}Max35Text" maxOccurs="unbounded"/>
 *         <element name="RoadCrrierNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}Max70Text" minOccurs="0"/>
 *         <element name="RoadCrrierCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}CountryCode" minOccurs="0"/>
 *         <element name="CrrierAgtNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}Max70Text" minOccurs="0"/>
 *         <element name="CrrierAgtCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.009.001.05}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByRoad5", propOrder = {
    "plcOfRct",
    "plcOfDlvry",
    "roadCrrierNm",
    "roadCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry"
})
public class TransportByRoad5 {

    @XmlElement(name = "PlcOfRct")
    protected List<String> plcOfRct;
    @XmlElement(name = "PlcOfDlvry", required = true)
    protected List<String> plcOfDlvry;
    @XmlElement(name = "RoadCrrierNm")
    protected String roadCrrierNm;
    @XmlElement(name = "RoadCrrierCtry")
    protected String roadCrrierCtry;
    @XmlElement(name = "CrrierAgtNm")
    protected String crrierAgtNm;
    @XmlElement(name = "CrrierAgtCtry")
    protected String crrierAgtCtry;

    /**
     * Gets the value of the plcOfRct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the plcOfRct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the plcOfRct property.
     */
    public List<String> getPlcOfRct() {
        if (plcOfRct == null) {
            plcOfRct = new ArrayList<>();
        }
        return this.plcOfRct;
    }

    /**
     * Gets the value of the plcOfDlvry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the plcOfDlvry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfDlvry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the plcOfDlvry property.
     */
    public List<String> getPlcOfDlvry() {
        if (plcOfDlvry == null) {
            plcOfDlvry = new ArrayList<>();
        }
        return this.plcOfDlvry;
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

    /**
     * Gets the value of the roadCrrierCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadCrrierCtry() {
        return roadCrrierCtry;
    }

    /**
     * Sets the value of the roadCrrierCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadCrrierCtry(String value) {
        this.roadCrrierCtry = value;
    }

    /**
     * Gets the value of the crrierAgtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtNm() {
        return crrierAgtNm;
    }

    /**
     * Sets the value of the crrierAgtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrrierAgtNm(String value) {
        this.crrierAgtNm = value;
    }

    /**
     * Gets the value of the crrierAgtCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtCtry() {
        return crrierAgtCtry;
    }

    /**
     * Sets the value of the crrierAgtCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrrierAgtCtry(String value) {
        this.crrierAgtCtry = value;
    }

}
