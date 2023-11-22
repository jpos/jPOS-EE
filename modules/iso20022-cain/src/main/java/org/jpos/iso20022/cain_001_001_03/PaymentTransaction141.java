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
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransaction141 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTransaction141">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PurchsTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}FleetPurchaseType1Code" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DscntTtl" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}FleetDiscountTotals1" minOccurs="0"/>
 *         <element name="TaxTtl" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction141", propOrder = {
    "purchsTp",
    "summryCmmdtyId",
    "dscntTtl",
    "taxTtl",
    "ttlAmt"
})
public class PaymentTransaction141 {

    @XmlElement(name = "PurchsTp")
    @XmlSchemaType(name = "string")
    protected FleetPurchaseType1Code purchsTp;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "DscntTtl")
    protected FleetDiscountTotals1 dscntTtl;
    @XmlElement(name = "TaxTtl")
    protected List<Tax39> taxTtl;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;

    /**
     * Gets the value of the purchsTp property.
     * 
     * @return
     *     possible object is
     *     {@link FleetPurchaseType1Code }
     *     
     */
    public FleetPurchaseType1Code getPurchsTp() {
        return purchsTp;
    }

    /**
     * Sets the value of the purchsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetPurchaseType1Code }
     *     
     */
    public void setPurchsTp(FleetPurchaseType1Code value) {
        this.purchsTp = value;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
    }

    /**
     * Gets the value of the dscntTtl property.
     * 
     * @return
     *     possible object is
     *     {@link FleetDiscountTotals1 }
     *     
     */
    public FleetDiscountTotals1 getDscntTtl() {
        return dscntTtl;
    }

    /**
     * Sets the value of the dscntTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetDiscountTotals1 }
     *     
     */
    public void setDscntTtl(FleetDiscountTotals1 value) {
        this.dscntTtl = value;
    }

    /**
     * Gets the value of the taxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxTtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the taxTtl property.
     */
    public List<Tax39> getTaxTtl() {
        if (taxTtl == null) {
            taxTtl = new ArrayList<>();
        }
        return this.taxTtl;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
    }

}
