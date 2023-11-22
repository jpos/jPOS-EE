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

package org.jpos.iso20022.catp_012_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDepositRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMDepositRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ATMEnvironment11"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ATMContext10"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ATMTransaction15"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositRequest1", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class ATMDepositRequest1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment11 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext10 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction15 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment11 }
     *     
     */
    public ATMEnvironment11 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment11 }
     *     
     */
    public void setEnvt(ATMEnvironment11 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext10 }
     *     
     */
    public ATMContext10 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext10 }
     *     
     */
    public void setCntxt(ATMContext10 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction15 }
     *     
     */
    public ATMTransaction15 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction15 }
     *     
     */
    public void setTx(ATMTransaction15 value) {
        this.tx = value;
    }

}
