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

package org.jpos.iso20022.caaa_012_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfInteractionCapabilities9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PointOfInteractionCapabilities9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardRdngCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardDataReading8Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CrdhldrVrfctnCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardholderVerificationCapability4Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PINLngthCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}PositiveNumber" minOccurs="0"/>
 *         <element name="ApprvlCdLngth" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}PositiveNumber" minOccurs="0"/>
 *         <element name="MxScrptLngth" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}PositiveNumber" minOccurs="0"/>
 *         <element name="CardCaptrCpbl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="OnLineCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}OnLineCapability1Code" minOccurs="0"/>
 *         <element name="MsgCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}DisplayCapabilities4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionCapabilities9", propOrder = {
    "cardRdngCpblties",
    "crdhldrVrfctnCpblties",
    "pinLngthCpblties",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "onLineCpblties",
    "msgCpblties"
})
public class PointOfInteractionCapabilities9 {

    @XmlElement(name = "CardRdngCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading8Code> cardRdngCpblties;
    @XmlElement(name = "CrdhldrVrfctnCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardholderVerificationCapability4Code> crdhldrVrfctnCpblties;
    @XmlElement(name = "PINLngthCpblties")
    protected BigDecimal pinLngthCpblties;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "OnLineCpblties")
    @XmlSchemaType(name = "string")
    protected OnLineCapability1Code onLineCpblties;
    @XmlElement(name = "MsgCpblties")
    protected List<DisplayCapabilities4> msgCpblties;

    /**
     * Gets the value of the cardRdngCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardRdngCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading8Code }
     * 
     * 
     * @return
     *     The value of the cardRdngCpblties property.
     */
    public List<CardDataReading8Code> getCardRdngCpblties() {
        if (cardRdngCpblties == null) {
            cardRdngCpblties = new ArrayList<>();
        }
        return this.cardRdngCpblties;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapability4Code }
     * 
     * 
     * @return
     *     The value of the crdhldrVrfctnCpblties property.
     */
    public List<CardholderVerificationCapability4Code> getCrdhldrVrfctnCpblties() {
        if (crdhldrVrfctnCpblties == null) {
            crdhldrVrfctnCpblties = new ArrayList<>();
        }
        return this.crdhldrVrfctnCpblties;
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
     * Gets the value of the onLineCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public OnLineCapability1Code getOnLineCpblties() {
        return onLineCpblties;
    }

    /**
     * Sets the value of the onLineCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public void setOnLineCpblties(OnLineCapability1Code value) {
        this.onLineCpblties = value;
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
     * {@link DisplayCapabilities4 }
     * 
     * 
     * @return
     *     The value of the msgCpblties property.
     */
    public List<DisplayCapabilities4> getMsgCpblties() {
        if (msgCpblties == null) {
            msgCpblties = new ArrayList<>();
        }
        return this.msgCpblties;
    }

}
