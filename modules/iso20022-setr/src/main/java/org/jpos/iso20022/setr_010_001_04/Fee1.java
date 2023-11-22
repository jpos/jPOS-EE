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

package org.jpos.iso20022.setr_010_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fee1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Fee1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}ChargeType5Choice"/>
 *         <element name="Bsis" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}ChargeBasis2Choice" minOccurs="0"/>
 *         <element name="StdAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StdRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="DscntDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}ChargeOrCommissionDiscount1" minOccurs="0"/>
 *         <element name="ReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ReqdRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="NonStdSLARef" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}Max35Text" minOccurs="0"/>
 *         <element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}PartyIdentification113" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee1", propOrder = {
    "tp",
    "bsis",
    "stdAmt",
    "stdRate",
    "dscntDtls",
    "reqdAmt",
    "reqdRate",
    "nonStdSLARef",
    "rcptId"
})
public class Fee1 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType5Choice tp;
    @XmlElement(name = "Bsis")
    protected ChargeBasis2Choice bsis;
    @XmlElement(name = "StdAmt")
    protected ActiveCurrencyAndAmount stdAmt;
    @XmlElement(name = "StdRate")
    protected BigDecimal stdRate;
    @XmlElement(name = "DscntDtls")
    protected ChargeOrCommissionDiscount1 dscntDtls;
    @XmlElement(name = "ReqdAmt")
    protected ActiveCurrencyAndAmount reqdAmt;
    @XmlElement(name = "ReqdRate")
    protected BigDecimal reqdRate;
    @XmlElement(name = "NonStdSLARef")
    protected String nonStdSLARef;
    @XmlElement(name = "RcptId")
    protected PartyIdentification113 rcptId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType5Choice }
     *     
     */
    public ChargeType5Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType5Choice }
     *     
     */
    public void setTp(ChargeType5Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public ChargeBasis2Choice getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public void setBsis(ChargeBasis2Choice value) {
        this.bsis = value;
    }

    /**
     * Gets the value of the stdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStdAmt() {
        return stdAmt;
    }

    /**
     * Sets the value of the stdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStdAmt(ActiveCurrencyAndAmount value) {
        this.stdAmt = value;
    }

    /**
     * Gets the value of the stdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdRate() {
        return stdRate;
    }

    /**
     * Sets the value of the stdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdRate(BigDecimal value) {
        this.stdRate = value;
    }

    /**
     * Gets the value of the dscntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeOrCommissionDiscount1 }
     *     
     */
    public ChargeOrCommissionDiscount1 getDscntDtls() {
        return dscntDtls;
    }

    /**
     * Sets the value of the dscntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeOrCommissionDiscount1 }
     *     
     */
    public void setDscntDtls(ChargeOrCommissionDiscount1 value) {
        this.dscntDtls = value;
    }

    /**
     * Gets the value of the reqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getReqdAmt() {
        return reqdAmt;
    }

    /**
     * Sets the value of the reqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setReqdAmt(ActiveCurrencyAndAmount value) {
        this.reqdAmt = value;
    }

    /**
     * Gets the value of the reqdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqdRate() {
        return reqdRate;
    }

    /**
     * Sets the value of the reqdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReqdRate(BigDecimal value) {
        this.reqdRate = value;
    }

    /**
     * Gets the value of the nonStdSLARef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSLARef() {
        return nonStdSLARef;
    }

    /**
     * Sets the value of the nonStdSLARef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStdSLARef(String value) {
        this.nonStdSLARef = value;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setRcptId(PartyIdentification113 value) {
        this.rcptId = value;
    }

}
