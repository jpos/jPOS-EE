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
 * <p>Java class for BillingServiceParameters2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingServiceParameters2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BkSvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServiceIdentification2"/>
 *         <element name="Vol" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="SvcChrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceParameters2", propOrder = {
    "bkSvc",
    "vol",
    "unitPric",
    "svcChrgAmt"
})
public class BillingServiceParameters2 {

    @XmlElement(name = "BkSvc", required = true)
    protected BillingServiceIdentification2 bkSvc;
    @XmlElement(name = "Vol")
    protected BigDecimal vol;
    @XmlElement(name = "UnitPric")
    protected AmountAndDirection34 unitPric;
    @XmlElement(name = "SvcChrgAmt", required = true)
    protected AmountAndDirection34 svcChrgAmt;

    /**
     * Gets the value of the bkSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceIdentification2 }
     *     
     */
    public BillingServiceIdentification2 getBkSvc() {
        return bkSvc;
    }

    /**
     * Sets the value of the bkSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceIdentification2 }
     *     
     */
    public void setBkSvc(BillingServiceIdentification2 value) {
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

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setUnitPric(AmountAndDirection34 value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the svcChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSvcChrgAmt() {
        return svcChrgAmt;
    }

    /**
     * Sets the value of the svcChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setSvcChrgAmt(AmountAndDirection34 value) {
        this.svcChrgAmt = value;
    }

}
