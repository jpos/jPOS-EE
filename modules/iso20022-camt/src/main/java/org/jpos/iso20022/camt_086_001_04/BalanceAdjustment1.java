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

package org.jpos.iso20022.camt_086_001_04;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceAdjustment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BalanceAdjustment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BalanceAdjustmentType1Code"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max105Text"/>
 *         <element name="BalAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="AvrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="ErrDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ISODate" minOccurs="0"/>
 *         <element name="PstngDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ISODate"/>
 *         <element name="Days" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="EarngsAdjstmntAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAdjustment1", propOrder = {
    "tp",
    "desc",
    "balAmt",
    "avrgAmt",
    "errDt",
    "pstngDt",
    "days",
    "earngsAdjstmntAmt"
})
public class BalanceAdjustment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceAdjustmentType1Code tp;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "BalAmt", required = true)
    protected AmountAndDirection34 balAmt;
    @XmlElement(name = "AvrgAmt")
    protected AmountAndDirection34 avrgAmt;
    @XmlElement(name = "ErrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar errDt;
    @XmlElement(name = "PstngDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pstngDt;
    @XmlElement(name = "Days")
    protected BigDecimal days;
    @XmlElement(name = "EarngsAdjstmntAmt")
    protected AmountAndDirection34 earngsAdjstmntAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAdjustmentType1Code }
     *     
     */
    public BalanceAdjustmentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAdjustmentType1Code }
     *     
     */
    public void setTp(BalanceAdjustmentType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the balAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getBalAmt() {
        return balAmt;
    }

    /**
     * Sets the value of the balAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setBalAmt(AmountAndDirection34 value) {
        this.balAmt = value;
    }

    /**
     * Gets the value of the avrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getAvrgAmt() {
        return avrgAmt;
    }

    /**
     * Sets the value of the avrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setAvrgAmt(AmountAndDirection34 value) {
        this.avrgAmt = value;
    }

    /**
     * Gets the value of the errDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErrDt() {
        return errDt;
    }

    /**
     * Sets the value of the errDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErrDt(XMLGregorianCalendar value) {
        this.errDt = value;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPstngDt(XMLGregorianCalendar value) {
        this.pstngDt = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDays(BigDecimal value) {
        this.days = value;
    }

    /**
     * Gets the value of the earngsAdjstmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getEarngsAdjstmntAmt() {
        return earngsAdjstmntAmt;
    }

    /**
     * Sets the value of the earngsAdjstmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setEarngsAdjstmntAmt(AmountAndDirection34 value) {
        this.earngsAdjstmntAmt = value;
    }

}
