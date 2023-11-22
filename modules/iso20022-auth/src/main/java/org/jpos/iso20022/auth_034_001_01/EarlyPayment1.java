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

package org.jpos.iso20022.auth_034_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarlyPayment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EarlyPayment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EarlyPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ISODate"/>
 *         <element name="DscntPct" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}PercentageRate"/>
 *         <element name="DscntAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount"/>
 *         <element name="EarlyPmtTaxSpcfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}EarlyPaymentsVAT1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EarlyPmtTaxTtl" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="DuePyblAmtWthEarlyPmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayment1", propOrder = {
    "earlyPmtDt",
    "dscntPct",
    "dscntAmt",
    "earlyPmtTaxSpcfctn",
    "earlyPmtTaxTtl",
    "duePyblAmtWthEarlyPmt"
})
public class EarlyPayment1 {

    @XmlElement(name = "EarlyPmtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earlyPmtDt;
    @XmlElement(name = "DscntPct", required = true)
    protected BigDecimal dscntPct;
    @XmlElement(name = "DscntAmt", required = true)
    protected CurrencyAndAmount dscntAmt;
    @XmlElement(name = "EarlyPmtTaxSpcfctn")
    protected List<EarlyPaymentsVAT1> earlyPmtTaxSpcfctn;
    @XmlElement(name = "EarlyPmtTaxTtl")
    protected CurrencyAndAmount earlyPmtTaxTtl;
    @XmlElement(name = "DuePyblAmtWthEarlyPmt")
    protected CurrencyAndAmount duePyblAmtWthEarlyPmt;

    /**
     * Gets the value of the earlyPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarlyPmtDt() {
        return earlyPmtDt;
    }

    /**
     * Sets the value of the earlyPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarlyPmtDt(XMLGregorianCalendar value) {
        this.earlyPmtDt = value;
    }

    /**
     * Gets the value of the dscntPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntPct() {
        return dscntPct;
    }

    /**
     * Sets the value of the dscntPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDscntPct(BigDecimal value) {
        this.dscntPct = value;
    }

    /**
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDscntAmt(CurrencyAndAmount value) {
        this.dscntAmt = value;
    }

    /**
     * Gets the value of the earlyPmtTaxSpcfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the earlyPmtTaxSpcfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyPmtTaxSpcfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyPaymentsVAT1 }
     * 
     * 
     * @return
     *     The value of the earlyPmtTaxSpcfctn property.
     */
    public List<EarlyPaymentsVAT1> getEarlyPmtTaxSpcfctn() {
        if (earlyPmtTaxSpcfctn == null) {
            earlyPmtTaxSpcfctn = new ArrayList<>();
        }
        return this.earlyPmtTaxSpcfctn;
    }

    /**
     * Gets the value of the earlyPmtTaxTtl property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getEarlyPmtTaxTtl() {
        return earlyPmtTaxTtl;
    }

    /**
     * Sets the value of the earlyPmtTaxTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setEarlyPmtTaxTtl(CurrencyAndAmount value) {
        this.earlyPmtTaxTtl = value;
    }

    /**
     * Gets the value of the duePyblAmtWthEarlyPmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDuePyblAmtWthEarlyPmt() {
        return duePyblAmtWthEarlyPmt;
    }

    /**
     * Sets the value of the duePyblAmtWthEarlyPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDuePyblAmtWthEarlyPmt(CurrencyAndAmount value) {
        this.duePyblAmtWthEarlyPmt = value;
    }

}
