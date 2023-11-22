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

package org.jpos.iso20022.auth_045_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticsTransparency2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatisticsTransparency2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlNbOfTxsExctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}Number"/>
 *         <element name="TtlVolOfTxsExctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}DecimalNumber"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsTransparency2", propOrder = {
    "ttlNbOfTxsExctd",
    "ttlVolOfTxsExctd"
})
public class StatisticsTransparency2 {

    @XmlElement(name = "TtlNbOfTxsExctd", required = true)
    protected BigDecimal ttlNbOfTxsExctd;
    @XmlElement(name = "TtlVolOfTxsExctd", required = true)
    protected BigDecimal ttlVolOfTxsExctd;

    /**
     * Gets the value of the ttlNbOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxsExctd() {
        return ttlNbOfTxsExctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTxsExctd(BigDecimal value) {
        this.ttlNbOfTxsExctd = value;
    }

    /**
     * Gets the value of the ttlVolOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlVolOfTxsExctd() {
        return ttlVolOfTxsExctd;
    }

    /**
     * Sets the value of the ttlVolOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlVolOfTxsExctd(BigDecimal value) {
        this.ttlVolOfTxsExctd = value;
    }

}
