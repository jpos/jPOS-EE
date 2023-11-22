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

package org.jpos.iso20022.semt_014_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraPositionProcessingStatus9Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraPositionProcessingStatus9Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.001.07}RejectionOrRepairStatus41Choice"/>
 *         <element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.001.07}RejectionOrRepairStatus41Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.001.07}CancellationStatus24Choice"/>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.001.07}AcknowledgedAcceptedStatus21Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.014.001.07}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionProcessingStatus9Choice", propOrder = {
    "rjctd",
    "rpr",
    "canc",
    "ackdAccptd",
    "prtry"
})
public class IntraPositionProcessingStatus9Choice {

    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus41Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus41Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus24Choice canc;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus21Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus41Choice }
     *     
     */
    public RejectionOrRepairStatus41Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus41Choice }
     *     
     */
    public void setRjctd(RejectionOrRepairStatus41Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus41Choice }
     *     
     */
    public RejectionOrRepairStatus41Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus41Choice }
     *     
     */
    public void setRpr(RejectionOrRepairStatus41Choice value) {
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
