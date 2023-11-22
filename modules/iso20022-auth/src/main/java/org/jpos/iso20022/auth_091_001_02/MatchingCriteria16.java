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
 * <p>Java class for MatchingCriteria16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MatchingCriteria16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyMtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CounterpartyMatchingCriteria6" minOccurs="0"/>
 *         <element name="ValtnMtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ValuationMatchingCriteria1" minOccurs="0"/>
 *         <element name="CtrctMtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ContractMatchingCriteria3" minOccurs="0"/>
 *         <element name="TxMtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}TransactionMatchingCriteria6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingCriteria16", propOrder = {
    "ctrPtyMtchgCrit",
    "valtnMtchgCrit",
    "ctrctMtchgCrit",
    "txMtchgCrit"
})
public class MatchingCriteria16 {

    @XmlElement(name = "CtrPtyMtchgCrit")
    protected CounterpartyMatchingCriteria6 ctrPtyMtchgCrit;
    @XmlElement(name = "ValtnMtchgCrit")
    protected ValuationMatchingCriteria1 valtnMtchgCrit;
    @XmlElement(name = "CtrctMtchgCrit")
    protected ContractMatchingCriteria3 ctrctMtchgCrit;
    @XmlElement(name = "TxMtchgCrit")
    protected TransactionMatchingCriteria6 txMtchgCrit;

    /**
     * Gets the value of the ctrPtyMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyMatchingCriteria6 }
     *     
     */
    public CounterpartyMatchingCriteria6 getCtrPtyMtchgCrit() {
        return ctrPtyMtchgCrit;
    }

    /**
     * Sets the value of the ctrPtyMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyMatchingCriteria6 }
     *     
     */
    public void setCtrPtyMtchgCrit(CounterpartyMatchingCriteria6 value) {
        this.ctrPtyMtchgCrit = value;
    }

    /**
     * Gets the value of the valtnMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMatchingCriteria1 }
     *     
     */
    public ValuationMatchingCriteria1 getValtnMtchgCrit() {
        return valtnMtchgCrit;
    }

    /**
     * Sets the value of the valtnMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMatchingCriteria1 }
     *     
     */
    public void setValtnMtchgCrit(ValuationMatchingCriteria1 value) {
        this.valtnMtchgCrit = value;
    }

    /**
     * Gets the value of the ctrctMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ContractMatchingCriteria3 }
     *     
     */
    public ContractMatchingCriteria3 getCtrctMtchgCrit() {
        return ctrctMtchgCrit;
    }

    /**
     * Sets the value of the ctrctMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractMatchingCriteria3 }
     *     
     */
    public void setCtrctMtchgCrit(ContractMatchingCriteria3 value) {
        this.ctrctMtchgCrit = value;
    }

    /**
     * Gets the value of the txMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMatchingCriteria6 }
     *     
     */
    public TransactionMatchingCriteria6 getTxMtchgCrit() {
        return txMtchgCrit;
    }

    /**
     * Sets the value of the txMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMatchingCriteria6 }
     *     
     */
    public void setTxMtchgCrit(TransactionMatchingCriteria6 value) {
        this.txMtchgCrit = value;
    }

}
