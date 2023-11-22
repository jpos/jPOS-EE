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

package org.jpos.iso20022.auth_018_001_03;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashCollateral5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashCollateral5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollId" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Max35Text" minOccurs="0"/>
 *         <element name="CshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="AsstNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DpstAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DpstTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}DepositType1Code" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}BaseOneRate" minOccurs="0"/>
 *         <element name="CollVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ActiveCurrencyAndAmount"/>
 *         <element name="Hrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashCollateral5", propOrder = {
    "collId",
    "cshAcctId",
    "asstNb",
    "dpstAmt",
    "dpstTp",
    "mtrtyDt",
    "valDt",
    "xchgRate",
    "collVal",
    "hrcut"
})
public class CashCollateral5 {

    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "CshAcctId")
    protected AccountIdentification4Choice cshAcctId;
    @XmlElement(name = "AsstNb")
    protected String asstNb;
    @XmlElement(name = "DpstAmt")
    protected ActiveCurrencyAndAmount dpstAmt;
    @XmlElement(name = "DpstTp")
    @XmlSchemaType(name = "string")
    protected DepositType1Code dpstTp;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CollVal", required = true)
    protected ActiveCurrencyAndAmount collVal;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollId(String value) {
        this.collId = value;
    }

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setCshAcctId(AccountIdentification4Choice value) {
        this.cshAcctId = value;
    }

    /**
     * Gets the value of the asstNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstNb() {
        return asstNb;
    }

    /**
     * Sets the value of the asstNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsstNb(String value) {
        this.asstNb = value;
    }

    /**
     * Gets the value of the dpstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDpstAmt() {
        return dpstAmt;
    }

    /**
     * Sets the value of the dpstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDpstAmt(ActiveCurrencyAndAmount value) {
        this.dpstAmt = value;
    }

    /**
     * Gets the value of the dpstTp property.
     * 
     * @return
     *     possible object is
     *     {@link DepositType1Code }
     *     
     */
    public DepositType1Code getDpstTp() {
        return dpstTp;
    }

    /**
     * Sets the value of the dpstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositType1Code }
     *     
     */
    public void setDpstTp(DepositType1Code value) {
        this.dpstTp = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcut(BigDecimal value) {
        this.hrcut = value;
    }

}
