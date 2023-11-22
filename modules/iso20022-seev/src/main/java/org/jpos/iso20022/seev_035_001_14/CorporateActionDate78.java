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

package org.jpos.iso20022.seev_035_001_14;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDate78 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate78">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EarlyRspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="CoverXprtnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="PrtctDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="MktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="RspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat44Choice" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="SbcptCostDbtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="DpstryCoverXprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="StockLndgDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat43Choice" minOccurs="0"/>
 *         <element name="BrrwrStockLndgDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}BorrowerLendingDeadline5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate78", propOrder = {
    "earlyRspnDdln",
    "coverXprtnDdln",
    "prtctDdln",
    "mktDdln",
    "rspnDdln",
    "xpryDt",
    "sbcptCostDbtDt",
    "dpstryCoverXprtnDt",
    "stockLndgDdln",
    "brrwrStockLndgDdln"
})
public class CorporateActionDate78 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat43Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDdln")
    protected DateFormat43Choice coverXprtnDdln;
    @XmlElement(name = "PrtctDdln")
    protected DateFormat43Choice prtctDdln;
    @XmlElement(name = "MktDdln")
    protected DateFormat43Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat44Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat43Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat43Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat43Choice dpstryCoverXprtnDt;
    @XmlElement(name = "StockLndgDdln")
    protected DateFormat43Choice stockLndgDdln;
    @XmlElement(name = "BrrwrStockLndgDdln")
    protected List<BorrowerLendingDeadline5> brrwrStockLndgDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setEarlyRspnDdln(DateFormat43Choice value) {
        this.earlyRspnDdln = value;
    }

    /**
     * Gets the value of the coverXprtnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getCoverXprtnDdln() {
        return coverXprtnDdln;
    }

    /**
     * Sets the value of the coverXprtnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setCoverXprtnDdln(DateFormat43Choice value) {
        this.coverXprtnDdln = value;
    }

    /**
     * Gets the value of the prtctDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPrtctDdln() {
        return prtctDdln;
    }

    /**
     * Sets the value of the prtctDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setPrtctDdln(DateFormat43Choice value) {
        this.prtctDdln = value;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setMktDdln(DateFormat43Choice value) {
        this.mktDdln = value;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat44Choice }
     *     
     */
    public DateFormat44Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat44Choice }
     *     
     */
    public void setRspnDdln(DateFormat44Choice value) {
        this.rspnDdln = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setXpryDt(DateFormat43Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setSbcptCostDbtDt(DateFormat43Choice value) {
        this.sbcptCostDbtDt = value;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setDpstryCoverXprtnDt(DateFormat43Choice value) {
        this.dpstryCoverXprtnDt = value;
    }

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setStockLndgDdln(DateFormat43Choice value) {
        this.stockLndgDdln = value;
    }

    /**
     * Gets the value of the brrwrStockLndgDdln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the brrwrStockLndgDdln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrrwrStockLndgDdln().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BorrowerLendingDeadline5 }
     * 
     * 
     * @return
     *     The value of the brrwrStockLndgDdln property.
     */
    public List<BorrowerLendingDeadline5> getBrrwrStockLndgDdln() {
        if (brrwrStockLndgDdln == null) {
            brrwrStockLndgDdln = new ArrayList<>();
        }
        return this.brrwrStockLndgDdln;
    }

}
