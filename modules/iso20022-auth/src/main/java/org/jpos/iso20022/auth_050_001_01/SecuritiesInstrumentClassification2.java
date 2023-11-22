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

package org.jpos.iso20022.auth_050_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesInstrumentClassification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesInstrumentClassification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:auth.050.001.01}CFIOct2015Identifier"/>
 *         <element name="Mod" type="{urn:iso:std:iso:20022:tech:xsd:auth.050.001.01}Modification1Code" minOccurs="0"/>
 *         <element name="VldtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.050.001.01}Period4Choice"/>
 *         <element name="LastUpdtd" type="{urn:iso:std:iso:20022:tech:xsd:auth.050.001.01}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesInstrumentClassification2", propOrder = {
    "idr",
    "mod",
    "vldtyPrd",
    "lastUpdtd"
})
public class SecuritiesInstrumentClassification2 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "Mod")
    @XmlSchemaType(name = "string")
    protected Modification1Code mod;
    @XmlElement(name = "VldtyPrd", required = true)
    protected Period4Choice vldtyPrd;
    @XmlElement(name = "LastUpdtd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdtd;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdr(String value) {
        this.idr = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public void setMod(Modification1Code value) {
        this.mod = value;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setVldtyPrd(Period4Choice value) {
        this.vldtyPrd = value;
    }

    /**
     * Gets the value of the lastUpdtd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdtd() {
        return lastUpdtd;
    }

    /**
     * Sets the value of the lastUpdtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdtd(XMLGregorianCalendar value) {
        this.lastUpdtd = value;
    }

}
