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

package org.jpos.iso20022.auth_024_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAmendment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentAmendment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CrrctnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}Number"/>
 *         <element name="OrgnlDocId" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAmendment1", propOrder = {
    "crrctnId",
    "orgnlDocId"
})
public class DocumentAmendment1 {

    @XmlElement(name = "CrrctnId", required = true)
    protected BigDecimal crrctnId;
    @XmlElement(name = "OrgnlDocId")
    protected String orgnlDocId;

    /**
     * Gets the value of the crrctnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrrctnId() {
        return crrctnId;
    }

    /**
     * Sets the value of the crrctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrrctnId(BigDecimal value) {
        this.crrctnId = value;
    }

    /**
     * Gets the value of the orgnlDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlDocId() {
        return orgnlDocId;
    }

    /**
     * Sets the value of the orgnlDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlDocId(String value) {
        this.orgnlDocId = value;
    }

}
