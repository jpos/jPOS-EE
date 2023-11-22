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

package org.jpos.iso20022.auth_094_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTradeVenueCriteria1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTradeVenueCriteria1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MIC" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}MICIdentifier" maxOccurs="unbounded"/>
 *         <element name="AnyMIC" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}AnyMIC1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeVenueCriteria1Choice", propOrder = {
    "mic",
    "anyMIC"
})
public class SecuritiesTradeVenueCriteria1Choice {

    @XmlElement(name = "MIC")
    protected List<String> mic;
    @XmlElement(name = "AnyMIC")
    @XmlSchemaType(name = "string")
    protected AnyMIC1Code anyMIC;

    /**
     * Gets the value of the mic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the mic property.
     */
    public List<String> getMIC() {
        if (mic == null) {
            mic = new ArrayList<>();
        }
        return this.mic;
    }

    /**
     * Gets the value of the anyMIC property.
     * 
     * @return
     *     possible object is
     *     {@link AnyMIC1Code }
     *     
     */
    public AnyMIC1Code getAnyMIC() {
        return anyMIC;
    }

    /**
     * Sets the value of the anyMIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyMIC1Code }
     *     
     */
    public void setAnyMIC(AnyMIC1Code value) {
        this.anyMIC = value;
    }

}
