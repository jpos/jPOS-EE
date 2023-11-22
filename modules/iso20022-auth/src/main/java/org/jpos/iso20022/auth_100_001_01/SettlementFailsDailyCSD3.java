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

package org.jpos.iso20022.auth_100_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsDailyCSD3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsDailyCSD3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntraCSD" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyInstructionType1Choice"/>
 *         <element name="CrossCSD" type="{urn:iso:std:iso:20022:tech:xsd:auth.100.001.01}SettlementFailsDailyInstructionType1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyCSD3", propOrder = {
    "intraCSD",
    "crossCSD"
})
public class SettlementFailsDailyCSD3 {

    @XmlElement(name = "IntraCSD", required = true)
    protected SettlementFailsDailyInstructionType1Choice intraCSD;
    @XmlElement(name = "CrossCSD", required = true)
    protected SettlementFailsDailyInstructionType1Choice crossCSD;

    /**
     * Gets the value of the intraCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType1Choice getIntraCSD() {
        return intraCSD;
    }

    /**
     * Sets the value of the intraCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public void setIntraCSD(SettlementFailsDailyInstructionType1Choice value) {
        this.intraCSD = value;
    }

    /**
     * Gets the value of the crossCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType1Choice getCrossCSD() {
        return crossCSD;
    }

    /**
     * Sets the value of the crossCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public void setCrossCSD(SettlementFailsDailyInstructionType1Choice value) {
        this.crossCSD = value;
    }

}
