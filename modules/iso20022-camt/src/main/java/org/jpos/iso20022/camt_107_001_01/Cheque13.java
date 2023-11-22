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

package org.jpos.iso20022.camt_107_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cheque13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cheque13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ChqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}Max35Text"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}ISODate"/>
 *         <element name="StlDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}ISODate" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="Pyer" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}PartyIdentification135" minOccurs="0"/>
 *         <element name="PyerAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="DrwrAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DrwrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="Pyee" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}PartyIdentification135"/>
 *         <element name="PyeeAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="InstrForChqAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.107.001.01}InstructionForChequeAgent1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque13", propOrder = {
    "instrId",
    "chqNb",
    "isseDt",
    "stlDt",
    "amt",
    "valDt",
    "pyer",
    "pyerAcct",
    "drwrAgt",
    "drwrAgtAcct",
    "pyee",
    "pyeeAcct",
    "instrForChqAgt"
})
public class Cheque13 {

    @XmlElement(name = "InstrId")
    protected String instrId;
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
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "Pyer")
    protected PartyIdentification135 pyer;
    @XmlElement(name = "PyerAcct")
    protected CashAccount40 pyerAcct;
    @XmlElement(name = "DrwrAgt")
    protected BranchAndFinancialInstitutionIdentification6 drwrAgt;
    @XmlElement(name = "DrwrAgtAcct")
    protected CashAccount40 drwrAgtAcct;
    @XmlElement(name = "Pyee", required = true)
    protected PartyIdentification135 pyee;
    @XmlElement(name = "PyeeAcct")
    protected CashAccount40 pyeeAcct;
    @XmlElement(name = "InstrForChqAgt")
    protected List<InstructionForChequeAgent1> instrForChqAgt;

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
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the pyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPyer() {
        return pyer;
    }

    /**
     * Sets the value of the pyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setPyer(PartyIdentification135 value) {
        this.pyer = value;
    }

    /**
     * Gets the value of the pyerAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPyerAcct() {
        return pyerAcct;
    }

    /**
     * Sets the value of the pyerAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPyerAcct(CashAccount40 value) {
        this.pyerAcct = value;
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
     * Gets the value of the instrForChqAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrForChqAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForChqAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForChequeAgent1 }
     * 
     * 
     * @return
     *     The value of the instrForChqAgt property.
     */
    public List<InstructionForChequeAgent1> getInstrForChqAgt() {
        if (instrForChqAgt == null) {
            instrForChqAgt = new ArrayList<>();
        }
        return this.instrForChqAgt;
    }

}
