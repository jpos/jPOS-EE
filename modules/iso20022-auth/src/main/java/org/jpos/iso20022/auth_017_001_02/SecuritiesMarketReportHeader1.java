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

package org.jpos.iso20022.auth_017_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesMarketReportHeader1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesMarketReportHeader1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}TradingVenueIdentification1Choice"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}Period4Choice"/>
 *         <element name="SubmissnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMarketReportHeader1", propOrder = {
    "rptgNtty",
    "rptgPrd",
    "submissnDtTm"
})
public class SecuritiesMarketReportHeader1 {

    @XmlElement(name = "RptgNtty", required = true)
    protected TradingVenueIdentification1Choice rptgNtty;
    @XmlElement(name = "RptgPrd", required = true)
    protected Period4Choice rptgPrd;
    @XmlElement(name = "SubmissnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissnDtTm;

    /**
     * Gets the value of the rptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public TradingVenueIdentification1Choice getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public void setRptgNtty(TradingVenueIdentification1Choice value) {
        this.rptgNtty = value;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
    }

    /**
     * Gets the value of the submissnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissnDtTm() {
        return submissnDtTm;
    }

    /**
     * Sets the value of the submissnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissnDtTm(XMLGregorianCalendar value) {
        this.submissnDtTm = value;
    }

}
