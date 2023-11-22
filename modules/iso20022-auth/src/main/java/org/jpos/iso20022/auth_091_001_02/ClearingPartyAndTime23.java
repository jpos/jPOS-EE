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

package org.jpos.iso20022.auth_091_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingPartyAndTime23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingPartyAndTime23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CCP" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="ClrRctDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="ClrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="ClrIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}UniqueTransactionIdentifier1Choice" minOccurs="0"/>
 *         <element name="OrgnlIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}UniqueTransactionIdentifier1Choice" minOccurs="0"/>
 *         <element name="OrgnlTradRpstryIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPartyAndTime23", propOrder = {
    "ccp",
    "clrRctDtTm",
    "clrDtTm",
    "clrIdr",
    "orgnlIdr",
    "orgnlTradRpstryIdr"
})
public class ClearingPartyAndTime23 {

    @XmlElement(name = "CCP")
    protected OrganisationIdentification15Choice ccp;
    @XmlElement(name = "ClrRctDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clrRctDtTm;
    @XmlElement(name = "ClrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clrDtTm;
    @XmlElement(name = "ClrIdr")
    protected UniqueTransactionIdentifier1Choice clrIdr;
    @XmlElement(name = "OrgnlIdr")
    protected UniqueTransactionIdentifier1Choice orgnlIdr;
    @XmlElement(name = "OrgnlTradRpstryIdr")
    protected OrganisationIdentification15Choice orgnlTradRpstryIdr;

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setCCP(OrganisationIdentification15Choice value) {
        this.ccp = value;
    }

    /**
     * Gets the value of the clrRctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClrRctDtTm() {
        return clrRctDtTm;
    }

    /**
     * Sets the value of the clrRctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClrRctDtTm(XMLGregorianCalendar value) {
        this.clrRctDtTm = value;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClrDtTm(XMLGregorianCalendar value) {
        this.clrDtTm = value;
    }

    /**
     * Gets the value of the clrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public UniqueTransactionIdentifier1Choice getClrIdr() {
        return clrIdr;
    }

    /**
     * Sets the value of the clrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public void setClrIdr(UniqueTransactionIdentifier1Choice value) {
        this.clrIdr = value;
    }

    /**
     * Gets the value of the orgnlIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public UniqueTransactionIdentifier1Choice getOrgnlIdr() {
        return orgnlIdr;
    }

    /**
     * Sets the value of the orgnlIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public void setOrgnlIdr(UniqueTransactionIdentifier1Choice value) {
        this.orgnlIdr = value;
    }

    /**
     * Gets the value of the orgnlTradRpstryIdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getOrgnlTradRpstryIdr() {
        return orgnlTradRpstryIdr;
    }

    /**
     * Sets the value of the orgnlTradRpstryIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setOrgnlTradRpstryIdr(OrganisationIdentification15Choice value) {
        this.orgnlTradRpstryIdr = value;
    }

}
