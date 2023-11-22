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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCAStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FATCAStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FATCAStatus2Choice"/>
 *         <element name="Src" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FATCASource1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAStatus2", propOrder = {
    "tp",
    "src"
})
public class FATCAStatus2 {

    @XmlElement(name = "Tp", required = true)
    protected FATCAStatus2Choice tp;
    @XmlElement(name = "Src")
    protected FATCASource1Choice src;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAStatus2Choice }
     *     
     */
    public FATCAStatus2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAStatus2Choice }
     *     
     */
    public void setTp(FATCAStatus2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link FATCASource1Choice }
     *     
     */
    public FATCASource1Choice getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCASource1Choice }
     *     
     */
    public void setSrc(FATCASource1Choice value) {
        this.src = value;
    }

}
