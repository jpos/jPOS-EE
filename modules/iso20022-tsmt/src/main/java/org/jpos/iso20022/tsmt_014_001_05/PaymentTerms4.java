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

package org.jpos.iso20022.tsmt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTerms4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTerms4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}PaymentCodeOrOther1Choice"/>
 *         <element name="AmtOrPctg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}AmountOrPercentage2Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTerms4", propOrder = {
    "pmtTerms",
    "amtOrPctg"
})
public class PaymentTerms4 {

    @XmlElement(name = "PmtTerms", required = true)
    protected PaymentCodeOrOther1Choice pmtTerms;
    @XmlElement(name = "AmtOrPctg", required = true)
    protected AmountOrPercentage2Choice amtOrPctg;

    /**
     * Gets the value of the pmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCodeOrOther1Choice }
     *     
     */
    public PaymentCodeOrOther1Choice getPmtTerms() {
        return pmtTerms;
    }

    /**
     * Sets the value of the pmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCodeOrOther1Choice }
     *     
     */
    public void setPmtTerms(PaymentCodeOrOther1Choice value) {
        this.pmtTerms = value;
    }

    /**
     * Gets the value of the amtOrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public AmountOrPercentage2Choice getAmtOrPctg() {
        return amtOrPctg;
    }

    /**
     * Sets the value of the amtOrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public void setAmtOrPctg(AmountOrPercentage2Choice value) {
        this.amtOrPctg = value;
    }

}
