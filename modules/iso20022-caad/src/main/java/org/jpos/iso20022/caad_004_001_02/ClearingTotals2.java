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

package org.jpos.iso20022.caad_004_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingTotals2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingTotals2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cnt" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Number"/>
 *         <element name="AcmltdAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Amount17"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingTotals2", propOrder = {
    "cnt",
    "acmltdAmt"
})
public class ClearingTotals2 {

    @XmlElement(name = "Cnt", required = true)
    protected BigDecimal cnt;
    @XmlElement(name = "AcmltdAmt", required = true)
    protected Amount17 acmltdAmt;

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCnt(BigDecimal value) {
        this.cnt = value;
    }

    /**
     * Gets the value of the acmltdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getAcmltdAmt() {
        return acmltdAmt;
    }

    /**
     * Sets the value of the acmltdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setAcmltdAmt(Amount17 value) {
        this.acmltdAmt = value;
    }

}
