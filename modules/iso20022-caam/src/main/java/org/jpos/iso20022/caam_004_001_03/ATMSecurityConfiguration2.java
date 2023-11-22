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

package org.jpos.iso20022.caam_004_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityConfiguration2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityConfiguration2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxSmmtrcKey" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Number" minOccurs="0"/>
 *         <element name="MaxAsmmtrcKey" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Number" minOccurs="0"/>
 *         <element name="MaxRSAKeyLngth" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Number" minOccurs="0"/>
 *         <element name="MaxRootKeyLngth" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration2", propOrder = {
    "maxSmmtrcKey",
    "maxAsmmtrcKey",
    "maxRSAKeyLngth",
    "maxRootKeyLngth"
})
public class ATMSecurityConfiguration2 {

    @XmlElement(name = "MaxSmmtrcKey")
    protected BigDecimal maxSmmtrcKey;
    @XmlElement(name = "MaxAsmmtrcKey")
    protected BigDecimal maxAsmmtrcKey;
    @XmlElement(name = "MaxRSAKeyLngth")
    protected BigDecimal maxRSAKeyLngth;
    @XmlElement(name = "MaxRootKeyLngth")
    protected BigDecimal maxRootKeyLngth;

    /**
     * Gets the value of the maxSmmtrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSmmtrcKey() {
        return maxSmmtrcKey;
    }

    /**
     * Sets the value of the maxSmmtrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSmmtrcKey(BigDecimal value) {
        this.maxSmmtrcKey = value;
    }

    /**
     * Gets the value of the maxAsmmtrcKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAsmmtrcKey() {
        return maxAsmmtrcKey;
    }

    /**
     * Sets the value of the maxAsmmtrcKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAsmmtrcKey(BigDecimal value) {
        this.maxAsmmtrcKey = value;
    }

    /**
     * Gets the value of the maxRSAKeyLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRSAKeyLngth() {
        return maxRSAKeyLngth;
    }

    /**
     * Sets the value of the maxRSAKeyLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxRSAKeyLngth(BigDecimal value) {
        this.maxRSAKeyLngth = value;
    }

    /**
     * Gets the value of the maxRootKeyLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRootKeyLngth() {
        return maxRootKeyLngth;
    }

    /**
     * Sets the value of the maxRootKeyLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxRootKeyLngth(BigDecimal value) {
        this.maxRootKeyLngth = value;
    }

}
