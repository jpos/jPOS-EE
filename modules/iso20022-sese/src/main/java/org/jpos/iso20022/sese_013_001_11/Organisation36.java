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

package org.jpos.iso20022.sese_013_001_11;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Organisation36">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max140Text"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}PartyIdentification140" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text" minOccurs="0"/>
 *         <element name="TaxtnCtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}CountryCode" minOccurs="0"/>
 *         <element name="RegnCtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}CountryCode" minOccurs="0"/>
 *         <element name="RegnDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}ISODate" minOccurs="0"/>
 *         <element name="TaxIdNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text" minOccurs="0"/>
 *         <element name="NtlRegnNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text" minOccurs="0"/>
 *         <element name="CorpInvstrAdr" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}PostalAddress1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation36", propOrder = {
    "nm",
    "id",
    "purp",
    "taxtnCtry",
    "regnCtry",
    "regnDt",
    "taxIdNb",
    "ntlRegnNb",
    "corpInvstrAdr"
})
public class Organisation36 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "Id")
    protected PartyIdentification140 id;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "TaxtnCtry")
    protected String taxtnCtry;
    @XmlElement(name = "RegnCtry")
    protected String regnCtry;
    @XmlElement(name = "RegnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "NtlRegnNb")
    protected String ntlRegnNb;
    @XmlElement(name = "CorpInvstrAdr", required = true)
    protected PostalAddress1 corpInvstrAdr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification140 }
     *     
     */
    public PartyIdentification140 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification140 }
     *     
     */
    public void setId(PartyIdentification140 value) {
        this.id = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurp(String value) {
        this.purp = value;
    }

    /**
     * Gets the value of the taxtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnCtry() {
        return taxtnCtry;
    }

    /**
     * Sets the value of the taxtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxtnCtry(String value) {
        this.taxtnCtry = value;
    }

    /**
     * Gets the value of the regnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnCtry() {
        return regnCtry;
    }

    /**
     * Sets the value of the regnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnCtry(String value) {
        this.regnCtry = value;
    }

    /**
     * Gets the value of the regnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegnDt() {
        return regnDt;
    }

    /**
     * Sets the value of the regnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegnDt(XMLGregorianCalendar value) {
        this.regnDt = value;
    }

    /**
     * Gets the value of the taxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Sets the value of the taxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdNb(String value) {
        this.taxIdNb = value;
    }

    /**
     * Gets the value of the ntlRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlRegnNb() {
        return ntlRegnNb;
    }

    /**
     * Sets the value of the ntlRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlRegnNb(String value) {
        this.ntlRegnNb = value;
    }

    /**
     * Gets the value of the corpInvstrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getCorpInvstrAdr() {
        return corpInvstrAdr;
    }

    /**
     * Sets the value of the corpInvstrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public void setCorpInvstrAdr(PostalAddress1 value) {
        this.corpInvstrAdr = value;
    }

}
