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

package org.jpos.iso20022.camt_052_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionQuantities3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionQuantities3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.11}FinancialInstrumentQuantity1Choice"/>
 *         <element name="OrgnlAndCurFaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.11}OriginalAndCurrentQuantities1"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.11}ProprietaryQuantity1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionQuantities3Choice", propOrder = {
    "qty",
    "orgnlAndCurFaceAmt",
    "prtry"
})
public class TransactionQuantities3Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "OrgnlAndCurFaceAmt")
    protected OriginalAndCurrentQuantities1 orgnlAndCurFaceAmt;
    @XmlElement(name = "Prtry")
    protected ProprietaryQuantity1 prtry;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the orgnlAndCurFaceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities1 }
     *     
     */
    public OriginalAndCurrentQuantities1 getOrgnlAndCurFaceAmt() {
        return orgnlAndCurFaceAmt;
    }

    /**
     * Sets the value of the orgnlAndCurFaceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities1 }
     *     
     */
    public void setOrgnlAndCurFaceAmt(OriginalAndCurrentQuantities1 value) {
        this.orgnlAndCurFaceAmt = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryQuantity1 }
     *     
     */
    public ProprietaryQuantity1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryQuantity1 }
     *     
     */
    public void setPrtry(ProprietaryQuantity1 value) {
        this.prtry = value;
    }

}
