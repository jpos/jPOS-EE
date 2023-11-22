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

package org.jpos.iso20022.cain_001_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification210 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification210">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrsnlId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="MplyeeId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="PrfssnlLvl" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification210", propOrder = {
    "prsnlId",
    "mplyeeId",
    "nm",
    "prfssnlLvl"
})
public class PartyIdentification210 {

    @XmlElement(name = "PrsnlId")
    protected String prsnlId;
    @XmlElement(name = "MplyeeId")
    protected String mplyeeId;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PrfssnlLvl")
    protected String prfssnlLvl;

    /**
     * Gets the value of the prsnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlId() {
        return prsnlId;
    }

    /**
     * Sets the value of the prsnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrsnlId(String value) {
        this.prsnlId = value;
    }

    /**
     * Gets the value of the mplyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeId() {
        return mplyeeId;
    }

    /**
     * Sets the value of the mplyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMplyeeId(String value) {
        this.mplyeeId = value;
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
     * Gets the value of the prfssnlLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfssnlLvl() {
        return prfssnlLvl;
    }

    /**
     * Sets the value of the prfssnlLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrfssnlLvl(String value) {
        this.prfssnlLvl = value;
    }

}
