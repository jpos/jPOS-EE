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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdentification12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonIdentification12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtryOfBrnch" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}CountryCode"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}GenericPersonIdentification1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification12", propOrder = {
    "ctryOfBrnch",
    "othr"
})
public class PersonIdentification12 {

    @XmlElement(name = "CtryOfBrnch", required = true)
    protected String ctryOfBrnch;
    @XmlElement(name = "Othr", required = true)
    protected GenericPersonIdentification1 othr;

    /**
     * Gets the value of the ctryOfBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    /**
     * Sets the value of the ctryOfBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBrnch(String value) {
        this.ctryOfBrnch = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public GenericPersonIdentification1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public void setOthr(GenericPersonIdentification1 value) {
        this.othr = value;
    }

}
