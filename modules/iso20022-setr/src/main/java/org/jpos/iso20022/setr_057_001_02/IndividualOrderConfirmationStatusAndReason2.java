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

package org.jpos.iso20022.setr_057_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualOrderConfirmationStatusAndReason2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualOrderConfirmationStatusAndReason2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}Max35Text" minOccurs="0"/>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}Max35Text"/>
 *         <element name="Conf" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}ConfirmationStatus1Choice"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}Max35Text" minOccurs="0"/>
 *         <element name="DealRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}Max35Text" minOccurs="0"/>
 *         <element name="StsInitr" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}PartyIdentification113" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}InvestmentAccount58" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}FinancialInstrument57" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualOrderConfirmationStatusAndReason2", propOrder = {
    "mstrRef",
    "ordrRef",
    "conf",
    "clntRef",
    "dealRef",
    "stsInitr",
    "invstmtAcctDtls",
    "finInstrmDtls"
})
public class IndividualOrderConfirmationStatusAndReason2 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "Conf", required = true)
    protected ConfirmationStatus1Choice conf;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification113 stsInitr;
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
     * Gets the value of the conf property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationStatus1Choice }
     *     
     */
    public ConfirmationStatus1Choice getConf() {
        return conf;
    }

    /**
     * Sets the value of the conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationStatus1Choice }
     *     
     */
    public void setConf(ConfirmationStatus1Choice value) {
        this.conf = value;
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
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setStsInitr(PartyIdentification113 value) {
        this.stsInitr = value;
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
