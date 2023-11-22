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

package org.jpos.iso20022.casp_002_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentAccount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentAccount3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="CurBal" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PmtAcqrrData" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Acquirer10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAccount3", propOrder = {
    "ccy",
    "curBal",
    "pmtAcqrrData"
})
public class PaymentAccount3 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CurBal")
    protected BigDecimal curBal;
    @XmlElement(name = "PmtAcqrrData")
    protected Acquirer10 pmtAcqrrData;

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
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurBal(BigDecimal value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the pmtAcqrrData property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getPmtAcqrrData() {
        return pmtAcqrrData;
    }

    /**
     * Sets the value of the pmtAcqrrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public void setPmtAcqrrData(Acquirer10 value) {
        this.pmtAcqrrData = value;
    }

}
