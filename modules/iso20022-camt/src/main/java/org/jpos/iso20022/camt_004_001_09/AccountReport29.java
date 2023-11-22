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

package org.jpos.iso20022.camt_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountReport29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountReport29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}AccountIdentification4Choice"/>
 *         <element name="AcctOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}AccountOrBusinessError5Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReport29", propOrder = {
    "acctId",
    "acctOrErr"
})
public class AccountReport29 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "AcctOrErr", required = true)
    protected AccountOrBusinessError5Choice acctOrErr;

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

    /**
     * Gets the value of the acctOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOrBusinessError5Choice }
     *     
     */
    public AccountOrBusinessError5Choice getAcctOrErr() {
        return acctOrErr;
    }

    /**
     * Sets the value of the acctOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOrBusinessError5Choice }
     *     
     */
    public void setAcctOrErr(AccountOrBusinessError5Choice value) {
        this.acctOrErr = value;
    }

}
