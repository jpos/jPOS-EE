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

package org.jpos.iso20022.tsmt_012_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Charges5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Charges5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChrgsPyer" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}BankRole1Code"/>
 *         <element name="ChrgsPyee" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}BankRole1Code"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}PercentageRate" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges5", propOrder = {
    "chrgsPyer",
    "chrgsPyee",
    "amt",
    "pctg",
    "tp"
})
public class Charges5 {

    @XmlElement(name = "ChrgsPyer", required = true)
    @XmlSchemaType(name = "string")
    protected BankRole1Code chrgsPyer;
    @XmlElement(name = "ChrgsPyee", required = true)
    @XmlSchemaType(name = "string")
    protected BankRole1Code chrgsPyee;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Tp")
    protected String tp;

    /**
     * Gets the value of the chrgsPyer property.
     * 
     * @return
     *     possible object is
     *     {@link BankRole1Code }
     *     
     */
    public BankRole1Code getChrgsPyer() {
        return chrgsPyer;
    }

    /**
     * Sets the value of the chrgsPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRole1Code }
     *     
     */
    public void setChrgsPyer(BankRole1Code value) {
        this.chrgsPyer = value;
    }

    /**
     * Gets the value of the chrgsPyee property.
     * 
     * @return
     *     possible object is
     *     {@link BankRole1Code }
     *     
     */
    public BankRole1Code getChrgsPyee() {
        return chrgsPyee;
    }

    /**
     * Sets the value of the chrgsPyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRole1Code }
     *     
     */
    public void setChrgsPyee(BankRole1Code value) {
        this.chrgsPyee = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAmt(CurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

}
