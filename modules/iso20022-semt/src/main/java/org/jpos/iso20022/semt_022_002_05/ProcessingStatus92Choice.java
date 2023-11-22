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

package org.jpos.iso20022.semt_022_002_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus92Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus92Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}AcknowledgedAcceptedStatus25Choice"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}PendingProcessingStatus15Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}RejectionStatus41Choice"/>
 *         <element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}RepairStatus16Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}CancellationStatus25Choice"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}PendingStatus46Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProprietaryStatusAndReason7"/>
 *         <element name="CxlReqd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProprietaryReason5"/>
 *         <element name="ModReqd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProprietaryReason5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus92Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "rjctd",
    "rpr",
    "canc",
    "pdgCxl",
    "prtry",
    "cxlReqd",
    "modReqd"
})
public class ProcessingStatus92Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus25Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus15Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus41Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RepairStatus16Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus25Choice canc;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus46Choice pdgCxl;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason5 cxlReqd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason5 modReqd;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus25Choice }
     *     
     */
    public AcknowledgedAcceptedStatus25Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus25Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus25Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus15Choice }
     *     
     */
    public PendingProcessingStatus15Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus15Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus15Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus41Choice }
     *     
     */
    public RejectionStatus41Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus41Choice }
     *     
     */
    public void setRjctd(RejectionStatus41Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus16Choice }
     *     
     */
    public RepairStatus16Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus16Choice }
     *     
     */
    public void setRpr(RepairStatus16Choice value) {
        this.rpr = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus25Choice }
     *     
     */
    public CancellationStatus25Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus25Choice }
     *     
     */
    public void setCanc(CancellationStatus25Choice value) {
        this.canc = value;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus46Choice }
     *     
     */
    public PendingStatus46Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus46Choice }
     *     
     */
    public void setPdgCxl(PendingStatus46Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason7 value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public void setCxlReqd(ProprietaryReason5 value) {
        this.cxlReqd = value;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public void setModReqd(ProprietaryReason5 value) {
        this.modReqd = value;
    }

}
