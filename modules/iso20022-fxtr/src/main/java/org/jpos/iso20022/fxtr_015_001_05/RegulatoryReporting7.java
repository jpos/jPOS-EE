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

package org.jpos.iso20022.fxtr_015_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatoryReporting7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RegulatoryReporting7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradgSdTxRptg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}TradingSideTransactionReporting2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CtrPtySdTxRptg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}CounterpartySideTransactionReporting2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CntrlCtrPtyClrHs" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="ClrBrkr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="ClrXcptnPty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="ClrBrkrId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}ClearingBrokerIdentification1" minOccurs="0"/>
 *         <element name="ClrThrshldInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="ClrdPdctId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="UndrlygPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}UnderlyingProductIdentifier1Code" minOccurs="0"/>
 *         <element name="AllcnInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}AllocationIndicator1Code" minOccurs="0"/>
 *         <element name="CollstnInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}CollateralisationIndicator1Code" minOccurs="0"/>
 *         <element name="ExctnVn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="ExctnTmstmp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="NonStdFlg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="LkSwpId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Exact42Text" minOccurs="0"/>
 *         <element name="FinNtrOfTheCtrPtyInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="CollPrtflInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="CollPrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Max10Text" minOccurs="0"/>
 *         <element name="PrtflCmprssnInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="CorpSctrInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}CorporateSectorIdentifier1Code" minOccurs="0"/>
 *         <element name="TradWthNonEEACtrPtyInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="NtrgrpTradInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="ComrclOrTrsrFincgInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}SecurityIdentification19" minOccurs="0"/>
 *         <element name="ConfDtAndTmstmp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}ISODateTime" minOccurs="0"/>
 *         <element name="ClrTmstmp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}ISOTime" minOccurs="0"/>
 *         <element name="ComssnsAndFees" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}FXCommissionOrFee1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlRptgInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Max210Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting7", propOrder = {
    "tradgSdTxRptg",
    "ctrPtySdTxRptg",
    "cntrlCtrPtyClrHs",
    "clrBrkr",
    "clrXcptnPty",
    "clrBrkrId",
    "clrThrshldInd",
    "clrdPdctId",
    "undrlygPdctIdr",
    "allcnInd",
    "collstnInd",
    "exctnVn",
    "exctnTmstmp",
    "nonStdFlg",
    "lkSwpId",
    "finNtrOfTheCtrPtyInd",
    "collPrtflInd",
    "collPrtflCd",
    "prtflCmprssnInd",
    "corpSctrInd",
    "tradWthNonEEACtrPtyInd",
    "ntrgrpTradInd",
    "comrclOrTrsrFincgInd",
    "finInstrmId",
    "confDtAndTmstmp",
    "clrTmstmp",
    "comssnsAndFees",
    "addtlRptgInf"
})
public class RegulatoryReporting7 {

    @XmlElement(name = "TradgSdTxRptg")
    protected List<TradingSideTransactionReporting2> tradgSdTxRptg;
    @XmlElement(name = "CtrPtySdTxRptg")
    protected List<CounterpartySideTransactionReporting2> ctrPtySdTxRptg;
    @XmlElement(name = "CntrlCtrPtyClrHs")
    protected PartyIdentification242Choice cntrlCtrPtyClrHs;
    @XmlElement(name = "ClrBrkr")
    protected PartyIdentification242Choice clrBrkr;
    @XmlElement(name = "ClrXcptnPty")
    protected PartyIdentification242Choice clrXcptnPty;
    @XmlElement(name = "ClrBrkrId")
    protected ClearingBrokerIdentification1 clrBrkrId;
    @XmlElement(name = "ClrThrshldInd")
    protected Boolean clrThrshldInd;
    @XmlElement(name = "ClrdPdctId")
    protected String clrdPdctId;
    @XmlElement(name = "UndrlygPdctIdr")
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code undrlygPdctIdr;
    @XmlElement(name = "AllcnInd")
    @XmlSchemaType(name = "string")
    protected AllocationIndicator1Code allcnInd;
    @XmlElement(name = "CollstnInd")
    @XmlSchemaType(name = "string")
    protected CollateralisationIndicator1Code collstnInd;
    @XmlElement(name = "ExctnVn")
    protected String exctnVn;
    @XmlElement(name = "ExctnTmstmp")
    protected DateAndDateTime2Choice exctnTmstmp;
    @XmlElement(name = "NonStdFlg")
    protected Boolean nonStdFlg;
    @XmlElement(name = "LkSwpId")
    protected String lkSwpId;
    @XmlElement(name = "FinNtrOfTheCtrPtyInd")
    protected Boolean finNtrOfTheCtrPtyInd;
    @XmlElement(name = "CollPrtflInd")
    protected Boolean collPrtflInd;
    @XmlElement(name = "CollPrtflCd")
    protected String collPrtflCd;
    @XmlElement(name = "PrtflCmprssnInd")
    protected Boolean prtflCmprssnInd;
    @XmlElement(name = "CorpSctrInd")
    @XmlSchemaType(name = "string")
    protected CorporateSectorIdentifier1Code corpSctrInd;
    @XmlElement(name = "TradWthNonEEACtrPtyInd")
    protected Boolean tradWthNonEEACtrPtyInd;
    @XmlElement(name = "NtrgrpTradInd")
    protected Boolean ntrgrpTradInd;
    @XmlElement(name = "ComrclOrTrsrFincgInd")
    protected Boolean comrclOrTrsrFincgInd;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ConfDtAndTmstmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confDtAndTmstmp;
    @XmlElement(name = "ClrTmstmp")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar clrTmstmp;
    @XmlElement(name = "ComssnsAndFees")
    protected List<FXCommissionOrFee1> comssnsAndFees;
    @XmlElement(name = "AddtlRptgInf")
    protected String addtlRptgInf;

    /**
     * Gets the value of the tradgSdTxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgSdTxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgSdTxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingSideTransactionReporting2 }
     * 
     * 
     * @return
     *     The value of the tradgSdTxRptg property.
     */
    public List<TradingSideTransactionReporting2> getTradgSdTxRptg() {
        if (tradgSdTxRptg == null) {
            tradgSdTxRptg = new ArrayList<>();
        }
        return this.tradgSdTxRptg;
    }

    /**
     * Gets the value of the ctrPtySdTxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtySdTxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtySdTxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartySideTransactionReporting2 }
     * 
     * 
     * @return
     *     The value of the ctrPtySdTxRptg property.
     */
    public List<CounterpartySideTransactionReporting2> getCtrPtySdTxRptg() {
        if (ctrPtySdTxRptg == null) {
            ctrPtySdTxRptg = new ArrayList<>();
        }
        return this.ctrPtySdTxRptg;
    }

    /**
     * Gets the value of the cntrlCtrPtyClrHs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getCntrlCtrPtyClrHs() {
        return cntrlCtrPtyClrHs;
    }

    /**
     * Sets the value of the cntrlCtrPtyClrHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setCntrlCtrPtyClrHs(PartyIdentification242Choice value) {
        this.cntrlCtrPtyClrHs = value;
    }

    /**
     * Gets the value of the clrBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getClrBrkr() {
        return clrBrkr;
    }

    /**
     * Sets the value of the clrBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setClrBrkr(PartyIdentification242Choice value) {
        this.clrBrkr = value;
    }

    /**
     * Gets the value of the clrXcptnPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getClrXcptnPty() {
        return clrXcptnPty;
    }

    /**
     * Sets the value of the clrXcptnPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setClrXcptnPty(PartyIdentification242Choice value) {
        this.clrXcptnPty = value;
    }

    /**
     * Gets the value of the clrBrkrId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingBrokerIdentification1 }
     *     
     */
    public ClearingBrokerIdentification1 getClrBrkrId() {
        return clrBrkrId;
    }

    /**
     * Sets the value of the clrBrkrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingBrokerIdentification1 }
     *     
     */
    public void setClrBrkrId(ClearingBrokerIdentification1 value) {
        this.clrBrkrId = value;
    }

    /**
     * Gets the value of the clrThrshldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrThrshldInd() {
        return clrThrshldInd;
    }

    /**
     * Sets the value of the clrThrshldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClrThrshldInd(Boolean value) {
        this.clrThrshldInd = value;
    }

    /**
     * Gets the value of the clrdPdctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrdPdctId() {
        return clrdPdctId;
    }

    /**
     * Sets the value of the clrdPdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrdPdctId(String value) {
        this.clrdPdctId = value;
    }

    /**
     * Gets the value of the undrlygPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getUndrlygPdctIdr() {
        return undrlygPdctIdr;
    }

    /**
     * Sets the value of the undrlygPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public void setUndrlygPdctIdr(UnderlyingProductIdentifier1Code value) {
        this.undrlygPdctIdr = value;
    }

    /**
     * Gets the value of the allcnInd property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public AllocationIndicator1Code getAllcnInd() {
        return allcnInd;
    }

    /**
     * Sets the value of the allcnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public void setAllcnInd(AllocationIndicator1Code value) {
        this.allcnInd = value;
    }

    /**
     * Gets the value of the collstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationIndicator1Code }
     *     
     */
    public CollateralisationIndicator1Code getCollstnInd() {
        return collstnInd;
    }

    /**
     * Sets the value of the collstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationIndicator1Code }
     *     
     */
    public void setCollstnInd(CollateralisationIndicator1Code value) {
        this.collstnInd = value;
    }

    /**
     * Gets the value of the exctnVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctnVn() {
        return exctnVn;
    }

    /**
     * Sets the value of the exctnVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExctnVn(String value) {
        this.exctnVn = value;
    }

    /**
     * Gets the value of the exctnTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getExctnTmstmp() {
        return exctnTmstmp;
    }

    /**
     * Sets the value of the exctnTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setExctnTmstmp(DateAndDateTime2Choice value) {
        this.exctnTmstmp = value;
    }

    /**
     * Gets the value of the nonStdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStdFlg() {
        return nonStdFlg;
    }

    /**
     * Sets the value of the nonStdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStdFlg(Boolean value) {
        this.nonStdFlg = value;
    }

    /**
     * Gets the value of the lkSwpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkSwpId() {
        return lkSwpId;
    }

    /**
     * Sets the value of the lkSwpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkSwpId(String value) {
        this.lkSwpId = value;
    }

    /**
     * Gets the value of the finNtrOfTheCtrPtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinNtrOfTheCtrPtyInd() {
        return finNtrOfTheCtrPtyInd;
    }

    /**
     * Sets the value of the finNtrOfTheCtrPtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinNtrOfTheCtrPtyInd(Boolean value) {
        this.finNtrOfTheCtrPtyInd = value;
    }

    /**
     * Gets the value of the collPrtflInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollPrtflInd() {
        return collPrtflInd;
    }

    /**
     * Sets the value of the collPrtflInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollPrtflInd(Boolean value) {
        this.collPrtflInd = value;
    }

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollPrtflCd(String value) {
        this.collPrtflCd = value;
    }

    /**
     * Gets the value of the prtflCmprssnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtflCmprssnInd() {
        return prtflCmprssnInd;
    }

    /**
     * Sets the value of the prtflCmprssnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtflCmprssnInd(Boolean value) {
        this.prtflCmprssnInd = value;
    }

    /**
     * Gets the value of the corpSctrInd property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateSectorIdentifier1Code }
     *     
     */
    public CorporateSectorIdentifier1Code getCorpSctrInd() {
        return corpSctrInd;
    }

    /**
     * Sets the value of the corpSctrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateSectorIdentifier1Code }
     *     
     */
    public void setCorpSctrInd(CorporateSectorIdentifier1Code value) {
        this.corpSctrInd = value;
    }

    /**
     * Gets the value of the tradWthNonEEACtrPtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradWthNonEEACtrPtyInd() {
        return tradWthNonEEACtrPtyInd;
    }

    /**
     * Sets the value of the tradWthNonEEACtrPtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradWthNonEEACtrPtyInd(Boolean value) {
        this.tradWthNonEEACtrPtyInd = value;
    }

    /**
     * Gets the value of the ntrgrpTradInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtrgrpTradInd() {
        return ntrgrpTradInd;
    }

    /**
     * Sets the value of the ntrgrpTradInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtrgrpTradInd(Boolean value) {
        this.ntrgrpTradInd = value;
    }

    /**
     * Gets the value of the comrclOrTrsrFincgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComrclOrTrsrFincgInd() {
        return comrclOrTrsrFincgInd;
    }

    /**
     * Sets the value of the comrclOrTrsrFincgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComrclOrTrsrFincgInd(Boolean value) {
        this.comrclOrTrsrFincgInd = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the confDtAndTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfDtAndTmstmp() {
        return confDtAndTmstmp;
    }

    /**
     * Sets the value of the confDtAndTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfDtAndTmstmp(XMLGregorianCalendar value) {
        this.confDtAndTmstmp = value;
    }

    /**
     * Gets the value of the clrTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClrTmstmp() {
        return clrTmstmp;
    }

    /**
     * Sets the value of the clrTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClrTmstmp(XMLGregorianCalendar value) {
        this.clrTmstmp = value;
    }

    /**
     * Gets the value of the comssnsAndFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnsAndFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnsAndFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FXCommissionOrFee1 }
     * 
     * 
     * @return
     *     The value of the comssnsAndFees property.
     */
    public List<FXCommissionOrFee1> getComssnsAndFees() {
        if (comssnsAndFees == null) {
            comssnsAndFees = new ArrayList<>();
        }
        return this.comssnsAndFees;
    }

    /**
     * Gets the value of the addtlRptgInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRptgInf() {
        return addtlRptgInf;
    }

    /**
     * Sets the value of the addtlRptgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRptgInf(String value) {
        this.addtlRptgInf = value;
    }

}
