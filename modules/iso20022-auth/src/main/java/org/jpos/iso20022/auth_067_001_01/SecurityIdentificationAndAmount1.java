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

package org.jpos.iso20022.auth_067_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentificationAndAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentificationAndAmount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}ISINOct2015Identifier"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}ActiveCurrencyAnd24Amount"/>
 *         <element name="FinInstrmTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}ProductType7Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentificationAndAmount1", propOrder = {
    "id",
    "mktVal",
    "finInstrmTp"
})
public class SecurityIdentificationAndAmount1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "MktVal", required = true)
    protected ActiveCurrencyAnd24Amount mktVal;
    @XmlElement(name = "FinInstrmTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProductType7Code finInstrmTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public void setMktVal(ActiveCurrencyAnd24Amount value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the finInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType7Code }
     *     
     */
    public ProductType7Code getFinInstrmTp() {
        return finInstrmTp;
    }

    /**
     * Sets the value of the finInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType7Code }
     *     
     */
    public void setFinInstrmTp(ProductType7Code value) {
        this.finInstrmTp = value;
    }

}
