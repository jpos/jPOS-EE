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

package org.jpos.iso20022.sese_007_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryParameters4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeliveryParameters4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RegdAdrInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}YesNoIndicator"/>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}NameAndAddress4" minOccurs="0"/>
 *         <element name="CtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ContactIdentification2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryParameters4", propOrder = {
    "regdAdrInd",
    "nmAndAdr",
    "ctctPrsn"
})
public class DeliveryParameters4 {

    @XmlElement(name = "RegdAdrInd")
    protected boolean regdAdrInd;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress4 nmAndAdr;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification2 ctctPrsn;

    /**
     * Gets the value of the regdAdrInd property.
     * 
     */
    public boolean isRegdAdrInd() {
        return regdAdrInd;
    }

    /**
     * Sets the value of the regdAdrInd property.
     * 
     */
    public void setRegdAdrInd(boolean value) {
        this.regdAdrInd = value;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public void setNmAndAdr(NameAndAddress4 value) {
        this.nmAndAdr = value;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification2 }
     *     
     */
    public ContactIdentification2 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification2 }
     *     
     */
    public void setCtctPrsn(ContactIdentification2 value) {
        this.ctctPrsn = value;
    }

}
