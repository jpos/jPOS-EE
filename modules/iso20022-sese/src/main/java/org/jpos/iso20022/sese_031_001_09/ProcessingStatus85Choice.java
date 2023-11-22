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

package org.jpos.iso20022.sese_031_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus85Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus85Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}AcknowledgedAcceptedStatus21Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}RejectionOrRepairStatus42Choice"/>
 *         <element name="Cmpltd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}ProprietaryReason4"/>
 *         <element name="Dnd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}DeniedStatus15Choice"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}PendingStatus38Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.001.09}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus85Choice", propOrder = {
    "ackdAccptd",
    "rjctd",
    "cmpltd",
    "dnd",
    "pdg",
    "prtry"
})
public class ProcessingStatus85Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus21Choice ackdAccptd;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus42Choice rjctd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason4 cmpltd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus15Choice dnd;
    @XmlElement(name = "Pdg")
    protected PendingStatus38Choice pdg;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

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
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus42Choice }
     *     
     */
    public RejectionOrRepairStatus42Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus42Choice }
     *     
     */
    public void setRjctd(RejectionOrRepairStatus42Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCmpltd(ProprietaryReason4 value) {
        this.cmpltd = value;
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
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus38Choice }
     *     
     */
    public PendingStatus38Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus38Choice }
     *     
     */
    public void setPdg(PendingStatus38Choice value) {
        this.pdg = value;
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
