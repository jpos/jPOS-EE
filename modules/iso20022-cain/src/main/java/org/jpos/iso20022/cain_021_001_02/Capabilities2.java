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

package org.jpos.iso20022.cain_021_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capabilities2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Capabilities2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardRdngCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}CardReadingCapabilities1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CardWrtgCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}CardWritingCapabilities1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PINLngthCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Number" minOccurs="0"/>
 *         <element name="PINNtrySctyChrtc" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}PINEntrySecurityCharacteristic1Code" minOccurs="0"/>
 *         <element name="OthrPINNtrySctyChrtc" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ApprvlCdLngth" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Number" minOccurs="0"/>
 *         <element name="MxScrptLngth" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Number" minOccurs="0"/>
 *         <element name="CardCaptrCpbl" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="OnLineCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}OnLineCapability2Code" minOccurs="0"/>
 *         <element name="MsgCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}DisplayCapabilities6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CrdhldrVrfctnCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}CardholderVerificationCapabilities1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TempScrCardDataStorg" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities2", propOrder = {
    "cardRdngCpblty",
    "cardWrtgCpblty",
    "pinLngthCpblty",
    "pinNtrySctyChrtc",
    "othrPINNtrySctyChrtc",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "onLineCpblty",
    "msgCpblty",
    "crdhldrVrfctnCpblty",
    "tempScrCardDataStorg"
})
public class Capabilities2 {

    @XmlElement(name = "CardRdngCpblty")
    protected List<CardReadingCapabilities1> cardRdngCpblty;
    @XmlElement(name = "CardWrtgCpblty")
    protected List<CardWritingCapabilities1> cardWrtgCpblty;
    @XmlElement(name = "PINLngthCpblty")
    protected BigDecimal pinLngthCpblty;
    @XmlElement(name = "PINNtrySctyChrtc")
    @XmlSchemaType(name = "string")
    protected PINEntrySecurityCharacteristic1Code pinNtrySctyChrtc;
    @XmlElement(name = "OthrPINNtrySctyChrtc")
    protected String othrPINNtrySctyChrtc;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "OnLineCpblty")
    @XmlSchemaType(name = "string")
    protected OnLineCapability2Code onLineCpblty;
    @XmlElement(name = "MsgCpblty")
    protected List<DisplayCapabilities6> msgCpblty;
    @XmlElement(name = "CrdhldrVrfctnCpblty")
    protected List<CardholderVerificationCapabilities1> crdhldrVrfctnCpblty;
    @XmlElement(name = "TempScrCardDataStorg")
    protected Boolean tempScrCardDataStorg;

    /**
     * Gets the value of the cardRdngCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardRdngCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardReadingCapabilities1 }
     * 
     * 
     * @return
     *     The value of the cardRdngCpblty property.
     */
    public List<CardReadingCapabilities1> getCardRdngCpblty() {
        if (cardRdngCpblty == null) {
            cardRdngCpblty = new ArrayList<>();
        }
        return this.cardRdngCpblty;
    }

    /**
     * Gets the value of the cardWrtgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardWrtgCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardWrtgCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardWritingCapabilities1 }
     * 
     * 
     * @return
     *     The value of the cardWrtgCpblty property.
     */
    public List<CardWritingCapabilities1> getCardWrtgCpblty() {
        if (cardWrtgCpblty == null) {
            cardWrtgCpblty = new ArrayList<>();
        }
        return this.cardWrtgCpblty;
    }

    /**
     * Gets the value of the pinLngthCpblty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPINLngthCpblty() {
        return pinLngthCpblty;
    }

    /**
     * Sets the value of the pinLngthCpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPINLngthCpblty(BigDecimal value) {
        this.pinLngthCpblty = value;
    }

    /**
     * Gets the value of the pinNtrySctyChrtc property.
     * 
     * @return
     *     possible object is
     *     {@link PINEntrySecurityCharacteristic1Code }
     *     
     */
    public PINEntrySecurityCharacteristic1Code getPINNtrySctyChrtc() {
        return pinNtrySctyChrtc;
    }

    /**
     * Sets the value of the pinNtrySctyChrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINEntrySecurityCharacteristic1Code }
     *     
     */
    public void setPINNtrySctyChrtc(PINEntrySecurityCharacteristic1Code value) {
        this.pinNtrySctyChrtc = value;
    }

    /**
     * Gets the value of the othrPINNtrySctyChrtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPINNtrySctyChrtc() {
        return othrPINNtrySctyChrtc;
    }

    /**
     * Sets the value of the othrPINNtrySctyChrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPINNtrySctyChrtc(String value) {
        this.othrPINNtrySctyChrtc = value;
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
     * Gets the value of the onLineCpblty property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public OnLineCapability2Code getOnLineCpblty() {
        return onLineCpblty;
    }

    /**
     * Sets the value of the onLineCpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public void setOnLineCpblty(OnLineCapability2Code value) {
        this.onLineCpblty = value;
    }

    /**
     * Gets the value of the msgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities6 }
     * 
     * 
     * @return
     *     The value of the msgCpblty property.
     */
    public List<DisplayCapabilities6> getMsgCpblty() {
        if (msgCpblty == null) {
            msgCpblty = new ArrayList<>();
        }
        return this.msgCpblty;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapabilities1 }
     * 
     * 
     * @return
     *     The value of the crdhldrVrfctnCpblty property.
     */
    public List<CardholderVerificationCapabilities1> getCrdhldrVrfctnCpblty() {
        if (crdhldrVrfctnCpblty == null) {
            crdhldrVrfctnCpblty = new ArrayList<>();
        }
        return this.crdhldrVrfctnCpblty;
    }

    /**
     * Gets the value of the tempScrCardDataStorg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataStorg() {
        return tempScrCardDataStorg;
    }

    /**
     * Sets the value of the tempScrCardDataStorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempScrCardDataStorg(Boolean value) {
        this.tempScrCardDataStorg = value;
    }

}
