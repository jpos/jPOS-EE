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

package org.jpos.iso20022.sese_026_002_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashParties40 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashParties40">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount177" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount178" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount177" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.026.002.10}PartyIdentificationAndAccount178" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties40", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt"
})
public class CashParties40 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount177 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount178 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount177 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount178 cdtrAgt;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public PartyIdentificationAndAccount177 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public void setDbtr(PartyIdentificationAndAccount177 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public PartyIdentificationAndAccount178 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public void setDbtrAgt(PartyIdentificationAndAccount178 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public PartyIdentificationAndAccount177 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public void setCdtr(PartyIdentificationAndAccount177 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public PartyIdentificationAndAccount178 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public void setCdtrAgt(PartyIdentificationAndAccount178 value) {
        this.cdtrAgt = value;
    }

}
