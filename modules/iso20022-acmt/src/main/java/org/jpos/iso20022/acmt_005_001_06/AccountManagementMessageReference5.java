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

package org.jpos.iso20022.acmt_005_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementMessageReference5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountManagementMessageReference5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LkdRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}LinkedMessage5Choice" minOccurs="0"/>
 *         <element name="StsReqTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}AccountManagementType3Code"/>
 *         <element name="AcctApplId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}Max35Text" minOccurs="0"/>
 *         <element name="ExstgAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}Account23" minOccurs="0"/>
 *         <element name="InvstmtAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}InvestmentAccount77" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementMessageReference5", propOrder = {
    "lkdRef",
    "stsReqTp",
    "acctApplId",
    "exstgAcctId",
    "invstmtAcct"
})
public class AccountManagementMessageReference5 {

    @XmlElement(name = "LkdRef")
    protected LinkedMessage5Choice lkdRef;
    @XmlElement(name = "StsReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected AccountManagementType3Code stsReqTp;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ExstgAcctId")
    protected Account23 exstgAcctId;
    @XmlElement(name = "InvstmtAcct")
    protected InvestmentAccount77 invstmtAcct;

    /**
     * Gets the value of the lkdRef property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedMessage5Choice }
     *     
     */
    public LinkedMessage5Choice getLkdRef() {
        return lkdRef;
    }

    /**
     * Sets the value of the lkdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedMessage5Choice }
     *     
     */
    public void setLkdRef(LinkedMessage5Choice value) {
        this.lkdRef = value;
    }

    /**
     * Gets the value of the stsReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementType3Code }
     *     
     */
    public AccountManagementType3Code getStsReqTp() {
        return stsReqTp;
    }

    /**
     * Sets the value of the stsReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementType3Code }
     *     
     */
    public void setStsReqTp(AccountManagementType3Code value) {
        this.stsReqTp = value;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctApplId(String value) {
        this.acctApplId = value;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link Account23 }
     *     
     */
    public Account23 getExstgAcctId() {
        return exstgAcctId;
    }

    /**
     * Sets the value of the exstgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account23 }
     *     
     */
    public void setExstgAcctId(Account23 value) {
        this.exstgAcctId = value;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount77 }
     *     
     */
    public InvestmentAccount77 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount77 }
     *     
     */
    public void setInvstmtAcct(InvestmentAccount77 value) {
        this.invstmtAcct = value;
    }

}
