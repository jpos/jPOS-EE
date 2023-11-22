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

package org.jpos.iso20022.auth_057_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StressSize1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StressSize1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rltv" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}BaseOneRate"/>
 *         <element name="Abs" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}Absolute1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressSize1Choice", propOrder = {
    "rltv",
    "abs"
})
public class StressSize1Choice {

    @XmlElement(name = "Rltv")
    protected BigDecimal rltv;
    @XmlElement(name = "Abs")
    protected Absolute1 abs;

    /**
     * Gets the value of the rltv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRltv() {
        return rltv;
    }

    /**
     * Sets the value of the rltv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRltv(BigDecimal value) {
        this.rltv = value;
    }

    /**
     * Gets the value of the abs property.
     * 
     * @return
     *     possible object is
     *     {@link Absolute1 }
     *     
     */
    public Absolute1 getAbs() {
        return abs;
    }

    /**
     * Sets the value of the abs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Absolute1 }
     *     
     */
    public void setAbs(Absolute1 value) {
        this.abs = value;
    }

}
