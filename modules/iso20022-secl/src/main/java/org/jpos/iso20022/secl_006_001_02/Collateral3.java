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

package org.jpos.iso20022.secl_006_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Collateral3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Collateral3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PstHrcutVal" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}ActiveCurrencyAndAmount"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}ActiveCurrencyAndAmount"/>
 *         <element name="CollTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}CollateralType2Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral3", propOrder = {
    "pstHrcutVal",
    "mktVal",
    "collTp"
})
public class Collateral3 {

    @XmlElement(name = "PstHrcutVal", required = true)
    protected ActiveCurrencyAndAmount pstHrcutVal;
    @XmlElement(name = "MktVal", required = true)
    protected ActiveCurrencyAndAmount mktVal;
    @XmlElement(name = "CollTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralType2Code collTp;

    /**
     * Gets the value of the pstHrcutVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPstHrcutVal() {
        return pstHrcutVal;
    }

    /**
     * Sets the value of the pstHrcutVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPstHrcutVal(ActiveCurrencyAndAmount value) {
        this.pstHrcutVal = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMktVal(ActiveCurrencyAndAmount value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType2Code }
     *     
     */
    public CollateralType2Code getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType2Code }
     *     
     */
    public void setCollTp(CollateralType2Code value) {
        this.collTp = value;
    }

}
