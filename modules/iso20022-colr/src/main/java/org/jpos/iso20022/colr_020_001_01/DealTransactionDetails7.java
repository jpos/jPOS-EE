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

package org.jpos.iso20022.colr_020_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealTransactionDetails7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DealTransactionDetails7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}ClosingDate4Choice"/>
 *         <element name="DealDtlsAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}CollateralAmount14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealTransactionDetails7", propOrder = {
    "clsgDt",
    "dealDtlsAmt"
})
public class DealTransactionDetails7 {

    @XmlElement(name = "ClsgDt", required = true)
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "DealDtlsAmt")
    protected CollateralAmount14 dealDtlsAmt;

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public void setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the dealDtlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount14 }
     *     
     */
    public CollateralAmount14 getDealDtlsAmt() {
        return dealDtlsAmt;
    }

    /**
     * Sets the value of the dealDtlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount14 }
     *     
     */
    public void setDealDtlsAmt(CollateralAmount14 value) {
        this.dealDtlsAmt = value;
    }

}
