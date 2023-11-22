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

package org.jpos.iso20022.colr_021_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealTransactionDetails6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DealTransactionDetails6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MinNtcePrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Exact3NumericText" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}ClosingDate4Choice"/>
 *         <element name="DealDtlsAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralAmount12" minOccurs="0"/>
 *         <element name="PricgRateAndIndx" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}RateOrName4Choice" minOccurs="0"/>
 *         <element name="OvrnghtFrqcyRateFxg" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}FrequencyRateFixing1Choice" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}InterestComputationMethodFormat4Choice" minOccurs="0"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}DeliveryReceiptType2Code" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}OptionType6Choice" minOccurs="0"/>
 *         <element name="TermntnOptn" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}RepoTerminationOption1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealTransactionDetails6", propOrder = {
    "minNtcePrd",
    "clsgDt",
    "dealDtlsAmt",
    "pricgRateAndIndx",
    "ovrnghtFrqcyRateFxg",
    "sprd",
    "dayCntBsis",
    "pmt",
    "optnTp",
    "termntnOptn"
})
public class DealTransactionDetails6 {

    @XmlElement(name = "MinNtcePrd")
    protected String minNtcePrd;
    @XmlElement(name = "ClsgDt", required = true)
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "DealDtlsAmt")
    protected CollateralAmount12 dealDtlsAmt;
    @XmlElement(name = "PricgRateAndIndx")
    protected RateOrName4Choice pricgRateAndIndx;
    @XmlElement(name = "OvrnghtFrqcyRateFxg")
    protected FrequencyRateFixing1Choice ovrnghtFrqcyRateFxg;
    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "Pmt")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
    @XmlElement(name = "TermntnOptn")
    @XmlSchemaType(name = "string")
    protected RepoTerminationOption1Code termntnOptn;

    /**
     * Gets the value of the minNtcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinNtcePrd() {
        return minNtcePrd;
    }

    /**
     * Sets the value of the minNtcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinNtcePrd(String value) {
        this.minNtcePrd = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public void setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the dealDtlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount12 }
     *     
     */
    public CollateralAmount12 getDealDtlsAmt() {
        return dealDtlsAmt;
    }

    /**
     * Sets the value of the dealDtlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount12 }
     *     
     */
    public void setDealDtlsAmt(CollateralAmount12 value) {
        this.dealDtlsAmt = value;
    }

    /**
     * Gets the value of the pricgRateAndIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName4Choice }
     *     
     */
    public RateOrName4Choice getPricgRateAndIndx() {
        return pricgRateAndIndx;
    }

    /**
     * Sets the value of the pricgRateAndIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName4Choice }
     *     
     */
    public void setPricgRateAndIndx(RateOrName4Choice value) {
        this.pricgRateAndIndx = value;
    }

    /**
     * Gets the value of the ovrnghtFrqcyRateFxg property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyRateFixing1Choice }
     *     
     */
    public FrequencyRateFixing1Choice getOvrnghtFrqcyRateFxg() {
        return ovrnghtFrqcyRateFxg;
    }

    /**
     * Sets the value of the ovrnghtFrqcyRateFxg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyRateFixing1Choice }
     *     
     */
    public void setOvrnghtFrqcyRateFxg(FrequencyRateFixing1Choice value) {
        this.ovrnghtFrqcyRateFxg = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSprd(BigDecimal value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public void setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public void setOptnTp(OptionType6Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public RepoTerminationOption1Code getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public void setTermntnOptn(RepoTerminationOption1Code value) {
        this.termntnOptn = value;
    }

}
