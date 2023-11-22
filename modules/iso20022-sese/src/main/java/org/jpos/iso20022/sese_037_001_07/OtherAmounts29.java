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

package org.jpos.iso20022.sese_037_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAmounts29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherAmounts29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="CtryNtlFdrlTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="PmtLevyTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="LclTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="RgltryAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="ShppgAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="StmpDty" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="StockXchgTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="TrfTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="TxTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="ValAddedTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="WhldgTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="CsmptnTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *         <element name="AcrdCptlstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.037.001.07}AmountAndDirection44" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts29", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "ctryNtlFdrlTax",
    "pmtLevyTax",
    "lclTax",
    "othr",
    "rgltryAmt",
    "shppgAmt",
    "stmpDty",
    "stockXchgTax",
    "trfTax",
    "txTax",
    "valAddedTax",
    "whldgTax",
    "csmptnTax",
    "acrdCptlstnAmt"
})
public class OtherAmounts29 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection44 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection44 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection44 ctryNtlFdrlTax;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection44 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection44 lclTax;
    @XmlElement(name = "Othr")
    protected AmountAndDirection44 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection44 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection44 shppgAmt;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection44 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection44 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection44 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection44 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection44 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection44 whldgTax;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection44 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection44 acrdCptlstnAmt;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection44 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setChrgsFees(AmountAndDirection44 value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCtryNtlFdrlTax(AmountAndDirection44 value) {
        this.ctryNtlFdrlTax = value;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setPmtLevyTax(AmountAndDirection44 value) {
        this.pmtLevyTax = value;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setLclTax(AmountAndDirection44 value) {
        this.lclTax = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setOthr(AmountAndDirection44 value) {
        this.othr = value;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setRgltryAmt(AmountAndDirection44 value) {
        this.rgltryAmt = value;
    }

    /**
     * Gets the value of the shppgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Sets the value of the shppgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setShppgAmt(AmountAndDirection44 value) {
        this.shppgAmt = value;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setStmpDty(AmountAndDirection44 value) {
        this.stmpDty = value;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setStockXchgTax(AmountAndDirection44 value) {
        this.stockXchgTax = value;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTrfTax(AmountAndDirection44 value) {
        this.trfTax = value;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTxTax(AmountAndDirection44 value) {
        this.txTax = value;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setValAddedTax(AmountAndDirection44 value) {
        this.valAddedTax = value;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setWhldgTax(AmountAndDirection44 value) {
        this.whldgTax = value;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCsmptnTax(AmountAndDirection44 value) {
        this.csmptnTax = value;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setAcrdCptlstnAmt(AmountAndDirection44 value) {
        this.acrdCptlstnAmt = value;
    }

}
