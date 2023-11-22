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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument19Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstrument19Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ChqDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Cheque4"/>
 *         <element name="BkrsDrftDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Cheque4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument19Choice", propOrder = {
    "chqDtls",
    "bkrsDrftDtls"
})
public class PaymentInstrument19Choice {

    @XmlElement(name = "ChqDtls")
    protected Cheque4 chqDtls;
    @XmlElement(name = "BkrsDrftDtls")
    protected Cheque4 bkrsDrftDtls;

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque4 }
     *     
     */
    public Cheque4 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque4 }
     *     
     */
    public void setChqDtls(Cheque4 value) {
        this.chqDtls = value;
    }

    /**
     * Gets the value of the bkrsDrftDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque4 }
     *     
     */
    public Cheque4 getBkrsDrftDtls() {
        return bkrsDrftDtls;
    }

    /**
     * Sets the value of the bkrsDrftDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque4 }
     *     
     */
    public void setBkrsDrftDtls(Cheque4 value) {
        this.bkrsDrftDtls = value;
    }

}
