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

package org.jpos.iso20022.casr_001_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementCategoryTotal2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementCategoryTotal2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cnt" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}Number" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}Amount17"/>
 *         <element name="IntrchngFee" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}Amount17" minOccurs="0"/>
 *         <element name="PrcgFee" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}Amount17" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementCategoryTotal2", propOrder = {
    "cnt",
    "amt",
    "intrchngFee",
    "prcgFee"
})
public class SettlementCategoryTotal2 {

    @XmlElement(name = "Cnt")
    protected BigDecimal cnt;
    @XmlElement(name = "Amt", required = true)
    protected Amount17 amt;
    @XmlElement(name = "IntrchngFee")
    protected Amount17 intrchngFee;
    @XmlElement(name = "PrcgFee")
    protected Amount17 prcgFee;

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
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setAmt(Amount17 value) {
        this.amt = value;
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
     * Gets the value of the prcgFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount17 }
     *     
     */
    public Amount17 getPrcgFee() {
        return prcgFee;
    }

    /**
     * Sets the value of the prcgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount17 }
     *     
     */
    public void setPrcgFee(Amount17 value) {
        this.prcgFee = value;
    }

}
