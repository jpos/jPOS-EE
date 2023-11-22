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

package org.jpos.iso20022.tsmt_054_001_01;

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
 * <p>Java class for PaymentTerms6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTerms6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DueDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}ISODate" minOccurs="0"/>
 *         <element name="PmtPrd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}PaymentPeriod1" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}Max140Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtlPmtPct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="DrctDbtMndtId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BsisAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="DscntAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="DscntPctRate" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="PnltyAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="PnltyPctRate" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTerms6", propOrder = {
    "dueDt",
    "pmtPrd",
    "desc",
    "prtlPmtPct",
    "drctDbtMndtId",
    "bsisAmt",
    "dscntAmt",
    "dscntPctRate",
    "pnltyAmt",
    "pnltyPctRate"
})
public class PaymentTerms6 {

    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "PmtPrd")
    protected PaymentPeriod1 pmtPrd;
    @XmlElement(name = "Desc")
    protected List<String> desc;
    @XmlElement(name = "PrtlPmtPct")
    protected BigDecimal prtlPmtPct;
    @XmlElement(name = "DrctDbtMndtId")
    protected List<String> drctDbtMndtId;
    @XmlElement(name = "BsisAmt")
    protected CurrencyAndAmount bsisAmt;
    @XmlElement(name = "DscntAmt")
    protected CurrencyAndAmount dscntAmt;
    @XmlElement(name = "DscntPctRate")
    protected BigDecimal dscntPctRate;
    @XmlElement(name = "PnltyAmt")
    protected CurrencyAndAmount pnltyAmt;
    @XmlElement(name = "PnltyPctRate")
    protected BigDecimal pnltyPctRate;

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the pmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPeriod1 }
     *     
     */
    public PaymentPeriod1 getPmtPrd() {
        return pmtPrd;
    }

    /**
     * Sets the value of the pmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPeriod1 }
     *     
     */
    public void setPmtPrd(PaymentPeriod1 value) {
        this.pmtPrd = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<String> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the prtlPmtPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlPmtPct() {
        return prtlPmtPct;
    }

    /**
     * Sets the value of the prtlPmtPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrtlPmtPct(BigDecimal value) {
        this.prtlPmtPct = value;
    }

    /**
     * Gets the value of the drctDbtMndtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drctDbtMndtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctDbtMndtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the drctDbtMndtId property.
     */
    public List<String> getDrctDbtMndtId() {
        if (drctDbtMndtId == null) {
            drctDbtMndtId = new ArrayList<>();
        }
        return this.drctDbtMndtId;
    }

    /**
     * Gets the value of the bsisAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getBsisAmt() {
        return bsisAmt;
    }

    /**
     * Sets the value of the bsisAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setBsisAmt(CurrencyAndAmount value) {
        this.bsisAmt = value;
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
     * Gets the value of the dscntPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntPctRate() {
        return dscntPctRate;
    }

    /**
     * Sets the value of the dscntPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDscntPctRate(BigDecimal value) {
        this.dscntPctRate = value;
    }

    /**
     * Gets the value of the pnltyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPnltyAmt() {
        return pnltyAmt;
    }

    /**
     * Sets the value of the pnltyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setPnltyAmt(CurrencyAndAmount value) {
        this.pnltyAmt = value;
    }

    /**
     * Gets the value of the pnltyPctRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPnltyPctRate() {
        return pnltyPctRate;
    }

    /**
     * Sets the value of the pnltyPctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPnltyPctRate(BigDecimal value) {
        this.pnltyPctRate = value;
    }

}
