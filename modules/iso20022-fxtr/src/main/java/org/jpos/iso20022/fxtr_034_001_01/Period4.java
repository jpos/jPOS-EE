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

package org.jpos.iso20022.fxtr_034_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Period4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}DateFormat18Choice"/>
 *         <element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}DateFormat18Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period4", propOrder = {
    "startDt",
    "endDt"
})
public class Period4 {

    @XmlElement(name = "StartDt", required = true)
    protected DateFormat18Choice startDt;
    @XmlElement(name = "EndDt", required = true)
    protected DateFormat18Choice endDt;

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat18Choice }
     *     
     */
    public DateFormat18Choice getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat18Choice }
     *     
     */
    public void setStartDt(DateFormat18Choice value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat18Choice }
     *     
     */
    public DateFormat18Choice getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat18Choice }
     *     
     */
    public void setEndDt(DateFormat18Choice value) {
        this.endDt = value;
    }

}
