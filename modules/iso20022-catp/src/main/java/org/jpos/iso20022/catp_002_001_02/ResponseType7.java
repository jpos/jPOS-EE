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

package org.jpos.iso20022.catp_002_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponseType7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}Response4Code"/>
 *         <element name="RspnRsn" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}ResultDetail4Code" minOccurs="0"/>
 *         <element name="AddtlRspnInf" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType7", propOrder = {
    "rspn",
    "rspnRsn",
    "addtlRspnInf"
})
public class ResponseType7 {

    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response4Code rspn;
    @XmlElement(name = "RspnRsn")
    @XmlSchemaType(name = "string")
    protected ResultDetail4Code rspnRsn;
    @XmlElement(name = "AddtlRspnInf")
    protected String addtlRspnInf;

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response4Code }
     *     
     */
    public Response4Code getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response4Code }
     *     
     */
    public void setRspn(Response4Code value) {
        this.rspn = value;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail4Code }
     *     
     */
    public ResultDetail4Code getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail4Code }
     *     
     */
    public void setRspnRsn(ResultDetail4Code value) {
        this.rspnRsn = value;
    }

    /**
     * Gets the value of the addtlRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRspnInf() {
        return addtlRspnInf;
    }

    /**
     * Sets the value of the addtlRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRspnInf(String value) {
        this.addtlRspnInf = value;
    }

}
