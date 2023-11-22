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

package org.jpos.iso20022.camt_010_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitReport7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitReport7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}LimitIdentification5"/>
 *         <element name="LmtOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}LimitOrError4Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitReport7", propOrder = {
    "lmtId",
    "lmtOrErr"
})
public class LimitReport7 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification5 lmtId;
    @XmlElement(name = "LmtOrErr", required = true)
    protected LimitOrError4Choice lmtOrErr;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification5 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification5 }
     *     
     */
    public void setLmtId(LimitIdentification5 value) {
        this.lmtId = value;
    }

    /**
     * Gets the value of the lmtOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link LimitOrError4Choice }
     *     
     */
    public LimitOrError4Choice getLmtOrErr() {
        return lmtOrErr;
    }

    /**
     * Sets the value of the lmtOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitOrError4Choice }
     *     
     */
    public void setLmtOrErr(LimitOrError4Choice value) {
        this.lmtOrErr = value;
    }

}
