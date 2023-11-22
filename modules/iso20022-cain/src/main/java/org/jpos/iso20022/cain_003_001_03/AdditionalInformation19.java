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

package org.jpos.iso20022.cain_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalInformation19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalInformation19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtrdDataNmrc" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35NumericText" minOccurs="0"/>
 *         <element name="NtrdDataAlphaNmrc" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max350Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation19", propOrder = {
    "ntrdDataNmrc",
    "ntrdDataAlphaNmrc",
    "addtlData"
})
public class AdditionalInformation19 {

    @XmlElement(name = "NtrdDataNmrc")
    protected String ntrdDataNmrc;
    @XmlElement(name = "NtrdDataAlphaNmrc")
    protected String ntrdDataAlphaNmrc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the ntrdDataNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtrdDataNmrc() {
        return ntrdDataNmrc;
    }

    /**
     * Sets the value of the ntrdDataNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtrdDataNmrc(String value) {
        this.ntrdDataNmrc = value;
    }

    /**
     * Gets the value of the ntrdDataAlphaNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtrdDataAlphaNmrc() {
        return ntrdDataAlphaNmrc;
    }

    /**
     * Sets the value of the ntrdDataAlphaNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtrdDataAlphaNmrc(String value) {
        this.ntrdDataAlphaNmrc = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
