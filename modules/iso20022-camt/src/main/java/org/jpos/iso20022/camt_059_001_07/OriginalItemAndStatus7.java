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

package org.jpos.iso20022.camt_059_001_07;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalItemAndStatus7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalItemAndStatus7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlItmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}Max35Text"/>
 *         <element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}UUIDv4Identifier" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="XpctdValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}ISODate" minOccurs="0"/>
 *         <element name="ItmSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}NotificationStatus3Code"/>
 *         <element name="AddtlStsInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}Max105Text" minOccurs="0"/>
 *         <element name="OrgnlItmRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.07}OriginalItemReference6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalItemAndStatus7", propOrder = {
    "orgnlItmId",
    "orgnlEndToEndId",
    "orgnlUETR",
    "amt",
    "xpctdValDt",
    "itmSts",
    "addtlStsInf",
    "orgnlItmRef"
})
public class OriginalItemAndStatus7 {

    @XmlElement(name = "OrgnlItmId", required = true)
    protected String orgnlItmId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "XpctdValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdValDt;
    @XmlElement(name = "ItmSts", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationStatus3Code itmSts;
    @XmlElement(name = "AddtlStsInf")
    protected String addtlStsInf;
    @XmlElement(name = "OrgnlItmRef")
    protected OriginalItemReference6 orgnlItmRef;

    /**
     * Gets the value of the orgnlItmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlItmId() {
        return orgnlItmId;
    }

    /**
     * Sets the value of the orgnlItmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlItmId(String value) {
        this.orgnlItmId = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlUETR(String value) {
        this.orgnlUETR = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdValDt(XMLGregorianCalendar value) {
        this.xpctdValDt = value;
    }

    /**
     * Gets the value of the itmSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus3Code }
     *     
     */
    public NotificationStatus3Code getItmSts() {
        return itmSts;
    }

    /**
     * Sets the value of the itmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus3Code }
     *     
     */
    public void setItmSts(NotificationStatus3Code value) {
        this.itmSts = value;
    }

    /**
     * Gets the value of the addtlStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlStsInf() {
        return addtlStsInf;
    }

    /**
     * Sets the value of the addtlStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlStsInf(String value) {
        this.addtlStsInf = value;
    }

    /**
     * Gets the value of the orgnlItmRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalItemReference6 }
     *     
     */
    public OriginalItemReference6 getOrgnlItmRef() {
        return orgnlItmRef;
    }

    /**
     * Sets the value of the orgnlItmRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalItemReference6 }
     *     
     */
    public void setOrgnlItmRef(OriginalItemReference6 value) {
        this.orgnlItmRef = value;
    }

}
