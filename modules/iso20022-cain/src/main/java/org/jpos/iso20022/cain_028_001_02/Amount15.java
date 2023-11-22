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

package org.jpos.iso20022.cain_028_001_02;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ImpliedCurrencyAndAmount"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ISO3NumericCurrencyCode" minOccurs="0"/>
 *         <element name="FctvXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}BaseOne25Rate" minOccurs="0"/>
 *         <element name="ConvsDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ISODate" minOccurs="0"/>
 *         <element name="ConvsTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ISOTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount15", propOrder = {
    "amt",
    "ccy",
    "fctvXchgRate",
    "convsDt",
    "convsTm"
})
public class Amount15 {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "FctvXchgRate")
    protected BigDecimal fctvXchgRate;
    @XmlElement(name = "ConvsDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar convsDt;
    @XmlElement(name = "ConvsTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar convsTm;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
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
     * Gets the value of the fctvXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctvXchgRate() {
        return fctvXchgRate;
    }

    /**
     * Sets the value of the fctvXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFctvXchgRate(BigDecimal value) {
        this.fctvXchgRate = value;
    }

    /**
     * Gets the value of the convsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvsDt() {
        return convsDt;
    }

    /**
     * Sets the value of the convsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvsDt(XMLGregorianCalendar value) {
        this.convsDt = value;
    }

    /**
     * Gets the value of the convsTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvsTm() {
        return convsTm;
    }

    /**
     * Sets the value of the convsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvsTm(XMLGregorianCalendar value) {
        this.convsTm = value;
    }

}
