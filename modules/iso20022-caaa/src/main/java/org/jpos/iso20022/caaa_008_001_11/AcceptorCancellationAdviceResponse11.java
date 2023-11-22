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

package org.jpos.iso20022.caaa_008_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorCancellationAdviceResponse11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorCancellationAdviceResponse11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}CardPaymentEnvironment79"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}CardPaymentTransactionAdviceResponse8"/>
 *         <element name="TMSTrggr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}TMSTrigger1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationAdviceResponse11", propOrder = {
    "envt",
    "tx",
    "tmsTrggr"
})
public class AcceptorCancellationAdviceResponse11 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransactionAdviceResponse8 tx;
    @XmlElement(name = "TMSTrggr")
    protected TMSTrigger1 tmsTrggr;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public CardPaymentEnvironment79 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public void setEnvt(CardPaymentEnvironment79 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionAdviceResponse8 }
     *     
     */
    public CardPaymentTransactionAdviceResponse8 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionAdviceResponse8 }
     *     
     */
    public void setTx(CardPaymentTransactionAdviceResponse8 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the tmsTrggr property.
     * 
     * @return
     *     possible object is
     *     {@link TMSTrigger1 }
     *     
     */
    public TMSTrigger1 getTMSTrggr() {
        return tmsTrggr;
    }

    /**
     * Sets the value of the tmsTrggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSTrigger1 }
     *     
     */
    public void setTMSTrggr(TMSTrigger1 value) {
        this.tmsTrggr = value;
    }

}
