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

package org.jpos.iso20022.auth_030_001_03;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyExchange23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyExchange23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ActiveOrHistoricCurrencyCode"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}BaseOne18Rate" minOccurs="0"/>
 *         <element name="FwdXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}BaseOne18Rate" minOccurs="0"/>
 *         <element name="XchgRateBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ExchangeRateBasis1Choice" minOccurs="0"/>
 *         <element name="FxgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange23", propOrder = {
    "ccy",
    "xchgRate",
    "fwdXchgRate",
    "xchgRateBsis",
    "fxgDt"
})
public class CurrencyExchange23 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "FwdXchgRate")
    protected BigDecimal fwdXchgRate;
    @XmlElement(name = "XchgRateBsis")
    protected ExchangeRateBasis1Choice xchgRateBsis;
    @XmlElement(name = "FxgDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fxgDt;

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
     * Gets the value of the fwdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFwdXchgRate() {
        return fwdXchgRate;
    }

    /**
     * Sets the value of the fwdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFwdXchgRate(BigDecimal value) {
        this.fwdXchgRate = value;
    }

    /**
     * Gets the value of the xchgRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public ExchangeRateBasis1Choice getXchgRateBsis() {
        return xchgRateBsis;
    }

    /**
     * Sets the value of the xchgRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public void setXchgRateBsis(ExchangeRateBasis1Choice value) {
        this.xchgRateBsis = value;
    }

    /**
     * Gets the value of the fxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFxgDt() {
        return fxgDt;
    }

    /**
     * Sets the value of the fxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFxgDt(XMLGregorianCalendar value) {
        this.fxgDt = value;
    }

}
