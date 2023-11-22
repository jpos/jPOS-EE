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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionQuery7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionQuery7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}QueryType2Code" minOccurs="0"/>
 *         <element name="TxCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}TransactionCriteria7Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionQuery7", propOrder = {
    "qryTp",
    "txCrit"
})
public class TransactionQuery7 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "TxCrit")
    protected TransactionCriteria7Choice txCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType2Code }
     *     
     */
    public QueryType2Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType2Code }
     *     
     */
    public void setQryTp(QueryType2Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the txCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCriteria7Choice }
     *     
     */
    public TransactionCriteria7Choice getTxCrit() {
        return txCrit;
    }

    /**
     * Sets the value of the txCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCriteria7Choice }
     *     
     */
    public void setTxCrit(TransactionCriteria7Choice value) {
        this.txCrit = value;
    }

}
