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

package org.jpos.iso20022.acmt_001_001_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockedHoldingDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BlockedHoldingDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BlckdHldg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Holding1Code"/>
 *         <element name="PrtlHldgUnits" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DecimalNumber" minOccurs="0"/>
 *         <element name="HldgCertNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockedHoldingDetails2", propOrder = {
    "blckdHldg",
    "prtlHldgUnits",
    "hldgCertNb"
})
public class BlockedHoldingDetails2 {

    @XmlElement(name = "BlckdHldg", required = true)
    @XmlSchemaType(name = "string")
    protected Holding1Code blckdHldg;
    @XmlElement(name = "PrtlHldgUnits")
    protected BigDecimal prtlHldgUnits;
    @XmlElement(name = "HldgCertNb")
    protected String hldgCertNb;

    /**
     * Gets the value of the blckdHldg property.
     * 
     * @return
     *     possible object is
     *     {@link Holding1Code }
     *     
     */
    public Holding1Code getBlckdHldg() {
        return blckdHldg;
    }

    /**
     * Sets the value of the blckdHldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Holding1Code }
     *     
     */
    public void setBlckdHldg(Holding1Code value) {
        this.blckdHldg = value;
    }

    /**
     * Gets the value of the prtlHldgUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlHldgUnits() {
        return prtlHldgUnits;
    }

    /**
     * Sets the value of the prtlHldgUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrtlHldgUnits(BigDecimal value) {
        this.prtlHldgUnits = value;
    }

    /**
     * Gets the value of the hldgCertNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgCertNb() {
        return hldgCertNb;
    }

    /**
     * Sets the value of the hldgCertNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldgCertNb(String value) {
        this.hldgCertNb = value;
    }

}
