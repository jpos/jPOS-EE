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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItem13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LineItem13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GoodsAndOrSvcsDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max70Text" minOccurs="0"/>
 *         <element name="PrtlShipmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}YesNoIndicator"/>
 *         <element name="TrnsShipmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="ShipmntDtRg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}ShipmentDateRange1" minOccurs="0"/>
 *         <element name="LineItmDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}LineItemDetails13" maxOccurs="unbounded"/>
 *         <element name="LineItmsTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}CurrencyAndAmount"/>
 *         <element name="RtgSummry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}TransportMeans5" minOccurs="0"/>
 *         <element name="Incotrms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Incoterms4" minOccurs="0"/>
 *         <element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Adjustment7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrghtChrgs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Charge24" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Tax23" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}CurrencyAndAmount"/>
 *         <element name="BuyrDfndInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}UserDefinedInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SellrDfndInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}UserDefinedInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem13", propOrder = {
    "goodsAndOrSvcsDesc",
    "prtlShipmnt",
    "trnsShipmnt",
    "shipmntDtRg",
    "lineItmDtls",
    "lineItmsTtlAmt",
    "rtgSummry",
    "incotrms",
    "adjstmnt",
    "frghtChrgs",
    "tax",
    "ttlNetAmt",
    "buyrDfndInf",
    "sellrDfndInf"
})
public class LineItem13 {

    @XmlElement(name = "GoodsAndOrSvcsDesc")
    protected String goodsAndOrSvcsDesc;
    @XmlElement(name = "PrtlShipmnt")
    protected boolean prtlShipmnt;
    @XmlElement(name = "TrnsShipmnt")
    protected Boolean trnsShipmnt;
    @XmlElement(name = "ShipmntDtRg")
    protected ShipmentDateRange1 shipmntDtRg;
    @XmlElement(name = "LineItmDtls", required = true)
    protected List<LineItemDetails13> lineItmDtls;
    @XmlElement(name = "LineItmsTtlAmt", required = true)
    protected CurrencyAndAmount lineItmsTtlAmt;
    @XmlElement(name = "RtgSummry")
    protected TransportMeans5 rtgSummry;
    @XmlElement(name = "Incotrms")
    protected Incoterms4 incotrms;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment7> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge24 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax23> tax;
    @XmlElement(name = "TtlNetAmt", required = true)
    protected CurrencyAndAmount ttlNetAmt;
    @XmlElement(name = "BuyrDfndInf")
    protected List<UserDefinedInformation1> buyrDfndInf;
    @XmlElement(name = "SellrDfndInf")
    protected List<UserDefinedInformation1> sellrDfndInf;

    /**
     * Gets the value of the goodsAndOrSvcsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsAndOrSvcsDesc() {
        return goodsAndOrSvcsDesc;
    }

    /**
     * Sets the value of the goodsAndOrSvcsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsAndOrSvcsDesc(String value) {
        this.goodsAndOrSvcsDesc = value;
    }

    /**
     * Gets the value of the prtlShipmnt property.
     * 
     */
    public boolean isPrtlShipmnt() {
        return prtlShipmnt;
    }

    /**
     * Sets the value of the prtlShipmnt property.
     * 
     */
    public void setPrtlShipmnt(boolean value) {
        this.prtlShipmnt = value;
    }

    /**
     * Gets the value of the trnsShipmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrnsShipmnt() {
        return trnsShipmnt;
    }

    /**
     * Sets the value of the trnsShipmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrnsShipmnt(Boolean value) {
        this.trnsShipmnt = value;
    }

    /**
     * Gets the value of the shipmntDtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public ShipmentDateRange1 getShipmntDtRg() {
        return shipmntDtRg;
    }

    /**
     * Sets the value of the shipmntDtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDateRange1 }
     *     
     */
    public void setShipmntDtRg(ShipmentDateRange1 value) {
        this.shipmntDtRg = value;
    }

    /**
     * Gets the value of the lineItmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDetails13 }
     * 
     * 
     * @return
     *     The value of the lineItmDtls property.
     */
    public List<LineItemDetails13> getLineItmDtls() {
        if (lineItmDtls == null) {
            lineItmDtls = new ArrayList<>();
        }
        return this.lineItmDtls;
    }

    /**
     * Gets the value of the lineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getLineItmsTtlAmt() {
        return lineItmsTtlAmt;
    }

    /**
     * Sets the value of the lineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setLineItmsTtlAmt(CurrencyAndAmount value) {
        this.lineItmsTtlAmt = value;
    }

    /**
     * Gets the value of the rtgSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeans5 }
     *     
     */
    public TransportMeans5 getRtgSummry() {
        return rtgSummry;
    }

    /**
     * Sets the value of the rtgSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeans5 }
     *     
     */
    public void setRtgSummry(TransportMeans5 value) {
        this.rtgSummry = value;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms4 }
     *     
     */
    public Incoterms4 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms4 }
     *     
     */
    public void setIncotrms(Incoterms4 value) {
        this.incotrms = value;
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
     * {@link Adjustment7 }
     * 
     * 
     * @return
     *     The value of the adjstmnt property.
     */
    public List<Adjustment7> getAdjstmnt() {
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
     *     {@link Charge24 }
     *     
     */
    public Charge24 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge24 }
     *     
     */
    public void setFrghtChrgs(Charge24 value) {
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
     * {@link Tax23 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax23> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlNetAmt() {
        return ttlNetAmt;
    }

    /**
     * Sets the value of the ttlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTtlNetAmt(CurrencyAndAmount value) {
        this.ttlNetAmt = value;
    }

    /**
     * Gets the value of the buyrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the buyrDfndInf property.
     */
    public List<UserDefinedInformation1> getBuyrDfndInf() {
        if (buyrDfndInf == null) {
            buyrDfndInf = new ArrayList<>();
        }
        return this.buyrDfndInf;
    }

    /**
     * Gets the value of the sellrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     * @return
     *     The value of the sellrDfndInf property.
     */
    public List<UserDefinedInformation1> getSellrDfndInf() {
        if (sellrDfndInf == null) {
            sellrDfndInf = new ArrayList<>();
        }
        return this.sellrDfndInf;
    }

}
