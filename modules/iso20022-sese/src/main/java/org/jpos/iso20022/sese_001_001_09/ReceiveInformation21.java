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

package org.jpos.iso20022.sese_001_001_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveInformation21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReceiveInformation21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Trfee" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}PartyIdentification139" minOccurs="0"/>
 *         <element name="TrfeeRegdAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}Account31" minOccurs="0"/>
 *         <element name="IntrmyInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}Intermediary43" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctiesForm" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}FormOfSecurity1Code" minOccurs="0"/>
 *         <element name="DmtrlsdInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}IncomePreference2Code" minOccurs="0"/>
 *         <element name="BnfcryCertfctnCmpltn" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}BeneficiaryCertificationCompletion1Code" minOccurs="0"/>
 *         <element name="ReqdTradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ISODate" minOccurs="0"/>
 *         <element name="ReqdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ISODate" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StmpDty" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}StampDutyType2Code" minOccurs="0"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Fees" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}Fees2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IndvTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}Tax38" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}ForeignExchangeTerms37" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmPtiesDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}FundSettlementParameters16" minOccurs="0"/>
 *         <element name="PhysTrf" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}PhysicalTransferType1Code" minOccurs="0"/>
 *         <element name="PhysTrfDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}DeliveryParameters4" minOccurs="0"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.001.001.09}AdditionalReference10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveInformation21", propOrder = {
    "trfee",
    "trfeeRegdAcct",
    "intrmyInf",
    "sctiesForm",
    "dmtrlsdInd",
    "incmPref",
    "bnfcryCertfctnCmpltn",
    "reqdTradDt",
    "reqdSttlmDt",
    "sttlmAmt",
    "stmpDty",
    "netAmt",
    "fees",
    "indvTax",
    "fxDtls",
    "sttlmPtiesDtls",
    "physTrf",
    "physTrfDtls",
    "clntRef"
})
public class ReceiveInformation21 {

    @XmlElement(name = "Trfee")
    protected PartyIdentification139 trfee;
    @XmlElement(name = "TrfeeRegdAcct")
    protected Account31 trfeeRegdAcct;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary43> intrmyInf;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DmtrlsdInd")
    protected Boolean dmtrlsdInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference2Code incmPref;
    @XmlElement(name = "BnfcryCertfctnCmpltn")
    @XmlSchemaType(name = "string")
    protected BeneficiaryCertificationCompletion1Code bnfcryCertfctnCmpltn;
    @XmlElement(name = "ReqdTradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdTradDt;
    @XmlElement(name = "ReqdSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "StmpDty")
    @XmlSchemaType(name = "string")
    protected StampDutyType2Code stmpDty;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "Fees")
    protected List<Fees2> fees;
    @XmlElement(name = "IndvTax")
    protected List<Tax38> indvTax;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms37> fxDtls;
    @XmlElement(name = "SttlmPtiesDtls")
    protected FundSettlementParameters16 sttlmPtiesDtls;
    @XmlElement(name = "PhysTrf")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType1Code physTrf;
    @XmlElement(name = "PhysTrfDtls")
    protected DeliveryParameters4 physTrfDtls;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;

    /**
     * Gets the value of the trfee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getTrfee() {
        return trfee;
    }

    /**
     * Sets the value of the trfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setTrfee(PartyIdentification139 value) {
        this.trfee = value;
    }

    /**
     * Gets the value of the trfeeRegdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account31 }
     *     
     */
    public Account31 getTrfeeRegdAcct() {
        return trfeeRegdAcct;
    }

    /**
     * Sets the value of the trfeeRegdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account31 }
     *     
     */
    public void setTrfeeRegdAcct(Account31 value) {
        this.trfeeRegdAcct = value;
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
     * {@link Intermediary43 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary43> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public void setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
    }

    /**
     * Gets the value of the dmtrlsdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmtrlsdInd() {
        return dmtrlsdInd;
    }

    /**
     * Sets the value of the dmtrlsdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDmtrlsdInd(Boolean value) {
        this.dmtrlsdInd = value;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference2Code }
     *     
     */
    public IncomePreference2Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference2Code }
     *     
     */
    public void setIncmPref(IncomePreference2Code value) {
        this.incmPref = value;
    }

    /**
     * Gets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public BeneficiaryCertificationCompletion1Code getBnfcryCertfctnCmpltn() {
        return bnfcryCertfctnCmpltn;
    }

    /**
     * Sets the value of the bnfcryCertfctnCmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryCertificationCompletion1Code }
     *     
     */
    public void setBnfcryCertfctnCmpltn(BeneficiaryCertificationCompletion1Code value) {
        this.bnfcryCertfctnCmpltn = value;
    }

    /**
     * Gets the value of the reqdTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdTradDt() {
        return reqdTradDt;
    }

    /**
     * Sets the value of the reqdTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdTradDt(XMLGregorianCalendar value) {
        this.reqdTradDt = value;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link StampDutyType2Code }
     *     
     */
    public StampDutyType2Code getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link StampDutyType2Code }
     *     
     */
    public void setStmpDty(StampDutyType2Code value) {
        this.stmpDty = value;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fees2 }
     * 
     * 
     * @return
     *     The value of the fees property.
     */
    public List<Fees2> getFees() {
        if (fees == null) {
            fees = new ArrayList<>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the indvTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax38 }
     * 
     * 
     * @return
     *     The value of the indvTax property.
     */
    public List<Tax38> getIndvTax() {
        if (indvTax == null) {
            indvTax = new ArrayList<>();
        }
        return this.indvTax;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms37 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms37> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters16 }
     *     
     */
    public FundSettlementParameters16 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters16 }
     *     
     */
    public void setSttlmPtiesDtls(FundSettlementParameters16 value) {
        this.sttlmPtiesDtls = value;
    }

    /**
     * Gets the value of the physTrf property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public PhysicalTransferType1Code getPhysTrf() {
        return physTrf;
    }

    /**
     * Sets the value of the physTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public void setPhysTrf(PhysicalTransferType1Code value) {
        this.physTrf = value;
    }

    /**
     * Gets the value of the physTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public DeliveryParameters4 getPhysTrfDtls() {
        return physTrfDtls;
    }

    /**
     * Sets the value of the physTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public void setPhysTrfDtls(DeliveryParameters4 value) {
        this.physTrfDtls = value;
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

}
