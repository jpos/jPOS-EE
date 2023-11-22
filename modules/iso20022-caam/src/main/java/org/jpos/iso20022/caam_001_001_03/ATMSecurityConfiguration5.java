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

package org.jpos.iso20022.caam_001_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityConfiguration5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityConfiguration5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PINFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}PINFormat4Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PINLngthCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration5", propOrder = {
    "pinFrmt",
    "pinLngthCpblties"
})
public class ATMSecurityConfiguration5 {

    @XmlElement(name = "PINFrmt")
    @XmlSchemaType(name = "string")
    protected List<PINFormat4Code> pinFrmt;
    @XmlElement(name = "PINLngthCpblties")
    protected BigDecimal pinLngthCpblties;

    /**
     * Gets the value of the pinFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pinFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPINFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PINFormat4Code }
     * 
     * 
     * @return
     *     The value of the pinFrmt property.
     */
    public List<PINFormat4Code> getPINFrmt() {
        if (pinFrmt == null) {
            pinFrmt = new ArrayList<>();
        }
        return this.pinFrmt;
    }

    /**
     * Gets the value of the pinLngthCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPINLngthCpblties() {
        return pinLngthCpblties;
    }

    /**
     * Sets the value of the pinLngthCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPINLngthCpblties(BigDecimal value) {
        this.pinLngthCpblties = value;
    }

}
