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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquityDerivative2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EquityDerivative2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UndrlygTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}EquityDerivative3Choice"/>
 *         <element name="Param" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}EquityReturnParameter1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityDerivative2", propOrder = {
    "undrlygTp",
    "param"
})
public class EquityDerivative2 {

    @XmlElement(name = "UndrlygTp", required = true)
    protected EquityDerivative3Choice undrlygTp;
    @XmlElement(name = "Param")
    @XmlSchemaType(name = "string")
    protected EquityReturnParameter1Code param;

    /**
     * Gets the value of the undrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link EquityDerivative3Choice }
     *     
     */
    public EquityDerivative3Choice getUndrlygTp() {
        return undrlygTp;
    }

    /**
     * Sets the value of the undrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityDerivative3Choice }
     *     
     */
    public void setUndrlygTp(EquityDerivative3Choice value) {
        this.undrlygTp = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link EquityReturnParameter1Code }
     *     
     */
    public EquityReturnParameter1Code getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityReturnParameter1Code }
     *     
     */
    public void setParam(EquityReturnParameter1Code value) {
        this.param = value;
    }

}
