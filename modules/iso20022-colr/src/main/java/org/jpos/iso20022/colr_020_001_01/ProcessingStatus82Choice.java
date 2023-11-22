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
 * <p>Java class for ProcessingStatus82Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus82Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prcd" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ProprietaryReason4"/>
 *         <element name="Futr" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ProprietaryReason4"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}RejectionStatus33Choice"/>
 *         <element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CancellationStatus29Choice"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}PendingStatus56Choice"/>
 *         <element name="CxlReq" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ProprietaryReason4"/>
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
@XmlType(name = "ProcessingStatus82Choice", propOrder = {
    "prcd",
    "futr",
    "rjctd",
    "canc",
    "pdgCxl",
    "cxlReq",
    "prtry"
})
public class ProcessingStatus82Choice {

    @XmlElement(name = "Prcd")
    protected ProprietaryReason4 prcd;
    @XmlElement(name = "Futr")
    protected ProprietaryReason4 futr;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus33Choice rjctd;
    @XmlElement(name = "Canc")
    protected CancellationStatus29Choice canc;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus56Choice pdgCxl;
    @XmlElement(name = "CxlReq")
    protected ProprietaryReason4 cxlReq;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

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
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setFutr(ProprietaryReason4 value) {
        this.futr = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus33Choice }
     *     
     */
    public RejectionStatus33Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus33Choice }
     *     
     */
    public void setRjctd(RejectionStatus33Choice value) {
        this.rjctd = value;
    }

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
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public PendingStatus56Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus56Choice }
     *     
     */
    public void setPdgCxl(PendingStatus56Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the cxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCxlReq() {
        return cxlReq;
    }

    /**
     * Sets the value of the cxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCxlReq(ProprietaryReason4 value) {
        this.cxlReq = value;
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
