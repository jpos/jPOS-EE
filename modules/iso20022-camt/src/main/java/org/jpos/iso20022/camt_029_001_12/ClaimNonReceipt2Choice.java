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

package org.jpos.iso20022.camt_029_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimNonReceipt2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClaimNonReceipt2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ClaimNonReceipt2"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ClaimNonReceiptRejectReason1Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimNonReceipt2Choice", propOrder = {
    "accptd",
    "rjctd"
})
public class ClaimNonReceipt2Choice {

    @XmlElement(name = "Accptd")
    protected ClaimNonReceipt2 accptd;
    @XmlElement(name = "Rjctd")
    protected ClaimNonReceiptRejectReason1Choice rjctd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceipt2 }
     *     
     */
    public ClaimNonReceipt2 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceipt2 }
     *     
     */
    public void setAccptd(ClaimNonReceipt2 value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceiptRejectReason1Choice }
     *     
     */
    public ClaimNonReceiptRejectReason1Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceiptRejectReason1Choice }
     *     
     */
    public void setRjctd(ClaimNonReceiptRejectReason1Choice value) {
        this.rjctd = value;
    }

}
