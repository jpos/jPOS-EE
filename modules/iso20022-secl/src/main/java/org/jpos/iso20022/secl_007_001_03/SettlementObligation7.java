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

package org.jpos.iso20022.secl_007_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementObligation7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementObligation7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CSDTxId" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}Max35Text" minOccurs="0"/>
 *         <element name="CntrlCtrPtyTxId" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PrvsBuyInId" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DlvryAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}SafekeepingPlaceFormat7Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="ClrSgmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}PartyIdentification35Choice" minOccurs="0"/>
 *         <element name="NonClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}PartyIdentificationAndAccount31" minOccurs="0"/>
 *         <element name="IntnddSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}ISODate" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}SecurityIdentification14"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}ISODate" minOccurs="0"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}Price4" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}FinancialInstrumentQuantity1Choice"/>
 *         <element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}PartyIdentification34Choice" minOccurs="0"/>
 *         <element name="RmngQtyToBeSttld" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}AmountAndDirection27"/>
 *         <element name="RmngAmtToBeSttld" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}AmountAndDirection27" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligation7", propOrder = {
    "csdTxId",
    "cntrlCtrPtyTxId",
    "prvsBuyInId",
    "dlvryAcct",
    "sfkpgPlc",
    "sfkpgAcct",
    "clrSgmt",
    "nonClrMmb",
    "intnddSttlmDt",
    "finInstrmId",
    "tradDt",
    "dealPric",
    "qty",
    "dpstry",
    "rmngQtyToBeSttld",
    "sttlmAmt",
    "rmngAmtToBeSttld"
})
public class SettlementObligation7 {

    @XmlElement(name = "CSDTxId")
    protected String csdTxId;
    @XmlElement(name = "CntrlCtrPtyTxId")
    protected String cntrlCtrPtyTxId;
    @XmlElement(name = "PrvsBuyInId")
    protected String prvsBuyInId;
    @XmlElement(name = "DlvryAcct")
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat7Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "IntnddSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intnddSttlmDt;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "TradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "DealPric")
    protected Price4 dealPric;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "Dpstry")
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "RmngQtyToBeSttld")
    protected FinancialInstrumentQuantity1Choice rmngQtyToBeSttld;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "RmngAmtToBeSttld")
    protected AmountAndDirection27 rmngAmtToBeSttld;

    /**
     * Gets the value of the csdTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDTxId() {
        return csdTxId;
    }

    /**
     * Sets the value of the csdTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSDTxId(String value) {
        this.csdTxId = value;
    }

    /**
     * Gets the value of the cntrlCtrPtyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrlCtrPtyTxId() {
        return cntrlCtrPtyTxId;
    }

    /**
     * Sets the value of the cntrlCtrPtyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrlCtrPtyTxId(String value) {
        this.cntrlCtrPtyTxId = value;
    }

    /**
     * Gets the value of the prvsBuyInId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsBuyInId() {
        return prvsBuyInId;
    }

    /**
     * Sets the value of the prvsBuyInId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvsBuyInId(String value) {
        this.prvsBuyInId = value;
    }

    /**
     * Gets the value of the dlvryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getDlvryAcct() {
        return dlvryAcct;
    }

    /**
     * Sets the value of the dlvryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setDlvryAcct(SecuritiesAccount19 value) {
        this.dlvryAcct = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public SafekeepingPlaceFormat7Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat7Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrSgmt(PartyIdentification35Choice value) {
        this.clrSgmt = value;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public void setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntnddSttlmDt(XMLGregorianCalendar value) {
        this.intnddSttlmDt = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public void setDealPric(Price4 value) {
        this.dealPric = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public void setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
    }

    /**
     * Gets the value of the rmngQtyToBeSttld property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getRmngQtyToBeSttld() {
        return rmngQtyToBeSttld;
    }

    /**
     * Sets the value of the rmngQtyToBeSttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setRmngQtyToBeSttld(FinancialInstrumentQuantity1Choice value) {
        this.rmngQtyToBeSttld = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public AmountAndDirection27 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection27 value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the rmngAmtToBeSttld property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public AmountAndDirection27 getRmngAmtToBeSttld() {
        return rmngAmtToBeSttld;
    }

    /**
     * Sets the value of the rmngAmtToBeSttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public void setRmngAmtToBeSttld(AmountAndDirection27 value) {
        this.rmngAmtToBeSttld = value;
    }

}
