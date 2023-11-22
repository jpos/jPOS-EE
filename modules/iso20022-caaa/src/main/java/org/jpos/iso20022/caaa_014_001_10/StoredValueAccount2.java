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

package org.jpos.iso20022.caaa_014_001_10;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueAccount2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StoredValueAccount2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}StoredValueAccountType1Code" minOccurs="0"/>
 *         <element name="IdTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}CardIdentificationType1Code" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}Max35Text" minOccurs="0"/>
 *         <element name="Brnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}Max35Text" minOccurs="0"/>
 *         <element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}Max35Text" minOccurs="0"/>
 *         <element name="OwnrNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}Max45Text" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}Max10Text" minOccurs="0"/>
 *         <element name="NtryMd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}CardDataReading8Code" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.014.001.10}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueAccount2", propOrder = {
    "acctTp",
    "idTp",
    "id",
    "brnd",
    "prvdr",
    "ownrNm",
    "xpryDt",
    "ntryMd",
    "ccy",
    "bal"
})
public class StoredValueAccount2 {

    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected StoredValueAccountType1Code acctTp;
    @XmlElement(name = "IdTp")
    @XmlSchemaType(name = "string")
    protected CardIdentificationType1Code idTp;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Brnd")
    protected String brnd;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "OwnrNm")
    protected String ownrNm;
    @XmlElement(name = "XpryDt")
    protected String xpryDt;
    @XmlElement(name = "NtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code ntryMd;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Bal")
    protected BigDecimal bal;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueAccountType1Code }
     *     
     */
    public StoredValueAccountType1Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueAccountType1Code }
     *     
     */
    public void setAcctTp(StoredValueAccountType1Code value) {
        this.acctTp = value;
    }

    /**
     * Gets the value of the idTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentificationType1Code }
     *     
     */
    public CardIdentificationType1Code getIdTp() {
        return idTp;
    }

    /**
     * Sets the value of the idTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentificationType1Code }
     *     
     */
    public void setIdTp(CardIdentificationType1Code value) {
        this.idTp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the brnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnd() {
        return brnd;
    }

    /**
     * Sets the value of the brnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnd(String value) {
        this.brnd = value;
    }

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvdr(String value) {
        this.prvdr = value;
    }

    /**
     * Gets the value of the ownrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrNm() {
        return ownrNm;
    }

    /**
     * Sets the value of the ownrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnrNm(String value) {
        this.ownrNm = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpryDt(String value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the ntryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getNtryMd() {
        return ntryMd;
    }

    /**
     * Sets the value of the ntryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public void setNtryMd(CardDataReading8Code value) {
        this.ntryMd = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBal(BigDecimal value) {
        this.bal = value;
    }

}
