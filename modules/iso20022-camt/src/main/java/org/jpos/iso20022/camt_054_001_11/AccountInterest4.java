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

package org.jpos.iso20022.camt_054_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInterest4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountInterest4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}InterestType1Choice" minOccurs="0"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Rate4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}DateTimePeriod1" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TaxCharges2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInterest4", propOrder = {
    "tp",
    "rate",
    "frToDt",
    "rsn",
    "tax"
})
public class AccountInterest4 {

    @XmlElement(name = "Tp")
    protected InterestType1Choice tp;
    @XmlElement(name = "Rate")
    protected List<Rate4> rate;
    @XmlElement(name = "FrToDt")
    protected DateTimePeriod1 frToDt;
    @XmlElement(name = "Rsn")
    protected String rsn;
    @XmlElement(name = "Tax")
    protected TaxCharges2 tax;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestType1Choice }
     *     
     */
    public InterestType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestType1Choice }
     *     
     */
    public void setTp(InterestType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rate4 }
     * 
     * 
     * @return
     *     The value of the rate property.
     */
    public List<Rate4> getRate() {
        if (rate == null) {
            rate = new ArrayList<>();
        }
        return this.rate;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setFrToDt(DateTimePeriod1 value) {
        this.frToDt = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCharges2 }
     *     
     */
    public TaxCharges2 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCharges2 }
     *     
     */
    public void setTax(TaxCharges2 value) {
        this.tax = value;
    }

}
