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

package org.jpos.iso20022.seev_003_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification269 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification269">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}PersonName2"/>
 *         <element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}Max256Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}PartyIdentification198Choice" minOccurs="0"/>
 *         <element name="CpnyRegrShrhldrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}Max35Text" minOccurs="0"/>
 *         <element name="CtryOfIncorprtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.003.001.09}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification269", propOrder = {
    "nmAndAdr",
    "emailAdr",
    "id",
    "cpnyRegrShrhldrId",
    "ctryOfIncorprtn"
})
public class PartyIdentification269 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected PersonName2 nmAndAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id")
    protected PartyIdentification198Choice id;
    @XmlElement(name = "CpnyRegrShrhldrId")
    protected String cpnyRegrShrhldrId;
    @XmlElement(name = "CtryOfIncorprtn")
    protected String ctryOfIncorprtn;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName2 }
     *     
     */
    public PersonName2 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName2 }
     *     
     */
    public void setNmAndAdr(PersonName2 value) {
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
     *     {@link PartyIdentification198Choice }
     *     
     */
    public PartyIdentification198Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification198Choice }
     *     
     */
    public void setId(PartyIdentification198Choice value) {
        this.id = value;
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

    /**
     * Gets the value of the ctryOfIncorprtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncorprtn() {
        return ctryOfIncorprtn;
    }

    /**
     * Sets the value of the ctryOfIncorprtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfIncorprtn(String value) {
        this.ctryOfIncorprtn = value;
    }

}
