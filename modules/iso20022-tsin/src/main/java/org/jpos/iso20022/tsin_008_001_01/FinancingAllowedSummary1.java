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

package org.jpos.iso20022.tsin_008_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingAllowedSummary1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancingAllowedSummary1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FincdItmNb" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}Number"/>
 *         <element name="TtlAccptdItmsAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="ApldPctg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="TtlFincdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="FincgDtDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}FinancingDateDetails1" minOccurs="0"/>
 *         <element name="CdtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}CashAccount7" minOccurs="0"/>
 *         <element name="FincgAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.008.001.01}CashAccount7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingAllowedSummary1", propOrder = {
    "fincdItmNb",
    "ttlAccptdItmsAmt",
    "apldPctg",
    "ttlFincdAmt",
    "fincgDtDtls",
    "cdtAcct",
    "fincgAcct"
})
public class FinancingAllowedSummary1 {

    @XmlElement(name = "FincdItmNb", required = true)
    protected BigDecimal fincdItmNb;
    @XmlElement(name = "TtlAccptdItmsAmt", required = true)
    protected ActiveCurrencyAndAmount ttlAccptdItmsAmt;
    @XmlElement(name = "ApldPctg")
    protected BigDecimal apldPctg;
    @XmlElement(name = "TtlFincdAmt", required = true)
    protected ActiveCurrencyAndAmount ttlFincdAmt;
    @XmlElement(name = "FincgDtDtls")
    protected FinancingDateDetails1 fincgDtDtls;
    @XmlElement(name = "CdtAcct")
    protected CashAccount7 cdtAcct;
    @XmlElement(name = "FincgAcct")
    protected CashAccount7 fincgAcct;

    /**
     * Gets the value of the fincdItmNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFincdItmNb() {
        return fincdItmNb;
    }

    /**
     * Sets the value of the fincdItmNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFincdItmNb(BigDecimal value) {
        this.fincdItmNb = value;
    }

    /**
     * Gets the value of the ttlAccptdItmsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAccptdItmsAmt() {
        return ttlAccptdItmsAmt;
    }

    /**
     * Sets the value of the ttlAccptdItmsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAccptdItmsAmt(ActiveCurrencyAndAmount value) {
        this.ttlAccptdItmsAmt = value;
    }

    /**
     * Gets the value of the apldPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApldPctg() {
        return apldPctg;
    }

    /**
     * Sets the value of the apldPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApldPctg(BigDecimal value) {
        this.apldPctg = value;
    }

    /**
     * Gets the value of the ttlFincdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlFincdAmt() {
        return ttlFincdAmt;
    }

    /**
     * Sets the value of the ttlFincdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlFincdAmt(ActiveCurrencyAndAmount value) {
        this.ttlFincdAmt = value;
    }

    /**
     * Gets the value of the fincgDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDateDetails1 }
     *     
     */
    public FinancingDateDetails1 getFincgDtDtls() {
        return fincgDtDtls;
    }

    /**
     * Sets the value of the fincgDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDateDetails1 }
     *     
     */
    public void setFincgDtDtls(FinancingDateDetails1 value) {
        this.fincgDtDtls = value;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setCdtAcct(CashAccount7 value) {
        this.cdtAcct = value;
    }

    /**
     * Gets the value of the fincgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getFincgAcct() {
        return fincgAcct;
    }

    /**
     * Sets the value of the fincgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setFincgAcct(CashAccount7 value) {
        this.fincgAcct = value;
    }

}
