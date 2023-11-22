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

package org.jpos.iso20022.cafr_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisputeData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PresntmntCycl" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Exact1NumericText" minOccurs="0"/>
 *         <element name="DsptCond" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="DsptRef" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}DisputeReference1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeData2", propOrder = {
    "presntmntCycl",
    "dsptCond",
    "dsptRef"
})
public class DisputeData2 {

    @XmlElement(name = "PresntmntCycl")
    protected String presntmntCycl;
    @XmlElement(name = "DsptCond")
    protected String dsptCond;
    @XmlElement(name = "DsptRef")
    protected List<DisputeReference1> dsptRef;

    /**
     * Gets the value of the presntmntCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntCycl() {
        return presntmntCycl;
    }

    /**
     * Sets the value of the presntmntCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresntmntCycl(String value) {
        this.presntmntCycl = value;
    }

    /**
     * Gets the value of the dsptCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptCond() {
        return dsptCond;
    }

    /**
     * Sets the value of the dsptCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsptCond(String value) {
        this.dsptCond = value;
    }

    /**
     * Gets the value of the dsptRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeReference1 }
     * 
     * 
     * @return
     *     The value of the dsptRef property.
     */
    public List<DisputeReference1> getDsptRef() {
        if (dsptRef == null) {
            dsptRef = new ArrayList<>();
        }
        return this.dsptRef;
    }

}
