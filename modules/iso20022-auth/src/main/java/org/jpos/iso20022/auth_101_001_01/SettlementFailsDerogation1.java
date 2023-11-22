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

package org.jpos.iso20022.auth_101_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsDerogation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsDerogation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ElgbltyInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}TrueFalseIndicator"/>
 *         <element name="Justfn" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}SettlementFailsJustification1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDerogation1", propOrder = {
    "elgbltyInd",
    "justfn"
})
public class SettlementFailsDerogation1 {

    @XmlElement(name = "ElgbltyInd")
    protected boolean elgbltyInd;
    @XmlElement(name = "Justfn")
    protected SettlementFailsJustification1 justfn;

    /**
     * Gets the value of the elgbltyInd property.
     * 
     */
    public boolean isElgbltyInd() {
        return elgbltyInd;
    }

    /**
     * Sets the value of the elgbltyInd property.
     * 
     */
    public void setElgbltyInd(boolean value) {
        this.elgbltyInd = value;
    }

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsJustification1 }
     *     
     */
    public SettlementFailsJustification1 getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsJustification1 }
     *     
     */
    public void setJustfn(SettlementFailsJustification1 value) {
        this.justfn = value;
    }

}
