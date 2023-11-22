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

package org.jpos.iso20022.setr_009_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tax32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Tax32">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}TaxType3Choice"/>
 *         <element name="InftvAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InftvRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}CountryCode" minOccurs="0"/>
 *         <element name="XmptnInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}YesNoIndicator"/>
 *         <element name="XmptnRsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ExemptionReason1Choice" minOccurs="0"/>
 *         <element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PartyIdentification113" minOccurs="0"/>
 *         <element name="TaxClctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}TaxCalculationInformation10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax32", propOrder = {
    "tp",
    "inftvAmt",
    "inftvRate",
    "ctry",
    "xmptnInd",
    "xmptnRsn",
    "rcptId",
    "taxClctnDtls"
})
public class Tax32 {

    @XmlElement(name = "Tp", required = true)
    protected TaxType3Choice tp;
    @XmlElement(name = "InftvAmt")
    protected ActiveCurrencyAndAmount inftvAmt;
    @XmlElement(name = "InftvRate")
    protected BigDecimal inftvRate;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "XmptnInd")
    protected boolean xmptnInd;
    @XmlElement(name = "XmptnRsn")
    protected ExemptionReason1Choice xmptnRsn;
    @XmlElement(name = "RcptId")
    protected PartyIdentification113 rcptId;
    @XmlElement(name = "TaxClctnDtls")
    protected TaxCalculationInformation10 taxClctnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType3Choice }
     *     
     */
    public TaxType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType3Choice }
     *     
     */
    public void setTp(TaxType3Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the inftvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInftvAmt() {
        return inftvAmt;
    }

    /**
     * Sets the value of the inftvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setInftvAmt(ActiveCurrencyAndAmount value) {
        this.inftvAmt = value;
    }

    /**
     * Gets the value of the inftvRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInftvRate() {
        return inftvRate;
    }

    /**
     * Sets the value of the inftvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInftvRate(BigDecimal value) {
        this.inftvRate = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the xmptnInd property.
     * 
     */
    public boolean isXmptnInd() {
        return xmptnInd;
    }

    /**
     * Sets the value of the xmptnInd property.
     * 
     */
    public void setXmptnInd(boolean value) {
        this.xmptnInd = value;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionReason1Choice }
     *     
     */
    public ExemptionReason1Choice getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionReason1Choice }
     *     
     */
    public void setXmptnRsn(ExemptionReason1Choice value) {
        this.xmptnRsn = value;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setRcptId(PartyIdentification113 value) {
        this.rcptId = value;
    }

    /**
     * Gets the value of the taxClctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationInformation10 }
     *     
     */
    public TaxCalculationInformation10 getTaxClctnDtls() {
        return taxClctnDtls;
    }

    /**
     * Sets the value of the taxClctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationInformation10 }
     *     
     */
    public void setTaxClctnDtls(TaxCalculationInformation10 value) {
        this.taxClctnDtls = value;
    }

}
