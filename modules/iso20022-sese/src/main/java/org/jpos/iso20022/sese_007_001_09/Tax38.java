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

package org.jpos.iso20022.sese_007_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tax38 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Tax38">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}TaxType1Choice"/>
 *         <element name="Bsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}TaxBasis1Choice" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ActiveCurrencyAndAmount"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}CountryCode" minOccurs="0"/>
 *         <element name="XmptnInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}YesNoIndicator"/>
 *         <element name="XmptnRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ExemptionReason1Choice" minOccurs="0"/>
 *         <element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}PartyIdentification139" minOccurs="0"/>
 *         <element name="TaxClctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}TaxCalculationInformation11" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax38", propOrder = {
    "tp",
    "bsis",
    "amt",
    "ctry",
    "xmptnInd",
    "xmptnRsn",
    "rcptId",
    "taxClctnDtls"
})
public class Tax38 {

    @XmlElement(name = "Tp", required = true)
    protected TaxType1Choice tp;
    @XmlElement(name = "Bsis")
    protected TaxBasis1Choice bsis;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "XmptnInd")
    protected boolean xmptnInd;
    @XmlElement(name = "XmptnRsn")
    protected ExemptionReason1Choice xmptnRsn;
    @XmlElement(name = "RcptId")
    protected PartyIdentification139 rcptId;
    @XmlElement(name = "TaxClctnDtls")
    protected TaxCalculationInformation11 taxClctnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType1Choice }
     *     
     */
    public TaxType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType1Choice }
     *     
     */
    public void setTp(TaxType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxBasis1Choice }
     *     
     */
    public TaxBasis1Choice getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBasis1Choice }
     *     
     */
    public void setBsis(TaxBasis1Choice value) {
        this.bsis = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
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
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setRcptId(PartyIdentification139 value) {
        this.rcptId = value;
    }

    /**
     * Gets the value of the taxClctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationInformation11 }
     *     
     */
    public TaxCalculationInformation11 getTaxClctnDtls() {
        return taxClctnDtls;
    }

    /**
     * Sets the value of the taxClctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationInformation11 }
     *     
     */
    public void setTaxClctnDtls(TaxCalculationInformation11 value) {
        this.taxClctnDtls = value;
    }

}
