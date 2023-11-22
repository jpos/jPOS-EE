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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReturnCriteria5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionReturnCriteria5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtToRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}SystemReturnCriteria2" minOccurs="0"/>
 *         <element name="PmtFrRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}SystemReturnCriteria2" minOccurs="0"/>
 *         <element name="AcctCshNtryRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}AccountCashEntryReturnCriteria3" minOccurs="0"/>
 *         <element name="PmtRtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentReturnCriteria4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReturnCriteria5", propOrder = {
    "pmtToRtrCrit",
    "pmtFrRtrCrit",
    "acctCshNtryRtrCrit",
    "pmtRtrCrit"
})
public class TransactionReturnCriteria5 {

    @XmlElement(name = "PmtToRtrCrit")
    protected SystemReturnCriteria2 pmtToRtrCrit;
    @XmlElement(name = "PmtFrRtrCrit")
    protected SystemReturnCriteria2 pmtFrRtrCrit;
    @XmlElement(name = "AcctCshNtryRtrCrit")
    protected AccountCashEntryReturnCriteria3 acctCshNtryRtrCrit;
    @XmlElement(name = "PmtRtrCrit")
    protected PaymentReturnCriteria4 pmtRtrCrit;

    /**
     * Gets the value of the pmtToRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public SystemReturnCriteria2 getPmtToRtrCrit() {
        return pmtToRtrCrit;
    }

    /**
     * Sets the value of the pmtToRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public void setPmtToRtrCrit(SystemReturnCriteria2 value) {
        this.pmtToRtrCrit = value;
    }

    /**
     * Gets the value of the pmtFrRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public SystemReturnCriteria2 getPmtFrRtrCrit() {
        return pmtFrRtrCrit;
    }

    /**
     * Sets the value of the pmtFrRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public void setPmtFrRtrCrit(SystemReturnCriteria2 value) {
        this.pmtFrRtrCrit = value;
    }

    /**
     * Gets the value of the acctCshNtryRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCashEntryReturnCriteria3 }
     *     
     */
    public AccountCashEntryReturnCriteria3 getAcctCshNtryRtrCrit() {
        return acctCshNtryRtrCrit;
    }

    /**
     * Sets the value of the acctCshNtryRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCashEntryReturnCriteria3 }
     *     
     */
    public void setAcctCshNtryRtrCrit(AccountCashEntryReturnCriteria3 value) {
        this.acctCshNtryRtrCrit = value;
    }

    /**
     * Gets the value of the pmtRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnCriteria4 }
     *     
     */
    public PaymentReturnCriteria4 getPmtRtrCrit() {
        return pmtRtrCrit;
    }

    /**
     * Sets the value of the pmtRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnCriteria4 }
     *     
     */
    public void setPmtRtrCrit(PaymentReturnCriteria4 value) {
        this.pmtRtrCrit = value;
    }

}
