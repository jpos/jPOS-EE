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

package org.jpos.iso20022.seev_027_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingInstructionStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingInstructionStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PrcdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}CorporateActionStandingInstructionProcessingStatus1"/>
 *         <element name="RjctdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}CorporateActionStandingInstructionRejectionStatus1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingInstructionStatus1Choice", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class StandingInstructionStatus1Choice {

    @XmlElement(name = "PrcdSts")
    protected CorporateActionStandingInstructionProcessingStatus1 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected CorporateActionStandingInstructionRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstructionProcessingStatus1 }
     *     
     */
    public CorporateActionStandingInstructionProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstructionProcessingStatus1 }
     *     
     */
    public void setPrcdSts(CorporateActionStandingInstructionProcessingStatus1 value) {
        this.prcdSts = value;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstructionRejectionStatus1 }
     *     
     */
    public CorporateActionStandingInstructionRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstructionRejectionStatus1 }
     *     
     */
    public void setRjctdSts(CorporateActionStandingInstructionRejectionStatus1 value) {
        this.rjctdSts = value;
    }

}
