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

package org.jpos.iso20022.auth_069_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAttributes90 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes90">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ntnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UnitVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="IndxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}GenericIdentification168"/>
 *         <element name="IndxUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Max35Text"/>
 *         <element name="IntrstRateTerms" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}InterestComputationMethod2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes90", propOrder = {
    "ntnl",
    "unitVal",
    "indxId",
    "indxUnit",
    "intrstRateTerms"
})
public class FinancialInstrumentAttributes90 {

    @XmlElement(name = "Ntnl")
    protected ActiveCurrencyAndAmount ntnl;
    @XmlElement(name = "UnitVal", required = true)
    protected ActiveCurrencyAndAmount unitVal;
    @XmlElement(name = "IndxId", required = true)
    protected GenericIdentification168 indxId;
    @XmlElement(name = "IndxUnit", required = true)
    protected String indxUnit;
    @XmlElement(name = "IntrstRateTerms")
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code intrstRateTerms;

    /**
     * Gets the value of the ntnl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnl() {
        return ntnl;
    }

    /**
     * Sets the value of the ntnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNtnl(ActiveCurrencyAndAmount value) {
        this.ntnl = value;
    }

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setUnitVal(ActiveCurrencyAndAmount value) {
        this.unitVal = value;
    }

    /**
     * Gets the value of the indxId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getIndxId() {
        return indxId;
    }

    /**
     * Sets the value of the indxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public void setIndxId(GenericIdentification168 value) {
        this.indxId = value;
    }

    /**
     * Gets the value of the indxUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndxUnit() {
        return indxUnit;
    }

    /**
     * Sets the value of the indxUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndxUnit(String value) {
        this.indxUnit = value;
    }

    /**
     * Gets the value of the intrstRateTerms property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestComputationMethod2Code getIntrstRateTerms() {
        return intrstRateTerms;
    }

    /**
     * Sets the value of the intrstRateTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public void setIntrstRateTerms(InterestComputationMethod2Code value) {
        this.intrstRateTerms = value;
    }

}
