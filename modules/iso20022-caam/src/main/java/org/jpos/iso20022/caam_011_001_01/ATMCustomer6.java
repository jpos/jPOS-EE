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

package org.jpos.iso20022.caam_011_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCustomer6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCustomer6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prfl" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}ATMCustomerProfile4" minOccurs="0"/>
 *         <element name="SelctdLang" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}LanguageCode" minOccurs="0"/>
 *         <element name="AuthntcnRslt" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}TransactionVerificationResult5" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomer6", propOrder = {
    "prfl",
    "selctdLang",
    "authntcnRslt"
})
public class ATMCustomer6 {

    @XmlElement(name = "Prfl")
    protected ATMCustomerProfile4 prfl;
    @XmlElement(name = "SelctdLang")
    protected String selctdLang;
    @XmlElement(name = "AuthntcnRslt", required = true)
    protected List<TransactionVerificationResult5> authntcnRslt;

    /**
     * Gets the value of the prfl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile4 }
     *     
     */
    public ATMCustomerProfile4 getPrfl() {
        return prfl;
    }

    /**
     * Sets the value of the prfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile4 }
     *     
     */
    public void setPrfl(ATMCustomerProfile4 value) {
        this.prfl = value;
    }

    /**
     * Gets the value of the selctdLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelctdLang() {
        return selctdLang;
    }

    /**
     * Sets the value of the selctdLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelctdLang(String value) {
        this.selctdLang = value;
    }

    /**
     * Gets the value of the authntcnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authntcnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult5 }
     * 
     * 
     * @return
     *     The value of the authntcnRslt property.
     */
    public List<TransactionVerificationResult5> getAuthntcnRslt() {
        if (authntcnRslt == null) {
            authntcnRslt = new ArrayList<>();
        }
        return this.authntcnRslt;
    }

}
