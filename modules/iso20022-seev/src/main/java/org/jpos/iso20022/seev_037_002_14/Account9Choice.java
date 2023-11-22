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

package org.jpos.iso20022.seev_037_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account9Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Account9Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}CashAccountIdentification6Choice"/>
 *         <element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}CashAccountIdentification6Choice"/>
 *         <element name="TaxAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.037.002.14}CashAccountIdentification6Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account9Choice", propOrder = {
    "cshAcct",
    "chrgsAcct",
    "taxAcct"
})
public class Account9Choice {

    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccountIdentification6Choice chrgsAcct;
    @XmlElement(name = "TaxAcct")
    protected CashAccountIdentification6Choice taxAcct;

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setChrgsAcct(CashAccountIdentification6Choice value) {
        this.chrgsAcct = value;
    }

    /**
     * Gets the value of the taxAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getTaxAcct() {
        return taxAcct;
    }

    /**
     * Sets the value of the taxAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setTaxAcct(CashAccountIdentification6Choice value) {
        this.taxAcct = value;
    }

}
