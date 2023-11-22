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

package org.jpos.iso20022.auth_068_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndOfDayRequirement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EndOfDayRequirement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="VartnMrgnRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}AmountAndDirection102" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndOfDayRequirement1", propOrder = {
    "initlMrgnRqrmnt",
    "vartnMrgnRqrmnt"
})
public class EndOfDayRequirement1 {

    @XmlElement(name = "InitlMrgnRqrmnt")
    protected ActiveCurrencyAndAmount initlMrgnRqrmnt;
    @XmlElement(name = "VartnMrgnRqrmnt")
    protected AmountAndDirection102 vartnMrgnRqrmnt;

    /**
     * Gets the value of the initlMrgnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInitlMrgnRqrmnt() {
        return initlMrgnRqrmnt;
    }

    /**
     * Sets the value of the initlMrgnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setInitlMrgnRqrmnt(ActiveCurrencyAndAmount value) {
        this.initlMrgnRqrmnt = value;
    }

    /**
     * Gets the value of the vartnMrgnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getVartnMrgnRqrmnt() {
        return vartnMrgnRqrmnt;
    }

    /**
     * Sets the value of the vartnMrgnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setVartnMrgnRqrmnt(AmountAndDirection102 value) {
        this.vartnMrgnRqrmnt = value;
    }

}
