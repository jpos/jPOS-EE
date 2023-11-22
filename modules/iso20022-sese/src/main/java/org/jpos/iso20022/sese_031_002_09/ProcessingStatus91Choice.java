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

package org.jpos.iso20022.sese_031_002_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus91Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus91Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}AcknowledgedAcceptedStatus25Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}RejectionOrRepairStatus46Choice"/>
 *         <element name="Cmpltd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}ProprietaryReason5"/>
 *         <element name="Dnd" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}DeniedStatus19Choice"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}PendingStatus46Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.031.002.09}ProprietaryStatusAndReason7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus91Choice", propOrder = {
    "ackdAccptd",
    "rjctd",
    "cmpltd",
    "dnd",
    "pdg",
    "prtry"
})
public class ProcessingStatus91Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus25Choice ackdAccptd;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus46Choice rjctd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason5 cmpltd;
    @XmlElement(name = "Dnd")
    protected DeniedStatus19Choice dnd;
    @XmlElement(name = "Pdg")
    protected PendingStatus46Choice pdg;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;

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
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus46Choice }
     *     
     */
    public RejectionOrRepairStatus46Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus46Choice }
     *     
     */
    public void setRjctd(RejectionOrRepairStatus46Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public void setCmpltd(ProprietaryReason5 value) {
        this.cmpltd = value;
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
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus46Choice }
     *     
     */
    public PendingStatus46Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus46Choice }
     *     
     */
    public void setPdg(PendingStatus46Choice value) {
        this.pdg = value;
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
