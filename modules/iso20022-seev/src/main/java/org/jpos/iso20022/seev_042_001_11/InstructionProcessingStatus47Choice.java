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

package org.jpos.iso20022.seev_042_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionProcessingStatus47Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionProcessingStatus47Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}NoSpecifiedReason1"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}CancelledStatus12Choice"/>
 *         <element name="AccptdForFrthrPrcg" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}NoSpecifiedReason1"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}RejectedStatus43Choice"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}NoSpecifiedReason1"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}PendingCancellationStatus7Choice"/>
 *         <element name="Cvrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}NoSpecifiedReason1"/>
 *         <element name="Ucvrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}NoSpecifiedReason1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus47Choice", propOrder = {
    "accptd",
    "canc",
    "accptdForFrthrPrcg",
    "rjctd",
    "pdg",
    "pdgCxl",
    "cvrd",
    "ucvrd"
})
public class InstructionProcessingStatus47Choice {

    @XmlElement(name = "Accptd")
    protected NoSpecifiedReason1 accptd;
    @XmlElement(name = "Canc")
    protected CancelledStatus12Choice canc;
    @XmlElement(name = "AccptdForFrthrPrcg")
    protected NoSpecifiedReason1 accptdForFrthrPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus43Choice rjctd;
    @XmlElement(name = "Pdg")
    protected NoSpecifiedReason1 pdg;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus7Choice pdgCxl;
    @XmlElement(name = "Cvrd")
    protected NoSpecifiedReason1 cvrd;
    @XmlElement(name = "Ucvrd")
    protected NoSpecifiedReason1 ucvrd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setAccptd(NoSpecifiedReason1 value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public CancelledStatus12Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus12Choice }
     *     
     */
    public void setCanc(CancelledStatus12Choice value) {
        this.canc = value;
    }

    /**
     * Gets the value of the accptdForFrthrPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getAccptdForFrthrPrcg() {
        return accptdForFrthrPrcg;
    }

    /**
     * Sets the value of the accptdForFrthrPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setAccptdForFrthrPrcg(NoSpecifiedReason1 value) {
        this.accptdForFrthrPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus43Choice }
     *     
     */
    public RejectedStatus43Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus43Choice }
     *     
     */
    public void setRjctd(RejectedStatus43Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setPdg(NoSpecifiedReason1 value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus7Choice }
     *     
     */
    public PendingCancellationStatus7Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus7Choice }
     *     
     */
    public void setPdgCxl(PendingCancellationStatus7Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the cvrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getCvrd() {
        return cvrd;
    }

    /**
     * Sets the value of the cvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setCvrd(NoSpecifiedReason1 value) {
        this.cvrd = value;
    }

    /**
     * Gets the value of the ucvrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getUcvrd() {
        return ucvrd;
    }

    /**
     * Sets the value of the ucvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setUcvrd(NoSpecifiedReason1 value) {
        this.ucvrd = value;
    }

}
