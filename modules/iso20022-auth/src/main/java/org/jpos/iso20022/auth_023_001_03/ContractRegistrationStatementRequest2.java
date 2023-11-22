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

package org.jpos.iso20022.auth_023_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractRegistrationStatementRequest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractRegistrationStatementRequest2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtReqId" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}Max35Text"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}ReportingPeriod4"/>
 *         <element name="RptgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}TradeParty5"/>
 *         <element name="RegnAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="RegdCtrctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}Max35Text"/>
 *         <element name="RtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}ContractRegistrationStatementCriteria1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationStatementRequest2", propOrder = {
    "stmtReqId",
    "rptgPrd",
    "rptgPty",
    "regnAgt",
    "regdCtrctId",
    "rtrCrit",
    "splmtryData"
})
public class ContractRegistrationStatementRequest2 {

    @XmlElement(name = "StmtReqId", required = true)
    protected String stmtReqId;
    @XmlElement(name = "RptgPrd", required = true)
    protected ReportingPeriod4 rptgPrd;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty5 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "RegdCtrctId", required = true)
    protected String regdCtrctId;
    @XmlElement(name = "RtrCrit")
    protected ContractRegistrationStatementCriteria1 rtrCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stmtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtReqId() {
        return stmtReqId;
    }

    /**
     * Sets the value of the stmtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtReqId(String value) {
        this.stmtReqId = value;
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
     * Gets the value of the regdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdCtrctId() {
        return regdCtrctId;
    }

    /**
     * Sets the value of the regdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdCtrctId(String value) {
        this.regdCtrctId = value;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationStatementCriteria1 }
     *     
     */
    public ContractRegistrationStatementCriteria1 getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationStatementCriteria1 }
     *     
     */
    public void setRtrCrit(ContractRegistrationStatementCriteria1 value) {
        this.rtrCrit = value;
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
