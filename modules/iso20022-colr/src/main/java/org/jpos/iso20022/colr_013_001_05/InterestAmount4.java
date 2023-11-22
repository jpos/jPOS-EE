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

package org.jpos.iso20022.colr_013_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestAmount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestAmount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntrstReqSeq" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}InterestRequestSequence1Code"/>
 *         <element name="IntrstPrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}DatePeriod2"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}ISODate"/>
 *         <element name="IntrstMtd" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}InterestMethod1Code"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}InterestRate1Choice" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}InterestComputationMethod2Code" minOccurs="0"/>
 *         <element name="ApldWhldgTax" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="ClctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}CalculationMethod1Code" minOccurs="0"/>
 *         <element name="ClctnFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}Frequency1Code" minOccurs="0"/>
 *         <element name="CollPurp" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}CollateralPurpose1Choice"/>
 *         <element name="OpngCollBal" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}CollateralBalance1" minOccurs="0"/>
 *         <element name="ClsgCollBal" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}CollateralBalance1"/>
 *         <element name="StdSttlmInstrs" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}Max140Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}Max210Text" minOccurs="0"/>
 *         <element name="RefDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.013.001.05}Reference20" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestAmount4", propOrder = {
    "intrstReqSeq",
    "intrstPrd",
    "acrdIntrstAmt",
    "valDt",
    "intrstMtd",
    "intrstRate",
    "dayCntBsis",
    "apldWhldgTax",
    "clctnMtd",
    "clctnFrqcy",
    "collPurp",
    "opngCollBal",
    "clsgCollBal",
    "stdSttlmInstrs",
    "addtlInf",
    "refDtls"
})
public class InterestAmount4 {

    @XmlElement(name = "IntrstReqSeq", required = true)
    @XmlSchemaType(name = "string")
    protected InterestRequestSequence1Code intrstReqSeq;
    @XmlElement(name = "IntrstPrd", required = true)
    protected DatePeriod2 intrstPrd;
    @XmlElement(name = "AcrdIntrstAmt", required = true)
    protected ActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "ValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "IntrstMtd", required = true)
    @XmlSchemaType(name = "string")
    protected InterestMethod1Code intrstMtd;
    @XmlElement(name = "IntrstRate")
    protected InterestRate1Choice intrstRate;
    @XmlElement(name = "DayCntBsis")
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code dayCntBsis;
    @XmlElement(name = "ApldWhldgTax")
    protected Boolean apldWhldgTax;
    @XmlElement(name = "ClctnMtd")
    @XmlSchemaType(name = "string")
    protected CalculationMethod1Code clctnMtd;
    @XmlElement(name = "ClctnFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code clctnFrqcy;
    @XmlElement(name = "CollPurp", required = true)
    protected CollateralPurpose1Choice collPurp;
    @XmlElement(name = "OpngCollBal")
    protected CollateralBalance1 opngCollBal;
    @XmlElement(name = "ClsgCollBal", required = true)
    protected CollateralBalance1 clsgCollBal;
    @XmlElement(name = "StdSttlmInstrs")
    protected String stdSttlmInstrs;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "RefDtls")
    protected Reference20 refDtls;

    /**
     * Gets the value of the intrstReqSeq property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRequestSequence1Code }
     *     
     */
    public InterestRequestSequence1Code getIntrstReqSeq() {
        return intrstReqSeq;
    }

    /**
     * Sets the value of the intrstReqSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRequestSequence1Code }
     *     
     */
    public void setIntrstReqSeq(InterestRequestSequence1Code value) {
        this.intrstReqSeq = value;
    }

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setIntrstPrd(DatePeriod2 value) {
        this.intrstPrd = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the intrstMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestMethod1Code }
     *     
     */
    public InterestMethod1Code getIntrstMtd() {
        return intrstMtd;
    }

    /**
     * Sets the value of the intrstMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestMethod1Code }
     *     
     */
    public void setIntrstMtd(InterestMethod1Code value) {
        this.intrstMtd = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate1Choice }
     *     
     */
    public InterestRate1Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate1Choice }
     *     
     */
    public void setIntrstRate(InterestRate1Choice value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestComputationMethod2Code getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public void setDayCntBsis(InterestComputationMethod2Code value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the apldWhldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApldWhldgTax() {
        return apldWhldgTax;
    }

    /**
     * Sets the value of the apldWhldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApldWhldgTax(Boolean value) {
        this.apldWhldgTax = value;
    }

    /**
     * Gets the value of the clctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public CalculationMethod1Code getClctnMtd() {
        return clctnMtd;
    }

    /**
     * Sets the value of the clctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethod1Code }
     *     
     */
    public void setClctnMtd(CalculationMethod1Code value) {
        this.clctnMtd = value;
    }

    /**
     * Gets the value of the clctnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getClctnFrqcy() {
        return clctnFrqcy;
    }

    /**
     * Sets the value of the clctnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public void setClctnFrqcy(Frequency1Code value) {
        this.clctnFrqcy = value;
    }

    /**
     * Gets the value of the collPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPurpose1Choice }
     *     
     */
    public CollateralPurpose1Choice getCollPurp() {
        return collPurp;
    }

    /**
     * Sets the value of the collPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPurpose1Choice }
     *     
     */
    public void setCollPurp(CollateralPurpose1Choice value) {
        this.collPurp = value;
    }

    /**
     * Gets the value of the opngCollBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1 }
     *     
     */
    public CollateralBalance1 getOpngCollBal() {
        return opngCollBal;
    }

    /**
     * Sets the value of the opngCollBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1 }
     *     
     */
    public void setOpngCollBal(CollateralBalance1 value) {
        this.opngCollBal = value;
    }

    /**
     * Gets the value of the clsgCollBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1 }
     *     
     */
    public CollateralBalance1 getClsgCollBal() {
        return clsgCollBal;
    }

    /**
     * Sets the value of the clsgCollBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1 }
     *     
     */
    public void setClsgCollBal(CollateralBalance1 value) {
        this.clsgCollBal = value;
    }

    /**
     * Gets the value of the stdSttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdSttlmInstrs() {
        return stdSttlmInstrs;
    }

    /**
     * Sets the value of the stdSttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdSttlmInstrs(String value) {
        this.stdSttlmInstrs = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the refDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Reference20 }
     *     
     */
    public Reference20 getRefDtls() {
        return refDtls;
    }

    /**
     * Sets the value of the refDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference20 }
     *     
     */
    public void setRefDtls(Reference20 value) {
        this.refDtls = value;
    }

}
