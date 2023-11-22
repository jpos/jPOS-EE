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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedParty13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExtendedParty13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyRole" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}GenericIdentification36"/>
 *         <element name="OthrPtyDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes5"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedParty13", propOrder = {
    "ptyRole",
    "othrPtyDtls"
})
public class ExtendedParty13 {

    @XmlElement(name = "PtyRole", required = true)
    protected GenericIdentification36 ptyRole;
    @XmlElement(name = "OthrPtyDtls", required = true)
    protected ContactAttributes5 othrPtyDtls;

    /**
     * Gets the value of the ptyRole property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPtyRole() {
        return ptyRole;
    }

    /**
     * Sets the value of the ptyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setPtyRole(GenericIdentification36 value) {
        this.ptyRole = value;
    }

    /**
     * Gets the value of the othrPtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getOthrPtyDtls() {
        return othrPtyDtls;
    }

    /**
     * Sets the value of the othrPtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public void setOthrPtyDtls(ContactAttributes5 value) {
        this.othrPtyDtls = value;
    }

}
