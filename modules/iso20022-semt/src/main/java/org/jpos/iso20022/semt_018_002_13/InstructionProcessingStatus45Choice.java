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

package org.jpos.iso20022.semt_018_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionProcessingStatus45Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionProcessingStatus45Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}PendingProcessingStatus19Choice"/>
 *         <element name="CxlReqd" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}ProprietaryReason5"/>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}AcknowledgedAcceptedStatus25Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}CancellationStatus25Choice"/>
 *         <element name="Gnrtd" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}GeneratedStatus8Choice"/>
 *         <element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}RepairStatus16Choice"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}PendingStatus46Choice"/>
 *         <element name="ModReqd" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}ProprietaryReason5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionProcessingStatus45Choice", propOrder = {
    "pdgPrcg",
    "cxlReqd",
    "ackdAccptd",
    "canc",
    "gnrtd",
    "rpr",
    "pdgCxl",
    "modReqd"
})
public class InstructionProcessingStatus45Choice {

    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus19Choice pdgPrcg;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason5 cxlReqd;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus25Choice ackdAccptd;
    @XmlElement(name = "Canc")
    protected CancellationStatus25Choice canc;
    @XmlElement(name = "Gnrtd")
    protected GeneratedStatus8Choice gnrtd;
    @XmlElement(name = "Rpr")
    protected RepairStatus16Choice rpr;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus46Choice pdgCxl;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason5 modReqd;

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus19Choice }
     *     
     */
    public PendingProcessingStatus19Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus19Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus19Choice value) {
        this.pdgPrcg = value;
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
     * Gets the value of the gnrtd property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedStatus8Choice }
     *     
     */
    public GeneratedStatus8Choice getGnrtd() {
        return gnrtd;
    }

    /**
     * Sets the value of the gnrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedStatus8Choice }
     *     
     */
    public void setGnrtd(GeneratedStatus8Choice value) {
        this.gnrtd = value;
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
