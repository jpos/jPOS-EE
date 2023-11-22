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

package org.jpos.iso20022.sese_003_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccount70 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentAccount70">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OwnrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}PartyIdentification139" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}Max35Text"/>
 *         <element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}Max35Text" minOccurs="0"/>
 *         <element name="AcctDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}Max35Text" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}PartyIdentification139" minOccurs="0"/>
 *         <element name="SubAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}SubAccount5" minOccurs="0"/>
 *         <element name="IntrmyInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}Intermediary43" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctiesForm" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}FormOfSecurity1Code" minOccurs="0"/>
 *         <element name="DmtrlsdInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}IncomePreference2Code" minOccurs="0"/>
 *         <element name="BnfcryCertfctnCmpltn" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}BeneficiaryCertificationCompletion1Code" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}SafekeepingPlaceFormat28Choice" minOccurs="0"/>
 *         <element name="SttlmPtiesDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}FundSettlementParameters15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount70", propOrder = {
    "ownrId",
    "acctId",
    "acctNm",
    "acctDsgnt",
    "acctSvcr",
    "subAcctDtls",
    "intrmyInf",
    "sctiesForm",
    "dmtrlsdInd",
    "incmPref",
    "bnfcryCertfctnCmpltn",
    "sfkpgPlc",
    "sttlmPtiesDtls"
})
public class InvestmentAccount70 {

    @XmlElement(name = "OwnrId")
    protected List<PartyIdentification139> ownrId;
    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification139 acctSvcr;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount5 subAcctDtls;
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
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat28Choice sfkpgPlc;
    @XmlElement(name = "SttlmPtiesDtls")
    protected FundSettlementParameters15 sttlmPtiesDtls;

    /**
     * Gets the value of the ownrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ownrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification139 }
     * 
     * 
     * @return
     *     The value of the ownrId property.
     */
    public List<PartyIdentification139> getOwnrId() {
        if (ownrId == null) {
            ownrId = new ArrayList<>();
        }
        return this.ownrId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNm(String value) {
        this.acctNm = value;
    }

    /**
     * Gets the value of the acctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Sets the value of the acctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDsgnt(String value) {
        this.acctDsgnt = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setAcctSvcr(PartyIdentification139 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount5 }
     *     
     */
    public SubAccount5 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount5 }
     *     
     */
    public void setSubAcctDtls(SubAccount5 value) {
        this.subAcctDtls = value;
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
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters15 }
     *     
     */
    public FundSettlementParameters15 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters15 }
     *     
     */
    public void setSttlmPtiesDtls(FundSettlementParameters15 value) {
        this.sttlmPtiesDtls = value;
    }

}
