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

package org.jpos.iso20022.caaa_023_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessRetry3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessRetry3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dely" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Max9NumericText"/>
 *         <element name="MaxNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Number" minOccurs="0"/>
 *         <element name="UnitOfTm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}TimeUnit1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessRetry3", propOrder = {
    "dely",
    "maxNb",
    "unitOfTm"
})
public class ProcessRetry3 {

    @XmlElement(name = "Dely", required = true)
    protected String dely;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;
    @XmlElement(name = "UnitOfTm")
    @XmlSchemaType(name = "string")
    protected TimeUnit1Code unitOfTm;

    /**
     * Gets the value of the dely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDely() {
        return dely;
    }

    /**
     * Sets the value of the dely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDely(String value) {
        this.dely = value;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxNb(BigDecimal value) {
        this.maxNb = value;
    }

    /**
     * Gets the value of the unitOfTm property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit1Code }
     *     
     */
    public TimeUnit1Code getUnitOfTm() {
        return unitOfTm;
    }

    /**
     * Sets the value of the unitOfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit1Code }
     *     
     */
    public void setUnitOfTm(TimeUnit1Code value) {
        this.unitOfTm = value;
    }

}
