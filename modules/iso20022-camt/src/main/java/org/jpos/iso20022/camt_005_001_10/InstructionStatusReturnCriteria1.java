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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionStatusReturnCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionStatusReturnCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtInstrStsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator"/>
 *         <element name="PmtInstrStsDtTmInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *         <element name="PmtInstrStsRsnInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}RequestedIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatusReturnCriteria1", propOrder = {
    "pmtInstrStsInd",
    "pmtInstrStsDtTmInd",
    "pmtInstrStsRsnInd"
})
public class InstructionStatusReturnCriteria1 {

    @XmlElement(name = "PmtInstrStsInd")
    protected boolean pmtInstrStsInd;
    @XmlElement(name = "PmtInstrStsDtTmInd")
    protected Boolean pmtInstrStsDtTmInd;
    @XmlElement(name = "PmtInstrStsRsnInd")
    protected Boolean pmtInstrStsRsnInd;

    /**
     * Gets the value of the pmtInstrStsInd property.
     * 
     */
    public boolean isPmtInstrStsInd() {
        return pmtInstrStsInd;
    }

    /**
     * Sets the value of the pmtInstrStsInd property.
     * 
     */
    public void setPmtInstrStsInd(boolean value) {
        this.pmtInstrStsInd = value;
    }

    /**
     * Gets the value of the pmtInstrStsDtTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInstrStsDtTmInd() {
        return pmtInstrStsDtTmInd;
    }

    /**
     * Sets the value of the pmtInstrStsDtTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtInstrStsDtTmInd(Boolean value) {
        this.pmtInstrStsDtTmInd = value;
    }

    /**
     * Gets the value of the pmtInstrStsRsnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInstrStsRsnInd() {
        return pmtInstrStsRsnInd;
    }

    /**
     * Sets the value of the pmtInstrStsRsnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtInstrStsRsnInd(Boolean value) {
        this.pmtInstrStsRsnInd = value;
    }

}
