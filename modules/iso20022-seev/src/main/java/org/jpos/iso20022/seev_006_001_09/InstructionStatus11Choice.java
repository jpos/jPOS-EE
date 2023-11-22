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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionStatus11Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionStatus11Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}InstructionProcessingStatus5"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}RejectedStatus44Choice"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PendingStatus55Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatus11Choice", propOrder = {
    "prcgSts",
    "rjctd",
    "pdg"
})
public class InstructionStatus11Choice {

    @XmlElement(name = "PrcgSts")
    protected InstructionProcessingStatus5 prcgSts;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus44Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus55Choice pdg;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus5 }
     *     
     */
    public InstructionProcessingStatus5 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus5 }
     *     
     */
    public void setPrcgSts(InstructionProcessingStatus5 value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus44Choice }
     *     
     */
    public RejectedStatus44Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus44Choice }
     *     
     */
    public void setRjctd(RejectedStatus44Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus55Choice }
     *     
     */
    public PendingStatus55Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus55Choice }
     *     
     */
    public void setPdg(PendingStatus55Choice value) {
        this.pdg = value;
    }

}
