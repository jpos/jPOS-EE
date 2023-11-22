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

package org.jpos.iso20022.caaa_024_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportGetTotalsRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportGetTotalsRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.024.001.03}TotalDetails1Code" minOccurs="0"/>
 *         <element name="TtlFltr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.024.001.03}TotalFilter1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGetTotalsRequest1", propOrder = {
    "ttlDtls",
    "ttlFltr"
})
public class ReportGetTotalsRequest1 {

    @XmlElement(name = "TtlDtls")
    @XmlSchemaType(name = "string")
    protected TotalDetails1Code ttlDtls;
    @XmlElement(name = "TtlFltr")
    protected TotalFilter1 ttlFltr;

    /**
     * Gets the value of the ttlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalDetails1Code }
     *     
     */
    public TotalDetails1Code getTtlDtls() {
        return ttlDtls;
    }

    /**
     * Sets the value of the ttlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDetails1Code }
     *     
     */
    public void setTtlDtls(TotalDetails1Code value) {
        this.ttlDtls = value;
    }

    /**
     * Gets the value of the ttlFltr property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFilter1 }
     *     
     */
    public TotalFilter1 getTtlFltr() {
        return ttlFltr;
    }

    /**
     * Sets the value of the ttlFltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFilter1 }
     *     
     */
    public void setTtlFltr(TotalFilter1 value) {
        this.ttlFltr = value;
    }

}
