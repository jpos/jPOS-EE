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

package org.jpos.iso20022.colr_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveringPartiesAndAccount19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeliveringPartiesAndAccount19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentification239Choice"/>
 *         <element name="Pty1" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentificationAndAccount200"/>
 *         <element name="Pty2" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}PartyIdentificationAndAccount201" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveringPartiesAndAccount19", propOrder = {
    "dpstry",
    "pty1",
    "pty2"
})
public class DeliveringPartiesAndAccount19 {

    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification239Choice dpstry;
    @XmlElement(name = "Pty1", required = true)
    protected PartyIdentificationAndAccount200 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount201 pty2;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification239Choice }
     *     
     */
    public PartyIdentification239Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification239Choice }
     *     
     */
    public void setDpstry(PartyIdentification239Choice value) {
        this.dpstry = value;
    }

    /**
     * Gets the value of the pty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount200 }
     *     
     */
    public PartyIdentificationAndAccount200 getPty1() {
        return pty1;
    }

    /**
     * Sets the value of the pty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount200 }
     *     
     */
    public void setPty1(PartyIdentificationAndAccount200 value) {
        this.pty1 = value;
    }

    /**
     * Gets the value of the pty2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount201 }
     *     
     */
    public PartyIdentificationAndAccount201 getPty2() {
        return pty2;
    }

    /**
     * Sets the value of the pty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount201 }
     *     
     */
    public void setPty2(PartyIdentificationAndAccount201 value) {
        this.pty2 = value;
    }

}
