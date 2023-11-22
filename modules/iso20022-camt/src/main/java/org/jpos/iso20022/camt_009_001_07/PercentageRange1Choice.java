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

package org.jpos.iso20022.camt_009_001_07;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentageRange1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PercentageRange1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Fr" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}PercentageRangeBoundary1"/>
 *         <element name="To" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}PercentageRangeBoundary1"/>
 *         <element name="FrTo" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}FromToPercentageRange1"/>
 *         <element name="EQ" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}PercentageRate"/>
 *         <element name="NEQ" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}PercentageRate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRange1Choice", propOrder = {
    "fr",
    "to",
    "frTo",
    "eq",
    "neq"
})
public class PercentageRange1Choice {

    @XmlElement(name = "Fr")
    protected PercentageRangeBoundary1 fr;
    @XmlElement(name = "To")
    protected PercentageRangeBoundary1 to;
    @XmlElement(name = "FrTo")
    protected FromToPercentageRange1 frTo;
    @XmlElement(name = "EQ")
    protected BigDecimal eq;
    @XmlElement(name = "NEQ")
    protected BigDecimal neq;

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRangeBoundary1 getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public void setFr(PercentageRangeBoundary1 value) {
        this.fr = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public PercentageRangeBoundary1 getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageRangeBoundary1 }
     *     
     */
    public void setTo(PercentageRangeBoundary1 value) {
        this.to = value;
    }

    /**
     * Gets the value of the frTo property.
     * 
     * @return
     *     possible object is
     *     {@link FromToPercentageRange1 }
     *     
     */
    public FromToPercentageRange1 getFrTo() {
        return frTo;
    }

    /**
     * Sets the value of the frTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToPercentageRange1 }
     *     
     */
    public void setFrTo(FromToPercentageRange1 value) {
        this.frTo = value;
    }

    /**
     * Gets the value of the eq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEQ() {
        return eq;
    }

    /**
     * Sets the value of the eq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEQ(BigDecimal value) {
        this.eq = value;
    }

    /**
     * Gets the value of the neq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEQ() {
        return neq;
    }

    /**
     * Sets the value of the neq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNEQ(BigDecimal value) {
        this.neq = value;
    }

}
