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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundReferenceDataReport4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundReferenceDataReport4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max35Text" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}MarketPracticeVersion1" minOccurs="0"/>
 *         <element name="AuthrsdPrxy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes6" minOccurs="0"/>
 *         <element name="GnlRefDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate"/>
 *         <element name="TrgtMktInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="ExAnteInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="ExPstInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}SecurityIdentification41"/>
 *         <element name="FndPties" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}FundParties1" minOccurs="0"/>
 *         <element name="MainFndOrdrDsk" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OrderDesk1" minOccurs="0"/>
 *         <element name="FndMgmtCpny" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes5" minOccurs="0"/>
 *         <element name="FndDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}FinancialInstrument96" minOccurs="0"/>
 *         <element name="ValtnDealgChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ValuationDealingProcessingCharacteristics3" minOccurs="0"/>
 *         <element name="InvstmtRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestmentRestrictions3" minOccurs="0"/>
 *         <element name="SbcptPrcgChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ProcessingCharacteristics8" minOccurs="0"/>
 *         <element name="RedPrcgChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ProcessingCharacteristics7" minOccurs="0"/>
 *         <element name="SwtchPrcgChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ProcessingCharacteristics6" minOccurs="0"/>
 *         <element name="PlanChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestmentPlanCharacteristics1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}PaymentInstrument16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshSttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CashAccount205" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LclMktAnx" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}LocalMarketAnnex5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrgtMkt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket3" minOccurs="0"/>
 *         <element name="DstrbtnStrtgy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DistributionStrategy1" minOccurs="0"/>
 *         <element name="CostsAndChrgs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CostsAndCharges2" maxOccurs="2" minOccurs="0"/>
 *         <element name="AddtlPdctInfGrmnMkt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalProductInformation1" minOccurs="0"/>
 *         <element name="AddtlPdctInfFrnchMkt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalProductInformation2" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundReferenceDataReport4", propOrder = {
    "id",
    "vrsn",
    "authrsdPrxy",
    "gnlRefDt",
    "trgtMktInd",
    "exAnteInd",
    "exPstInd",
    "sctyId",
    "fndPties",
    "mainFndOrdrDsk",
    "fndMgmtCpny",
    "fndDtls",
    "valtnDealgChrtcs",
    "invstmtRstrctns",
    "sbcptPrcgChrtcs",
    "redPrcgChrtcs",
    "swtchPrcgChrtcs",
    "planChrtcs",
    "pmtInstrm",
    "cshSttlmDtls",
    "lclMktAnx",
    "trgtMkt",
    "dstrbtnStrtgy",
    "costsAndChrgs",
    "addtlPdctInfGrmnMkt",
    "addtlPdctInfFrnchMkt",
    "xtnsn"
})
public class FundReferenceDataReport4 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Vrsn")
    protected MarketPracticeVersion1 vrsn;
    @XmlElement(name = "AuthrsdPrxy")
    protected ContactAttributes6 authrsdPrxy;
    @XmlElement(name = "GnlRefDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gnlRefDt;
    @XmlElement(name = "TrgtMktInd")
    protected Boolean trgtMktInd;
    @XmlElement(name = "ExAnteInd")
    protected Boolean exAnteInd;
    @XmlElement(name = "ExPstInd")
    protected Boolean exPstInd;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification41 sctyId;
    @XmlElement(name = "FndPties")
    protected FundParties1 fndPties;
    @XmlElement(name = "MainFndOrdrDsk")
    protected OrderDesk1 mainFndOrdrDsk;
    @XmlElement(name = "FndMgmtCpny")
    protected ContactAttributes5 fndMgmtCpny;
    @XmlElement(name = "FndDtls")
    protected FinancialInstrument96 fndDtls;
    @XmlElement(name = "ValtnDealgChrtcs")
    protected ValuationDealingProcessingCharacteristics3 valtnDealgChrtcs;
    @XmlElement(name = "InvstmtRstrctns")
    protected InvestmentRestrictions3 invstmtRstrctns;
    @XmlElement(name = "SbcptPrcgChrtcs")
    protected ProcessingCharacteristics8 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs")
    protected ProcessingCharacteristics7 redPrcgChrtcs;
    @XmlElement(name = "SwtchPrcgChrtcs")
    protected ProcessingCharacteristics6 swtchPrcgChrtcs;
    @XmlElement(name = "PlanChrtcs")
    protected List<InvestmentPlanCharacteristics1> planChrtcs;
    @XmlElement(name = "PmtInstrm")
    protected List<PaymentInstrument16> pmtInstrm;
    @XmlElement(name = "CshSttlmDtls")
    protected List<CashAccount205> cshSttlmDtls;
    @XmlElement(name = "LclMktAnx")
    protected List<LocalMarketAnnex5> lclMktAnx;
    @XmlElement(name = "TrgtMkt")
    protected TargetMarket3 trgtMkt;
    @XmlElement(name = "DstrbtnStrtgy")
    protected DistributionStrategy1 dstrbtnStrtgy;
    @XmlElement(name = "CostsAndChrgs")
    protected List<CostsAndCharges2> costsAndChrgs;
    @XmlElement(name = "AddtlPdctInfGrmnMkt")
    protected AdditionalProductInformation1 addtlPdctInfGrmnMkt;
    @XmlElement(name = "AddtlPdctInfFrnchMkt")
    protected AdditionalProductInformation2 addtlPdctInfFrnchMkt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public MarketPracticeVersion1 getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public void setVrsn(MarketPracticeVersion1 value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the authrsdPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes6 }
     *     
     */
    public ContactAttributes6 getAuthrsdPrxy() {
        return authrsdPrxy;
    }

    /**
     * Sets the value of the authrsdPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes6 }
     *     
     */
    public void setAuthrsdPrxy(ContactAttributes6 value) {
        this.authrsdPrxy = value;
    }

    /**
     * Gets the value of the gnlRefDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGnlRefDt() {
        return gnlRefDt;
    }

    /**
     * Sets the value of the gnlRefDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGnlRefDt(XMLGregorianCalendar value) {
        this.gnlRefDt = value;
    }

    /**
     * Gets the value of the trgtMktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrgtMktInd() {
        return trgtMktInd;
    }

    /**
     * Sets the value of the trgtMktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrgtMktInd(Boolean value) {
        this.trgtMktInd = value;
    }

    /**
     * Gets the value of the exAnteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExAnteInd() {
        return exAnteInd;
    }

    /**
     * Sets the value of the exAnteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExAnteInd(Boolean value) {
        this.exAnteInd = value;
    }

    /**
     * Gets the value of the exPstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExPstInd() {
        return exPstInd;
    }

    /**
     * Sets the value of the exPstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExPstInd(Boolean value) {
        this.exPstInd = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification41 }
     *     
     */
    public SecurityIdentification41 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification41 }
     *     
     */
    public void setSctyId(SecurityIdentification41 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the fndPties property.
     * 
     * @return
     *     possible object is
     *     {@link FundParties1 }
     *     
     */
    public FundParties1 getFndPties() {
        return fndPties;
    }

    /**
     * Sets the value of the fndPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundParties1 }
     *     
     */
    public void setFndPties(FundParties1 value) {
        this.fndPties = value;
    }

    /**
     * Gets the value of the mainFndOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDesk1 }
     *     
     */
    public OrderDesk1 getMainFndOrdrDsk() {
        return mainFndOrdrDsk;
    }

    /**
     * Sets the value of the mainFndOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDesk1 }
     *     
     */
    public void setMainFndOrdrDsk(OrderDesk1 value) {
        this.mainFndOrdrDsk = value;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public void setFndMgmtCpny(ContactAttributes5 value) {
        this.fndMgmtCpny = value;
    }

    /**
     * Gets the value of the fndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument96 }
     *     
     */
    public FinancialInstrument96 getFndDtls() {
        return fndDtls;
    }

    /**
     * Sets the value of the fndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument96 }
     *     
     */
    public void setFndDtls(FinancialInstrument96 value) {
        this.fndDtls = value;
    }

    /**
     * Gets the value of the valtnDealgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationDealingProcessingCharacteristics3 }
     *     
     */
    public ValuationDealingProcessingCharacteristics3 getValtnDealgChrtcs() {
        return valtnDealgChrtcs;
    }

    /**
     * Sets the value of the valtnDealgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationDealingProcessingCharacteristics3 }
     *     
     */
    public void setValtnDealgChrtcs(ValuationDealingProcessingCharacteristics3 value) {
        this.valtnDealgChrtcs = value;
    }

    /**
     * Gets the value of the invstmtRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentRestrictions3 }
     *     
     */
    public InvestmentRestrictions3 getInvstmtRstrctns() {
        return invstmtRstrctns;
    }

    /**
     * Sets the value of the invstmtRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentRestrictions3 }
     *     
     */
    public void setInvstmtRstrctns(InvestmentRestrictions3 value) {
        this.invstmtRstrctns = value;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics8 }
     *     
     */
    public ProcessingCharacteristics8 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics8 }
     *     
     */
    public void setSbcptPrcgChrtcs(ProcessingCharacteristics8 value) {
        this.sbcptPrcgChrtcs = value;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics7 }
     *     
     */
    public ProcessingCharacteristics7 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics7 }
     *     
     */
    public void setRedPrcgChrtcs(ProcessingCharacteristics7 value) {
        this.redPrcgChrtcs = value;
    }

    /**
     * Gets the value of the swtchPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics6 }
     *     
     */
    public ProcessingCharacteristics6 getSwtchPrcgChrtcs() {
        return swtchPrcgChrtcs;
    }

    /**
     * Sets the value of the swtchPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics6 }
     *     
     */
    public void setSwtchPrcgChrtcs(ProcessingCharacteristics6 value) {
        this.swtchPrcgChrtcs = value;
    }

    /**
     * Gets the value of the planChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the planChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentPlanCharacteristics1 }
     * 
     * 
     * @return
     *     The value of the planChrtcs property.
     */
    public List<InvestmentPlanCharacteristics1> getPlanChrtcs() {
        if (planChrtcs == null) {
            planChrtcs = new ArrayList<>();
        }
        return this.planChrtcs;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrument16 }
     * 
     * 
     * @return
     *     The value of the pmtInstrm property.
     */
    public List<PaymentInstrument16> getPmtInstrm() {
        if (pmtInstrm == null) {
            pmtInstrm = new ArrayList<>();
        }
        return this.pmtInstrm;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount205 }
     * 
     * 
     * @return
     *     The value of the cshSttlmDtls property.
     */
    public List<CashAccount205> getCshSttlmDtls() {
        if (cshSttlmDtls == null) {
            cshSttlmDtls = new ArrayList<>();
        }
        return this.cshSttlmDtls;
    }

    /**
     * Gets the value of the lclMktAnx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclMktAnx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclMktAnx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalMarketAnnex5 }
     * 
     * 
     * @return
     *     The value of the lclMktAnx property.
     */
    public List<LocalMarketAnnex5> getLclMktAnx() {
        if (lclMktAnx == null) {
            lclMktAnx = new ArrayList<>();
        }
        return this.lclMktAnx;
    }

    /**
     * Gets the value of the trgtMkt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket3 }
     *     
     */
    public TargetMarket3 getTrgtMkt() {
        return trgtMkt;
    }

    /**
     * Sets the value of the trgtMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket3 }
     *     
     */
    public void setTrgtMkt(TargetMarket3 value) {
        this.trgtMkt = value;
    }

    /**
     * Gets the value of the dstrbtnStrtgy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionStrategy1 }
     *     
     */
    public DistributionStrategy1 getDstrbtnStrtgy() {
        return dstrbtnStrtgy;
    }

    /**
     * Sets the value of the dstrbtnStrtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionStrategy1 }
     *     
     */
    public void setDstrbtnStrtgy(DistributionStrategy1 value) {
        this.dstrbtnStrtgy = value;
    }

    /**
     * Gets the value of the costsAndChrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the costsAndChrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostsAndChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostsAndCharges2 }
     * 
     * 
     * @return
     *     The value of the costsAndChrgs property.
     */
    public List<CostsAndCharges2> getCostsAndChrgs() {
        if (costsAndChrgs == null) {
            costsAndChrgs = new ArrayList<>();
        }
        return this.costsAndChrgs;
    }

    /**
     * Gets the value of the addtlPdctInfGrmnMkt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductInformation1 }
     *     
     */
    public AdditionalProductInformation1 getAddtlPdctInfGrmnMkt() {
        return addtlPdctInfGrmnMkt;
    }

    /**
     * Sets the value of the addtlPdctInfGrmnMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductInformation1 }
     *     
     */
    public void setAddtlPdctInfGrmnMkt(AdditionalProductInformation1 value) {
        this.addtlPdctInfGrmnMkt = value;
    }

    /**
     * Gets the value of the addtlPdctInfFrnchMkt property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductInformation2 }
     *     
     */
    public AdditionalProductInformation2 getAddtlPdctInfFrnchMkt() {
        return addtlPdctInfFrnchMkt;
    }

    /**
     * Sets the value of the addtlPdctInfFrnchMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductInformation2 }
     *     
     */
    public void setAddtlPdctInfFrnchMkt(AdditionalProductInformation2 value) {
        this.addtlPdctInfFrnchMkt = value;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
    }

}
