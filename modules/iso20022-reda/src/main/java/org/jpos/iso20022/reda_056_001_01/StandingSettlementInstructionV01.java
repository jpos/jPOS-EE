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

package org.jpos.iso20022.reda_056_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingSettlementInstructionV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingSettlementInstructionV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgRefId" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}Max35Text"/>
 *         <element name="FctvDtDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}EffectiveDate1" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}AccountIdentification26" maxOccurs="unbounded"/>
 *         <element name="MktId" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}MarketIdentificationOrCashPurpose1Choice"/>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="SttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}SecuritiesOrCash1Choice"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstructionV01", propOrder = {
    "msgRefId",
    "fctvDtDtls",
    "acctId",
    "mktId",
    "sttlmCcy",
    "sttlmDtls",
    "splmtryData"
})
public class StandingSettlementInstructionV01 {

    @XmlElement(name = "MsgRefId", required = true)
    protected String msgRefId;
    @XmlElement(name = "FctvDtDtls")
    protected EffectiveDate1 fctvDtDtls;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountIdentification26> acctId;
    @XmlElement(name = "MktId", required = true)
    protected MarketIdentificationOrCashPurpose1Choice mktId;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "SttlmDtls", required = true)
    protected SecuritiesOrCash1Choice sttlmDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRefId() {
        return msgRefId;
    }

    /**
     * Sets the value of the msgRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRefId(String value) {
        this.msgRefId = value;
    }

    /**
     * Gets the value of the fctvDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDate1 }
     *     
     */
    public EffectiveDate1 getFctvDtDtls() {
        return fctvDtDtls;
    }

    /**
     * Sets the value of the fctvDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDate1 }
     *     
     */
    public void setFctvDtDtls(EffectiveDate1 value) {
        this.fctvDtDtls = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification26 }
     * 
     * 
     * @return
     *     The value of the acctId property.
     */
    public List<AccountIdentification26> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentificationOrCashPurpose1Choice }
     *     
     */
    public MarketIdentificationOrCashPurpose1Choice getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentificationOrCashPurpose1Choice }
     *     
     */
    public void setMktId(MarketIdentificationOrCashPurpose1Choice value) {
        this.mktId = value;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOrCash1Choice }
     *     
     */
    public SecuritiesOrCash1Choice getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOrCash1Choice }
     *     
     */
    public void setSttlmDtls(SecuritiesOrCash1Choice value) {
        this.sttlmDtls = value;
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
