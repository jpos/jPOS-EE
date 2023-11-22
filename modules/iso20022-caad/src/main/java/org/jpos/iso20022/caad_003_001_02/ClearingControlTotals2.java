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

package org.jpos.iso20022.caad_003_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingControlTotals2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingControlTotals2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrCtrlCnt" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Number"/>
 *         <element name="ClrCtrlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}Amount17"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingControlTotals2", propOrder = {
    "clrCtrlCnt",
    "clrCtrlAmt"
})
public class ClearingControlTotals2 {

    @XmlElement(name = "ClrCtrlCnt", required = true)
    protected BigDecimal clrCtrlCnt;
    @XmlElement(name = "ClrCtrlAmt", required = true)
    protected Amount17 clrCtrlAmt;

    /**
     * Gets the value of the clrCtrlCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrCtrlCnt() {
        return clrCtrlCnt;
    }

    /**
     * Sets the value of the clrCtrlCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClrCtrlCnt(BigDecimal value) {
        this.clrCtrlCnt = value;
    }

    /**
     * Gets the value of the clrCtrlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getClrCtrlAmt() {
        return clrCtrlAmt;
    }

    /**
     * Sets the value of the clrCtrlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setClrCtrlAmt(Amount17 value) {
        this.clrCtrlAmt = value;
    }

}
