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

package org.jpos.iso20022.cain_028_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Environment29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Environment29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyIdentification263"/>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Accptr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyIdentification258" minOccurs="0"/>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Termnl" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Terminal6" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}CardData10"/>
 *         <element name="Tkn" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Token2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment29", propOrder = {
    "acqrr",
    "orgtr",
    "sndr",
    "rcvr",
    "accptr",
    "dstn",
    "termnl",
    "issr",
    "card",
    "tkn"
})
public class Environment29 {

    @XmlElement(name = "Acqrr", required = true)
    protected PartyIdentification263 acqrr;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Accptr")
    protected PartyIdentification258 accptr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "Termnl")
    protected Terminal6 termnl;
    @XmlElement(name = "Issr")
    protected PartyIdentification263 issr;
    @XmlElement(name = "Card", required = true)
    protected CardData10 card;
    @XmlElement(name = "Tkn")
    protected Token2 tkn;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setAcqrr(PartyIdentification263 value) {
        this.acqrr = value;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setOrgtr(PartyIdentification263 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setSndr(PartyIdentification263 value) {
        this.sndr = value;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setRcvr(PartyIdentification263 value) {
        this.rcvr = value;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public void setAccptr(PartyIdentification258 value) {
        this.accptr = value;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setDstn(PartyIdentification263 value) {
        this.dstn = value;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal6 }
     *     
     */
    public Terminal6 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal6 }
     *     
     */
    public void setTermnl(Terminal6 value) {
        this.termnl = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setIssr(PartyIdentification263 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData10 }
     *     
     */
    public CardData10 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData10 }
     *     
     */
    public void setCard(CardData10 value) {
        this.card = value;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token2 }
     *     
     */
    public Token2 getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token2 }
     *     
     */
    public void setTkn(Token2 value) {
        this.tkn = value;
    }

}
