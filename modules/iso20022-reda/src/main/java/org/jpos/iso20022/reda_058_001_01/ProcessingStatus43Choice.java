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

package org.jpos.iso20022.reda_058_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus43Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus43Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Rcvd" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}ReceivedStatusReason1"/>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}AcceptedStatusReason7"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}PendingProcessingStatusReason1"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}RejectedStatusReason12"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}ProprietaryStatusAndReason5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus43Choice", propOrder = {
    "rcvd",
    "accptd",
    "pdgPrcg",
    "rjctd",
    "prtrySts"
})
public class ProcessingStatus43Choice {

    @XmlElement(name = "Rcvd")
    protected ReceivedStatusReason1 rcvd;
    @XmlElement(name = "Accptd")
    protected AcceptedStatusReason7 accptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatusReason1 pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectedStatusReason12 rjctd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason5 prtrySts;

    /**
     * Gets the value of the rcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedStatusReason1 }
     *     
     */
    public ReceivedStatusReason1 getRcvd() {
        return rcvd;
    }

    /**
     * Sets the value of the rcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedStatusReason1 }
     *     
     */
    public void setRcvd(ReceivedStatusReason1 value) {
        this.rcvd = value;
    }

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatusReason7 }
     *     
     */
    public AcceptedStatusReason7 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatusReason7 }
     *     
     */
    public void setAccptd(AcceptedStatusReason7 value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatusReason1 }
     *     
     */
    public PendingProcessingStatusReason1 getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatusReason1 }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatusReason1 value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatusReason12 }
     *     
     */
    public RejectedStatusReason12 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatusReason12 }
     *     
     */
    public void setRjctd(RejectedStatusReason12 value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason5 }
     *     
     */
    public ProprietaryStatusAndReason5 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason5 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason5 value) {
        this.prtrySts = value;
    }

}
