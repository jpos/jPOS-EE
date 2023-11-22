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

package org.jpos.iso20022.camt_012_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitStructure2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitStructure2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CurLmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.012.001.07}LimitIdentification5"/>
 *         <element name="AllCurLmts" type="{urn:iso:std:iso:20022:tech:xsd:camt.012.001.07}LimitIdentification6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitStructure2Choice", propOrder = {
    "curLmtId",
    "allCurLmts"
})
public class LimitStructure2Choice {

    @XmlElement(name = "CurLmtId")
    protected LimitIdentification5 curLmtId;
    @XmlElement(name = "AllCurLmts")
    protected LimitIdentification6 allCurLmts;

    /**
     * Gets the value of the curLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification5 }
     *     
     */
    public LimitIdentification5 getCurLmtId() {
        return curLmtId;
    }

    /**
     * Sets the value of the curLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification5 }
     *     
     */
    public void setCurLmtId(LimitIdentification5 value) {
        this.curLmtId = value;
    }

    /**
     * Gets the value of the allCurLmts property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification6 }
     *     
     */
    public LimitIdentification6 getAllCurLmts() {
        return allCurLmts;
    }

    /**
     * Sets the value of the allCurLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification6 }
     *     
     */
    public void setAllCurLmts(LimitIdentification6 value) {
        this.allCurLmts = value;
    }

}
