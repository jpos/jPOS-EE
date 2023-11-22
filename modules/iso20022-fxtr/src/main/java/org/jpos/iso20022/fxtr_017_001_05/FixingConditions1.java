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

package org.jpos.iso20022.fxtr_017_001_05;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FixingConditions1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FixingConditions1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ISODate"/>
 *         <element name="OrgtrRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text"/>
 *         <element name="CmonRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="TradgSdBuyAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="TradgSdSellAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}BaseOneRate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixingConditions1", propOrder = {
    "tradDt",
    "orgtrRef",
    "cmonRef",
    "rltdRef",
    "tradgSdBuyAmt",
    "tradgSdSellAmt",
    "xchgRate"
})
public class FixingConditions1 {

    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "OrgtrRef", required = true)
    protected String orgtrRef;
    @XmlElement(name = "CmonRef")
    protected String cmonRef;
    @XmlElement(name = "RltdRef")
    protected String rltdRef;
    @XmlElement(name = "TradgSdBuyAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount tradgSdBuyAmt;
    @XmlElement(name = "TradgSdSellAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount tradgSdSellAmt;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the orgtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrRef() {
        return orgtrRef;
    }

    /**
     * Sets the value of the orgtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtrRef(String value) {
        this.orgtrRef = value;
    }

    /**
     * Gets the value of the cmonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonRef() {
        return cmonRef;
    }

    /**
     * Sets the value of the cmonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonRef(String value) {
        this.cmonRef = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdRef(String value) {
        this.rltdRef = value;
    }

    /**
     * Gets the value of the tradgSdBuyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTradgSdBuyAmt() {
        return tradgSdBuyAmt;
    }

    /**
     * Sets the value of the tradgSdBuyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTradgSdBuyAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.tradgSdBuyAmt = value;
    }

    /**
     * Gets the value of the tradgSdSellAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTradgSdSellAmt() {
        return tradgSdSellAmt;
    }

    /**
     * Sets the value of the tradgSdSellAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTradgSdSellAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.tradgSdSellAmt = value;
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

}
