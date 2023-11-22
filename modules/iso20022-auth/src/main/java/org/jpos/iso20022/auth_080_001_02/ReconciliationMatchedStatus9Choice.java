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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationMatchedStatus9Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationMatchedStatus9Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Mtchd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}NoReasonCode"/>
 *         <element name="NotMtchd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ReconciliationResult10"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationMatchedStatus9Choice", propOrder = {
    "mtchd",
    "notMtchd"
})
public class ReconciliationMatchedStatus9Choice {

    @XmlElement(name = "Mtchd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode mtchd;
    @XmlElement(name = "NotMtchd")
    protected ReconciliationResult10 notMtchd;

    /**
     * Gets the value of the mtchd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getMtchd() {
        return mtchd;
    }

    /**
     * Sets the value of the mtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setMtchd(NoReasonCode value) {
        this.mtchd = value;
    }

    /**
     * Gets the value of the notMtchd property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationResult10 }
     *     
     */
    public ReconciliationResult10 getNotMtchd() {
        return notMtchd;
    }

    /**
     * Sets the value of the notMtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationResult10 }
     *     
     */
    public void setNotMtchd(ReconciliationResult10 value) {
        this.notMtchd = value;
    }

}
