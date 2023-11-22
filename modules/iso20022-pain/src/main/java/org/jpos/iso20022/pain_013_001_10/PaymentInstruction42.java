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

package org.jpos.iso20022.pain_013_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstruction42 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstruction42">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}Max35Text" minOccurs="0"/>
 *         <element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}PaymentMethod7Code"/>
 *         <element name="ReqdAdvcTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}AdviceType1" minOccurs="0"/>
 *         <element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}PaymentTypeInformation26" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="PmtCond" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}PaymentCondition1" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}PartyIdentification135"/>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}PartyIdentification135" minOccurs="0"/>
 *         <element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}ChargeBearerType1Code" minOccurs="0"/>
 *         <element name="CdtTrfTx" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}CreditTransferTransaction57" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction42", propOrder = {
    "pmtInfId",
    "pmtMtd",
    "reqdAdvcTp",
    "pmtTpInf",
    "reqdExctnDt",
    "xpryDt",
    "pmtCond",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "ultmtDbtr",
    "chrgBr",
    "cdtTrfTx"
})
public class PaymentInstruction42 {

    @XmlElement(name = "PmtInfId")
    protected String pmtInfId;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod7Code pmtMtd;
    @XmlElement(name = "ReqdAdvcTp")
    protected AdviceType1 reqdAdvcTp;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation26 pmtTpInf;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "XpryDt")
    protected DateAndDateTime2Choice xpryDt;
    @XmlElement(name = "PmtCond")
    protected PaymentCondition1 pmtCond;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification135 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount40 dbtrAgtAcct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "CdtTrfTx", required = true)
    protected List<CreditTransferTransaction57> cdtTrfTx;

    /**
     * Gets the value of the pmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Sets the value of the pmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInfId(String value) {
        this.pmtInfId = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod7Code }
     *     
     */
    public PaymentMethod7Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod7Code }
     *     
     */
    public void setPmtMtd(PaymentMethod7Code value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the reqdAdvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceType1 }
     *     
     */
    public AdviceType1 getReqdAdvcTp() {
        return reqdAdvcTp;
    }

    /**
     * Sets the value of the reqdAdvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceType1 }
     *     
     */
    public void setReqdAdvcTp(AdviceType1 value) {
        this.reqdAdvcTp = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public PaymentTypeInformation26 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation26 value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setXpryDt(DateAndDateTime2Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the pmtCond property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCondition1 }
     *     
     */
    public PaymentCondition1 getPmtCond() {
        return pmtCond;
    }

    /**
     * Sets the value of the pmtCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCondition1 }
     *     
     */
    public void setPmtCond(PaymentCondition1 value) {
        this.pmtCond = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setDbtr(PartyIdentification135 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
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
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the cdtTrfTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cdtTrfTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtTrfTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferTransaction57 }
     * 
     * 
     * @return
     *     The value of the cdtTrfTx property.
     */
    public List<CreditTransferTransaction57> getCdtTrfTx() {
        if (cdtTrfTx == null) {
            cdtTrfTx = new ArrayList<>();
        }
        return this.cdtTrfTx;
    }

}
