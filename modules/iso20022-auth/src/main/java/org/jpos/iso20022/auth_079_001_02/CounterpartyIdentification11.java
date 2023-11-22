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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyIdentification11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyIdentification11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice"/>
 *         <element name="Ntr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CounterpartyTradeNature7Choice" minOccurs="0"/>
 *         <element name="Brnch" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Branch5Choice" minOccurs="0"/>
 *         <element name="Sd" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CollateralRole1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification11", propOrder = {
    "id",
    "ntr",
    "brnch",
    "sd"
})
public class CounterpartyIdentification11 {

    @XmlElement(name = "Id", required = true)
    protected OrganisationIdentification15Choice id;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature7Choice ntr;
    @XmlElement(name = "Brnch")
    protected Branch5Choice brnch;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code sd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setId(OrganisationIdentification15Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature7Choice }
     *     
     */
    public CounterpartyTradeNature7Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature7Choice }
     *     
     */
    public void setNtr(CounterpartyTradeNature7Choice value) {
        this.ntr = value;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch5Choice }
     *     
     */
    public Branch5Choice getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch5Choice }
     *     
     */
    public void setBrnch(Branch5Choice value) {
        this.brnch = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setSd(CollateralRole1Code value) {
        this.sd = value;
    }

}
