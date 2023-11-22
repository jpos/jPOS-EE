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

package org.jpos.iso20022.reda_056_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashParties24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashParties24">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}PartyIdentificationAndAccount96"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}PartyIdentificationAndAccount97"/>
 *         <element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}PartyIdentificationAndAccount97" minOccurs="0"/>
 *         <element name="Intrmy2" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}PartyIdentificationAndAccount97" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties24", propOrder = {
    "cdtr",
    "cdtrAgt",
    "intrmy",
    "intrmy2"
})
public class CashParties24 {

    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentificationAndAccount96 cdtr;
    @XmlElement(name = "CdtrAgt", required = true)
    protected PartyIdentificationAndAccount97 cdtrAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentificationAndAccount97 intrmy;
    @XmlElement(name = "Intrmy2")
    protected PartyIdentificationAndAccount97 intrmy2;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount96 }
     *     
     */
    public PartyIdentificationAndAccount96 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount96 }
     *     
     */
    public void setCdtr(PartyIdentificationAndAccount96 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public PartyIdentificationAndAccount97 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public void setCdtrAgt(PartyIdentificationAndAccount97 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public PartyIdentificationAndAccount97 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public void setIntrmy(PartyIdentificationAndAccount97 value) {
        this.intrmy = value;
    }

    /**
     * Gets the value of the intrmy2 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public PartyIdentificationAndAccount97 getIntrmy2() {
        return intrmy2;
    }

    /**
     * Sets the value of the intrmy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount97 }
     *     
     */
    public void setIntrmy2(PartyIdentificationAndAccount97 value) {
        this.intrmy2 = value;
    }

}
