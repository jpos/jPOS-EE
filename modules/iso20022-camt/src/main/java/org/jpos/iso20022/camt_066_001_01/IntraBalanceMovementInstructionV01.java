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

package org.jpos.iso20022.camt_066_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceMovementInstructionV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceMovementInstructionV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}TransactionAndDocumentIdentification6" minOccurs="0"/>
 *         <element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}Identification14" minOccurs="0"/>
 *         <element name="NbCounts" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}NumberCount1Choice" minOccurs="0"/>
 *         <element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}Linkages57" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}CashAccount38"/>
 *         <element name="CshAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="CshAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntraBal" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}IntraBalance5"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.066.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovementInstructionV01", propOrder = {
    "id",
    "corpActnEvtId",
    "nbCounts",
    "lnkgs",
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "intraBal",
    "splmtryData"
})
public class IntraBalanceMovementInstructionV01 {

    @XmlElement(name = "Id")
    protected TransactionAndDocumentIdentification6 id;
    @XmlElement(name = "CorpActnEvtId")
    protected Identification14 corpActnEvtId;
    @XmlElement(name = "NbCounts")
    protected NumberCount1Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages57> lnkgs;
    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount38 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "IntraBal", required = true)
    protected IntraBalance5 intraBal;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAndDocumentIdentification6 }
     *     
     */
    public TransactionAndDocumentIdentification6 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAndDocumentIdentification6 }
     *     
     */
    public void setId(TransactionAndDocumentIdentification6 value) {
        this.id = value;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link Identification14 }
     *     
     */
    public Identification14 getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification14 }
     *     
     */
    public void setCorpActnEvtId(Identification14 value) {
        this.corpActnEvtId = value;
    }

    /**
     * Gets the value of the nbCounts property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount1Choice }
     *     
     */
    public NumberCount1Choice getNbCounts() {
        return nbCounts;
    }

    /**
     * Sets the value of the nbCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount1Choice }
     *     
     */
    public void setNbCounts(NumberCount1Choice value) {
        this.nbCounts = value;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages57 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages57> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setCshAcct(CashAccount38 value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public void setCshAcctOwnr(SystemPartyIdentification8 value) {
        this.cshAcctOwnr = value;
    }

    /**
     * Gets the value of the cshAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCshAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cshAcctSvcr = value;
    }

    /**
     * Gets the value of the intraBal property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalance5 }
     *     
     */
    public IntraBalance5 getIntraBal() {
        return intraBal;
    }

    /**
     * Sets the value of the intraBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalance5 }
     *     
     */
    public void setIntraBal(IntraBalance5 value) {
        this.intraBal = value;
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
