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

package org.jpos.iso20022.colr_020_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus30Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CancellationStatus30Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CancellationStatus29Choice"/>
 *         <element name="Prcd" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ProprietaryReason4"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}PendingStatus56Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}RejectionStatus34Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus30Choice", propOrder = {
    "canc",
    "prcd",
    "pdg",
    "rjctd",
    "prtry"
})
public class CancellationStatus30Choice {

    @XmlElement(name = "Canc")
    protected CancellationStatus29Choice canc;
    @XmlElement(name = "Prcd")
    protected ProprietaryReason4 prcd;
    @XmlElement(name = "Pdg")
    protected PendingStatus56Choice pdg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus34Choice rjctd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus29Choice }
     *     
     */
    public CancellationStatus29Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus29Choice }
     *     
     */
    public void setCanc(CancellationStatus29Choice value) {
        this.canc = value;
    }

    /**
     * Gets the value of the prcd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPrcd() {
        return prcd;
    }

    /**
     * Sets the value of the prcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setPrcd(ProprietaryReason4 value) {
        this.prcd = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public PendingStatus56Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public void setPdg(PendingStatus56Choice value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus34Choice }
     *     
     */
    public RejectionStatus34Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus34Choice }
     *     
     */
    public void setRjctd(RejectionStatus34Choice value) {
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
