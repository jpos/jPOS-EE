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

package org.jpos.iso20022.camt_010_001_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Limit7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Limit7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}Amount2Choice"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}CreditDebitCode" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}LimitStatus1Code" minOccurs="0"/>
 *         <element name="StartDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="UsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}Amount2Choice" minOccurs="0"/>
 *         <element name="UsdAmtCdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}CreditDebitCode" minOccurs="0"/>
 *         <element name="UsdPctg" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}PercentageRate" minOccurs="0"/>
 *         <element name="RmngAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.010.001.08}Amount2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Limit7", propOrder = {
    "amt",
    "cdtDbtInd",
    "sts",
    "startDtTm",
    "usdAmt",
    "usdAmtCdtDbtInd",
    "usdPctg",
    "rmngAmt"
})
public class Limit7 {

    @XmlElement(name = "Amt", required = true)
    protected Amount2Choice amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected LimitStatus1Code sts;
    @XmlElement(name = "StartDtTm")
    protected DateAndDateTime2Choice startDtTm;
    @XmlElement(name = "UsdAmt")
    protected Amount2Choice usdAmt;
    @XmlElement(name = "UsdAmtCdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode usdAmtCdtDbtInd;
    @XmlElement(name = "UsdPctg")
    protected BigDecimal usdPctg;
    @XmlElement(name = "RmngAmt")
    protected Amount2Choice rmngAmt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setAmt(Amount2Choice value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link LimitStatus1Code }
     *     
     */
    public LimitStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitStatus1Code }
     *     
     */
    public void setSts(LimitStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setStartDtTm(DateAndDateTime2Choice value) {
        this.startDtTm = value;
    }

    /**
     * Gets the value of the usdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getUsdAmt() {
        return usdAmt;
    }

    /**
     * Sets the value of the usdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setUsdAmt(Amount2Choice value) {
        this.usdAmt = value;
    }

    /**
     * Gets the value of the usdAmtCdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getUsdAmtCdtDbtInd() {
        return usdAmtCdtDbtInd;
    }

    /**
     * Sets the value of the usdAmtCdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setUsdAmtCdtDbtInd(CreditDebitCode value) {
        this.usdAmtCdtDbtInd = value;
    }

    /**
     * Gets the value of the usdPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsdPctg() {
        return usdPctg;
    }

    /**
     * Sets the value of the usdPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsdPctg(BigDecimal value) {
        this.usdPctg = value;
    }

    /**
     * Gets the value of the rmngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getRmngAmt() {
        return rmngAmt;
    }

    /**
     * Sets the value of the rmngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setRmngAmt(Amount2Choice value) {
        this.rmngAmt = value;
    }

}
