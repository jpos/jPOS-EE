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

package org.jpos.iso20022.sese_037_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioTransferStatus2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PortfolioTransferStatus2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AcknowledgedAcceptedStatus32Choice"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}PendingProcessingStatus17Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}RejectionStatus30Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferStatus2Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "rjctd",
    "prtry"
})
public class PortfolioTransferStatus2Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus32Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus17Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus30Choice rjctd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus32Choice }
     *     
     */
    public AcknowledgedAcceptedStatus32Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus32Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus32Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus17Choice }
     *     
     */
    public PendingProcessingStatus17Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus17Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus17Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus30Choice }
     *     
     */
    public RejectionStatus30Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus30Choice }
     *     
     */
    public void setRjctd(RejectionStatus30Choice value) {
        this.rjctd = value;
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
