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

package org.jpos.iso20022.cain_018_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateDetail1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExchangeRateDetail1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EndPt" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Endpoint1Code" minOccurs="0"/>
 *         <element name="OthrEndPt" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CntrCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}ISO3NumericCurrencyCode" minOccurs="0"/>
 *         <element name="BaseCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}ISO3NumericCurrencyCode" minOccurs="0"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}BaseOne25Rate" minOccurs="0"/>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}ExchangeRateType2Code" minOccurs="0"/>
 *         <element name="OthrRateTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AgrmtTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}ExchangeRateAgreementType1Code" minOccurs="0"/>
 *         <element name="OthrAgrmtTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateDetail1", propOrder = {
    "endPt",
    "othrEndPt",
    "cntrCcyCd",
    "baseCcyCd",
    "rate",
    "rateTp",
    "othrRateTp",
    "agrmtTp",
    "othrAgrmtTp"
})
public class ExchangeRateDetail1 {

    @XmlElement(name = "EndPt")
    @XmlSchemaType(name = "string")
    protected Endpoint1Code endPt;
    @XmlElement(name = "OthrEndPt")
    protected String othrEndPt;
    @XmlElement(name = "CntrCcyCd")
    protected String cntrCcyCd;
    @XmlElement(name = "BaseCcyCd")
    protected String baseCcyCd;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RateTp")
    @XmlSchemaType(name = "string")
    protected ExchangeRateType2Code rateTp;
    @XmlElement(name = "OthrRateTp")
    protected String othrRateTp;
    @XmlElement(name = "AgrmtTp")
    @XmlSchemaType(name = "string")
    protected ExchangeRateAgreementType1Code agrmtTp;
    @XmlElement(name = "OthrAgrmtTp")
    protected String othrAgrmtTp;

    /**
     * Gets the value of the endPt property.
     * 
     * @return
     *     possible object is
     *     {@link Endpoint1Code }
     *     
     */
    public Endpoint1Code getEndPt() {
        return endPt;
    }

    /**
     * Sets the value of the endPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endpoint1Code }
     *     
     */
    public void setEndPt(Endpoint1Code value) {
        this.endPt = value;
    }

    /**
     * Gets the value of the othrEndPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEndPt() {
        return othrEndPt;
    }

    /**
     * Sets the value of the othrEndPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrEndPt(String value) {
        this.othrEndPt = value;
    }

    /**
     * Gets the value of the cntrCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrCcyCd() {
        return cntrCcyCd;
    }

    /**
     * Sets the value of the cntrCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrCcyCd(String value) {
        this.cntrCcyCd = value;
    }

    /**
     * Gets the value of the baseCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcyCd() {
        return baseCcyCd;
    }

    /**
     * Sets the value of the baseCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCcyCd(String value) {
        this.baseCcyCd = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType2Code }
     *     
     */
    public ExchangeRateType2Code getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType2Code }
     *     
     */
    public void setRateTp(ExchangeRateType2Code value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the othrRateTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRateTp() {
        return othrRateTp;
    }

    /**
     * Sets the value of the othrRateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRateTp(String value) {
        this.othrRateTp = value;
    }

    /**
     * Gets the value of the agrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateAgreementType1Code }
     *     
     */
    public ExchangeRateAgreementType1Code getAgrmtTp() {
        return agrmtTp;
    }

    /**
     * Sets the value of the agrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateAgreementType1Code }
     *     
     */
    public void setAgrmtTp(ExchangeRateAgreementType1Code value) {
        this.agrmtTp = value;
    }

    /**
     * Gets the value of the othrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAgrmtTp() {
        return othrAgrmtTp;
    }

    /**
     * Sets the value of the othrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAgrmtTp(String value) {
        this.othrAgrmtTp = value;
    }

}
