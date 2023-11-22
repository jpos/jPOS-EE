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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionPrice7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionPrice7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}AmountAndDirection61"/>
 *         <element name="DgtlTknQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}DigitalTokenAmount2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice7", propOrder = {
    "mntryVal",
    "dgtlTknQty"
})
public class SecuritiesTransactionPrice7 {

    @XmlElement(name = "MntryVal", required = true)
    protected AmountAndDirection61 mntryVal;
    @XmlElement(name = "DgtlTknQty", required = true)
    protected DigitalTokenAmount2 dgtlTknQty;

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public AmountAndDirection61 getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public void setMntryVal(AmountAndDirection61 value) {
        this.mntryVal = value;
    }

    /**
     * Gets the value of the dgtlTknQty property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalTokenAmount2 }
     *     
     */
    public DigitalTokenAmount2 getDgtlTknQty() {
        return dgtlTknQty;
    }

    /**
     * Sets the value of the dgtlTknQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalTokenAmount2 }
     *     
     */
    public void setDgtlTknQty(DigitalTokenAmount2 value) {
        this.dgtlTknQty = value;
    }

}
