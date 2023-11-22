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
 * <p>Java class for MatchingStatus35Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MatchingStatus35Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Mtchd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="MtchdWthTlrnce" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ProprietaryReason4"/>
 *         <element name="MtchgAllgd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}MatchingReason5Choice"/>
 *         <element name="Umtchd" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}MatchingReason6Choice"/>
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
@XmlType(name = "MatchingStatus35Choice", propOrder = {
    "mtchd",
    "mtchdWthTlrnce",
    "mtchgAllgd",
    "umtchd",
    "prtrySts"
})
public class MatchingStatus35Choice {

    @XmlElement(name = "Mtchd")
    protected ProprietaryReason4 mtchd;
    @XmlElement(name = "MtchdWthTlrnce")
    protected ProprietaryReason4 mtchdWthTlrnce;
    @XmlElement(name = "MtchgAllgd")
    protected MatchingReason5Choice mtchgAllgd;
    @XmlElement(name = "Umtchd")
    protected MatchingReason6Choice umtchd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the mtchd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getMtchd() {
        return mtchd;
    }

    /**
     * Sets the value of the mtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setMtchd(ProprietaryReason4 value) {
        this.mtchd = value;
    }

    /**
     * Gets the value of the mtchdWthTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getMtchdWthTlrnce() {
        return mtchdWthTlrnce;
    }

    /**
     * Sets the value of the mtchdWthTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setMtchdWthTlrnce(ProprietaryReason4 value) {
        this.mtchdWthTlrnce = value;
    }

    /**
     * Gets the value of the mtchgAllgd property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingReason5Choice }
     *     
     */
    public MatchingReason5Choice getMtchgAllgd() {
        return mtchgAllgd;
    }

    /**
     * Sets the value of the mtchgAllgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingReason5Choice }
     *     
     */
    public void setMtchgAllgd(MatchingReason5Choice value) {
        this.mtchgAllgd = value;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingReason6Choice }
     *     
     */
    public MatchingReason6Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingReason6Choice }
     *     
     */
    public void setUmtchd(MatchingReason6Choice value) {
        this.umtchd = value;
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
