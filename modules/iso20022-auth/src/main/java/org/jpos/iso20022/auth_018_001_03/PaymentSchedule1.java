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

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentSchedule1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentSchedule1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtSchdlId" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpctdDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="DueDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Max1025Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSchedule1", propOrder = {
    "pmtSchdlId",
    "amt",
    "xpctdDt",
    "dueDt",
    "addtlInf"
})
public class PaymentSchedule1 {

    @XmlElement(name = "PmtSchdlId")
    protected String pmtSchdlId;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "XpctdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdDt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the pmtSchdlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtSchdlId() {
        return pmtSchdlId;
    }

    /**
     * Sets the value of the pmtSchdlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtSchdlId(String value) {
        this.pmtSchdlId = value;
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
     * Gets the value of the xpctdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdDt() {
        return xpctdDt;
    }

    /**
     * Sets the value of the xpctdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdDt(XMLGregorianCalendar value) {
        this.xpctdDt = value;
    }

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
