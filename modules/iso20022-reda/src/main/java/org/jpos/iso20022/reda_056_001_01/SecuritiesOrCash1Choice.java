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

package org.jpos.iso20022.reda_056_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesOrCash1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesOrCash1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SctiesDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}SettlementParties35"/>
 *         <element name="CshPtiesDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}CashParties24"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOrCash1Choice", propOrder = {
    "sctiesDtls",
    "cshPtiesDtls"
})
public class SecuritiesOrCash1Choice {

    @XmlElement(name = "SctiesDtls")
    protected SettlementParties35 sctiesDtls;
    @XmlElement(name = "CshPtiesDtls")
    protected CashParties24 cshPtiesDtls;

    /**
     * Gets the value of the sctiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties35 }
     *     
     */
    public SettlementParties35 getSctiesDtls() {
        return sctiesDtls;
    }

    /**
     * Sets the value of the sctiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties35 }
     *     
     */
    public void setSctiesDtls(SettlementParties35 value) {
        this.sctiesDtls = value;
    }

    /**
     * Gets the value of the cshPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties24 }
     *     
     */
    public CashParties24 getCshPtiesDtls() {
        return cshPtiesDtls;
    }

    /**
     * Sets the value of the cshPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties24 }
     *     
     */
    public void setCshPtiesDtls(CashParties24 value) {
        this.cshPtiesDtls = value;
    }

}
