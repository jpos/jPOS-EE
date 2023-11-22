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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractForDifference2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractForDifference2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UndrlygTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}UnderlyingContractForDifferenceType3Code"/>
 *         <element name="NtnlCcy1" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="NtnlCcy2" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractForDifference2", propOrder = {
    "undrlygTp",
    "ntnlCcy1",
    "ntnlCcy2"
})
public class ContractForDifference2 {

    @XmlElement(name = "UndrlygTp", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingContractForDifferenceType3Code undrlygTp;
    @XmlElement(name = "NtnlCcy1")
    protected String ntnlCcy1;
    @XmlElement(name = "NtnlCcy2")
    protected String ntnlCcy2;

    /**
     * Gets the value of the undrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingContractForDifferenceType3Code }
     *     
     */
    public UnderlyingContractForDifferenceType3Code getUndrlygTp() {
        return undrlygTp;
    }

    /**
     * Sets the value of the undrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingContractForDifferenceType3Code }
     *     
     */
    public void setUndrlygTp(UnderlyingContractForDifferenceType3Code value) {
        this.undrlygTp = value;
    }

    /**
     * Gets the value of the ntnlCcy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy1() {
        return ntnlCcy1;
    }

    /**
     * Sets the value of the ntnlCcy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy1(String value) {
        this.ntnlCcy1 = value;
    }

    /**
     * Gets the value of the ntnlCcy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy2() {
        return ntnlCcy2;
    }

    /**
     * Sets the value of the ntnlCcy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy2(String value) {
        this.ntnlCcy2 = value;
    }

}
