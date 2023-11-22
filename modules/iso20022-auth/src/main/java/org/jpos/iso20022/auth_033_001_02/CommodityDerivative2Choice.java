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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityDerivative2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommodityDerivative2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Frght" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CommodityDerivative5"/>
 *         <element name="Nrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CommodityDerivative6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDerivative2Choice", propOrder = {
    "frght",
    "nrgy"
})
public class CommodityDerivative2Choice {

    @XmlElement(name = "Frght")
    protected CommodityDerivative5 frght;
    @XmlElement(name = "Nrgy")
    protected CommodityDerivative6 nrgy;

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDerivative5 }
     *     
     */
    public CommodityDerivative5 getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDerivative5 }
     *     
     */
    public void setFrght(CommodityDerivative5 value) {
        this.frght = value;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDerivative6 }
     *     
     */
    public CommodityDerivative6 getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDerivative6 }
     *     
     */
    public void setNrgy(CommodityDerivative6 value) {
        this.nrgy = value;
    }

}
