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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInstructionCancellation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingInstructionCancellation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MtgInstrCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Max35Text"/>
 *         <element name="SnglInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionCancellation1", propOrder = {
    "mtgInstrCxlReqId",
    "snglInstrId"
})
public class MeetingInstructionCancellation1 {

    @XmlElement(name = "MtgInstrCxlReqId", required = true)
    protected String mtgInstrCxlReqId;
    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;

    /**
     * Gets the value of the mtgInstrCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgInstrCxlReqId() {
        return mtgInstrCxlReqId;
    }

    /**
     * Sets the value of the mtgInstrCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtgInstrCxlReqId(String value) {
        this.mtgInstrCxlReqId = value;
    }

    /**
     * Gets the value of the snglInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrId() {
        return snglInstrId;
    }

    /**
     * Sets the value of the snglInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnglInstrId(String value) {
        this.snglInstrId = value;
    }

}
