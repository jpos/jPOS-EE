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

package org.jpos.iso20022.fxtr_013_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithdrawalReason1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="WithdrawalReason1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WdrwlRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.013.001.03}WithdrawalReason1Code"/>
 *         <element name="WdrwlRsnSubCd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.013.001.03}Max4Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawalReason1", propOrder = {
    "wdrwlRsnCd",
    "wdrwlRsnSubCd"
})
public class WithdrawalReason1 {

    @XmlElement(name = "WdrwlRsnCd", required = true)
    @XmlSchemaType(name = "string")
    protected WithdrawalReason1Code wdrwlRsnCd;
    @XmlElement(name = "WdrwlRsnSubCd")
    protected String wdrwlRsnSubCd;

    /**
     * Gets the value of the wdrwlRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link WithdrawalReason1Code }
     *     
     */
    public WithdrawalReason1Code getWdrwlRsnCd() {
        return wdrwlRsnCd;
    }

    /**
     * Sets the value of the wdrwlRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithdrawalReason1Code }
     *     
     */
    public void setWdrwlRsnCd(WithdrawalReason1Code value) {
        this.wdrwlRsnCd = value;
    }

    /**
     * Gets the value of the wdrwlRsnSubCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWdrwlRsnSubCd() {
        return wdrwlRsnSubCd;
    }

    /**
     * Sets the value of the wdrwlRsnSubCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWdrwlRsnSubCd(String value) {
        this.wdrwlRsnSubCd = value;
    }

}
