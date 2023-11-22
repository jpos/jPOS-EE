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

package org.jpos.iso20022.caam_001_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityContext5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityContext5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurSctySchme" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMSecurityScheme3Code"/>
 *         <element name="SctySchmeCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMSecurityScheme4Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctyDvc" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}ATMSecurityDevice2"/>
 *         <element name="Key" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}CryptographicKey11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HstChllng" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}Max140Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityContext5", propOrder = {
    "curSctySchme",
    "sctySchmeCpblties",
    "sctyDvc",
    "key",
    "hstChllng"
})
public class ATMSecurityContext5 {

    @XmlElement(name = "CurSctySchme", required = true)
    @XmlSchemaType(name = "string")
    protected ATMSecurityScheme3Code curSctySchme;
    @XmlElement(name = "SctySchmeCpblties")
    @XmlSchemaType(name = "string")
    protected List<ATMSecurityScheme4Code> sctySchmeCpblties;
    @XmlElement(name = "SctyDvc", required = true)
    protected ATMSecurityDevice2 sctyDvc;
    @XmlElement(name = "Key")
    protected List<CryptographicKey11> key;
    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;

    /**
     * Gets the value of the curSctySchme property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public ATMSecurityScheme3Code getCurSctySchme() {
        return curSctySchme;
    }

    /**
     * Sets the value of the curSctySchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public void setCurSctySchme(ATMSecurityScheme3Code value) {
        this.curSctySchme = value;
    }

    /**
     * Gets the value of the sctySchmeCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctySchmeCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctySchmeCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMSecurityScheme4Code }
     * 
     * 
     * @return
     *     The value of the sctySchmeCpblties property.
     */
    public List<ATMSecurityScheme4Code> getSctySchmeCpblties() {
        if (sctySchmeCpblties == null) {
            sctySchmeCpblties = new ArrayList<>();
        }
        return this.sctySchmeCpblties;
    }

    /**
     * Gets the value of the sctyDvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityDevice2 }
     *     
     */
    public ATMSecurityDevice2 getSctyDvc() {
        return sctyDvc;
    }

    /**
     * Sets the value of the sctyDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityDevice2 }
     *     
     */
    public void setSctyDvc(ATMSecurityDevice2 value) {
        this.sctyDvc = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey11 }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<CryptographicKey11> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
    }

    /**
     * Gets the value of the hstChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHstChllng() {
        return hstChllng;
    }

    /**
     * Sets the value of the hstChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHstChllng(byte[] value) {
        this.hstChllng = value;
    }

}
