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

package org.jpos.iso20022.tsin_013_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingDateDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancingDateDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BookDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CdtDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/>
 *         <element name="DbtDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingDateDetails1", propOrder = {
    "bookDt",
    "cdtDt",
    "dbtDt"
})
public class FinancingDateDetails1 {

    @XmlElement(name = "BookDt")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> bookDt;
    @XmlElement(name = "CdtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cdtDt;
    @XmlElement(name = "DbtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dbtDt;

    /**
     * Gets the value of the bookDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bookDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     * @return
     *     The value of the bookDt property.
     */
    public List<XMLGregorianCalendar> getBookDt() {
        if (bookDt == null) {
            bookDt = new ArrayList<>();
        }
        return this.bookDt;
    }

    /**
     * Gets the value of the cdtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdtDt() {
        return cdtDt;
    }

    /**
     * Sets the value of the cdtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdtDt(XMLGregorianCalendar value) {
        this.cdtDt = value;
    }

    /**
     * Gets the value of the dbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDbtDt() {
        return dbtDt;
    }

    /**
     * Sets the value of the dbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDbtDt(XMLGregorianCalendar value) {
        this.dbtDt = value;
    }

}
