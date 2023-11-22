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

package org.jpos.iso20022.catp_012_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDepositedMedia2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMDepositedMedia2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cnt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Number" minOccurs="0"/>
 *         <element name="UnitVal" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="CdLineFrmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}CheckCodeLine1Code" minOccurs="0"/>
 *         <element name="CdLine" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Max70Text" minOccurs="0"/>
 *         <element name="ScnndVal" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CnfdncLvl" type="{urn:iso:std:iso:20022:tech:xsd:catp.012.001.01}Percentage" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositedMedia2", propOrder = {
    "cnt",
    "unitVal",
    "ccy",
    "cdLineFrmt",
    "cdLine",
    "scnndVal",
    "cnfdncLvl"
})
public class ATMDepositedMedia2 {

    @XmlElement(name = "Cnt")
    protected BigDecimal cnt;
    @XmlElement(name = "UnitVal")
    protected BigDecimal unitVal;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CdLineFrmt")
    @XmlSchemaType(name = "string")
    protected CheckCodeLine1Code cdLineFrmt;
    @XmlElement(name = "CdLine")
    protected String cdLine;
    @XmlElement(name = "ScnndVal")
    protected BigDecimal scnndVal;
    @XmlElement(name = "CnfdncLvl")
    protected BigDecimal cnfdncLvl;

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCnt(BigDecimal value) {
        this.cnt = value;
    }

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitVal(BigDecimal value) {
        this.unitVal = value;
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
     * Gets the value of the cdLineFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCodeLine1Code }
     *     
     */
    public CheckCodeLine1Code getCdLineFrmt() {
        return cdLineFrmt;
    }

    /**
     * Sets the value of the cdLineFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCodeLine1Code }
     *     
     */
    public void setCdLineFrmt(CheckCodeLine1Code value) {
        this.cdLineFrmt = value;
    }

    /**
     * Gets the value of the cdLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdLine() {
        return cdLine;
    }

    /**
     * Sets the value of the cdLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdLine(String value) {
        this.cdLine = value;
    }

    /**
     * Gets the value of the scnndVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScnndVal() {
        return scnndVal;
    }

    /**
     * Sets the value of the scnndVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScnndVal(BigDecimal value) {
        this.scnndVal = value;
    }

    /**
     * Gets the value of the cnfdncLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnfdncLvl() {
        return cnfdncLvl;
    }

    /**
     * Sets the value of the cnfdncLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCnfdncLvl(BigDecimal value) {
        this.cnfdncLvl = value;
    }

}
