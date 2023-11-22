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

package org.jpos.iso20022.fxtr_035_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentLeg6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstrumentLeg6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LegSd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}Side1Code"/>
 *         <element name="LegSttlmTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}SettlementDateCode"/>
 *         <element name="LegSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ISODateTime"/>
 *         <element name="LegLastPric" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="LegSttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}CurrencyCode"/>
 *         <element name="LegOrdrQty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}CurrencyAndAmount"/>
 *         <element name="LegFwdPts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}DecimalNumber"/>
 *         <element name="LegClctdCtrPtyCcyLastQty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}CurrencyAndAmount"/>
 *         <element name="LegRskAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="LegValtnRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}AgreedRate3"/>
 *         <element name="LegValDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ISODate"/>
 *         <element name="LegCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}CurrencyCode"/>
 *         <element name="LegSymb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}Max35Text"/>
 *         <element name="LegSctyId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}SecurityIdentification18"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentLeg6", propOrder = {
    "legSd",
    "legSttlmTp",
    "legSttlmDt",
    "legLastPric",
    "legSttlmCcy",
    "legOrdrQty",
    "legFwdPts",
    "legClctdCtrPtyCcyLastQty",
    "legRskAmt",
    "legValtnRate",
    "legValDt",
    "legCcy",
    "legSymb",
    "legSctyId"
})
public class InstrumentLeg6 {

    @XmlElement(name = "LegSd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code legSd;
    @XmlElement(name = "LegSttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDateCode legSttlmTp;
    @XmlElement(name = "LegSttlmDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar legSttlmDt;
    @XmlElement(name = "LegLastPric", required = true)
    protected ActiveCurrencyAnd13DecimalAmount legLastPric;
    @XmlElement(name = "LegSttlmCcy", required = true)
    protected String legSttlmCcy;
    @XmlElement(name = "LegOrdrQty", required = true)
    protected CurrencyAndAmount legOrdrQty;
    @XmlElement(name = "LegFwdPts", required = true)
    protected BigDecimal legFwdPts;
    @XmlElement(name = "LegClctdCtrPtyCcyLastQty", required = true)
    protected CurrencyAndAmount legClctdCtrPtyCcyLastQty;
    @XmlElement(name = "LegRskAmt", required = true)
    protected ActiveCurrencyAndAmount legRskAmt;
    @XmlElement(name = "LegValtnRate", required = true)
    protected AgreedRate3 legValtnRate;
    @XmlElement(name = "LegValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar legValDt;
    @XmlElement(name = "LegCcy", required = true)
    protected String legCcy;
    @XmlElement(name = "LegSymb", required = true)
    protected String legSymb;
    @XmlElement(name = "LegSctyId", required = true)
    protected SecurityIdentification18 legSctyId;

    /**
     * Gets the value of the legSd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getLegSd() {
        return legSd;
    }

    /**
     * Sets the value of the legSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public void setLegSd(Side1Code value) {
        this.legSd = value;
    }

    /**
     * Gets the value of the legSttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateCode }
     *     
     */
    public SettlementDateCode getLegSttlmTp() {
        return legSttlmTp;
    }

    /**
     * Sets the value of the legSttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateCode }
     *     
     */
    public void setLegSttlmTp(SettlementDateCode value) {
        this.legSttlmTp = value;
    }

    /**
     * Gets the value of the legSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLegSttlmDt() {
        return legSttlmDt;
    }

    /**
     * Sets the value of the legSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLegSttlmDt(XMLGregorianCalendar value) {
        this.legSttlmDt = value;
    }

    /**
     * Gets the value of the legLastPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getLegLastPric() {
        return legLastPric;
    }

    /**
     * Sets the value of the legLastPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setLegLastPric(ActiveCurrencyAnd13DecimalAmount value) {
        this.legLastPric = value;
    }

    /**
     * Gets the value of the legSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegSttlmCcy() {
        return legSttlmCcy;
    }

    /**
     * Sets the value of the legSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegSttlmCcy(String value) {
        this.legSttlmCcy = value;
    }

    /**
     * Gets the value of the legOrdrQty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getLegOrdrQty() {
        return legOrdrQty;
    }

    /**
     * Sets the value of the legOrdrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setLegOrdrQty(CurrencyAndAmount value) {
        this.legOrdrQty = value;
    }

    /**
     * Gets the value of the legFwdPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegFwdPts() {
        return legFwdPts;
    }

    /**
     * Sets the value of the legFwdPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegFwdPts(BigDecimal value) {
        this.legFwdPts = value;
    }

    /**
     * Gets the value of the legClctdCtrPtyCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getLegClctdCtrPtyCcyLastQty() {
        return legClctdCtrPtyCcyLastQty;
    }

    /**
     * Sets the value of the legClctdCtrPtyCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setLegClctdCtrPtyCcyLastQty(CurrencyAndAmount value) {
        this.legClctdCtrPtyCcyLastQty = value;
    }

    /**
     * Gets the value of the legRskAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLegRskAmt() {
        return legRskAmt;
    }

    /**
     * Sets the value of the legRskAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setLegRskAmt(ActiveCurrencyAndAmount value) {
        this.legRskAmt = value;
    }

    /**
     * Gets the value of the legValtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getLegValtnRate() {
        return legValtnRate;
    }

    /**
     * Sets the value of the legValtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public void setLegValtnRate(AgreedRate3 value) {
        this.legValtnRate = value;
    }

    /**
     * Gets the value of the legValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLegValDt() {
        return legValDt;
    }

    /**
     * Sets the value of the legValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLegValDt(XMLGregorianCalendar value) {
        this.legValDt = value;
    }

    /**
     * Gets the value of the legCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegCcy() {
        return legCcy;
    }

    /**
     * Sets the value of the legCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegCcy(String value) {
        this.legCcy = value;
    }

    /**
     * Gets the value of the legSymb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegSymb() {
        return legSymb;
    }

    /**
     * Sets the value of the legSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegSymb(String value) {
        this.legSymb = value;
    }

    /**
     * Gets the value of the legSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public SecurityIdentification18 getLegSctyId() {
        return legSctyId;
    }

    /**
     * Sets the value of the legSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public void setLegSctyId(SecurityIdentification18 value) {
        this.legSctyId = value;
    }

}
