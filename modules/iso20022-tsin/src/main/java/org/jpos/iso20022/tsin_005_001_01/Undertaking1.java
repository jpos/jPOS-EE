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

package org.jpos.iso20022.tsin_005_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Undertaking1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Undertaking1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplcntRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}Max35Text"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}Max350Text"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}UndertakingName1Code"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}UndertakingType1Choice"/>
 *         <element name="Oblgr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43"/>
 *         <element name="Applcnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43"/>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43" maxOccurs="unbounded"/>
 *         <element name="AdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="ScndAdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="Cnfrmr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="ConfInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CntrUdrtkgInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}YesNoIndicator"/>
 *         <element name="CntrUdrtkg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}Undertaking2" minOccurs="0"/>
 *         <element name="UdrtkgAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}UndertakingAmount1"/>
 *         <element name="XpryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}ExpiryDetails2"/>
 *         <element name="AddtlPty" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}PartyAndType1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GovncRulesAndLaw" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}GovernanceRules1"/>
 *         <element name="UndrlygTx" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}UnderlyingTradeTransaction1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PresntnDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}Presentation4" minOccurs="0"/>
 *         <element name="UdrtkgWrdg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}UndertakingWording1"/>
 *         <element name="MltplDmndInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrtlDmndInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="TrfInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="TrfChrgsPyblBy" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}ExternalTypeOfParty1Code" minOccurs="0"/>
 *         <element name="ConfChrgsPyblBy" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}ExternalTypeOfParty1Code" minOccurs="0"/>
 *         <element name="AutomtcAmtVartn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}AutomaticVariation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvryChanl" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}CommunicationChannel1"/>
 *         <element name="OblgrLbltyAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}CashAccount28" minOccurs="0"/>
 *         <element name="OblgrChrgAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}CashAccount28" minOccurs="0"/>
 *         <element name="OblgrSttlmAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}CashAccount28" minOccurs="0"/>
 *         <element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlApplInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking1", propOrder = {
    "applcntRefNb",
    "purp",
    "nm",
    "tp",
    "oblgr",
    "applcnt",
    "issr",
    "bnfcry",
    "advsgPty",
    "scndAdvsgPty",
    "cnfrmr",
    "confInd",
    "cntrUdrtkgInd",
    "cntrUdrtkg",
    "udrtkgAmt",
    "xpryDtls",
    "addtlPty",
    "govncRulesAndLaw",
    "undrlygTx",
    "presntnDtls",
    "udrtkgWrdg",
    "mltplDmndInd",
    "prtlDmndInd",
    "trfInd",
    "trfChrgsPyblBy",
    "confChrgsPyblBy",
    "automtcAmtVartn",
    "dlvryChanl",
    "oblgrLbltyAcct",
    "oblgrChrgAcct",
    "oblgrSttlmAcct",
    "nclsdFile",
    "addtlApplInf"
})
public class Undertaking1 {

    @XmlElement(name = "ApplcntRefNb", required = true)
    protected String applcntRefNb;
    @XmlElement(name = "Purp", required = true)
    protected String purp;
    @XmlElement(name = "Nm", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingName1Code nm;
    @XmlElement(name = "Tp", required = true)
    protected UndertakingType1Choice tp;
    @XmlElement(name = "Oblgr", required = true)
    protected PartyIdentification43 oblgr;
    @XmlElement(name = "Applcnt")
    protected List<PartyIdentification43> applcnt;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification43 issr;
    @XmlElement(name = "Bnfcry", required = true)
    protected List<PartyIdentification43> bnfcry;
    @XmlElement(name = "AdvsgPty")
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "Cnfrmr")
    protected PartyIdentification43 cnfrmr;
    @XmlElement(name = "ConfInd")
    protected Boolean confInd;
    @XmlElement(name = "CntrUdrtkgInd")
    protected boolean cntrUdrtkgInd;
    @XmlElement(name = "CntrUdrtkg")
    protected Undertaking2 cntrUdrtkg;
    @XmlElement(name = "UdrtkgAmt", required = true)
    protected UndertakingAmount1 udrtkgAmt;
    @XmlElement(name = "XpryDtls", required = true)
    protected ExpiryDetails2 xpryDtls;
    @XmlElement(name = "AddtlPty")
    protected List<PartyAndType1> addtlPty;
    @XmlElement(name = "GovncRulesAndLaw", required = true)
    protected GovernanceRules1 govncRulesAndLaw;
    @XmlElement(name = "UndrlygTx")
    protected List<UnderlyingTradeTransaction1> undrlygTx;
    @XmlElement(name = "PresntnDtls")
    protected Presentation4 presntnDtls;
    @XmlElement(name = "UdrtkgWrdg", required = true)
    protected UndertakingWording1 udrtkgWrdg;
    @XmlElement(name = "MltplDmndInd")
    protected Boolean mltplDmndInd;
    @XmlElement(name = "PrtlDmndInd")
    protected Boolean prtlDmndInd;
    @XmlElement(name = "TrfInd")
    protected Boolean trfInd;
    @XmlElement(name = "TrfChrgsPyblBy")
    protected String trfChrgsPyblBy;
    @XmlElement(name = "ConfChrgsPyblBy")
    protected String confChrgsPyblBy;
    @XmlElement(name = "AutomtcAmtVartn")
    protected List<AutomaticVariation1> automtcAmtVartn;
    @XmlElement(name = "DlvryChanl", required = true)
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "OblgrLbltyAcct")
    protected CashAccount28 oblgrLbltyAcct;
    @XmlElement(name = "OblgrChrgAcct")
    protected CashAccount28 oblgrChrgAcct;
    @XmlElement(name = "OblgrSttlmAcct")
    protected CashAccount28 oblgrSttlmAcct;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlApplInf")
    protected List<String> addtlApplInf;

    /**
     * Gets the value of the applcntRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntRefNb() {
        return applcntRefNb;
    }

    /**
     * Sets the value of the applcntRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcntRefNb(String value) {
        this.applcntRefNb = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurp(String value) {
        this.purp = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingName1Code }
     *     
     */
    public UndertakingName1Code getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingName1Code }
     *     
     */
    public void setNm(UndertakingName1Code value) {
        this.nm = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingType1Choice }
     *     
     */
    public UndertakingType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingType1Choice }
     *     
     */
    public void setTp(UndertakingType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the oblgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOblgr() {
        return oblgr;
    }

    /**
     * Sets the value of the oblgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setOblgr(PartyIdentification43 value) {
        this.oblgr = value;
    }

    /**
     * Gets the value of the applcnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applcnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplcnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification43 }
     * 
     * 
     * @return
     *     The value of the applcnt property.
     */
    public List<PartyIdentification43> getApplcnt() {
        if (applcnt == null) {
            applcnt = new ArrayList<>();
        }
        return this.applcnt;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setIssr(PartyIdentification43 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfcry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification43 }
     * 
     * 
     * @return
     *     The value of the bnfcry property.
     */
    public List<PartyIdentification43> getBnfcry() {
        if (bnfcry == null) {
            bnfcry = new ArrayList<>();
        }
        return this.bnfcry;
    }

    /**
     * Gets the value of the advsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getAdvsgPty() {
        return advsgPty;
    }

    /**
     * Sets the value of the advsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setAdvsgPty(PartyIdentification43 value) {
        this.advsgPty = value;
    }

    /**
     * Gets the value of the scndAdvsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getScndAdvsgPty() {
        return scndAdvsgPty;
    }

    /**
     * Sets the value of the scndAdvsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
    }

    /**
     * Gets the value of the cnfrmr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getCnfrmr() {
        return cnfrmr;
    }

    /**
     * Sets the value of the cnfrmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setCnfrmr(PartyIdentification43 value) {
        this.cnfrmr = value;
    }

    /**
     * Gets the value of the confInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfInd() {
        return confInd;
    }

    /**
     * Sets the value of the confInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfInd(Boolean value) {
        this.confInd = value;
    }

    /**
     * Gets the value of the cntrUdrtkgInd property.
     * 
     */
    public boolean isCntrUdrtkgInd() {
        return cntrUdrtkgInd;
    }

    /**
     * Sets the value of the cntrUdrtkgInd property.
     * 
     */
    public void setCntrUdrtkgInd(boolean value) {
        this.cntrUdrtkgInd = value;
    }

    /**
     * Gets the value of the cntrUdrtkg property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking2 }
     *     
     */
    public Undertaking2 getCntrUdrtkg() {
        return cntrUdrtkg;
    }

    /**
     * Sets the value of the cntrUdrtkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking2 }
     *     
     */
    public void setCntrUdrtkg(Undertaking2 value) {
        this.cntrUdrtkg = value;
    }

    /**
     * Gets the value of the udrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public UndertakingAmount1 getUdrtkgAmt() {
        return udrtkgAmt;
    }

    /**
     * Sets the value of the udrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public void setUdrtkgAmt(UndertakingAmount1 value) {
        this.udrtkgAmt = value;
    }

    /**
     * Gets the value of the xpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public ExpiryDetails2 getXpryDtls() {
        return xpryDtls;
    }

    /**
     * Sets the value of the xpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails2 }
     *     
     */
    public void setXpryDtls(ExpiryDetails2 value) {
        this.xpryDtls = value;
    }

    /**
     * Gets the value of the addtlPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndType1 }
     * 
     * 
     * @return
     *     The value of the addtlPty property.
     */
    public List<PartyAndType1> getAddtlPty() {
        if (addtlPty == null) {
            addtlPty = new ArrayList<>();
        }
        return this.addtlPty;
    }

    /**
     * Gets the value of the govncRulesAndLaw property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceRules1 }
     *     
     */
    public GovernanceRules1 getGovncRulesAndLaw() {
        return govncRulesAndLaw;
    }

    /**
     * Sets the value of the govncRulesAndLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceRules1 }
     *     
     */
    public void setGovncRulesAndLaw(GovernanceRules1 value) {
        this.govncRulesAndLaw = value;
    }

    /**
     * Gets the value of the undrlygTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingTradeTransaction1 }
     * 
     * 
     * @return
     *     The value of the undrlygTx property.
     */
    public List<UnderlyingTradeTransaction1> getUndrlygTx() {
        if (undrlygTx == null) {
            undrlygTx = new ArrayList<>();
        }
        return this.undrlygTx;
    }

    /**
     * Gets the value of the presntnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation4 }
     *     
     */
    public Presentation4 getPresntnDtls() {
        return presntnDtls;
    }

    /**
     * Sets the value of the presntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation4 }
     *     
     */
    public void setPresntnDtls(Presentation4 value) {
        this.presntnDtls = value;
    }

    /**
     * Gets the value of the udrtkgWrdg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingWording1 }
     *     
     */
    public UndertakingWording1 getUdrtkgWrdg() {
        return udrtkgWrdg;
    }

    /**
     * Sets the value of the udrtkgWrdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingWording1 }
     *     
     */
    public void setUdrtkgWrdg(UndertakingWording1 value) {
        this.udrtkgWrdg = value;
    }

    /**
     * Gets the value of the mltplDmndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMltplDmndInd() {
        return mltplDmndInd;
    }

    /**
     * Sets the value of the mltplDmndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMltplDmndInd(Boolean value) {
        this.mltplDmndInd = value;
    }

    /**
     * Gets the value of the prtlDmndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDmndInd() {
        return prtlDmndInd;
    }

    /**
     * Sets the value of the prtlDmndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlDmndInd(Boolean value) {
        this.prtlDmndInd = value;
    }

    /**
     * Gets the value of the trfInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfInd() {
        return trfInd;
    }

    /**
     * Sets the value of the trfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrfInd(Boolean value) {
        this.trfInd = value;
    }

    /**
     * Gets the value of the trfChrgsPyblBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfChrgsPyblBy() {
        return trfChrgsPyblBy;
    }

    /**
     * Sets the value of the trfChrgsPyblBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfChrgsPyblBy(String value) {
        this.trfChrgsPyblBy = value;
    }

    /**
     * Gets the value of the confChrgsPyblBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfChrgsPyblBy() {
        return confChrgsPyblBy;
    }

    /**
     * Sets the value of the confChrgsPyblBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfChrgsPyblBy(String value) {
        this.confChrgsPyblBy = value;
    }

    /**
     * Gets the value of the automtcAmtVartn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the automtcAmtVartn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomtcAmtVartn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutomaticVariation1 }
     * 
     * 
     * @return
     *     The value of the automtcAmtVartn property.
     */
    public List<AutomaticVariation1> getAutomtcAmtVartn() {
        if (automtcAmtVartn == null) {
            automtcAmtVartn = new ArrayList<>();
        }
        return this.automtcAmtVartn;
    }

    /**
     * Gets the value of the dlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public CommunicationChannel1 getDlvryChanl() {
        return dlvryChanl;
    }

    /**
     * Sets the value of the dlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannel1 }
     *     
     */
    public void setDlvryChanl(CommunicationChannel1 value) {
        this.dlvryChanl = value;
    }

    /**
     * Gets the value of the oblgrLbltyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount28 }
     *     
     */
    public CashAccount28 getOblgrLbltyAcct() {
        return oblgrLbltyAcct;
    }

    /**
     * Sets the value of the oblgrLbltyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount28 }
     *     
     */
    public void setOblgrLbltyAcct(CashAccount28 value) {
        this.oblgrLbltyAcct = value;
    }

    /**
     * Gets the value of the oblgrChrgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount28 }
     *     
     */
    public CashAccount28 getOblgrChrgAcct() {
        return oblgrChrgAcct;
    }

    /**
     * Sets the value of the oblgrChrgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount28 }
     *     
     */
    public void setOblgrChrgAcct(CashAccount28 value) {
        this.oblgrChrgAcct = value;
    }

    /**
     * Gets the value of the oblgrSttlmAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount28 }
     *     
     */
    public CashAccount28 getOblgrSttlmAcct() {
        return oblgrSttlmAcct;
    }

    /**
     * Sets the value of the oblgrSttlmAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount28 }
     *     
     */
    public void setOblgrSttlmAcct(CashAccount28 value) {
        this.oblgrSttlmAcct = value;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     * @return
     *     The value of the nclsdFile property.
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the addtlApplInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlApplInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlApplInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlApplInf property.
     */
    public List<String> getAddtlApplInf() {
        if (addtlApplInf == null) {
            addtlApplInf = new ArrayList<>();
        }
        return this.addtlApplInf;
    }

}
