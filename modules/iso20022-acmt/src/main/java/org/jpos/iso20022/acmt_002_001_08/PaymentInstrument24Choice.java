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

package org.jpos.iso20022.acmt_002_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstrument24Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstrument24Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PmtCardDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PaymentCard29"/>
 *         <element name="DrctDbtDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}DirectDebitMandate7"/>
 *         <element name="Chq" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}YesNoIndicator"/>
 *         <element name="BkrsDrft" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}YesNoIndicator"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument24Choice", propOrder = {
    "pmtCardDtls",
    "drctDbtDtls",
    "chq",
    "bkrsDrft"
})
public class PaymentInstrument24Choice {

    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard29 pmtCardDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate7 drctDbtDtls;
    @XmlElement(name = "Chq")
    protected Boolean chq;
    @XmlElement(name = "BkrsDrft")
    protected Boolean bkrsDrft;

    /**
     * Gets the value of the pmtCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard29 }
     *     
     */
    public PaymentCard29 getPmtCardDtls() {
        return pmtCardDtls;
    }

    /**
     * Sets the value of the pmtCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard29 }
     *     
     */
    public void setPmtCardDtls(PaymentCard29 value) {
        this.pmtCardDtls = value;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate7 }
     *     
     */
    public DirectDebitMandate7 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate7 }
     *     
     */
    public void setDrctDbtDtls(DirectDebitMandate7 value) {
        this.drctDbtDtls = value;
    }

    /**
     * Gets the value of the chq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChq() {
        return chq;
    }

    /**
     * Sets the value of the chq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChq(Boolean value) {
        this.chq = value;
    }

    /**
     * Gets the value of the bkrsDrft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBkrsDrft() {
        return bkrsDrft;
    }

    /**
     * Sets the value of the bkrsDrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBkrsDrft(Boolean value) {
        this.bkrsDrft = value;
    }

}
