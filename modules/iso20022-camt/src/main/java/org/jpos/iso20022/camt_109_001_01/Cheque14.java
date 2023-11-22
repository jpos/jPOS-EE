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

package org.jpos.iso20022.camt_109_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cheque14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cheque14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ChqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}Max35Text"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}ISODate"/>
 *         <element name="StlDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}ISODate" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="DrwrAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DrwrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="Pyee" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}PartyIdentification135" minOccurs="0"/>
 *         <element name="PyeeAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="ChqCxlOrStopSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.109.001.01}ChequeCancellationStatus1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque14", propOrder = {
    "instrId",
    "orgnlInstrId",
    "chqNb",
    "isseDt",
    "stlDt",
    "amt",
    "fctvDt",
    "drwrAgt",
    "drwrAgtAcct",
    "pyee",
    "pyeeAcct",
    "chqCxlOrStopSts"
})
public class Cheque14 {

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "ChqNb", required = true)
    protected String chqNb;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "StlDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stlDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "FctvDt")
    protected DateAndDateTime2Choice fctvDt;
    @XmlElement(name = "DrwrAgt")
    protected BranchAndFinancialInstitutionIdentification6 drwrAgt;
    @XmlElement(name = "DrwrAgtAcct")
    protected CashAccount40 drwrAgtAcct;
    @XmlElement(name = "Pyee")
    protected PartyIdentification135 pyee;
    @XmlElement(name = "PyeeAcct")
    protected CashAccount40 pyeeAcct;
    @XmlElement(name = "ChqCxlOrStopSts", required = true)
    protected ChequeCancellationStatus1 chqCxlOrStopSts;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the chqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNb() {
        return chqNb;
    }

    /**
     * Sets the value of the chqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqNb(String value) {
        this.chqNb = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the stlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStlDt() {
        return stlDt;
    }

    /**
     * Sets the value of the stlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStlDt(XMLGregorianCalendar value) {
        this.stlDt = value;
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
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setFctvDt(DateAndDateTime2Choice value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the drwrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDrwrAgt() {
        return drwrAgt;
    }

    /**
     * Sets the value of the drwrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDrwrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.drwrAgt = value;
    }

    /**
     * Gets the value of the drwrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDrwrAgtAcct() {
        return drwrAgtAcct;
    }

    /**
     * Sets the value of the drwrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDrwrAgtAcct(CashAccount40 value) {
        this.drwrAgtAcct = value;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setPyee(PartyIdentification135 value) {
        this.pyee = value;
    }

    /**
     * Gets the value of the pyeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPyeeAcct() {
        return pyeeAcct;
    }

    /**
     * Sets the value of the pyeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPyeeAcct(CashAccount40 value) {
        this.pyeeAcct = value;
    }

    /**
     * Gets the value of the chqCxlOrStopSts property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeCancellationStatus1 }
     *     
     */
    public ChequeCancellationStatus1 getChqCxlOrStopSts() {
        return chqCxlOrStopSts;
    }

    /**
     * Sets the value of the chqCxlOrStopSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeCancellationStatus1 }
     *     
     */
    public void setChqCxlOrStopSts(ChequeCancellationStatus1 value) {
        this.chqCxlOrStopSts = value;
    }

}
