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

package org.jpos.iso20022.caaa_001_001_12;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyAccount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyAccount3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LltyId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text"/>
 *         <element name="NtryMd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardDataReading8Code" minOccurs="0"/>
 *         <element name="IdTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardIdentificationType1Code" minOccurs="0"/>
 *         <element name="Brnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max35Text" minOccurs="0"/>
 *         <element name="OwnrNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max45Text" minOccurs="0"/>
 *         <element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}AmountUnit1Code" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyAccount3", propOrder = {
    "lltyId",
    "ntryMd",
    "idTp",
    "brnd",
    "prvdr",
    "ownrNm",
    "unit",
    "ccy",
    "bal"
})
public class LoyaltyAccount3 {

    @XmlElement(name = "LltyId", required = true)
    protected String lltyId;
    @XmlElement(name = "NtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code ntryMd;
    @XmlElement(name = "IdTp")
    @XmlSchemaType(name = "string")
    protected CardIdentificationType1Code idTp;
    @XmlElement(name = "Brnd")
    protected String brnd;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "OwnrNm")
    protected String ownrNm;
    @XmlElement(name = "Unit")
    @XmlSchemaType(name = "string")
    protected AmountUnit1Code unit;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Bal")
    protected BigDecimal bal;

    /**
     * Gets the value of the lltyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLltyId() {
        return lltyId;
    }

    /**
     * Sets the value of the lltyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLltyId(String value) {
        this.lltyId = value;
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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountUnit1Code }
     *     
     */
    public AmountUnit1Code getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountUnit1Code }
     *     
     */
    public void setUnit(AmountUnit1Code value) {
        this.unit = value;
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
