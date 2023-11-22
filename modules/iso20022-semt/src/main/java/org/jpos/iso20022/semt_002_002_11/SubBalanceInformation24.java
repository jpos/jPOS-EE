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

package org.jpos.iso20022.semt_002_002_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubBalanceInformation24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubBalanceInformation24">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}SubBalanceType13Choice"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}Balance27"/>
 *         <element name="SubBalAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}RestrictedFINXMax140Text" minOccurs="0"/>
 *         <element name="QtyBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}QuantityBreakdown71" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlBalBrkdwnDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}AdditionalBalanceInformation24" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceInformation24", propOrder = {
    "subBalTp",
    "qty",
    "subBalAddtlDtls",
    "qtyBrkdwn",
    "addtlBalBrkdwnDtls"
})
public class SubBalanceInformation24 {

    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType13Choice subBalTp;
    @XmlElement(name = "Qty", required = true)
    protected Balance27 qty;
    @XmlElement(name = "SubBalAddtlDtls")
    protected String subBalAddtlDtls;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown71> qtyBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwnDtls")
    protected List<AdditionalBalanceInformation24> addtlBalBrkdwnDtls;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType13Choice }
     *     
     */
    public SubBalanceType13Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType13Choice }
     *     
     */
    public void setSubBalTp(SubBalanceType13Choice value) {
        this.subBalTp = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Balance27 }
     *     
     */
    public Balance27 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance27 }
     *     
     */
    public void setQty(Balance27 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the subBalAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBalAddtlDtls() {
        return subBalAddtlDtls;
    }

    /**
     * Sets the value of the subBalAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBalAddtlDtls(String value) {
        this.subBalAddtlDtls = value;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown71 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown71> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation24 }
     * 
     * 
     * @return
     *     The value of the addtlBalBrkdwnDtls property.
     */
    public List<AdditionalBalanceInformation24> getAddtlBalBrkdwnDtls() {
        if (addtlBalBrkdwnDtls == null) {
            addtlBalBrkdwnDtls = new ArrayList<>();
        }
        return this.addtlBalBrkdwnDtls;
    }

}
