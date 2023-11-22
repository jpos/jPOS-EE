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
 * <p>Java class for ProcessingStatus93Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus93Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}PendingStatus51Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}RejectionOrRepairStatus47Choice"/>
 *         <element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}RejectionOrRepairStatus46Choice"/>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}AcknowledgedAcceptedStatus31Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProprietaryStatusAndReason7"/>
 *         <element name="Dnd" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}DeniedStatus21Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}CancellationStatus20Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus93Choice", propOrder = {
    "pdgCxl",
    "rjctd",
    "rpr",
    "ackdAccptd",
    "prtry",
    "dnd",
    "canc"
})
public class ProcessingStatus93Choice {

    @XmlElement(name = "PdgCxl")
    protected PendingStatus51Choice pdgCxl;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus47Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RejectionOrRepairStatus46Choice rpr;
    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus31Choice ackdAccptd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;
    @XmlElement(name = "Dnd")
    protected DeniedStatus21Choice dnd;
    @XmlElement(name = "Canc")
    protected CancellationStatus20Choice canc;

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus51Choice }
     *     
     */
    public PendingStatus51Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus51Choice }
     *     
     */
    public void setPdgCxl(PendingStatus51Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus47Choice }
     *     
     */
    public RejectionOrRepairStatus47Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus47Choice }
     *     
     */
    public void setRjctd(RejectionOrRepairStatus47Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the rpr property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus46Choice }
     *     
     */
    public RejectionOrRepairStatus46Choice getRpr() {
        return rpr;
    }

    /**
     * Sets the value of the rpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus46Choice }
     *     
     */
    public void setRpr(RejectionOrRepairStatus46Choice value) {
        this.rpr = value;
    }

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus31Choice }
     *     
     */
    public AcknowledgedAcceptedStatus31Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus31Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus31Choice value) {
        this.ackdAccptd = value;
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
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link DeniedStatus21Choice }
     *     
     */
    public DeniedStatus21Choice getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeniedStatus21Choice }
     *     
     */
    public void setDnd(DeniedStatus21Choice value) {
        this.dnd = value;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus20Choice }
     *     
     */
    public CancellationStatus20Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus20Choice }
     *     
     */
    public void setCanc(CancellationStatus20Choice value) {
        this.canc = value;
    }

}
