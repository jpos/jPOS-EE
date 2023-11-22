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

package org.jpos.iso20022.reda_058_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingSettlementInstructionStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingSettlementInstructionStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FctvDtDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}EffectiveDate1" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}AccountIdentification26" maxOccurs="unbounded"/>
 *         <element name="MktId" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}MarketIdentificationOrCashPurpose1Choice"/>
 *         <element name="SttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}PartyOrCurrency1Choice"/>
 *         <element name="RltdMsgRef" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}Max35Text"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}ProcessingStatus43Choice"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:reda.058.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstructionStatusAdviceV01", propOrder = {
    "fctvDtDtls",
    "acctId",
    "mktId",
    "sttlmDtls",
    "rltdMsgRef",
    "prcgSts",
    "splmtryData"
})
public class StandingSettlementInstructionStatusAdviceV01 {

    @XmlElement(name = "FctvDtDtls")
    protected EffectiveDate1 fctvDtDtls;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountIdentification26> acctId;
    @XmlElement(name = "MktId", required = true)
    protected MarketIdentificationOrCashPurpose1Choice mktId;
    @XmlElement(name = "SttlmDtls", required = true)
    protected PartyOrCurrency1Choice sttlmDtls;
    @XmlElement(name = "RltdMsgRef", required = true)
    protected String rltdMsgRef;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus43Choice prcgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrCurrency1Choice }
     *     
     */
    public PartyOrCurrency1Choice getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrCurrency1Choice }
     *     
     */
    public void setSttlmDtls(PartyOrCurrency1Choice value) {
        this.sttlmDtls = value;
    }

    /**
     * Gets the value of the rltdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdMsgRef() {
        return rltdMsgRef;
    }

    /**
     * Sets the value of the rltdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdMsgRef(String value) {
        this.rltdMsgRef = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus43Choice }
     *     
     */
    public ProcessingStatus43Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus43Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus43Choice value) {
        this.prcgSts = value;
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
