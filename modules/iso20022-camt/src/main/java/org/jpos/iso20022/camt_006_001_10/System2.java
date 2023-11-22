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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for System2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="System2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}MarketInfrastructureIdentification1Choice" minOccurs="0"/>
 *         <element name="MmbId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}CountryCode" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}AccountIdentification4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "System2", propOrder = {
    "sysId",
    "mmbId",
    "ctry",
    "acctId"
})
public class System2 {

    @XmlElement(name = "SysId")
    protected MarketInfrastructureIdentification1Choice sysId;
    @XmlElement(name = "MmbId")
    protected BranchAndFinancialInstitutionIdentification6 mmbId;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public MarketInfrastructureIdentification1Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public void setSysId(MarketInfrastructureIdentification1Choice value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setMmbId(BranchAndFinancialInstitutionIdentification6 value) {
        this.mmbId = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
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
