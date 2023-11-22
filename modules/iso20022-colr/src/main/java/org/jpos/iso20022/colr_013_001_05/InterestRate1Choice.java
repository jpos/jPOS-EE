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

package org.jpos.iso20022.colr_013_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRate1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestRate1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FxdIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}PercentageRate"/>
 *         <element name="VarblIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}VariableInterest1Rate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRate1Choice", propOrder = {
    "fxdIntrstRate",
    "varblIntrstRate"
})
public class InterestRate1Choice {

    @XmlElement(name = "FxdIntrstRate")
    protected BigDecimal fxdIntrstRate;
    @XmlElement(name = "VarblIntrstRate")
    protected VariableInterest1Rate varblIntrstRate;

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFxdIntrstRate(BigDecimal value) {
        this.fxdIntrstRate = value;
    }

    /**
     * Gets the value of the varblIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link VariableInterest1Rate }
     *     
     */
    public VariableInterest1Rate getVarblIntrstRate() {
        return varblIntrstRate;
    }

    /**
     * Sets the value of the varblIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableInterest1Rate }
     *     
     */
    public void setVarblIntrstRate(VariableInterest1Rate value) {
        this.varblIntrstRate = value;
    }

}
