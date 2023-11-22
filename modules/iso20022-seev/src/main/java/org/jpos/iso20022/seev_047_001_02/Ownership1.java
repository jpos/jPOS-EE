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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ownership1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Ownership1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OwnrshTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}OwnershipType3Choice" minOccurs="0"/>
 *         <element name="OwnrshPctg" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PercentageRate" minOccurs="0"/>
 *         <element name="UsfrctPctg" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ownership1", propOrder = {
    "ownrshTp",
    "ownrshPctg",
    "usfrctPctg"
})
public class Ownership1 {

    @XmlElement(name = "OwnrshTp")
    protected OwnershipType3Choice ownrshTp;
    @XmlElement(name = "OwnrshPctg")
    protected BigDecimal ownrshPctg;
    @XmlElement(name = "UsfrctPctg")
    protected BigDecimal usfrctPctg;

    /**
     * Gets the value of the ownrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType3Choice }
     *     
     */
    public OwnershipType3Choice getOwnrshTp() {
        return ownrshTp;
    }

    /**
     * Sets the value of the ownrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType3Choice }
     *     
     */
    public void setOwnrshTp(OwnershipType3Choice value) {
        this.ownrshTp = value;
    }

    /**
     * Gets the value of the ownrshPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnrshPctg() {
        return ownrshPctg;
    }

    /**
     * Sets the value of the ownrshPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnrshPctg(BigDecimal value) {
        this.ownrshPctg = value;
    }

    /**
     * Gets the value of the usfrctPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsfrctPctg() {
        return usfrctPctg;
    }

    /**
     * Sets the value of the usfrctPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsfrctPctg(BigDecimal value) {
        this.usfrctPctg = value;
    }

}
