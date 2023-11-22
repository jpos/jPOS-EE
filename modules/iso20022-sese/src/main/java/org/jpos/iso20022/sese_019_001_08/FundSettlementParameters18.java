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

package org.jpos.iso20022.sese_019_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundSettlementParameters18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundSettlementParameters18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}SafekeepingPlaceFormat28Choice" minOccurs="0"/>
 *         <element name="TradTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}TradeTransactionCondition8Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}SettlementTransactionCondition30Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctiesSttlmSysId" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}Max35Text" minOccurs="0"/>
 *         <element name="RcvgSdDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.019.001.08}SettlementParties94" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundSettlementParameters18", propOrder = {
    "sfkpgPlc",
    "tradTxCond",
    "sttlmTxCond",
    "sctiesSttlmSysId",
    "rcvgSdDtls"
})
public class FundSettlementParameters18 {

    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat28Choice sfkpgPlc;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition8Choice> tradTxCond;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition30Choice> sttlmTxCond;
    @XmlElement(name = "SctiesSttlmSysId")
    protected String sctiesSttlmSysId;
    @XmlElement(name = "RcvgSdDtls")
    protected SettlementParties94 rcvgSdDtls;

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public SafekeepingPlaceFormat28Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat28Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition8Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition8Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition30Choice }
     * 
     * 
     * @return
     *     The value of the sttlmTxCond property.
     */
    public List<SettlementTransactionCondition30Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Gets the value of the sctiesSttlmSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmSysId() {
        return sctiesSttlmSysId;
    }

    /**
     * Sets the value of the sctiesSttlmSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesSttlmSysId(String value) {
        this.sctiesSttlmSysId = value;
    }

    /**
     * Gets the value of the rcvgSdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties94 }
     *     
     */
    public SettlementParties94 getRcvgSdDtls() {
        return rcvgSdDtls;
    }

    /**
     * Sets the value of the rcvgSdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties94 }
     *     
     */
    public void setRcvgSdDtls(SettlementParties94 value) {
        this.rcvgSdDtls = value;
    }

}
