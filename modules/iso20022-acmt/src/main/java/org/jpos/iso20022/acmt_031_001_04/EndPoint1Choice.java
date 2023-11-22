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

package org.jpos.iso20022.acmt_031_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndPoint1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EndPoint1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NbOfPmts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.031.001.04}Max35Text" minOccurs="0"/>
 *         <element name="LastPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.031.001.04}ISODate" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPoint1Choice", propOrder = {
    "nbOfPmts",
    "lastPmtDt"
})
public class EndPoint1Choice {

    @XmlElement(name = "NbOfPmts")
    protected String nbOfPmts;
    @XmlElement(name = "LastPmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPmtDt;

    /**
     * Gets the value of the nbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfPmts() {
        return nbOfPmts;
    }

    /**
     * Sets the value of the nbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfPmts(String value) {
        this.nbOfPmts = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPmtDt(XMLGregorianCalendar value) {
        this.lastPmtDt = value;
    }

}
