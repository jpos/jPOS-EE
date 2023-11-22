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

package org.jpos.iso20022.auth_031_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfRecordsPerStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NumberOfRecordsPerStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtldNbOfRcrds" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}Max15NumericText"/>
 *         <element name="DtldSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.031.001.01}ReportingRecordStatus1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfRecordsPerStatus1", propOrder = {
    "dtldNbOfRcrds",
    "dtldSts"
})
public class NumberOfRecordsPerStatus1 {

    @XmlElement(name = "DtldNbOfRcrds", required = true)
    protected String dtldNbOfRcrds;
    @XmlElement(name = "DtldSts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingRecordStatus1Code dtldSts;

    /**
     * Gets the value of the dtldNbOfRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtldNbOfRcrds() {
        return dtldNbOfRcrds;
    }

    /**
     * Sets the value of the dtldNbOfRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtldNbOfRcrds(String value) {
        this.dtldNbOfRcrds = value;
    }

    /**
     * Gets the value of the dtldSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRecordStatus1Code }
     *     
     */
    public ReportingRecordStatus1Code getDtldSts() {
        return dtldSts;
    }

    /**
     * Sets the value of the dtldSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRecordStatus1Code }
     *     
     */
    public void setDtldSts(ReportingRecordStatus1Code value) {
        this.dtldSts = value;
    }

}
