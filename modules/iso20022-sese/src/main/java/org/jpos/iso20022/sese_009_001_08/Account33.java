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

package org.jpos.iso20022.sese_009_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Account33">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OwnrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}PartyIdentification132" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max35Text" minOccurs="0"/>
 *         <element name="AcctDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max35Text" minOccurs="0"/>
 *         <element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}GenericIdentification30" minOccurs="0"/>
 *         <element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}PartyIdentification132" minOccurs="0"/>
 *         <element name="SubAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.009.001.08}SubAccount5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account33", propOrder = {
    "ownrId",
    "acctId",
    "acctDsgnt",
    "acctNm",
    "tp",
    "svcr",
    "subAcctDtls"
})
public class Account33 {

    @XmlElement(name = "OwnrId")
    protected PartyIdentification132 ownrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "Tp")
    protected GenericIdentification30 tp;
    @XmlElement(name = "Svcr")
    protected PartyIdentification132 svcr;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount5 subAcctDtls;

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public void setOwnrId(PartyIdentification132 value) {
        this.ownrId = value;
    }

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
     * Gets the value of the acctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Sets the value of the acctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDsgnt(String value) {
        this.acctDsgnt = value;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNm(String value) {
        this.acctNm = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setTp(GenericIdentification30 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public void setSvcr(PartyIdentification132 value) {
        this.svcr = value;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount5 }
     *     
     */
    public SubAccount5 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount5 }
     *     
     */
    public void setSubAcctDtls(SubAccount5 value) {
        this.subAcctDtls = value;
    }

}
