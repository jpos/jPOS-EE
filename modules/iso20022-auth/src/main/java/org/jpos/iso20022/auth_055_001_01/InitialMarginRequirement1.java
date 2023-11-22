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

package org.jpos.iso20022.auth_055_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialMarginRequirement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InitialMarginRequirement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnXpsr" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}InitialMarginExposure1" maxOccurs="unbounded"/>
 *         <element name="Cdt" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialMarginRequirement1", propOrder = {
    "initlMrgnXpsr",
    "cdt"
})
public class InitialMarginRequirement1 {

    @XmlElement(name = "InitlMrgnXpsr", required = true)
    protected List<InitialMarginExposure1> initlMrgnXpsr;
    @XmlElement(name = "Cdt", required = true)
    protected ActiveCurrencyAndAmount cdt;

    /**
     * Gets the value of the initlMrgnXpsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the initlMrgnXpsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitlMrgnXpsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitialMarginExposure1 }
     * 
     * 
     * @return
     *     The value of the initlMrgnXpsr property.
     */
    public List<InitialMarginExposure1> getInitlMrgnXpsr() {
        if (initlMrgnXpsr == null) {
            initlMrgnXpsr = new ArrayList<>();
        }
        return this.initlMrgnXpsr;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCdt(ActiveCurrencyAndAmount value) {
        this.cdt = value;
    }

}
