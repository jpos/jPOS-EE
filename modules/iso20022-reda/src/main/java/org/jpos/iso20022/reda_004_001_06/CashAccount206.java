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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccount206 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccount206">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AccountIdentificationAndName7"/>
 *         <element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AnyBICDec2014Identifier" minOccurs="0"/>
 *         <element name="AcctTpDesc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount206", propOrder = {
    "acctId",
    "svcr",
    "acctTpDesc"
})
public class CashAccount206 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentificationAndName7 acctId;
    @XmlElement(name = "Svcr")
    protected String svcr;
    @XmlElement(name = "AcctTpDesc")
    protected String acctTpDesc;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName7 }
     *     
     */
    public AccountIdentificationAndName7 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName7 }
     *     
     */
    public void setAcctId(AccountIdentificationAndName7 value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcr(String value) {
        this.svcr = value;
    }

    /**
     * Gets the value of the acctTpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTpDesc() {
        return acctTpDesc;
    }

    /**
     * Sets the value of the acctTpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTpDesc(String value) {
        this.acctTpDesc = value;
    }

}
