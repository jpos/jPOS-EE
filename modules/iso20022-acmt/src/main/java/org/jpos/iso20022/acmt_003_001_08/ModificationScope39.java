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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationScope39 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModificationScope39">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModScpIndctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}DataModification2Code"/>
 *         <element name="Ctznsh" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}CitizenshipInformation2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationScope39", propOrder = {
    "modScpIndctn",
    "ctznsh"
})
public class ModificationScope39 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification2Code modScpIndctn;
    @XmlElement(name = "Ctznsh", required = true)
    protected CitizenshipInformation2 ctznsh;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification2Code }
     *     
     */
    public DataModification2Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification2Code }
     *     
     */
    public void setModScpIndctn(DataModification2Code value) {
        this.modScpIndctn = value;
    }

    /**
     * Gets the value of the ctznsh property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenshipInformation2 }
     *     
     */
    public CitizenshipInformation2 getCtznsh() {
        return ctznsh;
    }

    /**
     * Sets the value of the ctznsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenshipInformation2 }
     *     
     */
    public void setCtznsh(CitizenshipInformation2 value) {
        this.ctznsh = value;
    }

}
