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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldingBalance12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HoldingBalance12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}SignedQuantityFormat15"/>
 *         <element name="BalTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}SecuritiesEntryType2Code" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}SafekeepingPlaceFormat28Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingBalance12", propOrder = {
    "bal",
    "balTp",
    "sfkpgPlc"
})
public class HoldingBalance12 {

    @XmlElement(name = "Bal", required = true)
    protected SignedQuantityFormat15 bal;
    @XmlElement(name = "BalTp")
    @XmlSchemaType(name = "string")
    protected SecuritiesEntryType2Code balTp;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat28Choice sfkpgPlc;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat15 }
     *     
     */
    public SignedQuantityFormat15 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat15 }
     *     
     */
    public void setBal(SignedQuantityFormat15 value) {
        this.bal = value;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEntryType2Code }
     *     
     */
    public SecuritiesEntryType2Code getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEntryType2Code }
     *     
     */
    public void setBalTp(SecuritiesEntryType2Code value) {
        this.balTp = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public SafekeepingPlaceFormat28Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat28Choice value) {
        this.sfkpgPlc = value;
    }

}
