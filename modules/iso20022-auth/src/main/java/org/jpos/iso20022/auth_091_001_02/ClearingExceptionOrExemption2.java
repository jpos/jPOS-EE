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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingExceptionOrExemption2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingExceptionOrExemption2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}NonClearingReason2"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}NonClearingReason2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingExceptionOrExemption2", propOrder = {
    "rptgCtrPty",
    "othrCtrPty"
})
public class ClearingExceptionOrExemption2 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected NonClearingReason2 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected NonClearingReason2 othrCtrPty;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link NonClearingReason2 }
     *     
     */
    public NonClearingReason2 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonClearingReason2 }
     *     
     */
    public void setRptgCtrPty(NonClearingReason2 value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link NonClearingReason2 }
     *     
     */
    public NonClearingReason2 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonClearingReason2 }
     *     
     */
    public void setOthrCtrPty(NonClearingReason2 value) {
        this.othrCtrPty = value;
    }

}
