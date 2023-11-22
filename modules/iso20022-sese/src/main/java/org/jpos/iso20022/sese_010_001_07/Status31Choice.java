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

package org.jpos.iso20022.sese_010_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status31Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status31Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:sese.010.001.07}TransferCancellationStatus3"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.010.001.07}RejectionReason33"/>
 *         <element name="Cmplt" type="{urn:iso:std:iso:20022:tech:xsd:sese.010.001.07}CancelledCompleteReason1"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:sese.010.001.07}TransferCancellationPendingStatus1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status31Choice", propOrder = {
    "sts",
    "rjctd",
    "cmplt",
    "pdg"
})
public class Status31Choice {

    @XmlElement(name = "Sts")
    protected TransferCancellationStatus3 sts;
    @XmlElement(name = "Rjctd")
    protected RejectionReason33 rjctd;
    @XmlElement(name = "Cmplt")
    protected CancelledCompleteReason1 cmplt;
    @XmlElement(name = "Pdg")
    protected TransferCancellationPendingStatus1 pdg;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationStatus3 }
     *     
     */
    public TransferCancellationStatus3 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationStatus3 }
     *     
     */
    public void setSts(TransferCancellationStatus3 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason33 }
     *     
     */
    public RejectionReason33 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason33 }
     *     
     */
    public void setRjctd(RejectionReason33 value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the cmplt property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledCompleteReason1 }
     *     
     */
    public CancelledCompleteReason1 getCmplt() {
        return cmplt;
    }

    /**
     * Sets the value of the cmplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledCompleteReason1 }
     *     
     */
    public void setCmplt(CancelledCompleteReason1 value) {
        this.cmplt = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationPendingStatus1 }
     *     
     */
    public TransferCancellationPendingStatus1 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationPendingStatus1 }
     *     
     */
    public void setPdg(TransferCancellationPendingStatus1 value) {
        this.pdg = value;
    }

}
