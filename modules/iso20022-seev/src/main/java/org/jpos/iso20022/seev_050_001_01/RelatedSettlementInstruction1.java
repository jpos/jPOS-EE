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

package org.jpos.iso20022.seev_050_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedSettlementInstruction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RelatedSettlementInstruction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RltdSttlmInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}Max35Text"/>
 *         <element name="RltdSttlmQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.050.001.01}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSettlementInstruction1", propOrder = {
    "rltdSttlmInstrId",
    "rltdSttlmQty"
})
public class RelatedSettlementInstruction1 {

    @XmlElement(name = "RltdSttlmInstrId", required = true)
    protected String rltdSttlmInstrId;
    @XmlElement(name = "RltdSttlmQty")
    protected FinancialInstrumentQuantity18Choice rltdSttlmQty;

    /**
     * Gets the value of the rltdSttlmInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdSttlmInstrId() {
        return rltdSttlmInstrId;
    }

    /**
     * Sets the value of the rltdSttlmInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdSttlmInstrId(String value) {
        this.rltdSttlmInstrId = value;
    }

    /**
     * Gets the value of the rltdSttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getRltdSttlmQty() {
        return rltdSttlmQty;
    }

    /**
     * Sets the value of the rltdSttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setRltdSttlmQty(FinancialInstrumentQuantity18Choice value) {
        this.rltdSttlmQty = value;
    }

}
