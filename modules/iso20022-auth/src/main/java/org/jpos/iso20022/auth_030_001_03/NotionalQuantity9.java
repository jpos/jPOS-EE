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

package org.jpos.iso20022.auth_030_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotionalQuantity9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NotionalQuantity9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}LongFraction19DecimalNumber" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}UnitOfMeasure8Choice" minOccurs="0"/>
 *         <element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}QuantityOrTerm1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalQuantity9", propOrder = {
    "ttlQty",
    "unitOfMeasr",
    "dtls"
})
public class NotionalQuantity9 {

    @XmlElement(name = "TtlQty")
    protected BigDecimal ttlQty;
    @XmlElement(name = "UnitOfMeasr")
    protected UnitOfMeasure8Choice unitOfMeasr;
    @XmlElement(name = "Dtls")
    protected QuantityOrTerm1Choice dtls;

    /**
     * Gets the value of the ttlQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlQty() {
        return ttlQty;
    }

    /**
     * Sets the value of the ttlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlQty(BigDecimal value) {
        this.ttlQty = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public UnitOfMeasure8Choice getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure8Choice value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrTerm1Choice }
     *     
     */
    public QuantityOrTerm1Choice getDtls() {
        return dtls;
    }

    /**
     * Sets the value of the dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrTerm1Choice }
     *     
     */
    public void setDtls(QuantityOrTerm1Choice value) {
        this.dtls = value;
    }

}
