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

package org.jpos.iso20022.caam_012_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMExceptionAcknowledgement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMExceptionAcknowledgement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ATM" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}AutomatedTellerMachine3"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMContext20"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMTransaction28"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMExceptionAcknowledgement1", propOrder = {
    "atm",
    "cntxt",
    "tx"
})
public class ATMExceptionAcknowledgement1 {

    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine3 atm;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext20 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction28 tx;

    /**
     * Gets the value of the atm property.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedTellerMachine3 }
     *     
     */
    public AutomatedTellerMachine3 getATM() {
        return atm;
    }

    /**
     * Sets the value of the atm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine3 }
     *     
     */
    public void setATM(AutomatedTellerMachine3 value) {
        this.atm = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext20 }
     *     
     */
    public ATMContext20 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext20 }
     *     
     */
    public void setCntxt(ATMContext20 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction28 }
     *     
     */
    public ATMTransaction28 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction28 }
     *     
     */
    public void setTx(ATMTransaction28 value) {
        this.tx = value;
    }

}
