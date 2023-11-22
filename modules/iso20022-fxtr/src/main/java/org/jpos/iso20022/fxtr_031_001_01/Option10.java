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

package org.jpos.iso20022.fxtr_031_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Option10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Option10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Data" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}DataType1Code"/>
 *         <element name="ExrcSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}DerivativeExerciseStatus1Code"/>
 *         <element name="ExrcStyle" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}OptionStyle2Code"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}OptionType1Code"/>
 *         <element name="DerivOptnId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Max35Text"/>
 *         <element name="OptnPyoutTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}OptionPayoutType1Code"/>
 *         <element name="ValtnRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}AgreedRate3"/>
 *         <element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}AgreedRate3"/>
 *         <element name="VoltlyMrgn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}PercentageRate"/>
 *         <element name="RskAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="XpryDtAndTm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ISODateTime"/>
 *         <element name="XpryLctn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Max4AlphaNumericText"/>
 *         <element name="SttlmTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}SettlementDateCode"/>
 *         <element name="OptnAmts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}AmountsAndValueDate4"/>
 *         <element name="Prm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}PremiumAmount3"/>
 *         <element name="SttlmAmtTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}SettlementType1Code"/>
 *         <element name="AddtlOptnInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Max140Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option10", propOrder = {
    "data",
    "exrcSts",
    "exrcStyle",
    "optnTp",
    "derivOptnId",
    "optnPyoutTp",
    "valtnRate",
    "strkPric",
    "voltlyMrgn",
    "rskAmt",
    "xpryDtAndTm",
    "xpryLctn",
    "sttlmTp",
    "optnAmts",
    "prm",
    "sttlmAmtTp",
    "addtlOptnInf"
})
public class Option10 {

    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "string")
    protected DataType1Code data;
    @XmlElement(name = "ExrcSts", required = true)
    @XmlSchemaType(name = "string")
    protected DerivativeExerciseStatus1Code exrcSts;
    @XmlElement(name = "ExrcStyle", required = true)
    @XmlSchemaType(name = "string")
    protected OptionStyle2Code exrcStyle;
    @XmlElement(name = "OptnTp", required = true)
    @XmlSchemaType(name = "string")
    protected OptionType1Code optnTp;
    @XmlElement(name = "DerivOptnId", required = true)
    protected String derivOptnId;
    @XmlElement(name = "OptnPyoutTp", required = true)
    @XmlSchemaType(name = "string")
    protected OptionPayoutType1Code optnPyoutTp;
    @XmlElement(name = "ValtnRate", required = true)
    protected AgreedRate3 valtnRate;
    @XmlElement(name = "StrkPric", required = true)
    protected AgreedRate3 strkPric;
    @XmlElement(name = "VoltlyMrgn", required = true)
    protected BigDecimal voltlyMrgn;
    @XmlElement(name = "RskAmt", required = true)
    protected ActiveCurrencyAndAmount rskAmt;
    @XmlElement(name = "XpryDtAndTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtAndTm;
    @XmlElement(name = "XpryLctn", required = true)
    protected String xpryLctn;
    @XmlElement(name = "SttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDateCode sttlmTp;
    @XmlElement(name = "OptnAmts", required = true)
    protected AmountsAndValueDate4 optnAmts;
    @XmlElement(name = "Prm", required = true)
    protected PremiumAmount3 prm;
    @XmlElement(name = "SttlmAmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementType1Code sttlmAmtTp;
    @XmlElement(name = "AddtlOptnInf", required = true)
    protected String addtlOptnInf;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DataType1Code }
     *     
     */
    public DataType1Code getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType1Code }
     *     
     */
    public void setData(DataType1Code value) {
        this.data = value;
    }

    /**
     * Gets the value of the exrcSts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeExerciseStatus1Code }
     *     
     */
    public DerivativeExerciseStatus1Code getExrcSts() {
        return exrcSts;
    }

    /**
     * Sets the value of the exrcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeExerciseStatus1Code }
     *     
     */
    public void setExrcSts(DerivativeExerciseStatus1Code value) {
        this.exrcSts = value;
    }

    /**
     * Gets the value of the exrcStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle2Code }
     *     
     */
    public OptionStyle2Code getExrcStyle() {
        return exrcStyle;
    }

    /**
     * Sets the value of the exrcStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle2Code }
     *     
     */
    public void setExrcStyle(OptionStyle2Code value) {
        this.exrcStyle = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType1Code }
     *     
     */
    public OptionType1Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType1Code }
     *     
     */
    public void setOptnTp(OptionType1Code value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the derivOptnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivOptnId() {
        return derivOptnId;
    }

    /**
     * Sets the value of the derivOptnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivOptnId(String value) {
        this.derivOptnId = value;
    }

    /**
     * Gets the value of the optnPyoutTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionPayoutType1Code }
     *     
     */
    public OptionPayoutType1Code getOptnPyoutTp() {
        return optnPyoutTp;
    }

    /**
     * Sets the value of the optnPyoutTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionPayoutType1Code }
     *     
     */
    public void setOptnPyoutTp(OptionPayoutType1Code value) {
        this.optnPyoutTp = value;
    }

    /**
     * Gets the value of the valtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getValtnRate() {
        return valtnRate;
    }

    /**
     * Sets the value of the valtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public void setValtnRate(AgreedRate3 value) {
        this.valtnRate = value;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public void setStrkPric(AgreedRate3 value) {
        this.strkPric = value;
    }

    /**
     * Gets the value of the voltlyMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltlyMrgn() {
        return voltlyMrgn;
    }

    /**
     * Sets the value of the voltlyMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltlyMrgn(BigDecimal value) {
        this.voltlyMrgn = value;
    }

    /**
     * Gets the value of the rskAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRskAmt() {
        return rskAmt;
    }

    /**
     * Sets the value of the rskAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRskAmt(ActiveCurrencyAndAmount value) {
        this.rskAmt = value;
    }

    /**
     * Gets the value of the xpryDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDtAndTm() {
        return xpryDtAndTm;
    }

    /**
     * Sets the value of the xpryDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDtAndTm(XMLGregorianCalendar value) {
        this.xpryDtAndTm = value;
    }

    /**
     * Gets the value of the xpryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryLctn() {
        return xpryLctn;
    }

    /**
     * Sets the value of the xpryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpryLctn(String value) {
        this.xpryLctn = value;
    }

    /**
     * Gets the value of the sttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateCode }
     *     
     */
    public SettlementDateCode getSttlmTp() {
        return sttlmTp;
    }

    /**
     * Sets the value of the sttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateCode }
     *     
     */
    public void setSttlmTp(SettlementDateCode value) {
        this.sttlmTp = value;
    }

    /**
     * Gets the value of the optnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate4 }
     *     
     */
    public AmountsAndValueDate4 getOptnAmts() {
        return optnAmts;
    }

    /**
     * Sets the value of the optnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate4 }
     *     
     */
    public void setOptnAmts(AmountsAndValueDate4 value) {
        this.optnAmts = value;
    }

    /**
     * Gets the value of the prm property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumAmount3 }
     *     
     */
    public PremiumAmount3 getPrm() {
        return prm;
    }

    /**
     * Sets the value of the prm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumAmount3 }
     *     
     */
    public void setPrm(PremiumAmount3 value) {
        this.prm = value;
    }

    /**
     * Gets the value of the sttlmAmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType1Code }
     *     
     */
    public SettlementType1Code getSttlmAmtTp() {
        return sttlmAmtTp;
    }

    /**
     * Sets the value of the sttlmAmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType1Code }
     *     
     */
    public void setSttlmAmtTp(SettlementType1Code value) {
        this.sttlmAmtTp = value;
    }

    /**
     * Gets the value of the addtlOptnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlOptnInf() {
        return addtlOptnInf;
    }

    /**
     * Sets the value of the addtlOptnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlOptnInf(String value) {
        this.addtlOptnInf = value;
    }

}
