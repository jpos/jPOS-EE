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

package org.jpos.iso20022.acmt_003_001_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketMakerProfile2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarketMakerProfile2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctPrd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}DateTimePeriod2" minOccurs="0"/>
 *         <element name="Cmplc" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="MaxSprd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PercentageRate" minOccurs="0"/>
 *         <element name="Dscnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketMakerProfile2", propOrder = {
    "ctrctPrd",
    "cmplc",
    "maxSprd",
    "dscnt"
})
public class MarketMakerProfile2 {

    @XmlElement(name = "CtrctPrd")
    protected DateTimePeriod2 ctrctPrd;
    @XmlElement(name = "Cmplc")
    protected Boolean cmplc;
    @XmlElement(name = "MaxSprd")
    protected BigDecimal maxSprd;
    @XmlElement(name = "Dscnt")
    protected BigDecimal dscnt;

    /**
     * Gets the value of the ctrctPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public DateTimePeriod2 getCtrctPrd() {
        return ctrctPrd;
    }

    /**
     * Sets the value of the ctrctPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public void setCtrctPrd(DateTimePeriod2 value) {
        this.ctrctPrd = value;
    }

    /**
     * Gets the value of the cmplc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmplc() {
        return cmplc;
    }

    /**
     * Sets the value of the cmplc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCmplc(Boolean value) {
        this.cmplc = value;
    }

    /**
     * Gets the value of the maxSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSprd() {
        return maxSprd;
    }

    /**
     * Sets the value of the maxSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSprd(BigDecimal value) {
        this.maxSprd = value;
    }

    /**
     * Gets the value of the dscnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscnt() {
        return dscnt;
    }

    /**
     * Sets the value of the dscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDscnt(BigDecimal value) {
        this.dscnt = value;
    }

}
