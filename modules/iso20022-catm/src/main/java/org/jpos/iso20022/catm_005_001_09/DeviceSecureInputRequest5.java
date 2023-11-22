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

package org.jpos.iso20022.catm_005_001_09;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceSecureInputRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceSecureInputRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PINReqTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PINRequestType1Code"/>
 *         <element name="PINVrfctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="MaxWtgTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Number" minOccurs="0"/>
 *         <element name="BeepKeyFlg" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CrdhldrPIN" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}OnLinePIN10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSecureInputRequest5", propOrder = {
    "pinReqTp",
    "pinVrfctnMtd",
    "maxWtgTm",
    "beepKeyFlg",
    "crdhldrPIN"
})
public class DeviceSecureInputRequest5 {

    @XmlElement(name = "PINReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected PINRequestType1Code pinReqTp;
    @XmlElement(name = "PINVrfctnMtd")
    protected String pinVrfctnMtd;
    @XmlElement(name = "MaxWtgTm")
    protected BigDecimal maxWtgTm;
    @XmlElement(name = "BeepKeyFlg")
    protected Boolean beepKeyFlg;
    @XmlElement(name = "CrdhldrPIN")
    protected OnLinePIN10 crdhldrPIN;

    /**
     * Gets the value of the pinReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link PINRequestType1Code }
     *     
     */
    public PINRequestType1Code getPINReqTp() {
        return pinReqTp;
    }

    /**
     * Sets the value of the pinReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINRequestType1Code }
     *     
     */
    public void setPINReqTp(PINRequestType1Code value) {
        this.pinReqTp = value;
    }

    /**
     * Gets the value of the pinVrfctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINVrfctnMtd() {
        return pinVrfctnMtd;
    }

    /**
     * Sets the value of the pinVrfctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINVrfctnMtd(String value) {
        this.pinVrfctnMtd = value;
    }

    /**
     * Gets the value of the maxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWtgTm() {
        return maxWtgTm;
    }

    /**
     * Sets the value of the maxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWtgTm(BigDecimal value) {
        this.maxWtgTm = value;
    }

    /**
     * Gets the value of the beepKeyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeepKeyFlg() {
        return beepKeyFlg;
    }

    /**
     * Sets the value of the beepKeyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeepKeyFlg(Boolean value) {
        this.beepKeyFlg = value;
    }

    /**
     * Gets the value of the crdhldrPIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN10 }
     *     
     */
    public OnLinePIN10 getCrdhldrPIN() {
        return crdhldrPIN;
    }

    /**
     * Sets the value of the crdhldrPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN10 }
     *     
     */
    public void setCrdhldrPIN(OnLinePIN10 value) {
        this.crdhldrPIN = value;
    }

}
