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

package org.jpos.iso20022.tsmt_012_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportBySea6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportBySea6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PortOfLoadng" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PortOfDschrge" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max35Text" maxOccurs="unbounded"/>
 *         <element name="VsslNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SeaCrrierNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SeaCrrierCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}CountryCode" minOccurs="0"/>
 *         <element name="CrrierAgtNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max70Text" minOccurs="0"/>
 *         <element name="CrrierAgtCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportBySea6", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm",
    "seaCrrierNm",
    "seaCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry"
})
public class TransportBySea6 {

    @XmlElement(name = "PortOfLoadng")
    protected List<String> portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected List<String> portOfDschrge;
    @XmlElement(name = "VsslNm")
    protected String vsslNm;
    @XmlElement(name = "SeaCrrierNm")
    protected String seaCrrierNm;
    @XmlElement(name = "SeaCrrierCtry")
    protected String seaCrrierCtry;
    @XmlElement(name = "CrrierAgtNm")
    protected String crrierAgtNm;
    @XmlElement(name = "CrrierAgtCtry")
    protected String crrierAgtCtry;

    /**
     * Gets the value of the portOfLoadng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the portOfLoadng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortOfLoadng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the portOfLoadng property.
     */
    public List<String> getPortOfLoadng() {
        if (portOfLoadng == null) {
            portOfLoadng = new ArrayList<>();
        }
        return this.portOfLoadng;
    }

    /**
     * Gets the value of the portOfDschrge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the portOfDschrge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortOfDschrge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the portOfDschrge property.
     */
    public List<String> getPortOfDschrge() {
        if (portOfDschrge == null) {
            portOfDschrge = new ArrayList<>();
        }
        return this.portOfDschrge;
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

    /**
     * Gets the value of the seaCrrierCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaCrrierCtry() {
        return seaCrrierCtry;
    }

    /**
     * Sets the value of the seaCrrierCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeaCrrierCtry(String value) {
        this.seaCrrierCtry = value;
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
