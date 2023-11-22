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

package org.jpos.iso20022.reda_023_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountModification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountModification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ScpIndctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}DataModification1Code"/>
 *         <element name="ReqdMod" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}SecuritiesAccountModification2Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountModification2", propOrder = {
    "scpIndctn",
    "reqdMod"
})
public class SecuritiesAccountModification2 {

    @XmlElement(name = "ScpIndctn", required = true)
    @XmlSchemaType(name = "string")
    protected DataModification1Code scpIndctn;
    @XmlElement(name = "ReqdMod", required = true)
    protected SecuritiesAccountModification2Choice reqdMod;

    /**
     * Gets the value of the scpIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link DataModification1Code }
     *     
     */
    public DataModification1Code getScpIndctn() {
        return scpIndctn;
    }

    /**
     * Sets the value of the scpIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataModification1Code }
     *     
     */
    public void setScpIndctn(DataModification1Code value) {
        this.scpIndctn = value;
    }

    /**
     * Gets the value of the reqdMod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountModification2Choice }
     *     
     */
    public SecuritiesAccountModification2Choice getReqdMod() {
        return reqdMod;
    }

    /**
     * Sets the value of the reqdMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountModification2Choice }
     *     
     */
    public void setReqdMod(SecuritiesAccountModification2Choice value) {
        this.reqdMod = value;
    }

}
