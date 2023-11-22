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

package org.jpos.iso20022.catm_003_001_12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeConfiguration10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExchangeConfiguration10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XchgPlcy" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}ExchangePolicy2Code" maxOccurs="unbounded"/>
 *         <element name="MaxNb" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}Number" minOccurs="0"/>
 *         <element name="MaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ReTry" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}ProcessRetry3" minOccurs="0"/>
 *         <element name="TmCond" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}ProcessTiming6" minOccurs="0"/>
 *         <element name="XchgFaild" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="XchgDclnd" type="{urn:iso:std:iso:20022:tech:xsd:catm.003.001.12}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeConfiguration10", propOrder = {
    "xchgPlcy",
    "maxNb",
    "maxAmt",
    "reTry",
    "tmCond",
    "xchgFaild",
    "xchgDclnd"
})
public class ExchangeConfiguration10 {

    @XmlElement(name = "XchgPlcy", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExchangePolicy2Code> xchgPlcy;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;
    @XmlElement(name = "ReTry")
    protected ProcessRetry3 reTry;
    @XmlElement(name = "TmCond")
    protected ProcessTiming6 tmCond;
    @XmlElement(name = "XchgFaild")
    protected Boolean xchgFaild;
    @XmlElement(name = "XchgDclnd")
    protected Boolean xchgDclnd;

    /**
     * Gets the value of the xchgPlcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xchgPlcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgPlcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangePolicy2Code }
     * 
     * 
     * @return
     *     The value of the xchgPlcy property.
     */
    public List<ExchangePolicy2Code> getXchgPlcy() {
        if (xchgPlcy == null) {
            xchgPlcy = new ArrayList<>();
        }
        return this.xchgPlcy;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxNb(BigDecimal value) {
        this.maxNb = value;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
    }

    /**
     * Gets the value of the reTry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ProcessRetry3 getReTry() {
        return reTry;
    }

    /**
     * Sets the value of the reTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry3 }
     *     
     */
    public void setReTry(ProcessRetry3 value) {
        this.reTry = value;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming6 }
     *     
     */
    public ProcessTiming6 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming6 }
     *     
     */
    public void setTmCond(ProcessTiming6 value) {
        this.tmCond = value;
    }

    /**
     * Gets the value of the xchgFaild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgFaild() {
        return xchgFaild;
    }

    /**
     * Sets the value of the xchgFaild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXchgFaild(Boolean value) {
        this.xchgFaild = value;
    }

    /**
     * Gets the value of the xchgDclnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgDclnd() {
        return xchgDclnd;
    }

    /**
     * Sets the value of the xchgDclnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXchgDclnd(Boolean value) {
        this.xchgDclnd = value;
    }

}
