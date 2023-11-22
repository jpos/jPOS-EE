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

package org.jpos.iso20022.cain_001_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amount20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Amount20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TpOfChrg" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TypeOfAmount19Code" minOccurs="0"/>
 *         <element name="OthrTpOfChrg" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount"/>
 *         <element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}CreditDebit3Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount20", propOrder = {
    "tpOfChrg",
    "othrTpOfChrg",
    "amt",
    "cdtDbt"
})
public class Amount20 {

    @XmlElement(name = "TpOfChrg")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount19Code tpOfChrg;
    @XmlElement(name = "OthrTpOfChrg")
    protected String othrTpOfChrg;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;

    /**
     * Gets the value of the tpOfChrg property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount19Code }
     *     
     */
    public TypeOfAmount19Code getTpOfChrg() {
        return tpOfChrg;
    }

    /**
     * Sets the value of the tpOfChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount19Code }
     *     
     */
    public void setTpOfChrg(TypeOfAmount19Code value) {
        this.tpOfChrg = value;
    }

    /**
     * Gets the value of the othrTpOfChrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTpOfChrg() {
        return othrTpOfChrg;
    }

    /**
     * Sets the value of the othrTpOfChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTpOfChrg(String value) {
        this.othrTpOfChrg = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
    }

}
