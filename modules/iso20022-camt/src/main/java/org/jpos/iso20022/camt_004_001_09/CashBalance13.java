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

package org.jpos.iso20022.camt_004_001_09;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashBalance13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashBalance13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}ImpliedCurrencyAndAmount"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}CreditDebitCode"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BalanceType11Choice" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BalanceStatus1Code" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="PrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="NbOfPmts" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Number" minOccurs="0"/>
 *         <element name="RstrctnTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BalanceRestrictionType1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance13", propOrder = {
    "amt",
    "cdtDbtInd",
    "tp",
    "sts",
    "valDt",
    "prcgDt",
    "nbOfPmts",
    "rstrctnTp"
})
public class CashBalance13 {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Tp")
    protected BalanceType11Choice tp;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected BalanceStatus1Code sts;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTime2Choice prcgDt;
    @XmlElement(name = "NbOfPmts")
    protected BigDecimal nbOfPmts;
    @XmlElement(name = "RstrctnTp")
    protected BalanceRestrictionType1 rstrctnTp;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
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
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType11Choice }
     *     
     */
    public BalanceType11Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType11Choice }
     *     
     */
    public void setTp(BalanceType11Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceStatus1Code }
     *     
     */
    public BalanceStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceStatus1Code }
     *     
     */
    public void setSts(BalanceStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setPrcgDt(DateAndDateTime2Choice value) {
        this.prcgDt = value;
    }

    /**
     * Gets the value of the nbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfPmts() {
        return nbOfPmts;
    }

    /**
     * Sets the value of the nbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfPmts(BigDecimal value) {
        this.nbOfPmts = value;
    }

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceRestrictionType1 }
     *     
     */
    public BalanceRestrictionType1 getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceRestrictionType1 }
     *     
     */
    public void setRstrctnTp(BalanceRestrictionType1 value) {
        this.rstrctnTp = value;
    }

}
