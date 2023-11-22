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

package org.jpos.iso20022.colr_014_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariableInterest1Rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VariableInterest1Rate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}Max35Text"/>
 *         <element name="BsisPtSprd" type="{urn:iso:std:iso:20022:tech:xsd:colr.014.001.05}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableInterest1Rate", propOrder = {
    "indx",
    "bsisPtSprd"
})
public class VariableInterest1Rate {

    @XmlElement(name = "Indx", required = true)
    protected String indx;
    @XmlElement(name = "BsisPtSprd")
    protected BigDecimal bsisPtSprd;

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndx(String value) {
        this.indx = value;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
    }

}
