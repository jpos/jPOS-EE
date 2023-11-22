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

package org.jpos.iso20022.tsmt_015_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Replacement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Replacement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurVal" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Max350Text"/>
 *         <element name="PropsdVal" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03}Max350Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Replacement2", propOrder = {
    "curVal",
    "propsdVal"
})
public class Replacement2 {

    @XmlElement(name = "CurVal", required = true)
    protected String curVal;
    @XmlElement(name = "PropsdVal", required = true)
    protected String propsdVal;

    /**
     * Gets the value of the curVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurVal() {
        return curVal;
    }

    /**
     * Sets the value of the curVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurVal(String value) {
        this.curVal = value;
    }

    /**
     * Gets the value of the propsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropsdVal() {
        return propsdVal;
    }

    /**
     * Sets the value of the propsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropsdVal(String value) {
        this.propsdVal = value;
    }

}
