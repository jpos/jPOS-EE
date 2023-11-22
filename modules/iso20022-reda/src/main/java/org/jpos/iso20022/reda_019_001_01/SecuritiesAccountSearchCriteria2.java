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

package org.jpos.iso20022.reda_019_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesAccountSearchCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesAccountSearchCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="PtyTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}SystemPartyType1Choice" minOccurs="0"/>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="AcctTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}SystemSecuritiesAccountType1Choice" minOccurs="0"/>
 *         <element name="EndInvstrFlg" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}Exact4AlphaNumericText" minOccurs="0"/>
 *         <element name="PricgSchme" type="{urn:iso:std:iso:20022:tech:xsd:reda.019.001.01}Exact4AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountSearchCriteria2", propOrder = {
    "acctId",
    "acctSvcr",
    "acctOwnr",
    "ptyTp",
    "opngDt",
    "clsgDt",
    "acctTp",
    "endInvstrFlg",
    "pricgSchme"
})
public class SecuritiesAccountSearchCriteria2 {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification136 acctSvcr;
    @XmlElement(name = "AcctOwnr")
    protected SystemPartyIdentification8 acctOwnr;
    @XmlElement(name = "PtyTp")
    protected SystemPartyType1Choice ptyTp;
    @XmlElement(name = "OpngDt")
    protected DatePeriodSearch1Choice opngDt;
    @XmlElement(name = "ClsgDt")
    protected DatePeriodSearch1Choice clsgDt;
    @XmlElement(name = "AcctTp")
    protected SystemSecuritiesAccountType1Choice acctTp;
    @XmlElement(name = "EndInvstrFlg")
    protected String endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected String pricgSchme;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setAcctSvcr(PartyIdentification136 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public void setAcctOwnr(SystemPartyIdentification8 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the ptyTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public SystemPartyType1Choice getPtyTp() {
        return ptyTp;
    }

    /**
     * Sets the value of the ptyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyType1Choice }
     *     
     */
    public void setPtyTp(SystemPartyType1Choice value) {
        this.ptyTp = value;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setOpngDt(DatePeriodSearch1Choice value) {
        this.opngDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setClsgDt(DatePeriodSearch1Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public SystemSecuritiesAccountType1Choice getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSecuritiesAccountType1Choice }
     *     
     */
    public void setAcctTp(SystemSecuritiesAccountType1Choice value) {
        this.acctTp = value;
    }

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndInvstrFlg(String value) {
        this.endInvstrFlg = value;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricgSchme(String value) {
        this.pricgSchme = value;
    }

}
