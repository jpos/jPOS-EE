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

package org.jpos.iso20022.auth_079_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanData140 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoanData140">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnqTradIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Max52Text" minOccurs="0"/>
 *         <element name="EvtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODate"/>
 *         <element name="ExctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="ClrSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Cleared16Choice" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}MICIdentifier" minOccurs="0"/>
 *         <element name="MstrAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}MasterAgreement7" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODate" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODate" minOccurs="0"/>
 *         <element name="GnlColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SpecialCollateral1Code" minOccurs="0"/>
 *         <element name="PrncplAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}PrincipalAmount3" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SecuritiesTransactionPrice19Choice" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData140", propOrder = {
    "unqTradIdr",
    "evtDt",
    "exctnDtTm",
    "clrSts",
    "tradgVn",
    "mstrAgrmt",
    "valDt",
    "mtrtyDt",
    "gnlColl",
    "prncplAmt",
    "unitPric",
    "termntnDt"
})
public class LoanData140 {

    @XmlElement(name = "UnqTradIdr")
    protected String unqTradIdr;
    @XmlElement(name = "EvtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "ExctnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exctnDtTm;
    @XmlElement(name = "ClrSts")
    protected Cleared16Choice clrSts;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement7 mstrAgrmt;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "GnlColl")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral1Code gnlColl;
    @XmlElement(name = "PrncplAmt")
    protected PrincipalAmount3 prncplAmt;
    @XmlElement(name = "UnitPric")
    protected SecuritiesTransactionPrice19Choice unitPric;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termntnDt;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqTradIdr(String value) {
        this.unqTradIdr = value;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExctnDtTm(XMLGregorianCalendar value) {
        this.exctnDtTm = value;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link Cleared16Choice }
     *     
     */
    public Cleared16Choice getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cleared16Choice }
     *     
     */
    public void setClrSts(Cleared16Choice value) {
        this.clrSts = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement7 }
     *     
     */
    public MasterAgreement7 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement7 }
     *     
     */
    public void setMstrAgrmt(MasterAgreement7 value) {
        this.mstrAgrmt = value;
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
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public SpecialCollateral1Code getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public void setGnlColl(SpecialCollateral1Code value) {
        this.gnlColl = value;
    }

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalAmount3 }
     *     
     */
    public PrincipalAmount3 getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalAmount3 }
     *     
     */
    public void setPrncplAmt(PrincipalAmount3 value) {
        this.prncplAmt = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public SecuritiesTransactionPrice19Choice getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public void setUnitPric(SecuritiesTransactionPrice19Choice value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
    }

}
