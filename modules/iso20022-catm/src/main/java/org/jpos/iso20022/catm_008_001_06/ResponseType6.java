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

package org.jpos.iso20022.catm_008_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponseType6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}Response2Code"/>
 *         <element name="RspnDtl" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}ResultDetail3Code" minOccurs="0"/>
 *         <element name="AddtlRspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.06}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType6", propOrder = {
    "rspn",
    "rspnDtl",
    "addtlRspn"
})
public class ResponseType6 {

    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response2Code rspn;
    @XmlElement(name = "RspnDtl")
    @XmlSchemaType(name = "string")
    protected ResultDetail3Code rspnDtl;
    @XmlElement(name = "AddtlRspn")
    protected String addtlRspn;

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response2Code }
     *     
     */
    public Response2Code getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response2Code }
     *     
     */
    public void setRspn(Response2Code value) {
        this.rspn = value;
    }

    /**
     * Gets the value of the rspnDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail3Code }
     *     
     */
    public ResultDetail3Code getRspnDtl() {
        return rspnDtl;
    }

    /**
     * Sets the value of the rspnDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail3Code }
     *     
     */
    public void setRspnDtl(ResultDetail3Code value) {
        this.rspnDtl = value;
    }

    /**
     * Gets the value of the addtlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRspn() {
        return addtlRspn;
    }

    /**
     * Sets the value of the addtlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRspn(String value) {
        this.addtlRspn = value;
    }

}
