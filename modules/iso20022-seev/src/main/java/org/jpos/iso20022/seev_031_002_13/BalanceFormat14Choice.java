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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceFormat14Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BalanceFormat14Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}SignedQuantityFormat12"/>
 *         <element name="ElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}SignedQuantityFormat13"/>
 *         <element name="NotElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}SignedQuantityFormat13"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceFormat14Choice", propOrder = {
    "bal",
    "elgblBal",
    "notElgblBal"
})
public class BalanceFormat14Choice {

    @XmlElement(name = "Bal")
    protected SignedQuantityFormat12 bal;
    @XmlElement(name = "ElgblBal")
    protected SignedQuantityFormat13 elgblBal;
    @XmlElement(name = "NotElgblBal")
    protected SignedQuantityFormat13 notElgblBal;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public SignedQuantityFormat12 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public void setBal(SignedQuantityFormat12 value) {
        this.bal = value;
    }

    /**
     * Gets the value of the elgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getElgblBal() {
        return elgblBal;
    }

    /**
     * Sets the value of the elgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setElgblBal(SignedQuantityFormat13 value) {
        this.elgblBal = value;
    }

    /**
     * Gets the value of the notElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getNotElgblBal() {
        return notElgblBal;
    }

    /**
     * Sets the value of the notElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setNotElgblBal(SignedQuantityFormat13 value) {
        this.notElgblBal = value;
    }

}
