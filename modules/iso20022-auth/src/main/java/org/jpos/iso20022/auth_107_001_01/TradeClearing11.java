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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeClearing11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeClearing11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrOblgtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ClearingObligationType1Code" minOccurs="0"/>
 *         <element name="ClrSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Cleared23Choice" minOccurs="0"/>
 *         <element name="IntraGrp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeClearing11", propOrder = {
    "clrOblgtn",
    "clrSts",
    "intraGrp"
})
public class TradeClearing11 {

    @XmlElement(name = "ClrOblgtn")
    @XmlSchemaType(name = "string")
    protected ClearingObligationType1Code clrOblgtn;
    @XmlElement(name = "ClrSts")
    protected Cleared23Choice clrSts;
    @XmlElement(name = "IntraGrp")
    protected Boolean intraGrp;

    /**
     * Gets the value of the clrOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingObligationType1Code }
     *     
     */
    public ClearingObligationType1Code getClrOblgtn() {
        return clrOblgtn;
    }

    /**
     * Sets the value of the clrOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingObligationType1Code }
     *     
     */
    public void setClrOblgtn(ClearingObligationType1Code value) {
        this.clrOblgtn = value;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link Cleared23Choice }
     *     
     */
    public Cleared23Choice getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cleared23Choice }
     *     
     */
    public void setClrSts(Cleared23Choice value) {
        this.clrSts = value;
    }

    /**
     * Gets the value of the intraGrp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntraGrp() {
        return intraGrp;
    }

    /**
     * Sets the value of the intraGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntraGrp(Boolean value) {
        this.intraGrp = value;
    }

}
