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

package org.jpos.iso20022.setr_044_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationProcessingStatus10Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CancellationProcessingStatus10Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CxlPdg" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}CancellationReason39Choice"/>
 *         <element name="CxlReqd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="CxlCmpltd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryStatusAndReason6" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationProcessingStatus10Choice", propOrder = {
    "cxlPdg",
    "cxlReqd",
    "cxlCmpltd",
    "prtrySts"
})
public class CancellationProcessingStatus10Choice {

    @XmlElement(name = "CxlPdg")
    protected CancellationReason39Choice cxlPdg;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason4 cxlReqd;
    @XmlElement(name = "CxlCmpltd")
    protected ProprietaryReason4 cxlCmpltd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the cxlPdg property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason39Choice }
     *     
     */
    public CancellationReason39Choice getCxlPdg() {
        return cxlPdg;
    }

    /**
     * Sets the value of the cxlPdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason39Choice }
     *     
     */
    public void setCxlPdg(CancellationReason39Choice value) {
        this.cxlPdg = value;
    }

    /**
     * Gets the value of the cxlReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Sets the value of the cxlReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCxlReqd(ProprietaryReason4 value) {
        this.cxlReqd = value;
    }

    /**
     * Gets the value of the cxlCmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCxlCmpltd() {
        return cxlCmpltd;
    }

    /**
     * Sets the value of the cxlCmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCxlCmpltd(ProprietaryReason4 value) {
        this.cxlCmpltd = value;
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
