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

package org.jpos.iso20022.reda_030_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatus72Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingStatus72Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:reda.030.001.01}Reason4"/>
 *         <element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:reda.030.001.01}Reason18Choice"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:reda.030.001.01}Reason18Choice"/>
 *         <element name="Cmpltd" type="{urn:iso:std:iso:20022:tech:xsd:reda.030.001.01}Reason4"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:reda.030.001.01}ProprietaryStatusAndReason6"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus72Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "rjctd",
    "cmpltd",
    "prtry"
})
public class ProcessingStatus72Choice {

    @XmlElement(name = "AckdAccptd")
    protected Reason4 ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected Reason18Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected Reason18Choice rjctd;
    @XmlElement(name = "Cmpltd")
    protected Reason4 cmpltd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the ackdAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link Reason4 }
     *     
     */
    public Reason4 getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Sets the value of the ackdAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason4 }
     *     
     */
    public void setAckdAccptd(Reason4 value) {
        this.ackdAccptd = value;
    }

    /**
     * Gets the value of the pdgPrcg property.
     * 
     * @return
     *     possible object is
     *     {@link Reason18Choice }
     *     
     */
    public Reason18Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Sets the value of the pdgPrcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason18Choice }
     *     
     */
    public void setPdgPrcg(Reason18Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link Reason18Choice }
     *     
     */
    public Reason18Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason18Choice }
     *     
     */
    public void setRjctd(Reason18Choice value) {
        this.rjctd = value;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link Reason4 }
     *     
     */
    public Reason4 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason4 }
     *     
     */
    public void setCmpltd(Reason4 value) {
        this.cmpltd = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

}
