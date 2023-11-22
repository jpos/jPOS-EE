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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultProcessingOrStandingInstruction1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DefaultProcessingOrStandingInstruction1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DfltOptnInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator"/>
 *         <element name="StgInstrInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}YesNoIndicator"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultProcessingOrStandingInstruction1Choice", propOrder = {
    "dfltOptnInd",
    "stgInstrInd"
})
public class DefaultProcessingOrStandingInstruction1Choice {

    @XmlElement(name = "DfltOptnInd")
    protected Boolean dfltOptnInd;
    @XmlElement(name = "StgInstrInd")
    protected Boolean stgInstrInd;

    /**
     * Gets the value of the dfltOptnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfltOptnInd() {
        return dfltOptnInd;
    }

    /**
     * Sets the value of the dfltOptnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDfltOptnInd(Boolean value) {
        this.dfltOptnInd = value;
    }

    /**
     * Gets the value of the stgInstrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgInstrInd() {
        return stgInstrInd;
    }

    /**
     * Sets the value of the stgInstrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStgInstrInd(Boolean value) {
        this.stgInstrInd = value;
    }

}
