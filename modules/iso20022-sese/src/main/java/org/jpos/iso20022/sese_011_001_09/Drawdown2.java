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
 * <p>Java class for Drawdown2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Drawdown2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Max140Text" minOccurs="0"/>
 *         <element name="TrchTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}DrawdownType2Choice"/>
 *         <element name="AplblRules" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ApplicableRules1Choice" minOccurs="0"/>
 *         <element name="InvstrTaxRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}TaxReference2" minOccurs="0"/>
 *         <element name="PctgOfTtlTrfVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PercentageRate" minOccurs="0"/>
 *         <element name="TtlAmtNetDrwdwn" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="AddtlFndsDsgntd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="PnsnCmcmntLumpSumRmng" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="PnsnCmcmntLumpSumDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
 *         <element name="MltplPnsnCmcmntLumpSums" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="LftmAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PercentageRate" minOccurs="0"/>
 *         <element name="RcptOfDrwdwnInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="BnfcryDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}BeneficiaryDrawdown1" minOccurs="0"/>
 *         <element name="CapdLmts" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Capped1" minOccurs="0"/>
 *         <element name="FlxblDrwdwnTrggrdDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
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
@XmlType(name = "Drawdown2", propOrder = {
    "id",
    "trchTp",
    "aplblRules",
    "invstrTaxRef",
    "pctgOfTtlTrfVal",
    "ttlAmtNetDrwdwn",
    "addtlFndsDsgntd",
    "pnsnCmcmntLumpSumRmng",
    "pnsnCmcmntLumpSumDt",
    "mltplPnsnCmcmntLumpSums",
    "lftmAllwnc",
    "rcptOfDrwdwnInd",
    "bnfcryDtls",
    "capdLmts",
    "flxblDrwdwnTrggrdDt",
    "addtlInf"
})
public class Drawdown2 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "TrchTp", required = true)
    protected DrawdownType2Choice trchTp;
    @XmlElement(name = "AplblRules")
    protected ApplicableRules1Choice aplblRules;
    @XmlElement(name = "InvstrTaxRef")
    protected TaxReference2 invstrTaxRef;
    @XmlElement(name = "PctgOfTtlTrfVal")
    protected BigDecimal pctgOfTtlTrfVal;
    @XmlElement(name = "TtlAmtNetDrwdwn")
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtNetDrwdwn;
    @XmlElement(name = "AddtlFndsDsgntd")
    protected Boolean addtlFndsDsgntd;
    @XmlElement(name = "PnsnCmcmntLumpSumRmng")
    protected ActiveCurrencyAnd13DecimalAmount pnsnCmcmntLumpSumRmng;
    @XmlElement(name = "PnsnCmcmntLumpSumDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pnsnCmcmntLumpSumDt;
    @XmlElement(name = "MltplPnsnCmcmntLumpSums")
    protected Boolean mltplPnsnCmcmntLumpSums;
    @XmlElement(name = "LftmAllwnc")
    protected BigDecimal lftmAllwnc;
    @XmlElement(name = "RcptOfDrwdwnInd")
    protected Boolean rcptOfDrwdwnInd;
    @XmlElement(name = "BnfcryDtls")
    protected BeneficiaryDrawdown1 bnfcryDtls;
    @XmlElement(name = "CapdLmts")
    protected Capped1 capdLmts;
    @XmlElement(name = "FlxblDrwdwnTrggrdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar flxblDrwdwnTrggrdDt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

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
     * Gets the value of the trchTp property.
     * 
     * @return
     *     possible object is
     *     {@link DrawdownType2Choice }
     *     
     */
    public DrawdownType2Choice getTrchTp() {
        return trchTp;
    }

    /**
     * Sets the value of the trchTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawdownType2Choice }
     *     
     */
    public void setTrchTp(DrawdownType2Choice value) {
        this.trchTp = value;
    }

    /**
     * Gets the value of the aplblRules property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicableRules1Choice }
     *     
     */
    public ApplicableRules1Choice getAplblRules() {
        return aplblRules;
    }

    /**
     * Sets the value of the aplblRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicableRules1Choice }
     *     
     */
    public void setAplblRules(ApplicableRules1Choice value) {
        this.aplblRules = value;
    }

    /**
     * Gets the value of the invstrTaxRef property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReference2 }
     *     
     */
    public TaxReference2 getInvstrTaxRef() {
        return invstrTaxRef;
    }

    /**
     * Sets the value of the invstrTaxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReference2 }
     *     
     */
    public void setInvstrTaxRef(TaxReference2 value) {
        this.invstrTaxRef = value;
    }

    /**
     * Gets the value of the pctgOfTtlTrfVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfTtlTrfVal() {
        return pctgOfTtlTrfVal;
    }

    /**
     * Sets the value of the pctgOfTtlTrfVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfTtlTrfVal(BigDecimal value) {
        this.pctgOfTtlTrfVal = value;
    }

    /**
     * Gets the value of the ttlAmtNetDrwdwn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtNetDrwdwn() {
        return ttlAmtNetDrwdwn;
    }

    /**
     * Sets the value of the ttlAmtNetDrwdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setTtlAmtNetDrwdwn(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtNetDrwdwn = value;
    }

    /**
     * Gets the value of the addtlFndsDsgntd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlFndsDsgntd() {
        return addtlFndsDsgntd;
    }

    /**
     * Sets the value of the addtlFndsDsgntd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddtlFndsDsgntd(Boolean value) {
        this.addtlFndsDsgntd = value;
    }

    /**
     * Gets the value of the pnsnCmcmntLumpSumRmng property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPnsnCmcmntLumpSumRmng() {
        return pnsnCmcmntLumpSumRmng;
    }

    /**
     * Sets the value of the pnsnCmcmntLumpSumRmng property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setPnsnCmcmntLumpSumRmng(ActiveCurrencyAnd13DecimalAmount value) {
        this.pnsnCmcmntLumpSumRmng = value;
    }

    /**
     * Gets the value of the pnsnCmcmntLumpSumDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPnsnCmcmntLumpSumDt() {
        return pnsnCmcmntLumpSumDt;
    }

    /**
     * Sets the value of the pnsnCmcmntLumpSumDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPnsnCmcmntLumpSumDt(XMLGregorianCalendar value) {
        this.pnsnCmcmntLumpSumDt = value;
    }

    /**
     * Gets the value of the mltplPnsnCmcmntLumpSums property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMltplPnsnCmcmntLumpSums() {
        return mltplPnsnCmcmntLumpSums;
    }

    /**
     * Sets the value of the mltplPnsnCmcmntLumpSums property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMltplPnsnCmcmntLumpSums(Boolean value) {
        this.mltplPnsnCmcmntLumpSums = value;
    }

    /**
     * Gets the value of the lftmAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLftmAllwnc() {
        return lftmAllwnc;
    }

    /**
     * Sets the value of the lftmAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLftmAllwnc(BigDecimal value) {
        this.lftmAllwnc = value;
    }

    /**
     * Gets the value of the rcptOfDrwdwnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcptOfDrwdwnInd() {
        return rcptOfDrwdwnInd;
    }

    /**
     * Sets the value of the rcptOfDrwdwnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRcptOfDrwdwnInd(Boolean value) {
        this.rcptOfDrwdwnInd = value;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryDrawdown1 }
     *     
     */
    public BeneficiaryDrawdown1 getBnfcryDtls() {
        return bnfcryDtls;
    }

    /**
     * Sets the value of the bnfcryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryDrawdown1 }
     *     
     */
    public void setBnfcryDtls(BeneficiaryDrawdown1 value) {
        this.bnfcryDtls = value;
    }

    /**
     * Gets the value of the capdLmts property.
     * 
     * @return
     *     possible object is
     *     {@link Capped1 }
     *     
     */
    public Capped1 getCapdLmts() {
        return capdLmts;
    }

    /**
     * Sets the value of the capdLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capped1 }
     *     
     */
    public void setCapdLmts(Capped1 value) {
        this.capdLmts = value;
    }

    /**
     * Gets the value of the flxblDrwdwnTrggrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlxblDrwdwnTrggrdDt() {
        return flxblDrwdwnTrggrdDt;
    }

    /**
     * Sets the value of the flxblDrwdwnTrggrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlxblDrwdwnTrggrdDt(XMLGregorianCalendar value) {
        this.flxblDrwdwnTrggrdDt = value;
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
