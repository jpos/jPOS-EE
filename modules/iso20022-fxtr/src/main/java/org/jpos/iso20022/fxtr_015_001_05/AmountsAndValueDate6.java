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

package org.jpos.iso20022.fxtr_015_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountsAndValueDate6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountsAndValueDate6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradgSdBuyAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}CurrencyOrDigitalTokenAmount1Choice"/>
 *         <element name="TradgSdSellAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}CurrencyOrDigitalTokenAmount1Choice"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}ISODate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsAndValueDate6", propOrder = {
    "tradgSdBuyAmt",
    "tradgSdSellAmt",
    "sttlmDt"
})
public class AmountsAndValueDate6 {

    @XmlElement(name = "TradgSdBuyAmt", required = true)
    protected CurrencyOrDigitalTokenAmount1Choice tradgSdBuyAmt;
    @XmlElement(name = "TradgSdSellAmt", required = true)
    protected CurrencyOrDigitalTokenAmount1Choice tradgSdSellAmt;
    @XmlElement(name = "SttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;

    /**
     * Gets the value of the tradgSdBuyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public CurrencyOrDigitalTokenAmount1Choice getTradgSdBuyAmt() {
        return tradgSdBuyAmt;
    }

    /**
     * Sets the value of the tradgSdBuyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public void setTradgSdBuyAmt(CurrencyOrDigitalTokenAmount1Choice value) {
        this.tradgSdBuyAmt = value;
    }

    /**
     * Gets the value of the tradgSdSellAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public CurrencyOrDigitalTokenAmount1Choice getTradgSdSellAmt() {
        return tradgSdSellAmt;
    }

    /**
     * Sets the value of the tradgSdSellAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyOrDigitalTokenAmount1Choice }
     *     
     */
    public void setTradgSdSellAmt(CurrencyOrDigitalTokenAmount1Choice value) {
        this.tradgSdSellAmt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

}
