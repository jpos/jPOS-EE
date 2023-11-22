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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralData33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralData33">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NetXpsrCollstnInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CmpntTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}CollateralType6Code" minOccurs="0"/>
 *         <element name="CshCollCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="PricCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="Qlty" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}CollateralQualityType1Code" minOccurs="0"/>
 *         <element name="Mtrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ContractTerm6Choice" minOccurs="0"/>
 *         <element name="IssrJursdctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}IssuerJurisdiction1Choice" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}SecuritiesLendingType3Choice" minOccurs="0"/>
 *         <element name="TradRpstry" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="RcncltnFlg" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ReconciliationFlag2" minOccurs="0"/>
 *         <element name="RinvstdCsh" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ReinvestedCashTypeAndAmount2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralData33", propOrder = {
    "netXpsrCollstnInd",
    "cmpntTp",
    "cshCollCcy",
    "pricCcy",
    "qlty",
    "mtrty",
    "issrJursdctn",
    "tp",
    "tradRpstry",
    "rcncltnFlg",
    "rinvstdCsh"
})
public class CollateralData33 {

    @XmlElement(name = "NetXpsrCollstnInd")
    protected Boolean netXpsrCollstnInd;
    @XmlElement(name = "CmpntTp")
    @XmlSchemaType(name = "string")
    protected CollateralType6Code cmpntTp;
    @XmlElement(name = "CshCollCcy")
    protected String cshCollCcy;
    @XmlElement(name = "PricCcy")
    protected String pricCcy;
    @XmlElement(name = "Qlty")
    @XmlSchemaType(name = "string")
    protected CollateralQualityType1Code qlty;
    @XmlElement(name = "Mtrty")
    protected ContractTerm6Choice mtrty;
    @XmlElement(name = "IssrJursdctn")
    protected IssuerJurisdiction1Choice issrJursdctn;
    @XmlElement(name = "Tp")
    protected SecuritiesLendingType3Choice tp;
    @XmlElement(name = "TradRpstry")
    protected OrganisationIdentification15Choice tradRpstry;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag2 rcncltnFlg;
    @XmlElement(name = "RinvstdCsh")
    protected ReinvestedCashTypeAndAmount2 rinvstdCsh;

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetXpsrCollstnInd(Boolean value) {
        this.netXpsrCollstnInd = value;
    }

    /**
     * Gets the value of the cmpntTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType6Code }
     *     
     */
    public CollateralType6Code getCmpntTp() {
        return cmpntTp;
    }

    /**
     * Sets the value of the cmpntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType6Code }
     *     
     */
    public void setCmpntTp(CollateralType6Code value) {
        this.cmpntTp = value;
    }

    /**
     * Gets the value of the cshCollCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshCollCcy() {
        return cshCollCcy;
    }

    /**
     * Sets the value of the cshCollCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshCollCcy(String value) {
        this.cshCollCcy = value;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricCcy() {
        return pricCcy;
    }

    /**
     * Sets the value of the pricCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricCcy(String value) {
        this.pricCcy = value;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public CollateralQualityType1Code getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public void setQlty(CollateralQualityType1Code value) {
        this.qlty = value;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public ContractTerm6Choice getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public void setMtrty(ContractTerm6Choice value) {
        this.mtrty = value;
    }

    /**
     * Gets the value of the issrJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerJurisdiction1Choice }
     *     
     */
    public IssuerJurisdiction1Choice getIssrJursdctn() {
        return issrJursdctn;
    }

    /**
     * Sets the value of the issrJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerJurisdiction1Choice }
     *     
     */
    public void setIssrJursdctn(IssuerJurisdiction1Choice value) {
        this.issrJursdctn = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesLendingType3Choice }
     *     
     */
    public SecuritiesLendingType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesLendingType3Choice }
     *     
     */
    public void setTp(SecuritiesLendingType3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tradRpstry property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getTradRpstry() {
        return tradRpstry;
    }

    /**
     * Sets the value of the tradRpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setTradRpstry(OrganisationIdentification15Choice value) {
        this.tradRpstry = value;
    }

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public ReconciliationFlag2 getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFlag2 }
     *     
     */
    public void setRcncltnFlg(ReconciliationFlag2 value) {
        this.rcncltnFlg = value;
    }

    /**
     * Gets the value of the rinvstdCsh property.
     * 
     * @return
     *     possible object is
     *     {@link ReinvestedCashTypeAndAmount2 }
     *     
     */
    public ReinvestedCashTypeAndAmount2 getRinvstdCsh() {
        return rinvstdCsh;
    }

    /**
     * Sets the value of the rinvstdCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinvestedCashTypeAndAmount2 }
     *     
     */
    public void setRinvstdCsh(ReinvestedCashTypeAndAmount2 value) {
        this.rinvstdCsh = value;
    }

}
