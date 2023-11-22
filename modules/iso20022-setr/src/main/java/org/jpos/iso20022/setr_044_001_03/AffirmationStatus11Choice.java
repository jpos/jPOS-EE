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
 * <p>Java class for AffirmationStatus11Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AffirmationStatus11Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Affrmd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="Uaffrmd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}AffirmationReason2Choice"/>
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
@XmlType(name = "AffirmationStatus11Choice", propOrder = {
    "affrmd",
    "uaffrmd",
    "prtrySts"
})
public class AffirmationStatus11Choice {

    @XmlElement(name = "Affrmd")
    protected ProprietaryReason4 affrmd;
    @XmlElement(name = "Uaffrmd")
    protected AffirmationReason2Choice uaffrmd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the affrmd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAffrmd() {
        return affrmd;
    }

    /**
     * Sets the value of the affrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setAffrmd(ProprietaryReason4 value) {
        this.affrmd = value;
    }

    /**
     * Gets the value of the uaffrmd property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationReason2Choice }
     *     
     */
    public AffirmationReason2Choice getUaffrmd() {
        return uaffrmd;
    }

    /**
     * Sets the value of the uaffrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationReason2Choice }
     *     
     */
    public void setUaffrmd(AffirmationReason2Choice value) {
        this.uaffrmd = value;
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
