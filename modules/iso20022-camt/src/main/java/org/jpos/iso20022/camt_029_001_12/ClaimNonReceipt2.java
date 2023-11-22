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

package org.jpos.iso20022.camt_029_001_12;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimNonReceipt2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClaimNonReceipt2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtPrcd" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ISODate"/>
 *         <element name="OrgnlNxtAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimNonReceipt2", propOrder = {
    "dtPrcd",
    "orgnlNxtAgt"
})
public class ClaimNonReceipt2 {

    @XmlElement(name = "DtPrcd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtPrcd;
    @XmlElement(name = "OrgnlNxtAgt")
    protected BranchAndFinancialInstitutionIdentification6 orgnlNxtAgt;

    /**
     * Gets the value of the dtPrcd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtPrcd() {
        return dtPrcd;
    }

    /**
     * Sets the value of the dtPrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtPrcd(XMLGregorianCalendar value) {
        this.dtPrcd = value;
    }

    /**
     * Gets the value of the orgnlNxtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getOrgnlNxtAgt() {
        return orgnlNxtAgt;
    }

    /**
     * Sets the value of the orgnlNxtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setOrgnlNxtAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.orgnlNxtAgt = value;
    }

}
