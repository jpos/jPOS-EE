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

package org.jpos.iso20022.auth_025_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentAttribute2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShipmentAttribute2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Conds" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}ShipmentCondition1Choice" minOccurs="0"/>
 *         <element name="XpctdDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}ISODate" minOccurs="0"/>
 *         <element name="CtryOfCntrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.025.001.03}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentAttribute2", propOrder = {
    "conds",
    "xpctdDt",
    "ctryOfCntrPty"
})
public class ShipmentAttribute2 {

    @XmlElement(name = "Conds")
    protected ShipmentCondition1Choice conds;
    @XmlElement(name = "XpctdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdDt;
    @XmlElement(name = "CtryOfCntrPty")
    protected String ctryOfCntrPty;

    /**
     * Gets the value of the conds property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCondition1Choice }
     *     
     */
    public ShipmentCondition1Choice getConds() {
        return conds;
    }

    /**
     * Sets the value of the conds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCondition1Choice }
     *     
     */
    public void setConds(ShipmentCondition1Choice value) {
        this.conds = value;
    }

    /**
     * Gets the value of the xpctdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdDt() {
        return xpctdDt;
    }

    /**
     * Sets the value of the xpctdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdDt(XMLGregorianCalendar value) {
        this.xpctdDt = value;
    }

    /**
     * Gets the value of the ctryOfCntrPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfCntrPty() {
        return ctryOfCntrPty;
    }

    /**
     * Sets the value of the ctryOfCntrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfCntrPty(String value) {
        this.ctryOfCntrPty = value;
    }

}
