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

package org.jpos.iso20022.tsin_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInformation15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInformation15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}PaymentMethod4Code"/>
 *         <element name="PmtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}CashAccount7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformation15", propOrder = {
    "pmtMtd",
    "pmtAcct"
})
public class PaymentInformation15 {

    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod4Code pmtMtd;
    @XmlElement(name = "PmtAcct")
    protected CashAccount7 pmtAcct;

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public PaymentMethod4Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public void setPmtMtd(PaymentMethod4Code value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the pmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getPmtAcct() {
        return pmtAcct;
    }

    /**
     * Sets the value of the pmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setPmtAcct(CashAccount7 value) {
        this.pmtAcct = value;
    }

}
