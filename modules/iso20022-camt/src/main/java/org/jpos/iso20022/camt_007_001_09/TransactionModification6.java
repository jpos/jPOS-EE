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

package org.jpos.iso20022.camt_007_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionModification6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionModification6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}PaymentIdentification7Choice"/>
 *         <element name="NewPmtValSet" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}PaymentInstruction33"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionModification6", propOrder = {
    "pmtId",
    "newPmtValSet"
})
public class TransactionModification6 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification7Choice pmtId;
    @XmlElement(name = "NewPmtValSet", required = true)
    protected PaymentInstruction33 newPmtValSet;

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
     * Gets the value of the newPmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction33 }
     *     
     */
    public PaymentInstruction33 getNewPmtValSet() {
        return newPmtValSet;
    }

    /**
     * Sets the value of the newPmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction33 }
     *     
     */
    public void setNewPmtValSet(PaymentInstruction33 value) {
        this.newPmtValSet = value;
    }

}
