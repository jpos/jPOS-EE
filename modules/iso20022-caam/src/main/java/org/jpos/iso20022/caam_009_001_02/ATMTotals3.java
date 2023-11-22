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

package org.jpos.iso20022.caam_009_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTotals3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTotals3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max70Text"/>
 *         <element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max70Text" minOccurs="0"/>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMCounterType2Code"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Cnt" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Number"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTotals3", propOrder = {
    "id",
    "addtlId",
    "prd",
    "ccy",
    "cnt",
    "amt"
})
public class ATMTotals3 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected String addtlId;
    @XmlElement(name = "Prd", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCounterType2Code prd;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Cnt", required = true)
    protected BigDecimal cnt;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;

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
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlId(String value) {
        this.addtlId = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCounterType2Code }
     *     
     */
    public ATMCounterType2Code getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCounterType2Code }
     *     
     */
    public void setPrd(ATMCounterType2Code value) {
        this.prd = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCnt(BigDecimal value) {
        this.cnt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

}
