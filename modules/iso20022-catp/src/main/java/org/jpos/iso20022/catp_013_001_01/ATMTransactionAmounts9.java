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

package org.jpos.iso20022.catp_013_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransactionAmounts9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransactionAmounts9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MdiaTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}ATMMediaType2Code"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="MinNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}Number" minOccurs="0"/>
 *         <element name="MaxNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}Number" minOccurs="0"/>
 *         <element name="DispFlg" type="{urn:iso:std:iso:20022:tech:xsd:catp.013.001.01}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransactionAmounts9", propOrder = {
    "mdiaTp",
    "ccy",
    "minNb",
    "maxNb",
    "dispFlg"
})
public class ATMTransactionAmounts9 {

    @XmlElement(name = "MdiaTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMMediaType2Code mdiaTp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MinNb")
    protected BigDecimal minNb;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;
    @XmlElement(name = "DispFlg")
    protected Boolean dispFlg;

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public ATMMediaType2Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public void setMdiaTp(ATMMediaType2Code value) {
        this.mdiaTp = value;
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
     * Gets the value of the minNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinNb() {
        return minNb;
    }

    /**
     * Sets the value of the minNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinNb(BigDecimal value) {
        this.minNb = value;
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
     * Gets the value of the dispFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispFlg() {
        return dispFlg;
    }

    /**
     * Sets the value of the dispFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispFlg(Boolean value) {
        this.dispFlg = value;
    }

}
