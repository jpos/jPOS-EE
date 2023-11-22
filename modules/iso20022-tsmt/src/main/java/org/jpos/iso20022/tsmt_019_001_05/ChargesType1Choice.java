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

package org.jpos.iso20022.tsmt_019_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesType1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ChargesType1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}ChargeType8Code"/>
 *         <element name="OthrChrgsTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesType1Choice", propOrder = {
    "tp",
    "othrChrgsTp"
})
public class ChargesType1Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ChargeType8Code tp;
    @XmlElement(name = "OthrChrgsTp")
    protected String othrChrgsTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType8Code }
     *     
     */
    public ChargeType8Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType8Code }
     *     
     */
    public void setTp(ChargeType8Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrChrgsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrChrgsTp() {
        return othrChrgsTp;
    }

    /**
     * Sets the value of the othrChrgsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrChrgsTp(String value) {
        this.othrChrgsTp = value;
    }

}
