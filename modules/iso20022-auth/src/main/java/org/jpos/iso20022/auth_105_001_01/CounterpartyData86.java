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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyData86 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyData86">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}CounterpartyIdentification10" minOccurs="0"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AgtLndr" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData86", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "trptyAgt",
    "agtLndr"
})
public class CounterpartyData86 {

    @XmlElement(name = "RptgCtrPty")
    protected CounterpartyIdentification10 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected OrganisationIdentification15Choice othrCtrPty;
    @XmlElement(name = "TrptyAgt")
    protected Boolean trptyAgt;
    @XmlElement(name = "AgtLndr")
    protected Boolean agtLndr;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification10 }
     *     
     */
    public CounterpartyIdentification10 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification10 }
     *     
     */
    public void setRptgCtrPty(CounterpartyIdentification10 value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setOthrCtrPty(OrganisationIdentification15Choice value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrptyAgt(Boolean value) {
        this.trptyAgt = value;
    }

    /**
     * Gets the value of the agtLndr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgtLndr() {
        return agtLndr;
    }

    /**
     * Sets the value of the agtLndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgtLndr(Boolean value) {
        this.agtLndr = value;
    }

}
