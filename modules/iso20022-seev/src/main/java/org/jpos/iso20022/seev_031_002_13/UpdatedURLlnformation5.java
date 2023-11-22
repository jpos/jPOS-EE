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

package org.jpos.iso20022.seev_031_002_13;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatedURLlnformation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdatedURLlnformation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}ISO2ALanguageCode"/>
 *         <element name="UpdDesc" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RestrictedFINXMax140Text" minOccurs="0"/>
 *         <element name="UpdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}ISODate" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RestrictedFINZMax2048Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedURLlnformation5", propOrder = {
    "lang",
    "updDesc",
    "updDt",
    "urlAdr"
})
public class UpdatedURLlnformation5 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "UpdDesc")
    protected String updDesc;
    @XmlElement(name = "UpdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updDt;
    @XmlElement(name = "URLAdr", required = true)
    protected String urlAdr;

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
     * Gets the value of the updDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdDesc() {
        return updDesc;
    }

    /**
     * Sets the value of the updDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdDesc(String value) {
        this.updDesc = value;
    }

    /**
     * Gets the value of the updDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdDt() {
        return updDt;
    }

    /**
     * Sets the value of the updDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdDt(XMLGregorianCalendar value) {
        this.updDt = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

}
