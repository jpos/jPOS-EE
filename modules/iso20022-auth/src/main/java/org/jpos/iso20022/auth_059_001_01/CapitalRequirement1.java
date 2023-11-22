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

package org.jpos.iso20022.auth_059_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapitalRequirement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CapitalRequirement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WndgDwnOrRstrgRsk" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="OprlAndLglRsk" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CdtRsk" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CntrPtyRsk" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="MktRsk" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="BizRsk" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="NtfctnBffr" type="{urn:iso:std:iso:20022:tech:xsd:auth.059.001.01}BaseOneRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapitalRequirement1", propOrder = {
    "wndgDwnOrRstrgRsk",
    "oprlAndLglRsk",
    "cdtRsk",
    "cntrPtyRsk",
    "mktRsk",
    "bizRsk",
    "ntfctnBffr"
})
public class CapitalRequirement1 {

    @XmlElement(name = "WndgDwnOrRstrgRsk", required = true)
    protected ActiveCurrencyAndAmount wndgDwnOrRstrgRsk;
    @XmlElement(name = "OprlAndLglRsk", required = true)
    protected ActiveCurrencyAndAmount oprlAndLglRsk;
    @XmlElement(name = "CdtRsk", required = true)
    protected ActiveCurrencyAndAmount cdtRsk;
    @XmlElement(name = "CntrPtyRsk", required = true)
    protected ActiveCurrencyAndAmount cntrPtyRsk;
    @XmlElement(name = "MktRsk", required = true)
    protected ActiveCurrencyAndAmount mktRsk;
    @XmlElement(name = "BizRsk", required = true)
    protected ActiveCurrencyAndAmount bizRsk;
    @XmlElement(name = "NtfctnBffr")
    protected BigDecimal ntfctnBffr;

    /**
     * Gets the value of the wndgDwnOrRstrgRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWndgDwnOrRstrgRsk() {
        return wndgDwnOrRstrgRsk;
    }

    /**
     * Sets the value of the wndgDwnOrRstrgRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWndgDwnOrRstrgRsk(ActiveCurrencyAndAmount value) {
        this.wndgDwnOrRstrgRsk = value;
    }

    /**
     * Gets the value of the oprlAndLglRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOprlAndLglRsk() {
        return oprlAndLglRsk;
    }

    /**
     * Sets the value of the oprlAndLglRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOprlAndLglRsk(ActiveCurrencyAndAmount value) {
        this.oprlAndLglRsk = value;
    }

    /**
     * Gets the value of the cdtRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdtRsk() {
        return cdtRsk;
    }

    /**
     * Sets the value of the cdtRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCdtRsk(ActiveCurrencyAndAmount value) {
        this.cdtRsk = value;
    }

    /**
     * Gets the value of the cntrPtyRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCntrPtyRsk() {
        return cntrPtyRsk;
    }

    /**
     * Sets the value of the cntrPtyRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCntrPtyRsk(ActiveCurrencyAndAmount value) {
        this.cntrPtyRsk = value;
    }

    /**
     * Gets the value of the mktRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktRsk() {
        return mktRsk;
    }

    /**
     * Sets the value of the mktRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMktRsk(ActiveCurrencyAndAmount value) {
        this.mktRsk = value;
    }

    /**
     * Gets the value of the bizRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getBizRsk() {
        return bizRsk;
    }

    /**
     * Sets the value of the bizRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setBizRsk(ActiveCurrencyAndAmount value) {
        this.bizRsk = value;
    }

    /**
     * Gets the value of the ntfctnBffr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtfctnBffr() {
        return ntfctnBffr;
    }

    /**
     * Sets the value of the ntfctnBffr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNtfctnBffr(BigDecimal value) {
        this.ntfctnBffr = value;
    }

}
