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

package org.jpos.iso20022.auth_045_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyDataReport20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransparencyDataReport20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}InstrumentOrSubClassIdentification2Choice"/>
 *         <element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}Max350Text" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}MICIdentifier" minOccurs="0"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}Period4Choice" minOccurs="0"/>
 *         <element name="Lqdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PreTradLrgInScaleThrshld" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}TonsOrCurrency2Choice" minOccurs="0"/>
 *         <element name="PstTradLrgInScaleThrshld" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}TonsOrCurrency2Choice" minOccurs="0"/>
 *         <element name="PreTradInstrmSzSpcfcThrshld" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}TonsOrCurrency2Choice" minOccurs="0"/>
 *         <element name="PstTradInstrmSzSpcfcThrshld" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}TonsOrCurrency2Choice" minOccurs="0"/>
 *         <element name="Sttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}StatisticsTransparency2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport20", propOrder = {
    "techRcrdId",
    "id",
    "fullNm",
    "tradgVn",
    "rptgPrd",
    "lqdty",
    "preTradLrgInScaleThrshld",
    "pstTradLrgInScaleThrshld",
    "preTradInstrmSzSpcfcThrshld",
    "pstTradInstrmSzSpcfcThrshld",
    "sttstcs"
})
public class TransparencyDataReport20 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected InstrumentOrSubClassIdentification2Choice id;
    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "RptgPrd")
    protected Period4Choice rptgPrd;
    @XmlElement(name = "Lqdty")
    protected Boolean lqdty;
    @XmlElement(name = "PreTradLrgInScaleThrshld")
    protected TonsOrCurrency2Choice preTradLrgInScaleThrshld;
    @XmlElement(name = "PstTradLrgInScaleThrshld")
    protected TonsOrCurrency2Choice pstTradLrgInScaleThrshld;
    @XmlElement(name = "PreTradInstrmSzSpcfcThrshld")
    protected TonsOrCurrency2Choice preTradInstrmSzSpcfcThrshld;
    @XmlElement(name = "PstTradInstrmSzSpcfcThrshld")
    protected TonsOrCurrency2Choice pstTradInstrmSzSpcfcThrshld;
    @XmlElement(name = "Sttstcs")
    protected StatisticsTransparency2 sttstcs;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentOrSubClassIdentification2Choice }
     *     
     */
    public InstrumentOrSubClassIdentification2Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentOrSubClassIdentification2Choice }
     *     
     */
    public void setId(InstrumentOrSubClassIdentification2Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNm(String value) {
        this.fullNm = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
    }

    /**
     * Gets the value of the lqdty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLqdty() {
        return lqdty;
    }

    /**
     * Sets the value of the lqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLqdty(Boolean value) {
        this.lqdty = value;
    }

    /**
     * Gets the value of the preTradLrgInScaleThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPreTradLrgInScaleThrshld() {
        return preTradLrgInScaleThrshld;
    }

    /**
     * Sets the value of the preTradLrgInScaleThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public void setPreTradLrgInScaleThrshld(TonsOrCurrency2Choice value) {
        this.preTradLrgInScaleThrshld = value;
    }

    /**
     * Gets the value of the pstTradLrgInScaleThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPstTradLrgInScaleThrshld() {
        return pstTradLrgInScaleThrshld;
    }

    /**
     * Sets the value of the pstTradLrgInScaleThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public void setPstTradLrgInScaleThrshld(TonsOrCurrency2Choice value) {
        this.pstTradLrgInScaleThrshld = value;
    }

    /**
     * Gets the value of the preTradInstrmSzSpcfcThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPreTradInstrmSzSpcfcThrshld() {
        return preTradInstrmSzSpcfcThrshld;
    }

    /**
     * Sets the value of the preTradInstrmSzSpcfcThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public void setPreTradInstrmSzSpcfcThrshld(TonsOrCurrency2Choice value) {
        this.preTradInstrmSzSpcfcThrshld = value;
    }

    /**
     * Gets the value of the pstTradInstrmSzSpcfcThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public TonsOrCurrency2Choice getPstTradInstrmSzSpcfcThrshld() {
        return pstTradInstrmSzSpcfcThrshld;
    }

    /**
     * Sets the value of the pstTradInstrmSzSpcfcThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TonsOrCurrency2Choice }
     *     
     */
    public void setPstTradInstrmSzSpcfcThrshld(TonsOrCurrency2Choice value) {
        this.pstTradInstrmSzSpcfcThrshld = value;
    }

    /**
     * Gets the value of the sttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsTransparency2 }
     *     
     */
    public StatisticsTransparency2 getSttstcs() {
        return sttstcs;
    }

    /**
     * Sets the value of the sttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsTransparency2 }
     *     
     */
    public void setSttstcs(StatisticsTransparency2 value) {
        this.sttstcs = value;
    }

}
