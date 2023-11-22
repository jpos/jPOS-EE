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

package org.jpos.iso20022.auth_071_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReinvestedCashTypeAndAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReinvestedCashTypeAndAmount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.071.001.02}ReinvestmentType1Code"/>
 *         <element name="RinvstdCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.071.001.02}ActiveOrHistoricCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReinvestedCashTypeAndAmount1", propOrder = {
    "tp",
    "rinvstdCshAmt"
})
public class ReinvestedCashTypeAndAmount1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ReinvestmentType1Code tp;
    @XmlElement(name = "RinvstdCshAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount rinvstdCshAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReinvestmentType1Code }
     *     
     */
    public ReinvestmentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinvestmentType1Code }
     *     
     */
    public void setTp(ReinvestmentType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rinvstdCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRinvstdCshAmt() {
        return rinvstdCshAmt;
    }

    /**
     * Sets the value of the rinvstdCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRinvstdCshAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rinvstdCshAmt = value;
    }

}
