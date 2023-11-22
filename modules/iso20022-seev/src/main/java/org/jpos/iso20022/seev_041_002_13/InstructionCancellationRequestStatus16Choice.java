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

package org.jpos.iso20022.seev_041_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionCancellationRequestStatus16Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionCancellationRequestStatus16Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CxlCmpltd" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.002.13}CancelledStatus14Choice"/>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.002.13}NoSpecifiedReason1"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.002.13}RejectedStatus54Choice"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.002.13}PendingCancellationStatus8Choice"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.002.13}ProprietaryStatusAndReason7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionCancellationRequestStatus16Choice", propOrder = {
    "cxlCmpltd",
    "accptd",
    "rjctd",
    "pdgCxl",
    "prtrySts"
})
public class InstructionCancellationRequestStatus16Choice {

    @XmlElement(name = "CxlCmpltd")
    protected CancelledStatus14Choice cxlCmpltd;
    @XmlElement(name = "Accptd")
    protected NoSpecifiedReason1 accptd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus54Choice rjctd;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus8Choice pdgCxl;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason7 prtrySts;

    /**
     * Gets the value of the cxlCmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus14Choice }
     *     
     */
    public CancelledStatus14Choice getCxlCmpltd() {
        return cxlCmpltd;
    }

    /**
     * Sets the value of the cxlCmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus14Choice }
     *     
     */
    public void setCxlCmpltd(CancelledStatus14Choice value) {
        this.cxlCmpltd = value;
    }

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
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus54Choice }
     *     
     */
    public RejectedStatus54Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus54Choice }
     *     
     */
    public void setRjctd(RejectedStatus54Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus8Choice }
     *     
     */
    public PendingCancellationStatus8Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus8Choice }
     *     
     */
    public void setPdgCxl(PendingCancellationStatus8Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason7 value) {
        this.prtrySts = value;
    }

}
