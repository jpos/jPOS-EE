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

package org.jpos.iso20022.sese_034_002_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus90Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus90Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}PendingStatus46Choice"/>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}AcknowledgedAcceptedStatus25Choice"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}PendingProcessingStatus14Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RejectionStatus40Choice"/>
 *         <element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}RepairStatus15Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}CancellationStatus18Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}ProprietaryStatusAndReason7"/>
 *         <element name="CxlReqd" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}ProprietaryReason5"/>
 *         <element name="ModReqd" type="{urn:iso:std:iso:20022:tech:xsd:sese.034.002.09}ProprietaryReason5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus90Choice", propOrder = {
    "pdgCxl",
    "ackdAccptd",
    "pdgPrcg",
    "rjctd",
    "rpr",
    "canc",
    "prtry",
    "cxlReqd",
    "modReqd"
})
public class ProcessingStatus90Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus46Choice pdgCxl;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus25Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus14Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus40Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RepairStatus15Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus18Choice canc;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason5 cxlReqd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason5 modReqd;

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
     *     {@link PendingProcessingStatus14Choice }
     *     
     */
    public PendingProcessingStatus14Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus14Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus14Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus40Choice }
     *     
     */
    public RejectionStatus40Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus40Choice }
     *     
     */
    public void setRjctd(RejectionStatus40Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus15Choice }
     *     
     */
    public RepairStatus15Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus15Choice }
     *     
     */
    public void setRpr(RepairStatus15Choice value) {
        this.rpr = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus18Choice }
     *     
     */
    public CancellationStatus18Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus18Choice }
     *     
     */
    public void setCanc(CancellationStatus18Choice value) {
        this.canc = value;
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
