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

package org.jpos.iso20022.secl_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubAccount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubAccount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}AccountIdentification26"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Chrtc" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccount4", propOrder = {
    "id",
    "nm",
    "chrtc"
})
public class SubAccount4 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification26 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Chrtc")
    protected String chrtc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification26 }
     *     
     */
    public AccountIdentification26 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification26 }
     *     
     */
    public void setId(AccountIdentification26 value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the chrtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrtc() {
        return chrtc;
    }

    /**
     * Sets the value of the chrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrtc(String value) {
        this.chrtc = value;
    }

}
