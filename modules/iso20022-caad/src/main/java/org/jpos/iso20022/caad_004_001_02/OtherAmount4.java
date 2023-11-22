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
 * <p>Java class for OtherAmount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherAmount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrCnt" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Number"/>
 *         <element name="ClrAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Amount17"/>
 *         <element name="IntrchngFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Amount17" minOccurs="0"/>
 *         <element name="AgtFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.004.001.02}Amount17" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmount4", propOrder = {
    "clrCnt",
    "clrAmt",
    "intrchngFee",
    "agtFee"
})
public class OtherAmount4 {

    @XmlElement(name = "ClrCnt", required = true)
    protected BigDecimal clrCnt;
    @XmlElement(name = "ClrAmt", required = true)
    protected Amount17 clrAmt;
    @XmlElement(name = "IntrchngFee")
    protected Amount17 intrchngFee;
    @XmlElement(name = "AgtFee")
    protected Amount17 agtFee;

    /**
     * Gets the value of the clrCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClrCnt() {
        return clrCnt;
    }

    /**
     * Sets the value of the clrCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClrCnt(BigDecimal value) {
        this.clrCnt = value;
    }

    /**
     * Gets the value of the clrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getClrAmt() {
        return clrAmt;
    }

    /**
     * Sets the value of the clrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setClrAmt(Amount17 value) {
        this.clrAmt = value;
    }

    /**
     * Gets the value of the intrchngFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getIntrchngFee() {
        return intrchngFee;
    }

    /**
     * Sets the value of the intrchngFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setIntrchngFee(Amount17 value) {
        this.intrchngFee = value;
    }

    /**
     * Gets the value of the agtFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getAgtFee() {
        return agtFee;
    }

    /**
     * Sets the value of the agtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setAgtFee(Amount17 value) {
        this.agtFee = value;
    }

}
