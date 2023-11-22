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

package org.jpos.iso20022.sese_038_002_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateType38Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdateType38Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Addtn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}SecuritiesSettlementTransactionDetails53"/>
 *         <element name="Deltn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}SecuritiesSettlementTransactionDetails54"/>
 *         <element name="Mod" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.002.09}SecuritiesSettlementTransactionDetails55"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType38Choice", propOrder = {
    "addtn",
    "deltn",
    "mod"
})
public class UpdateType38Choice {

    @XmlElement(name = "Addtn")
    protected SecuritiesSettlementTransactionDetails53 addtn;
    @XmlElement(name = "Deltn")
    protected SecuritiesSettlementTransactionDetails54 deltn;
    @XmlElement(name = "Mod")
    protected SecuritiesSettlementTransactionDetails55 mod;

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails53 }
     *     
     */
    public SecuritiesSettlementTransactionDetails53 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails53 }
     *     
     */
    public void setAddtn(SecuritiesSettlementTransactionDetails53 value) {
        this.addtn = value;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails54 }
     *     
     */
    public SecuritiesSettlementTransactionDetails54 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails54 }
     *     
     */
    public void setDeltn(SecuritiesSettlementTransactionDetails54 value) {
        this.deltn = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails55 }
     *     
     */
    public SecuritiesSettlementTransactionDetails55 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails55 }
     *     
     */
    public void setMod(SecuritiesSettlementTransactionDetails55 value) {
        this.mod = value;
    }

}
