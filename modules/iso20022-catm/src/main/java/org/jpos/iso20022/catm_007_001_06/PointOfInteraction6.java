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

package org.jpos.iso20022.catm_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteraction6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteraction6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ManfctrIdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max35Text"/>
 *         <element name="Mdl" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max35Text"/>
 *         <element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteraction6", propOrder = {
    "manfctrIdr",
    "mdl",
    "srlNb"
})
public class PointOfInteraction6 {

    @XmlElement(name = "ManfctrIdr", required = true)
    protected String manfctrIdr;
    @XmlElement(name = "Mdl", required = true)
    protected String mdl;
    @XmlElement(name = "SrlNb", required = true)
    protected String srlNb;

    /**
     * Gets the value of the manfctrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrIdr() {
        return manfctrIdr;
    }

    /**
     * Sets the value of the manfctrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctrIdr(String value) {
        this.manfctrIdr = value;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdl(String value) {
        this.mdl = value;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

}
