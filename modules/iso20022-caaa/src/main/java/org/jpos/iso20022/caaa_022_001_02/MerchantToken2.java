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

package org.jpos.iso20022.caaa_022_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantToken2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MerchantToken2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TknXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max10Text" minOccurs="0"/>
 *         <element name="TknChrtc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TknRqstr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}PaymentTokenIdentifiers1" minOccurs="0"/>
 *         <element name="TknAssrncLvl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Number" minOccurs="0"/>
 *         <element name="TknAssrncData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max500Binary" minOccurs="0"/>
 *         <element name="TknAssrncMtd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max2NumericText" minOccurs="0"/>
 *         <element name="TknInittdInd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantToken2", propOrder = {
    "tkn",
    "tknXpryDt",
    "tknChrtc",
    "tknRqstr",
    "tknAssrncLvl",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknInittdInd"
})
public class MerchantToken2 {

    @XmlElement(name = "Tkn")
    protected String tkn;
    @XmlElement(name = "TknXpryDt")
    protected String tknXpryDt;
    @XmlElement(name = "TknChrtc")
    protected List<String> tknChrtc;
    @XmlElement(name = "TknRqstr")
    protected PaymentTokenIdentifiers1 tknRqstr;
    @XmlElement(name = "TknAssrncLvl")
    protected BigDecimal tknAssrncLvl;
    @XmlElement(name = "TknAssrncData")
    protected byte[] tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknInittdInd")
    protected Boolean tknInittdInd;

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkn(String value) {
        this.tkn = value;
    }

    /**
     * Gets the value of the tknXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Sets the value of the tknXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknXpryDt(String value) {
        this.tknXpryDt = value;
    }

    /**
     * Gets the value of the tknChrtc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tknChrtc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTknChrtc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the tknChrtc property.
     */
    public List<String> getTknChrtc() {
        if (tknChrtc == null) {
            tknChrtc = new ArrayList<>();
        }
        return this.tknChrtc;
    }

    /**
     * Gets the value of the tknRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public PaymentTokenIdentifiers1 getTknRqstr() {
        return tknRqstr;
    }

    /**
     * Sets the value of the tknRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public void setTknRqstr(PaymentTokenIdentifiers1 value) {
        this.tknRqstr = value;
    }

    /**
     * Gets the value of the tknAssrncLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTknAssrncLvl() {
        return tknAssrncLvl;
    }

    /**
     * Sets the value of the tknAssrncLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTknAssrncLvl(BigDecimal value) {
        this.tknAssrncLvl = value;
    }

    /**
     * Gets the value of the tknAssrncData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTknAssrncData() {
        return tknAssrncData;
    }

    /**
     * Sets the value of the tknAssrncData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTknAssrncData(byte[] value) {
        this.tknAssrncData = value;
    }

    /**
     * Gets the value of the tknAssrncMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncMtd() {
        return tknAssrncMtd;
    }

    /**
     * Sets the value of the tknAssrncMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncMtd(String value) {
        this.tknAssrncMtd = value;
    }

    /**
     * Gets the value of the tknInittdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknInittdInd() {
        return tknInittdInd;
    }

    /**
     * Sets the value of the tknInittdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTknInittdInd(Boolean value) {
        this.tknInittdInd = value;
    }

}
