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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountIdentificationAndPurpose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountIdentificationAndPurpose">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:semt.005.001.02}AccountIdentification1"/>
 *         <element name="Purp" type="{urn:swift:xsd:semt.005.001.02}SecuritiesAccountPurposeType1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentificationAndPurpose", propOrder = {
    "id",
    "purp"
})
public class AccountIdentificationAndPurpose {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification1 id;
    @XmlElement(name = "Purp", required = true)
    @XmlSchemaType(name = "string")
    protected SecuritiesAccountPurposeType1Code purp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public void setId(AccountIdentification1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountPurposeType1Code }
     *     
     */
    public SecuritiesAccountPurposeType1Code getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountPurposeType1Code }
     *     
     */
    public void setPurp(SecuritiesAccountPurposeType1Code value) {
        this.purp = value;
    }

}
