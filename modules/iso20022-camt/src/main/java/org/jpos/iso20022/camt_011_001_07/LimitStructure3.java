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

package org.jpos.iso20022.camt_011_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitStructure3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitStructure3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.011.001.07}LimitIdentification2Choice"/>
 *         <element name="NewLmtValSet" type="{urn:iso:std:iso:20022:tech:xsd:camt.011.001.07}Limit8"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitStructure3", propOrder = {
    "lmtId",
    "newLmtValSet"
})
public class LimitStructure3 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification2Choice lmtId;
    @XmlElement(name = "NewLmtValSet", required = true)
    protected Limit8 newLmtValSet;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification2Choice }
     *     
     */
    public LimitIdentification2Choice getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification2Choice }
     *     
     */
    public void setLmtId(LimitIdentification2Choice value) {
        this.lmtId = value;
    }

    /**
     * Gets the value of the newLmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link Limit8 }
     *     
     */
    public Limit8 getNewLmtValSet() {
        return newLmtValSet;
    }

    /**
     * Sets the value of the newLmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limit8 }
     *     
     */
    public void setNewLmtValSet(Limit8 value) {
        this.newLmtValSet = value;
    }

}
