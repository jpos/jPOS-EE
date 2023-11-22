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

package org.jpos.iso20022.caaa_017_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversion28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyConversion28">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.017.001.10}CurrencyConversionResponse3Code"/>
 *         <element name="RsltRsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.017.001.10}Max35Text" minOccurs="0"/>
 *         <element name="ConvsDtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.017.001.10}CurrencyConversion26" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion28", propOrder = {
    "rslt",
    "rsltRsn",
    "convsDtls"
})
public class CurrencyConversion28 {

    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyConversionResponse3Code rslt;
    @XmlElement(name = "RsltRsn")
    protected String rsltRsn;
    @XmlElement(name = "ConvsDtls")
    protected List<CurrencyConversion26> convsDtls;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversionResponse3Code }
     *     
     */
    public CurrencyConversionResponse3Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversionResponse3Code }
     *     
     */
    public void setRslt(CurrencyConversionResponse3Code value) {
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
     * Gets the value of the convsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the convsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyConversion26 }
     * 
     * 
     * @return
     *     The value of the convsDtls property.
     */
    public List<CurrencyConversion26> getConvsDtls() {
        if (convsDtls == null) {
            convsDtls = new ArrayList<>();
        }
        return this.convsDtls;
    }

}
