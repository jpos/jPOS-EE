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

package org.jpos.iso20022.camt_042_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fund3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Fund3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:swift:xsd:camt.042.001.04}Max350Text" minOccurs="0"/>
 *         <element name="LglNttyIdr" type="{urn:swift:xsd:camt.042.001.04}LEIIdentifier" minOccurs="0"/>
 *         <element name="Id" type="{urn:swift:xsd:camt.042.001.04}OtherIdentification4" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:swift:xsd:camt.042.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="EstmtdTtlNAV" type="{urn:swift:xsd:camt.042.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrvsTtlNAV" type="{urn:swift:xsd:camt.042.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EstmtdTtlUnitsNb" type="{urn:swift:xsd:camt.042.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="PrvsTtlUnitsNb" type="{urn:swift:xsd:camt.042.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="EstmtdPctgOfFndTtlNAV" type="{urn:swift:xsd:camt.042.001.04}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fund3", propOrder = {
    "nm",
    "lglNttyIdr",
    "id",
    "ccy",
    "estmtdTtlNAV",
    "prvsTtlNAV",
    "estmtdTtlUnitsNb",
    "prvsTtlUnitsNb",
    "estmtdPctgOfFndTtlNAV"
})
public class Fund3 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;
    @XmlElement(name = "Id")
    protected OtherIdentification4 id;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "EstmtdTtlNAV")
    protected ActiveOrHistoricCurrencyAndAmount estmtdTtlNAV;
    @XmlElement(name = "PrvsTtlNAV")
    protected ActiveOrHistoricCurrencyAndAmount prvsTtlNAV;
    @XmlElement(name = "EstmtdTtlUnitsNb")
    protected FinancialInstrumentQuantity1 estmtdTtlUnitsNb;
    @XmlElement(name = "PrvsTtlUnitsNb")
    protected FinancialInstrumentQuantity1 prvsTtlUnitsNb;
    @XmlElement(name = "EstmtdPctgOfFndTtlNAV")
    protected BigDecimal estmtdPctgOfFndTtlNAV;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdentification4 }
     *     
     */
    public OtherIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdentification4 }
     *     
     */
    public void setId(OtherIdentification4 value) {
        this.id = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the estmtdTtlNAV property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getEstmtdTtlNAV() {
        return estmtdTtlNAV;
    }

    /**
     * Sets the value of the estmtdTtlNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setEstmtdTtlNAV(ActiveOrHistoricCurrencyAndAmount value) {
        this.estmtdTtlNAV = value;
    }

    /**
     * Gets the value of the prvsTtlNAV property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getPrvsTtlNAV() {
        return prvsTtlNAV;
    }

    /**
     * Sets the value of the prvsTtlNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setPrvsTtlNAV(ActiveOrHistoricCurrencyAndAmount value) {
        this.prvsTtlNAV = value;
    }

    /**
     * Gets the value of the estmtdTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getEstmtdTtlUnitsNb() {
        return estmtdTtlUnitsNb;
    }

    /**
     * Sets the value of the estmtdTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setEstmtdTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.estmtdTtlUnitsNb = value;
    }

    /**
     * Gets the value of the prvsTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getPrvsTtlUnitsNb() {
        return prvsTtlUnitsNb;
    }

    /**
     * Sets the value of the prvsTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setPrvsTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.prvsTtlUnitsNb = value;
    }

    /**
     * Gets the value of the estmtdPctgOfFndTtlNAV property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstmtdPctgOfFndTtlNAV() {
        return estmtdPctgOfFndTtlNAV;
    }

    /**
     * Sets the value of the estmtdPctgOfFndTtlNAV property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstmtdPctgOfFndTtlNAV(BigDecimal value) {
        this.estmtdPctgOfFndTtlNAV = value;
    }

}
