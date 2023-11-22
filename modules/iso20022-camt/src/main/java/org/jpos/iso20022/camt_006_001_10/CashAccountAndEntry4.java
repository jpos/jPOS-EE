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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccountAndEntry4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccountAndEntry4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}CashAccount41"/>
 *         <element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}CashEntry2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountAndEntry4", propOrder = {
    "acct",
    "ntry"
})
public class CashAccountAndEntry4 {

    @XmlElement(name = "Acct", required = true)
    protected CashAccount41 acct;
    @XmlElement(name = "Ntry")
    protected CashEntry2 ntry;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public void setAcct(CashAccount41 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * @return
     *     possible object is
     *     {@link CashEntry2 }
     *     
     */
    public CashEntry2 getNtry() {
        return ntry;
    }

    /**
     * Sets the value of the ntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashEntry2 }
     *     
     */
    public void setNtry(CashEntry2 value) {
        this.ntry = value;
    }

}
