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
 * <p>Java class for Number1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Number1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NbId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max3NumericText"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}GenericIdentification7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number1Choice", propOrder = {
    "nbId",
    "prtry"
})
public class Number1Choice {

    @XmlElement(name = "NbId")
    protected String nbId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification7 prtry;

    /**
     * Gets the value of the nbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbId() {
        return nbId;
    }

    /**
     * Sets the value of the nbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbId(String value) {
        this.nbId = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification7 }
     *     
     */
    public GenericIdentification7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification7 }
     *     
     */
    public void setPrtry(GenericIdentification7 value) {
        this.prtry = value;
    }

}
