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

package org.jpos.iso20022.sese_038_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateType37Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdateType37Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Addtn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}SecuritiesSettlementTransactionDetails52"/>
 *         <element name="Deltn" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}SecuritiesSettlementTransactionDetails50"/>
 *         <element name="Mod" type="{urn:iso:std:iso:20022:tech:xsd:sese.038.001.09}SecuritiesSettlementTransactionDetails51"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType37Choice", propOrder = {
    "addtn",
    "deltn",
    "mod"
})
public class UpdateType37Choice {

    @XmlElement(name = "Addtn")
    protected SecuritiesSettlementTransactionDetails52 addtn;
    @XmlElement(name = "Deltn")
    protected SecuritiesSettlementTransactionDetails50 deltn;
    @XmlElement(name = "Mod")
    protected SecuritiesSettlementTransactionDetails51 mod;

    /**
     * Gets the value of the addtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails52 }
     *     
     */
    public SecuritiesSettlementTransactionDetails52 getAddtn() {
        return addtn;
    }

    /**
     * Sets the value of the addtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails52 }
     *     
     */
    public void setAddtn(SecuritiesSettlementTransactionDetails52 value) {
        this.addtn = value;
    }

    /**
     * Gets the value of the deltn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails50 }
     *     
     */
    public SecuritiesSettlementTransactionDetails50 getDeltn() {
        return deltn;
    }

    /**
     * Sets the value of the deltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails50 }
     *     
     */
    public void setDeltn(SecuritiesSettlementTransactionDetails50 value) {
        this.deltn = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionDetails51 }
     *     
     */
    public SecuritiesSettlementTransactionDetails51 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionDetails51 }
     *     
     */
    public void setMod(SecuritiesSettlementTransactionDetails51 value) {
        this.mod = value;
    }

}
