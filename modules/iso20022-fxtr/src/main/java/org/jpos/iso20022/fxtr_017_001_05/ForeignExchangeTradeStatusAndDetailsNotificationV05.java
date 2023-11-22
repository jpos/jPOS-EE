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

package org.jpos.iso20022.fxtr_017_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTradeStatusAndDetailsNotificationV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTradeStatusAndDetailsNotificationV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsDtls" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}TradeData14"/>
 *         <element name="TradInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}TradeAgreement12"/>
 *         <element name="TradgSdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}TradePartyIdentification8"/>
 *         <element name="CtrPtySdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}TradePartyIdentification8"/>
 *         <element name="TradAmts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}AmountsAndValueDate6"/>
 *         <element name="AgrdRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}AgreedRate3"/>
 *         <element name="NDFConds" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}NonDeliverableForwardConditions2" minOccurs="0"/>
 *         <element name="TradgSdSttlmInstrs" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}SettlementParties120" minOccurs="0"/>
 *         <element name="CtrPtySdSttlmInstrs" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}SettlementParties120" minOccurs="0"/>
 *         <element name="GnlInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}GeneralInformation8" minOccurs="0"/>
 *         <element name="SpltTradInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}SplitTradeDetails4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}RegulatoryReporting7" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeStatusAndDetailsNotificationV05", propOrder = {
    "stsDtls",
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "agrdRate",
    "ndfConds",
    "tradgSdSttlmInstrs",
    "ctrPtySdSttlmInstrs",
    "gnlInf",
    "spltTradInf",
    "rgltryRptg",
    "splmtryData"
})
public class ForeignExchangeTradeStatusAndDetailsNotificationV05 {

    @XmlElement(name = "StsDtls", required = true)
    protected TradeData14 stsDtls;
    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement12 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification8 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification8 ctrPtySdId;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate6 tradAmts;
    @XmlElement(name = "AgrdRate", required = true)
    protected AgreedRate3 agrdRate;
    @XmlElement(name = "NDFConds")
    protected NonDeliverableForwardConditions2 ndfConds;
    @XmlElement(name = "TradgSdSttlmInstrs")
    protected SettlementParties120 tradgSdSttlmInstrs;
    @XmlElement(name = "CtrPtySdSttlmInstrs")
    protected SettlementParties120 ctrPtySdSttlmInstrs;
    @XmlElement(name = "GnlInf")
    protected GeneralInformation8 gnlInf;
    @XmlElement(name = "SpltTradInf")
    protected List<SplitTradeDetails4> spltTradInf;
    @XmlElement(name = "RgltryRptg")
    protected RegulatoryReporting7 rgltryRptg;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData14 }
     *     
     */
    public TradeData14 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData14 }
     *     
     */
    public void setStsDtls(TradeData14 value) {
        this.stsDtls = value;
    }

    /**
     * Gets the value of the tradInf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement12 }
     *     
     */
    public TradeAgreement12 getTradInf() {
        return tradInf;
    }

    /**
     * Sets the value of the tradInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement12 }
     *     
     */
    public void setTradInf(TradeAgreement12 value) {
        this.tradInf = value;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public TradePartyIdentification8 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public void setTradgSdId(TradePartyIdentification8 value) {
        this.tradgSdId = value;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public TradePartyIdentification8 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification8 }
     *     
     */
    public void setCtrPtySdId(TradePartyIdentification8 value) {
        this.ctrPtySdId = value;
    }

    /**
     * Gets the value of the tradAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate6 }
     *     
     */
    public AmountsAndValueDate6 getTradAmts() {
        return tradAmts;
    }

    /**
     * Sets the value of the tradAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate6 }
     *     
     */
    public void setTradAmts(AmountsAndValueDate6 value) {
        this.tradAmts = value;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public void setAgrdRate(AgreedRate3 value) {
        this.agrdRate = value;
    }

    /**
     * Gets the value of the ndfConds property.
     * 
     * @return
     *     possible object is
     *     {@link NonDeliverableForwardConditions2 }
     *     
     */
    public NonDeliverableForwardConditions2 getNDFConds() {
        return ndfConds;
    }

    /**
     * Sets the value of the ndfConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliverableForwardConditions2 }
     *     
     */
    public void setNDFConds(NonDeliverableForwardConditions2 value) {
        this.ndfConds = value;
    }

    /**
     * Gets the value of the tradgSdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties120 }
     *     
     */
    public SettlementParties120 getTradgSdSttlmInstrs() {
        return tradgSdSttlmInstrs;
    }

    /**
     * Sets the value of the tradgSdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties120 }
     *     
     */
    public void setTradgSdSttlmInstrs(SettlementParties120 value) {
        this.tradgSdSttlmInstrs = value;
    }

    /**
     * Gets the value of the ctrPtySdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties120 }
     *     
     */
    public SettlementParties120 getCtrPtySdSttlmInstrs() {
        return ctrPtySdSttlmInstrs;
    }

    /**
     * Sets the value of the ctrPtySdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties120 }
     *     
     */
    public void setCtrPtySdSttlmInstrs(SettlementParties120 value) {
        this.ctrPtySdSttlmInstrs = value;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation8 }
     *     
     */
    public GeneralInformation8 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation8 }
     *     
     */
    public void setGnlInf(GeneralInformation8 value) {
        this.gnlInf = value;
    }

    /**
     * Gets the value of the spltTradInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spltTradInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpltTradInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitTradeDetails4 }
     * 
     * 
     * @return
     *     The value of the spltTradInf property.
     */
    public List<SplitTradeDetails4> getSpltTradInf() {
        if (spltTradInf == null) {
            spltTradInf = new ArrayList<>();
        }
        return this.spltTradInf;
    }

    /**
     * Gets the value of the rgltryRptg property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReporting7 }
     *     
     */
    public RegulatoryReporting7 getRgltryRptg() {
        return rgltryRptg;
    }

    /**
     * Sets the value of the rgltryRptg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReporting7 }
     *     
     */
    public void setRgltryRptg(RegulatoryReporting7 value) {
        this.rgltryRptg = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
