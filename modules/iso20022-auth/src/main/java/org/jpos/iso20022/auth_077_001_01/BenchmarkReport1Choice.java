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

package org.jpos.iso20022.auth_077_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkReport1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BenchmarkReport1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cret" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}BenchmarkCreate1"/>
 *         <element name="Upd" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}BenchmarkUpdate1"/>
 *         <element name="Cxl" type="{urn:iso:std:iso:20022:tech:xsd:auth.077.001.01}BenchmarkCancellation1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkReport1Choice", propOrder = {
    "cret",
    "upd",
    "cxl"
})
public class BenchmarkReport1Choice {

    @XmlElement(name = "Cret")
    protected BenchmarkCreate1 cret;
    @XmlElement(name = "Upd")
    protected BenchmarkUpdate1 upd;
    @XmlElement(name = "Cxl")
    protected BenchmarkCancellation1 cxl;

    /**
     * Gets the value of the cret property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCreate1 }
     *     
     */
    public BenchmarkCreate1 getCret() {
        return cret;
    }

    /**
     * Sets the value of the cret property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCreate1 }
     *     
     */
    public void setCret(BenchmarkCreate1 value) {
        this.cret = value;
    }

    /**
     * Gets the value of the upd property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkUpdate1 }
     *     
     */
    public BenchmarkUpdate1 getUpd() {
        return upd;
    }

    /**
     * Sets the value of the upd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkUpdate1 }
     *     
     */
    public void setUpd(BenchmarkUpdate1 value) {
        this.upd = value;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCancellation1 }
     *     
     */
    public BenchmarkCancellation1 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCancellation1 }
     *     
     */
    public void setCxl(BenchmarkCancellation1 value) {
        this.cxl = value;
    }

}
