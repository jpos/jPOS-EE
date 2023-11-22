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

package org.jpos.iso20022.sese_040_002_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingStatus20Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PendingStatus20Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Fwdd" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.002.04}NoSpecifiedReason1"/>
 *         <element name="UdrInvstgtn" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.002.04}NoSpecifiedReason1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingStatus20Choice", propOrder = {
    "fwdd",
    "udrInvstgtn"
})
public class PendingStatus20Choice {

    @XmlElement(name = "Fwdd")
    protected NoSpecifiedReason1 fwdd;
    @XmlElement(name = "UdrInvstgtn")
    protected NoSpecifiedReason1 udrInvstgtn;

    /**
     * Gets the value of the fwdd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getFwdd() {
        return fwdd;
    }

    /**
     * Sets the value of the fwdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setFwdd(NoSpecifiedReason1 value) {
        this.fwdd = value;
    }

    /**
     * Gets the value of the udrInvstgtn property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getUdrInvstgtn() {
        return udrInvstgtn;
    }

    /**
     * Sets the value of the udrInvstgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setUdrInvstgtn(NoSpecifiedReason1 value) {
        this.udrInvstgtn = value;
    }

}
