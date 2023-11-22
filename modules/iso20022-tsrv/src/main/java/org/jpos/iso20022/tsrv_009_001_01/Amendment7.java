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

package org.jpos.iso20022.tsrv_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amendment7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amendment7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmdmntId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.009.001.01}Amendment8"/>
 *         <element name="AmdmntSts" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.009.001.01}UndertakingStatus2Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment7", propOrder = {
    "amdmntId",
    "amdmntSts"
})
public class Amendment7 {

    @XmlElement(name = "AmdmntId", required = true)
    protected Amendment8 amdmntId;
    @XmlElement(name = "AmdmntSts", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingStatus2Code amdmntSts;

    /**
     * Gets the value of the amdmntId property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment8 }
     *     
     */
    public Amendment8 getAmdmntId() {
        return amdmntId;
    }

    /**
     * Sets the value of the amdmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment8 }
     *     
     */
    public void setAmdmntId(Amendment8 value) {
        this.amdmntId = value;
    }

    /**
     * Gets the value of the amdmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatus2Code }
     *     
     */
    public UndertakingStatus2Code getAmdmntSts() {
        return amdmntSts;
    }

    /**
     * Sets the value of the amdmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatus2Code }
     *     
     */
    public void setAmdmntSts(UndertakingStatus2Code value) {
        this.amdmntSts = value;
    }

}
