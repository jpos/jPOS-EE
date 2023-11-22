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

package org.jpos.iso20022.cain_024_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wallet2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Wallet2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}PartyIdentification258" minOccurs="0"/>
 *         <element name="PANAge" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="UsrAcctAge" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="WlltAcctAge" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="DaysSncLastActvty" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="Actvty" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max10PositiveNumber" minOccurs="0"/>
 *         <element name="ActvtyIntrvl" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Frequency12Code" minOccurs="0"/>
 *         <element name="LastWlltChng" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="SspdCrds" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="WlltAcctCtry" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}ISOMax3ACountryCode" minOccurs="0"/>
 *         <element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}CardDataReading9Code" minOccurs="0"/>
 *         <element name="OthrCardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max35Text" minOccurs="0"/>
 *         <element name="WlltAcctEmailAge" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="WlltPrvdrRskAssmnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}RiskAssessment1Code" minOccurs="0"/>
 *         <element name="WlltPrvdrRskAssmntMdlVrsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max35Text" minOccurs="0"/>
 *         <element name="WlltPrvdrPhneScore" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="WlltPrvdrDvcScore" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="WlltPrvdrAcctScore" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}Max5PositiveNumber" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.024.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wallet2", propOrder = {
    "prvdr",
    "panAge",
    "usrAcctAge",
    "wlltAcctAge",
    "daysSncLastActvty",
    "actvty",
    "actvtyIntrvl",
    "lastWlltChng",
    "sspdCrds",
    "wlltAcctCtry",
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "wlltAcctEmailAge",
    "wlltPrvdrRskAssmnt",
    "wlltPrvdrRskAssmntMdlVrsn",
    "wlltPrvdrPhneScore",
    "wlltPrvdrDvcScore",
    "wlltPrvdrAcctScore",
    "addtlData"
})
public class Wallet2 {

    @XmlElement(name = "Prvdr")
    protected PartyIdentification258 prvdr;
    @XmlElement(name = "PANAge")
    protected BigDecimal panAge;
    @XmlElement(name = "UsrAcctAge")
    protected BigDecimal usrAcctAge;
    @XmlElement(name = "WlltAcctAge")
    protected BigDecimal wlltAcctAge;
    @XmlElement(name = "DaysSncLastActvty")
    protected BigDecimal daysSncLastActvty;
    @XmlElement(name = "Actvty")
    protected BigDecimal actvty;
    @XmlElement(name = "ActvtyIntrvl")
    @XmlSchemaType(name = "string")
    protected Frequency12Code actvtyIntrvl;
    @XmlElement(name = "LastWlltChng")
    protected BigDecimal lastWlltChng;
    @XmlElement(name = "SspdCrds")
    protected BigDecimal sspdCrds;
    @XmlElement(name = "WlltAcctCtry")
    protected String wlltAcctCtry;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading9Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "WlltAcctEmailAge")
    protected BigDecimal wlltAcctEmailAge;
    @XmlElement(name = "WlltPrvdrRskAssmnt")
    @XmlSchemaType(name = "string")
    protected RiskAssessment1Code wlltPrvdrRskAssmnt;
    @XmlElement(name = "WlltPrvdrRskAssmntMdlVrsn")
    protected String wlltPrvdrRskAssmntMdlVrsn;
    @XmlElement(name = "WlltPrvdrPhneScore")
    protected BigDecimal wlltPrvdrPhneScore;
    @XmlElement(name = "WlltPrvdrDvcScore")
    protected BigDecimal wlltPrvdrDvcScore;
    @XmlElement(name = "WlltPrvdrAcctScore")
    protected BigDecimal wlltPrvdrAcctScore;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public void setPrvdr(PartyIdentification258 value) {
        this.prvdr = value;
    }

    /**
     * Gets the value of the panAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPANAge() {
        return panAge;
    }

    /**
     * Sets the value of the panAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPANAge(BigDecimal value) {
        this.panAge = value;
    }

    /**
     * Gets the value of the usrAcctAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsrAcctAge() {
        return usrAcctAge;
    }

    /**
     * Sets the value of the usrAcctAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsrAcctAge(BigDecimal value) {
        this.usrAcctAge = value;
    }

    /**
     * Gets the value of the wlltAcctAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltAcctAge() {
        return wlltAcctAge;
    }

    /**
     * Sets the value of the wlltAcctAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltAcctAge(BigDecimal value) {
        this.wlltAcctAge = value;
    }

    /**
     * Gets the value of the daysSncLastActvty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysSncLastActvty() {
        return daysSncLastActvty;
    }

    /**
     * Sets the value of the daysSncLastActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysSncLastActvty(BigDecimal value) {
        this.daysSncLastActvty = value;
    }

    /**
     * Gets the value of the actvty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActvty() {
        return actvty;
    }

    /**
     * Sets the value of the actvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActvty(BigDecimal value) {
        this.actvty = value;
    }

    /**
     * Gets the value of the actvtyIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency12Code }
     *     
     */
    public Frequency12Code getActvtyIntrvl() {
        return actvtyIntrvl;
    }

    /**
     * Sets the value of the actvtyIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency12Code }
     *     
     */
    public void setActvtyIntrvl(Frequency12Code value) {
        this.actvtyIntrvl = value;
    }

    /**
     * Gets the value of the lastWlltChng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastWlltChng() {
        return lastWlltChng;
    }

    /**
     * Sets the value of the lastWlltChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastWlltChng(BigDecimal value) {
        this.lastWlltChng = value;
    }

    /**
     * Gets the value of the sspdCrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSspdCrds() {
        return sspdCrds;
    }

    /**
     * Sets the value of the sspdCrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSspdCrds(BigDecimal value) {
        this.sspdCrds = value;
    }

    /**
     * Gets the value of the wlltAcctCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlltAcctCtry() {
        return wlltAcctCtry;
    }

    /**
     * Sets the value of the wlltAcctCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlltAcctCtry(String value) {
        this.wlltAcctCtry = value;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading9Code }
     *     
     */
    public CardDataReading9Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading9Code }
     *     
     */
    public void setCardDataNtryMd(CardDataReading9Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Gets the value of the othrCardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCardDataNtryMd() {
        return othrCardDataNtryMd;
    }

    /**
     * Sets the value of the othrCardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
    }

    /**
     * Gets the value of the wlltAcctEmailAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltAcctEmailAge() {
        return wlltAcctEmailAge;
    }

    /**
     * Sets the value of the wlltAcctEmailAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltAcctEmailAge(BigDecimal value) {
        this.wlltAcctEmailAge = value;
    }

    /**
     * Gets the value of the wlltPrvdrRskAssmnt property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public RiskAssessment1Code getWlltPrvdrRskAssmnt() {
        return wlltPrvdrRskAssmnt;
    }

    /**
     * Sets the value of the wlltPrvdrRskAssmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public void setWlltPrvdrRskAssmnt(RiskAssessment1Code value) {
        this.wlltPrvdrRskAssmnt = value;
    }

    /**
     * Gets the value of the wlltPrvdrRskAssmntMdlVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlltPrvdrRskAssmntMdlVrsn() {
        return wlltPrvdrRskAssmntMdlVrsn;
    }

    /**
     * Sets the value of the wlltPrvdrRskAssmntMdlVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlltPrvdrRskAssmntMdlVrsn(String value) {
        this.wlltPrvdrRskAssmntMdlVrsn = value;
    }

    /**
     * Gets the value of the wlltPrvdrPhneScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrPhneScore() {
        return wlltPrvdrPhneScore;
    }

    /**
     * Sets the value of the wlltPrvdrPhneScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltPrvdrPhneScore(BigDecimal value) {
        this.wlltPrvdrPhneScore = value;
    }

    /**
     * Gets the value of the wlltPrvdrDvcScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrDvcScore() {
        return wlltPrvdrDvcScore;
    }

    /**
     * Sets the value of the wlltPrvdrDvcScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltPrvdrDvcScore(BigDecimal value) {
        this.wlltPrvdrDvcScore = value;
    }

    /**
     * Gets the value of the wlltPrvdrAcctScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrAcctScore() {
        return wlltPrvdrAcctScore;
    }

    /**
     * Sets the value of the wlltPrvdrAcctScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltPrvdrAcctScore(BigDecimal value) {
        this.wlltPrvdrAcctScore = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
