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

package org.jpos.iso20022.camt_029_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionOfInvestigationV12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResolutionOfInvestigationV12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}CaseAssignment5"/>
 *         <element name="RslvdCase" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}Case5" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}InvestigationStatus5Choice"/>
 *         <element name="CxlDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}UnderlyingTransaction31" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ModDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}PaymentTransaction147" minOccurs="0"/>
 *         <element name="ClmNonRctDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ClaimNonReceipt2Choice" minOccurs="0"/>
 *         <element name="StmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}StatementResolutionEntry4" minOccurs="0"/>
 *         <element name="CrrctnTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}CorrectiveTransaction5Choice" minOccurs="0"/>
 *         <element name="RsltnRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}ResolutionData4" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.12}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionOfInvestigationV12", propOrder = {
    "assgnmt",
    "rslvdCase",
    "sts",
    "cxlDtls",
    "modDtls",
    "clmNonRctDtls",
    "stmtDtls",
    "crrctnTx",
    "rsltnRltdInf",
    "splmtryData"
})
public class ResolutionOfInvestigationV12 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "RslvdCase")
    protected Case5 rslvdCase;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus5Choice sts;
    @XmlElement(name = "CxlDtls")
    protected List<UnderlyingTransaction31> cxlDtls;
    @XmlElement(name = "ModDtls")
    protected PaymentTransaction147 modDtls;
    @XmlElement(name = "ClmNonRctDtls")
    protected ClaimNonReceipt2Choice clmNonRctDtls;
    @XmlElement(name = "StmtDtls")
    protected StatementResolutionEntry4 stmtDtls;
    @XmlElement(name = "CrrctnTx")
    protected CorrectiveTransaction5Choice crrctnTx;
    @XmlElement(name = "RsltnRltdInf")
    protected ResolutionData4 rsltnRltdInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public void setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public void setRslvdCase(Case5 value) {
        this.rslvdCase = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus5Choice }
     *     
     */
    public InvestigationStatus5Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus5Choice }
     *     
     */
    public void setSts(InvestigationStatus5Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the cxlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cxlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingTransaction31 }
     * 
     * 
     * @return
     *     The value of the cxlDtls property.
     */
    public List<UnderlyingTransaction31> getCxlDtls() {
        if (cxlDtls == null) {
            cxlDtls = new ArrayList<>();
        }
        return this.cxlDtls;
    }

    /**
     * Gets the value of the modDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction147 }
     *     
     */
    public PaymentTransaction147 getModDtls() {
        return modDtls;
    }

    /**
     * Sets the value of the modDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction147 }
     *     
     */
    public void setModDtls(PaymentTransaction147 value) {
        this.modDtls = value;
    }

    /**
     * Gets the value of the clmNonRctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceipt2Choice }
     *     
     */
    public ClaimNonReceipt2Choice getClmNonRctDtls() {
        return clmNonRctDtls;
    }

    /**
     * Sets the value of the clmNonRctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceipt2Choice }
     *     
     */
    public void setClmNonRctDtls(ClaimNonReceipt2Choice value) {
        this.clmNonRctDtls = value;
    }

    /**
     * Gets the value of the stmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StatementResolutionEntry4 }
     *     
     */
    public StatementResolutionEntry4 getStmtDtls() {
        return stmtDtls;
    }

    /**
     * Sets the value of the stmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementResolutionEntry4 }
     *     
     */
    public void setStmtDtls(StatementResolutionEntry4 value) {
        this.stmtDtls = value;
    }

    /**
     * Gets the value of the crrctnTx property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveTransaction5Choice }
     *     
     */
    public CorrectiveTransaction5Choice getCrrctnTx() {
        return crrctnTx;
    }

    /**
     * Sets the value of the crrctnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveTransaction5Choice }
     *     
     */
    public void setCrrctnTx(CorrectiveTransaction5Choice value) {
        this.crrctnTx = value;
    }

    /**
     * Gets the value of the rsltnRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionData4 }
     *     
     */
    public ResolutionData4 getRsltnRltdInf() {
        return rsltnRltdInf;
    }

    /**
     * Sets the value of the rsltnRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionData4 }
     *     
     */
    public void setRsltnRltdInf(ResolutionData4 value) {
        this.rsltnRltdInf = value;
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
