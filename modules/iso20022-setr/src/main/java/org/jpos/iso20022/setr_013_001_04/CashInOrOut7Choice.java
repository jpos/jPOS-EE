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

package org.jpos.iso20022.setr_013_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashInOrOut7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashInOrOut7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CshInPmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}PaymentInstrument20Choice"/>
 *         <element name="CshOutPmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}PaymentInstrument21Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashInOrOut7Choice", propOrder = {
    "cshInPmtInstrm",
    "cshOutPmtInstrm"
})
public class CashInOrOut7Choice {

    @XmlElement(name = "CshInPmtInstrm")
    protected PaymentInstrument20Choice cshInPmtInstrm;
    @XmlElement(name = "CshOutPmtInstrm")
    protected PaymentInstrument21Choice cshOutPmtInstrm;

    /**
     * Gets the value of the cshInPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument20Choice }
     *     
     */
    public PaymentInstrument20Choice getCshInPmtInstrm() {
        return cshInPmtInstrm;
    }

    /**
     * Sets the value of the cshInPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument20Choice }
     *     
     */
    public void setCshInPmtInstrm(PaymentInstrument20Choice value) {
        this.cshInPmtInstrm = value;
    }

    /**
     * Gets the value of the cshOutPmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument21Choice }
     *     
     */
    public PaymentInstrument21Choice getCshOutPmtInstrm() {
        return cshOutPmtInstrm;
    }

    /**
     * Sets the value of the cshOutPmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument21Choice }
     *     
     */
    public void setCshOutPmtInstrm(PaymentInstrument21Choice value) {
        this.cshOutPmtInstrm = value;
    }

}
