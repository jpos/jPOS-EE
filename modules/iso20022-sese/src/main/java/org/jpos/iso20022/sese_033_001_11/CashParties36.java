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

package org.jpos.iso20022.sese_033_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashParties36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashParties36">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.033.001.11}PartyIdentificationAndAccount164" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.033.001.11}PartyIdentificationAndAccount171" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.033.001.11}PartyIdentificationAndAccount164" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.033.001.11}PartyIdentificationAndAccount171" minOccurs="0"/>
 *         <element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.033.001.11}PartyIdentificationAndAccount171" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties36", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt",
    "intrmy"
})
public class CashParties36 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount164 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount171 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount164 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount171 cdtrAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentificationAndAccount171 intrmy;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public PartyIdentificationAndAccount164 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public void setDbtr(PartyIdentificationAndAccount164 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public void setDbtrAgt(PartyIdentificationAndAccount171 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public PartyIdentificationAndAccount164 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public void setCdtr(PartyIdentificationAndAccount164 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public void setCdtrAgt(PartyIdentificationAndAccount171 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public void setIntrmy(PartyIdentificationAndAccount171 value) {
        this.intrmy = value;
    }

}
