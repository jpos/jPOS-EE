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

package org.jpos.iso20022.auth_033_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BondDerivative2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BondDerivative2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}LEIIdentifier"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISODate" minOccurs="0"/>
 *         <element name="IssncDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BondDerivative2", propOrder = {
    "issr",
    "mtrtyDt",
    "issncDt"
})
public class BondDerivative2 {

    @XmlElement(name = "Issr", required = true)
    protected String issr;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "IssncDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issncDt;

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the issncDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssncDt() {
        return issncDt;
    }

    /**
     * Sets the value of the issncDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssncDt(XMLGregorianCalendar value) {
        this.issncDt = value;
    }

}
