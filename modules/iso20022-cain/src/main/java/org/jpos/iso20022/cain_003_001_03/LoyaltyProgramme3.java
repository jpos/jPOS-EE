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

package org.jpos.iso20022.cain_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyProgramme3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyProgramme3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrgrmmElgbltyInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrgrmmIssr" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="LltyMmb" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}LoyaltyMember2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramme3", propOrder = {
    "prgrmmElgbltyInd",
    "prgrmmIssr",
    "lltyMmb"
})
public class LoyaltyProgramme3 {

    @XmlElement(name = "PrgrmmElgbltyInd", type = Boolean.class)
    protected List<Boolean> prgrmmElgbltyInd;
    @XmlElement(name = "PrgrmmIssr")
    protected String prgrmmIssr;
    @XmlElement(name = "LltyMmb")
    protected LoyaltyMember2 lltyMmb;

    /**
     * Gets the value of the prgrmmElgbltyInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prgrmmElgbltyInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrgrmmElgbltyInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     * @return
     *     The value of the prgrmmElgbltyInd property.
     */
    public List<Boolean> getPrgrmmElgbltyInd() {
        if (prgrmmElgbltyInd == null) {
            prgrmmElgbltyInd = new ArrayList<>();
        }
        return this.prgrmmElgbltyInd;
    }

    /**
     * Gets the value of the prgrmmIssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmmIssr() {
        return prgrmmIssr;
    }

    /**
     * Sets the value of the prgrmmIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrgrmmIssr(String value) {
        this.prgrmmIssr = value;
    }

    /**
     * Gets the value of the lltyMmb property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyMember2 }
     *     
     */
    public LoyaltyMember2 getLltyMmb() {
        return lltyMmb;
    }

    /**
     * Sets the value of the lltyMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyMember2 }
     *     
     */
    public void setLltyMmb(LoyaltyMember2 value) {
        this.lltyMmb = value;
    }

}
