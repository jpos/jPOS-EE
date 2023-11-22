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

package org.jpos.iso20022.auth_016_001_03;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeInstrument6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivativeInstrument6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ISODate" minOccurs="0"/>
 *         <element name="PricMltplr" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}NonNegativeDecimalNumber"/>
 *         <element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}UnderlyingIdentification2Choice"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}OptionType2Code" minOccurs="0"/>
 *         <element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}SecuritiesTransactionPrice4Choice" minOccurs="0"/>
 *         <element name="OptnExrcStyle" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}OptionStyle7Code" minOccurs="0"/>
 *         <element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}PhysicalTransferType4Code"/>
 *         <element name="AsstClssSpcfcAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}AssetClassAttributes1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrument6", propOrder = {
    "xpryDt",
    "pricMltplr",
    "undrlygInstrm",
    "optnTp",
    "strkPric",
    "optnExrcStyle",
    "dlvryTp",
    "asstClssSpcfcAttrbts"
})
public class DerivativeInstrument6 {

    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "PricMltplr", required = true)
    protected BigDecimal pricMltplr;
    @XmlElement(name = "UndrlygInstrm", required = true)
    protected UnderlyingIdentification2Choice undrlygInstrm;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice4Choice strkPric;
    @XmlElement(name = "OptnExrcStyle")
    @XmlSchemaType(name = "string")
    protected OptionStyle7Code optnExrcStyle;
    @XmlElement(name = "DlvryTp", required = true)
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "AsstClssSpcfcAttrbts")
    protected AssetClassAttributes1Choice asstClssSpcfcAttrbts;

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
     *     {@link UnderlyingIdentification2Choice }
     *     
     */
    public UnderlyingIdentification2Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingIdentification2Choice }
     *     
     */
    public void setUndrlygInstrm(UnderlyingIdentification2Choice value) {
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
     *     {@link AssetClassAttributes1Choice }
     *     
     */
    public AssetClassAttributes1Choice getAsstClssSpcfcAttrbts() {
        return asstClssSpcfcAttrbts;
    }

    /**
     * Sets the value of the asstClssSpcfcAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassAttributes1Choice }
     *     
     */
    public void setAsstClssSpcfcAttrbts(AssetClassAttributes1Choice value) {
        this.asstClssSpcfcAttrbts = value;
    }

}
