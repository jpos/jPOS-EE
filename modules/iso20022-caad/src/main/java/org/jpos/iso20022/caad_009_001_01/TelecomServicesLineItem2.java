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

package org.jpos.iso20022.caad_009_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecomServicesLineItem2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TelecomServicesLineItem2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISODate" minOccurs="0"/>
 *         <element name="TmPrd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Drtn" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISOTime" minOccurs="0"/>
 *         <element name="CallFr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TelecomCallDetails2" minOccurs="0"/>
 *         <element name="CallTo" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TelecomCallDetails2" minOccurs="0"/>
 *         <element name="Chrg" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Amount20" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlTax" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max256Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomServicesLineItem2", propOrder = {
    "startDtTm",
    "tmPrd",
    "drtn",
    "callFr",
    "callTo",
    "chrg",
    "ttlTax",
    "ttlAmt",
    "desc",
    "addtlData"
})
public class TelecomServicesLineItem2 {

    @XmlElement(name = "StartDtTm")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDtTm;
    @XmlElement(name = "TmPrd")
    protected String tmPrd;
    @XmlElement(name = "Drtn")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar drtn;
    @XmlElement(name = "CallFr")
    protected TelecomCallDetails2 callFr;
    @XmlElement(name = "CallTo")
    protected TelecomCallDetails2 callTo;
    @XmlElement(name = "Chrg")
    protected List<Amount20> chrg;
    @XmlElement(name = "TtlTax")
    protected List<Tax39> ttlTax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDtTm(XMLGregorianCalendar value) {
        this.startDtTm = value;
    }

    /**
     * Gets the value of the tmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmPrd() {
        return tmPrd;
    }

    /**
     * Sets the value of the tmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmPrd(String value) {
        this.tmPrd = value;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDrtn(XMLGregorianCalendar value) {
        this.drtn = value;
    }

    /**
     * Gets the value of the callFr property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public TelecomCallDetails2 getCallFr() {
        return callFr;
    }

    /**
     * Sets the value of the callFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public void setCallFr(TelecomCallDetails2 value) {
        this.callFr = value;
    }

    /**
     * Gets the value of the callTo property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public TelecomCallDetails2 getCallTo() {
        return callTo;
    }

    /**
     * Sets the value of the callTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomCallDetails2 }
     *     
     */
    public void setCallTo(TelecomCallDetails2 value) {
        this.callTo = value;
    }

    /**
     * Gets the value of the chrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount20 }
     * 
     * 
     * @return
     *     The value of the chrg property.
     */
    public List<Amount20> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<>();
        }
        return this.chrg;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the ttlTax property.
     */
    public List<Tax39> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<>();
        }
        return this.ttlTax;
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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
