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

package org.jpos.iso20022.camt_042_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataFormat2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DataFormat2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Strd" type="{urn:swift:xsd:camt.042.001.04}GenericIdentification1"/>
 *           <element name="Ustrd" type="{urn:swift:xsd:camt.042.001.04}Max140Text"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataFormat2Choice", propOrder = {
    "strd",
    "ustrd"
})
public class DataFormat2Choice {

    @XmlElement(name = "Strd")
    protected GenericIdentification1 strd;
    @XmlElement(name = "Ustrd")
    protected String ustrd;

    /**
     * Gets the value of the strd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getStrd() {
        return strd;
    }

    /**
     * Sets the value of the strd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setStrd(GenericIdentification1 value) {
        this.strd = value;
    }

    /**
     * Gets the value of the ustrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUstrd() {
        return ustrd;
    }

    /**
     * Sets the value of the ustrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUstrd(String value) {
        this.ustrd = value;
    }

}
