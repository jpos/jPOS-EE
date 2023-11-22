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

package org.jpos.iso20022.sese_039_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationProcessingStatus10Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModificationProcessingStatus10Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.001.06}AcknowledgedAcceptedStatus23Choice"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.001.06}PendingProcessingStatus13Choice"/>
 *         <element name="Dnd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.001.06}DeniedStatus15Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.001.06}RejectionStatus37Choice"/>
 *         <element name="Rprd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.001.06}RepairStatus13Choice"/>
 *         <element name="Modfd" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.001.06}ModificationStatus4Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.039.001.06}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationProcessingStatus10Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "dnd",
    "rjctd",
    "rprd",
    "modfd",
    "prtry"
})
public class ModificationProcessingStatus10Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus23Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus13Choice pdgPrcg;
    @XmlElement(name = "Dnd")
    protected DeniedStatus15Choice dnd;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus37Choice rjctd;
    @XmlElement(name = "Rprd")
    protected RepairStatus13Choice rprd;
    @XmlElement(name = "Modfd")
    protected ModificationStatus4Choice modfd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus23Choice }
     *     
     */
    public AcknowledgedAcceptedStatus23Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus23Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus23Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus13Choice }
     *     
     */
    public PendingProcessingStatus13Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus13Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus13Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus15Choice }
     *     
     */
    public DeniedStatus15Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus15Choice }
     *     
     */
    public void setDnd(DeniedStatus15Choice value) {
        this.dnd = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus37Choice }
     *     
     */
    public RejectionStatus37Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus37Choice }
     *     
     */
    public void setRjctd(RejectionStatus37Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rprd property.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus13Choice }
     *     
     */
    public RepairStatus13Choice getRprd() {
        return rprd;
    }

    /**
     * Sets the value of the rprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus13Choice }
     *     
     */
    public void setRprd(RepairStatus13Choice value) {
        this.rprd = value;
    }

    /**
     * Gets the value of the modfd property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationStatus4Choice }
     *     
     */
    public ModificationStatus4Choice getModfd() {
        return modfd;
    }

    /**
     * Sets the value of the modfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationStatus4Choice }
     *     
     */
    public void setModfd(ModificationStatus4Choice value) {
        this.modfd = value;
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

}
