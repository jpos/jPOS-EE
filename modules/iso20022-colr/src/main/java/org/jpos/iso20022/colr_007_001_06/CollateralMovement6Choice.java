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

package org.jpos.iso20022.colr_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralMovement6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralMovement6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CollMvmntDrctn" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}CollateralMovement13"/>
 *         <element name="Rtr" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}Collateral54"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement6Choice", propOrder = {
    "collMvmntDrctn",
    "rtr"
})
public class CollateralMovement6Choice {

    @XmlElement(name = "CollMvmntDrctn")
    protected CollateralMovement13 collMvmntDrctn;
    @XmlElement(name = "Rtr")
    protected Collateral54 rtr;

    /**
     * Gets the value of the collMvmntDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement13 }
     *     
     */
    public CollateralMovement13 getCollMvmntDrctn() {
        return collMvmntDrctn;
    }

    /**
     * Sets the value of the collMvmntDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement13 }
     *     
     */
    public void setCollMvmntDrctn(CollateralMovement13 value) {
        this.collMvmntDrctn = value;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral54 }
     *     
     */
    public Collateral54 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral54 }
     *     
     */
    public void setRtr(Collateral54 value) {
        this.rtr = value;
    }

}
