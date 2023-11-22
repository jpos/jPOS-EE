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

package org.jpos.iso20022.camt_081_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceModification6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceModification6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}CashAccount38" minOccurs="0"/>
 *         <element name="CshAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="CshAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}ProcessingStatus71Choice" minOccurs="0"/>
 *         <element name="ReqRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}Max35Text"/>
 *         <element name="StsDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="ReqDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}RequestDetails22" minOccurs="0"/>
 *         <element name="UndrlygIntraBal" type="{urn:iso:std:iso:20022:tech:xsd:camt.081.001.01}IntraBalance5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceModification6", propOrder = {
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "prcgSts",
    "reqRef",
    "stsDt",
    "reqDtls",
    "undrlygIntraBal"
})
public class IntraBalanceModification6 {

    @XmlElement(name = "CshAcct")
    protected CashAccount38 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus71Choice prcgSts;
    @XmlElement(name = "ReqRef", required = true)
    protected String reqRef;
    @XmlElement(name = "StsDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDt;
    @XmlElement(name = "ReqDtls")
    protected RequestDetails22 reqDtls;
    @XmlElement(name = "UndrlygIntraBal")
    protected IntraBalance5 undrlygIntraBal;

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setCshAcct(CashAccount38 value) {
        this.cshAcct = value;
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
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus71Choice }
     *     
     */
    public ProcessingStatus71Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus71Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus71Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRef(String value) {
        this.reqRef = value;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStsDt(XMLGregorianCalendar value) {
        this.stsDt = value;
    }

    /**
     * Gets the value of the reqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDetails22 }
     *     
     */
    public RequestDetails22 getReqDtls() {
        return reqDtls;
    }

    /**
     * Sets the value of the reqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDetails22 }
     *     
     */
    public void setReqDtls(RequestDetails22 value) {
        this.reqDtls = value;
    }

    /**
     * Gets the value of the undrlygIntraBal property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalance5 }
     *     
     */
    public IntraBalance5 getUndrlygIntraBal() {
        return undrlygIntraBal;
    }

    /**
     * Sets the value of the undrlygIntraBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalance5 }
     *     
     */
    public void setUndrlygIntraBal(IntraBalance5 value) {
        this.undrlygIntraBal = value;
    }

}
