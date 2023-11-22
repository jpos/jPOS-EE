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

package org.jpos.iso20022.pacs_007_001_12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDateTimeIndication1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDateTimeIndication1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DbtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}ISODateTime" minOccurs="0"/>
 *         <element name="CdtDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDateTimeIndication1", propOrder = {
    "dbtDtTm",
    "cdtDtTm"
})
public class SettlementDateTimeIndication1 {

    @XmlElement(name = "DbtDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dbtDtTm;
    @XmlElement(name = "CdtDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdtDtTm;

    /**
     * Gets the value of the dbtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDbtDtTm() {
        return dbtDtTm;
    }

    /**
     * Sets the value of the dbtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDbtDtTm(XMLGregorianCalendar value) {
        this.dbtDtTm = value;
    }

    /**
     * Gets the value of the cdtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdtDtTm() {
        return cdtDtTm;
    }

    /**
     * Sets the value of the cdtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdtDtTm(XMLGregorianCalendar value) {
        this.cdtDtTm = value;
    }

}
