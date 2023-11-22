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

package org.jpos.iso20022.sese_018_001_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxEfficientProduct7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxEfficientProduct7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxEffcntPdctTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}TaxEfficientProductType2Choice"/>
 *         <element name="CurYr" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="CshCmpntInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrvsYrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}PreviousYear4" minOccurs="0"/>
 *         <element name="PrvsYrSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="PrvsYrsSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="DtOfFrstSbcpt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ISODate" minOccurs="0"/>
 *         <element name="CurYrSbcptDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}SubscriptionInformation2" minOccurs="0"/>
 *         <element name="BnsOrWdrwl" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}BonusWithdrawal2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WdrwlForResdtlPurchsPrgrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="TrfrAltrnId" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TtlSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OthrAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}OtherAmount3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DtFrstQlfygAddtn" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ISODate" minOccurs="0"/>
 *         <element name="InvstrTaxRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}TaxReference2" minOccurs="0"/>
 *         <element name="InvstmtsToFllwVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}DateAndAmount2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InnvtvFinc" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}InnovativeFinance1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LwstInvstdAmtCurYr" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="TaxClctnBase" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="UusdTaxDdctn" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="CurInvstmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="EstmtdVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}DateAndAmount2" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxEfficientProduct7", propOrder = {
    "taxEffcntPdctTp",
    "curYr",
    "cshCmpntInd",
    "prvsYrs",
    "prvsYrSbcptAmt",
    "prvsYrsSbcptAmt",
    "dtOfFrstSbcpt",
    "curYrSbcptDtls",
    "bnsOrWdrwl",
    "wdrwlForResdtlPurchsPrgrs",
    "trfrAltrnId",
    "ttlSbcptAmt",
    "othrAmt",
    "dtFrstQlfygAddtn",
    "invstrTaxRef",
    "invstmtsToFllwVal",
    "innvtvFinc",
    "lwstInvstdAmtCurYr",
    "taxClctnBase",
    "uusdTaxDdctn",
    "curInvstmtAmt",
    "estmtdVal",
    "addtlInf"
})
public class TaxEfficientProduct7 {

    @XmlElement(name = "TaxEffcntPdctTp", required = true)
    protected TaxEfficientProductType2Choice taxEffcntPdctTp;
    @XmlElement(name = "CurYr")
    protected Boolean curYr;
    @XmlElement(name = "CshCmpntInd")
    protected Boolean cshCmpntInd;
    @XmlElement(name = "PrvsYrs")
    protected PreviousYear4 prvsYrs;
    @XmlElement(name = "PrvsYrSbcptAmt")
    protected ActiveCurrencyAnd13DecimalAmount prvsYrSbcptAmt;
    @XmlElement(name = "PrvsYrsSbcptAmt")
    protected ActiveCurrencyAnd13DecimalAmount prvsYrsSbcptAmt;
    @XmlElement(name = "DtOfFrstSbcpt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfFrstSbcpt;
    @XmlElement(name = "CurYrSbcptDtls")
    protected SubscriptionInformation2 curYrSbcptDtls;
    @XmlElement(name = "BnsOrWdrwl")
    protected List<BonusWithdrawal2> bnsOrWdrwl;
    @XmlElement(name = "WdrwlForResdtlPurchsPrgrs")
    protected Boolean wdrwlForResdtlPurchsPrgrs;
    @XmlElement(name = "TrfrAltrnId")
    protected String trfrAltrnId;
    @XmlElement(name = "TtlSbcptAmt")
    protected ActiveCurrencyAndAmount ttlSbcptAmt;
    @XmlElement(name = "OthrAmt")
    protected List<OtherAmount3> othrAmt;
    @XmlElement(name = "DtFrstQlfygAddtn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtFrstQlfygAddtn;
    @XmlElement(name = "InvstrTaxRef")
    protected TaxReference2 invstrTaxRef;
    @XmlElement(name = "InvstmtsToFllwVal")
    protected List<DateAndAmount2> invstmtsToFllwVal;
    @XmlElement(name = "InnvtvFinc")
    protected List<InnovativeFinance1> innvtvFinc;
    @XmlElement(name = "LwstInvstdAmtCurYr")
    protected ActiveCurrencyAnd13DecimalAmount lwstInvstdAmtCurYr;
    @XmlElement(name = "TaxClctnBase")
    protected ActiveCurrencyAnd13DecimalAmount taxClctnBase;
    @XmlElement(name = "UusdTaxDdctn")
    protected ActiveCurrencyAnd13DecimalAmount uusdTaxDdctn;
    @XmlElement(name = "CurInvstmtAmt")
    protected ActiveCurrencyAnd13DecimalAmount curInvstmtAmt;
    @XmlElement(name = "EstmtdVal")
    protected DateAndAmount2 estmtdVal;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the taxEffcntPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEfficientProductType2Choice }
     *     
     */
    public TaxEfficientProductType2Choice getTaxEffcntPdctTp() {
        return taxEffcntPdctTp;
    }

    /**
     * Sets the value of the taxEffcntPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEfficientProductType2Choice }
     *     
     */
    public void setTaxEffcntPdctTp(TaxEfficientProductType2Choice value) {
        this.taxEffcntPdctTp = value;
    }

    /**
     * Gets the value of the curYr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurYr() {
        return curYr;
    }

    /**
     * Sets the value of the curYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurYr(Boolean value) {
        this.curYr = value;
    }

    /**
     * Gets the value of the cshCmpntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshCmpntInd() {
        return cshCmpntInd;
    }

    /**
     * Sets the value of the cshCmpntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCshCmpntInd(Boolean value) {
        this.cshCmpntInd = value;
    }

    /**
     * Gets the value of the prvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear4 }
     *     
     */
    public PreviousYear4 getPrvsYrs() {
        return prvsYrs;
    }

    /**
     * Sets the value of the prvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear4 }
     *     
     */
    public void setPrvsYrs(PreviousYear4 value) {
        this.prvsYrs = value;
    }

    /**
     * Gets the value of the prvsYrSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPrvsYrSbcptAmt() {
        return prvsYrSbcptAmt;
    }

    /**
     * Sets the value of the prvsYrSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setPrvsYrSbcptAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.prvsYrSbcptAmt = value;
    }

    /**
     * Gets the value of the prvsYrsSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPrvsYrsSbcptAmt() {
        return prvsYrsSbcptAmt;
    }

    /**
     * Sets the value of the prvsYrsSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setPrvsYrsSbcptAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.prvsYrsSbcptAmt = value;
    }

    /**
     * Gets the value of the dtOfFrstSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfFrstSbcpt() {
        return dtOfFrstSbcpt;
    }

    /**
     * Sets the value of the dtOfFrstSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfFrstSbcpt(XMLGregorianCalendar value) {
        this.dtOfFrstSbcpt = value;
    }

    /**
     * Gets the value of the curYrSbcptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInformation2 }
     *     
     */
    public SubscriptionInformation2 getCurYrSbcptDtls() {
        return curYrSbcptDtls;
    }

    /**
     * Sets the value of the curYrSbcptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInformation2 }
     *     
     */
    public void setCurYrSbcptDtls(SubscriptionInformation2 value) {
        this.curYrSbcptDtls = value;
    }

    /**
     * Gets the value of the bnsOrWdrwl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnsOrWdrwl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnsOrWdrwl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BonusWithdrawal2 }
     * 
     * 
     * @return
     *     The value of the bnsOrWdrwl property.
     */
    public List<BonusWithdrawal2> getBnsOrWdrwl() {
        if (bnsOrWdrwl == null) {
            bnsOrWdrwl = new ArrayList<>();
        }
        return this.bnsOrWdrwl;
    }

    /**
     * Gets the value of the wdrwlForResdtlPurchsPrgrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWdrwlForResdtlPurchsPrgrs() {
        return wdrwlForResdtlPurchsPrgrs;
    }

    /**
     * Sets the value of the wdrwlForResdtlPurchsPrgrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWdrwlForResdtlPurchsPrgrs(Boolean value) {
        this.wdrwlForResdtlPurchsPrgrs = value;
    }

    /**
     * Gets the value of the trfrAltrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfrAltrnId() {
        return trfrAltrnId;
    }

    /**
     * Sets the value of the trfrAltrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfrAltrnId(String value) {
        this.trfrAltrnId = value;
    }

    /**
     * Gets the value of the ttlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlSbcptAmt() {
        return ttlSbcptAmt;
    }

    /**
     * Sets the value of the ttlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlSbcptAmt(ActiveCurrencyAndAmount value) {
        this.ttlSbcptAmt = value;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmount3 }
     * 
     * 
     * @return
     *     The value of the othrAmt property.
     */
    public List<OtherAmount3> getOthrAmt() {
        if (othrAmt == null) {
            othrAmt = new ArrayList<>();
        }
        return this.othrAmt;
    }

    /**
     * Gets the value of the dtFrstQlfygAddtn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFrstQlfygAddtn() {
        return dtFrstQlfygAddtn;
    }

    /**
     * Sets the value of the dtFrstQlfygAddtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFrstQlfygAddtn(XMLGregorianCalendar value) {
        this.dtFrstQlfygAddtn = value;
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
     * Gets the value of the invstmtsToFllwVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstmtsToFllwVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstmtsToFllwVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndAmount2 }
     * 
     * 
     * @return
     *     The value of the invstmtsToFllwVal property.
     */
    public List<DateAndAmount2> getInvstmtsToFllwVal() {
        if (invstmtsToFllwVal == null) {
            invstmtsToFllwVal = new ArrayList<>();
        }
        return this.invstmtsToFllwVal;
    }

    /**
     * Gets the value of the innvtvFinc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the innvtvFinc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnvtvFinc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InnovativeFinance1 }
     * 
     * 
     * @return
     *     The value of the innvtvFinc property.
     */
    public List<InnovativeFinance1> getInnvtvFinc() {
        if (innvtvFinc == null) {
            innvtvFinc = new ArrayList<>();
        }
        return this.innvtvFinc;
    }

    /**
     * Gets the value of the lwstInvstdAmtCurYr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getLwstInvstdAmtCurYr() {
        return lwstInvstdAmtCurYr;
    }

    /**
     * Sets the value of the lwstInvstdAmtCurYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setLwstInvstdAmtCurYr(ActiveCurrencyAnd13DecimalAmount value) {
        this.lwstInvstdAmtCurYr = value;
    }

    /**
     * Gets the value of the taxClctnBase property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTaxClctnBase() {
        return taxClctnBase;
    }

    /**
     * Sets the value of the taxClctnBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setTaxClctnBase(ActiveCurrencyAnd13DecimalAmount value) {
        this.taxClctnBase = value;
    }

    /**
     * Gets the value of the uusdTaxDdctn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getUusdTaxDdctn() {
        return uusdTaxDdctn;
    }

    /**
     * Sets the value of the uusdTaxDdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setUusdTaxDdctn(ActiveCurrencyAnd13DecimalAmount value) {
        this.uusdTaxDdctn = value;
    }

    /**
     * Gets the value of the curInvstmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCurInvstmtAmt() {
        return curInvstmtAmt;
    }

    /**
     * Sets the value of the curInvstmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setCurInvstmtAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.curInvstmtAmt = value;
    }

    /**
     * Gets the value of the estmtdVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getEstmtdVal() {
        return estmtdVal;
    }

    /**
     * Sets the value of the estmtdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public void setEstmtdVal(DateAndAmount2 value) {
        this.estmtdVal = value;
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
