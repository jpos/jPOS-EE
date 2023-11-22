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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationReport14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationReport14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}TradeTransactionIdentification24"/>
 *         <element name="MtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}MatchingCriteria16"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationReport14", propOrder = {
    "txId",
    "mtchgCrit"
})
public class ReconciliationReport14 {

    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification24 txId;
    @XmlElement(name = "MtchgCrit", required = true)
    protected MatchingCriteria16 mtchgCrit;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public TradeTransactionIdentification24 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public void setTxId(TradeTransactionIdentification24 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the mtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingCriteria16 }
     *     
     */
    public MatchingCriteria16 getMtchgCrit() {
        return mtchgCrit;
    }

    /**
     * Sets the value of the mtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingCriteria16 }
     *     
     */
    public void setMtchgCrit(MatchingCriteria16 value) {
        this.mtchgCrit = value;
    }

}
