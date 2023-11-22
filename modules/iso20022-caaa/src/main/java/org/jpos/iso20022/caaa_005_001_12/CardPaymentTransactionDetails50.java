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

package org.jpos.iso20022.caaa_005_001_12;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentTransactionDetails50 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentTransactionDetails50">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.005.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.005.001.12}ImpliedCurrencyAndAmount"/>
 *         <element name="VldtyDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.005.001.12}ISODate" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.005.001.12}Max10000Binary" minOccurs="0"/>
 *         <element name="KeepAuthstnOpn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.005.001.12}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails50", propOrder = {
    "ccy",
    "ttlAmt",
    "vldtyDt",
    "iccRltdData",
    "keepAuthstnOpn"
})
public class CardPaymentTransactionDetails50 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "VldtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldtyDt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "KeepAuthstnOpn")
    protected Boolean keepAuthstnOpn;

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
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldtyDt(XMLGregorianCalendar value) {
        this.vldtyDt = value;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setICCRltdData(byte[] value) {
        this.iccRltdData = value;
    }

    /**
     * Gets the value of the keepAuthstnOpn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAuthstnOpn() {
        return keepAuthstnOpn;
    }

    /**
     * Sets the value of the keepAuthstnOpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAuthstnOpn(Boolean value) {
        this.keepAuthstnOpn = value;
    }

}
