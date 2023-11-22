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

package org.jpos.iso20022.caaa_018_001_07;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedAmount15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedAmount15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtGoodsAndSvcs" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshBck" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Grtty" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Fees" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}DetailedAmount4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rbt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}DetailedAmount4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ValAddedTax" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}DetailedAmount4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Srchrg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}DetailedAmount4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount15", propOrder = {
    "amtGoodsAndSvcs",
    "cshBck",
    "grtty",
    "fees",
    "rbt",
    "valAddedTax",
    "srchrg"
})
public class DetailedAmount15 {

    @XmlElement(name = "AmtGoodsAndSvcs")
    protected BigDecimal amtGoodsAndSvcs;
    @XmlElement(name = "CshBck")
    protected BigDecimal cshBck;
    @XmlElement(name = "Grtty")
    protected BigDecimal grtty;
    @XmlElement(name = "Fees")
    protected List<DetailedAmount4> fees;
    @XmlElement(name = "Rbt")
    protected List<DetailedAmount4> rbt;
    @XmlElement(name = "ValAddedTax")
    protected List<DetailedAmount4> valAddedTax;
    @XmlElement(name = "Srchrg")
    protected List<DetailedAmount4> srchrg;

    /**
     * Gets the value of the amtGoodsAndSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtGoodsAndSvcs() {
        return amtGoodsAndSvcs;
    }

    /**
     * Sets the value of the amtGoodsAndSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtGoodsAndSvcs(BigDecimal value) {
        this.amtGoodsAndSvcs = value;
    }

    /**
     * Gets the value of the cshBck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshBck() {
        return cshBck;
    }

    /**
     * Sets the value of the cshBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshBck(BigDecimal value) {
        this.cshBck = value;
    }

    /**
     * Gets the value of the grtty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrtty() {
        return grtty;
    }

    /**
     * Sets the value of the grtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrtty(BigDecimal value) {
        this.grtty = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the fees property.
     */
    public List<DetailedAmount4> getFees() {
        if (fees == null) {
            fees = new ArrayList<>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the rbt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rbt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRbt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the rbt property.
     */
    public List<DetailedAmount4> getRbt() {
        if (rbt == null) {
            rbt = new ArrayList<>();
        }
        return this.rbt;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valAddedTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValAddedTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the valAddedTax property.
     */
    public List<DetailedAmount4> getValAddedTax() {
        if (valAddedTax == null) {
            valAddedTax = new ArrayList<>();
        }
        return this.valAddedTax;
    }

    /**
     * Gets the value of the srchrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the srchrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrchrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the srchrg property.
     */
    public List<DetailedAmount4> getSrchrg() {
        if (srchrg == null) {
            srchrg = new ArrayList<>();
        }
        return this.srchrg;
    }

}
