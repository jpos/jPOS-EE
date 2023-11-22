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

package org.jpos.iso20022.casp_016_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevicePoweroffCardReaderRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DevicePoweroffCardReaderRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PwrOffMaxWtgTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Number" minOccurs="0"/>
 *         <element name="DispOutpt" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}ActionMessage10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePoweroffCardReaderRequest5", propOrder = {
    "pwrOffMaxWtgTm",
    "dispOutpt"
})
public class DevicePoweroffCardReaderRequest5 {

    @XmlElement(name = "PwrOffMaxWtgTm")
    protected BigDecimal pwrOffMaxWtgTm;
    @XmlElement(name = "DispOutpt")
    protected ActionMessage10 dispOutpt;

    /**
     * Gets the value of the pwrOffMaxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPwrOffMaxWtgTm() {
        return pwrOffMaxWtgTm;
    }

    /**
     * Sets the value of the pwrOffMaxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPwrOffMaxWtgTm(BigDecimal value) {
        this.pwrOffMaxWtgTm = value;
    }

    /**
     * Gets the value of the dispOutpt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage10 }
     *     
     */
    public ActionMessage10 getDispOutpt() {
        return dispOutpt;
    }

    /**
     * Sets the value of the dispOutpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage10 }
     *     
     */
    public void setDispOutpt(ActionMessage10 value) {
        this.dispOutpt = value;
    }

}
