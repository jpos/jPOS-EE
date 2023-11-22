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

package org.jpos.iso20022.camt_023_001_07;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstruction13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstruction13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqdExctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.023.001.07}ISODateTime" minOccurs="0"/>
 *         <element name="PmtTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.023.001.07}PaymentType4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction13", propOrder = {
    "reqdExctnDtTm",
    "pmtTp"
})
public class PaymentInstruction13 {

    @XmlElement(name = "ReqdExctnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqdExctnDtTm;
    @XmlElement(name = "PmtTp")
    protected PaymentType4Choice pmtTp;

    /**
     * Gets the value of the reqdExctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDtTm() {
        return reqdExctnDtTm;
    }

    /**
     * Sets the value of the reqdExctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDtTm(XMLGregorianCalendar value) {
        this.reqdExctnDtTm = value;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType4Choice }
     *     
     */
    public PaymentType4Choice getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType4Choice }
     *     
     */
    public void setPmtTp(PaymentType4Choice value) {
        this.pmtTp = value;
    }

}
