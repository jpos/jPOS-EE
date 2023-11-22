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

package org.jpos.iso20022.auth_084_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIdentification3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionIdentification3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}TradeTransactionIdentification20"/>
 *         <element name="MrgnRptg" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}TradeTransactionIdentification16"/>
 *         <element name="CollReuse" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}TradeTransactionIdentification17"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification3Choice", propOrder = {
    "tx",
    "mrgnRptg",
    "collReuse"
})
public class TransactionIdentification3Choice {

    @XmlElement(name = "Tx")
    protected TradeTransactionIdentification20 tx;
    @XmlElement(name = "MrgnRptg")
    protected TradeTransactionIdentification16 mrgnRptg;
    @XmlElement(name = "CollReuse")
    protected TradeTransactionIdentification17 collReuse;

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification20 }
     *     
     */
    public TradeTransactionIdentification20 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification20 }
     *     
     */
    public void setTx(TradeTransactionIdentification20 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the mrgnRptg property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification16 }
     *     
     */
    public TradeTransactionIdentification16 getMrgnRptg() {
        return mrgnRptg;
    }

    /**
     * Sets the value of the mrgnRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification16 }
     *     
     */
    public void setMrgnRptg(TradeTransactionIdentification16 value) {
        this.mrgnRptg = value;
    }

    /**
     * Gets the value of the collReuse property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification17 }
     *     
     */
    public TradeTransactionIdentification17 getCollReuse() {
        return collReuse;
    }

    /**
     * Sets the value of the collReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification17 }
     *     
     */
    public void setCollReuse(TradeTransactionIdentification17 value) {
        this.collReuse = value;
    }

}
