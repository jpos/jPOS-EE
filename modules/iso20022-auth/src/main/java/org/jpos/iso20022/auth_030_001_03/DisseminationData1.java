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

package org.jpos.iso20022.auth_030_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisseminationData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisseminationData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DssmntnIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Max52Text"/>
 *         <element name="OrgnlDssmntnIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Max52Text" minOccurs="0"/>
 *         <element name="TmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ISODateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisseminationData1", propOrder = {
    "dssmntnIdr",
    "orgnlDssmntnIdr",
    "tmStmp"
})
public class DisseminationData1 {

    @XmlElement(name = "DssmntnIdr", required = true)
    protected String dssmntnIdr;
    @XmlElement(name = "OrgnlDssmntnIdr")
    protected String orgnlDssmntnIdr;
    @XmlElement(name = "TmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;

    /**
     * Gets the value of the dssmntnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDssmntnIdr() {
        return dssmntnIdr;
    }

    /**
     * Sets the value of the dssmntnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDssmntnIdr(String value) {
        this.dssmntnIdr = value;
    }

    /**
     * Gets the value of the orgnlDssmntnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlDssmntnIdr() {
        return orgnlDssmntnIdr;
    }

    /**
     * Sets the value of the orgnlDssmntnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlDssmntnIdr(String value) {
        this.orgnlDssmntnIdr = value;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmStmp(XMLGregorianCalendar value) {
        this.tmStmp = value;
    }

}
