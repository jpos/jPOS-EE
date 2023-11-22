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

package org.jpos.iso20022.cafr_003_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderName2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardholderName2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max140Text" minOccurs="0"/>
 *         <element name="GvnNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max70Text" minOccurs="0"/>
 *         <element name="MddlNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max70Text" minOccurs="0"/>
 *         <element name="LastNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderName2", propOrder = {
    "nm",
    "gvnNm",
    "mddlNm",
    "lastNm"
})
public class CardholderName2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "LastNm")
    protected String lastNm;

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
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGvnNm(String value) {
        this.gvnNm = value;
    }

    /**
     * Gets the value of the mddlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Sets the value of the mddlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMddlNm(String value) {
        this.mddlNm = value;
    }

    /**
     * Gets the value of the lastNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNm() {
        return lastNm;
    }

    /**
     * Sets the value of the lastNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNm(String value) {
        this.lastNm = value;
    }

}
