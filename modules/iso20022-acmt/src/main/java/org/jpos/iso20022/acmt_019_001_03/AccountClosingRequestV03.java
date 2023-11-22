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

package org.jpos.iso20022.acmt_019_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountClosingRequestV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountClosingRequestV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}References4"/>
 *         <element name="Fr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}OrganisationIdentification29" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}AccountForAction2"/>
 *         <element name="AcctSvcrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}Organisation34"/>
 *         <element name="CtrctDts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}AccountContract4" minOccurs="0"/>
 *         <element name="BalTrfAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}AccountForAction1" minOccurs="0"/>
 *         <element name="TrfAcctSvcrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}PartyAndSignature3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:acmt.019.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountClosingRequestV03", propOrder = {
    "refs",
    "fr",
    "acctId",
    "acctSvcrId",
    "orgId",
    "ctrctDts",
    "balTrfAcct",
    "trfAcctSvcrId",
    "dgtlSgntr",
    "splmtryData"
})
public class AccountClosingRequestV03 {

    @XmlElement(name = "Refs", required = true)
    protected References4 refs;
    @XmlElement(name = "Fr")
    protected OrganisationIdentification29 fr;
    @XmlElement(name = "AcctId", required = true)
    protected AccountForAction2 acctId;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification6 acctSvcrId;
    @XmlElement(name = "OrgId", required = true)
    protected Organisation34 orgId;
    @XmlElement(name = "CtrctDts")
    protected AccountContract4 ctrctDts;
    @XmlElement(name = "BalTrfAcct")
    protected AccountForAction1 balTrfAcct;
    @XmlElement(name = "TrfAcctSvcrId")
    protected BranchAndFinancialInstitutionIdentification6 trfAcctSvcrId;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature3> dgtlSgntr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link References4 }
     *     
     */
    public References4 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link References4 }
     *     
     */
    public void setRefs(References4 value) {
        this.refs = value;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationIdentification29 getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public void setFr(OrganisationIdentification29 value) {
        this.fr = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountForAction2 }
     *     
     */
    public AccountForAction2 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountForAction2 }
     *     
     */
    public void setAcctId(AccountForAction2 value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcrId() {
        return acctSvcrId;
    }

    /**
     * Sets the value of the acctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctSvcrId(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcrId = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation34 }
     *     
     */
    public Organisation34 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation34 }
     *     
     */
    public void setOrgId(Organisation34 value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the ctrctDts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContract4 }
     *     
     */
    public AccountContract4 getCtrctDts() {
        return ctrctDts;
    }

    /**
     * Sets the value of the ctrctDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContract4 }
     *     
     */
    public void setCtrctDts(AccountContract4 value) {
        this.ctrctDts = value;
    }

    /**
     * Gets the value of the balTrfAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountForAction1 }
     *     
     */
    public AccountForAction1 getBalTrfAcct() {
        return balTrfAcct;
    }

    /**
     * Sets the value of the balTrfAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountForAction1 }
     *     
     */
    public void setBalTrfAcct(AccountForAction1 value) {
        this.balTrfAcct = value;
    }

    /**
     * Gets the value of the trfAcctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getTrfAcctSvcrId() {
        return trfAcctSvcrId;
    }

    /**
     * Sets the value of the trfAcctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setTrfAcctSvcrId(BranchAndFinancialInstitutionIdentification6 value) {
        this.trfAcctSvcrId = value;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature3 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature3> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
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
