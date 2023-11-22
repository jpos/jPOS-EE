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

package org.jpos.iso20022.catp_013_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMEnvironment12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMEnvironment12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}Acquirer7" minOccurs="0"/>
 *         <element name="ATMMgr" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}Acquirer8" minOccurs="0"/>
 *         <element name="HstgNtty" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}TerminalHosting1" minOccurs="0"/>
 *         <element name="ATM" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}AutomatedTellerMachine2"/>
 *         <element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}ATMCustomer5"/>
 *         <element name="PrtctdCardData" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="PlainCardData" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}PlainCardData19" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEnvironment12", propOrder = {
    "acqrr",
    "atmMgr",
    "hstgNtty",
    "atm",
    "cstmr",
    "prtctdCardData",
    "plainCardData"
})
public class ATMEnvironment12 {

    @XmlElement(name = "Acqrr")
    protected Acquirer7 acqrr;
    @XmlElement(name = "ATMMgr")
    protected Acquirer8 atmMgr;
    @XmlElement(name = "HstgNtty")
    protected TerminalHosting1 hstgNtty;
    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine2 atm;
    @XmlElement(name = "Cstmr", required = true)
    protected ATMCustomer5 cstmr;
    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData19 plainCardData;

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
     * Gets the value of the atmMgr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer8 }
     *     
     */
    public Acquirer8 getATMMgr() {
        return atmMgr;
    }

    /**
     * Sets the value of the atmMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer8 }
     *     
     */
    public void setATMMgr(Acquirer8 value) {
        this.atmMgr = value;
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
     *     {@link AutomatedTellerMachine2 }
     *     
     */
    public AutomatedTellerMachine2 getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine2 }
     *     
     */
    public void setATM(AutomatedTellerMachine2 value) {
        this.atm = value;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomer5 }
     *     
     */
    public ATMCustomer5 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomer5 }
     *     
     */
    public void setCstmr(ATMCustomer5 value) {
        this.cstmr = value;
    }

    /**
     * Gets the value of the prtctdCardData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdCardData() {
        return prtctdCardData;
    }

    /**
     * Sets the value of the prtctdCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData19 }
     *     
     */
    public PlainCardData19 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData19 }
     *     
     */
    public void setPlainCardData(PlainCardData19 value) {
        this.plainCardData = value;
    }

}
