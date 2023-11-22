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

package org.jpos.iso20022.setr_018_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundOrder8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentFundOrder8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.018.001.04}Max35Text" minOccurs="0"/>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.018.001.04}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.018.001.04}Max35Text" minOccurs="0"/>
 *         <element name="CxlRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.018.001.04}Max35Text" minOccurs="0"/>
 *         <element name="DealRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.018.001.04}Max35Text" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.018.001.04}InvestmentAccount58" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.018.001.04}FinancialInstrument57" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundOrder8", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "cxlRef",
    "dealRef",
    "invstmtAcctDtls",
    "finInstrmDtls"
})
public class InvestmentFundOrder8 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument57 finInstrmDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrRef(String value) {
        this.ordrRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntRef(String value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRef(String value) {
        this.cxlRef = value;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealRef(String value) {
        this.dealRef = value;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public void setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
    }

}
