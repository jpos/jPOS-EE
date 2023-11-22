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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StressedProduct1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StressedProduct1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}GenericIdentification168"/>
 *         <element name="MaxStrssSz" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}StressSize1Choice"/>
 *         <element name="MinStrssSz" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}StressSize1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressedProduct1", propOrder = {
    "id",
    "maxStrssSz",
    "minStrssSz"
})
public class StressedProduct1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification168 id;
    @XmlElement(name = "MaxStrssSz", required = true)
    protected StressSize1Choice maxStrssSz;
    @XmlElement(name = "MinStrssSz", required = true)
    protected StressSize1Choice minStrssSz;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public void setId(GenericIdentification168 value) {
        this.id = value;
    }

    /**
     * Gets the value of the maxStrssSz property.
     * 
     * @return
     *     possible object is
     *     {@link StressSize1Choice }
     *     
     */
    public StressSize1Choice getMaxStrssSz() {
        return maxStrssSz;
    }

    /**
     * Sets the value of the maxStrssSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressSize1Choice }
     *     
     */
    public void setMaxStrssSz(StressSize1Choice value) {
        this.maxStrssSz = value;
    }

    /**
     * Gets the value of the minStrssSz property.
     * 
     * @return
     *     possible object is
     *     {@link StressSize1Choice }
     *     
     */
    public StressSize1Choice getMinStrssSz() {
        return minStrssSz;
    }

    /**
     * Sets the value of the minStrssSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressSize1Choice }
     *     
     */
    public void setMinStrssSz(StressSize1Choice value) {
        this.minStrssSz = value;
    }

}
