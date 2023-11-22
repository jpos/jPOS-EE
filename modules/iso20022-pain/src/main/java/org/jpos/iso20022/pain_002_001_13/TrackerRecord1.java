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

package org.jpos.iso20022.pain_002_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackerRecord1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TrackerRecord1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Agt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}ChargeBearerType1Code" minOccurs="0"/>
 *         <element name="ChrgsAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XchgRateData" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}CurrencyExchange13" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerRecord1", propOrder = {
    "agt",
    "chrgBr",
    "chrgsAmt",
    "xchgRateData"
})
public class TrackerRecord1 {

    @XmlElement(name = "Agt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 agt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsAmt")
    protected ActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "XchgRateData")
    protected CurrencyExchange13 xchgRateData;

    /**
     * Gets the value of the agt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAgt() {
        return agt;
    }

    /**
     * Sets the value of the agt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.agt = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setChrgsAmt(ActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
    }

    /**
     * Gets the value of the xchgRateData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange13 }
     *     
     */
    public CurrencyExchange13 getXchgRateData() {
        return xchgRateData;
    }

    /**
     * Sets the value of the xchgRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange13 }
     *     
     */
    public void setXchgRateData(CurrencyExchange13 value) {
        this.xchgRateData = value;
    }

}
