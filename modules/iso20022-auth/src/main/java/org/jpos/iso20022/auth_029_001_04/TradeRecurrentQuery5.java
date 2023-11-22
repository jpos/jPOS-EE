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

package org.jpos.iso20022.auth_029_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeRecurrentQuery5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeRecurrentQuery5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Max1000Text"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradeQueryExecutionFrequency3"/>
 *         <element name="VldUntil" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ISODate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeRecurrentQuery5", propOrder = {
    "qryTp",
    "frqcy",
    "vldUntil"
})
public class TradeRecurrentQuery5 {

    @XmlElement(name = "QryTp", required = true)
    protected String qryTp;
    @XmlElement(name = "Frqcy", required = true)
    protected TradeQueryExecutionFrequency3 frqcy;
    @XmlElement(name = "VldUntil", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldUntil;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryTp(String value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link TradeQueryExecutionFrequency3 }
     *     
     */
    public TradeQueryExecutionFrequency3 getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeQueryExecutionFrequency3 }
     *     
     */
    public void setFrqcy(TradeQueryExecutionFrequency3 value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldUntil(XMLGregorianCalendar value) {
        this.vldUntil = value;
    }

}
