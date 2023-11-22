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

package org.jpos.iso20022.tsmt_011_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemDetails12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LineItemDetails12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LineItmId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}Max70Text"/>
 *         <element name="PdctNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}Max70Text" minOccurs="0"/>
 *         <element name="PdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}ProductIdentifier2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}ProductCharacteristics1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}ProductCategory1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrdrdQty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}Quantity9"/>
 *         <element name="AccptdQty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}Quantity9"/>
 *         <element name="OutsdngQty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}Quantity9"/>
 *         <element name="PdgQty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}Quantity9"/>
 *         <element name="QtyTlrnce" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}PercentageTolerance1" minOccurs="0"/>
 *         <element name="OrdrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="AccptdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="OutsdngAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="PdgAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}CurrencyAndAmount"/>
 *         <element name="PricTlrnce" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}PercentageTolerance1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemDetails12", propOrder = {
    "lineItmId",
    "pdctNm",
    "pdctIdr",
    "pdctChrtcs",
    "pdctCtgy",
    "ordrdQty",
    "accptdQty",
    "outsdngQty",
    "pdgQty",
    "qtyTlrnce",
    "ordrdAmt",
    "accptdAmt",
    "outsdngAmt",
    "pdgAmt",
    "pricTlrnce"
})
public class LineItemDetails12 {

    @XmlElement(name = "LineItmId", required = true)
    protected String lineItmId;
    @XmlElement(name = "PdctNm")
    protected String pdctNm;
    @XmlElement(name = "PdctIdr")
    protected List<ProductIdentifier2Choice> pdctIdr;
    @XmlElement(name = "PdctChrtcs")
    protected List<ProductCharacteristics1Choice> pdctChrtcs;
    @XmlElement(name = "PdctCtgy")
    protected List<ProductCategory1Choice> pdctCtgy;
    @XmlElement(name = "OrdrdQty", required = true)
    protected Quantity9 ordrdQty;
    @XmlElement(name = "AccptdQty", required = true)
    protected Quantity9 accptdQty;
    @XmlElement(name = "OutsdngQty", required = true)
    protected Quantity9 outsdngQty;
    @XmlElement(name = "PdgQty", required = true)
    protected Quantity9 pdgQty;
    @XmlElement(name = "QtyTlrnce")
    protected PercentageTolerance1 qtyTlrnce;
    @XmlElement(name = "OrdrdAmt", required = true)
    protected CurrencyAndAmount ordrdAmt;
    @XmlElement(name = "AccptdAmt", required = true)
    protected CurrencyAndAmount accptdAmt;
    @XmlElement(name = "OutsdngAmt", required = true)
    protected CurrencyAndAmount outsdngAmt;
    @XmlElement(name = "PdgAmt", required = true)
    protected CurrencyAndAmount pdgAmt;
    @XmlElement(name = "PricTlrnce")
    protected PercentageTolerance1 pricTlrnce;

    /**
     * Gets the value of the lineItmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItmId() {
        return lineItmId;
    }

    /**
     * Sets the value of the lineItmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItmId(String value) {
        this.lineItmId = value;
    }

    /**
     * Gets the value of the pdctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctNm() {
        return pdctNm;
    }

    /**
     * Sets the value of the pdctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctNm(String value) {
        this.pdctNm = value;
    }

    /**
     * Gets the value of the pdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentifier2Choice }
     * 
     * 
     * @return
     *     The value of the pdctIdr property.
     */
    public List<ProductIdentifier2Choice> getPdctIdr() {
        if (pdctIdr == null) {
            pdctIdr = new ArrayList<>();
        }
        return this.pdctIdr;
    }

    /**
     * Gets the value of the pdctChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdctChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCharacteristics1Choice }
     * 
     * 
     * @return
     *     The value of the pdctChrtcs property.
     */
    public List<ProductCharacteristics1Choice> getPdctChrtcs() {
        if (pdctChrtcs == null) {
            pdctChrtcs = new ArrayList<>();
        }
        return this.pdctChrtcs;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdctCtgy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategory1Choice }
     * 
     * 
     * @return
     *     The value of the pdctCtgy property.
     */
    public List<ProductCategory1Choice> getPdctCtgy() {
        if (pdctCtgy == null) {
            pdctCtgy = new ArrayList<>();
        }
        return this.pdctCtgy;
    }

    /**
     * Gets the value of the ordrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getOrdrdQty() {
        return ordrdQty;
    }

    /**
     * Sets the value of the ordrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public void setOrdrdQty(Quantity9 value) {
        this.ordrdQty = value;
    }

    /**
     * Gets the value of the accptdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getAccptdQty() {
        return accptdQty;
    }

    /**
     * Sets the value of the accptdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public void setAccptdQty(Quantity9 value) {
        this.accptdQty = value;
    }

    /**
     * Gets the value of the outsdngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getOutsdngQty() {
        return outsdngQty;
    }

    /**
     * Sets the value of the outsdngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public void setOutsdngQty(Quantity9 value) {
        this.outsdngQty = value;
    }

    /**
     * Gets the value of the pdgQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getPdgQty() {
        return pdgQty;
    }

    /**
     * Sets the value of the pdgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public void setPdgQty(Quantity9 value) {
        this.pdgQty = value;
    }

    /**
     * Gets the value of the qtyTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public PercentageTolerance1 getQtyTlrnce() {
        return qtyTlrnce;
    }

    /**
     * Sets the value of the qtyTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public void setQtyTlrnce(PercentageTolerance1 value) {
        this.qtyTlrnce = value;
    }

    /**
     * Gets the value of the ordrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOrdrdAmt() {
        return ordrdAmt;
    }

    /**
     * Sets the value of the ordrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setOrdrdAmt(CurrencyAndAmount value) {
        this.ordrdAmt = value;
    }

    /**
     * Gets the value of the accptdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAccptdAmt() {
        return accptdAmt;
    }

    /**
     * Sets the value of the accptdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAccptdAmt(CurrencyAndAmount value) {
        this.accptdAmt = value;
    }

    /**
     * Gets the value of the outsdngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngAmt() {
        return outsdngAmt;
    }

    /**
     * Sets the value of the outsdngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setOutsdngAmt(CurrencyAndAmount value) {
        this.outsdngAmt = value;
    }

    /**
     * Gets the value of the pdgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPdgAmt() {
        return pdgAmt;
    }

    /**
     * Sets the value of the pdgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setPdgAmt(CurrencyAndAmount value) {
        this.pdgAmt = value;
    }

    /**
     * Gets the value of the pricTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public PercentageTolerance1 getPricTlrnce() {
        return pricTlrnce;
    }

    /**
     * Sets the value of the pricTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public void setPricTlrnce(PercentageTolerance1 value) {
        this.pricTlrnce = value;
    }

}
