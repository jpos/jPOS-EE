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

package org.jpos.iso20022.tsmt_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportBySea4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportBySea4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PortOfLoadng" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text"/>
 *         <element name="PortOfDschrge" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text"/>
 *         <element name="VsslNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SeaCrrierNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportBySea4", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm",
    "seaCrrierNm"
})
public class TransportBySea4 {

    @XmlElement(name = "PortOfLoadng", required = true)
    protected String portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected String portOfDschrge;
    @XmlElement(name = "VsslNm")
    protected String vsslNm;
    @XmlElement(name = "SeaCrrierNm")
    protected String seaCrrierNm;

    /**
     * Gets the value of the portOfLoadng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfLoadng() {
        return portOfLoadng;
    }

    /**
     * Sets the value of the portOfLoadng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfLoadng(String value) {
        this.portOfLoadng = value;
    }

    /**
     * Gets the value of the portOfDschrge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfDschrge() {
        return portOfDschrge;
    }

    /**
     * Sets the value of the portOfDschrge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfDschrge(String value) {
        this.portOfDschrge = value;
    }

    /**
     * Gets the value of the vsslNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsslNm() {
        return vsslNm;
    }

    /**
     * Sets the value of the vsslNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsslNm(String value) {
        this.vsslNm = value;
    }

    /**
     * Gets the value of the seaCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaCrrierNm() {
        return seaCrrierNm;
    }

    /**
     * Sets the value of the seaCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeaCrrierNm(String value) {
        this.seaCrrierNm = value;
    }

}
