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

package org.jpos.iso20022.cain_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Environment18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Environment18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification263"/>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Accptr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification255"/>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Termnl" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Terminal4" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}CardData6" minOccurs="0"/>
 *         <element name="CstmrDvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}CustomerDevice4" minOccurs="0"/>
 *         <element name="Wllt" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Wallet2" minOccurs="0"/>
 *         <element name="Tkn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Token2" minOccurs="0"/>
 *         <element name="Crdhldr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Cardholder19" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment18", propOrder = {
    "acqrr",
    "orgtr",
    "sndr",
    "rcvr",
    "accptr",
    "dstn",
    "termnl",
    "issr",
    "card",
    "cstmrDvc",
    "wllt",
    "tkn",
    "crdhldr"
})
public class Environment18 {

    @XmlElement(name = "Acqrr", required = true)
    protected PartyIdentification263 acqrr;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Accptr", required = true)
    protected PartyIdentification255 accptr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "Termnl")
    protected Terminal4 termnl;
    @XmlElement(name = "Issr")
    protected PartyIdentification263 issr;
    @XmlElement(name = "Card")
    protected CardData6 card;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice4 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected Wallet2 wllt;
    @XmlElement(name = "Tkn")
    protected Token2 tkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder19 crdhldr;

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
     *     {@link PartyIdentification255 }
     *     
     */
    public PartyIdentification255 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification255 }
     *     
     */
    public void setAccptr(PartyIdentification255 value) {
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
     *     {@link Terminal4 }
     *     
     */
    public Terminal4 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal4 }
     *     
     */
    public void setTermnl(Terminal4 value) {
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
     *     {@link CardData6 }
     *     
     */
    public CardData6 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData6 }
     *     
     */
    public void setCard(CardData6 value) {
        this.card = value;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice4 }
     *     
     */
    public CustomerDevice4 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice4 }
     *     
     */
    public void setCstmrDvc(CustomerDevice4 value) {
        this.cstmrDvc = value;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link Wallet2 }
     *     
     */
    public Wallet2 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet2 }
     *     
     */
    public void setWllt(Wallet2 value) {
        this.wllt = value;
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

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder19 }
     *     
     */
    public Cardholder19 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder19 }
     *     
     */
    public void setCrdhldr(Cardholder19 value) {
        this.crdhldr = value;
    }

}
