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

package org.jpos.iso20022.semt_003_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalValueInPageAndStatement4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalValueInPageAndStatement4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlHldgsValOfPg" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}AmountAndDirection14" minOccurs="0"/>
 *         <element name="TtlHldgsValOfStmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}AmountAndDirection14"/>
 *         <element name="TtlBookValOfStmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.002.11}AmountAndDirection14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalValueInPageAndStatement4", propOrder = {
    "ttlHldgsValOfPg",
    "ttlHldgsValOfStmt",
    "ttlBookValOfStmt"
})
public class TotalValueInPageAndStatement4 {

    @XmlElement(name = "TtlHldgsValOfPg")
    protected AmountAndDirection14 ttlHldgsValOfPg;
    @XmlElement(name = "TtlHldgsValOfStmt", required = true)
    protected AmountAndDirection14 ttlHldgsValOfStmt;
    @XmlElement(name = "TtlBookValOfStmt")
    protected AmountAndDirection14 ttlBookValOfStmt;

    /**
     * Gets the value of the ttlHldgsValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getTtlHldgsValOfPg() {
        return ttlHldgsValOfPg;
    }

    /**
     * Sets the value of the ttlHldgsValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setTtlHldgsValOfPg(AmountAndDirection14 value) {
        this.ttlHldgsValOfPg = value;
    }

    /**
     * Gets the value of the ttlHldgsValOfStmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getTtlHldgsValOfStmt() {
        return ttlHldgsValOfStmt;
    }

    /**
     * Sets the value of the ttlHldgsValOfStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setTtlHldgsValOfStmt(AmountAndDirection14 value) {
        this.ttlHldgsValOfStmt = value;
    }

    /**
     * Gets the value of the ttlBookValOfStmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getTtlBookValOfStmt() {
        return ttlBookValOfStmt;
    }

    /**
     * Sets the value of the ttlBookValOfStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setTtlBookValOfStmt(AmountAndDirection14 value) {
        this.ttlBookValOfStmt = value;
    }

}
