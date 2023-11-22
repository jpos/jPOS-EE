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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Direction4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Direction4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Drctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}Direction2"/>
 *         <element name="CtrPtySd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}OptionParty1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direction4Choice", propOrder = {
    "drctn",
    "ctrPtySd"
})
public class Direction4Choice {

    @XmlElement(name = "Drctn")
    protected Direction2 drctn;
    @XmlElement(name = "CtrPtySd")
    @XmlSchemaType(name = "string")
    protected OptionParty1Code ctrPtySd;

    /**
     * Gets the value of the drctn property.
     * 
     * @return
     *     possible object is
     *     {@link Direction2 }
     *     
     */
    public Direction2 getDrctn() {
        return drctn;
    }

    /**
     * Sets the value of the drctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction2 }
     *     
     */
    public void setDrctn(Direction2 value) {
        this.drctn = value;
    }

    /**
     * Gets the value of the ctrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getCtrPtySd() {
        return ctrPtySd;
    }

    /**
     * Sets the value of the ctrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public void setCtrPtySd(OptionParty1Code value) {
        this.ctrPtySd = value;
    }

}
