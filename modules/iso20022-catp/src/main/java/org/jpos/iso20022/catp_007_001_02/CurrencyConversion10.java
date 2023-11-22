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

package org.jpos.iso20022.catp_007_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversion10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyConversion10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CurrencyConversionResponse2Code"/>
 *         <element name="RsltRsn" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Convs" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CurrencyConversion9" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion10", propOrder = {
    "rslt",
    "rsltRsn",
    "convs"
})
public class CurrencyConversion10 {

    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyConversionResponse2Code rslt;
    @XmlElement(name = "RsltRsn")
    protected String rsltRsn;
    @XmlElement(name = "Convs")
    protected CurrencyConversion9 convs;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionResponse2Code }
     *     
     */
    public CurrencyConversionResponse2Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionResponse2Code }
     *     
     */
    public void setRslt(CurrencyConversionResponse2Code value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the rsltRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsltRsn() {
        return rsltRsn;
    }

    /**
     * Sets the value of the rsltRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsltRsn(String value) {
        this.rsltRsn = value;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public CurrencyConversion9 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public void setConvs(CurrencyConversion9 value) {
        this.convs = value;
    }

}
