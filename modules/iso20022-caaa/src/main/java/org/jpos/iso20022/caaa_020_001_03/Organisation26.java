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

package org.jpos.iso20022.caaa_020_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation26 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Organisation26">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CmonNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max70Text"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max140Text" minOccurs="0"/>
 *         <element name="CtryCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}ISO3NumericCountryCode"/>
 *         <element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Min3Max4Text"/>
 *         <element name="RegdIdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation26", propOrder = {
    "cmonNm",
    "adr",
    "ctryCd",
    "mrchntCtgyCd",
    "regdIdr"
})
public class Organisation26 {

    @XmlElement(name = "CmonNm", required = true)
    protected String cmonNm;
    @XmlElement(name = "Adr")
    protected String adr;
    @XmlElement(name = "CtryCd", required = true)
    protected String ctryCd;
    @XmlElement(name = "MrchntCtgyCd", required = true)
    protected String mrchntCtgyCd;
    @XmlElement(name = "RegdIdr", required = true)
    protected String regdIdr;

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
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Gets the value of the ctryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Sets the value of the ctryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryCd(String value) {
        this.ctryCd = value;
    }

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
    }

    /**
     * Gets the value of the regdIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdIdr() {
        return regdIdr;
    }

    /**
     * Sets the value of the regdIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdIdr(String value) {
        this.regdIdr = value;
    }

}
