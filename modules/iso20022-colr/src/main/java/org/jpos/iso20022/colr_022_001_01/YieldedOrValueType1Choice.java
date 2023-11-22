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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YieldedOrValueType1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="YieldedOrValueType1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Yldd" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}YesNoIndicator"/>
 *         <element name="ValTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PriceValueType1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldedOrValueType1Choice", propOrder = {
    "yldd",
    "valTp"
})
public class YieldedOrValueType1Choice {

    @XmlElement(name = "Yldd")
    protected Boolean yldd;
    @XmlElement(name = "ValTp")
    @XmlSchemaType(name = "string")
    protected PriceValueType1Code valTp;

    /**
     * Gets the value of the yldd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYldd() {
        return yldd;
    }

    /**
     * Sets the value of the yldd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYldd(Boolean value) {
        this.yldd = value;
    }

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType1Code }
     *     
     */
    public PriceValueType1Code getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType1Code }
     *     
     */
    public void setValTp(PriceValueType1Code value) {
        this.valTp = value;
    }

}
