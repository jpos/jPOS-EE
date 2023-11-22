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

package org.jpos.iso20022.colr_001_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValueSearchCriteria3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValueSearchCriteria3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}ActiveOrHistoricCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="CshAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}SecurityIdentification19" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctiesAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="SctiesAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}PartyIdentification136" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueSearchCriteria3", propOrder = {
    "cshAcctId",
    "ccy",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "finInstrmId",
    "sctiesAcctOwnr",
    "sctiesAcctSvcr"
})
public class CollateralValueSearchCriteria3 {

    @XmlElement(name = "CshAcctId")
    protected AccountIdentification4Choice cshAcctId;
    @XmlElement(name = "Ccy")
    protected List<String> ccy;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification19> finInstrmId;
    @XmlElement(name = "SctiesAcctOwnr")
    protected SystemPartyIdentification8 sctiesAcctOwnr;
    @XmlElement(name = "SctiesAcctSvcr")
    protected PartyIdentification136 sctiesAcctSvcr;

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setCshAcctId(AccountIdentification4Choice value) {
        this.cshAcctId = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ccy property.
     */
    public List<String> getCcy() {
        if (ccy == null) {
            ccy = new ArrayList<>();
        }
        return this.ccy;
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
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification19 }
     * 
     * 
     * @return
     *     The value of the finInstrmId property.
     */
    public List<SecurityIdentification19> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<>();
        }
        return this.finInstrmId;
    }

    /**
     * Gets the value of the sctiesAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getSctiesAcctOwnr() {
        return sctiesAcctOwnr;
    }

    /**
     * Sets the value of the sctiesAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public void setSctiesAcctOwnr(SystemPartyIdentification8 value) {
        this.sctiesAcctOwnr = value;
    }

    /**
     * Gets the value of the sctiesAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getSctiesAcctSvcr() {
        return sctiesAcctSvcr;
    }

    /**
     * Sets the value of the sctiesAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setSctiesAcctSvcr(PartyIdentification136 value) {
        this.sctiesAcctSvcr = value;
    }

}
