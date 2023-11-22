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

package org.jpos.iso20022.tsrv_004_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Undertaking10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Undertaking10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NewUdrtkgAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}UndertakingAmount2" minOccurs="0"/>
 *         <element name="NewXpryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}ExpiryDetails1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking10", propOrder = {
    "newUdrtkgAmt",
    "newXpryDtls"
})
public class Undertaking10 {

    @XmlElement(name = "NewUdrtkgAmt")
    protected UndertakingAmount2 newUdrtkgAmt;
    @XmlElement(name = "NewXpryDtls")
    protected ExpiryDetails1 newXpryDtls;

    /**
     * Gets the value of the newUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public UndertakingAmount2 getNewUdrtkgAmt() {
        return newUdrtkgAmt;
    }

    /**
     * Sets the value of the newUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount2 }
     *     
     */
    public void setNewUdrtkgAmt(UndertakingAmount2 value) {
        this.newUdrtkgAmt = value;
    }

    /**
     * Gets the value of the newXpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getNewXpryDtls() {
        return newXpryDtls;
    }

    /**
     * Sets the value of the newXpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public void setNewXpryDtls(ExpiryDetails1 value) {
        this.newXpryDtls = value;
    }

}
