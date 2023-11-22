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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingUnderWaiversPercentage1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradingUnderWaiversPercentage1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradgUdrWvrPctg" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}PercentageRate"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.053.001.01}MICIdentifier"/>
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
@XmlType(name = "TradingUnderWaiversPercentage1", propOrder = {
    "tradgUdrWvrPctg",
    "tradgVn",
    "dsclmr"
})
public class TradingUnderWaiversPercentage1 {

    @XmlElement(name = "TradgUdrWvrPctg", required = true)
    protected BigDecimal tradgUdrWvrPctg;
    @XmlElement(name = "TradgVn", required = true)
    protected String tradgVn;
    @XmlElement(name = "Dsclmr")
    protected String dsclmr;

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
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
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
