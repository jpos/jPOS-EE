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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeEvent6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivativeEvent6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}DerivativeEventType3Code" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EventIdentifier1Choice" minOccurs="0"/>
 *         <element name="TmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="AmdmntInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeEvent6", propOrder = {
    "tp",
    "id",
    "tmStmp",
    "amdmntInd"
})
public class DerivativeEvent6 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected DerivativeEventType3Code tp;
    @XmlElement(name = "Id")
    protected EventIdentifier1Choice id;
    @XmlElement(name = "TmStmp")
    protected DateAndDateTime2Choice tmStmp;
    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeEventType3Code }
     *     
     */
    public DerivativeEventType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeEventType3Code }
     *     
     */
    public void setTp(DerivativeEventType3Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link EventIdentifier1Choice }
     *     
     */
    public EventIdentifier1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventIdentifier1Choice }
     *     
     */
    public void setId(EventIdentifier1Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setTmStmp(DateAndDateTime2Choice value) {
        this.tmStmp = value;
    }

    /**
     * Gets the value of the amdmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
    }

}
