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
 * <p>Java class for TransactionLoanData31Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionLoanData31Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RpTrad" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData139"/>
 *         <element name="BuySellBck" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData140"/>
 *         <element name="SctiesLndg" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData141"/>
 *         <element name="MrgnLndg" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}LoanData142"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLoanData31Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg",
    "mrgnLndg"
})
public class TransactionLoanData31Choice {

    @XmlElement(name = "RpTrad")
    protected LoanData139 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected LoanData140 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected LoanData141 sctiesLndg;
    @XmlElement(name = "MrgnLndg")
    protected LoanData142 mrgnLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData139 }
     *     
     */
    public LoanData139 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData139 }
     *     
     */
    public void setRpTrad(LoanData139 value) {
        this.rpTrad = value;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData140 }
     *     
     */
    public LoanData140 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData140 }
     *     
     */
    public void setBuySellBck(LoanData140 value) {
        this.buySellBck = value;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData141 }
     *     
     */
    public LoanData141 getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData141 }
     *     
     */
    public void setSctiesLndg(LoanData141 value) {
        this.sctiesLndg = value;
    }

    /**
     * Gets the value of the mrgnLndg property.
     * 
     * @return
     *     possible object is
     *     {@link LoanData142 }
     *     
     */
    public LoanData142 getMrgnLndg() {
        return mrgnLndg;
    }

    /**
     * Sets the value of the mrgnLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanData142 }
     *     
     */
    public void setMrgnLndg(LoanData142 value) {
        this.mrgnLndg = value;
    }

}
