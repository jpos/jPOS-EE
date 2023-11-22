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

package org.jpos.iso20022.colr_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValueReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValueReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}CashAccount38"/>
 *         <element name="CshAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}SystemPartyIdentification11" minOccurs="0"/>
 *         <element name="CshAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="SctiesAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="SctiesAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="CollValRpt" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}CollateralValueReportOrError6Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueReport3", propOrder = {
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "sctiesAcctOwnr",
    "sctiesAcctSvcr",
    "collValRpt"
})
public class CollateralValueReport3 {

    @XmlElement(name = "CshAcct", required = true)
    protected CashAccount38 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification11 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "SctiesAcctOwnr")
    protected SystemPartyIdentification8 sctiesAcctOwnr;
    @XmlElement(name = "SctiesAcctSvcr")
    protected PartyIdentification136 sctiesAcctSvcr;
    @XmlElement(name = "CollValRpt")
    protected List<CollateralValueReportOrError6Choice> collValRpt;

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
     *     {@link SystemPartyIdentification11 }
     *     
     */
    public SystemPartyIdentification11 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification11 }
     *     
     */
    public void setCshAcctOwnr(SystemPartyIdentification11 value) {
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

    /**
     * Gets the value of the collValRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collValRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollValRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValueReportOrError6Choice }
     * 
     * 
     * @return
     *     The value of the collValRpt property.
     */
    public List<CollateralValueReportOrError6Choice> getCollValRpt() {
        if (collValRpt == null) {
            collValRpt = new ArrayList<>();
        }
        return this.collValRpt;
    }

}
