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

package org.jpos.iso20022.auth_042_001_02;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeInstrument5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivativeInstrument5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}ISODate" minOccurs="0"/>
 *         <element name="PricMltplr" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}NonNegativeDecimalNumber" minOccurs="0"/>
 *         <element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}FinancialInstrumentIdentification5Choice" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}OptionType2Code" minOccurs="0"/>
 *         <element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}SecuritiesTransactionPrice4Choice" minOccurs="0"/>
 *         <element name="OptnExrcStyle" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}OptionStyle7Code" minOccurs="0"/>
 *         <element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}PhysicalTransferType4Code" minOccurs="0"/>
 *         <element name="AsstClssSpcfcAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AssetClass2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrument5", propOrder = {
    "xpryDt",
    "pricMltplr",
    "undrlygInstrm",
    "optnTp",
    "strkPric",
    "optnExrcStyle",
    "dlvryTp",
    "asstClssSpcfcAttrbts"
})
public class DerivativeInstrument5 {

    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "PricMltplr")
    protected BigDecimal pricMltplr;
    @XmlElement(name = "UndrlygInstrm")
    protected FinancialInstrumentIdentification5Choice undrlygInstrm;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice4Choice strkPric;
    @XmlElement(name = "OptnExrcStyle")
    @XmlSchemaType(name = "string")
    protected OptionStyle7Code optnExrcStyle;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "AsstClssSpcfcAttrbts")
    protected AssetClass2 asstClssSpcfcAttrbts;

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the pricMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Sets the value of the pricMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricMltplr(BigDecimal value) {
        this.pricMltplr = value;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification5Choice }
     *     
     */
    public FinancialInstrumentIdentification5Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification5Choice }
     *     
     */
    public void setUndrlygInstrm(FinancialInstrumentIdentification5Choice value) {
        this.undrlygInstrm = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public void setOptnTp(OptionType2Code value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public SecuritiesTransactionPrice4Choice getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public void setStrkPric(SecuritiesTransactionPrice4Choice value) {
        this.strkPric = value;
    }

    /**
     * Gets the value of the optnExrcStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle7Code }
     *     
     */
    public OptionStyle7Code getOptnExrcStyle() {
        return optnExrcStyle;
    }

    /**
     * Sets the value of the optnExrcStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle7Code }
     *     
     */
    public void setOptnExrcStyle(OptionStyle7Code value) {
        this.optnExrcStyle = value;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public void setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
    }

    /**
     * Gets the value of the asstClssSpcfcAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClass2 }
     *     
     */
    public AssetClass2 getAsstClssSpcfcAttrbts() {
        return asstClssSpcfcAttrbts;
    }

    /**
     * Sets the value of the asstClssSpcfcAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClass2 }
     *     
     */
    public void setAsstClssSpcfcAttrbts(AssetClass2 value) {
        this.asstClssSpcfcAttrbts = value;
    }

}
