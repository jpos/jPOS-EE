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

package org.jpos.iso20022.reda_006_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentForm2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentForm2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BookgApprnc" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Appearance3Choice" minOccurs="0"/>
 *         <element name="LglForm" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FormOfSecurity8Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentForm2", propOrder = {
    "bookgApprnc",
    "lglForm"
})
public class FinancialInstrumentForm2 {

    @XmlElement(name = "BookgApprnc")
    protected Appearance3Choice bookgApprnc;
    @XmlElement(name = "LglForm")
    protected FormOfSecurity8Choice lglForm;

    /**
     * Gets the value of the bookgApprnc property.
     * 
     * @return
     *     possible object is
     *     {@link Appearance3Choice }
     *     
     */
    public Appearance3Choice getBookgApprnc() {
        return bookgApprnc;
    }

    /**
     * Sets the value of the bookgApprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance3Choice }
     *     
     */
    public void setBookgApprnc(Appearance3Choice value) {
        this.bookgApprnc = value;
    }

    /**
     * Gets the value of the lglForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity8Choice }
     *     
     */
    public FormOfSecurity8Choice getLglForm() {
        return lglForm;
    }

    /**
     * Sets the value of the lglForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity8Choice }
     *     
     */
    public void setLglForm(FormOfSecurity8Choice value) {
        this.lglForm = value;
    }

}
