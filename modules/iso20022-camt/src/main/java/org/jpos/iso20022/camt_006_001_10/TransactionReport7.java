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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReport7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionReport7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentIdentification7Choice"/>
 *         <element name="TxOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}TransactionOrError5Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReport7", propOrder = {
    "pmtId",
    "txOrErr"
})
public class TransactionReport7 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification7Choice pmtId;
    @XmlElement(name = "TxOrErr", required = true)
    protected TransactionOrError5Choice txOrErr;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification7Choice }
     *     
     */
    public PaymentIdentification7Choice getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification7Choice }
     *     
     */
    public void setPmtId(PaymentIdentification7Choice value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the txOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOrError5Choice }
     *     
     */
    public TransactionOrError5Choice getTxOrErr() {
        return txOrErr;
    }

    /**
     * Sets the value of the txOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOrError5Choice }
     *     
     */
    public void setTxOrErr(TransactionOrError5Choice value) {
        this.txOrErr = value;
    }

}
