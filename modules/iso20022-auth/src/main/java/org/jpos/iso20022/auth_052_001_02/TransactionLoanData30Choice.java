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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionLoanData30Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionLoanData30Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RpTrad" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData135"/>
 *         <element name="BuySellBck" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData136"/>
 *         <element name="SctiesLndg" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData137"/>
 *         <element name="MrgnLndg" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData138"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLoanData30Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg",
    "mrgnLndg"
})
public class TransactionLoanData30Choice {

    @XmlElement(name = "RpTrad")
    protected LoanData135 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected LoanData136 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected LoanData137 sctiesLndg;
    @XmlElement(name = "MrgnLndg")
    protected LoanData138 mrgnLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData135 }
     *     
     */
    public LoanData135 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData135 }
     *     
     */
    public void setRpTrad(LoanData135 value) {
        this.rpTrad = value;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData136 }
     *     
     */
    public LoanData136 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData136 }
     *     
     */
    public void setBuySellBck(LoanData136 value) {
        this.buySellBck = value;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData137 }
     *     
     */
    public LoanData137 getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData137 }
     *     
     */
    public void setSctiesLndg(LoanData137 value) {
        this.sctiesLndg = value;
    }

    /**
     * Gets the value of the mrgnLndg property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData138 }
     *     
     */
    public LoanData138 getMrgnLndg() {
        return mrgnLndg;
    }

    /**
     * Sets the value of the mrgnLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData138 }
     *     
     */
    public void setMrgnLndg(LoanData138 value) {
        this.mrgnLndg = value;
    }

}
