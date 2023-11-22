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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentParty1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentParty1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}PersonIdentification12"/>
 *         <element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}Max50Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentParty1Choice", propOrder = {
    "prsn",
    "algo"
})
public class InvestmentParty1Choice {

    @XmlElement(name = "Prsn")
    protected PersonIdentification12 prsn;
    @XmlElement(name = "Algo")
    protected String algo;

    /**
     * Gets the value of the prsn property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification12 }
     *     
     */
    public PersonIdentification12 getPrsn() {
        return prsn;
    }

    /**
     * Sets the value of the prsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification12 }
     *     
     */
    public void setPrsn(PersonIdentification12 value) {
        this.prsn = value;
    }

    /**
     * Gets the value of the algo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgo() {
        return algo;
    }

    /**
     * Sets the value of the algo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgo(String value) {
        this.algo = value;
    }

}
