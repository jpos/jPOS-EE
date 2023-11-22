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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingExceptionOrExemption3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingExceptionOrExemption3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}NoReasonCode"/>
 *         <element name="CtrPties" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ClearingExceptionOrExemption2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingExceptionOrExemption3Choice", propOrder = {
    "rsn",
    "ctrPties"
})
public class ClearingExceptionOrExemption3Choice {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode rsn;
    @XmlElement(name = "CtrPties")
    protected ClearingExceptionOrExemption2 ctrPties;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setRsn(NoReasonCode value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the ctrPties property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingExceptionOrExemption2 }
     *     
     */
    public ClearingExceptionOrExemption2 getCtrPties() {
        return ctrPties;
    }

    /**
     * Sets the value of the ctrPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingExceptionOrExemption2 }
     *     
     */
    public void setCtrPties(ClearingExceptionOrExemption2 value) {
        this.ctrPties = value;
    }

}
