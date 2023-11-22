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

package org.jpos.iso20022.seev_017_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashMovement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashMovement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MvmntId" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}Charges1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.017.001.01}CashAccount18" maxOccurs="2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMovement1", propOrder = {
    "mvmntId",
    "amt",
    "taxAmt",
    "chrgs",
    "acctDtls"
})
public class CashMovement1 {

    @XmlElement(name = "MvmntId")
    protected String mvmntId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "TaxAmt")
    protected ActiveCurrencyAndAmount taxAmt;
    @XmlElement(name = "Chrgs")
    protected List<Charges1> chrgs;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<CashAccount18> acctDtls;

    /**
     * Gets the value of the mvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvmntId() {
        return mvmntId;
    }

    /**
     * Sets the value of the mvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvmntId(String value) {
        this.mvmntId = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTaxAmt(ActiveCurrencyAndAmount value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges1 }
     * 
     * 
     * @return
     *     The value of the chrgs property.
     */
    public List<Charges1> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<>();
        }
        return this.chrgs;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount18 }
     * 
     * 
     * @return
     *     The value of the acctDtls property.
     */
    public List<CashAccount18> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<>();
        }
        return this.acctDtls;
    }

}
