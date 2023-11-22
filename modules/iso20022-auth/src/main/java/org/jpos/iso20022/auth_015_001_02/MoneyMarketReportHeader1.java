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

package org.jpos.iso20022.auth_015_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyMarketReportHeader1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MoneyMarketReportHeader1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.015.001.02}LEIIdentifier"/>
 *         <element name="RefPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.015.001.02}DateTimePeriod1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketReportHeader1", propOrder = {
    "rptgAgt",
    "refPrd"
})
public class MoneyMarketReportHeader1 {

    @XmlElement(name = "RptgAgt", required = true)
    protected String rptgAgt;
    @XmlElement(name = "RefPrd", required = true)
    protected DateTimePeriod1 refPrd;

    /**
     * Gets the value of the rptgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgAgt() {
        return rptgAgt;
    }

    /**
     * Sets the value of the rptgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptgAgt(String value) {
        this.rptgAgt = value;
    }

    /**
     * Gets the value of the refPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getRefPrd() {
        return refPrd;
    }

    /**
     * Sets the value of the refPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setRefPrd(DateTimePeriod1 value) {
        this.refPrd = value;
    }

}
