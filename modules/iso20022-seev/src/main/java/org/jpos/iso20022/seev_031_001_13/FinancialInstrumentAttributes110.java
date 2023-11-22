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

package org.jpos.iso20022.seev_031_001_13;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAttributes110 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes110">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}SecurityIdentification19"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DecimalNumber" minOccurs="0"/>
 *         <element name="RnncblEntitlmntStsTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RenounceableEntitlementStatusTypeFormat3Choice" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FractionDispositionType25Choice" minOccurs="0"/>
 *         <element name="IntrmdtSctiesToUndrlygRatio" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}QuantityToQuantityRatio1" minOccurs="0"/>
 *         <element name="MktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}AmountPrice2" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice"/>
 *         <element name="PstngDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat30Choice"/>
 *         <element name="TradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}Period11" minOccurs="0"/>
 *         <element name="UinstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}BalanceFormat11Choice" minOccurs="0"/>
 *         <element name="InstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}BalanceFormat11Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes110", propOrder = {
    "sctyId",
    "qty",
    "rnncblEntitlmntStsTp",
    "frctnDspstn",
    "intrmdtSctiesToUndrlygRatio",
    "mktPric",
    "xpryDt",
    "pstngDt",
    "tradgPrd",
    "uinstdBal",
    "instdBal"
})
public class FinancialInstrumentAttributes110 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification19 sctyId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat3Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType25Choice frctnDspstn;
    @XmlElement(name = "IntrmdtSctiesToUndrlygRatio")
    protected QuantityToQuantityRatio1 intrmdtSctiesToUndrlygRatio;
    @XmlElement(name = "MktPric")
    protected AmountPrice2 mktPric;
    @XmlElement(name = "XpryDt", required = true)
    protected DateFormat30Choice xpryDt;
    @XmlElement(name = "PstngDt", required = true)
    protected DateFormat30Choice pstngDt;
    @XmlElement(name = "TradgPrd")
    protected Period11 tradgPrd;
    @XmlElement(name = "UinstdBal")
    protected BalanceFormat11Choice uinstdBal;
    @XmlElement(name = "InstdBal")
    protected BalanceFormat11Choice instdBal;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setSctyId(SecurityIdentification19 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the rnncblEntitlmntStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat3Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat3Choice }
     *     
     */
    public void setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat3Choice value) {
        this.rnncblEntitlmntStsTp = value;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType25Choice }
     *     
     */
    public FractionDispositionType25Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType25Choice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType25Choice value) {
        this.frctnDspstn = value;
    }

    /**
     * Gets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getIntrmdtSctiesToUndrlygRatio() {
        return intrmdtSctiesToUndrlygRatio;
    }

    /**
     * Sets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public void setIntrmdtSctiesToUndrlygRatio(QuantityToQuantityRatio1 value) {
        this.intrmdtSctiesToUndrlygRatio = value;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice2 }
     *     
     */
    public AmountPrice2 getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice2 }
     *     
     */
    public void setMktPric(AmountPrice2 value) {
        this.mktPric = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setXpryDt(DateFormat30Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setPstngDt(DateFormat30Choice value) {
        this.pstngDt = value;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setTradgPrd(Period11 value) {
        this.tradgPrd = value;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public void setUinstdBal(BalanceFormat11Choice value) {
        this.uinstdBal = value;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public BalanceFormat11Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat11Choice }
     *     
     */
    public void setInstdBal(BalanceFormat11Choice value) {
        this.instdBal = value;
    }

}
