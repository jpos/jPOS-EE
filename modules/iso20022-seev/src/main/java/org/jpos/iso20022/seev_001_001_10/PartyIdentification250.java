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

package org.jpos.iso20022.seev_001_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification250 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification250">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PersonName3"/>
 *         <element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max256Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}NaturalPersonIdentification1" minOccurs="0"/>
 *         <element name="Ntlty" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}CountryCode" minOccurs="0"/>
 *         <element name="DtAndPlcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}DateAndPlaceOfBirth2" minOccurs="0"/>
 *         <element name="CpnyRegrShrhldrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification250", propOrder = {
    "nmAndAdr",
    "emailAdr",
    "id",
    "ntlty",
    "dtAndPlcOfBirth",
    "cpnyRegrShrhldrId"
})
public class PartyIdentification250 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected PersonName3 nmAndAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id")
    protected NaturalPersonIdentification1 id;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth2 dtAndPlcOfBirth;
    @XmlElement(name = "CpnyRegrShrhldrId")
    protected String cpnyRegrShrhldrId;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName3 }
     *     
     */
    public PersonName3 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName3 }
     *     
     */
    public void setNmAndAdr(PersonName3 value) {
        this.nmAndAdr = value;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAdr(String value) {
        this.emailAdr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalPersonIdentification1 }
     *     
     */
    public NaturalPersonIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalPersonIdentification1 }
     *     
     */
    public void setId(NaturalPersonIdentification1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the ntlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Sets the value of the ntlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlty(String value) {
        this.ntlty = value;
    }

    /**
     * Gets the value of the dtAndPlcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth2 }
     *     
     */
    public DateAndPlaceOfBirth2 getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Sets the value of the dtAndPlcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth2 }
     *     
     */
    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth2 value) {
        this.dtAndPlcOfBirth = value;
    }

    /**
     * Gets the value of the cpnyRegrShrhldrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyRegrShrhldrId() {
        return cpnyRegrShrhldrId;
    }

    /**
     * Sets the value of the cpnyRegrShrhldrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnyRegrShrhldrId(String value) {
        this.cpnyRegrShrhldrId = value;
    }

}
