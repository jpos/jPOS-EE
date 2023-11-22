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

package org.jpos.iso20022.auth_060_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flows1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Flows1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtBkFlows" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}AmountAndDirection102"/>
 *         <element name="InvstmtFlows" type="{urn:iso:std:iso:20022:tech:xsd:auth.060.001.01}AmountAndDirection102"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flows1", propOrder = {
    "pmtBkFlows",
    "invstmtFlows"
})
public class Flows1 {

    @XmlElement(name = "PmtBkFlows", required = true)
    protected AmountAndDirection102 pmtBkFlows;
    @XmlElement(name = "InvstmtFlows", required = true)
    protected AmountAndDirection102 invstmtFlows;

    /**
     * Gets the value of the pmtBkFlows property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getPmtBkFlows() {
        return pmtBkFlows;
    }

    /**
     * Sets the value of the pmtBkFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setPmtBkFlows(AmountAndDirection102 value) {
        this.pmtBkFlows = value;
    }

    /**
     * Gets the value of the invstmtFlows property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getInvstmtFlows() {
        return invstmtFlows;
    }

    /**
     * Sets the value of the invstmtFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setInvstmtFlows(AmountAndDirection102 value) {
        this.invstmtFlows = value;
    }

}
