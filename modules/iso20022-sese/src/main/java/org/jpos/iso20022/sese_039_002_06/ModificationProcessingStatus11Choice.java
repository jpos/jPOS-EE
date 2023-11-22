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

package org.jpos.iso20022.sese_039_002_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationProcessingStatus11Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModificationProcessingStatus11Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.002.06}AcknowledgedAcceptedStatus30Choice"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.002.06}PendingProcessingStatus16Choice"/>
 *         <element name="Dnd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.002.06}DeniedStatus19Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.002.06}RejectionStatus42Choice"/>
 *         <element name="Rprd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.002.06}RepairStatus17Choice"/>
 *         <element name="Modfd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.002.06}ModificationStatus5Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.002.06}ProprietaryStatusAndReason7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationProcessingStatus11Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "dnd",
    "rjctd",
    "rprd",
    "modfd",
    "prtry"
})
public class ModificationProcessingStatus11Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus30Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus16Choice pdgPrcg;
    @XmlElement(name = "Dnd")
    protected DeniedStatus19Choice dnd;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus42Choice rjctd;
    @XmlElement(name = "Rprd")
    protected RepairStatus17Choice rprd;
    @XmlElement(name = "Modfd")
    protected ModificationStatus5Choice modfd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus30Choice }
     *     
     */
    public AcknowledgedAcceptedStatus30Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus30Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus30Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus16Choice }
     *     
     */
    public PendingProcessingStatus16Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus16Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus16Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus19Choice }
     *     
     */
    public DeniedStatus19Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus19Choice }
     *     
     */
    public void setDnd(DeniedStatus19Choice value) {
        this.dnd = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus42Choice }
     *     
     */
    public RejectionStatus42Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus42Choice }
     *     
     */
    public void setRjctd(RejectionStatus42Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rprd property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus17Choice }
     *     
     */
    public RepairStatus17Choice getRprd() {
        return rprd;
    }

    /**
     * Sets the value of the rprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus17Choice }
     *     
     */
    public void setRprd(RepairStatus17Choice value) {
        this.rprd = value;
    }

    /**
     * Gets the value of the modfd property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationStatus5Choice }
     *     
     */
    public ModificationStatus5Choice getModfd() {
        return modfd;
    }

    /**
     * Sets the value of the modfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationStatus5Choice }
     *     
     */
    public void setModfd(ModificationStatus5Choice value) {
        this.modfd = value;
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

}
