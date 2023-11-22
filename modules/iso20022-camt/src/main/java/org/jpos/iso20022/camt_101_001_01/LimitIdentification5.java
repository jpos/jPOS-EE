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

package org.jpos.iso20022.camt_101_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitIdentification5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LimitIdentification5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysId" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}SystemIdentification2Choice" minOccurs="0"/>
 *         <element name="BilLmtCtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}LimitType1Choice"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:camt.101.001.01}AccountIdentification4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitIdentification5", propOrder = {
    "sysId",
    "bilLmtCtrPtyId",
    "tp",
    "acctOwnr",
    "acctId"
})
public class LimitIdentification5 {

    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "BilLmtCtrPtyId")
    protected BranchAndFinancialInstitutionIdentification6 bilLmtCtrPtyId;
    @XmlElement(name = "Tp", required = true)
    protected LimitType1Choice tp;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification6 acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public SystemIdentification2Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public void setSysId(SystemIdentification2Choice value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the bilLmtCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getBilLmtCtrPtyId() {
        return bilLmtCtrPtyId;
    }

    /**
     * Sets the value of the bilLmtCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setBilLmtCtrPtyId(BranchAndFinancialInstitutionIdentification6 value) {
        this.bilLmtCtrPtyId = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType1Choice }
     *     
     */
    public LimitType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType1Choice }
     *     
     */
    public void setTp(LimitType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctOwnr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
    }

}
