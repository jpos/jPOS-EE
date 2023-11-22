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

package org.jpos.iso20022.caaa_010_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorReconciliationResponse9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorReconciliationResponse9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.010.001.10}CardPaymentEnvironment79"/>
 *         <element name="TxRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.010.001.10}ResponseType10"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.010.001.10}TransactionReconciliation5"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorReconciliationResponse9", propOrder = {
    "envt",
    "txRspn",
    "tx"
})
public class AcceptorReconciliationResponse9 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType10 txRspn;
    @XmlElement(name = "Tx", required = true)
    protected TransactionReconciliation5 tx;

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
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType10 }
     *     
     */
    public ResponseType10 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType10 }
     *     
     */
    public void setTxRspn(ResponseType10 value) {
        this.txRspn = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReconciliation5 }
     *     
     */
    public TransactionReconciliation5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReconciliation5 }
     *     
     */
    public void setTx(TransactionReconciliation5 value) {
        this.tx = value;
    }

}
