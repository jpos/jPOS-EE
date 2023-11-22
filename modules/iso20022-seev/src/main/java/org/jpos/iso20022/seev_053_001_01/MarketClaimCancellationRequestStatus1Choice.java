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

package org.jpos.iso20022.seev_053_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketClaimCancellationRequestStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarketClaimCancellationRequestStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CxlCmpltd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}CancelledStatus11Choice"/>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}NoSpecifiedReason1"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}RejectedStatus38Choice"/>
 *         <element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}PendingCancellationStatus11Choice"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCancellationRequestStatus1Choice", propOrder = {
    "cxlCmpltd",
    "accptd",
    "rjctd",
    "pdgCxl",
    "prtrySts"
})
public class MarketClaimCancellationRequestStatus1Choice {

    @XmlElement(name = "CxlCmpltd")
    protected CancelledStatus11Choice cxlCmpltd;
    @XmlElement(name = "Accptd")
    protected NoSpecifiedReason1 accptd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus38Choice rjctd;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus11Choice pdgCxl;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the cxlCmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus11Choice }
     *     
     */
    public CancelledStatus11Choice getCxlCmpltd() {
        return cxlCmpltd;
    }

    /**
     * Sets the value of the cxlCmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus11Choice }
     *     
     */
    public void setCxlCmpltd(CancelledStatus11Choice value) {
        this.cxlCmpltd = value;
    }

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setAccptd(NoSpecifiedReason1 value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus38Choice }
     *     
     */
    public RejectedStatus38Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus38Choice }
     *     
     */
    public void setRjctd(RejectedStatus38Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the pdgCxl property.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus11Choice }
     *     
     */
    public PendingCancellationStatus11Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Sets the value of the pdgCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus11Choice }
     *     
     */
    public void setPdgCxl(PendingCancellationStatus11Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
    }

}
