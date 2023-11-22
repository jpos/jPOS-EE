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

package org.jpos.iso20022.sese_001_001_09;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tax35 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Tax35">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}TaxType3Choice"/>
 *         <element name="ApldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ActiveCurrencyAndAmount"/>
 *         <element name="ApldRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}PercentageRate" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}CountryCode" minOccurs="0"/>
 *         <element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}PartyIdentification139" minOccurs="0"/>
 *         <element name="TaxClctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}TaxCalculationInformation10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax35", propOrder = {
    "tp",
    "apldAmt",
    "apldRate",
    "ctry",
    "rcptId",
    "taxClctnDtls"
})
public class Tax35 {

    @XmlElement(name = "Tp", required = true)
    protected TaxType3Choice tp;
    @XmlElement(name = "ApldAmt", required = true)
    protected ActiveCurrencyAndAmount apldAmt;
    @XmlElement(name = "ApldRate")
    protected BigDecimal apldRate;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "RcptId")
    protected PartyIdentification139 rcptId;
    @XmlElement(name = "TaxClctnDtls")
    protected TaxCalculationInformation10 taxClctnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType3Choice }
     *     
     */
    public TaxType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType3Choice }
     *     
     */
    public void setTp(TaxType3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the apldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getApldAmt() {
        return apldAmt;
    }

    /**
     * Sets the value of the apldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setApldAmt(ActiveCurrencyAndAmount value) {
        this.apldAmt = value;
    }

    /**
     * Gets the value of the apldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApldRate() {
        return apldRate;
    }

    /**
     * Sets the value of the apldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApldRate(BigDecimal value) {
        this.apldRate = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setRcptId(PartyIdentification139 value) {
        this.rcptId = value;
    }

    /**
     * Gets the value of the taxClctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationInformation10 }
     *     
     */
    public TaxCalculationInformation10 getTaxClctnDtls() {
        return taxClctnDtls;
    }

    /**
     * Sets the value of the taxClctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationInformation10 }
     *     
     */
    public void setTaxClctnDtls(TaxCalculationInformation10 value) {
        this.taxClctnDtls = value;
    }

}
