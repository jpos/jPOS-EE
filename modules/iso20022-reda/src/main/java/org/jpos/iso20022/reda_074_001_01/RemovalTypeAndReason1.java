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

package org.jpos.iso20022.reda_074_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemovalTypeAndReason1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RemovalTypeAndReason1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RmvlTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Removal1Choice"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}GenericIdentification30" minOccurs="0"/>
 *         <element name="ExclsnPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}DateOrDateTimePeriod3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovalTypeAndReason1", propOrder = {
    "rmvlTp",
    "rsn",
    "exclsnPrd"
})
public class RemovalTypeAndReason1 {

    @XmlElement(name = "RmvlTp", required = true)
    protected Removal1Choice rmvlTp;
    @XmlElement(name = "Rsn")
    protected GenericIdentification30 rsn;
    @XmlElement(name = "ExclsnPrd")
    protected DateOrDateTimePeriod3Choice exclsnPrd;

    /**
     * Gets the value of the rmvlTp property.
     * 
     * @return
     *     possible object is
     *     {@link Removal1Choice }
     *     
     */
    public Removal1Choice getRmvlTp() {
        return rmvlTp;
    }

    /**
     * Sets the value of the rmvlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Removal1Choice }
     *     
     */
    public void setRmvlTp(Removal1Choice value) {
        this.rmvlTp = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setRsn(GenericIdentification30 value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the exclsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod3Choice }
     *     
     */
    public DateOrDateTimePeriod3Choice getExclsnPrd() {
        return exclsnPrd;
    }

    /**
     * Sets the value of the exclsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod3Choice }
     *     
     */
    public void setExclsnPrd(DateOrDateTimePeriod3Choice value) {
        this.exclsnPrd = value;
    }

}
