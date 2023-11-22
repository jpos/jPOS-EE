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

package org.jpos.iso20022.semt_022_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus87Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus87Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}AcknowledgedAcceptedStatus21Choice"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}PendingProcessingStatus11Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}RejectionStatus38Choice"/>
 *         <element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}RepairStatus12Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}CancellationStatus24Choice"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}PendingStatus38Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ProprietaryStatusAndReason6"/>
 *         <element name="CxlReqd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ProprietaryReason4"/>
 *         <element name="ModReqd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.001.05}ProprietaryReason4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus87Choice", propOrder = {
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
public class ProcessingStatus87Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus21Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus11Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus38Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RepairStatus12Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus24Choice canc;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus38Choice pdgCxl;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason4 cxlReqd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason4 modReqd;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus21Choice }
     *     
     */
    public AcknowledgedAcceptedStatus21Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus21Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus21Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus11Choice }
     *     
     */
    public PendingProcessingStatus11Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus11Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus11Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus38Choice }
     *     
     */
    public RejectionStatus38Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus38Choice }
     *     
     */
    public void setRjctd(RejectionStatus38Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus12Choice }
     *     
     */
    public RepairStatus12Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus12Choice }
     *     
     */
    public void setRpr(RepairStatus12Choice value) {
        this.rpr = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus24Choice }
     *     
     */
    public CancellationStatus24Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus24Choice }
     *     
     */
    public void setCanc(CancellationStatus24Choice value) {
        this.canc = value;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus38Choice }
     *     
     */
    public PendingStatus38Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus38Choice }
     *     
     */
    public void setPdgCxl(PendingStatus38Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCxlReqd(ProprietaryReason4 value) {
        this.cxlReqd = value;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setModReqd(ProprietaryReason4 value) {
        this.modReqd = value;
    }

}
