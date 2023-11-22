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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityPolypropylene4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityPolypropylene4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Plstc" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}PolypropyleneCommodityPlastic2"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}PolypropyleneCommodityOther2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityPolypropylene4Choice", propOrder = {
    "plstc",
    "othr"
})
public class AssetClassCommodityPolypropylene4Choice {

    @XmlElement(name = "Plstc")
    protected PolypropyleneCommodityPlastic2 plstc;
    @XmlElement(name = "Othr")
    protected PolypropyleneCommodityOther2 othr;

    /**
     * Gets the value of the plstc property.
     * 
     * @return
     *     possible object is
     *     {@link PolypropyleneCommodityPlastic2 }
     *     
     */
    public PolypropyleneCommodityPlastic2 getPlstc() {
        return plstc;
    }

    /**
     * Sets the value of the plstc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypropyleneCommodityPlastic2 }
     *     
     */
    public void setPlstc(PolypropyleneCommodityPlastic2 value) {
        this.plstc = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link PolypropyleneCommodityOther2 }
     *     
     */
    public PolypropyleneCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypropyleneCommodityOther2 }
     *     
     */
    public void setOthr(PolypropyleneCommodityOther2 value) {
        this.othr = value;
    }

}
