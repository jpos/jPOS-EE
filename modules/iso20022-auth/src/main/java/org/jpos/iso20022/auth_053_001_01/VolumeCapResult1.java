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

package org.jpos.iso20022.auth_053_001_01;

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
 * <p>Java class for VolumeCapResult1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VolumeCapResult1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}ISINOct2015Identifier"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}Period4Choice"/>
 *         <element name="LastUpdDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}ISODate" minOccurs="0"/>
 *         <element name="TtlTradgVol" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="TradgUdrWvrPctg" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}PercentageRate"/>
 *         <element name="TradgUdrWvrBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}TradingUnderWaiversPercentage1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dsclmr" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeCapResult1", propOrder = {
    "id",
    "rptgPrd",
    "lastUpdDt",
    "ttlTradgVol",
    "tradgUdrWvrPctg",
    "tradgUdrWvrBrkdwn",
    "dsclmr"
})
public class VolumeCapResult1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "RptgPrd", required = true)
    protected Period4Choice rptgPrd;
    @XmlElement(name = "LastUpdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdDt;
    @XmlElement(name = "TtlTradgVol", required = true)
    protected ActiveCurrencyAndAmount ttlTradgVol;
    @XmlElement(name = "TradgUdrWvrPctg", required = true)
    protected BigDecimal tradgUdrWvrPctg;
    @XmlElement(name = "TradgUdrWvrBrkdwn")
    protected List<TradingUnderWaiversPercentage1> tradgUdrWvrBrkdwn;
    @XmlElement(name = "Dsclmr")
    protected String dsclmr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the lastUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdDt() {
        return lastUpdDt;
    }

    /**
     * Sets the value of the lastUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdDt(XMLGregorianCalendar value) {
        this.lastUpdDt = value;
    }

    /**
     * Gets the value of the ttlTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTradgVol() {
        return ttlTradgVol;
    }

    /**
     * Sets the value of the ttlTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlTradgVol(ActiveCurrencyAndAmount value) {
        this.ttlTradgVol = value;
    }

    /**
     * Gets the value of the tradgUdrWvrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradgUdrWvrPctg() {
        return tradgUdrWvrPctg;
    }

    /**
     * Sets the value of the tradgUdrWvrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradgUdrWvrPctg(BigDecimal value) {
        this.tradgUdrWvrPctg = value;
    }

    /**
     * Gets the value of the tradgUdrWvrBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgUdrWvrBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgUdrWvrBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingUnderWaiversPercentage1 }
     * 
     * 
     * @return
     *     The value of the tradgUdrWvrBrkdwn property.
     */
    public List<TradingUnderWaiversPercentage1> getTradgUdrWvrBrkdwn() {
        if (tradgUdrWvrBrkdwn == null) {
            tradgUdrWvrBrkdwn = new ArrayList<>();
        }
        return this.tradgUdrWvrBrkdwn;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsclmr(String value) {
        this.dsclmr = value;
    }

}
