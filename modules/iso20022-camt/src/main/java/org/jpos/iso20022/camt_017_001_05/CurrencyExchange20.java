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

package org.jpos.iso20022.camt_017_001_05;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyExchange20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyExchange20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:camt.017.001.05}BaseOneRate"/>
 *         <element name="QtdCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.017.001.05}ActiveOrHistoricCurrencyCode"/>
 *         <element name="QtnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.017.001.05}ISODateTime"/>
 *         <element name="LwLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.017.001.05}ExchangeRateOrPercentage1Choice" minOccurs="0"/>
 *         <element name="HghLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.017.001.05}ExchangeRateOrPercentage1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange20", propOrder = {
    "xchgRate",
    "qtdCcy",
    "qtnDt",
    "lwLmt",
    "hghLmt"
})
public class CurrencyExchange20 {

    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "QtdCcy", required = true)
    protected String qtdCcy;
    @XmlElement(name = "QtnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qtnDt;
    @XmlElement(name = "LwLmt")
    protected ExchangeRateOrPercentage1Choice lwLmt;
    @XmlElement(name = "HghLmt")
    protected ExchangeRateOrPercentage1Choice hghLmt;

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
     * Gets the value of the qtdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdCcy() {
        return qtdCcy;
    }

    /**
     * Sets the value of the qtdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdCcy(String value) {
        this.qtdCcy = value;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQtnDt(XMLGregorianCalendar value) {
        this.qtnDt = value;
    }

    /**
     * Gets the value of the lwLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public ExchangeRateOrPercentage1Choice getLwLmt() {
        return lwLmt;
    }

    /**
     * Sets the value of the lwLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public void setLwLmt(ExchangeRateOrPercentage1Choice value) {
        this.lwLmt = value;
    }

    /**
     * Gets the value of the hghLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public ExchangeRateOrPercentage1Choice getHghLmt() {
        return hghLmt;
    }

    /**
     * Sets the value of the hghLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateOrPercentage1Choice }
     *     
     */
    public void setHghLmt(ExchangeRateOrPercentage1Choice value) {
        this.hghLmt = value;
    }

}
