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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementParties102 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementParties102">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PartyIdentification143" minOccurs="0"/>
 *         <element name="Pty1" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PartyIdentificationAndAccount204" minOccurs="0"/>
 *         <element name="Pty2" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PartyIdentificationAndAccount204" minOccurs="0"/>
 *         <element name="Pty3" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PartyIdentificationAndAccount204" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties102", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3"
})
public class SettlementParties102 {

    @XmlElement(name = "Dpstry")
    protected PartyIdentification143 dpstry;
    @XmlElement(name = "Pty1")
    protected PartyIdentificationAndAccount204 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount204 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount204 pty3;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification143 }
     *     
     */
    public PartyIdentification143 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification143 }
     *     
     */
    public void setDpstry(PartyIdentification143 value) {
        this.dpstry = value;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount204 }
     *     
     */
    public PartyIdentificationAndAccount204 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount204 }
     *     
     */
    public void setPty1(PartyIdentificationAndAccount204 value) {
        this.pty1 = value;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount204 }
     *     
     */
    public PartyIdentificationAndAccount204 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount204 }
     *     
     */
    public void setPty2(PartyIdentificationAndAccount204 value) {
        this.pty2 = value;
    }

    /**
     * Gets the value of the pty3 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount204 }
     *     
     */
    public PartyIdentificationAndAccount204 getPty3() {
        return pty3;
    }

    /**
     * Sets the value of the pty3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount204 }
     *     
     */
    public void setPty3(PartyIdentificationAndAccount204 value) {
        this.pty3 = value;
    }

}
