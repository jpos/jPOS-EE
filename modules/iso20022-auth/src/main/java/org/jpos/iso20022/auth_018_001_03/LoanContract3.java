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

package org.jpos.iso20022.auth_018_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanContract3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoanContract3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctDocId" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}DocumentIdentification22"/>
 *         <element name="LnTpId" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}TradeParty5" maxOccurs="unbounded"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}TradeParty5" maxOccurs="unbounded"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="PrlngtnFlg" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="SpclConds" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}SpecialCondition1" minOccurs="0"/>
 *         <element name="DrtnCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Exact1NumericText" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}InterestRate2Choice" minOccurs="0"/>
 *         <element name="Trch" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}LoanContractTranche1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtSchdl" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}PaymentSchedule1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrstSchdl" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}InterestPaymentSchedule1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntraCpnyLn" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}TrueFalseIndicator"/>
 *         <element name="Coll" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ContractCollateral1" minOccurs="0"/>
 *         <element name="SndctdLn" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}SyndicatedLoan2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Attchmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}DocumentGeneralInformation5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContract3", propOrder = {
    "ctrctDocId",
    "lnTpId",
    "buyr",
    "sellr",
    "amt",
    "mtrtyDt",
    "prlngtnFlg",
    "startDt",
    "sttlmCcy",
    "spclConds",
    "drtnCd",
    "intrstRate",
    "trch",
    "pmtSchdl",
    "intrstSchdl",
    "intraCpnyLn",
    "coll",
    "sndctdLn",
    "attchmnt"
})
public class LoanContract3 {

    @XmlElement(name = "CtrctDocId", required = true)
    protected DocumentIdentification22 ctrctDocId;
    @XmlElement(name = "LnTpId")
    protected String lnTpId;
    @XmlElement(name = "Buyr", required = true)
    protected List<TradeParty5> buyr;
    @XmlElement(name = "Sellr", required = true)
    protected List<TradeParty5> sellr;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "PrlngtnFlg")
    protected Boolean prlngtnFlg;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "SpclConds")
    protected SpecialCondition1 spclConds;
    @XmlElement(name = "DrtnCd")
    protected String drtnCd;
    @XmlElement(name = "IntrstRate")
    protected InterestRate2Choice intrstRate;
    @XmlElement(name = "Trch")
    protected List<LoanContractTranche1> trch;
    @XmlElement(name = "PmtSchdl")
    protected List<PaymentSchedule1> pmtSchdl;
    @XmlElement(name = "IntrstSchdl")
    protected List<InterestPaymentSchedule1> intrstSchdl;
    @XmlElement(name = "IntraCpnyLn")
    protected boolean intraCpnyLn;
    @XmlElement(name = "Coll")
    protected ContractCollateral1 coll;
    @XmlElement(name = "SndctdLn")
    protected List<SyndicatedLoan2> sndctdLn;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;

    /**
     * Gets the value of the ctrctDocId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getCtrctDocId() {
        return ctrctDocId;
    }

    /**
     * Sets the value of the ctrctDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public void setCtrctDocId(DocumentIdentification22 value) {
        this.ctrctDocId = value;
    }

    /**
     * Gets the value of the lnTpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnTpId() {
        return lnTpId;
    }

    /**
     * Sets the value of the lnTpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnTpId(String value) {
        this.lnTpId = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeParty5 }
     * 
     * 
     * @return
     *     The value of the buyr property.
     */
    public List<TradeParty5> getBuyr() {
        if (buyr == null) {
            buyr = new ArrayList<>();
        }
        return this.buyr;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeParty5 }
     * 
     * 
     * @return
     *     The value of the sellr property.
     */
    public List<TradeParty5> getSellr() {
        if (sellr == null) {
            sellr = new ArrayList<>();
        }
        return this.sellr;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the prlngtnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrlngtnFlg() {
        return prlngtnFlg;
    }

    /**
     * Sets the value of the prlngtnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrlngtnFlg(Boolean value) {
        this.prlngtnFlg = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the spclConds property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCondition1 }
     *     
     */
    public SpecialCondition1 getSpclConds() {
        return spclConds;
    }

    /**
     * Sets the value of the spclConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCondition1 }
     *     
     */
    public void setSpclConds(SpecialCondition1 value) {
        this.spclConds = value;
    }

    /**
     * Gets the value of the drtnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtnCd() {
        return drtnCd;
    }

    /**
     * Sets the value of the drtnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrtnCd(String value) {
        this.drtnCd = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate2Choice }
     *     
     */
    public InterestRate2Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate2Choice }
     *     
     */
    public void setIntrstRate(InterestRate2Choice value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the trch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanContractTranche1 }
     * 
     * 
     * @return
     *     The value of the trch property.
     */
    public List<LoanContractTranche1> getTrch() {
        if (trch == null) {
            trch = new ArrayList<>();
        }
        return this.trch;
    }

    /**
     * Gets the value of the pmtSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSchedule1 }
     * 
     * 
     * @return
     *     The value of the pmtSchdl property.
     */
    public List<PaymentSchedule1> getPmtSchdl() {
        if (pmtSchdl == null) {
            pmtSchdl = new ArrayList<>();
        }
        return this.pmtSchdl;
    }

    /**
     * Gets the value of the intrstSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestPaymentSchedule1 }
     * 
     * 
     * @return
     *     The value of the intrstSchdl property.
     */
    public List<InterestPaymentSchedule1> getIntrstSchdl() {
        if (intrstSchdl == null) {
            intrstSchdl = new ArrayList<>();
        }
        return this.intrstSchdl;
    }

    /**
     * Gets the value of the intraCpnyLn property.
     * 
     */
    public boolean isIntraCpnyLn() {
        return intraCpnyLn;
    }

    /**
     * Sets the value of the intraCpnyLn property.
     * 
     */
    public void setIntraCpnyLn(boolean value) {
        this.intraCpnyLn = value;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link ContractCollateral1 }
     *     
     */
    public ContractCollateral1 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCollateral1 }
     *     
     */
    public void setColl(ContractCollateral1 value) {
        this.coll = value;
    }

    /**
     * Gets the value of the sndctdLn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndctdLn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndctdLn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyndicatedLoan2 }
     * 
     * 
     * @return
     *     The value of the sndctdLn property.
     */
    public List<SyndicatedLoan2> getSndctdLn() {
        if (sndctdLn == null) {
            sndctdLn = new ArrayList<>();
        }
        return this.sndctdLn;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
    }

}
