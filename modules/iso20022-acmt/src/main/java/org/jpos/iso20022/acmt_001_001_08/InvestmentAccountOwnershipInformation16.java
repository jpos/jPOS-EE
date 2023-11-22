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

package org.jpos.iso20022.acmt_001_001_08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccountOwnershipInformation16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentAccountOwnershipInformation16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Party47Choice"/>
 *         <element name="MnyLndrgChck" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}MoneyLaunderingCheck1Choice" minOccurs="0"/>
 *         <element name="InvstrPrflVldtn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PartyProfileInformation5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OwnrshBnfcryRate" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}OwnershipBeneficiaryRate1" minOccurs="0"/>
 *         <element name="ClntId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max35Text" minOccurs="0"/>
 *         <element name="FsclXmptn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="SgntryRghtInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="MiFIDClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}MiFIDClassification1" minOccurs="0"/>
 *         <element name="Ntfctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Notification2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FATCAFormTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FATCAForm1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FATCASts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}FATCAStatus2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FATCARptgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ISODate" minOccurs="0"/>
 *         <element name="CRSFormTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CRSForm1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CRSSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CRSStatus4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CRSRptgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ISODate" minOccurs="0"/>
 *         <element name="OthrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}GenericIdentification82" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxXmptn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}TaxExemptionReason2Choice" minOccurs="0"/>
 *         <element name="TaxRptg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}TaxReporting3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}LanguageCode" minOccurs="0"/>
 *         <element name="MailTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}MailType1Choice" minOccurs="0"/>
 *         <element name="CtryAndResdtlSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CountryAndResidentialStatusType2" minOccurs="0"/>
 *         <element name="MntryWlth" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DateAndAmount1" minOccurs="0"/>
 *         <element name="EqtyVal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DateAndAmount1" minOccurs="0"/>
 *         <element name="WorkgCptl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DateAndAmount1" minOccurs="0"/>
 *         <element name="CpnyLk" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CompanyLink1Choice" minOccurs="0"/>
 *         <element name="ElctrncMlngSvcRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Max350Text" minOccurs="0"/>
 *         <element name="PmryComAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CommunicationAddress6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndryComAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CommunicationAddress6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlRgltryInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}RegulatoryInformation1" minOccurs="0"/>
 *         <element name="AcctgSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}AccountingStatus1Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}AdditiononalInformation13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtrlgPty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountOwnershipInformation16", propOrder = {
    "pty",
    "mnyLndrgChck",
    "invstrPrflVldtn",
    "ownrshBnfcryRate",
    "clntId",
    "fsclXmptn",
    "sgntryRghtInd",
    "miFIDClssfctn",
    "ntfctn",
    "fatcaFormTp",
    "fatcaSts",
    "fatcaRptgDt",
    "crsFormTp",
    "crsSts",
    "crsRptgDt",
    "othrId",
    "taxXmptn",
    "taxRptg",
    "lang",
    "mailTp",
    "ctryAndResdtlSts",
    "mntryWlth",
    "eqtyVal",
    "workgCptl",
    "cpnyLk",
    "elctrncMlngSvcRef",
    "pmryComAdr",
    "scndryComAdr",
    "addtlRgltryInf",
    "acctgSts",
    "addtlInf",
    "ctrlgPty"
})
public class InvestmentAccountOwnershipInformation16 {

    @XmlElement(name = "Pty", required = true)
    protected Party47Choice pty;
    @XmlElement(name = "MnyLndrgChck")
    protected MoneyLaunderingCheck1Choice mnyLndrgChck;
    @XmlElement(name = "InvstrPrflVldtn")
    protected List<PartyProfileInformation5> invstrPrflVldtn;
    @XmlElement(name = "OwnrshBnfcryRate")
    protected OwnershipBeneficiaryRate1 ownrshBnfcryRate;
    @XmlElement(name = "ClntId")
    protected String clntId;
    @XmlElement(name = "FsclXmptn")
    protected Boolean fsclXmptn;
    @XmlElement(name = "SgntryRghtInd")
    protected Boolean sgntryRghtInd;
    @XmlElement(name = "MiFIDClssfctn")
    protected MiFIDClassification1 miFIDClssfctn;
    @XmlElement(name = "Ntfctn")
    protected List<Notification2> ntfctn;
    @XmlElement(name = "FATCAFormTp")
    protected List<FATCAForm1Choice> fatcaFormTp;
    @XmlElement(name = "FATCASts")
    protected List<FATCAStatus2> fatcaSts;
    @XmlElement(name = "FATCARptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fatcaRptgDt;
    @XmlElement(name = "CRSFormTp")
    protected List<CRSForm1Choice> crsFormTp;
    @XmlElement(name = "CRSSts")
    protected List<CRSStatus4> crsSts;
    @XmlElement(name = "CRSRptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crsRptgDt;
    @XmlElement(name = "OthrId")
    protected List<GenericIdentification82> othrId;
    @XmlElement(name = "TaxXmptn")
    protected TaxExemptionReason2Choice taxXmptn;
    @XmlElement(name = "TaxRptg")
    protected List<TaxReporting3> taxRptg;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "MailTp")
    protected MailType1Choice mailTp;
    @XmlElement(name = "CtryAndResdtlSts")
    protected CountryAndResidentialStatusType2 ctryAndResdtlSts;
    @XmlElement(name = "MntryWlth")
    protected DateAndAmount1 mntryWlth;
    @XmlElement(name = "EqtyVal")
    protected DateAndAmount1 eqtyVal;
    @XmlElement(name = "WorkgCptl")
    protected DateAndAmount1 workgCptl;
    @XmlElement(name = "CpnyLk")
    protected CompanyLink1Choice cpnyLk;
    @XmlElement(name = "ElctrncMlngSvcRef")
    protected String elctrncMlngSvcRef;
    @XmlElement(name = "PmryComAdr")
    protected List<CommunicationAddress6> pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected List<CommunicationAddress6> scndryComAdr;
    @XmlElement(name = "AddtlRgltryInf")
    protected RegulatoryInformation1 addtlRgltryInf;
    @XmlElement(name = "AcctgSts")
    protected AccountingStatus1Choice acctgSts;
    @XmlElement(name = "AddtlInf")
    protected List<AdditiononalInformation13> addtlInf;
    @XmlElement(name = "CtrlgPty")
    protected Boolean ctrlgPty;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link Party47Choice }
     *     
     */
    public Party47Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party47Choice }
     *     
     */
    public void setPty(Party47Choice value) {
        this.pty = value;
    }

    /**
     * Gets the value of the mnyLndrgChck property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyLaunderingCheck1Choice }
     *     
     */
    public MoneyLaunderingCheck1Choice getMnyLndrgChck() {
        return mnyLndrgChck;
    }

    /**
     * Sets the value of the mnyLndrgChck property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyLaunderingCheck1Choice }
     *     
     */
    public void setMnyLndrgChck(MoneyLaunderingCheck1Choice value) {
        this.mnyLndrgChck = value;
    }

    /**
     * Gets the value of the invstrPrflVldtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrPrflVldtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrPrflVldtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyProfileInformation5 }
     * 
     * 
     * @return
     *     The value of the invstrPrflVldtn property.
     */
    public List<PartyProfileInformation5> getInvstrPrflVldtn() {
        if (invstrPrflVldtn == null) {
            invstrPrflVldtn = new ArrayList<>();
        }
        return this.invstrPrflVldtn;
    }

    /**
     * Gets the value of the ownrshBnfcryRate property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipBeneficiaryRate1 }
     *     
     */
    public OwnershipBeneficiaryRate1 getOwnrshBnfcryRate() {
        return ownrshBnfcryRate;
    }

    /**
     * Sets the value of the ownrshBnfcryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipBeneficiaryRate1 }
     *     
     */
    public void setOwnrshBnfcryRate(OwnershipBeneficiaryRate1 value) {
        this.ownrshBnfcryRate = value;
    }

    /**
     * Gets the value of the clntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntId() {
        return clntId;
    }

    /**
     * Sets the value of the clntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntId(String value) {
        this.clntId = value;
    }

    /**
     * Gets the value of the fsclXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFsclXmptn() {
        return fsclXmptn;
    }

    /**
     * Sets the value of the fsclXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFsclXmptn(Boolean value) {
        this.fsclXmptn = value;
    }

    /**
     * Gets the value of the sgntryRghtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgntryRghtInd() {
        return sgntryRghtInd;
    }

    /**
     * Sets the value of the sgntryRghtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSgntryRghtInd(Boolean value) {
        this.sgntryRghtInd = value;
    }

    /**
     * Gets the value of the miFIDClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MiFIDClassification1 }
     *     
     */
    public MiFIDClassification1 getMiFIDClssfctn() {
        return miFIDClssfctn;
    }

    /**
     * Sets the value of the miFIDClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiFIDClassification1 }
     *     
     */
    public void setMiFIDClssfctn(MiFIDClassification1 value) {
        this.miFIDClssfctn = value;
    }

    /**
     * Gets the value of the ntfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification2 }
     * 
     * 
     * @return
     *     The value of the ntfctn property.
     */
    public List<Notification2> getNtfctn() {
        if (ntfctn == null) {
            ntfctn = new ArrayList<>();
        }
        return this.ntfctn;
    }

    /**
     * Gets the value of the fatcaFormTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fatcaFormTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFATCAFormTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATCAForm1Choice }
     * 
     * 
     * @return
     *     The value of the fatcaFormTp property.
     */
    public List<FATCAForm1Choice> getFATCAFormTp() {
        if (fatcaFormTp == null) {
            fatcaFormTp = new ArrayList<>();
        }
        return this.fatcaFormTp;
    }

    /**
     * Gets the value of the fatcaSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fatcaSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFATCASts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATCAStatus2 }
     * 
     * 
     * @return
     *     The value of the fatcaSts property.
     */
    public List<FATCAStatus2> getFATCASts() {
        if (fatcaSts == null) {
            fatcaSts = new ArrayList<>();
        }
        return this.fatcaSts;
    }

    /**
     * Gets the value of the fatcaRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFATCARptgDt() {
        return fatcaRptgDt;
    }

    /**
     * Sets the value of the fatcaRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFATCARptgDt(XMLGregorianCalendar value) {
        this.fatcaRptgDt = value;
    }

    /**
     * Gets the value of the crsFormTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crsFormTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRSFormTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRSForm1Choice }
     * 
     * 
     * @return
     *     The value of the crsFormTp property.
     */
    public List<CRSForm1Choice> getCRSFormTp() {
        if (crsFormTp == null) {
            crsFormTp = new ArrayList<>();
        }
        return this.crsFormTp;
    }

    /**
     * Gets the value of the crsSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crsSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRSSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRSStatus4 }
     * 
     * 
     * @return
     *     The value of the crsSts property.
     */
    public List<CRSStatus4> getCRSSts() {
        if (crsSts == null) {
            crsSts = new ArrayList<>();
        }
        return this.crsSts;
    }

    /**
     * Gets the value of the crsRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCRSRptgDt() {
        return crsRptgDt;
    }

    /**
     * Sets the value of the crsRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCRSRptgDt(XMLGregorianCalendar value) {
        this.crsRptgDt = value;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification82 }
     * 
     * 
     * @return
     *     The value of the othrId property.
     */
    public List<GenericIdentification82> getOthrId() {
        if (othrId == null) {
            othrId = new ArrayList<>();
        }
        return this.othrId;
    }

    /**
     * Gets the value of the taxXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public TaxExemptionReason2Choice getTaxXmptn() {
        return taxXmptn;
    }

    /**
     * Sets the value of the taxXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public void setTaxXmptn(TaxExemptionReason2Choice value) {
        this.taxXmptn = value;
    }

    /**
     * Gets the value of the taxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReporting3 }
     * 
     * 
     * @return
     *     The value of the taxRptg property.
     */
    public List<TaxReporting3> getTaxRptg() {
        if (taxRptg == null) {
            taxRptg = new ArrayList<>();
        }
        return this.taxRptg;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the mailTp property.
     * 
     * @return
     *     possible object is
     *     {@link MailType1Choice }
     *     
     */
    public MailType1Choice getMailTp() {
        return mailTp;
    }

    /**
     * Sets the value of the mailTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailType1Choice }
     *     
     */
    public void setMailTp(MailType1Choice value) {
        this.mailTp = value;
    }

    /**
     * Gets the value of the ctryAndResdtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CountryAndResidentialStatusType2 }
     *     
     */
    public CountryAndResidentialStatusType2 getCtryAndResdtlSts() {
        return ctryAndResdtlSts;
    }

    /**
     * Sets the value of the ctryAndResdtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryAndResidentialStatusType2 }
     *     
     */
    public void setCtryAndResdtlSts(CountryAndResidentialStatusType2 value) {
        this.ctryAndResdtlSts = value;
    }

    /**
     * Gets the value of the mntryWlth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount1 }
     *     
     */
    public DateAndAmount1 getMntryWlth() {
        return mntryWlth;
    }

    /**
     * Sets the value of the mntryWlth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount1 }
     *     
     */
    public void setMntryWlth(DateAndAmount1 value) {
        this.mntryWlth = value;
    }

    /**
     * Gets the value of the eqtyVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount1 }
     *     
     */
    public DateAndAmount1 getEqtyVal() {
        return eqtyVal;
    }

    /**
     * Sets the value of the eqtyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount1 }
     *     
     */
    public void setEqtyVal(DateAndAmount1 value) {
        this.eqtyVal = value;
    }

    /**
     * Gets the value of the workgCptl property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount1 }
     *     
     */
    public DateAndAmount1 getWorkgCptl() {
        return workgCptl;
    }

    /**
     * Sets the value of the workgCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount1 }
     *     
     */
    public void setWorkgCptl(DateAndAmount1 value) {
        this.workgCptl = value;
    }

    /**
     * Gets the value of the cpnyLk property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLink1Choice }
     *     
     */
    public CompanyLink1Choice getCpnyLk() {
        return cpnyLk;
    }

    /**
     * Sets the value of the cpnyLk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLink1Choice }
     *     
     */
    public void setCpnyLk(CompanyLink1Choice value) {
        this.cpnyLk = value;
    }

    /**
     * Gets the value of the elctrncMlngSvcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncMlngSvcRef() {
        return elctrncMlngSvcRef;
    }

    /**
     * Sets the value of the elctrncMlngSvcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElctrncMlngSvcRef(String value) {
        this.elctrncMlngSvcRef = value;
    }

    /**
     * Gets the value of the pmryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     * @return
     *     The value of the pmryComAdr property.
     */
    public List<CommunicationAddress6> getPmryComAdr() {
        if (pmryComAdr == null) {
            pmryComAdr = new ArrayList<>();
        }
        return this.pmryComAdr;
    }

    /**
     * Gets the value of the scndryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     * @return
     *     The value of the scndryComAdr property.
     */
    public List<CommunicationAddress6> getScndryComAdr() {
        if (scndryComAdr == null) {
            scndryComAdr = new ArrayList<>();
        }
        return this.scndryComAdr;
    }

    /**
     * Gets the value of the addtlRgltryInf property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryInformation1 }
     *     
     */
    public RegulatoryInformation1 getAddtlRgltryInf() {
        return addtlRgltryInf;
    }

    /**
     * Sets the value of the addtlRgltryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryInformation1 }
     *     
     */
    public void setAddtlRgltryInf(RegulatoryInformation1 value) {
        this.addtlRgltryInf = value;
    }

    /**
     * Gets the value of the acctgSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public AccountingStatus1Choice getAcctgSts() {
        return acctgSts;
    }

    /**
     * Sets the value of the acctgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public void setAcctgSts(AccountingStatus1Choice value) {
        this.acctgSts = value;
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
     * {@link AdditiononalInformation13 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditiononalInformation13> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the ctrlgPty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrlgPty() {
        return ctrlgPty;
    }

    /**
     * Sets the value of the ctrlgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCtrlgPty(Boolean value) {
        this.ctrlgPty = value;
    }

}
