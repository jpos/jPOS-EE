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

package org.jpos.iso20022.seev_031_002_13;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAttributes117 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes117">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}SecurityIdentification20"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RestrictedFINDecimalNumber" minOccurs="0"/>
 *         <element name="RnncblEntitlmntStsTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RenounceableEntitlementStatusTypeFormat4Choice" minOccurs="0"/>
 *         <element name="FrctnDspstn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}FractionDispositionType32Choice" minOccurs="0"/>
 *         <element name="IntrmdtSctiesToUndrlygRatio" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}QuantityToQuantityRatio2" minOccurs="0"/>
 *         <element name="MktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}AmountPrice4" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}DateFormat41Choice"/>
 *         <element name="PstngDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}DateFormat41Choice"/>
 *         <element name="TradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period11" minOccurs="0"/>
 *         <element name="UinstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}BalanceFormat14Choice" minOccurs="0"/>
 *         <element name="InstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}BalanceFormat14Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes117", propOrder = {
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
public class FinancialInstrumentAttributes117 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification20 sctyId;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "RnncblEntitlmntStsTp")
    protected RenounceableEntitlementStatusTypeFormat4Choice rnncblEntitlmntStsTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType32Choice frctnDspstn;
    @XmlElement(name = "IntrmdtSctiesToUndrlygRatio")
    protected QuantityToQuantityRatio2 intrmdtSctiesToUndrlygRatio;
    @XmlElement(name = "MktPric")
    protected AmountPrice4 mktPric;
    @XmlElement(name = "XpryDt", required = true)
    protected DateFormat41Choice xpryDt;
    @XmlElement(name = "PstngDt", required = true)
    protected DateFormat41Choice pstngDt;
    @XmlElement(name = "TradgPrd")
    protected Period11 tradgPrd;
    @XmlElement(name = "UinstdBal")
    protected BalanceFormat14Choice uinstdBal;
    @XmlElement(name = "InstdBal")
    protected BalanceFormat14Choice instdBal;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public void setSctyId(SecurityIdentification20 value) {
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
     *     {@link RenounceableEntitlementStatusTypeFormat4Choice }
     *     
     */
    public RenounceableEntitlementStatusTypeFormat4Choice getRnncblEntitlmntStsTp() {
        return rnncblEntitlmntStsTp;
    }

    /**
     * Sets the value of the rnncblEntitlmntStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenounceableEntitlementStatusTypeFormat4Choice }
     *     
     */
    public void setRnncblEntitlmntStsTp(RenounceableEntitlementStatusTypeFormat4Choice value) {
        this.rnncblEntitlmntStsTp = value;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType32Choice }
     *     
     */
    public FractionDispositionType32Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType32Choice }
     *     
     */
    public void setFrctnDspstn(FractionDispositionType32Choice value) {
        this.frctnDspstn = value;
    }

    /**
     * Gets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public QuantityToQuantityRatio2 getIntrmdtSctiesToUndrlygRatio() {
        return intrmdtSctiesToUndrlygRatio;
    }

    /**
     * Sets the value of the intrmdtSctiesToUndrlygRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public void setIntrmdtSctiesToUndrlygRatio(QuantityToQuantityRatio2 value) {
        this.intrmdtSctiesToUndrlygRatio = value;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice4 }
     *     
     */
    public AmountPrice4 getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice4 }
     *     
     */
    public void setMktPric(AmountPrice4 value) {
        this.mktPric = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setXpryDt(DateFormat41Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat41Choice }
     *     
     */
    public DateFormat41Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat41Choice }
     *     
     */
    public void setPstngDt(DateFormat41Choice value) {
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
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setUinstdBal(BalanceFormat14Choice value) {
        this.uinstdBal = value;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public BalanceFormat14Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat14Choice }
     *     
     */
    public void setInstdBal(BalanceFormat14Choice value) {
        this.instdBal = value;
    }

}
