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

package org.jpos.iso20022.tsrv_003_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountOrPercentage1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountOrPercentage1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DfndAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}UndertakingAmount4"/>
 *         <element name="PctgAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Percentage1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountOrPercentage1Choice", propOrder = {
    "dfndAmt",
    "pctgAmt"
})
public class AmountOrPercentage1Choice {

    @XmlElement(name = "DfndAmt")
    protected UndertakingAmount4 dfndAmt;
    @XmlElement(name = "PctgAmt")
    protected Percentage1 pctgAmt;

    /**
     * Gets the value of the dfndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount4 }
     *     
     */
    public UndertakingAmount4 getDfndAmt() {
        return dfndAmt;
    }

    /**
     * Sets the value of the dfndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount4 }
     *     
     */
    public void setDfndAmt(UndertakingAmount4 value) {
        this.dfndAmt = value;
    }

    /**
     * Gets the value of the pctgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Percentage1 }
     *     
     */
    public Percentage1 getPctgAmt() {
        return pctgAmt;
    }

    /**
     * Sets the value of the pctgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Percentage1 }
     *     
     */
    public void setPctgAmt(Percentage1 value) {
        this.pctgAmt = value;
    }

}
