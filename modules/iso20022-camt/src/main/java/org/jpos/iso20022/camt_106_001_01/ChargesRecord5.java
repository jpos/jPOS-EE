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

package org.jpos.iso20022.camt_106_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargesRecord5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ChargesRecord5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChrgsRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}Max35Text" minOccurs="0"/>
 *         <element name="UndrlygTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}TransactionReferences7" maxOccurs="unbounded"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}CreditDebitCode" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="ChrgsAcctAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="ChrgsAcctAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}CashAccount40" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}ChargeType3Choice" minOccurs="0"/>
 *         <element name="InstrForInstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}InstructionForInstructedAgent1" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.106.001.01}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesRecord5", propOrder = {
    "chrgsRcrdId",
    "undrlygTx",
    "amt",
    "cdtDbtInd",
    "valDt",
    "dbtrAgt",
    "dbtrAgtAcct",
    "chrgsAcctAgt",
    "chrgsAcctAgtAcct",
    "tp",
    "instrForInstdAgt",
    "addtlInf"
})
public class ChargesRecord5 {

    @XmlElement(name = "ChrgsRcrdId")
    protected String chrgsRcrdId;
    @XmlElement(name = "UndrlygTx", required = true)
    protected List<TransactionReferences7> undrlygTx;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount40 dbtrAgtAcct;
    @XmlElement(name = "ChrgsAcctAgt")
    protected BranchAndFinancialInstitutionIdentification6 chrgsAcctAgt;
    @XmlElement(name = "ChrgsAcctAgtAcct")
    protected CashAccount40 chrgsAcctAgtAcct;
    @XmlElement(name = "Tp")
    protected ChargeType3Choice tp;
    @XmlElement(name = "InstrForInstdAgt")
    protected InstructionForInstructedAgent1 instrForInstdAgt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the chrgsRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgsRcrdId() {
        return chrgsRcrdId;
    }

    /**
     * Sets the value of the chrgsRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrgsRcrdId(String value) {
        this.chrgsRcrdId = value;
    }

    /**
     * Gets the value of the undrlygTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReferences7 }
     * 
     * 
     * @return
     *     The value of the undrlygTx property.
     */
    public List<TransactionReferences7> getUndrlygTx() {
        if (undrlygTx == null) {
            undrlygTx = new ArrayList<>();
        }
        return this.undrlygTx;
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
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAgtAcct(CashAccount40 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Gets the value of the chrgsAcctAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    /**
     * Sets the value of the chrgsAcctAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.chrgsAcctAgt = value;
    }

    /**
     * Gets the value of the chrgsAcctAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getChrgsAcctAgtAcct() {
        return chrgsAcctAgtAcct;
    }

    /**
     * Sets the value of the chrgsAcctAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setChrgsAcctAgtAcct(CashAccount40 value) {
        this.chrgsAcctAgtAcct = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType3Choice }
     *     
     */
    public ChargeType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType3Choice }
     *     
     */
    public void setTp(ChargeType3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the instrForInstdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForInstructedAgent1 }
     *     
     */
    public InstructionForInstructedAgent1 getInstrForInstdAgt() {
        return instrForInstdAgt;
    }

    /**
     * Sets the value of the instrForInstdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForInstructedAgent1 }
     *     
     */
    public void setInstrForInstdAgt(InstructionForInstructedAgent1 value) {
        this.instrForInstdAgt = value;
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

}
