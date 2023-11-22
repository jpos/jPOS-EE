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

package org.jpos.iso20022.acmt_014_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountReport28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountReport28">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}CustomerAccount5"/>
 *         <element name="UndrlygMstrAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}ContractDocument1" minOccurs="0"/>
 *         <element name="CtrctDts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}AccountContract3" minOccurs="0"/>
 *         <element name="Mndt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}OperationMandate4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Grp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}Group4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RefAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}CashAccount40" minOccurs="0"/>
 *         <element name="BalTrfAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}AccountForAction1" minOccurs="0"/>
 *         <element name="TrfAcctSvcrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReport28", propOrder = {
    "acct",
    "undrlygMstrAgrmt",
    "ctrctDts",
    "mndt",
    "grp",
    "refAcct",
    "balTrfAcct",
    "trfAcctSvcrId"
})
public class AccountReport28 {

    @XmlElement(name = "Acct", required = true)
    protected CustomerAccount5 acct;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "CtrctDts")
    protected AccountContract3 ctrctDts;
    @XmlElement(name = "Mndt")
    protected List<OperationMandate4> mndt;
    @XmlElement(name = "Grp")
    protected List<Group4> grp;
    @XmlElement(name = "RefAcct")
    protected CashAccount40 refAcct;
    @XmlElement(name = "BalTrfAcct")
    protected AccountForAction1 balTrfAcct;
    @XmlElement(name = "TrfAcctSvcrId")
    protected BranchAndFinancialInstitutionIdentification6 trfAcctSvcrId;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount5 }
     *     
     */
    public CustomerAccount5 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount5 }
     *     
     */
    public void setAcct(CustomerAccount5 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the undrlygMstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDocument1 }
     *     
     */
    public ContractDocument1 getUndrlygMstrAgrmt() {
        return undrlygMstrAgrmt;
    }

    /**
     * Sets the value of the undrlygMstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDocument1 }
     *     
     */
    public void setUndrlygMstrAgrmt(ContractDocument1 value) {
        this.undrlygMstrAgrmt = value;
    }

    /**
     * Gets the value of the ctrctDts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContract3 }
     *     
     */
    public AccountContract3 getCtrctDts() {
        return ctrctDts;
    }

    /**
     * Sets the value of the ctrctDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContract3 }
     *     
     */
    public void setCtrctDts(AccountContract3 value) {
        this.ctrctDts = value;
    }

    /**
     * Gets the value of the mndt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mndt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMndt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationMandate4 }
     * 
     * 
     * @return
     *     The value of the mndt property.
     */
    public List<OperationMandate4> getMndt() {
        if (mndt == null) {
            mndt = new ArrayList<>();
        }
        return this.mndt;
    }

    /**
     * Gets the value of the grp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group4 }
     * 
     * 
     * @return
     *     The value of the grp property.
     */
    public List<Group4> getGrp() {
        if (grp == null) {
            grp = new ArrayList<>();
        }
        return this.grp;
    }

    /**
     * Gets the value of the refAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getRefAcct() {
        return refAcct;
    }

    /**
     * Sets the value of the refAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setRefAcct(CashAccount40 value) {
        this.refAcct = value;
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

}
