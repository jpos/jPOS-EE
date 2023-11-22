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

package org.jpos.iso20022.tsrv_003_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Undertaking4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Undertaking4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}UndertakingName1Code"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}ExternalUndertakingType1Code"/>
 *         <element name="Applcnt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PartyIdentification43" maxOccurs="unbounded"/>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PartyIdentification43" maxOccurs="unbounded"/>
 *         <element name="DtOfIssnc" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}ISODate" minOccurs="0"/>
 *         <element name="AdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="ScndAdvsgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PartyIdentification43" minOccurs="0"/>
 *         <element name="LclUdrtkgAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}UndertakingAmount1"/>
 *         <element name="XpryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}ExpiryDetails1"/>
 *         <element name="ConfInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PartyAndType1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GovncRulesAndLaw" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}GovernanceRules1"/>
 *         <element name="UndrlygTx" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}UnderlyingTradeTransaction1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PresntnDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Presentation1" minOccurs="0"/>
 *         <element name="UdrtkgWrdg" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}UndertakingWording1"/>
 *         <element name="MltplDmndInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrtlDmndInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="ConfChrgsPyblBy" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}ExternalTypeOfParty1Code" minOccurs="0"/>
 *         <element name="TrfChrgsPyblBy" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}ExternalTypeOfParty1Code" minOccurs="0"/>
 *         <element name="AutomtcAmtVartn" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}AutomaticVariation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvryChanl" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}CommunicationChannel1" minOccurs="0"/>
 *         <element name="TrfInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking4", propOrder = {
    "nm",
    "tp",
    "applcnt",
    "bnfcry",
    "dtOfIssnc",
    "advsgPty",
    "scndAdvsgPty",
    "lclUdrtkgAmt",
    "xpryDtls",
    "confInd",
    "addtlPty",
    "govncRulesAndLaw",
    "undrlygTx",
    "presntnDtls",
    "udrtkgWrdg",
    "mltplDmndInd",
    "prtlDmndInd",
    "confChrgsPyblBy",
    "trfChrgsPyblBy",
    "automtcAmtVartn",
    "dlvryChanl",
    "trfInd",
    "addtlInf"
})
public class Undertaking4 {

    @XmlElement(name = "Nm", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingName1Code nm;
    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Applcnt", required = true)
    protected List<PartyIdentification43> applcnt;
    @XmlElement(name = "Bnfcry", required = true)
    protected List<PartyIdentification43> bnfcry;
    @XmlElement(name = "DtOfIssnc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfIssnc;
    @XmlElement(name = "AdvsgPty")
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "LclUdrtkgAmt", required = true)
    protected UndertakingAmount1 lclUdrtkgAmt;
    @XmlElement(name = "XpryDtls", required = true)
    protected ExpiryDetails1 xpryDtls;
    @XmlElement(name = "ConfInd")
    protected Boolean confInd;
    @XmlElement(name = "AddtlPty")
    protected List<PartyAndType1> addtlPty;
    @XmlElement(name = "GovncRulesAndLaw", required = true)
    protected GovernanceRules1 govncRulesAndLaw;
    @XmlElement(name = "UndrlygTx")
    protected List<UnderlyingTradeTransaction1> undrlygTx;
    @XmlElement(name = "PresntnDtls")
    protected Presentation1 presntnDtls;
    @XmlElement(name = "UdrtkgWrdg", required = true)
    protected UndertakingWording1 udrtkgWrdg;
    @XmlElement(name = "MltplDmndInd")
    protected Boolean mltplDmndInd;
    @XmlElement(name = "PrtlDmndInd")
    protected Boolean prtlDmndInd;
    @XmlElement(name = "ConfChrgsPyblBy")
    protected String confChrgsPyblBy;
    @XmlElement(name = "TrfChrgsPyblBy")
    protected String trfChrgsPyblBy;
    @XmlElement(name = "AutomtcAmtVartn")
    protected List<AutomaticVariation1> automtcAmtVartn;
    @XmlElement(name = "DlvryChanl")
    protected CommunicationChannel1 dlvryChanl;
    @XmlElement(name = "TrfInd")
    protected Boolean trfInd;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

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
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
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
     * Gets the value of the dtOfIssnc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfIssnc() {
        return dtOfIssnc;
    }

    /**
     * Sets the value of the dtOfIssnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfIssnc(XMLGregorianCalendar value) {
        this.dtOfIssnc = value;
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
     * Gets the value of the lclUdrtkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public UndertakingAmount1 getLclUdrtkgAmt() {
        return lclUdrtkgAmt;
    }

    /**
     * Sets the value of the lclUdrtkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount1 }
     *     
     */
    public void setLclUdrtkgAmt(UndertakingAmount1 value) {
        this.lclUdrtkgAmt = value;
    }

    /**
     * Gets the value of the xpryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public ExpiryDetails1 getXpryDtls() {
        return xpryDtls;
    }

    /**
     * Sets the value of the xpryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDetails1 }
     *     
     */
    public void setXpryDtls(ExpiryDetails1 value) {
        this.xpryDtls = value;
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
     *     {@link Presentation1 }
     *     
     */
    public Presentation1 getPresntnDtls() {
        return presntnDtls;
    }

    /**
     * Sets the value of the presntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation1 }
     *     
     */
    public void setPresntnDtls(Presentation1 value) {
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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
