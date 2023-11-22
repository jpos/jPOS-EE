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

package org.jpos.iso20022.auth_019_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredContractAmendment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegisteredContractAmendment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmdmntDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ISODate"/>
 *         <element name="Doc" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}DocumentIdentification28"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ISODate" minOccurs="0"/>
 *         <element name="AmdmntRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}Max1025Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContractAmendment1", propOrder = {
    "amdmntDt",
    "doc",
    "startDt",
    "amdmntRsn",
    "addtlInf"
})
public class RegisteredContractAmendment1 {

    @XmlElement(name = "AmdmntDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar amdmntDt;
    @XmlElement(name = "Doc", required = true)
    protected DocumentIdentification28 doc;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "AmdmntRsn")
    protected String amdmntRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the amdmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmdmntDt() {
        return amdmntDt;
    }

    /**
     * Sets the value of the amdmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmdmntDt(XMLGregorianCalendar value) {
        this.amdmntDt = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public void setDoc(DocumentIdentification28 value) {
        this.doc = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the amdmntRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmdmntRsn() {
        return amdmntRsn;
    }

    /**
     * Sets the value of the amdmntRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmdmntRsn(String value) {
        this.amdmntRsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
