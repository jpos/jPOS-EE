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

package org.jpos.iso20022.cain_027_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification257 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification257">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FI" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}FinancialInstitution7" minOccurs="0"/>
 *         <element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}Customer7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification257", propOrder = {
    "fi",
    "cstmr"
})
public class PartyIdentification257 {

    @XmlElement(name = "FI")
    protected FinancialInstitution7 fi;
    @XmlElement(name = "Cstmr")
    protected Customer7 cstmr;

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution7 }
     *     
     */
    public FinancialInstitution7 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution7 }
     *     
     */
    public void setFI(FinancialInstitution7 value) {
        this.fi = value;
    }

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer7 }
     *     
     */
    public Customer7 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer7 }
     *     
     */
    public void setCstmr(Customer7 value) {
        this.cstmr = value;
    }

}
