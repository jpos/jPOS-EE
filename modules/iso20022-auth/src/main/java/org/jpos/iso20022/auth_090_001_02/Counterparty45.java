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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Counterparty45 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Counterparty45">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PartyIdentification248Choice"/>
 *         <element name="Ntr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}CounterpartyTradeNature15Choice" minOccurs="0"/>
 *         <element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TradingCapacity7Code" minOccurs="0"/>
 *         <element name="DrctnOrSd" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Direction4Choice" minOccurs="0"/>
 *         <element name="TradrLctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}CountryCode" minOccurs="0"/>
 *         <element name="BookgLctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}CountryCode" minOccurs="0"/>
 *         <element name="RptgXmptn" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ReportingExemption1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty45", propOrder = {
    "id",
    "ntr",
    "tradgCpcty",
    "drctnOrSd",
    "tradrLctn",
    "bookgLctn",
    "rptgXmptn"
})
public class Counterparty45 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification248Choice id;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature15Choice ntr;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity7Code tradgCpcty;
    @XmlElement(name = "DrctnOrSd")
    protected Direction4Choice drctnOrSd;
    @XmlElement(name = "TradrLctn")
    protected String tradrLctn;
    @XmlElement(name = "BookgLctn")
    protected String bookgLctn;
    @XmlElement(name = "RptgXmptn")
    protected ReportingExemption1 rptgXmptn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public void setId(PartyIdentification248Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public CounterpartyTradeNature15Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public void setNtr(CounterpartyTradeNature15Choice value) {
        this.ntr = value;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity7Code }
     *     
     */
    public TradingCapacity7Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity7Code }
     *     
     */
    public void setTradgCpcty(TradingCapacity7Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Gets the value of the drctnOrSd property.
     * 
     * @return
     *     possible object is
     *     {@link Direction4Choice }
     *     
     */
    public Direction4Choice getDrctnOrSd() {
        return drctnOrSd;
    }

    /**
     * Sets the value of the drctnOrSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction4Choice }
     *     
     */
    public void setDrctnOrSd(Direction4Choice value) {
        this.drctnOrSd = value;
    }

    /**
     * Gets the value of the tradrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradrLctn() {
        return tradrLctn;
    }

    /**
     * Sets the value of the tradrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradrLctn(String value) {
        this.tradrLctn = value;
    }

    /**
     * Gets the value of the bookgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookgLctn() {
        return bookgLctn;
    }

    /**
     * Sets the value of the bookgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookgLctn(String value) {
        this.bookgLctn = value;
    }

    /**
     * Gets the value of the rptgXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingExemption1 }
     *     
     */
    public ReportingExemption1 getRptgXmptn() {
        return rptgXmptn;
    }

    /**
     * Sets the value of the rptgXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingExemption1 }
     *     
     */
    public void setRptgXmptn(ReportingExemption1 value) {
        this.rptgXmptn = value;
    }

}
