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

package org.jpos.iso20022.catp_003_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMWithdrawalCompletionAdvice2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMWithdrawalCompletionAdvice2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ATMEnvironment13"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ATMContext9"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ATMTransaction17"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMWithdrawalCompletionAdvice2", propOrder = {
    "envt",
    "cntxt",
    "tx"
})
public class ATMWithdrawalCompletionAdvice2 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment13 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext9 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction17 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment13 }
     *     
     */
    public ATMEnvironment13 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment13 }
     *     
     */
    public void setEnvt(ATMEnvironment13 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext9 }
     *     
     */
    public ATMContext9 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext9 }
     *     
     */
    public void setCntxt(ATMContext9 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction17 }
     *     
     */
    public ATMTransaction17 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction17 }
     *     
     */
    public void setTx(ATMTransaction17 value) {
        this.tx = value;
    }

}
