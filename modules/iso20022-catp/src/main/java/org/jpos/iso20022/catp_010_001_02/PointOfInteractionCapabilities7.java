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

package org.jpos.iso20022.catp_010_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteractionCapabilities7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteractionCapabilities7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardRdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}CardDataReading4Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CardWrtData" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}CardDataReading4Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Authntcn" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}CardholderVerificationCapability3Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PINLngthCpblties" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}Number" minOccurs="0"/>
 *         <element name="ApprvlCdLngth" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}Number" minOccurs="0"/>
 *         <element name="MxScrptLngth" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}Number" minOccurs="0"/>
 *         <element name="CardCaptrCpbl" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="WdrwlMdia" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}ATMMediaType1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DpstdMdia" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}ATMMediaType2Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MsgCpblties" type="{urn:iso:std:iso:20022:tech:xsd:catp.010.001.02}DisplayCapabilities5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionCapabilities7", propOrder = {
    "cardRdData",
    "cardWrtData",
    "authntcn",
    "pinLngthCpblties",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "wdrwlMdia",
    "dpstdMdia",
    "msgCpblties"
})
public class PointOfInteractionCapabilities7 {

    @XmlElement(name = "CardRdData")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading4Code> cardRdData;
    @XmlElement(name = "CardWrtData")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading4Code> cardWrtData;
    @XmlElement(name = "Authntcn")
    @XmlSchemaType(name = "string")
    protected List<CardholderVerificationCapability3Code> authntcn;
    @XmlElement(name = "PINLngthCpblties")
    protected BigDecimal pinLngthCpblties;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "WdrwlMdia")
    @XmlSchemaType(name = "string")
    protected List<ATMMediaType1Code> wdrwlMdia;
    @XmlElement(name = "DpstdMdia")
    @XmlSchemaType(name = "string")
    protected List<ATMMediaType2Code> dpstdMdia;
    @XmlElement(name = "MsgCpblties")
    protected List<DisplayCapabilities5> msgCpblties;

    /**
     * Gets the value of the cardRdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardRdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading4Code }
     * 
     * 
     * @return
     *     The value of the cardRdData property.
     */
    public List<CardDataReading4Code> getCardRdData() {
        if (cardRdData == null) {
            cardRdData = new ArrayList<>();
        }
        return this.cardRdData;
    }

    /**
     * Gets the value of the cardWrtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardWrtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardWrtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading4Code }
     * 
     * 
     * @return
     *     The value of the cardWrtData property.
     */
    public List<CardDataReading4Code> getCardWrtData() {
        if (cardWrtData == null) {
            cardWrtData = new ArrayList<>();
        }
        return this.cardWrtData;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authntcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapability3Code }
     * 
     * 
     * @return
     *     The value of the authntcn property.
     */
    public List<CardholderVerificationCapability3Code> getAuthntcn() {
        if (authntcn == null) {
            authntcn = new ArrayList<>();
        }
        return this.authntcn;
    }

    /**
     * Gets the value of the pinLngthCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPINLngthCpblties() {
        return pinLngthCpblties;
    }

    /**
     * Sets the value of the pinLngthCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPINLngthCpblties(BigDecimal value) {
        this.pinLngthCpblties = value;
    }

    /**
     * Gets the value of the apprvlCdLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprvlCdLngth() {
        return apprvlCdLngth;
    }

    /**
     * Sets the value of the apprvlCdLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprvlCdLngth(BigDecimal value) {
        this.apprvlCdLngth = value;
    }

    /**
     * Gets the value of the mxScrptLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMxScrptLngth() {
        return mxScrptLngth;
    }

    /**
     * Sets the value of the mxScrptLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMxScrptLngth(BigDecimal value) {
        this.mxScrptLngth = value;
    }

    /**
     * Gets the value of the cardCaptrCpbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardCaptrCpbl() {
        return cardCaptrCpbl;
    }

    /**
     * Sets the value of the cardCaptrCpbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardCaptrCpbl(Boolean value) {
        this.cardCaptrCpbl = value;
    }

    /**
     * Gets the value of the wdrwlMdia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wdrwlMdia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWdrwlMdia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaType1Code }
     * 
     * 
     * @return
     *     The value of the wdrwlMdia property.
     */
    public List<ATMMediaType1Code> getWdrwlMdia() {
        if (wdrwlMdia == null) {
            wdrwlMdia = new ArrayList<>();
        }
        return this.wdrwlMdia;
    }

    /**
     * Gets the value of the dpstdMdia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dpstdMdia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstdMdia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaType2Code }
     * 
     * 
     * @return
     *     The value of the dpstdMdia property.
     */
    public List<ATMMediaType2Code> getDpstdMdia() {
        if (dpstdMdia == null) {
            dpstdMdia = new ArrayList<>();
        }
        return this.dpstdMdia;
    }

    /**
     * Gets the value of the msgCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities5 }
     * 
     * 
     * @return
     *     The value of the msgCpblties property.
     */
    public List<DisplayCapabilities5> getMsgCpblties() {
        if (msgCpblties == null) {
            msgCpblties = new ArrayList<>();
        }
        return this.msgCpblties;
    }

}
