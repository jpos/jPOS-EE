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

package org.jpos.iso20022.seev_036_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementParties103 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementParties103">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentification155" minOccurs="0"/>
 *         <element name="Pty1" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentificationAndAccount205" minOccurs="0"/>
 *         <element name="Pty2" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentificationAndAccount205" minOccurs="0"/>
 *         <element name="Pty3" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentificationAndAccount205" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties103", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3"
})
public class SettlementParties103 {

    @XmlElement(name = "Dpstry")
    protected PartyIdentification155 dpstry;
    @XmlElement(name = "Pty1")
    protected PartyIdentificationAndAccount205 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount205 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount205 pty3;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification155 }
     *     
     */
    public PartyIdentification155 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification155 }
     *     
     */
    public void setDpstry(PartyIdentification155 value) {
        this.dpstry = value;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount205 }
     *     
     */
    public PartyIdentificationAndAccount205 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount205 }
     *     
     */
    public void setPty1(PartyIdentificationAndAccount205 value) {
        this.pty1 = value;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount205 }
     *     
     */
    public PartyIdentificationAndAccount205 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount205 }
     *     
     */
    public void setPty2(PartyIdentificationAndAccount205 value) {
        this.pty2 = value;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount205 }
     *     
     */
    public PartyIdentificationAndAccount205 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount205 }
     *     
     */
    public void setPty3(PartyIdentificationAndAccount205 value) {
        this.pty3 = value;
    }

}
