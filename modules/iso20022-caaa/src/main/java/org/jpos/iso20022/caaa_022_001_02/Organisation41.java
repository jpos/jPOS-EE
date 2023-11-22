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

package org.jpos.iso20022.caaa_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation41 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Organisation41">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}GenericIdentification32" minOccurs="0"/>
 *         <element name="CmonNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max70Text" minOccurs="0"/>
 *         <element name="LctnCtgy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}LocationCategory4Code" minOccurs="0"/>
 *         <element name="LctnAndCtct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}CommunicationAddress9" minOccurs="0"/>
 *         <element name="SchmeData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation41", propOrder = {
    "id",
    "cmonNm",
    "lctnCtgy",
    "lctnAndCtct",
    "schmeData"
})
public class Organisation41 {

    @XmlElement(name = "Id")
    protected GenericIdentification32 id;
    @XmlElement(name = "CmonNm")
    protected String cmonNm;
    @XmlElement(name = "LctnCtgy")
    @XmlSchemaType(name = "string")
    protected LocationCategory4Code lctnCtgy;
    @XmlElement(name = "LctnAndCtct")
    protected CommunicationAddress9 lctnAndCtct;
    @XmlElement(name = "SchmeData")
    protected String schmeData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public void setId(GenericIdentification32 value) {
        this.id = value;
    }

    /**
     * Gets the value of the cmonNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonNm() {
        return cmonNm;
    }

    /**
     * Sets the value of the cmonNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonNm(String value) {
        this.cmonNm = value;
    }

    /**
     * Gets the value of the lctnCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCategory4Code }
     *     
     */
    public LocationCategory4Code getLctnCtgy() {
        return lctnCtgy;
    }

    /**
     * Sets the value of the lctnCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCategory4Code }
     *     
     */
    public void setLctnCtgy(LocationCategory4Code value) {
        this.lctnCtgy = value;
    }

    /**
     * Gets the value of the lctnAndCtct property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress9 }
     *     
     */
    public CommunicationAddress9 getLctnAndCtct() {
        return lctnAndCtct;
    }

    /**
     * Sets the value of the lctnAndCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress9 }
     *     
     */
    public void setLctnAndCtct(CommunicationAddress9 value) {
        this.lctnAndCtct = value;
    }

    /**
     * Gets the value of the schmeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeData() {
        return schmeData;
    }

    /**
     * Sets the value of the schmeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchmeData(String value) {
        this.schmeData = value;
    }

}
