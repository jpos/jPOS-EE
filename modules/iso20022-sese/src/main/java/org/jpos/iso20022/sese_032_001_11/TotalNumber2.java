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

package org.jpos.iso20022.sese_032_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalNumber2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalNumber2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurInstrNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}Max6NumericText"/>
 *         <element name="TtlOfLkdInstrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.001.11}Max6NumericText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalNumber2", propOrder = {
    "curInstrNb",
    "ttlOfLkdInstrs"
})
public class TotalNumber2 {

    @XmlElement(name = "CurInstrNb", required = true)
    protected String curInstrNb;
    @XmlElement(name = "TtlOfLkdInstrs", required = true)
    protected String ttlOfLkdInstrs;

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
     * Gets the value of the ttlOfLkdInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlOfLkdInstrs() {
        return ttlOfLkdInstrs;
    }

    /**
     * Sets the value of the ttlOfLkdInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlOfLkdInstrs(String value) {
        this.ttlOfLkdInstrs = value;
    }

}
