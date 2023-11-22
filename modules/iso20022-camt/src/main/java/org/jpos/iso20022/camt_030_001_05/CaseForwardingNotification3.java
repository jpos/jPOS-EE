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

package org.jpos.iso20022.camt_030_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseForwardingNotification3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CaseForwardingNotification3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Justfn" type="{urn:iso:std:iso:20022:tech:xsd:camt.030.001.05}CaseForwardingNotification3Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseForwardingNotification3", propOrder = {
    "justfn"
})
public class CaseForwardingNotification3 {

    @XmlElement(name = "Justfn", required = true)
    @XmlSchemaType(name = "string")
    protected CaseForwardingNotification3Code justfn;

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link CaseForwardingNotification3Code }
     *     
     */
    public CaseForwardingNotification3Code getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseForwardingNotification3Code }
     *     
     */
    public void setJustfn(CaseForwardingNotification3Code value) {
        this.justfn = value;
    }

}
