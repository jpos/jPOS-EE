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
 * <p>Java class for CommodityDerivative5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommodityDerivative5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sz" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Max25Text"/>
 *         <element name="AvrgTmChrtr" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}Max25Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDerivative5", propOrder = {
    "sz",
    "avrgTmChrtr"
})
public class CommodityDerivative5 {

    @XmlElement(name = "Sz", required = true)
    protected String sz;
    @XmlElement(name = "AvrgTmChrtr", required = true)
    protected String avrgTmChrtr;

    /**
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSz() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSz(String value) {
        this.sz = value;
    }

    /**
     * Gets the value of the avrgTmChrtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvrgTmChrtr() {
        return avrgTmChrtr;
    }

    /**
     * Sets the value of the avrgTmChrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvrgTmChrtr(String value) {
        this.avrgTmChrtr = value;
    }

}
