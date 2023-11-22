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

package org.jpos.iso20022.catm_002_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceContent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResourceContent1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RsrcTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}ResourceType1Code"/>
 *         <element name="RsrcFrmt" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}SoundFormat1Code" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}LanguageCode" minOccurs="0"/>
 *         <element name="RsrcRef" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}Max1025Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceContent1", propOrder = {
    "rsrcTp",
    "rsrcFrmt",
    "lang",
    "rsrcRef"
})
public class ResourceContent1 {

    @XmlElement(name = "RsrcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ResourceType1Code rsrcTp;
    @XmlElement(name = "RsrcFrmt")
    @XmlSchemaType(name = "string")
    protected SoundFormat1Code rsrcFrmt;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "RsrcRef")
    protected String rsrcRef;

    /**
     * Gets the value of the rsrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType1Code }
     *     
     */
    public ResourceType1Code getRsrcTp() {
        return rsrcTp;
    }

    /**
     * Sets the value of the rsrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType1Code }
     *     
     */
    public void setRsrcTp(ResourceType1Code value) {
        this.rsrcTp = value;
    }

    /**
     * Gets the value of the rsrcFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link SoundFormat1Code }
     *     
     */
    public SoundFormat1Code getRsrcFrmt() {
        return rsrcFrmt;
    }

    /**
     * Sets the value of the rsrcFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundFormat1Code }
     *     
     */
    public void setRsrcFrmt(SoundFormat1Code value) {
        this.rsrcFrmt = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the rsrcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcRef() {
        return rsrcRef;
    }

    /**
     * Sets the value of the rsrcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcRef(String value) {
        this.rsrcRef = value;
    }

}
