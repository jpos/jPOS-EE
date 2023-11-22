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

package org.jpos.iso20022.casp_010_001_05;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrder1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerOrder1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CstmrOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text"/>
 *         <element name="SaleRefId" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text"/>
 *         <element name="OpnOrdrStat" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ISODateTime"/>
 *         <element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ISODateTime" minOccurs="0"/>
 *         <element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}AmountUnit1Code" minOccurs="0"/>
 *         <element name="FrcstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ImpliedCurrencyAndAmount"/>
 *         <element name="CurAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="AccsdBy" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max1025Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrder1", propOrder = {
    "cstmrOrdrId",
    "saleRefId",
    "opnOrdrStat",
    "startDt",
    "endDt",
    "unit",
    "frcstdAmt",
    "curAmt",
    "ccy",
    "accsdBy",
    "addtlInf"
})
public class CustomerOrder1 {

    @XmlElement(name = "CstmrOrdrId", required = true)
    protected String cstmrOrdrId;
    @XmlElement(name = "SaleRefId", required = true)
    protected String saleRefId;
    @XmlElement(name = "OpnOrdrStat")
    protected Boolean opnOrdrStat;
    @XmlElement(name = "StartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "Unit")
    @XmlSchemaType(name = "string")
    protected AmountUnit1Code unit;
    @XmlElement(name = "FrcstdAmt", required = true)
    protected BigDecimal frcstdAmt;
    @XmlElement(name = "CurAmt")
    protected BigDecimal curAmt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AccsdBy")
    protected String accsdBy;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the cstmrOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrOrdrId() {
        return cstmrOrdrId;
    }

    /**
     * Sets the value of the cstmrOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrOrdrId(String value) {
        this.cstmrOrdrId = value;
    }

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefId(String value) {
        this.saleRefId = value;
    }

    /**
     * Gets the value of the opnOrdrStat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnOrdrStat() {
        return opnOrdrStat;
    }

    /**
     * Sets the value of the opnOrdrStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpnOrdrStat(Boolean value) {
        this.opnOrdrStat = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountUnit1Code }
     *     
     */
    public AmountUnit1Code getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountUnit1Code }
     *     
     */
    public void setUnit(AmountUnit1Code value) {
        this.unit = value;
    }

    /**
     * Gets the value of the frcstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrcstdAmt() {
        return frcstdAmt;
    }

    /**
     * Sets the value of the frcstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrcstdAmt(BigDecimal value) {
        this.frcstdAmt = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurAmt(BigDecimal value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the accsdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccsdBy() {
        return accsdBy;
    }

    /**
     * Sets the value of the accsdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccsdBy(String value) {
        this.accsdBy = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
