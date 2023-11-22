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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrancheIndicator3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TrancheIndicator3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Trnchd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Tranche3"/>
 *         <element name="Utrnchd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}NoReasonCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrancheIndicator3Choice", propOrder = {
    "trnchd",
    "utrnchd"
})
public class TrancheIndicator3Choice {

    @XmlElement(name = "Trnchd")
    protected Tranche3 trnchd;
    @XmlElement(name = "Utrnchd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode utrnchd;

    /**
     * Gets the value of the trnchd property.
     * 
     * @return
     *     possible object is
     *     {@link Tranche3 }
     *     
     */
    public Tranche3 getTrnchd() {
        return trnchd;
    }

    /**
     * Sets the value of the trnchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tranche3 }
     *     
     */
    public void setTrnchd(Tranche3 value) {
        this.trnchd = value;
    }

    /**
     * Gets the value of the utrnchd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getUtrnchd() {
        return utrnchd;
    }

    /**
     * Sets the value of the utrnchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setUtrnchd(NoReasonCode value) {
        this.utrnchd = value;
    }

}
