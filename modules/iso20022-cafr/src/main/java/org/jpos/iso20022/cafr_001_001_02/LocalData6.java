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

package org.jpos.iso20022.cafr_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalData6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocalData6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}ISOMax3ALanguageCode"/>
 *         <element name="MlngAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Address3" minOccurs="0"/>
 *         <element name="MlngAdrUstrd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max512Text" minOccurs="0"/>
 *         <element name="MldFrPstlCd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CrdhldrNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}CardholderName2" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}AdditionalInformation22" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalData6", propOrder = {
    "lang",
    "mlngAdr",
    "mlngAdrUstrd",
    "mldFrPstlCd",
    "crdhldrNm",
    "addtlInf",
    "addtlData"
})
public class LocalData6 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "MlngAdr")
    protected Address3 mlngAdr;
    @XmlElement(name = "MlngAdrUstrd")
    protected String mlngAdrUstrd;
    @XmlElement(name = "MldFrPstlCd")
    protected String mldFrPstlCd;
    @XmlElement(name = "CrdhldrNm")
    protected CardholderName2 crdhldrNm;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation22> addtlInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the mlngAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address3 }
     *     
     */
    public Address3 getMlngAdr() {
        return mlngAdr;
    }

    /**
     * Sets the value of the mlngAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address3 }
     *     
     */
    public void setMlngAdr(Address3 value) {
        this.mlngAdr = value;
    }

    /**
     * Gets the value of the mlngAdrUstrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlngAdrUstrd() {
        return mlngAdrUstrd;
    }

    /**
     * Sets the value of the mlngAdrUstrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlngAdrUstrd(String value) {
        this.mlngAdrUstrd = value;
    }

    /**
     * Gets the value of the mldFrPstlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMldFrPstlCd() {
        return mldFrPstlCd;
    }

    /**
     * Sets the value of the mldFrPstlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMldFrPstlCd(String value) {
        this.mldFrPstlCd = value;
    }

    /**
     * Gets the value of the crdhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName2 }
     *     
     */
    public CardholderName2 getCrdhldrNm() {
        return crdhldrNm;
    }

    /**
     * Sets the value of the crdhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName2 }
     *     
     */
    public void setCrdhldrNm(CardholderName2 value) {
        this.crdhldrNm = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation22 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation22> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
