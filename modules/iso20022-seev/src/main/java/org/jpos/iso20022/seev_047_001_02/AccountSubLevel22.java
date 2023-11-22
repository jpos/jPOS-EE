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

package org.jpos.iso20022.seev_047_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSubLevel22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountSubLevel22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NonDscldShrhldgQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="BlwThrshldShrhldgQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="Dsclsr" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}AccountSubLevel23" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel22", propOrder = {
    "nonDscldShrhldgQty",
    "blwThrshldShrhldgQty",
    "dsclsr"
})
public class AccountSubLevel22 {

    @XmlElement(name = "NonDscldShrhldgQty")
    protected FinancialInstrumentQuantity18Choice nonDscldShrhldgQty;
    @XmlElement(name = "BlwThrshldShrhldgQty")
    protected FinancialInstrumentQuantity18Choice blwThrshldShrhldgQty;
    @XmlElement(name = "Dsclsr")
    protected List<AccountSubLevel23> dsclsr;

    /**
     * Gets the value of the nonDscldShrhldgQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getNonDscldShrhldgQty() {
        return nonDscldShrhldgQty;
    }

    /**
     * Sets the value of the nonDscldShrhldgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setNonDscldShrhldgQty(FinancialInstrumentQuantity18Choice value) {
        this.nonDscldShrhldgQty = value;
    }

    /**
     * Gets the value of the blwThrshldShrhldgQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getBlwThrshldShrhldgQty() {
        return blwThrshldShrhldgQty;
    }

    /**
     * Sets the value of the blwThrshldShrhldgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setBlwThrshldShrhldgQty(FinancialInstrumentQuantity18Choice value) {
        this.blwThrshldShrhldgQty = value;
    }

    /**
     * Gets the value of the dsclsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsclsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsclsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSubLevel23 }
     * 
     * 
     * @return
     *     The value of the dsclsr property.
     */
    public List<AccountSubLevel23> getDsclsr() {
        if (dsclsr == null) {
            dsclsr = new ArrayList<>();
        }
        return this.dsclsr;
    }

}
