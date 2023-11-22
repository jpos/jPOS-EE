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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundParties1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundParties1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Guarntr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes5" minOccurs="0"/>
 *         <element name="Audtr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes5" minOccurs="0"/>
 *         <element name="Trstee" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes5" minOccurs="0"/>
 *         <element name="OthrPty" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ExtendedParty13" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundParties1", propOrder = {
    "guarntr",
    "audtr",
    "trstee",
    "othrPty"
})
public class FundParties1 {

    @XmlElement(name = "Guarntr")
    protected ContactAttributes5 guarntr;
    @XmlElement(name = "Audtr")
    protected ContactAttributes5 audtr;
    @XmlElement(name = "Trstee")
    protected ContactAttributes5 trstee;
    @XmlElement(name = "OthrPty")
    protected List<ExtendedParty13> othrPty;

    /**
     * Gets the value of the guarntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getGuarntr() {
        return guarntr;
    }

    /**
     * Sets the value of the guarntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public void setGuarntr(ContactAttributes5 value) {
        this.guarntr = value;
    }

    /**
     * Gets the value of the audtr property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getAudtr() {
        return audtr;
    }

    /**
     * Sets the value of the audtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public void setAudtr(ContactAttributes5 value) {
        this.audtr = value;
    }

    /**
     * Gets the value of the trstee property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getTrstee() {
        return trstee;
    }

    /**
     * Sets the value of the trstee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public void setTrstee(ContactAttributes5 value) {
        this.trstee = value;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedParty13 }
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<ExtendedParty13> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<>();
        }
        return this.othrPty;
    }

}
