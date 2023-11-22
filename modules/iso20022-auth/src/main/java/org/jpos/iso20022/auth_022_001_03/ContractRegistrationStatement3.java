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

package org.jpos.iso20022.auth_022_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractRegistrationStatement3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractRegistrationStatement3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Max35Text" minOccurs="0"/>
 *         <element name="RptgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}TradeParty5"/>
 *         <element name="RegnAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}ReportingPeriod4"/>
 *         <element name="RegdCtrct" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}RegisteredContract12"/>
 *         <element name="TxJrnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}TransactionCertificate4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SpprtgDocJrnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}SupportingDocument3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlSpprtgDocJrnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}SupportingDocument3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RgltryRuleVldtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}GenericValidationRuleIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlCtrctTrnvrSum" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}ActiveCurrencyAndAmount"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationStatement3", propOrder = {
    "stmtId",
    "rptgPty",
    "regnAgt",
    "rptgPrd",
    "regdCtrct",
    "txJrnl",
    "spprtgDocJrnl",
    "addtlSpprtgDocJrnl",
    "rgltryRuleVldtn",
    "ttlCtrctTrnvrSum",
    "splmtryData"
})
public class ContractRegistrationStatement3 {

    @XmlElement(name = "StmtId")
    protected String stmtId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty5 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "RptgPrd", required = true)
    protected ReportingPeriod4 rptgPrd;
    @XmlElement(name = "RegdCtrct", required = true)
    protected RegisteredContract12 regdCtrct;
    @XmlElement(name = "TxJrnl")
    protected List<TransactionCertificate4> txJrnl;
    @XmlElement(name = "SpprtgDocJrnl")
    protected List<SupportingDocument3> spprtgDocJrnl;
    @XmlElement(name = "AddtlSpprtgDocJrnl")
    protected List<SupportingDocument3> addtlSpprtgDocJrnl;
    @XmlElement(name = "RgltryRuleVldtn")
    protected List<GenericValidationRuleIdentification1> rgltryRuleVldtn;
    @XmlElement(name = "TtlCtrctTrnvrSum", required = true)
    protected ActiveCurrencyAndAmount ttlCtrctTrnvrSum;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtId(String value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public void setRptgPty(TradeParty5 value) {
        this.rptgPty = value;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod4 }
     *     
     */
    public ReportingPeriod4 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod4 }
     *     
     */
    public void setRptgPrd(ReportingPeriod4 value) {
        this.rptgPrd = value;
    }

    /**
     * Gets the value of the regdCtrct property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredContract12 }
     *     
     */
    public RegisteredContract12 getRegdCtrct() {
        return regdCtrct;
    }

    /**
     * Sets the value of the regdCtrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredContract12 }
     *     
     */
    public void setRegdCtrct(RegisteredContract12 value) {
        this.regdCtrct = value;
    }

    /**
     * Gets the value of the txJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCertificate4 }
     * 
     * 
     * @return
     *     The value of the txJrnl property.
     */
    public List<TransactionCertificate4> getTxJrnl() {
        if (txJrnl == null) {
            txJrnl = new ArrayList<>();
        }
        return this.txJrnl;
    }

    /**
     * Gets the value of the spprtgDocJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spprtgDocJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpprtgDocJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocument3 }
     * 
     * 
     * @return
     *     The value of the spprtgDocJrnl property.
     */
    public List<SupportingDocument3> getSpprtgDocJrnl() {
        if (spprtgDocJrnl == null) {
            spprtgDocJrnl = new ArrayList<>();
        }
        return this.spprtgDocJrnl;
    }

    /**
     * Gets the value of the addtlSpprtgDocJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSpprtgDocJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSpprtgDocJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocument3 }
     * 
     * 
     * @return
     *     The value of the addtlSpprtgDocJrnl property.
     */
    public List<SupportingDocument3> getAddtlSpprtgDocJrnl() {
        if (addtlSpprtgDocJrnl == null) {
            addtlSpprtgDocJrnl = new ArrayList<>();
        }
        return this.addtlSpprtgDocJrnl;
    }

    /**
     * Gets the value of the rgltryRuleVldtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryRuleVldtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRuleVldtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericValidationRuleIdentification1 }
     * 
     * 
     * @return
     *     The value of the rgltryRuleVldtn property.
     */
    public List<GenericValidationRuleIdentification1> getRgltryRuleVldtn() {
        if (rgltryRuleVldtn == null) {
            rgltryRuleVldtn = new ArrayList<>();
        }
        return this.rgltryRuleVldtn;
    }

    /**
     * Gets the value of the ttlCtrctTrnvrSum property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlCtrctTrnvrSum() {
        return ttlCtrctTrnvrSum;
    }

    /**
     * Sets the value of the ttlCtrctTrnvrSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlCtrctTrnvrSum(ActiveCurrencyAndAmount value) {
        this.ttlCtrctTrnvrSum = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
