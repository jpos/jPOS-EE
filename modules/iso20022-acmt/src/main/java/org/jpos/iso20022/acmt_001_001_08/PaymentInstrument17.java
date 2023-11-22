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

package org.jpos.iso20022.acmt_001_001_08;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstrument17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ActiveCurrencyCode"/>
 *         <element name="DvddPctg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PercentageBoundedRate" minOccurs="0"/>
 *         <element name="SbcptPmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PaymentInstrument24Choice" minOccurs="0"/>
 *         <element name="RedPmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PaymentInstrument19Choice" minOccurs="0"/>
 *         <element name="DvddPmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PaymentInstrument19Choice" minOccurs="0"/>
 *         <element name="SvgsPlanPmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PaymentInstrument24Choice" minOccurs="0"/>
 *         <element name="IntrstPmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}PaymentInstrument19Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument17", propOrder = {
    "sttlmCcy",
    "dvddPctg",
    "sbcptPmtInstrm",
    "redPmtInstrm",
    "dvddPmtInstrm",
    "svgsPlanPmtInstrm",
    "intrstPmtInstrm"
})
public class PaymentInstrument17 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "DvddPctg")
    protected BigDecimal dvddPctg;
    @XmlElement(name = "SbcptPmtInstrm")
    protected PaymentInstrument24Choice sbcptPmtInstrm;
    @XmlElement(name = "RedPmtInstrm")
    protected PaymentInstrument19Choice redPmtInstrm;
    @XmlElement(name = "DvddPmtInstrm")
    protected PaymentInstrument19Choice dvddPmtInstrm;
    @XmlElement(name = "SvgsPlanPmtInstrm")
    protected PaymentInstrument24Choice svgsPlanPmtInstrm;
    @XmlElement(name = "IntrstPmtInstrm")
    protected PaymentInstrument19Choice intrstPmtInstrm;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the dvddPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDvddPctg() {
        return dvddPctg;
    }

    /**
     * Sets the value of the dvddPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDvddPctg(BigDecimal value) {
        this.dvddPctg = value;
    }

    /**
     * Gets the value of the sbcptPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument24Choice }
     *     
     */
    public PaymentInstrument24Choice getSbcptPmtInstrm() {
        return sbcptPmtInstrm;
    }

    /**
     * Sets the value of the sbcptPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument24Choice }
     *     
     */
    public void setSbcptPmtInstrm(PaymentInstrument24Choice value) {
        this.sbcptPmtInstrm = value;
    }

    /**
     * Gets the value of the redPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument19Choice getRedPmtInstrm() {
        return redPmtInstrm;
    }

    /**
     * Sets the value of the redPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public void setRedPmtInstrm(PaymentInstrument19Choice value) {
        this.redPmtInstrm = value;
    }

    /**
     * Gets the value of the dvddPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument19Choice getDvddPmtInstrm() {
        return dvddPmtInstrm;
    }

    /**
     * Sets the value of the dvddPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public void setDvddPmtInstrm(PaymentInstrument19Choice value) {
        this.dvddPmtInstrm = value;
    }

    /**
     * Gets the value of the svgsPlanPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument24Choice }
     *     
     */
    public PaymentInstrument24Choice getSvgsPlanPmtInstrm() {
        return svgsPlanPmtInstrm;
    }

    /**
     * Sets the value of the svgsPlanPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument24Choice }
     *     
     */
    public void setSvgsPlanPmtInstrm(PaymentInstrument24Choice value) {
        this.svgsPlanPmtInstrm = value;
    }

    /**
     * Gets the value of the intrstPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public PaymentInstrument19Choice getIntrstPmtInstrm() {
        return intrstPmtInstrm;
    }

    /**
     * Sets the value of the intrstPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument19Choice }
     *     
     */
    public void setIntrstPmtInstrm(PaymentInstrument19Choice value) {
        this.intrstPmtInstrm = value;
    }

}
