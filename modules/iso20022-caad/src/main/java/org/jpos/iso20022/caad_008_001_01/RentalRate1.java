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

package org.jpos.iso20022.caad_008_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RentalRate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RentalRate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PeriodUnit3Code" minOccurs="0"/>
 *         <element name="OthrPrd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrdCnt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalRate1", propOrder = {
    "prd",
    "othrPrd",
    "rate",
    "prdCnt"
})
public class RentalRate1 {

    @XmlElement(name = "Prd")
    @XmlSchemaType(name = "string")
    protected PeriodUnit3Code prd;
    @XmlElement(name = "OthrPrd")
    protected String othrPrd;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "PrdCnt")
    protected String prdCnt;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodUnit3Code }
     *     
     */
    public PeriodUnit3Code getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodUnit3Code }
     *     
     */
    public void setPrd(PeriodUnit3Code value) {
        this.prd = value;
    }

    /**
     * Gets the value of the othrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPrd() {
        return othrPrd;
    }

    /**
     * Sets the value of the othrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPrd(String value) {
        this.othrPrd = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the prdCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdCnt() {
        return prdCnt;
    }

    /**
     * Sets the value of the prdCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdCnt(String value) {
        this.prdCnt = value;
    }

}
