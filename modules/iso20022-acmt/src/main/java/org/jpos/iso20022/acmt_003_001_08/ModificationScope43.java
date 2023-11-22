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
 * <p>Java class for ModificationScope43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModificationScope43">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModScpIndctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}DataModification1Code"/>
 *         <element name="Plcmnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ReferredAgent3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationScope43", propOrder = {
    "modScpIndctn",
    "plcmnt"
})
public class ModificationScope43 {

    @XmlElement(name = "ModScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code modScpIndctn;
    @XmlElement(name = "Plcmnt", required = true)
    protected ReferredAgent3 plcmnt;

    /**
     * Gets the value of the modScpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification1Code }
     *     
     */
    public DataModification1Code getModScpIndctn() {
        return modScpIndctn;
    }

    /**
     * Sets the value of the modScpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification1Code }
     *     
     */
    public void setModScpIndctn(DataModification1Code value) {
        this.modScpIndctn = value;
    }

    /**
     * Gets the value of the plcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredAgent3 }
     *     
     */
    public ReferredAgent3 getPlcmnt() {
        return plcmnt;
    }

    /**
     * Sets the value of the plcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredAgent3 }
     *     
     */
    public void setPlcmnt(ReferredAgent3 value) {
        this.plcmnt = value;
    }

}
