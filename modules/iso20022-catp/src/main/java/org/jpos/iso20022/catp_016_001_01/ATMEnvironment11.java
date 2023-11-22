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

package org.jpos.iso20022.catp_016_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMEnvironment11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMEnvironment11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Acquirer7" minOccurs="0"/>
 *         <element name="ATMMgrId" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="HstgNtty" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}TerminalHosting1" minOccurs="0"/>
 *         <element name="ATM" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}AutomatedTellerMachine9"/>
 *         <element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ATMCustomer4"/>
 *         <element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}PaymentCard22" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEnvironment11", propOrder = {
    "acqrr",
    "atmMgrId",
    "hstgNtty",
    "atm",
    "cstmr",
    "card"
})
public class ATMEnvironment11 {

    @XmlElement(name = "Acqrr")
    protected Acquirer7 acqrr;
    @XmlElement(name = "ATMMgrId")
    protected String atmMgrId;
    @XmlElement(name = "HstgNtty")
    protected TerminalHosting1 hstgNtty;
    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine9 atm;
    @XmlElement(name = "Cstmr", required = true)
    protected ATMCustomer4 cstmr;
    @XmlElement(name = "Card")
    protected PaymentCard22 card;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer7 }
     *     
     */
    public Acquirer7 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer7 }
     *     
     */
    public void setAcqrr(Acquirer7 value) {
        this.acqrr = value;
    }

    /**
     * Gets the value of the atmMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMMgrId() {
        return atmMgrId;
    }

    /**
     * Sets the value of the atmMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMMgrId(String value) {
        this.atmMgrId = value;
    }

    /**
     * Gets the value of the hstgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalHosting1 }
     *     
     */
    public TerminalHosting1 getHstgNtty() {
        return hstgNtty;
    }

    /**
     * Sets the value of the hstgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalHosting1 }
     *     
     */
    public void setHstgNtty(TerminalHosting1 value) {
        this.hstgNtty = value;
    }

    /**
     * Gets the value of the atm property.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedTellerMachine9 }
     *     
     */
    public AutomatedTellerMachine9 getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine9 }
     *     
     */
    public void setATM(AutomatedTellerMachine9 value) {
        this.atm = value;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomer4 }
     *     
     */
    public ATMCustomer4 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomer4 }
     *     
     */
    public void setCstmr(ATMCustomer4 value) {
        this.cstmr = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard22 }
     *     
     */
    public PaymentCard22 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard22 }
     *     
     */
    public void setCard(PaymentCard22 value) {
        this.card = value;
    }

}
