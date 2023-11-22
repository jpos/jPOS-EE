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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberCount1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NumberCount1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CurInstrNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Exact3NumericText"/>
 *         <element name="TtlNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TotalNumber1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberCount1Choice", propOrder = {
    "curInstrNb",
    "ttlNb"
})
public class NumberCount1Choice {

    @XmlElement(name = "CurInstrNb")
    protected String curInstrNb;
    @XmlElement(name = "TtlNb")
    protected TotalNumber1 ttlNb;

    /**
     * Gets the value of the curInstrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurInstrNb() {
        return curInstrNb;
    }

    /**
     * Sets the value of the curInstrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurInstrNb(String value) {
        this.curInstrNb = value;
    }

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link TotalNumber1 }
     *     
     */
    public TotalNumber1 getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalNumber1 }
     *     
     */
    public void setTtlNb(TotalNumber1 value) {
        this.ttlNb = value;
    }

}
