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

package org.jpos.iso20022.tsrv_013_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Presentation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Presentation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Presntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="BnfcryPresntnDt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.013.001.01}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presentation2", propOrder = {
    "presntr",
    "bnfcryPresntnDt"
})
public class Presentation2 {

    @XmlElement(name = "Presntr")
    protected PartyIdentification43 presntr;
    @XmlElement(name = "BnfcryPresntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bnfcryPresntnDt;

    /**
     * Gets the value of the presntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getPresntr() {
        return presntr;
    }

    /**
     * Sets the value of the presntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setPresntr(PartyIdentification43 value) {
        this.presntr = value;
    }

    /**
     * Gets the value of the bnfcryPresntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBnfcryPresntnDt() {
        return bnfcryPresntnDt;
    }

    /**
     * Sets the value of the bnfcryPresntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBnfcryPresntnDt(XMLGregorianCalendar value) {
        this.bnfcryPresntnDt = value;
    }

}
