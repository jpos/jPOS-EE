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

package org.jpos.iso20022.caaa_003_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentContext30 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentContext30">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}PaymentContext29" minOccurs="0"/>
 *         <element name="SaleCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}SaleContext4" minOccurs="0"/>
 *         <element name="DrctDbtCntxt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}CardDirectDebit2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentContext30", propOrder = {
    "pmtCntxt",
    "saleCntxt",
    "drctDbtCntxt"
})
public class CardPaymentContext30 {

    @XmlElement(name = "PmtCntxt")
    protected PaymentContext29 pmtCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext4 saleCntxt;
    @XmlElement(name = "DrctDbtCntxt")
    protected CardDirectDebit2 drctDbtCntxt;

    /**
     * Gets the value of the pmtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext29 }
     *     
     */
    public PaymentContext29 getPmtCntxt() {
        return pmtCntxt;
    }

    /**
     * Sets the value of the pmtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext29 }
     *     
     */
    public void setPmtCntxt(PaymentContext29 value) {
        this.pmtCntxt = value;
    }

    /**
     * Gets the value of the saleCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext4 }
     *     
     */
    public SaleContext4 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Sets the value of the saleCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext4 }
     *     
     */
    public void setSaleCntxt(SaleContext4 value) {
        this.saleCntxt = value;
    }

    /**
     * Gets the value of the drctDbtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardDirectDebit2 }
     *     
     */
    public CardDirectDebit2 getDrctDbtCntxt() {
        return drctDbtCntxt;
    }

    /**
     * Sets the value of the drctDbtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDirectDebit2 }
     *     
     */
    public void setDrctDbtCntxt(CardDirectDebit2 value) {
        this.drctDbtCntxt = value;
    }

}
