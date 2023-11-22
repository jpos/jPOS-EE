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

package org.jpos.iso20022.camt_037_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingTransaction7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnderlyingTransaction7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Initn" type="{urn:iso:std:iso:20022:tech:xsd:camt.037.001.09}UnderlyingPaymentInstruction7"/>
 *         <element name="IntrBk" type="{urn:iso:std:iso:20022:tech:xsd:camt.037.001.09}UnderlyingPaymentTransaction6"/>
 *         <element name="StmtNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.037.001.09}UnderlyingStatementEntry3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction7Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry"
})
public class UnderlyingTransaction7Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction7 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction6 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry3 stmtNtry;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction7 }
     *     
     */
    public UnderlyingPaymentInstruction7 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction7 }
     *     
     */
    public void setInitn(UnderlyingPaymentInstruction7 value) {
        this.initn = value;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction6 }
     *     
     */
    public UnderlyingPaymentTransaction6 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction6 }
     *     
     */
    public void setIntrBk(UnderlyingPaymentTransaction6 value) {
        this.intrBk = value;
    }

    /**
     * Gets the value of the stmtNtry property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingStatementEntry3 }
     *     
     */
    public UnderlyingStatementEntry3 getStmtNtry() {
        return stmtNtry;
    }

    /**
     * Sets the value of the stmtNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingStatementEntry3 }
     *     
     */
    public void setStmtNtry(UnderlyingStatementEntry3 value) {
        this.stmtNtry = value;
    }

}
