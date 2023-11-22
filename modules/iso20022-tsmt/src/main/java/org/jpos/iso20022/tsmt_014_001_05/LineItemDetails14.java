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

package org.jpos.iso20022.tsmt_014_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemDetails14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LineItemDetails14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LineItmId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max70Text"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Quantity9"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}UnitPrice18" minOccurs="0"/>
 *         <element name="PdctNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max70Text" minOccurs="0"/>
 *         <element name="PdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}ProductIdentifier2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}ProductCharacteristics1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}ProductCategory1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctOrgn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}CountryCode" minOccurs="0"/>
 *         <element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Adjustment6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrghtChrgs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Charge25" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Tax22" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}CurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemDetails14", propOrder = {
    "lineItmId",
    "qty",
    "unitPric",
    "pdctNm",
    "pdctIdr",
    "pdctChrtcs",
    "pdctCtgy",
    "pdctOrgn",
    "adjstmnt",
    "frghtChrgs",
    "tax",
    "ttlAmt"
})
public class LineItemDetails14 {

    @XmlElement(name = "LineItmId", required = true)
    protected String lineItmId;
    @XmlElement(name = "Qty", required = true)
    protected Quantity9 qty;
    @XmlElement(name = "UnitPric")
    protected UnitPrice18 unitPric;
    @XmlElement(name = "PdctNm")
    protected String pdctNm;
    @XmlElement(name = "PdctIdr")
    protected List<ProductIdentifier2Choice> pdctIdr;
    @XmlElement(name = "PdctChrtcs")
    protected List<ProductCharacteristics1Choice> pdctChrtcs;
    @XmlElement(name = "PdctCtgy")
    protected List<ProductCategory1Choice> pdctCtgy;
    @XmlElement(name = "PdctOrgn")
    protected String pdctOrgn;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment6> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge25 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax22> tax;
    @XmlElement(name = "TtlAmt", required = true)
    protected CurrencyAndAmount ttlAmt;

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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public void setQty(Quantity9 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice18 }
     *     
     */
    public UnitPrice18 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice18 }
     *     
     */
    public void setUnitPric(UnitPrice18 value) {
        this.unitPric = value;
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
     * Gets the value of the pdctOrgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctOrgn() {
        return pdctOrgn;
    }

    /**
     * Sets the value of the pdctOrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctOrgn(String value) {
        this.pdctOrgn = value;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment6 }
     * 
     * 
     * @return
     *     The value of the adjstmnt property.
     */
    public List<Adjustment6> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge25 }
     *     
     */
    public Charge25 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge25 }
     *     
     */
    public void setFrghtChrgs(Charge25 value) {
        this.frghtChrgs = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax22 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax22> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTtlAmt(CurrencyAndAmount value) {
        this.ttlAmt = value;
    }

}
