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

package org.jpos.iso20022.sese_011_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument25Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstrument25Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CdtTrfDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}CreditTransfer9" minOccurs="0"/>
 *         <element name="ChqDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Cheque12"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument25Choice", propOrder = {
    "cdtTrfDtls",
    "chqDtls"
})
public class PaymentInstrument25Choice {

    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer9 cdtTrfDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque12 chqDtls;

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer9 }
     *     
     */
    public CreditTransfer9 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer9 }
     *     
     */
    public void setCdtTrfDtls(CreditTransfer9 value) {
        this.cdtTrfDtls = value;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque12 }
     *     
     */
    public Cheque12 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque12 }
     *     
     */
    public void setChqDtls(Cheque12 value) {
        this.chqDtls = value;
    }

}
