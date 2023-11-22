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
 * <p>Java class for CashParties37 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashParties37">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentificationAndAccount174" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentificationAndAccount175" minOccurs="0"/>
 *         <element name="MktClmCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PartyIdentificationAndAccount174" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties37", propOrder = {
    "cdtr",
    "cdtrAgt",
    "mktClmCtrPty"
})
public class CashParties37 {

    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount174 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount175 cdtrAgt;
    @XmlElement(name = "MktClmCtrPty")
    protected PartyIdentificationAndAccount174 mktClmCtrPty;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount174 }
     *     
     */
    public PartyIdentificationAndAccount174 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount174 }
     *     
     */
    public void setCdtr(PartyIdentificationAndAccount174 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount175 }
     *     
     */
    public PartyIdentificationAndAccount175 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount175 }
     *     
     */
    public void setCdtrAgt(PartyIdentificationAndAccount175 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the mktClmCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount174 }
     *     
     */
    public PartyIdentificationAndAccount174 getMktClmCtrPty() {
        return mktClmCtrPty;
    }

    /**
     * Sets the value of the mktClmCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount174 }
     *     
     */
    public void setMktClmCtrPty(PartyIdentificationAndAccount174 value) {
        this.mktClmCtrPty = value;
    }

}
