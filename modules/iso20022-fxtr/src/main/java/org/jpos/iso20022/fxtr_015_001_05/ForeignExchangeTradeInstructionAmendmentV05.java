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

package org.jpos.iso20022.fxtr_015_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTradeInstructionAmendmentV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTradeInstructionAmendmentV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}TradeAgreement15"/>
 *         <element name="TradgSdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}TradePartyIdentification8"/>
 *         <element name="CtrPtySdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}TradePartyIdentification8"/>
 *         <element name="TradAmts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}AmountsAndValueDate6"/>
 *         <element name="AgrdRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}AgreedRate3"/>
 *         <element name="NDFConds" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}NonDeliverableForwardConditions1" minOccurs="0"/>
 *         <element name="TradgSdSttlmInstrs" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}SettlementParties120" minOccurs="0"/>
 *         <element name="CtrPtySdSttlmInstrs" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}SettlementParties120" minOccurs="0"/>
 *         <element name="OptnlGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}GeneralInformation8" minOccurs="0"/>
 *         <element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}RegulatoryReporting7" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeInstructionAmendmentV05", propOrder = {
    "tradInf",
    "tradgSdId",
    "ctrPtySdId",
    "tradAmts",
    "agrdRate",
    "ndfConds",
    "tradgSdSttlmInstrs",
    "ctrPtySdSttlmInstrs",
    "optnlGnlInf",
    "rgltryRptg",
    "splmtryData"
})
public class ForeignExchangeTradeInstructionAmendmentV05 {

    @XmlElement(name = "TradInf", required = true)
    protected TradeAgreement15 tradInf;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification8 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification8 ctrPtySdId;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate6 tradAmts;
    @XmlElement(name = "AgrdRate", required = true)
    protected AgreedRate3 agrdRate;
    @XmlElement(name = "NDFConds")
    protected NonDeliverableForwardConditions1 ndfConds;
    @XmlElement(name = "TradgSdSttlmInstrs")
    protected SettlementParties120 tradgSdSttlmInstrs;
    @XmlElement(name = "CtrPtySdSttlmInstrs")
    protected SettlementParties120 ctrPtySdSttlmInstrs;
    @XmlElement(name = "OptnlGnlInf")
    protected GeneralInformation8 optnlGnlInf;
    @XmlElement(name = "RgltryRptg")
    protected RegulatoryReporting7 rgltryRptg;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the tradInf property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAgreement15 }
     *     
     */
    public TradeAgreement15 getTradInf() {
        return tradInf;
    }

    /**
     * Sets the value of the tradInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAgreement15 }
     *     
     */
    public void setTradInf(TradeAgreement15 value) {
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
     *     {@link NonDeliverableForwardConditions1 }
     *     
     */
    public NonDeliverableForwardConditions1 getNDFConds() {
        return ndfConds;
    }

    /**
     * Sets the value of the ndfConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonDeliverableForwardConditions1 }
     *     
     */
    public void setNDFConds(NonDeliverableForwardConditions1 value) {
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
     * Gets the value of the optnlGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInformation8 }
     *     
     */
    public GeneralInformation8 getOptnlGnlInf() {
        return optnlGnlInf;
    }

    /**
     * Sets the value of the optnlGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInformation8 }
     *     
     */
    public void setOptnlGnlInf(GeneralInformation8 value) {
        this.optnlGnlInf = value;
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
