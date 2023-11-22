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

package org.jpos.iso20022.seev_006_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionTypeStatus5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionTypeStatus5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="InstrSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}DetailedInstructionStatus16" maxOccurs="unbounded"/>
 *         <element name="CxlSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}CancellationStatus27Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionTypeStatus5Choice", propOrder = {
    "instrSts",
    "cxlSts"
})
public class InstructionTypeStatus5Choice {

    @XmlElement(name = "InstrSts")
    protected List<DetailedInstructionStatus16> instrSts;
    @XmlElement(name = "CxlSts")
    protected CancellationStatus27Choice cxlSts;

    /**
     * Gets the value of the instrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionStatus16 }
     * 
     * 
     * @return
     *     The value of the instrSts property.
     */
    public List<DetailedInstructionStatus16> getInstrSts() {
        if (instrSts == null) {
            instrSts = new ArrayList<>();
        }
        return this.instrSts;
    }

    /**
     * Gets the value of the cxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus27Choice }
     *     
     */
    public CancellationStatus27Choice getCxlSts() {
        return cxlSts;
    }

    /**
     * Sets the value of the cxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus27Choice }
     *     
     */
    public void setCxlSts(CancellationStatus27Choice value) {
        this.cxlSts = value;
    }

}
