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

package org.jpos.iso20022.seev_047_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification237 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification237">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}NameAndAddress17"/>
 *         <element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Max256Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PartyIdentification198Choice"/>
 *         <element name="CtryOfIncorprtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}CountryCode" minOccurs="0"/>
 *         <element name="YrOfIncorprtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}ISOYear" minOccurs="0"/>
 *         <element name="ActvtyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}ISICIdentifier" minOccurs="0"/>
 *         <element name="InvstrTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}InvestorType1Choice" minOccurs="0"/>
 *         <element name="Ownrsh" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}Ownership1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification237", propOrder = {
    "nmAndAdr",
    "emailAdr",
    "id",
    "ctryOfIncorprtn",
    "yrOfIncorprtn",
    "actvtyInd",
    "invstrTp",
    "ownrsh"
})
public class PartyIdentification237 {

    @XmlElement(name = "NmAndAdr", required = true)
    protected NameAndAddress17 nmAndAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "Id", required = true)
    protected PartyIdentification198Choice id;
    @XmlElement(name = "CtryOfIncorprtn")
    protected String ctryOfIncorprtn;
    @XmlElement(name = "YrOfIncorprtn")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yrOfIncorprtn;
    @XmlElement(name = "ActvtyInd")
    protected String actvtyInd;
    @XmlElement(name = "InvstrTp")
    protected InvestorType1Choice invstrTp;
    @XmlElement(name = "Ownrsh")
    protected Ownership1 ownrsh;

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress17 }
     *     
     */
    public NameAndAddress17 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress17 }
     *     
     */
    public void setNmAndAdr(NameAndAddress17 value) {
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

    /**
     * Gets the value of the yrOfIncorprtn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYrOfIncorprtn() {
        return yrOfIncorprtn;
    }

    /**
     * Sets the value of the yrOfIncorprtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYrOfIncorprtn(XMLGregorianCalendar value) {
        this.yrOfIncorprtn = value;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActvtyInd(String value) {
        this.actvtyInd = value;
    }

    /**
     * Gets the value of the invstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorType1Choice }
     *     
     */
    public InvestorType1Choice getInvstrTp() {
        return invstrTp;
    }

    /**
     * Sets the value of the invstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorType1Choice }
     *     
     */
    public void setInvstrTp(InvestorType1Choice value) {
        this.invstrTp = value;
    }

    /**
     * Gets the value of the ownrsh property.
     * 
     * @return
     *     possible object is
     *     {@link Ownership1 }
     *     
     */
    public Ownership1 getOwnrsh() {
        return ownrsh;
    }

    /**
     * Sets the value of the ownrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ownership1 }
     *     
     */
    public void setOwnrsh(Ownership1 value) {
        this.ownrsh = value;
    }

}
