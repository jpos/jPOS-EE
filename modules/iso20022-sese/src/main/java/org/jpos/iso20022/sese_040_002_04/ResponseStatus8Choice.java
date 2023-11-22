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

package org.jpos.iso20022.sese_040_002_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatus8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponseStatus8Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cnsntd" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.002.04}ConsentStatus5Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.002.04}RejectionStatus27Choice"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:sese.040.002.04}PendingStatus20Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatus8Choice", propOrder = {
    "cnsntd",
    "rjctd",
    "pdg"
})
public class ResponseStatus8Choice {

    @XmlElement(name = "Cnsntd")
    protected ConsentStatus5Choice cnsntd;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus27Choice rjctd;
    @XmlElement(name = "Pdg")
    protected PendingStatus20Choice pdg;

    /**
     * Gets the value of the cnsntd property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentStatus5Choice }
     *     
     */
    public ConsentStatus5Choice getCnsntd() {
        return cnsntd;
    }

    /**
     * Sets the value of the cnsntd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentStatus5Choice }
     *     
     */
    public void setCnsntd(ConsentStatus5Choice value) {
        this.cnsntd = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus27Choice }
     *     
     */
    public RejectionStatus27Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus27Choice }
     *     
     */
    public void setRjctd(RejectionStatus27Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus20Choice }
     *     
     */
    public PendingStatus20Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus20Choice }
     *     
     */
    public void setPdg(PendingStatus20Choice value) {
        this.pdg = value;
    }

}
