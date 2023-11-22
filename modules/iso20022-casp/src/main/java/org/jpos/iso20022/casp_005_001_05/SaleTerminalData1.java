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

package org.jpos.iso20022.casp_005_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleTerminalData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SaleTerminalData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TermnlEnvt" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}AttendanceContext1Code" minOccurs="0"/>
 *         <element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:casp.005.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleTerminalData1", propOrder = {
    "termnlEnvt",
    "saleRcncltnId"
})
public class SaleTerminalData1 {

    @XmlElement(name = "TermnlEnvt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code termnlEnvt;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;

    /**
     * Gets the value of the termnlEnvt property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public AttendanceContext1Code getTermnlEnvt() {
        return termnlEnvt;
    }

    /**
     * Sets the value of the termnlEnvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public void setTermnlEnvt(AttendanceContext1Code value) {
        this.termnlEnvt = value;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
    }

}
