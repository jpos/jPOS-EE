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

package org.jpos.iso20022.acmt_031_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementMethod4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementMethod4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cdt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.031.001.04}CreditTransferTransaction51"/>
 *         <element name="Dbt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.031.001.04}CreditTransferTransaction51"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementMethod4Choice", propOrder = {
    "cdt",
    "dbt"
})
public class SettlementMethod4Choice {

    @XmlElement(name = "Cdt")
    protected CreditTransferTransaction51 cdt;
    @XmlElement(name = "Dbt")
    protected CreditTransferTransaction51 dbt;

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public CreditTransferTransaction51 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public void setCdt(CreditTransferTransaction51 value) {
        this.cdt = value;
    }

    /**
     * Gets the value of the dbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public CreditTransferTransaction51 getDbt() {
        return dbt;
    }

    /**
     * Sets the value of the dbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public void setDbt(CreditTransferTransaction51 value) {
        this.dbt = value;
    }

}
