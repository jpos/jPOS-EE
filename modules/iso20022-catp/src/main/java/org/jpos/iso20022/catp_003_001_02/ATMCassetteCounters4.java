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

package org.jpos.iso20022.catp_003_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCassetteCounters4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCassetteCounters4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ATMCounterType1Code"/>
 *         <element name="AddedNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="RmvdNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="DspnsdNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="DpstdNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="RcycldNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="RtrctdNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="RjctdNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="PresntdNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassetteCounters4", propOrder = {
    "tp",
    "addedNb",
    "rmvdNb",
    "dspnsdNb",
    "dpstdNb",
    "rcycldNb",
    "rtrctdNb",
    "rjctdNb",
    "presntdNb"
})
public class ATMCassetteCounters4 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCounterType1Code tp;
    @XmlElement(name = "AddedNb")
    protected BigDecimal addedNb;
    @XmlElement(name = "RmvdNb")
    protected BigDecimal rmvdNb;
    @XmlElement(name = "DspnsdNb")
    protected BigDecimal dspnsdNb;
    @XmlElement(name = "DpstdNb")
    protected BigDecimal dpstdNb;
    @XmlElement(name = "RcycldNb")
    protected BigDecimal rcycldNb;
    @XmlElement(name = "RtrctdNb")
    protected BigDecimal rtrctdNb;
    @XmlElement(name = "RjctdNb")
    protected BigDecimal rjctdNb;
    @XmlElement(name = "PresntdNb")
    protected BigDecimal presntdNb;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCounterType1Code }
     *     
     */
    public ATMCounterType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCounterType1Code }
     *     
     */
    public void setTp(ATMCounterType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the addedNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddedNb() {
        return addedNb;
    }

    /**
     * Sets the value of the addedNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddedNb(BigDecimal value) {
        this.addedNb = value;
    }

    /**
     * Gets the value of the rmvdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmvdNb() {
        return rmvdNb;
    }

    /**
     * Sets the value of the rmvdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRmvdNb(BigDecimal value) {
        this.rmvdNb = value;
    }

    /**
     * Gets the value of the dspnsdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspnsdNb() {
        return dspnsdNb;
    }

    /**
     * Sets the value of the dspnsdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDspnsdNb(BigDecimal value) {
        this.dspnsdNb = value;
    }

    /**
     * Gets the value of the dpstdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDpstdNb() {
        return dpstdNb;
    }

    /**
     * Sets the value of the dpstdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDpstdNb(BigDecimal value) {
        this.dpstdNb = value;
    }

    /**
     * Gets the value of the rcycldNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcycldNb() {
        return rcycldNb;
    }

    /**
     * Sets the value of the rcycldNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRcycldNb(BigDecimal value) {
        this.rcycldNb = value;
    }

    /**
     * Gets the value of the rtrctdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtrctdNb() {
        return rtrctdNb;
    }

    /**
     * Sets the value of the rtrctdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtrctdNb(BigDecimal value) {
        this.rtrctdNb = value;
    }

    /**
     * Gets the value of the rjctdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRjctdNb() {
        return rjctdNb;
    }

    /**
     * Sets the value of the rjctdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRjctdNb(BigDecimal value) {
        this.rjctdNb = value;
    }

    /**
     * Gets the value of the presntdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPresntdNb() {
        return presntdNb;
    }

    /**
     * Sets the value of the presntdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPresntdNb(BigDecimal value) {
        this.presntdNb = value;
    }

}
