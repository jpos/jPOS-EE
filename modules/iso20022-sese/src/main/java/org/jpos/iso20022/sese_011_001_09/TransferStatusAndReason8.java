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

package org.jpos.iso20022.sese_011_001_09;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatusAndReason8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransferStatusAndReason8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TrfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="CxlRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TrfEvtTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}TransferStatusType3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrfSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}TransferStatus5Choice"/>
 *         <element name="Instrm" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}FinancialInstrument63Choice" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Account33" minOccurs="0"/>
 *         <element name="IntrmyInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Intermediary48" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
 *         <element name="SndOutDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
 *         <element name="CshSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
 *         <element name="TtlUnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}DecimalNumber" minOccurs="0"/>
 *         <element name="AvrgPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="UnitsDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Unit11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Convs" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Conversion2" minOccurs="0"/>
 *         <element name="TtlTrfVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="PmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PaymentInstrument18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BnftCrstllstnEvt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}BenefitCrystallisationEvent2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DrwdwnTrch" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Drawdown2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrDrwdwnInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Drawdown3" minOccurs="0"/>
 *         <element name="QryRspn" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Max350Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StsInitr" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PartyIdentification139" minOccurs="0"/>
 *         <element name="StsIssr" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PartyIdentification139" minOccurs="0"/>
 *         <element name="StsRcpt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PartyIdentification139" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferStatusAndReason8", propOrder = {
    "mstrRef",
    "trfRef",
    "clntRef",
    "cxlRef",
    "trfEvtTp",
    "trfSts",
    "instrm",
    "invstmtAcctDtls",
    "intrmyInf",
    "tradDt",
    "sttlmDt",
    "sndOutDt",
    "cshSttlmDt",
    "ttlUnitsNb",
    "avrgPric",
    "unitsDtls",
    "convs",
    "ttlTrfVal",
    "pmtDtls",
    "bnftCrstllstnEvt",
    "drwdwnTrch",
    "othrDrwdwnInf",
    "qryRspn",
    "stsInitr",
    "stsIssr",
    "stsRcpt",
    "addtlInf"
})
public class TransferStatusAndReason8 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "TrfEvtTp")
    protected List<TransferStatusType3Choice> trfEvtTp;
    @XmlElement(name = "TrfSts", required = true)
    protected TransferStatus5Choice trfSts;
    @XmlElement(name = "Instrm")
    protected FinancialInstrument63Choice instrm;
    @XmlElement(name = "InvstmtAcctDtls")
    protected Account33 invstmtAcctDtls;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary48> intrmyInf;
    @XmlElement(name = "TradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "SttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "SndOutDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sndOutDt;
    @XmlElement(name = "CshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "TtlUnitsNb")
    protected BigDecimal ttlUnitsNb;
    @XmlElement(name = "AvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount avrgPric;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit11> unitsDtls;
    @XmlElement(name = "Convs")
    protected Conversion2 convs;
    @XmlElement(name = "TtlTrfVal")
    protected ActiveCurrencyAnd13DecimalAmount ttlTrfVal;
    @XmlElement(name = "PmtDtls")
    protected List<PaymentInstrument18> pmtDtls;
    @XmlElement(name = "BnftCrstllstnEvt")
    protected List<BenefitCrystallisationEvent2> bnftCrstllstnEvt;
    @XmlElement(name = "DrwdwnTrch")
    protected List<Drawdown2> drwdwnTrch;
    @XmlElement(name = "OthrDrwdwnInf")
    protected Drawdown3 othrDrwdwnInf;
    @XmlElement(name = "QryRspn")
    protected List<String> qryRspn;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification139 stsInitr;
    @XmlElement(name = "StsIssr")
    protected PartyIdentification139 stsIssr;
    @XmlElement(name = "StsRcpt")
    protected PartyIdentification139 stsRcpt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfRef(String value) {
        this.trfRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRef(String value) {
        this.cxlRef = value;
    }

    /**
     * Gets the value of the trfEvtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trfEvtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfEvtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferStatusType3Choice }
     * 
     * 
     * @return
     *     The value of the trfEvtTp property.
     */
    public List<TransferStatusType3Choice> getTrfEvtTp() {
        if (trfEvtTp == null) {
            trfEvtTp = new ArrayList<>();
        }
        return this.trfEvtTp;
    }

    /**
     * Gets the value of the trfSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferStatus5Choice }
     *     
     */
    public TransferStatus5Choice getTrfSts() {
        return trfSts;
    }

    /**
     * Sets the value of the trfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferStatus5Choice }
     *     
     */
    public void setTrfSts(TransferStatus5Choice value) {
        this.trfSts = value;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public FinancialInstrument63Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument63Choice }
     *     
     */
    public void setInstrm(FinancialInstrument63Choice value) {
        this.instrm = value;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Account33 }
     *     
     */
    public Account33 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account33 }
     *     
     */
    public void setInvstmtAcctDtls(Account33 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary48 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary48> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
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
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the sndOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSndOutDt() {
        return sndOutDt;
    }

    /**
     * Sets the value of the sndOutDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSndOutDt(XMLGregorianCalendar value) {
        this.sndOutDt = value;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlUnitsNb(BigDecimal value) {
        this.ttlUnitsNb = value;
    }

    /**
     * Gets the value of the avrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAvrgPric() {
        return avrgPric;
    }

    /**
     * Sets the value of the avrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.avrgPric = value;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit11 }
     * 
     * 
     * @return
     *     The value of the unitsDtls property.
     */
    public List<Unit11> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the convs property.
     * 
     * @return
     *     possible object is
     *     {@link Conversion2 }
     *     
     */
    public Conversion2 getConvs() {
        return convs;
    }

    /**
     * Sets the value of the convs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversion2 }
     *     
     */
    public void setConvs(Conversion2 value) {
        this.convs = value;
    }

    /**
     * Gets the value of the ttlTrfVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlTrfVal() {
        return ttlTrfVal;
    }

    /**
     * Sets the value of the ttlTrfVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setTtlTrfVal(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlTrfVal = value;
    }

    /**
     * Gets the value of the pmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrument18 }
     * 
     * 
     * @return
     *     The value of the pmtDtls property.
     */
    public List<PaymentInstrument18> getPmtDtls() {
        if (pmtDtls == null) {
            pmtDtls = new ArrayList<>();
        }
        return this.pmtDtls;
    }

    /**
     * Gets the value of the bnftCrstllstnEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnftCrstllstnEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnftCrstllstnEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitCrystallisationEvent2 }
     * 
     * 
     * @return
     *     The value of the bnftCrstllstnEvt property.
     */
    public List<BenefitCrystallisationEvent2> getBnftCrstllstnEvt() {
        if (bnftCrstllstnEvt == null) {
            bnftCrstllstnEvt = new ArrayList<>();
        }
        return this.bnftCrstllstnEvt;
    }

    /**
     * Gets the value of the drwdwnTrch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drwdwnTrch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrwdwnTrch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drawdown2 }
     * 
     * 
     * @return
     *     The value of the drwdwnTrch property.
     */
    public List<Drawdown2> getDrwdwnTrch() {
        if (drwdwnTrch == null) {
            drwdwnTrch = new ArrayList<>();
        }
        return this.drwdwnTrch;
    }

    /**
     * Gets the value of the othrDrwdwnInf property.
     * 
     * @return
     *     possible object is
     *     {@link Drawdown3 }
     *     
     */
    public Drawdown3 getOthrDrwdwnInf() {
        return othrDrwdwnInf;
    }

    /**
     * Sets the value of the othrDrwdwnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drawdown3 }
     *     
     */
    public void setOthrDrwdwnInf(Drawdown3 value) {
        this.othrDrwdwnInf = value;
    }

    /**
     * Gets the value of the qryRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qryRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQryRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the qryRspn property.
     */
    public List<String> getQryRspn() {
        if (qryRspn == null) {
            qryRspn = new ArrayList<>();
        }
        return this.qryRspn;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setStsInitr(PartyIdentification139 value) {
        this.stsInitr = value;
    }

    /**
     * Gets the value of the stsIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsIssr() {
        return stsIssr;
    }

    /**
     * Sets the value of the stsIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setStsIssr(PartyIdentification139 value) {
        this.stsIssr = value;
    }

    /**
     * Gets the value of the stsRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsRcpt() {
        return stsRcpt;
    }

    /**
     * Sets the value of the stsRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setStsRcpt(PartyIdentification139 value) {
        this.stsRcpt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
