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

package org.jpos.iso20022.acmt_022_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationModification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IdentificationModification4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}Max35Text"/>
 *         <element name="OrgnlPtyAndAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}IdentificationInformation4" minOccurs="0"/>
 *         <element name="UpdtdPtyAndAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}IdentificationInformation4"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.03}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationModification4", propOrder = {
    "id",
    "orgnlPtyAndAcctId",
    "updtdPtyAndAcctId",
    "addtlInf"
})
public class IdentificationModification4 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "OrgnlPtyAndAcctId")
    protected IdentificationInformation4 orgnlPtyAndAcctId;
    @XmlElement(name = "UpdtdPtyAndAcctId", required = true)
    protected IdentificationInformation4 updtdPtyAndAcctId;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the orgnlPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public IdentificationInformation4 getOrgnlPtyAndAcctId() {
        return orgnlPtyAndAcctId;
    }

    /**
     * Sets the value of the orgnlPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public void setOrgnlPtyAndAcctId(IdentificationInformation4 value) {
        this.orgnlPtyAndAcctId = value;
    }

    /**
     * Gets the value of the updtdPtyAndAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public IdentificationInformation4 getUpdtdPtyAndAcctId() {
        return updtdPtyAndAcctId;
    }

    /**
     * Sets the value of the updtdPtyAndAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInformation4 }
     *     
     */
    public void setUpdtdPtyAndAcctId(IdentificationInformation4 value) {
        this.updtdPtyAndAcctId = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
