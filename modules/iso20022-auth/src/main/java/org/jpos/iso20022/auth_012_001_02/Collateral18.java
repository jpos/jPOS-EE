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

package org.jpos.iso20022.auth_012_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Collateral18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Collateral18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Valtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}SecuredCollateral2Choice"/>
 *         <element name="Hrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}PercentageRate" minOccurs="0"/>
 *         <element name="SpclCollInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.012.001.02}SpecialCollateral2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral18", propOrder = {
    "valtn",
    "hrcut",
    "spclCollInd"
})
public class Collateral18 {

    @XmlElement(name = "Valtn", required = true)
    protected SecuredCollateral2Choice valtn;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "SpclCollInd")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral2Code spclCollInd;

    /**
     * Gets the value of the valtn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredCollateral2Choice }
     *     
     */
    public SecuredCollateral2Choice getValtn() {
        return valtn;
    }

    /**
     * Sets the value of the valtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredCollateral2Choice }
     *     
     */
    public void setValtn(SecuredCollateral2Choice value) {
        this.valtn = value;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcut(BigDecimal value) {
        this.hrcut = value;
    }

    /**
     * Gets the value of the spclCollInd property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCollateral2Code }
     *     
     */
    public SpecialCollateral2Code getSpclCollInd() {
        return spclCollInd;
    }

    /**
     * Sets the value of the spclCollInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCollateral2Code }
     *     
     */
    public void setSpclCollInd(SpecialCollateral2Code value) {
        this.spclCollInd = value;
    }

}
