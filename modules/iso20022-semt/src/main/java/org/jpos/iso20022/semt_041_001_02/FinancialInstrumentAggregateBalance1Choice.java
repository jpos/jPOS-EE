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

package org.jpos.iso20022.semt_041_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAggregateBalance1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAggregateBalance1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="HldgsInd" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}YesNoIndicator"/>
 *         <element name="HldgBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}FinancialInstrumentAggregateBalance2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAggregateBalance1Choice", propOrder = {
    "hldgsInd",
    "hldgBal"
})
public class FinancialInstrumentAggregateBalance1Choice {

    @XmlElement(name = "HldgsInd")
    protected Boolean hldgsInd;
    @XmlElement(name = "HldgBal")
    protected FinancialInstrumentAggregateBalance2 hldgBal;

    /**
     * Gets the value of the hldgsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHldgsInd() {
        return hldgsInd;
    }

    /**
     * Sets the value of the hldgsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHldgsInd(Boolean value) {
        this.hldgsInd = value;
    }

    /**
     * Gets the value of the hldgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAggregateBalance2 }
     *     
     */
    public FinancialInstrumentAggregateBalance2 getHldgBal() {
        return hldgBal;
    }

    /**
     * Sets the value of the hldgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAggregateBalance2 }
     *     
     */
    public void setHldgBal(FinancialInstrumentAggregateBalance2 value) {
        this.hldgBal = value;
    }

}
