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

package org.jpos.iso20022.semt_002_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateBalancePerSafekeepingPlace39 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AggregateBalancePerSafekeepingPlace39">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}SafeKeepingPlace3"/>
 *         <element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}MarketIdentification3Choice" minOccurs="0"/>
 *         <element name="Pldgee" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Pledgee3" minOccurs="0"/>
 *         <element name="AggtBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Balance17"/>
 *         <element name="AvlblBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Balance18" minOccurs="0"/>
 *         <element name="NotAvlblBal" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}BalanceQuantity14Choice" minOccurs="0"/>
 *         <element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}PriceInformation20" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}ForeignExchangeTerms34" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Number" minOccurs="0"/>
 *         <element name="AcctBaseCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}BalanceAmounts3" minOccurs="0"/>
 *         <element name="InstrmCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}BalanceAmounts3" minOccurs="0"/>
 *         <element name="QtyBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}QuantityBreakdown57" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}ExposureType22Choice" minOccurs="0"/>
 *         <element name="BalBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}SubBalanceInformation20" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlBalBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}AdditionalBalanceInformation20" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="HldgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalancePerSafekeepingPlace39", propOrder = {
    "sfkpgPlc",
    "plcOfListg",
    "pldgee",
    "aggtBal",
    "avlblBal",
    "notAvlblBal",
    "pricDtls",
    "fxDtls",
    "daysAcrd",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "qtyBrkdwn",
    "xpsrTp",
    "balBrkdwn",
    "addtlBalBrkdwn",
    "hldgAddtlDtls"
})
public class AggregateBalancePerSafekeepingPlace39 {

    @XmlElement(name = "SfkpgPlc", required = true)
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification3Choice plcOfListg;
    @XmlElement(name = "Pldgee")
    protected Pledgee3 pldgee;
    @XmlElement(name = "AggtBal", required = true)
    protected Balance17 aggtBal;
    @XmlElement(name = "AvlblBal")
    protected Balance18 avlblBal;
    @XmlElement(name = "NotAvlblBal")
    protected BalanceQuantity14Choice notAvlblBal;
    @XmlElement(name = "PricDtls")
    protected List<PriceInformation20> pricDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms34> fxDtls;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "AcctBaseCcyAmts")
    protected BalanceAmounts3 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts3 instrmCcyAmts;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown57> qtyBrkdwn;
    @XmlElement(name = "XpsrTp")
    protected ExposureType22Choice xpsrTp;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation20> balBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwn")
    protected List<AdditionalBalanceInformation20> addtlBalBrkdwn;
    @XmlElement(name = "HldgAddtlDtls")
    protected String hldgAddtlDtls;

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public MarketIdentification3Choice getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public void setPlcOfListg(MarketIdentification3Choice value) {
        this.plcOfListg = value;
    }

    /**
     * Gets the value of the pldgee property.
     * 
     * @return
     *     possible object is
     *     {@link Pledgee3 }
     *     
     */
    public Pledgee3 getPldgee() {
        return pldgee;
    }

    /**
     * Sets the value of the pldgee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pledgee3 }
     *     
     */
    public void setPldgee(Pledgee3 value) {
        this.pldgee = value;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance17 }
     *     
     */
    public Balance17 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance17 }
     *     
     */
    public void setAggtBal(Balance17 value) {
        this.aggtBal = value;
    }

    /**
     * Gets the value of the avlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance18 }
     *     
     */
    public Balance18 getAvlblBal() {
        return avlblBal;
    }

    /**
     * Sets the value of the avlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance18 }
     *     
     */
    public void setAvlblBal(Balance18 value) {
        this.avlblBal = value;
    }

    /**
     * Gets the value of the notAvlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public BalanceQuantity14Choice getNotAvlblBal() {
        return notAvlblBal;
    }

    /**
     * Sets the value of the notAvlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public void setNotAvlblBal(BalanceQuantity14Choice value) {
        this.notAvlblBal = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceInformation20 }
     * 
     * 
     * @return
     *     The value of the pricDtls property.
     */
    public List<PriceInformation20> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms34 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms34> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the daysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAcrd() {
        return daysAcrd;
    }

    /**
     * Sets the value of the daysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public BalanceAmounts3 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public void setAcctBaseCcyAmts(BalanceAmounts3 value) {
        this.acctBaseCcyAmts = value;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public BalanceAmounts3 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public void setInstrmCcyAmts(BalanceAmounts3 value) {
        this.instrmCcyAmts = value;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown57 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown57> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType22Choice }
     *     
     */
    public ExposureType22Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType22Choice }
     *     
     */
    public void setXpsrTp(ExposureType22Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation20 }
     * 
     * 
     * @return
     *     The value of the balBrkdwn property.
     */
    public List<SubBalanceInformation20> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<>();
        }
        return this.balBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBalBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation20 }
     * 
     * 
     * @return
     *     The value of the addtlBalBrkdwn property.
     */
    public List<AdditionalBalanceInformation20> getAddtlBalBrkdwn() {
        if (addtlBalBrkdwn == null) {
            addtlBalBrkdwn = new ArrayList<>();
        }
        return this.addtlBalBrkdwn;
    }

    /**
     * Gets the value of the hldgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgAddtlDtls() {
        return hldgAddtlDtls;
    }

    /**
     * Sets the value of the hldgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHldgAddtlDtls(String value) {
        this.hldgAddtlDtls = value;
    }

}
