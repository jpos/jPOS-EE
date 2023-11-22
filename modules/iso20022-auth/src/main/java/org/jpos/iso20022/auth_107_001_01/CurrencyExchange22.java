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

package org.jpos.iso20022.auth_107_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyExchange22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyExchange22">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvrblCrossCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}BaseOne18Rate" minOccurs="0"/>
 *         <element name="FwdXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}BaseOne18Rate" minOccurs="0"/>
 *         <element name="XchgRateBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ExchangeRateBasis1Choice" minOccurs="0"/>
 *         <element name="FxgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange22", propOrder = {
    "dlvrblCrossCcy",
    "xchgRate",
    "fwdXchgRate",
    "xchgRateBsis",
    "fxgDt"
})
public class CurrencyExchange22 {

    @XmlElement(name = "DlvrblCrossCcy")
    protected String dlvrblCrossCcy;
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
     * Gets the value of the dlvrblCrossCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrblCrossCcy() {
        return dlvrblCrossCcy;
    }

    /**
     * Sets the value of the dlvrblCrossCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvrblCrossCcy(String value) {
        this.dlvrblCrossCcy = value;
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
