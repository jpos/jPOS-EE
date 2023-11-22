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

package org.jpos.iso20022.seev_006_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus26Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CancellationStatus26Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}CancellationProcessingStatus2"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}RejectedStatus31Choice"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PendingCancellationStatus10Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus26Choice", propOrder = {
    "prcgSts",
    "rjctd",
    "pdgCxl"
})
public class CancellationStatus26Choice {

    @XmlElement(name = "PrcgSts")
    protected CancellationProcessingStatus2 prcgSts;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus31Choice rjctd;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus10Choice pdgCxl;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus2 }
     *     
     */
    public CancellationProcessingStatus2 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus2 }
     *     
     */
    public void setPrcgSts(CancellationProcessingStatus2 value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus31Choice }
     *     
     */
    public RejectedStatus31Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus31Choice }
     *     
     */
    public void setRjctd(RejectedStatus31Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus10Choice }
     *     
     */
    public PendingCancellationStatus10Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus10Choice }
     *     
     */
    public void setPdgCxl(PendingCancellationStatus10Choice value) {
        this.pdgCxl = value;
    }

}
