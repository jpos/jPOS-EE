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

package org.jpos.iso20022.camt_086_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingServiceParameters3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingServiceParameters3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BkSvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServiceIdentification3"/>
 *         <element name="Vol" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}DecimalNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceParameters3", propOrder = {
    "bkSvc",
    "vol"
})
public class BillingServiceParameters3 {

    @XmlElement(name = "BkSvc", required = true)
    protected BillingServiceIdentification3 bkSvc;
    @XmlElement(name = "Vol")
    protected BigDecimal vol;

    /**
     * Gets the value of the bkSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceIdentification3 }
     *     
     */
    public BillingServiceIdentification3 getBkSvc() {
        return bkSvc;
    }

    /**
     * Sets the value of the bkSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceIdentification3 }
     *     
     */
    public void setBkSvc(BillingServiceIdentification3 value) {
        this.bkSvc = value;
    }

    /**
     * Gets the value of the vol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVol() {
        return vol;
    }

    /**
     * Sets the value of the vol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVol(BigDecimal value) {
        this.vol = value;
    }

}
