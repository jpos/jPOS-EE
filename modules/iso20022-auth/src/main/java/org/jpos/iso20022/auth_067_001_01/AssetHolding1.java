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

package org.jpos.iso20022.auth_067_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetHolding1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetHolding1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PstHrcutVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}ActiveCurrencyAnd24Amount"/>
 *         <element name="AsstTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}AssetHolding1Choice"/>
 *         <element name="CollRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}CollateralAccountType3Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetHolding1", propOrder = {
    "pstHrcutVal",
    "asstTp",
    "collRqrmnt"
})
public class AssetHolding1 {

    @XmlElement(name = "PstHrcutVal", required = true)
    protected ActiveCurrencyAnd24Amount pstHrcutVal;
    @XmlElement(name = "AsstTp", required = true)
    protected AssetHolding1Choice asstTp;
    @XmlElement(name = "CollRqrmnt", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralAccountType3Code collRqrmnt;

    /**
     * Gets the value of the pstHrcutVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getPstHrcutVal() {
        return pstHrcutVal;
    }

    /**
     * Sets the value of the pstHrcutVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public void setPstHrcutVal(ActiveCurrencyAnd24Amount value) {
        this.pstHrcutVal = value;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetHolding1Choice }
     *     
     */
    public AssetHolding1Choice getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetHolding1Choice }
     *     
     */
    public void setAsstTp(AssetHolding1Choice value) {
        this.asstTp = value;
    }

    /**
     * Gets the value of the collRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccountType3Code }
     *     
     */
    public CollateralAccountType3Code getCollRqrmnt() {
        return collRqrmnt;
    }

    /**
     * Sets the value of the collRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccountType3Code }
     *     
     */
    public void setCollRqrmnt(CollateralAccountType3Code value) {
        this.collRqrmnt = value;
    }

}
